import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString11 = "Discard";

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!fh;Lclient!fh;B)V")
	public static void method113(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1) {
		Static32.aClass4_Sub3_Sub5_1 = Static9.method121(arg0, arg1, Static48.anInt914);
		if (Static94.aBoolean138) {
			Static51.aClass4_Sub3_Sub5_Sub2_2 = Static143.method2195(arg1, Static48.anInt914, arg0);
		} else {
			Static51.aClass4_Sub3_Sub5_Sub2_2 = (Class4_Sub3_Sub5_Sub2) Static32.aClass4_Sub3_Sub5_1;
		}
		Static197.aClass4_Sub3_Sub5_2 = Static9.method121(arg0, arg1, Static312.anInt6044);
		Static211.aClass4_Sub3_Sub5_3 = Static9.method121(arg0, arg1, Static170.anInt3309);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(CLjava/lang/String;Z)I")
	public static int method114(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(3) int local3 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(16) int local16 = 0; local16 < local10; local16++) {
			if (arg1.charAt(local16) == arg0) {
				local3++;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
	public static void method115() {
		Static194.anInt5207 = 0;
		Static41.aByte1 = 0;
		Static102.anInt2140 = 0;
		Static239.anInt4507 = 0;
		Static105.aBoolean147 = false;
	}
}
