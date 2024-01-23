import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class81 {

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "Lclient!mg;")
	private Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "Lclient!mg;")
	private Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "[Lclient!mg;")
	private Class1_Sub1[] aClass1_Sub1Array25;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!k;)V")
	public Class81(@OriginalArg(0) Class1_Sub16 arg0) {
		@Pc(7) int local7 = arg0.method3793();
		@Pc(9) int local9 = 0;
		this.aClass1_Sub1Array25 = new Class1_Sub1[local7];
		@Pc(16) int[][] local16 = new int[local7][];
		@Pc(18) int local18 = 0;
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub1 local26 = Static132.method2331(arg0);
			if (local26.method3734() >= 0) {
				local9++;
			}
			if (local26.method3736() >= 0) {
				local18++;
			}
			@Pc(43) int local43 = local26.aClass1_Sub1Array42.length;
			local16[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local16[local20][local50] = arg0.method3793();
			}
			this.aClass1_Sub1Array25[local20] = local26;
		}
		this.anIntArray219 = new int[local18];
		this.anIntArray220 = new int[local9];
		local18 = 0;
		local9 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class1_Sub1 local102 = this.aClass1_Sub1Array25[local95];
			local50 = local102.aClass1_Sub1Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass1_Sub1Array42[local108] = this.aClass1_Sub1Array25[local16[local95][local108]];
			}
			@Pc(134) int local134 = local102.method3734();
			@Pc(138) int local138 = local102.method3736();
			if (local134 > 0) {
				this.anIntArray220[local9++] = local134;
			}
			if (local138 > 0) {
				this.anIntArray219[local18++] = local138;
			}
			local16[local95] = null;
		}
		this.aClass1_Sub1_2 = this.aClass1_Sub1Array25[arg0.method3793()];
		this.aClass1_Sub1_1 = this.aClass1_Sub1Array25[arg0.method3793()];
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZLclient!mb;ZILclient!mf;DIB)[I")
	public int[] method2540(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface3 arg4, @OriginalArg(5) double arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = new int[arg6 * arg3];
		Static160.method2701(arg5);
		Static227.aClass70_45 = arg1;
		Static41.anInterface3_1 = arg4;
		Static78.method1353(arg6, arg3);
		for (@Pc(23) int local23 = 0; local23 < this.aClass1_Sub1Array25.length; local23++) {
			this.aClass1_Sub1Array25[local23].method3731(arg3, arg6);
		}
		@Pc(41) int local41 = 0;
		@Pc(47) int local47;
		@Pc(49) int local49;
		@Pc(45) byte local45;
		if (arg2) {
			local49 = -1;
			local47 = arg3 - 1;
			local45 = -1;
		} else {
			local45 = 1;
			local47 = 0;
			local49 = arg3;
		}
		for (@Pc(61) int local61 = 0; local61 < arg6; local61++) {
			if (arg0) {
				local41 = local61;
			}
			@Pc(81) int[] local81;
			@Pc(89) int[] local89;
			@Pc(85) int[] local85;
			if (this.aClass1_Sub1_2.aBoolean213) {
				@Pc(97) int[] local97 = this.aClass1_Sub1_2.method3729(local61);
				local85 = local97;
				local89 = local97;
				local81 = local97;
			} else {
				@Pc(77) int[][] local77 = this.aClass1_Sub1_2.method3735(local61);
				local81 = local77[0];
				local85 = local77[2];
				local89 = local77[1];
			}
			for (@Pc(105) int local105 = local47; local105 != local49; local105 += local45) {
				@Pc(113) int local113 = local81[local105] >> 4;
				if (local113 > 255) {
					local113 = 255;
				}
				@Pc(124) int local124 = local89[local105] >> 4;
				if (local124 > 255) {
					local124 = 255;
				}
				@Pc(135) int local135 = local85[local105] >> 4;
				if (local124 < 0) {
					local124 = 0;
				}
				local124 = Static193.anIntArray314[local124];
				if (local113 < 0) {
					local113 = 0;
				}
				if (local135 > 255) {
					local135 = 255;
				}
				local113 = Static193.anIntArray314[local113];
				if (local135 < 0) {
					local135 = 0;
				}
				local135 = Static193.anIntArray314[local135];
				local10[local41++] = local135 + (local113 << 16) + (local124 << 8);
				if (arg0) {
					local41 += arg3 - 1;
				}
			}
		}
		for (@Pc(215) int local215 = 0; local215 < this.aClass1_Sub1Array25.length; local215++) {
			this.aClass1_Sub1Array25[local215].method3727();
		}
		return local10;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!mf;Lclient!mb;)Z")
	public boolean method2542(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) Class70 arg1) {
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray220.length; local21++) {
			if (!arg1.method3519(this.anIntArray220[local21])) {
				return false;
			}
		}
		for (@Pc(45) int local45 = 0; local45 < this.anIntArray219.length; local45++) {
			if (!arg0.method127(this.anIntArray219[local45])) {
				return false;
			}
		}
		return true;
	}
}
