import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!eh", name = "T", descriptor = "Lclient!ag;")
	public static Class4 aClass4_42;

	@OriginalMember(owner = "client!eh", name = "X", descriptor = "[I")
	public static int[] anIntArray149 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!eh", name = "cb", descriptor = "I")
	public static int anInt1434 = 0;

	@OriginalMember(owner = "client!eh", name = "fb", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!eh", name = "hb", descriptor = "I")
	public static int anInt1437 = 3;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(III)Z")
	public static boolean method1140(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(JZ)Lclient!dd;")
	public static Class13 method1141(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) long local32 = arg0;
			@Pc(34) int local34 = 0;
			while (local32 != 0L) {
				local32 /= 37L;
				local34++;
			}
			@Pc(50) byte[] local50 = new byte[local34];
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local34--;
				local50[local34] = Static141.aByteArray31[(int) (local54 - arg0 * 37L)];
			}
			@Pc(79) Class13 local79 = new Class13();
			local79.aByteArray19 = local50;
			local79.anInt1080 = local50.length;
			return local79;
		}
	}

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "(B)V")
	public static void method1142() {
		anIntArray149 = null;
		aClass4_42 = null;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(BI)V")
	public static void method1143(@OriginalArg(1) int arg0) {
		if (Static171.method2892(arg0)) {
			Static87.method1847(-1, Static145.aClass20ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZZ)I")
	public static int method1145() {
		return Static118.anInt3129 + Static133.anInt3347;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1146(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static99.aClass23_1);
		arg0.removeFocusListener(Static99.aClass23_1);
		Static70.anInt2007 = -1;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
	public static Object method1147(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static138.aBoolean265) {
			try {
				@Pc(18) Class10 local18 = (Class10) Class.forName("Class10_Sub1").getDeclaredConstructor().newInstance();
				local18.method848(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static138.aBoolean265 = true;
			}
		}
		return arg0;
	}
}
