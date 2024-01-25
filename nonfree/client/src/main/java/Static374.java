import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "Lclient!tl;")
	public static Class314 aClass314_10;

	@OriginalMember(owner = "client!oca", name = "n", descriptor = "Lclient!gba;")
	public static Class114 aClass114_7;

	@OriginalMember(owner = "client!oca", name = "g", descriptor = "[I")
	public static final int[] anIntArray442 = new int[25];

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IB)Lclient!wv;")
	public static Class365 method5437(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static249.aClass365ArrayArray3[local14] == null || Static249.aClass365ArrayArray3[local14][local18] == null) {
			@Pc(32) boolean local32 = Static300.method4703(local14);
			if (!local32) {
				return null;
			}
		}
		return Static249.aClass365ArrayArray3[local14][local18];
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)Z")
	public static boolean method5438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(23) Class306 local23 = Static146.aClass214_1.method4897(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local23.method6979(arg0);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)V")
	public static void method5439() {
		Static179.aClass326_15.method7230();
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZZIILjava/lang/String;ZJIIILjava/lang/String;)V")
	public static void method5440(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) long arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) String arg9) {
		if (!Static294.aBoolean407 && Static135.anInt2684 < 500) {
			@Pc(18) int local18 = arg6 == -1 ? Static325.anInt9473 : arg6;
			@Pc(32) Class1_Sub23 local32 = new Class1_Sub23(arg3, arg9, local18, arg2, arg1, arg5, arg8, arg7, arg0, arg4);
			Static3.aClass361_1.method7855(local32);
			Static135.anInt2684++;
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(BLclient!gba;Lclient!ga;)V")
	public static void method5441(@OriginalArg(1) Class114 arg0, @OriginalArg(2) Class111 arg1) {
		Static34.aClass111_6 = arg1;
		Static32.aString12 = "";
		Static243.aClass114_4 = arg0;
		if (Class188.aString52.startsWith("win")) {
			Static32.aString12 = Static32.aString12 + "windows/";
		} else if (Class188.aString52.startsWith("linux")) {
			Static32.aString12 = Static32.aString12 + "linux/";
		} else if (Class188.aString52.startsWith("mac")) {
			Static32.aString12 = Static32.aString12 + "macos/";
		}
		if (Static243.aClass114_4.aBoolean213) {
			Static32.aString12 = Static32.aString12 + "msjava/";
		} else if (Class188.aString53.startsWith("amd64") || Class188.aString53.startsWith("x86_64")) {
			Static32.aString12 = Static32.aString12 + "x86_64/";
		} else if (Class188.aString53.startsWith("i386") || Class188.aString53.startsWith("i486") || Class188.aString53.startsWith("i586") || Class188.aString53.startsWith("x86")) {
			Static32.aString12 = Static32.aString12 + "x86/";
		} else if (Class188.aString53.startsWith("ppc")) {
			Static32.aString12 = Static32.aString12 + "ppc/";
		} else {
			Static32.aString12 = Static32.aString12 + "universal/";
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(BFFIF)F")
	public static float method5443(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(7) float[] local7 = Static71.aFloatArrayArray4[arg2];
		return arg1 * local7[2] + local7[0] * arg3 + arg0 * local7[1];
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5444(@OriginalArg(1) String arg0) {
		if (Static35.aStringArray3 == null) {
			Static98.method1829();
		}
		Static184.aCalendar3.setTime(new Date(Static255.method4035()));
		@Pc(20) int local20 = Static184.aCalendar3.get(11);
		@Pc(24) int local24 = Static184.aCalendar3.get(12);
		@Pc(28) int local28 = Static184.aCalendar3.get(13);
		@Pc(62) String local62 = Integer.toString(local20 / 10) + local20 % 10 + ":" + local24 / 10 + local24 % 10 + ":" + local28 / 10 + local28 % 10;
		@Pc(67) String[] local67 = Static46.method1116('\n', arg0);
		for (@Pc(69) int local69 = 0; local69 < local67.length; local69++) {
			for (@Pc(73) int local73 = Static486.anInt8201; local73 > 0; local73--) {
				Static35.aStringArray3[local73] = Static35.aStringArray3[local73 - 1];
			}
			Static35.aStringArray3[0] = local62 + ": " + local67[local69];
			if (Static35.aStringArray3.length - 1 > Static486.anInt8201) {
				Static486.anInt8201++;
				if (Static78.anInt1871 > 0) {
					Static78.anInt1871++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(BII)Lclient!ah;")
	public static Class1_Sub3_Sub1 method5445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub3_Sub1 local15 = (Class1_Sub3_Sub1) Static89.aClass356_5.method7796((long) arg0 << 32 | (long) arg1);
		if (local15 == null) {
			local15 = new Class1_Sub3_Sub1(arg0, arg1);
			Static89.aClass356_5.method7800(local15.aLong425, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IBI)Z")
	public static boolean method5446(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
