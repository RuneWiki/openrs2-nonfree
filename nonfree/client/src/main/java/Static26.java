import java.awt.event.ActionEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "[I")
	public static int[] anIntArray45 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "Lclient!fk;")
	public static Class56 aClass56_2 = new Class56();

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray12 = new byte[50][];

	@OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
	public static int anInt482 = 0;

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString14 = null;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)I")
	public static int method416() {
		return 2;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIB)V")
	public static void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class3_Sub4_Sub7 local12 = Static34.method528(arg0, 6);
		local12.method971();
		local12.anInt1132 = arg1;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!ug;I)Ljava/lang/String;")
	public static String method418(@OriginalArg(1) Class3_Sub26 arg0) {
		try {
			@Pc(7) int local7 = arg0.method3904();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(26) byte[] local26 = new byte[local7];
			arg0.anInt4615 += Static105.aClass192_1.method4926(local26, local7, 0, arg0.aByteArray64, arg0.anInt4615);
			return Static222.method3633(local26, local7, 0);
		} catch (@Pc(50) Exception local50) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!ua;Ljava/lang/Object;)V")
	public static void method419(@OriginalArg(1) Class176 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 50 && arg0.anEventQueue1.peekEvent() != null; local12++) {
			Static150.method2552(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!ug;)V")
	public static void method421(@OriginalArg(1) Class3_Sub26 arg0) {
		@Pc(12) byte[] local12 = new byte[24];
		if (Static100.aClass159_3 != null) {
			try {
				Static100.aClass159_3.method4243(0L);
				@Pc(25) int local25 = 0;
				Static100.aClass159_3.method4240(local12);
				while (local25 < 24 && local12[local25] == 0) {
					local25++;
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(52) Exception local52) {
				for (@Pc(54) int local54 = 0; local54 < 24; local54++) {
					local12[local54] = -1;
				}
			}
		}
		arg0.method3945(24, local12);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
	public static void method423() {
		for (@Pc(18) Class3_Sub4_Sub16 local18 = (Class3_Sub4_Sub16) Static291.aClass56_27.method1281(); local18 != null; local18 = (Class3_Sub4_Sub16) Static291.aClass56_27.method1278()) {
			@Pc(23) Class10_Sub7 local23 = local18.aClass10_Sub7_1;
			if (Static99.anInt1826 != local23.anInt6104 || local23.anInt6094 < Static124.anInt2371) {
				local18.method5013();
			} else if (local23.anInt6105 <= Static124.anInt2371) {
				if (local23.anInt6108 > 0) {
					@Pc(57) Class10_Sub5_Sub2 local57 = Static110.aClass10_Sub5_Sub2Array1[local23.anInt6108 - 1];
					if (local57 != null && local57.anInt5073 >= 0 && local57.anInt5073 < 13312 && local57.anInt5016 >= 0 && local57.anInt5016 < 13312) {
						local23.method4987(Static124.anInt2371, local57.anInt5073, local57.anInt5016, Static122.method2036(local57.anInt5016, local57.anInt5073, local23.anInt6104) - local23.anInt6110);
					}
				}
				if (local23.anInt6108 < 0) {
					@Pc(119) int local119 = -local23.anInt6108 - 1;
					@Pc(124) Class10_Sub5_Sub1 local124;
					if (local119 == Static273.anInt5556) {
						local124 = Static136.aClass10_Sub5_Sub1_1;
					} else {
						local124 = Static52.aClass10_Sub5_Sub1Array1[local119];
					}
					if (local124 != null && local124.anInt5073 >= 0 && local124.anInt5073 < 13312 && local124.anInt5016 >= 0 && local124.anInt5016 < 13312) {
						local23.method4987(Static124.anInt2371, local124.anInt5073, local124.anInt5016, Static122.method2036(local124.anInt5016, local124.anInt5073, local23.anInt6104) - local23.anInt6110);
					}
				}
				local23.method4984(Static140.anInt2709);
				Static236.method3997(Static99.anInt1826, (int) local23.aDouble9, (int) local23.aDouble5, (int) local23.aDouble2, 60, local23, local23.anInt6113, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
	public static void method424() {
		Static137.aClass98_18.method2572();
	}
}
