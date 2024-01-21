import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "Lclient!jd;")
	public static Class11 aClass11_91;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Z")
	public static volatile boolean aBoolean100 = true;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
	public static int anInt2176 = 0;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!mb;")
	public static Class45 aClass45_902 = Static63.method1251("*6n");

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!mb;")
	public static Class45 aClass45_903 = Static63.method1251(":  ");

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
	public static int anInt2178 = 0;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!mb;")
	public static Class45 aClass45_904 = Static63.method1251("null");

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "Lclient!mb;")
	public static Class45 aClass45_905 = Static63.method1251(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
	public static int anInt2180 = 0;

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "Lclient!mb;")
	private static Class45 aClass45_909 = Static63.method1251("flash3:");

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Lclient!mb;")
	public static Class45 aClass45_906 = aClass45_909;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!mb;")
	public static Class45 aClass45_907 = Static63.method1251(" hat sich eingeloggt)3");

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "Lclient!mb;")
	private static Class45 aClass45_908 = Static63.method1251("Please try again)3");

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
	public static int anInt2182 = 0;

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "Lclient!mb;")
	public static Class45 aClass45_910 = Static63.method1251("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
	public static int anInt2183 = 0;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
	public static int anInt2185 = 0;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Lclient!mb;")
	public static Class45 aClass45_911 = aClass45_908;

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "Lclient!mb;")
	public static Class45 aClass45_912 = Static63.method1251("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method1473() {
		aClass45_911 = null;
		aClass11_91 = null;
		aClass45_904 = null;
		aClass45_906 = null;
		aClass45_902 = null;
		aClass45_907 = null;
		aClass45_905 = null;
		aCanvas1 = null;
		aClass45_912 = null;
		aClass45_910 = null;
		aClass45_908 = null;
		aClass45_909 = null;
		aClass45_903 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILclient!t;[B)V")
	public static void method1475(@OriginalArg(0) int arg0, @OriginalArg(2) Class68 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class5_Sub14 local7 = new Class5_Sub14();
		local7.aByteArray26 = arg2;
		local7.anInt1841 = 0;
		local7.aClass68_3 = arg1;
		local7.aLong146 = arg0;
		@Pc(27) Class10 local27 = Static19.aClass10_4;
		synchronized (Static19.aClass10_4) {
			Static19.aClass10_4.method234(local7);
		}
		Static63.method1250();
	}
}
