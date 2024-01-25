import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!lha", name = "c", descriptor = "[I")
	public static int[] anIntArray393;

	@OriginalMember(owner = "client!lha", name = "d", descriptor = "I")
	public static int anInt6143 = 0;

	@OriginalMember(owner = "client!lha", name = "h", descriptor = "Lclient!kh;")
	public static Class208 aClass208_8 = null;

	@OriginalMember(owner = "client!lha", name = "i", descriptor = "I")
	public static int anInt6146 = 0;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIII)Z")
	public static boolean method5151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static338.aByteArrayArrayArray13[0][arg0][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static338.aByteArrayArrayArray13[arg2][arg0][arg1] & 0x10) == 0) {
			return arg3 == Static159.method8611(arg1, arg0, arg2);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!gj;Lclient!lu;Z)V")
	public static void method5152(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class231 arg1) {
		Static284.aClass143_76 = arg0;
		Static652.aClass231_6 = arg1;
		Static311.aString72 = "";
		if (Class359.aString121.startsWith("win")) {
			Static311.aString72 = Static311.aString72 + "windows/";
		} else if (Class359.aString121.startsWith("linux")) {
			Static311.aString72 = Static311.aString72 + "linux/";
		} else if (Class359.aString121.startsWith("mac")) {
			Static311.aString72 = Static311.aString72 + "macos/";
		}
		if (Static652.aClass231_6.aBoolean484) {
			Static311.aString72 = Static311.aString72 + "msjava/";
		} else if (Class359.aString122.startsWith("amd64") || Class359.aString122.startsWith("x86_64")) {
			Static311.aString72 = Static311.aString72 + "x86_64/";
		} else if (Class359.aString122.startsWith("i386") || Class359.aString122.startsWith("i486") || Class359.aString122.startsWith("i586") || Class359.aString122.startsWith("x86")) {
			Static311.aString72 = Static311.aString72 + "x86/";
		} else if (Class359.aString122.startsWith("ppc")) {
			Static311.aString72 = Static311.aString72 + "ppc/";
		} else {
			Static311.aString72 = Static311.aString72 + "universal/";
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(B)Lclient!waa;")
	public static Class31_Sub1 method5155() {
		Static67.anInt9118 = 0;
		return Static577.method7765();
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5160(@OriginalArg(1) String arg0) {
		if (Static475.aStringArray64 == null) {
			Static612.method8068();
		}
		Static79.aCalendar1.setTime(new Date(Static131.method2268()));
		@Pc(20) int local20 = Static79.aCalendar1.get(11);
		@Pc(32) int local32 = Static79.aCalendar1.get(12);
		@Pc(36) int local36 = Static79.aCalendar1.get(13);
		@Pc(70) String local70 = Integer.toString(local20 / 10) + local20 % 10 + ":" + local32 / 10 + local32 % 10 + ":" + local36 / 10 + local36 % 10;
		@Pc(75) String[] local75 = Static325.method5062(arg0, '\n');
		for (@Pc(77) int local77 = 0; local77 < local75.length; local77++) {
			for (@Pc(81) int local81 = Static275.anInt6800; local81 > 0; local81--) {
				Static475.aStringArray64[local81] = Static475.aStringArray64[local81 - 1];
			}
			Static475.aStringArray64[0] = local70 + ": " + local75[local77];
			if (Static540.aFileOutputStream3 != null) {
				try {
					Static540.aFileOutputStream3.write(Static497.method7095(Static475.aStringArray64[0] + "\n"));
				} catch (@Pc(127) IOException local127) {
				}
			}
			if (Static275.anInt6800 < Static475.aStringArray64.length - 1) {
				if (Static392.anInt10294 > 0) {
					Static392.anInt10294++;
				}
				Static275.anInt6800++;
			}
		}
	}
}
