import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "Lclient!ge;")
	public static Class29_Sub1 aClass29_Sub1_17;

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
	public static int anInt1334;

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "Lclient!mb;")
	public static Class45 aClass45_562 = Static63.method1251("Lade Sprites )2 ");

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "Lclient!mb;")
	public static Class45 aClass45_563 = Static63.method1251(" )2> @whi@");

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "Lclient!mb;")
	private static Class45 aClass45_566 = Static63.method1251("Walk here");

	@OriginalMember(owner = "client!ic", name = "N", descriptor = "Lclient!mb;")
	public static Class45 aClass45_564 = aClass45_566;

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "Lclient!mb;")
	public static Class45 aClass45_565 = Static63.method1251("gelb:");

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "J")
	public static volatile long aLong71 = 0L;

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "Z")
	public static volatile boolean aBoolean71 = false;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(Z)I")
	public static int method974() {
		return Static53.anInt2369++;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
	public static void method975() {
		aClass45_564 = null;
		aClass45_562 = null;
		aClass45_563 = null;
		aClass45_565 = null;
		aClass45_566 = null;
		aClass29_Sub1_17 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
	public static Object method976(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static67.aBoolean92) {
			try {
				@Pc(20) Class24 local20 = (Class24) Class.forName("Class24_Sub1").getDeclaredConstructor().newInstance();
				local20.method681(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static67.aBoolean92 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method978(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static89.aClass52_1);
		arg0.removeFocusListener(Static89.aClass52_1);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!mb;ILclient!mb;Lclient!sd;IZ)V")
	public static void method979(@OriginalArg(0) Class45 arg0, @OriginalArg(2) Class45 arg1, @OriginalArg(3) Class29 arg2) {
		@Pc(13) int local13 = arg2.method746(arg0);
		@Pc(19) int local19 = arg2.method753(arg1, local13);
		Static61.method1224(arg2, local13, 255, local19);
	}
}
