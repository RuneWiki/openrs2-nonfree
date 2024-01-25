import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "Lclient!rk;")
	public static Class180 aClass180_42;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "Lclient!fi;")
	public static final Class74 aClass74_20 = new Class74();

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
	public static int anInt3271 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
	public static void method2991(@OriginalArg(0) int arg0) {
		@Pc(12) Class7_Sub9 local12 = (Class7_Sub9) Static175.aClass10_32.method163((long) arg0);
		if (local12 != null) {
			for (@Pc(25) int local25 = 0; local25 < local12.anIntArray262.length; local25++) {
				local12.anIntArray262[local25] = -1;
				local12.anIntArray263[local25] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)I")
	public static int method2992() {
		return Static81.anInt2142;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILjava/awt/Canvas;ILclient!pg;)Lclient!pe;")
	public static Class89 method2993(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) Interface6 arg2) {
		return new Class89_Sub2(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLclient!rk;Lclient!rk;Z)V")
	public static void method2994(@OriginalArg(1) Class180 arg0, @OriginalArg(2) Class180 arg1) {
		Static221.aClass180_56 = arg1;
		Static256.aBoolean362 = true;
		Static298.aClass180_84 = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII)V")
	public static void method2995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static229.aClass49ArrayArrayArray6 == null) {
			return;
		}
		@Pc(17) long local17 = (long) (arg2 | arg1 << 28 | arg0 << 14);
		@Pc(23) Class7_Sub35 local23 = (Class7_Sub35) Static185.aClass10_33.method163(local17);
		if (local23 == null) {
			Static310.method5003(arg1, arg2, arg0);
			return;
		}
		@Pc(37) Class7_Sub5 local37 = (Class7_Sub5) local23.aClass74_35.method1793();
		if (local37 == null) {
			Static310.method5003(arg1, arg2, arg0);
			return;
		}
		@Pc(51) Class22_Sub3_Sub1 local51 = (Class22_Sub3_Sub1) Static310.method5003(arg1, arg2, arg0);
		if (local51 == null) {
			local51 = new Class22_Sub3_Sub1();
		} else {
			local51.anInt1137 = local51.anInt1140 = -1;
		}
		local51.anInt1141 = local37.anInt1054;
		local51.anInt1143 = local37.anInt1050;
		label44: while (true) {
			@Pc(83) Class7_Sub5 local83 = (Class7_Sub5) local23.aClass74_35.method1798();
			if (local83 == null) {
				break;
			}
			if (local51.anInt1143 != local83.anInt1050) {
				local51.anInt1137 = local83.anInt1050;
				local51.anInt1144 = local83.anInt1054;
				while (true) {
					@Pc(104) Class7_Sub5 local104 = (Class7_Sub5) local23.aClass74_35.method1798();
					if (local104 == null) {
						break label44;
					}
					if (local51.anInt1143 != local104.anInt1050 && local104.anInt1050 != local51.anInt1137) {
						local51.anInt1140 = local104.anInt1050;
						local51.anInt1139 = local104.anInt1054;
					}
				}
			}
		}
		@Pc(149) int local149 = Static341.method5540(arg1, (arg0 << 7) + 64, (arg2 << 7) + 64);
		Static104.method2060(arg1, arg2, arg0, local149, local51);
	}
}
