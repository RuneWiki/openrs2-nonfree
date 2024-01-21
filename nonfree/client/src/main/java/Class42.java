import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class42 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
	private final int[] anIntArray199;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "[I")
	private final int[] anIntArray200;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Lclient!v;")
	private final Class2_Sub3 aClass2_Sub3_1;

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "Lclient!v;")
	private final Class2_Sub3 aClass2_Sub3_2;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "[Lclient!v;")
	private final Class2_Sub3[] aClass2_Sub3Array16;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	public Class42() {
		this.anIntArray199 = new int[0];
		this.anIntArray200 = new int[0];
		this.aClass2_Sub3_1 = new Class2_Sub3_Sub28();
		this.aClass2_Sub3_2 = new Class2_Sub3_Sub28();
		this.aClass2_Sub3Array16 = new Class2_Sub3[] { this.aClass2_Sub3_1, this.aClass2_Sub3_2 };
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!ab;)V")
	public Class42(@OriginalArg(0) Class2_Sub2 arg0) {
		@Pc(7) int local7 = arg0.method1698();
		@Pc(12) Class35 local12 = new Class35(64);
		@Pc(17) Class35 local17 = new Class35(64);
		@Pc(22) Class35 local22 = new Class35(64);
		@Pc(25) int[][] local25 = new int[local7][];
		this.aClass2_Sub3Array16 = new Class2_Sub3[local7];
		@Pc(45) int local45;
		@Pc(103) int local103;
		@Pc(110) int local110;
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(37) Class2_Sub3 local37 = Static66.method1215(arg0);
			@Pc(41) int local41 = local37.method2893();
			local45 = local37.method2903();
			if (local41 >= 0 && local41 >= 0 && local17.method1354((long) local41) == null) {
				local17.method1362(new Class2_Sub10(local41), (long) local41);
			}
			if (local45 >= 0 && local45 >= 0 && local22.method1354((long) local45) == null) {
				local22.method1362(new Class2_Sub10(local45), (long) local45);
			}
			local103 = local37.aClass2_Sub3Array40.length;
			local25[local31] = new int[local103];
			for (local110 = 0; local110 < local103; local110++) {
				local25[local31][local110] = arg0.method1698();
			}
			local12.method1362(local37, (long) local37.anInt4057);
			this.aClass2_Sub3Array16[local31] = local37;
		}
		for (@Pc(150) int local150 = 0; local150 < local7; local150++) {
			@Pc(157) Class2_Sub3 local157 = this.aClass2_Sub3Array16[local150];
			local45 = local157.aClass2_Sub3Array40.length;
			for (local103 = 0; local103 < local45; local103++) {
				@Pc(176) Class2_Sub3 local176 = (Class2_Sub3) local12.method1354((long) local25[local150][local103]);
				local157.aClass2_Sub3Array40[local103] = local176;
			}
			local25[local150] = null;
		}
		this.aClass2_Sub3_1 = (Class2_Sub3) local12.method1354((long) arg0.method1698());
		this.aClass2_Sub3_2 = (Class2_Sub3) local12.method1354((long) arg0.method1698());
		this.anIntArray200 = new int[local17.method1360()];
		this.anIntArray199 = new int[local22.method1360()];
		@Pc(236) Class2[] local236 = new Class2[local17.method1360()];
		@Pc(243) Class2[] local243 = new Class2[local22.method1360()];
		local17.method1356(local236);
		local22.method1356(local243);
		for (local103 = 0; local103 < local236.length; local103++) {
			this.anIntArray200[local103] = ((Class2_Sub10) local236[local103]).anInt2113;
		}
		for (local110 = 0; local110 < local243.length; local110++) {
			this.anIntArray199[local110] = ((Class2_Sub10) local243[local110]).anInt2113;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!jc;IIDILclient!wc;Z)[I")
	public int[] method1472(@OriginalArg(0) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) double arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface2 arg4, @OriginalArg(6) boolean arg5) {
		Static29.anInterface2_2 = arg4;
		@Pc(12) int[] local12 = new int[arg1 * arg3];
		Static115.aClass40_30 = arg0;
		Static156.method2407(arg3, arg1);
		for (@Pc(20) int local20 = 0; local20 < this.aClass2_Sub3Array16.length; local20++) {
			this.aClass2_Sub3Array16[local20].method2891(arg3, arg1);
		}
		@Pc(44) int local44;
		@Pc(40) int local40;
		@Pc(42) byte local42;
		if (arg5) {
			local44 = arg3 - 1;
			local40 = -1;
			local42 = -1;
		} else {
			local40 = arg3;
			local42 = 1;
			local44 = 0;
		}
		@Pc(56) int local56 = 0;
		for (@Pc(63) int local63 = 0; local63 < arg1; local63++) {
			@Pc(79) int[] local79;
			@Pc(81) int[] local81;
			@Pc(77) int[] local77;
			if (this.aClass2_Sub3_1.aBoolean173) {
				@Pc(75) int[] local75 = this.aClass2_Sub3_1.method2889(local63);
				local77 = local75;
				local79 = local75;
				local81 = local75;
			} else {
				@Pc(89) int[][] local89 = this.aClass2_Sub3_1.method2894(local63);
				local81 = local89[1];
				local79 = local89[0];
				local77 = local89[2];
			}
			for (@Pc(103) int local103 = local44; local103 != local40; local103 += local42) {
				@Pc(114) double local114 = Math.pow((double) local79[local103] / 4096.0D, arg2);
				@Pc(123) double local123 = Math.pow((double) local81[local103] / 4096.0D, arg2);
				@Pc(132) double local132 = Math.pow((double) local77[local103] / 4096.0D, arg2);
				@Pc(137) int local137 = (int) (local114 * 256.0D);
				@Pc(142) int local142 = (int) (local132 * 256.0D);
				@Pc(147) int local147 = (int) (local123 * 256.0D);
				if (local137 > 255) {
					local137 = 255;
				}
				if (local147 > 255) {
					local147 = 255;
				}
				if (local147 < 0) {
					local147 = 0;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				local12[local56++] = (local137 << 16) + (local147 << 8) + local142;
			}
		}
		for (@Pc(217) int local217 = 0; local217 < this.aClass2_Sub3Array16.length; local217++) {
			this.aClass2_Sub3Array16[local217].method2898();
		}
		return local12;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!jc;Lclient!wc;)Z")
	public boolean method1474(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Interface2 arg1) {
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray200.length; local15++) {
			if (!arg0.method1791(this.anIntArray200[local15])) {
				return false;
			}
		}
		for (@Pc(35) int local35 = 0; local35 < this.anIntArray199.length; local35++) {
			if (!arg1.method2660(this.anIntArray199[local35])) {
				return false;
			}
		}
		return true;
	}
}
