import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class1_Sub3_Sub19 extends Class1_Sub3 {

	@OriginalMember(owner = "client!js", name = "I", descriptor = "I")
	private int anInt3270 = 4;

	@OriginalMember(owner = "client!js", name = "J", descriptor = "I")
	private int anInt3271 = 4;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3271 = arg1.method4532();
		} else if (arg0 == 1) {
			this.anInt3270 = arg1.method4532();
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(28) int local28 = Static153.anInt3378 / this.anInt3271;
			@Pc(33) int local33 = Static319.anInt6144 / this.anInt3270;
			@Pc(44) int[] local44;
			@Pc(50) int local50;
			if (local33 <= 0) {
				local44 = this.method5532(0, 0);
			} else {
				local50 = arg0 % local33;
				local44 = this.method5532(0, Static319.anInt6144 * local50 / local33);
			}
			for (local50 = 0; local50 < Static153.anInt3378; local50++) {
				if (local28 <= 0) {
					local19[local50] = local44[0];
				} else {
					@Pc(78) int local78 = local50 % local28;
					local19[local50] = local44[local78 * Static153.anInt3378 / local28];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(26) int local26 = Static153.anInt3378 / this.anInt3271;
			@Pc(31) int local31 = Static319.anInt6144 / this.anInt3270;
			@Pc(50) int[][] local50;
			if (local31 > 0) {
				@Pc(40) int local40 = arg0 % local31;
				local50 = this.method5528(local40 * Static319.anInt6144 / local31, 0);
			} else {
				local50 = this.method5528(0, 0);
			}
			@Pc(62) int[] local62 = local50[0];
			@Pc(66) int[] local66 = local50[1];
			@Pc(70) int[] local70 = local50[2];
			@Pc(74) int[] local74 = local11[0];
			@Pc(78) int[] local78 = local11[1];
			@Pc(82) int[] local82 = local11[2];
			for (@Pc(84) int local84 = 0; local84 < Static153.anInt3378; local84++) {
				@Pc(98) int local98;
				if (local26 > 0) {
					@Pc(92) int local92 = local84 % local26;
					local98 = local92 * Static153.anInt3378 / local26;
				} else {
					local98 = 0;
				}
				local74[local84] = local62[local98];
				local78[local84] = local66[local98];
				local82[local84] = local70[local98];
			}
		}
		return local11;
	}
}
