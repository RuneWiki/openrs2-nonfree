import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
	public static int anInt5705;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "Lclient!cg;")
	public static Class22 aClass22_104;

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
	public static int anInt5706;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
	public static int anInt5697 = 0;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "[I")
	public static int[] anIntArray459 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lclient!tm;")
	public static Class163 aClass163_37 = new Class163(512);

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "[I")
	public static int[] anIntArray460 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
	public static int anInt5704 = 0;

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString190 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
	public static int anInt5707 = 10;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method4573(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = Static22.method456(arg0);
		if (local13 != -1) {
			@Pc(46) int[] local46 = Static115.aClass4_Sub2_Sub18_1.method3540(Static209.aClass100_3.anIntArray266[local13] & 0x3FFF, Static209.aClass100_3.anIntArray266[local13] >> 14 & 0x3FFF, Static209.aClass100_3.anIntArray266[local13] >> 28 & 0x3);
			Static187.method3124(local46[2], local46[1]);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
	public static void method4575() {
		if (Static260.aClass112_115 != null) {
			Static260.aClass112_115.method4462();
		}
		if (Static100.aClass112_44 != null) {
			Static100.aClass112_44.method4462();
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!u;I)V")
	public static void method4576(@OriginalArg(0) Class13_Sub5_Sub2 arg0) {
		for (@Pc(16) Class4_Sub26 local16 = (Class4_Sub26) Static17.aClass17_2.method613(); local16 != null; local16 = (Class4_Sub26) Static17.aClass17_2.method607()) {
			if (arg0 == local16.aClass13_Sub5_Sub2_1) {
				if (local16.aClass4_Sub6_Sub1_3 != null) {
					Static10.aClass4_Sub6_Sub4_1.method3730(local16.aClass4_Sub6_Sub1_3);
					local16.aClass4_Sub6_Sub1_3 = null;
				}
				local16.method4690();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZIIII)V")
	public static void method4578(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static48.method951(arg3)) {
			Static134.method2175(-1, arg0, arg2, Static217.aClass97ArrayArray1[arg3], arg1);
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V")
	public static void method4581() {
		if (Static28.aBoolean46) {
			return;
		}
		Static28.aBoolean46 = true;
		if (Static115.aBoolean148) {
			Static126.aFloat73 = (int) Static126.aFloat73 - 65 & 0xFFFFFF80;
		} else {
			Static111.aFloat68 += (-Static111.aFloat68 - 24.0F) / 2.0F;
		}
		Static82.aBoolean100 = true;
	}
}
