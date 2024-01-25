import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class2_Sub11_Sub26 extends Class2_Sub11 {

	@OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
	private int anInt9116 = 4;

	@OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
	private int anInt9117 = 4;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(27) int local27 = Static301.anInt10214 / this.anInt9117;
			@Pc(32) int local32 = Static609.anInt9448 / this.anInt9116;
			@Pc(51) int[][] local51;
			if (local32 > 0) {
				@Pc(41) int local41 = arg0 % local32;
				local51 = this.method9538(0, Static609.anInt9448 * local41 / local32);
			} else {
				local51 = this.method9538(0, 0);
			}
			@Pc(63) int[] local63 = local51[0];
			@Pc(67) int[] local67 = local51[1];
			@Pc(71) int[] local71 = local51[2];
			@Pc(75) int[] local75 = local11[0];
			@Pc(79) int[] local79 = local11[1];
			@Pc(83) int[] local83 = local11[2];
			for (@Pc(85) int local85 = 0; local85 < Static301.anInt10214; local85++) {
				@Pc(96) int local96;
				if (local27 <= 0) {
					local96 = 0;
				} else {
					@Pc(102) int local102 = local85 % local27;
					local96 = Static301.anInt10214 * local102 / local27;
				}
				local75[local85] = local63[local96];
				local79[local85] = local67[local96];
				local83[local85] = local71[local96];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(30) int local30 = Static301.anInt10214 / this.anInt9117;
			@Pc(35) int local35 = Static609.anInt9448 / this.anInt9116;
			@Pc(46) int[] local46;
			@Pc(52) int local52;
			if (local35 <= 0) {
				local46 = this.method9540(0, 0);
			} else {
				local52 = arg0 % local35;
				local46 = this.method9540(Static609.anInt9448 * local52 / local35, 0);
			}
			for (local52 = 0; local52 < Static301.anInt10214; local52++) {
				if (local30 <= 0) {
					local11[local52] = local46[0];
				} else {
					@Pc(87) int local87 = local52 % local30;
					local11[local52] = local46[local87 * Static301.anInt10214 / local30];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt9117 = arg1.method8581(-17416);
		} else if (arg0 == 1) {
			this.anInt9116 = arg1.method8581(-17416);
		}
	}
}
