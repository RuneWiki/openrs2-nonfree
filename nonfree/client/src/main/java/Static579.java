import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
	public static int anInt9073;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "[I")
	public static final int[] anIntArray684 = new int[1000];

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "Z")
	public static boolean aBoolean699 = true;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
	public static int anInt9072 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLclient!mo;)Lclient!fc;")
	public static Class99 method7399(@OriginalArg(1) Class1_Sub35 arg0) {
		@Pc(7) Class99 local7 = new Class99();
		local7.anInt2536 = arg0.method5771();
		local7.aClass1_Sub6_Sub13_1 = Static183.aClass366_1.method7873(local7.anInt2536);
		return local7;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
	public static void method7401() {
		if (Static348.aClass1_Sub30_Sub1_1.method3917(Static113.anInt2222) || Static42.anInt691 == Static433.anInt7592) {
			Static235.method3561(Static16.aClass134_1);
			if (Static433.anInt7592 != Static244.anInt4499) {
				Static468.method6431();
			}
		} else {
			Static498.method6987(Static504.anInt5716, false, Static188.anInt3531, 11);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method7403(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static568.aClass351_37.method7651(Static307.anInt5279) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static568.aClass351_39.method7651(Static307.anInt5279) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLjava/io/File;)[B")
	public static byte[] method7404(@OriginalArg(1) File arg0) {
		return Static287.method4061(arg0, (int) arg0.length());
	}
}
