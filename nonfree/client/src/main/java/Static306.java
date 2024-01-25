import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!tm", name = "hb", descriptor = "I")
	public static int anInt6045;

	@OriginalMember(owner = "client!tm", name = "vb", descriptor = "I")
	public static int anInt6053;

	@OriginalMember(owner = "client!tm", name = "mb", descriptor = "I")
	public static int anInt6046 = 0;

	@OriginalMember(owner = "client!tm", name = "Db", descriptor = "Ljava/lang/String;")
	public static String aString227 = "skill: ";

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < 1 || arg5 < 1 || Static162.anInt2152 - 2 < arg6 || arg5 > Static122.anInt2632 - 2) {
			return;
		}
		if (!Static75.method1142() && !Static109.method1871(arg5, arg3, arg6, Static353.anInt6829)) {
			return;
		}
		if (Static256.aClass45ArrayArrayArray2 == null) {
			return;
		}
		@Pc(49) int local49 = arg3;
		if (arg3 < 3 && Static116.method2027(arg5, arg6)) {
			local49 = arg3 + 1;
		}
		Static269.method4558(Static212.aClass122_2, arg1, arg5, arg3, local49, Static34.aClass13Array1[arg3], arg6);
		if (arg0 < 0) {
			return;
		}
		@Pc(76) boolean local76 = Static271.aBoolean338;
		Static271.aBoolean338 = true;
		Static122.method2151(arg3, local49, arg7, arg6, Static212.aClass122_2, false, arg4, arg5, arg2, arg0, false, Static34.aClass13Array1[arg3]);
		Static271.aBoolean338 = local76;
		return;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIZ)V")
	public static void method5120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static19.anInt533 <= arg0 && Static4.anInt75 >= arg0) {
			@Pc(11) int local11 = Static312.method5334(Static236.anInt4721, Static73.anInt1425, arg3);
			@Pc(17) int local17 = Static312.method5334(Static236.anInt4721, Static73.anInt1425, arg2);
			Static151.method2444(arg0, local11, arg1, local17);
		}
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V")
	public static void method5130() {
		if (Static67.aFrame1 != null) {
			return;
		}
		@Pc(8) int local8 = Static34.anInt781;
		@Pc(10) int local10 = Static264.anInt5293;
		@Pc(18) int local18 = Static56.anInt1236 - Static298.anInt5944 - local8;
		@Pc(26) int local26 = Static165.anInt3205 - local10 - Static171.anInt3583;
		if (local8 <= 0 && local18 <= 0 && local10 <= 0 && local26 <= 0) {
			return;
		}
		try {
			@Pc(45) Container local45;
			if (Static176.aFrame4 == null) {
				local45 = Static353.aClass42_5.anApplet1;
			} else {
				local45 = Static176.aFrame4;
			}
			@Pc(51) int local51 = 0;
			@Pc(53) int local53 = 0;
			if (Static176.aFrame4 == local45) {
				@Pc(59) Insets local59 = Static176.aFrame4.getInsets();
				local53 = local59.top;
				local51 = local59.left;
			}
			@Pc(68) Graphics local68 = local45.getGraphics();
			local68.setColor(Color.black);
			if (local8 > 0) {
				local68.fillRect(local51, local53, local8, Static165.anInt3205);
			}
			if (local10 > 0) {
				local68.fillRect(local51, local53, Static56.anInt1236, local10);
			}
			if (local18 > 0) {
				local68.fillRect(local51 + Static56.anInt1236 - local18, local53, local18, Static165.anInt3205);
			}
			if (local26 > 0) {
				local68.fillRect(local51, Static165.anInt3205 + local53 - local26, Static56.anInt1236, local26);
			}
		} catch (@Pc(121) Exception local121) {
		}
	}

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "(B)Lclient!jn;")
	public static Class70 method5146() {
		try {
			return new Class70_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class70) Class.forName("Class70_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class70_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public static void method5148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) String arg4) {
		Static232.method3992(null, arg2, arg3, -1, arg1, arg0, arg4);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)I")
	public static int method5154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class19.anIntArray21[arg1 * 8192 / arg3] >> 1;
		return ((65536 - local21) * arg2 >> 16) + (local21 * arg0 >> 16);
	}
}
