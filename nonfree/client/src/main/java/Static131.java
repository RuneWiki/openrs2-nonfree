import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "Lclient!jc;")
	public static Class4_Sub2_Sub9 aClass4_Sub2_Sub9_2;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "[S")
	public static short[] aShortArray27 = new short[] { 16, 13, 4, 18, 45, 30, 58, 46 };

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
	public static int anInt1441 = 1;

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
	public static int anInt1443 = -1;

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
	public static int anInt1446 = 5063219;

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
	public static int anInt1447 = 0;

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString53 = "Checking for updates - ";

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
	public static void method1206(@OriginalArg(1) int arg0) {
		@Pc(4) Class4_Sub2_Sub15 local4 = method1210(arg0, 10);
		local4.method2875();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ)V")
	public static void method1207(@OriginalArg(1) boolean arg0) {
		if (Static20.aBoolean185 != arg0) {
			Static20.aBoolean185 = arg0;
			Static20.method2335();
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)Lclient!na;")
	public static Class4_Sub2_Sub15 method1210(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class4_Sub2_Sub15 local11 = (Class4_Sub2_Sub15) Static161.aClass163_24.method4188((long) arg1 << 32 | (long) arg0);
		if (local11 == null) {
			local11 = new Class4_Sub2_Sub15(arg1, arg0);
			Static161.aClass163_24.method4181(local11.aLong211, local11);
		}
		return local11;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BB)C")
	public static char method1213(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(50) char local50 = Static162.aCharArray2[local12 - 128];
			if (local50 == '\u0000') {
				local50 = '?';
			}
			local12 = local50;
		}
		return (char) local12;
	}
}
