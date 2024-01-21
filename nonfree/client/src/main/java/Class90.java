import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class90 {

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "[I")
	private final int[] anIntArray438;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "[I")
	private final int[] anIntArray439;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Lclient!p;")
	private final Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "Lclient!p;")
	private final Class1_Sub2 aClass1_Sub2_2;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "[Lclient!p;")
	private final Class1_Sub2[] aClass1_Sub2Array42;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class90() {
		this.anIntArray438 = new int[0];
		this.anIntArray439 = new int[0];
		this.aClass1_Sub2_1 = new Class1_Sub2_Sub1();
		this.aClass1_Sub2_2 = new Class1_Sub2_Sub1();
		this.aClass1_Sub2Array42 = new Class1_Sub2[] { this.aClass1_Sub2_1, this.aClass1_Sub2_2 };
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!fa;)V")
	public Class90(@OriginalArg(0) Class1_Sub9 arg0) {
		@Pc(7) int local7 = arg0.method1234();
		@Pc(12) Class30 local12 = new Class30(64);
		@Pc(17) Class30 local17 = new Class30(64);
		@Pc(22) Class30 local22 = new Class30(64);
		this.aClass1_Sub2Array42 = new Class1_Sub2[local7];
		@Pc(29) int[][] local29 = new int[local7][];
		@Pc(45) int local45;
		@Pc(94) int local94;
		@Pc(101) int local101;
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(37) Class1_Sub2 local37 = Static28.method633(arg0);
			@Pc(41) int local41 = local37.method3399();
			local45 = local37.method3403();
			if (local41 >= 0 && local41 >= 0 && local17.method1467((long) local41) == null) {
				local17.method1464(new Class1_Sub4(local41), (long) local41);
			}
			if (local45 >= 0 && local45 >= 0 && local22.method1467((long) local45) == null) {
				local22.method1464(new Class1_Sub4(local45), (long) local45);
			}
			local94 = local37.aClass1_Sub2Array41.length;
			local29[local31] = new int[local94];
			for (local101 = 0; local101 < local94; local101++) {
				local29[local31][local101] = arg0.method1234();
			}
			local12.method1464(local37, (long) local37.anInt4429);
			this.aClass1_Sub2Array42[local31] = local37;
		}
		for (@Pc(133) int local133 = 0; local133 < local7; local133++) {
			@Pc(140) Class1_Sub2 local140 = this.aClass1_Sub2Array42[local133];
			local45 = local140.aClass1_Sub2Array41.length;
			for (local94 = 0; local94 < local45; local94++) {
				@Pc(159) Class1_Sub2 local159 = (Class1_Sub2) local12.method1467((long) local29[local133][local94]);
				local140.aClass1_Sub2Array41[local94] = local159;
			}
			local29[local133] = null;
		}
		this.aClass1_Sub2_1 = (Class1_Sub2) local12.method1467((long) arg0.method1234());
		this.aClass1_Sub2_2 = (Class1_Sub2) local12.method1467((long) arg0.method1234());
		this.anIntArray439 = new int[local17.method1463()];
		this.anIntArray438 = new int[local22.method1463()];
		@Pc(217) Class1[] local217 = new Class1[local17.method1463()];
		@Pc(222) Class1[] local222 = new Class1[local22.method1463()];
		local17.method1465(local217);
		local22.method1465(local222);
		for (local94 = 0; local94 < local217.length; local94++) {
			this.anIntArray439[local94] = ((Class1_Sub4) local217[local94]).anInt468;
		}
		for (local101 = 0; local101 < local222.length; local101++) {
			this.anIntArray438[local101] = ((Class1_Sub4) local222[local101]).anInt468;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!u;ZIIDLclient!th;)[I")
	public int[] method3512(@OriginalArg(0) int arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) double arg4, @OriginalArg(6) Interface2 arg5) {
		Static164.aClass76_127 = arg1;
		@Pc(8) int[] local8 = new int[arg0 * arg3];
		Static20.anInterface2_2 = arg5;
		Static36.method919(arg3, arg0);
		for (@Pc(16) int local16 = 0; local16 < this.aClass1_Sub2Array42.length; local16++) {
			this.aClass1_Sub2Array42[local16].method3395(arg3, arg0);
		}
		@Pc(43) int local43 = 0;
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(51) byte local51;
		if (arg2) {
			local49 = arg0 - 1;
			local51 = -1;
			local53 = -1;
		} else {
			local49 = 0;
			local51 = 1;
			local53 = arg0;
		}
		for (@Pc(63) int local63 = 0; local63 < arg3; local63++) {
			@Pc(77) int[] local77;
			@Pc(79) int[] local79;
			@Pc(81) int[] local81;
			if (this.aClass1_Sub2_1.aBoolean173) {
				@Pc(75) int[] local75 = this.aClass1_Sub2_1.method3398(local63);
				local77 = local75;
				local79 = local75;
				local81 = local75;
			} else {
				@Pc(89) int[][] local89 = this.aClass1_Sub2_1.method3391(local63);
				local77 = local89[0];
				local79 = local89[1];
				local81 = local89[2];
			}
			for (@Pc(103) int local103 = local49; local103 != local53; local103 += local51) {
				@Pc(114) double local114 = Math.pow((double) local77[local103] / 4096.0D, arg4);
				@Pc(123) double local123 = Math.pow((double) local79[local103] / 4096.0D, arg4);
				@Pc(128) int local128 = (int) (local123 * 256.0D);
				@Pc(133) int local133 = (int) (local114 * 256.0D);
				if (local133 > 255) {
					local133 = 255;
				}
				@Pc(149) double local149 = Math.pow((double) local81[local103] / 4096.0D, arg4);
				if (local128 > 255) {
					local128 = 255;
				}
				@Pc(159) int local159 = (int) (local149 * 256.0D);
				if (local128 < 0) {
					local128 = 0;
				}
				if (local159 > 255) {
					local159 = 255;
				}
				if (local133 < 0) {
					local133 = 0;
				}
				if (local159 < 0) {
					local159 = 0;
				}
				local8[local43++] = (local133 << 16) - (-(local128 << 8) - local159);
			}
		}
		for (@Pc(220) int local220 = 0; local220 < this.aClass1_Sub2Array42.length; local220++) {
			this.aClass1_Sub2Array42[local220].method3400();
		}
		return local8;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!th;Lclient!u;)Z")
	public boolean method3517(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Class76 arg1) {
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray439.length; local15++) {
			if (!arg1.method3318(this.anIntArray439[local15])) {
				return false;
			}
		}
		for (@Pc(39) int local39 = 0; local39 < this.anIntArray438.length; local39++) {
			if (!arg0.method3419(this.anIntArray438[local39])) {
				return false;
			}
		}
		return true;
	}
}
