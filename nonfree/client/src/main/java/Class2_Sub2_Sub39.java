import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class2_Sub2_Sub39 extends Class2_Sub2 {

	@OriginalMember(owner = "client!wm", name = "J", descriptor = "I")
	private int anInt9561 = 4;

	@OriginalMember(owner = "client!wm", name = "H", descriptor = "I")
	private int anInt9559 = 4;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9561 = arg0.method4325();
		} else if (arg1 == 1) {
			this.anInt9559 = arg0.method4325();
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(28) int local28 = Static153.anInt3070 / this.anInt9561;
			@Pc(33) int local33 = Static377.anInt6692 / this.anInt9559;
			@Pc(52) int[] local52;
			@Pc(42) int local42;
			if (local33 > 0) {
				local42 = arg0 % local33;
				local52 = this.method7951(local42 * Static377.anInt6692 / local33, 0);
			} else {
				local52 = this.method7951(0, 0);
			}
			for (local42 = 0; local42 < Static153.anInt3070; local42++) {
				if (local28 <= 0) {
					local19[local42] = local52[0];
				} else {
					@Pc(81) int local81 = local42 % local28;
					local19[local42] = local52[local81 * Static153.anInt3070 / local28];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(26) int local26 = Static153.anInt3070 / this.anInt9561;
			@Pc(31) int local31 = Static377.anInt6692 / this.anInt9559;
			@Pc(50) int[][] local50;
			if (local31 > 0) {
				@Pc(40) int local40 = arg0 % local31;
				local50 = this.method7947(0, Static377.anInt6692 * local40 / local31);
			} else {
				local50 = this.method7947(0, 0);
			}
			@Pc(62) int[] local62 = local50[0];
			@Pc(66) int[] local66 = local50[1];
			@Pc(70) int[] local70 = local50[2];
			@Pc(74) int[] local74 = local11[0];
			@Pc(78) int[] local78 = local11[1];
			@Pc(82) int[] local82 = local11[2];
			for (@Pc(84) int local84 = 0; local84 < Static153.anInt3070; local84++) {
				@Pc(93) int local93;
				if (local26 <= 0) {
					local93 = 0;
				} else {
					@Pc(99) int local99 = local84 % local26;
					local93 = local99 * Static153.anInt3070 / local26;
				}
				local74[local84] = local62[local93];
				local78[local84] = local66[local93];
				local82[local84] = local70[local93];
			}
		}
		return local11;
	}
}
