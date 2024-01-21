import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Z")
	public static boolean aBoolean128;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
	public static int anInt2989;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2 aClass4_Sub1_Sub7_Sub2_4;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1095 = Static177.method3050("rect_debug=");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)V")
	public static void method2219(@OriginalArg(0) int arg0) {
		Static24.method400();
		Static24.method397();
		@Pc(14) int local14 = Static50.method958(arg0).anInt615;
		if (local14 == 0) {
			return;
		}
		@Pc(27) int local27 = Static147.anIntArray64[arg0];
		if (local14 == 1) {
			Static31.anInt803 = local27;
			if (Static31.anInt803 == 1) {
				Static171.method2963(0.9F);
			}
			if (Static31.anInt803 == 2) {
				Static171.method2963(0.8F);
			}
			if (Static31.anInt803 == 3) {
				Static171.method2963(0.7F);
			}
			if (Static31.anInt803 == 4) {
				Static171.method2963(0.6F);
			}
			Static53.method1028();
		}
		if (local14 == 3) {
			@Pc(63) short local63 = 0;
			if (local27 == 0) {
				local63 = 255;
			}
			if (local27 == 1) {
				local63 = 192;
			}
			if (local27 == 2) {
				local63 = 128;
			}
			if (local27 == 3) {
				local63 = 64;
			}
			if (local27 == 4) {
				local63 = 0;
			}
			if (Static135.anInt3218 != local63) {
				if (Static135.anInt3218 == 0 && Static104.anInt2619 != -1) {
					Static118.method2141(local63, Static104.anInt2619, Static73.aClass62_Sub1_47);
					Static106.aBoolean114 = false;
				} else if (local63 == 0) {
					Static50.method953();
					Static106.aBoolean114 = false;
				} else {
					Static77.method1567(local63);
				}
				Static135.anInt3218 = local63;
			}
		}
		if (local14 == 5) {
			Static89.anInt2296 = local27;
		}
		if (local14 == 10) {
			if (local27 == 0) {
				Static122.anInt2962 = 127;
			}
			if (local27 == 1) {
				Static122.anInt2962 = 96;
			}
			if (local27 == 2) {
				Static122.anInt2962 = 64;
			}
			if (local27 == 3) {
				Static122.anInt2962 = 32;
			}
			if (local27 == 4) {
				Static122.anInt2962 = 0;
			}
		}
		if (local14 == 9) {
			Static122.anInt2954 = local27;
		}
		if (local14 == 4) {
			if (local27 == 0) {
				Static26.anInt647 = 127;
			}
			if (local27 == 1) {
				Static26.anInt647 = 96;
			}
			if (local27 == 2) {
				Static26.anInt647 = 64;
			}
			if (local27 == 3) {
				Static26.anInt647 = 32;
			}
			if (local27 == 4) {
				Static26.anInt647 = 0;
			}
		}
		if (local14 == 6) {
			Static28.anInt752 = local27;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIBLclient!ud;IZ)V")
	public static void method2223(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) Class62_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) long local6 = (long) ((arg4 << 16) + arg0);
		@Pc(16) Class4_Sub1_Sub16 local16 = (Class4_Sub1_Sub16) Static91.aClass20_3.method505(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class4_Sub1_Sub16) Static167.aClass20_13.method505(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class4_Sub1_Sub16) Static146.aClass20_9.method505(local6);
		if (local16 == null) {
			if (!arg5) {
				local16 = (Class4_Sub1_Sub16) Static113.aClass20_6.method505(local6);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class4_Sub1_Sub16();
			local16.anInt3247 = arg1;
			local16.aClass62_Sub1_77 = arg3;
			local16.aByte8 = arg2;
			if (arg5) {
				Static91.aClass20_3.method499(local6, local16);
				Static182.anInt4081++;
			} else {
				Static140.aClass78_2.method2674(local16);
				Static146.aClass20_9.method499(local6, local16);
				Static66.anInt1813++;
			}
		} else if (arg5) {
			local16.method3176();
			Static91.aClass20_3.method499(local6, local16);
			Static66.anInt1813--;
			Static182.anInt4081++;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZIZ)I")
	public static int method2224() {
		return Static182.anInt4081 + Static116.anInt2857;
	}
}
