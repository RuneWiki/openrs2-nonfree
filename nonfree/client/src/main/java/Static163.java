import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!fia", name = "j", descriptor = "I")
	public static int anInt3525;

	@OriginalMember(owner = "client!fia", name = "h", descriptor = "[I")
	public static final int[] anIntArray168 = new int[64];

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	public static boolean method3291(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (Static96.aClass48_5.aBoolean75) {
			Static524.aClass66_4 = new Class66();
			Static524.aClass66_4.aString22 = arg1;
			Static524.aClass66_4.anInt1756 = arg0;
			if (Static314.aClass37_6 != Static235.aClass37_5) {
				Static524.aClass66_4.anInt1755 = Static524.aClass66_4.anInt1756 + 40000;
				Static524.aClass66_4.anInt1757 = Static524.aClass66_4.anInt1756 + 50000;
			}
			for (@Pc(35) int local35 = 0; local35 < Static604.aClass234_Sub1Array2.length; local35++) {
				if (arg0 == Static604.aClass234_Sub1Array2[local35].anInt7096) {
					Static167.anInt3593 = Static604.aClass234_Sub1Array2[local35].anInt7086;
				}
			}
			return true;
		}
		@Pc(66) String local66 = "";
		if (Static314.aClass37_6 != Static235.aClass37_5) {
			local66 = ":" + (arg0 + 7000);
		}
		@Pc(81) String local81 = "";
		if (Static188.aString98 != null) {
			local81 = "/p=" + Static188.aString98;
		}
		@Pc(129) String local129 = "http://" + arg1 + local66 + "/l=" + Static204.anInt8130 + "/a=" + Static568.anInt9915 + local81 + "/j" + (Static280.aBoolean388 ? "1" : "0") + ",o" + (Static531.aBoolean677 ? "1" : "0") + ",a2";
		try {
			Static493.aClient1.getAppletContext().showDocument(new URL(local129), "_self");
			return true;
		} catch (@Pc(139) Exception local139) {
			return false;
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(CI)Z")
	public static boolean method3294(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
