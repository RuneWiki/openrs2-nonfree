import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static660 {

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "F")
	public static float aFloat268;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "Lclient!wia;")
	public static Class386 aClass386_139;

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
	public static int anInt10983 = -1;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILjava/lang/Object;Z)[B")
	public static byte[] method9132(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static393.method5910(arg0, local13);
		} else if (arg1 instanceof Class19) {
			@Pc(25) Class19 local25 = (Class19) arg1;
			return local25.method349(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	public static boolean method9134(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (Static234.aClass333_5.aBoolean693) {
			Static92.aClass337_1 = new Class337();
			Static92.aClass337_1.aString103 = arg1;
			Static92.aClass337_1.anInt9843 = arg0;
			if (Static513.aClass240_7 != Static420.aClass240_5) {
				Static92.aClass337_1.anInt9846 = Static92.aClass337_1.anInt9843 + 40000;
				Static92.aClass337_1.anInt9845 = Static92.aClass337_1.anInt9843 + 50000;
			}
			for (@Pc(35) int local35 = 0; local35 < Static372.aClass217_Sub1Array1.length; local35++) {
				if (arg0 == Static372.aClass217_Sub1Array1[local35].anInt9134) {
					Static472.anInt8235 = Static372.aClass217_Sub1Array1[local35].anInt9130;
				}
			}
			return true;
		}
		@Pc(65) String local65 = "";
		if (Static513.aClass240_7 != Static420.aClass240_5) {
			local65 = ":" + (arg0 + 7000);
		}
		@Pc(88) String local88 = "";
		if (Static273.aString55 != null) {
			local88 = "/p=" + Static273.aString55;
		}
		@Pc(136) String local136 = "http://" + arg1 + local65 + "/l=" + Static232.anInt4258 + "/a=" + Static349.anInt6487 + local88 + "/j" + (Static116.aBoolean192 ? "1" : "0") + ",o" + (Static592.aBoolean153 ? "1" : "0") + ",a2";
		try {
			Static243.aClient1.getAppletContext().showDocument(new URL(local136), "_self");
			return true;
		} catch (@Pc(146) Exception local146) {
			return false;
		}
	}
}
