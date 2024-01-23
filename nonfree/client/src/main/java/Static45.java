import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!co", name = "B", descriptor = "Lclient!ie;")
	public static Class78 aClass78_2;

	@OriginalMember(owner = "client!co", name = "r", descriptor = "[I")
	public static int[] anIntArray68 = new int[100];

	@OriginalMember(owner = "client!co", name = "x", descriptor = "Z")
	public static boolean aBoolean71 = false;

	@OriginalMember(owner = "client!co", name = "D", descriptor = "S")
	public static short aShort1 = 205;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/lang/String;BIZ)I")
	public static int method682(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(49) char local49 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local49 == '-') {
					local33 = true;
					continue;
				}
				if (local49 == '+') {
					continue;
				}
			}
			@Pc(79) int local79;
			if (local49 >= '0' && local49 <= '9') {
				local79 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local79 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local79 = local49 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local79) {
				throw new NumberFormatException();
			}
			if (local33) {
				local79 = -local79;
			}
			@Pc(128) int local128 = local79 + arg1 * local37;
			if (local37 != local128 / arg1) {
				throw new NumberFormatException();
			}
			local35 = true;
			local37 = local128;
		}
		if (!local35) {
			throw new NumberFormatException();
		}
		return local37;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V")
	public static void method683() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 104; local9++) {
			for (@Pc(16) int local16 = 0; local16 < 104; local16++) {
				if (Static265.method4457(true, local7, local9, Static146.aClass3_Sub25ArrayArrayArray7, local16)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIBIII)V")
	public static void method684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static118.method1920(arg1);
		@Pc(13) int local13 = arg1 - arg4;
		@Pc(15) int local15 = arg1;
		@Pc(18) int local18 = -arg1;
		if (local13 < 0) {
			local13 = 0;
		}
		@Pc(28) int local28 = local13;
		@Pc(31) int local31 = -local13;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(41) int local41 = local13 + arg2;
		@Pc(45) int[] local45 = Static129.anIntArrayArray40[arg0];
		@Pc(50) int local50 = arg2 - local13;
		Static235.method3988(arg3, local45, local50, arg2 - arg1);
		Static235.method3988(arg5, local45, local41, local50);
		Static235.method3988(arg3, local45, arg2 + arg1, local41);
		while (local15 > local35) {
			local37 += 2;
			local33 += 2;
			local31 += local37;
			local18 += local33;
			if (local31 >= 0 && local28 >= 1) {
				Static156.anIntArray335[local28] = local35;
				local28--;
				local31 -= local28 << 1;
			}
			local35++;
			@Pc(126) int[] local126;
			@Pc(137) int[] local137;
			@Pc(130) int local130;
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			@Pc(156) int local156;
			if (local18 >= 0) {
				local15--;
				if (local15 < local13) {
					local126 = Static129.anIntArrayArray40[arg0 + local15];
					local130 = Static156.anIntArray335[local15];
					local137 = Static129.anIntArrayArray40[arg0 - local15];
					local141 = local35 + arg2;
					local146 = arg2 - local35;
					local151 = arg2 + local130;
					local156 = arg2 - local130;
					Static235.method3988(arg3, local126, local156, local146);
					Static235.method3988(arg5, local126, local151, local156);
					Static235.method3988(arg3, local126, local141, local151);
					Static235.method3988(arg3, local137, local156, local146);
					Static235.method3988(arg5, local137, local151, local156);
					Static235.method3988(arg3, local137, local141, local151);
				} else {
					local126 = Static129.anIntArrayArray40[local15 + arg0];
					local137 = Static129.anIntArrayArray40[arg0 - local15];
					local130 = arg2 + local35;
					local141 = arg2 - local35;
					Static235.method3988(arg3, local126, local130, local141);
					Static235.method3988(arg3, local137, local130, local141);
				}
				local18 -= local15 << 1;
			}
			local141 = arg2 - local15;
			local137 = Static129.anIntArrayArray40[arg0 - local35];
			local130 = arg2 + local15;
			local126 = Static129.anIntArrayArray40[local35 + arg0];
			if (local13 <= local35) {
				Static235.method3988(arg3, local126, local130, local141);
				Static235.method3988(arg3, local137, local130, local141);
			} else {
				local146 = local28 >= local35 ? local28 : Static156.anIntArray335[local35];
				local151 = local146 + arg2;
				local156 = arg2 - local146;
				Static235.method3988(arg3, local126, local156, local141);
				Static235.method3988(arg5, local126, local151, local156);
				Static235.method3988(arg3, local126, local130, local151);
				Static235.method3988(arg3, local137, local156, local141);
				Static235.method3988(arg5, local137, local151, local156);
				Static235.method3988(arg3, local137, local130, local151);
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(I)V")
	public static void method685() {
		@Pc(7) int local7 = Static59.anInt1138;
		@Pc(9) int local9 = Static307.anInt6024;
		@Pc(22) int local22 = Static199.anInt3882 - local7 - Static253.anInt5224;
		@Pc(29) int local29 = Static256.anInt5286 - Static123.anInt2333 - local9;
		if (local7 <= 0 && local22 <= 0 && local9 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(48) Container local48;
			if (Static73.aFrame1 != null) {
				local48 = Static73.aFrame1;
			} else if (Static276.aFrame2 == null) {
				local48 = Static274.aClass176_4.anApplet1;
			} else {
				local48 = Static276.aFrame2;
			}
			@Pc(61) int local61 = 0;
			@Pc(63) int local63 = 0;
			if (local48 == Static276.aFrame2) {
				@Pc(70) Insets local70 = Static276.aFrame2.getInsets();
				local61 = local70.left;
				local63 = local70.top;
			}
			@Pc(79) Graphics local79 = local48.getGraphics();
			local79.setColor(Color.black);
			if (local7 > 0) {
				local79.fillRect(local61, local63, local7, Static256.anInt5286);
			}
			if (local9 > 0) {
				local79.fillRect(local61, local63, Static199.anInt3882, local9);
			}
			if (local22 > 0) {
				local79.fillRect(Static199.anInt3882 + local61 - local22, local63, local22, Static256.anInt5286);
			}
			if (local29 > 0) {
				local79.fillRect(local61, Static256.anInt5286 + local63 - local29, Static199.anInt3882, local29);
			}
		} catch (@Pc(134) Exception local134) {
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(II)I")
	public static int method686(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(II)V")
	public static void method687(@OriginalArg(0) int arg0) {
		if (!Static57.aBoolean82) {
			arg0 = -1;
		}
		if (arg0 == Static165.anInt3092) {
			return;
		}
		if (arg0 != -1) {
			@Pc(19) Class37 local19 = Static70.method1059(arg0);
			@Pc(23) Class3_Sub4_Sub12_Sub2 local23 = local19.method921();
			if (local23 == null) {
				arg0 = -1;
			} else {
				Static274.aClass176_4.method4525(local23.method4716(), local23.anInt5731, local23.anInt5723, Static224.aCanvas12, new Point(local19.anInt1086, local19.anInt1084));
				Static165.anInt3092 = arg0;
			}
		}
		if (arg0 == -1 && Static165.anInt3092 != -1) {
			Static274.aClass176_4.method4525(null, -1, -1, Static224.aCanvas12, new Point());
			Static165.anInt3092 = -1;
		}
	}
}
