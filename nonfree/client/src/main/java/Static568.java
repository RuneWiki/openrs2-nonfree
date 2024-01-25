import java.applet.Applet;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!vu", name = "i", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
	public static int anInt9273;

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "Lclient!jw;")
	public static final Class181 aClass181_15 = new Class181(14, -1);

	@OriginalMember(owner = "client!vu", name = "o", descriptor = "I")
	public static int anInt9276 = 0;

	@OriginalMember(owner = "client!vu", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[100];

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IB)I")
	public static int method7662(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)Z")
	public static boolean method7663() {
		try {
			return Static339.method5067();
		} catch (@Pc(15) IOException local15) {
			Static509.method7019();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(78) String local78 = "T2 - " + (Static315.aClass81_130 == null ? -1 : Static315.aClass81_130.method1970()) + "," + (Static478.aClass81_193 == null ? -1 : Static478.aClass81_193.method1970()) + "," + (Static587.aClass81_229 == null ? -1 : Static587.aClass81_229.method1970()) + " - " + Static494.anInt8294 + "," + (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray437[0] + Static376.anInt6631) + "," + (Static24.anInt674 + Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray436[0]) + " - ";
			for (@Pc(80) int local80 = 0; Static494.anInt8294 > local80 && local80 < 50; local80++) {
				local78 = local78 + Static480.aClass1_Sub20_Sub1_1.aByteArray52[local80] + ",";
			}
			Static259.method4059(local78, local20);
			Static340.method5070(false);
			return true;
		}
	}
}
