import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!he", name = "o", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!he", name = "A", descriptor = "[I")
	public static int[] anIntArray142;

	@OriginalMember(owner = "client!he", name = "C", descriptor = "Lclient!he;")
	private static Class26 aClass26_705 = Static6.method100("No reply from loginserver)3");

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Lclient!he;")
	public static Class26 aClass26_704 = aClass26_705;

	@OriginalMember(owner = "client!he", name = "D", descriptor = "Lclient!he;")
	public static Class26 aClass26_706 = Static6.method100("(U1");

	@OriginalMember(owner = "client!he", name = "O", descriptor = "Lclient!he;")
	public static Class26 aClass26_707 = Static6.method100("welle:");

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "Lclient!he;")
	private static Class26 aClass26_708 = Static6.method100("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!he", name = "R", descriptor = "Lclient!he;")
	public static Class26 aClass26_709 = Static6.method100(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!he", name = "Y", descriptor = "Lclient!he;")
	public static Class26 aClass26_710 = aClass26_708;

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "Lclient!he;")
	public static Class26 aClass26_711 = Static6.method100("title)3jpg");

	@OriginalMember(owner = "client!he", name = "db", descriptor = "I")
	public static int anInt1362 = 0;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
	public static void method824() {
		aClass26_705 = null;
		aFrame1 = null;
		aClass26_710 = null;
		aClass26_708 = null;
		anIntArray142 = null;
		aClass26_711 = null;
		aClass26_709 = null;
		aClass26_704 = null;
		aClass26_707 = null;
		aClass26_706 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!fb;)V")
	public static void method837(@OriginalArg(1) Class3_Sub1_Sub5_Sub1 arg0) {
		arg0.aBoolean157 = false;
		if (arg0.anInt2723 != -1) {
			@Pc(17) Class3_Sub1_Sub17 local17 = Static111.method2009(arg0.anInt2723);
			if (local17 == null || local17.anIntArray377 == null) {
				arg0.anInt2723 = -1;
			} else {
				arg0.anInt2701++;
				if (arg0.anInt2724 < local17.anIntArray377.length && local17.anIntArray374[arg0.anInt2724] < arg0.anInt2701) {
					arg0.anInt2701 = 1;
					arg0.anInt2724++;
					Static39.method774(arg0.anInt2733, arg0.anInt2724, local17, arg0.anInt2731);
				}
				if (local17.anIntArray377.length <= arg0.anInt2724) {
					arg0.anInt2701 = 0;
					arg0.anInt2724 = 0;
					Static39.method774(arg0.anInt2733, arg0.anInt2724, local17, arg0.anInt2731);
				}
			}
		}
		@Pc(118) Class3_Sub1_Sub17 local118;
		if (arg0.anInt2698 != -1 && Static4.anInt136 >= arg0.anInt2705) {
			if (arg0.anInt2711 < 0) {
				arg0.anInt2711 = 0;
			}
			@Pc(110) int local110 = Static90.method1658(arg0.anInt2698).anInt1307;
			if (local110 == -1) {
				arg0.anInt2698 = -1;
			} else {
				local118 = Static111.method2009(local110);
				if (local118 == null || local118.anIntArray377 == null) {
					arg0.anInt2698 = -1;
				} else {
					arg0.anInt2710++;
					if (arg0.anInt2711 < local118.anIntArray377.length && local118.anIntArray374[arg0.anInt2711] < arg0.anInt2710) {
						arg0.anInt2710 = 1;
						arg0.anInt2711++;
						Static39.method774(arg0.anInt2733, arg0.anInt2711, local118, arg0.anInt2731);
					}
					if (local118.anIntArray377.length <= arg0.anInt2711 && (arg0.anInt2711 < 0 || arg0.anInt2711 >= local118.anIntArray377.length)) {
						arg0.anInt2698 = -1;
					}
				}
			}
		}
		if (arg0.anInt2738 != -1 && arg0.anInt2695 <= 1) {
			local118 = Static111.method2009(arg0.anInt2738);
			if (local118.anInt3097 == 1 && arg0.anInt2706 > 0 && Static4.anInt136 >= arg0.anInt2696 && arg0.anInt2742 < Static4.anInt136) {
				arg0.anInt2695 = 1;
				return;
			}
		}
		if (arg0.anInt2738 != -1 && arg0.anInt2695 == 0) {
			local118 = Static111.method2009(arg0.anInt2738);
			if (local118 == null || local118.anIntArray377 == null) {
				arg0.anInt2738 = -1;
			} else {
				arg0.anInt2704++;
				if (local118.anIntArray377.length > arg0.anInt2708 && local118.anIntArray374[arg0.anInt2708] < arg0.anInt2704) {
					arg0.anInt2704 = 1;
					arg0.anInt2708++;
					Static39.method774(arg0.anInt2733, arg0.anInt2708, local118, arg0.anInt2731);
				}
				if (local118.anIntArray377.length <= arg0.anInt2708) {
					arg0.anInt2737++;
					arg0.anInt2708 -= local118.anInt3109;
					if (local118.anInt3098 <= arg0.anInt2737) {
						arg0.anInt2738 = -1;
					} else if (arg0.anInt2708 >= 0 && arg0.anInt2708 < local118.anIntArray377.length) {
						Static39.method774(arg0.anInt2733, arg0.anInt2708, local118, arg0.anInt2731);
					} else {
						arg0.anInt2738 = -1;
					}
				}
				arg0.aBoolean157 = local118.aBoolean171;
			}
		}
		if (arg0.anInt2695 > 0) {
			arg0.anInt2695--;
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(ILclient!he;)Z")
	public static boolean method844(@OriginalArg(1) Class26 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static133.anInt568; local11++) {
			if (arg0.method832(Static33.aClass26Array9[local11])) {
				return true;
			}
		}
		return arg0.method832(Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.aClass26_393);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)I")
	public static int method854(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = 0;
		while (arg1 > 0) {
			arg1--;
			local9 = arg0 & 0x1 | local9 << 1;
			arg0 >>>= 0x1;
		}
		return local9;
	}
}
