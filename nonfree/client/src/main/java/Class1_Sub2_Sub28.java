import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class1_Sub2_Sub28 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qc", name = "V", descriptor = "[B")
	public static byte[] aByteArray43 = new byte[32896];

	@OriginalMember(owner = "client!qc", name = "Y", descriptor = "[Lclient!vh;")
	private Class45[] aClass45Array1;

	static {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			for (@Pc(17) int local17 = 0; local17 <= local14; local17++) {
				aByteArray43[local12++] = (byte) (255.0D / Math.sqrt((double) ((float) (local14 * local14 + local17 * local17 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			this.method2680(super.aClass102_41.method3131());
		}
		return local14;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass45Array1 = new Class45[arg0.method895()];
			for (@Pc(22) int local22 = 0; local22 < this.aClass45Array1.length; local22++) {
				@Pc(28) int local28 = arg0.method895();
				if (local28 == 0) {
					this.aClass45Array1[local22] = Static175.method2828(arg0);
				} else if (local28 == 1) {
					this.aClass45Array1[local22] = Static64.method1163(arg0);
				} else if (local28 == 2) {
					this.aClass45Array1[local22] = Static63.method1146(arg0);
				} else if (local28 == 3) {
					this.aClass45Array1[local22] = Static146.method2498(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean265 = arg0.method895() == 1;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([[IB)V")
	private void method2680(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static105.anInt2391;
		@Pc(9) int local9 = Static53.anInt1436;
		Static71.method1290(arg0);
		Static107.method1852(Static32.anInt814, Static92.anInt2170);
		if (this.aClass45Array1 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < this.aClass45Array1.length; local30++) {
			@Pc(37) Class45 local37 = this.aClass45Array1[local30];
			@Pc(40) int local40 = local37.anInt3461;
			@Pc(43) int local43 = local37.anInt3466;
			if (local40 >= 0) {
				if (local43 < 0) {
					local37.method2628(local7, local9);
				} else {
					local37.method2629(local7, local9);
				}
			} else if (local43 >= 0) {
				local37.method2632(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(22) int local22 = Static105.anInt2391;
			@Pc(24) int local24 = Static53.anInt1436;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass74_41.method2457();
			this.method2680(local28);
			for (@Pc(39) int local39 = 0; local39 < Static53.anInt1436; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[1];
				@Pc(57) int[] local57 = local49[2];
				@Pc(61) int[] local61 = local49[0];
				for (@Pc(63) int local63 = 0; local63 < Static105.anInt2391; local63++) {
					@Pc(69) int local69 = local45[local63];
					local57[local63] = (local69 & 0xFF) << 4;
					local53[local63] = local69 >> 4 & 0xFF0;
					local61[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}
}
