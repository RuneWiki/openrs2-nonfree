import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
	public static int anInt8261;

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "[S")
	private static final short[] aShortArray116 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "[S")
	private static final short[] aShortArray117 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "[S")
	private static final short[] aShortArray118 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "[[S")
	public static final short[][] aShortArrayArray17 = new short[][] { aShortArray117, aShortArray116, aShortArray118 };

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)Z")
	public static boolean method7120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static395.method6364(arg1, arg0) | (arg0 & 0x70000) != 0 || Static216.method3671(arg1, arg0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IILjava/lang/String;)Z")
	public static boolean method7121(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (Static529.aClass112_6.aBoolean263) {
			Static315.aClass56_4 = new Class56();
			Static315.aClass56_4.aString17 = arg1;
			Static315.aClass56_4.anInt1712 = arg0;
			if (Static212.aClass35_2 != Static418.aClass35_3) {
				Static315.aClass56_4.anInt1715 = Static315.aClass56_4.anInt1712 + 40000;
				Static315.aClass56_4.anInt1717 = Static315.aClass56_4.anInt1712 + 50000;
			}
			for (@Pc(36) int local36 = 0; local36 < Static187.aClass51_Sub1Array1.length; local36++) {
				if (arg0 == Static187.aClass51_Sub1Array1[local36].anInt1514) {
					Static262.anInt5209 = Static187.aClass51_Sub1Array1[local36].anInt1504;
				}
			}
			return true;
		}
		@Pc(58) String local58 = "";
		if (Static418.aClass35_3 != Static212.aClass35_2) {
			local58 = ":" + (arg0 + 7000);
		}
		@Pc(73) String local73 = "";
		if (Static162.aString32 != null) {
			local73 = "/p=" + Static162.aString32;
		}
		@Pc(129) String local129 = "http://" + arg1 + local58 + "/l=" + Static307.anInt5931 + "/a=" + Static364.anInt6726 + local73 + "/j" + (Static118.aBoolean172 ? "1" : "0") + ",o" + (Static229.aBoolean323 ? "1" : "0") + ",a2";
		try {
			Static119.aClient1.getAppletContext().showDocument(new URL(local129), "_self");
			return true;
		} catch (@Pc(139) Exception local139) {
			return false;
		}
	}
}
