import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class3_Sub1_Sub20 extends Class3_Sub1 {

	@OriginalMember(owner = "client!lh", name = "I", descriptor = "[Lclient!lea;")
	private Class111[] aClass111Array1;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			this.method4746(super.aClass85_41.method2547());
		}
		return local9;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([[II)V")
	private void method4746(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static206.anInt4182;
		@Pc(17) int local17 = Static245.anInt4535;
		Static435.method6110(arg0);
		Static442.method7212(Static439.anInt7283, Static469.anInt7679);
		if (this.aClass111Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass111Array1.length; local31++) {
			@Pc(38) Class111 local38 = this.aClass111Array1[local31];
			@Pc(41) int local41 = local38.anInt9309;
			@Pc(44) int local44 = local38.anInt9311;
			if (local41 >= 0) {
				if (local44 >= 0) {
					local38.method7713(local17, local7);
				} else {
					local38.method7711(local7, local17);
				}
			} else if (local44 >= 0) {
				local38.method7714(local7, local17);
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass111Array1 = new Class111[arg0.method3118()];
			for (@Pc(11) int local11 = 0; local11 < this.aClass111Array1.length; local11++) {
				@Pc(19) int local19 = arg0.method3118();
				if (local19 == 0) {
					this.aClass111Array1[local11] = Static292.method4650(arg0);
				} else if (local19 == 1) {
					this.aClass111Array1[local11] = Static592.method7787(arg0);
				} else if (local19 == 2) {
					this.aClass111Array1[local11] = Static469.method6489(arg0);
				} else if (local19 == 3) {
					this.aClass111Array1[local11] = Static144.method2743(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean728 = arg0.method3118() == 1;
		}
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(22) int local22 = Static206.anInt4182;
			@Pc(24) int local24 = Static245.anInt4535;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass144_41.method3780();
			this.method4746(local28);
			for (@Pc(39) int local39 = 0; local39 < Static245.anInt4535; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static206.anInt4182; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
