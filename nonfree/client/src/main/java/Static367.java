import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "Lclient!dq;")
	public static final Class38 aClass38_33 = new Class38(16);

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "I")
	public static int anInt7054 = 10;

	@OriginalMember(owner = "client!wr", name = "A", descriptor = "Z")
	public static boolean aBoolean512 = false;

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString66 = "";

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BIZIII)V")
	public static void method6080(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1) {
			Static225.method4176();
		}
		if (Static31.aFrame1 != null && (arg0 != 3 || arg3 != Static42.anInt1013 || arg4 != Static170.anInt3543)) {
			Static187.method3509(Static227.aClass75_5, Static31.aFrame1);
			Static31.aFrame1 = null;
		}
		if (arg0 == 3 && Static31.aFrame1 == null) {
			Static31.aFrame1 = Static280.method5010(arg4, Static227.aClass75_5, 0, arg3);
			if (Static31.aFrame1 != null) {
				Static42.anInt1013 = arg3;
				Static170.anInt3543 = arg4;
				Static206.method4914(Static227.aClass75_5);
			}
		}
		if (arg0 == 3 && Static31.aFrame1 == null) {
			method6080(Static164.anInt3449, true, arg2, -1, -1);
			return;
		}
		@Pc(77) Container local77;
		@Pc(86) Insets local86;
		if (Static31.aFrame1 != null) {
			Static210.anInt4185 = arg3;
			local77 = Static31.aFrame1;
			Static281.anInt5472 = arg4;
		} else if (Static39.aFrame2 == null) {
			local77 = Static227.aClass75_5.anApplet1;
			Static210.anInt4185 = local77.getSize().width;
			Static281.anInt5472 = local77.getSize().height;
		} else {
			local86 = Static39.aFrame2.getInsets();
			@Pc(94) int local94 = local86.right + local86.left;
			Static210.anInt4185 = Static39.aFrame2.getSize().width - local94;
			@Pc(104) int local104 = local86.bottom + local86.top;
			Static281.anInt5472 = Static39.aFrame2.getSize().height - local104;
			local77 = Static39.aFrame2;
		}
		@Pc(155) int local155;
		if (arg0 == 1) {
			Static100.anInt2305 = 0;
			Static87.anInt1924 = (Static210.anInt4185 - Static82.anInt1847) / 2;
			Static130.anInt2825 = Static142.anInt3063;
			Static213.anInt4274 = Static82.anInt1847;
		} else if (Static268.anInt5269 < 96 && Static241.anInt4925 == 0) {
			local155 = Static210.anInt4185 > 1024 ? 1024 : Static210.anInt4185;
			Static87.anInt1924 = (Static210.anInt4185 - local155) / 2;
			Static213.anInt4274 = local155;
			@Pc(172) int local172 = Static281.anInt5472 > 768 ? 768 : Static281.anInt5472;
			Static130.anInt2825 = local172;
			Static100.anInt2305 = 0;
		} else {
			Static130.anInt2825 = Static281.anInt5472;
			Static213.anInt4274 = Static210.anInt4185;
			Static100.anInt2305 = 0;
			Static87.anInt1924 = 0;
		}
		if (Static195.anInt3950 != 0) {
			@Pc(199) boolean local199;
			if (Static213.anInt4274 < 1024 && Static130.anInt2825 < 768) {
				local199 = true;
			} else {
				local199 = false;
			}
		}
		if (arg1) {
			Static186.method3507(Static241.anInt4925);
		} else {
			Static174.aCanvas3.setSize(Static213.anInt4274, Static130.anInt2825);
			if (Static9.aClass63_1 != null) {
				Static9.aClass63_1.method4572();
			}
			if (Static39.aFrame2 == local77) {
				local86 = Static39.aFrame2.getInsets();
				Static174.aCanvas3.setLocation(local86.left + Static87.anInt1924, Static100.anInt2305 + local86.top);
			} else {
				Static174.aCanvas3.setLocation(Static87.anInt1924, Static100.anInt2305);
			}
		}
		if (arg0 < 2) {
			Static230.aBoolean143 = false;
		} else {
			Static230.aBoolean143 = true;
		}
		if (Static336.anInt6389 != -1) {
			Static14.method4534(true);
		}
		if (Static165.aClass76_2 != null && (Static13.anInt334 == 30 || Static13.anInt334 == 25)) {
			Static330.method5563();
		}
		for (local155 = 0; local155 < 100; local155++) {
			Static207.aBooleanArray21[local155] = true;
		}
		Static237.aBoolean198 = true;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BII[II)V")
	public static void method6081(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(17) int local17 = arg3 - 1;
		@Pc(20) int local20 = local17 - 7;
		while (arg1 < local20) {
			@Pc(24) int local24 = arg1 + 1;
			arg2[local24] = arg0;
			@Pc(29) int local29 = local24 + 1;
			arg2[local29] = arg0;
			@Pc(34) int local34 = local29 + 1;
			arg2[local34] = arg0;
			@Pc(39) int local39 = local34 + 1;
			arg2[local39] = arg0;
			@Pc(44) int local44 = local39 + 1;
			arg2[local44] = arg0;
			@Pc(49) int local49 = local44 + 1;
			arg2[local49] = arg0;
			@Pc(54) int local54 = local49 + 1;
			arg2[local54] = arg0;
			arg1 = local54 + 1;
			arg2[arg1] = arg0;
		}
		while (arg1 < local17) {
			arg1++;
			arg2[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)V")
	public static void method6082(@OriginalArg(1) int arg0) {
		if (Static272.method4850(arg0)) {
			Static219.method4072(-1, Static341.aClass112ArrayArray1[arg0]);
		}
	}
}
