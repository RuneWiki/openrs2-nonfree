import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bu", name = "x", descriptor = "Lclient!fc;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!bu", name = "G", descriptor = "I")
	public static int anInt737;

	@OriginalMember(owner = "client!bu", name = "w", descriptor = "Lclient!o;")
	public static final Class169 aClass169_31 = new Class169("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!bu", name = "A", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_23 = new Class48(33, -1);

	@OriginalMember(owner = "client!bu", name = "D", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_24 = new Class48(46, 7);

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIZI)V")
	public static void method573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg4) {
			Static43.method681();
		}
		if (Static47.aFrame1 != null && (arg2 != 3 || arg3 != Static188.aClass135_Sub1_1.anInt3378 || Static188.aClass135_Sub1_1.anInt3381 != arg1)) {
			Static329.method3255(Static341.aClass162_5, Static47.aFrame1);
			Static47.aFrame1 = null;
		}
		if (arg2 == 3 && Static47.aFrame1 == null) {
			Static47.aFrame1 = Static224.method3128(Static341.aClass162_5, 0, arg3, arg1);
			if (Static47.aFrame1 != null) {
				Static188.aClass135_Sub1_1.anInt3378 = arg3;
				Static188.aClass135_Sub1_1.anInt3381 = arg1;
				Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
			}
		}
		if (arg2 == 3 && Static47.aFrame1 == null) {
			method573(arg0, -1, Static188.aClass135_Sub1_1.anInt3380, -1, true);
			return;
		}
		@Pc(84) Container local84;
		@Pc(97) Insets local97;
		if (Static47.aFrame1 != null) {
			Static278.anInt4645 = arg1;
			local84 = Static47.aFrame1;
			Static160.anInt2899 = arg3;
		} else if (Static142.aFrame2 == null) {
			local84 = Static341.aClass162_5.anApplet1;
			Static160.anInt2899 = local84.getSize().width;
			Static278.anInt4645 = local84.getSize().height;
		} else {
			local97 = Static142.aFrame2.getInsets();
			Static160.anInt2899 = Static142.aFrame2.getSize().width - local97.right - local97.left;
			Static278.anInt4645 = Static142.aFrame2.getSize().height - local97.bottom - local97.top;
			local84 = Static142.aFrame2;
		}
		@Pc(162) int local162;
		if (arg2 == 1) {
			Static136.anInt6304 = Static275.anInt4790;
			Static307.anInt5742 = (Static160.anInt2899 - Static275.anInt4790) / 2;
			Static155.anInt2835 = 0;
			Static218.anInt3871 = Static48.anInt953;
		} else if (Static294.anInt5063 < 96 && Static25.anInt394 == 0) {
			local162 = Static160.anInt2899 > 1024 ? 1024 : Static160.anInt2899;
			Static307.anInt5742 = (Static160.anInt2899 - local162) / 2;
			Static136.anInt6304 = local162;
			@Pc(180) int local180 = Static278.anInt4645 <= 768 ? Static278.anInt4645 : 768;
			Static218.anInt3871 = local180;
			Static155.anInt2835 = 0;
		} else {
			Static307.anInt5742 = 0;
			Static218.anInt3871 = Static278.anInt4645;
			Static136.anInt6304 = Static160.anInt2899;
			Static155.anInt2835 = 0;
		}
		if (Static314.aClass73_5 != Static96.aClass73_2) {
			@Pc(208) boolean local208;
			if (Static136.anInt6304 < 1024 && Static218.anInt3871 < 768) {
				local208 = true;
			} else {
				local208 = false;
			}
		}
		if (arg4) {
			Static75.method1176(Static25.anInt394);
		} else {
			Static177.aCanvas3.setSize(Static136.anInt6304, Static218.anInt3871);
			if (Static66.aClass164_2 != null) {
				Static66.aClass164_2.method5359();
			}
			if (Static142.aFrame2 == local84) {
				local97 = Static142.aFrame2.getInsets();
				Static177.aCanvas3.setLocation(Static307.anInt5742 + local97.left, Static155.anInt2835 + local97.top);
			} else {
				Static177.aCanvas3.setLocation(Static307.anInt5742, Static155.anInt2835);
			}
		}
		if (arg2 >= 2) {
			Static76.aBoolean522 = true;
		} else {
			Static76.aBoolean522 = false;
		}
		if (Static352.anInt5753 != -1) {
			Static195.method5584(true);
		}
		if (Static6.aClass130_1 != null && (Static142.anInt2665 == 30 || Static142.anInt2665 == 25)) {
			Static68.method1131();
		}
		for (local162 = 0; local162 < 100; local162++) {
			Static96.aBooleanArray9[local162] = true;
		}
		Static326.aBoolean515 = true;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIILclient!t;)V")
	public static void method575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class25_Sub2 arg4) {
		@Pc(4) Class132 local4 = Static18.method2854(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt850 = (arg1 << Static365.anInt5876) + Static276.anInt5131;
		arg4.anInt848 = arg3;
		arg4.anInt854 = (arg2 << Static365.anInt5876) + Static276.anInt5131;
		for (@Pc(28) Class116 local28 = local4.aClass116_3; local28 != null; local28 = local28.aClass116_2) {
			if (local28.aClass25_Sub1_1.aBoolean557) {
				@Pc(38) int local38 = local28.aClass25_Sub1_1.method5239();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt848 += local8;
			arg4.aBoolean74 = true;
		}
		local4.aClass25_Sub2_1 = arg4;
	}
}
