import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class68 {

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "[I")
	private final int[] anIntArray348;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "[I")
	private final int[] anIntArray347;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Lclient!gd;")
	private final Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Lclient!gd;")
	private final Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "[Lclient!gd;")
	private final Class3_Sub2[] aClass3_Sub2Array31;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class68() {
		this.anIntArray348 = new int[0];
		this.anIntArray347 = new int[0];
		this.aClass3_Sub2_1 = new Class3_Sub2_Sub2();
		this.aClass3_Sub2_2 = new Class3_Sub2_Sub2();
		this.aClass3_Sub2Array31 = new Class3_Sub2[] { this.aClass3_Sub2_1, this.aClass3_Sub2_2 };
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!ff;)V")
	public Class68(@OriginalArg(0) Class3_Sub12 arg0) {
		@Pc(7) int local7 = arg0.method1354();
		@Pc(12) Class16 local12 = new Class16(64);
		@Pc(17) Class16 local17 = new Class16(64);
		@Pc(22) Class16 local22 = new Class16(64);
		@Pc(25) int[][] local25 = new int[local7][];
		this.aClass3_Sub2Array31 = new Class3_Sub2[local7];
		@Pc(45) int local45;
		@Pc(94) int local94;
		@Pc(101) int local101;
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(37) Class3_Sub2 local37 = Static163.method2264(arg0);
			@Pc(41) int local41 = local37.method2790();
			local45 = local37.method2794();
			if (local41 >= 0 && local41 >= 0 && local17.method554((long) local41) == null) {
				local17.method546(new Class3_Sub7(local41), (long) local41);
			}
			if (local45 >= 0 && local45 >= 0 && local22.method554((long) local45) == null) {
				local22.method546(new Class3_Sub7(local45), (long) local45);
			}
			local94 = local37.aClass3_Sub2Array40.length;
			local25[local31] = new int[local94];
			for (local101 = 0; local101 < local94; local101++) {
				local25[local31][local101] = arg0.method1354();
			}
			local12.method546(local37, (long) local37.anInt3960);
			this.aClass3_Sub2Array31[local31] = local37;
		}
		for (@Pc(141) int local141 = 0; local141 < local7; local141++) {
			@Pc(148) Class3_Sub2 local148 = this.aClass3_Sub2Array31[local141];
			local45 = local148.aClass3_Sub2Array40.length;
			for (local94 = 0; local94 < local45; local94++) {
				@Pc(167) Class3_Sub2 local167 = (Class3_Sub2) local12.method554((long) local25[local141][local94]);
				local148.aClass3_Sub2Array40[local94] = local167;
			}
			local25[local141] = null;
		}
		this.aClass3_Sub2_1 = (Class3_Sub2) local12.method554((long) arg0.method1354());
		this.aClass3_Sub2_2 = (Class3_Sub2) local12.method554((long) arg0.method1354());
		this.anIntArray348 = new int[local17.method547()];
		this.anIntArray347 = new int[local22.method547()];
		@Pc(229) Class3[] local229 = new Class3[local17.method547()];
		@Pc(234) Class3[] local234 = new Class3[local22.method547()];
		local17.method548(local229);
		local22.method548(local234);
		for (local94 = 0; local94 < local229.length; local94++) {
			this.anIntArray348[local94] = ((Class3_Sub7) local229[local94]).anInt845;
		}
		for (local101 = 0; local101 < local234.length; local101++) {
			this.anIntArray347[local101] = ((Class3_Sub7) local234[local101]).anInt845;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!og;IILclient!f;ZD)[I")
	public int[] method2361(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class13 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) double arg5) {
		Static120.aClass13_22 = arg3;
		Static24.anInterface1_1 = arg0;
		Static178.method2752(arg2, arg1);
		@Pc(20) int[] local20 = new int[arg2 * arg1];
		for (@Pc(22) int local22 = 0; local22 < this.aClass3_Sub2Array31.length; local22++) {
			this.aClass3_Sub2Array31[local22].method2792(arg2, arg1);
		}
		@Pc(50) int local50;
		@Pc(46) int local46;
		@Pc(52) byte local52;
		if (arg4) {
			local46 = -1;
			local50 = arg1 - 1;
			local52 = -1;
		} else {
			local52 = 1;
			local50 = 0;
			local46 = arg1;
		}
		@Pc(62) int local62 = 0;
		for (@Pc(64) int local64 = 0; local64 < arg2; local64++) {
			@Pc(101) int[] local101;
			@Pc(97) int[] local97;
			@Pc(93) int[] local93;
			if (this.aClass3_Sub2_1.aBoolean271) {
				@Pc(109) int[] local109 = this.aClass3_Sub2_1.method2797(local64);
				local97 = local109;
				local101 = local109;
				local93 = local109;
			} else {
				@Pc(89) int[][] local89 = this.aClass3_Sub2_1.method2796(local64);
				local93 = local89[2];
				local97 = local89[1];
				local101 = local89[0];
			}
			for (@Pc(117) int local117 = local50; local117 != local46; local117 += local52) {
				@Pc(128) double local128 = Math.pow((double) local101[local117] / 4096.0D, arg5);
				@Pc(133) int local133 = (int) (local128 * 256.0D);
				@Pc(142) double local142 = Math.pow((double) local97[local117] / 4096.0D, arg5);
				@Pc(151) double local151 = Math.pow((double) local93[local117] / 4096.0D, arg5);
				@Pc(156) int local156 = (int) (local151 * 256.0D);
				@Pc(161) int local161 = (int) (local142 * 256.0D);
				if (local156 > 255) {
					local156 = 255;
				}
				if (local133 > 255) {
					local133 = 255;
				}
				if (local156 < 0) {
					local156 = 0;
				}
				if (local161 > 255) {
					local161 = 255;
				}
				if (local133 < 0) {
					local133 = 0;
				}
				if (local161 < 0) {
					local161 = 0;
				}
				local20[local62++] = local156 + (local133 << 16) + (local161 << 8);
			}
		}
		for (@Pc(223) int local223 = 0; local223 < this.aClass3_Sub2Array31.length; local223++) {
			this.aClass3_Sub2Array31[local223].method2795();
		}
		return local20;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!og;Lclient!f;)Z")
	public boolean method2363(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) Class13 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray348.length; local7++) {
			if (!arg1.method364(this.anIntArray348[local7])) {
				return false;
			}
		}
		for (@Pc(31) int local31 = 0; local31 < this.anIntArray347.length; local31++) {
			if (!arg0.method1723(this.anIntArray347[local31])) {
				return false;
			}
		}
		return true;
	}
}
