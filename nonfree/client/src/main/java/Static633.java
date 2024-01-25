import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!wha", name = "M", descriptor = "I")
	private static int anInt1536;

	@OriginalMember(owner = "client!wha", name = "N", descriptor = "Z")
	private static boolean aBoolean109;

	@OriginalMember(owner = "client!wha", name = "O", descriptor = "Z")
	private static boolean aBoolean110;

	@OriginalMember(owner = "client!wha", name = "P", descriptor = "Z")
	private static boolean aBoolean111;

	@OriginalMember(owner = "client!wha", name = "Q", descriptor = "I")
	private static int anInt1537;

	@OriginalMember(owner = "client!wha", name = "R", descriptor = "I")
	private static int anInt1538;

	@OriginalMember(owner = "client!wha", name = "S", descriptor = "I")
	private static int anInt1539;

	@OriginalMember(owner = "client!wha", name = "T", descriptor = "Z")
	private static boolean aBoolean112;

	@OriginalMember(owner = "client!wha", name = "U", descriptor = "Z")
	private static boolean aBoolean113;

	@OriginalMember(owner = "client!wha", name = "V", descriptor = "I")
	private static int anInt1540;

	@OriginalMember(owner = "client!wha", name = "W", descriptor = "I")
	private static int anInt1541;

	@OriginalMember(owner = "client!wha", name = "X", descriptor = "I")
	private static int anInt1542;

	@OriginalMember(owner = "client!wha", name = "Y", descriptor = "I")
	private static int anInt1543;

	@OriginalMember(owner = "client!wha", name = "Z", descriptor = "I")
	private static int anInt1544;

	@OriginalMember(owner = "client!wha", name = "ab", descriptor = "I")
	private static int anInt1545;

	@OriginalMember(owner = "client!wha", name = "bb", descriptor = "I")
	private static int anInt1546;

	@OriginalMember(owner = "client!wha", name = "cb", descriptor = "Z")
	private static boolean aBoolean114;

	@OriginalMember(owner = "client!wha", name = "db", descriptor = "I")
	private static int anInt1547;

	@OriginalMember(owner = "client!wha", name = "E", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[200];

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(BZLjava/awt/Component;)Lclient!fn;")
	public static Class49 method1297(@OriginalArg(2) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class49_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class49) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class49_Sub1(arg0, true);
		}
	}
}
