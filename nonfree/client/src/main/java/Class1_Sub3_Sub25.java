import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class1_Sub3_Sub25 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
	private int anInt5530 = 4;

	@OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
	private int anInt5532 = 4;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(29) int local29 = Static452.anInt7734 / this.anInt5532;
			@Pc(34) int local34 = Static272.anInt5156 / this.anInt5530;
			@Pc(45) int[][] local45;
			if (local34 <= 0) {
				local45 = this.method7130(0, 0);
			} else {
				@Pc(51) int local51 = arg0 % local34;
				local45 = this.method7130(local51 * Static272.anInt5156 / local34, 0);
			}
			@Pc(65) int[] local65 = local45[0];
			@Pc(69) int[] local69 = local45[1];
			@Pc(73) int[] local73 = local45[2];
			@Pc(77) int[] local77 = local20[0];
			@Pc(81) int[] local81 = local20[1];
			@Pc(85) int[] local85 = local20[2];
			for (@Pc(87) int local87 = 0; local87 < Static452.anInt7734; local87++) {
				@Pc(101) int local101;
				if (local29 > 0) {
					@Pc(95) int local95 = local87 % local29;
					local101 = local95 * Static452.anInt7734 / local29;
				} else {
					local101 = 0;
				}
				local77[local87] = local65[local101];
				local81[local87] = local69[local101];
				local85[local87] = local73[local101];
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5532 = arg0.method3922();
		} else if (arg1 == 1) {
			this.anInt5530 = arg0.method3922();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(26) int local26 = Static452.anInt7734 / this.anInt5532;
			@Pc(31) int local31 = Static272.anInt5156 / this.anInt5530;
			@Pc(49) int[] local49;
			@Pc(37) int local37;
			if (local31 > 0) {
				local37 = arg0 % local31;
				local49 = this.method7128(0, local37 * Static272.anInt5156 / local31);
			} else {
				local49 = this.method7128(0, 0);
			}
			for (local37 = 0; local37 < Static452.anInt7734; local37++) {
				if (local26 <= 0) {
					local11[local37] = local49[0];
				} else {
					@Pc(78) int local78 = local37 % local26;
					local11[local37] = local49[Static452.anInt7734 * local78 / local26];
				}
			}
		}
		return local11;
	}
}
