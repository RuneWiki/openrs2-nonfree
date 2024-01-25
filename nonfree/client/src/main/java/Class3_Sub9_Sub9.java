import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class3_Sub9_Sub9 extends Class3_Sub9 {

	@OriginalMember(owner = "client!ea", name = "K", descriptor = "[Lclient!ida;")
	private Class55[] aClass55Array1;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass55Array1 = new Class55[arg0.method8632()];
			for (@Pc(28) int local28 = 0; local28 < this.aClass55Array1.length; local28++) {
				@Pc(34) int local34 = arg0.method8632();
				if (local34 == 0) {
					this.aClass55Array1[local28] = Static142.method2608(arg0);
				} else if (local34 == 1) {
					this.aClass55Array1[local28] = Static25.method662(arg0);
				} else if (local34 == 2) {
					this.aClass55Array1[local28] = Static671.method9332(arg0);
				} else if (local34 == 3) {
					this.aClass55Array1[local28] = Static8.method157(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean804 = arg0.method8632() == 1;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			this.method2299(super.aClass113_41.method3238());
		}
		return local9;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([[II)V")
	private void method2299(@OriginalArg(0) int[][] arg0) {
		@Pc(13) int local13 = Static62.anInt1251;
		@Pc(15) int local15 = Static452.anInt7497;
		Static275.method4439(arg0);
		Static523.method7309(Static302.anInt5067, Static636.anInt10126);
		if (this.aClass55Array1 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < this.aClass55Array1.length; local29++) {
			@Pc(36) Class55 local36 = this.aClass55Array1[local29];
			@Pc(39) int local39 = local36.anInt7982;
			@Pc(42) int local42 = local36.anInt7977;
			if (local39 < 0) {
				if (local42 >= 0) {
					local36.method6991(local15, local13);
				}
			} else if (local42 < 0) {
				local36.method6989(local13, local15);
			} else {
				local36.method6994(local15, local13);
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(22) int local22 = Static62.anInt1251;
			@Pc(24) int local24 = Static452.anInt7497;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass348_41.method8550();
			this.method2299(local28);
			for (@Pc(41) int local41 = 0; local41 < Static452.anInt7497; local41++) {
				@Pc(47) int[] local47 = local28[local41];
				@Pc(51) int[][] local51 = local33[local41];
				@Pc(55) int[] local55 = local51[0];
				@Pc(59) int[] local59 = local51[1];
				@Pc(63) int[] local63 = local51[2];
				for (@Pc(65) int local65 = 0; local65 < Static62.anInt1251; local65++) {
					@Pc(71) int local71 = local47[local65];
					local63[local65] = (local71 & 0xFF) << 4;
					local59[local65] = local71 >> 4 & 0xFF0;
					local55[local65] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}
}
