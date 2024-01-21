import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class30 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "[I")
	private final int[] anIntArray142;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "[I")
	private final int[] anIntArray146;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!je;")
	private final Class4_Sub3 aClass4_Sub3_1;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Lclient!je;")
	private final Class4_Sub3 aClass4_Sub3_2;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[Lclient!je;")
	private final Class4_Sub3[] aClass4_Sub3Array14;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	public Class30() {
		this.anIntArray142 = new int[0];
		this.anIntArray146 = new int[0];
		this.aClass4_Sub3_1 = new Class4_Sub3_Sub20();
		this.aClass4_Sub3_2 = new Class4_Sub3_Sub20();
		this.aClass4_Sub3Array14 = new Class4_Sub3[] { this.aClass4_Sub3_1, this.aClass4_Sub3_2 };
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class30(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method1253();
		@Pc(12) Class20 local12 = new Class20(64);
		@Pc(17) Class20 local17 = new Class20(64);
		@Pc(20) int[][] local20 = new int[local7][];
		@Pc(25) Class20 local25 = new Class20(64);
		this.aClass4_Sub3Array14 = new Class4_Sub3[local7];
		@Pc(45) int local45;
		@Pc(94) int local94;
		@Pc(101) int local101;
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(37) Class4_Sub3 local37 = Static149.method2558(arg0);
			@Pc(41) int local41 = local37.method3152();
			local45 = local37.method3159();
			if (local41 >= 0 && local41 >= 0 && local17.method505((long) local41) == null) {
				local17.method499((long) local41, new Class4_Sub18(local41));
			}
			if (local45 >= 0 && local45 >= 0 && local25.method505((long) local45) == null) {
				local25.method499((long) local45, new Class4_Sub18(local45));
			}
			local94 = local37.aClass4_Sub3Array42.length;
			local20[local31] = new int[local94];
			for (local101 = 0; local101 < local94; local101++) {
				local20[local31][local101] = arg0.method1253();
			}
			local12.method499((long) local37.anInt4117, local37);
			this.aClass4_Sub3Array14[local31] = local37;
		}
		for (@Pc(137) int local137 = 0; local137 < local7; local137++) {
			@Pc(144) Class4_Sub3 local144 = this.aClass4_Sub3Array14[local137];
			local45 = local144.aClass4_Sub3Array42.length;
			for (local94 = 0; local94 < local45; local94++) {
				@Pc(163) Class4_Sub3 local163 = (Class4_Sub3) local12.method505((long) local20[local137][local94]);
				local144.aClass4_Sub3Array42[local94] = local163;
			}
			local20[local137] = null;
		}
		this.aClass4_Sub3_1 = (Class4_Sub3) local12.method505((long) arg0.method1253());
		this.aClass4_Sub3_2 = (Class4_Sub3) local12.method505((long) arg0.method1253());
		this.anIntArray142 = new int[local17.method507()];
		this.anIntArray146 = new int[local25.method507()];
		@Pc(223) Class4[] local223 = new Class4[local17.method507()];
		@Pc(228) Class4[] local228 = new Class4[local25.method507()];
		local17.method506(local223);
		local25.method506(local228);
		for (local94 = 0; local94 < local223.length; local94++) {
			this.anIntArray142[local94] = ((Class4_Sub18) local223[local94]).anInt2869;
		}
		for (local101 = 0; local101 < local228.length; local101++) {
			this.anIntArray146[local101] = ((Class4_Sub18) local228[local101]).anInt2869;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!nh;IILclient!o;ZDI)[I")
	public int[] method1055(@OriginalArg(0) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) double arg4, @OriginalArg(6) int arg5) {
		Static28.method493(arg4);
		Static73.anInterface1_1 = arg2;
		Static91.aClass62_25 = arg0;
		Static44.method736(arg1, arg5);
		@Pc(17) int[] local17 = new int[arg1 * arg5];
		for (@Pc(23) int local23 = 0; local23 < this.aClass4_Sub3Array14.length; local23++) {
			this.aClass4_Sub3Array14[local23].method3155(arg5, arg1);
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(47) byte local47;
		if (arg3) {
			local47 = -1;
			local51 = arg1 - 1;
			local53 = -1;
		} else {
			local51 = 0;
			local47 = 1;
			local53 = arg1;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg5; local65++) {
			@Pc(85) int[] local85;
			@Pc(81) int[] local81;
			@Pc(89) int[] local89;
			if (this.aClass4_Sub3_1.aBoolean170) {
				@Pc(97) int[] local97 = this.aClass4_Sub3_1.method3161(local65);
				local89 = local97;
				local81 = local97;
				local85 = local97;
			} else {
				@Pc(77) int[][] local77 = this.aClass4_Sub3_1.method3158(local65);
				local81 = local77[1];
				local85 = local77[0];
				local89 = local77[2];
			}
			for (@Pc(105) int local105 = local51; local105 != local53; local105 += local47) {
				@Pc(113) int local113 = local85[local105] >> 4;
				if (local113 > 255) {
					local113 = 255;
				}
				@Pc(124) int local124 = local81[local105] >> 4;
				if (local113 < 0) {
					local113 = 0;
				}
				if (local124 > 255) {
					local124 = 255;
				}
				local113 = Static100.anIntArray236[local113];
				@Pc(145) int local145 = local89[local105] >> 4;
				if (local124 < 0) {
					local124 = 0;
				}
				if (local145 > 255) {
					local145 = 255;
				}
				local124 = Static100.anIntArray236[local124];
				if (local145 < 0) {
					local145 = 0;
				}
				local145 = Static100.anIntArray236[local145];
				local17[local63++] = local145 + (local124 << 8) + (local113 << 16);
			}
		}
		for (@Pc(201) int local201 = 0; local201 < this.aClass4_Sub3Array14.length; local201++) {
			this.aClass4_Sub3Array14[local201].method3151();
		}
		return local17;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!nh;Lclient!o;)Z")
	public boolean method1056(@OriginalArg(1) Class62 arg0, @OriginalArg(2) Interface1 arg1) {
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray142.length; local15++) {
			if (!arg0.method2864(this.anIntArray142[local15])) {
				return false;
			}
		}
		for (@Pc(35) int local35 = 0; local35 < this.anIntArray146.length; local35++) {
			if (!arg1.method383(this.anIntArray146[local35])) {
				return false;
			}
		}
		return true;
	}
}
