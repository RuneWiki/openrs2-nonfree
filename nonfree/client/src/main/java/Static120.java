import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
	public static int anInt2145;

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
	public static int anInt2148;

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "Ljava/lang/Object;")
	public static Object anObject3;

	@OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
	public static int anInt2154 = 0;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method1814(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static192.method2985(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local19; arg1 != arg0.charAt(local30); local30++) {
			}
			local15[local17++] = arg0.substring(local19, local30);
			local19 = local30 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
	public static void method1815() {
		for (@Pc(6) Class3_Sub5_Sub13 local6 = (Class3_Sub5_Sub13) Static287.aClass243_9.method5459(); local6 != null; local6 = (Class3_Sub5_Sub13) Static287.aClass243_9.method5453()) {
			if (local6.anInt6245 > 1) {
				local6.anInt6245 = 0;
				Static294.aClass295_71.method6469(((Class3_Sub5_Sub18) local6.aClass243_10.aClass3_Sub5_44.aClass3_Sub5_66).aLong258, local6);
				local6.aClass243_10.method5460();
			}
		}
		Static166.anInt3037 = 0;
		Static610.anInt10153 = 0;
		Static582.aClass302_69.method6614();
		Static141.aClass333_12.method7485();
		Static287.aClass243_9.method5460();
		Static532.aBoolean580 = false;
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)I")
	public static int method1816() {
		return Static87.anInt1807;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIB)Z")
	public static boolean method1817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0xC580) != 0;
	}
}
