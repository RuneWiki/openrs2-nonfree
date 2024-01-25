import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
	public static int anInt4735;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Lclient!nl;")
	public static Class171 aClass171_74;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "[I")
	public static final int[] anIntArray914 = new int[4096];

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "Lclient!lo;")
	public static Class150 aClass150_3 = null;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLclient!vc;IIII)V")
	public static void method4179(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.method1958(arg3, arg2, arg3 + arg1, arg4 + arg2);
		arg0.method1951(arg2, arg4, arg1, -16777216, arg3);
		if (Static309.anInt5191 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static338.anInt3296 / (float) Static338.anInt3306;
		@Pc(35) int local35 = arg1;
		@Pc(37) int local37 = arg4;
		if (local33 < 1.0F) {
			local37 = (int) (local33 * (float) arg1);
		} else {
			local35 = (int) ((float) arg4 / local33);
		}
		@Pc(72) int local72 = arg3 + (arg1 - local35) / 2;
		@Pc(81) int local81 = arg2 + (arg4 - local37) / 2;
		if (Static38.aClass18_1 == null || Static38.aClass18_1.method4563() != arg1 || Static38.aClass18_1.method4571() != arg4) {
			Static338.method3039(Static338.anInt3305, Static338.anInt3296 + Static338.anInt3307, Static338.anInt3305 - -Static338.anInt3306, Static338.anInt3307, local72, local81, local35 + local72, local37 + local81);
			Static338.method3051(arg0);
			Static38.aClass18_1 = arg0.method2046(local72, local81, local35, local37, false);
		}
		Static38.aClass18_1.method4558(local72, local81);
		@Pc(133) int local133 = Static68.anInt1325 * local35 / Static338.anInt3306;
		@Pc(139) int local139 = Static17.anInt397 * local37 / Static338.anInt3296;
		@Pc(147) int local147 = local72 + Static288.anInt5009 * local35 / Static338.anInt3306;
		@Pc(161) int local161 = local37 + local81 - Static182.anInt3875 * local37 / Static338.anInt3296 - local139;
		@Pc(163) int local163 = -1996554240;
		if (Static119.aClass150_1 == aClass150_3) {
			local163 = -1996488705;
		}
		arg0.method1982(local147, local161, local133, local139, local163, 1);
		arg0.method1955(local147, local161, local133, local139, local163, 0);
		if (Static121.anInt2597 <= 0) {
			return;
		}
		@Pc(195) int local195;
		if (Static33.anInt699 <= 50) {
			local195 = Static33.anInt699 * 5;
		} else {
			local195 = (100 - Static33.anInt699) * 5;
		}
		for (@Pc(209) Class2_Sub23 local209 = (Class2_Sub23) Static338.aClass30_23.method694(); local209 != null; local209 = (Class2_Sub23) Static338.aClass30_23.method682()) {
			@Pc(217) Class243 local217 = Static338.aClass226_3.method4913(local209.anInt2801);
			if (Static225.method3690(local217)) {
				@Pc(241) int local241;
				@Pc(253) int local253;
				if (Static17.anInt398 == local209.anInt2801) {
					local241 = local209.anInt2800 * local35 / Static338.anInt3306 + local72;
					local253 = local81 + local37 * (Static338.anInt3296 - local209.anInt2803) / Static338.anInt3296;
					arg0.method1951(local253 - 2, 4, 4, local195 << 24 | 0xFFFF00, local241 - 2);
				} else if (Static223.anInt3988 != -1 && Static223.anInt3988 == local217.anInt6354) {
					local241 = local72 + local35 * local209.anInt2800 / Static338.anInt3306;
					local253 = local81 + (Static338.anInt3296 - local209.anInt2803) * local37 / Static338.anInt3296;
					arg0.method1951(local253 - 2, 4, 4, local195 << 24 | 0xFFFF00, local241 - 2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Lclient!ro;")
	public static Class1_Sub4 method4181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class251 local7 = Static64.aClass251ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class1_Sub4 local14 = local7.aClass1_Sub4_1;
			local7.aClass1_Sub4_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
	public static void method4182() {
		if (Static385.aFrame2 != null) {
			return;
		}
		@Pc(17) Container local17;
		if (Static8.aFrame1 == null) {
			local17 = Static359.aClass111_5.anApplet1;
		} else {
			local17 = Static8.aFrame1;
		}
		Static70.anInt1246 = local17.getSize().width;
		Static230.anInt4054 = local17.getSize().height;
		@Pc(36) Insets local36;
		if (local17 == Static8.aFrame1) {
			local36 = Static8.aFrame1.getInsets();
			Static70.anInt1246 -= local36.left + local36.right;
			Static230.anInt4054 -= local36.bottom + local36.top;
		}
		if (Static162.method2888() == 1) {
			Static253.anInt4467 = Static237.anInt4228;
			Static362.anInt6102 = Static253.anInt4466;
			Static88.anInt1685 = 0;
			Static341.anInt5819 = (Static70.anInt1246 - Static237.anInt4228) / 2;
		} else if (Static253.anInt4468 < 96 && Static62.anInt1261 == 0) {
			@Pc(98) int local98 = Static70.anInt1246 > 1024 ? 1024 : Static70.anInt1246;
			Static341.anInt5819 = (Static70.anInt1246 - local98) / 2;
			Static253.anInt4467 = local98;
			@Pc(114) int local114 = Static230.anInt4054 <= 768 ? Static230.anInt4054 : 768;
			Static362.anInt6102 = local114;
			Static88.anInt1685 = 0;
		} else {
			Static341.anInt5819 = 0;
			Static253.anInt4467 = Static70.anInt1246;
			Static88.anInt1685 = 0;
			Static362.anInt6102 = Static230.anInt4054;
		}
		if (Static141.aClass117_7 != Static17.aClass117_1) {
			@Pc(130) boolean local130;
			if (Static253.anInt4467 < 1024 && Static362.anInt6102 < 768) {
				local130 = true;
			} else {
				local130 = false;
			}
		}
		Static257.aCanvas4.setSize(Static253.anInt4467, Static362.anInt6102);
		if (Static111.aClass63_3 != null) {
			Static111.aClass63_3.method1956();
		}
		if (local17 == Static8.aFrame1) {
			local36 = Static8.aFrame1.getInsets();
			Static257.aCanvas4.setLocation(local36.left + Static341.anInt5819, Static88.anInt1685 + local36.top);
		} else {
			Static257.aCanvas4.setLocation(Static341.anInt5819, Static88.anInt1685);
		}
		if (Static234.anInt4158 != -1) {
			Static242.method4238(true);
		}
		Static316.method4706();
	}
}
