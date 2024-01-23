import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "Lclient!pa;")
	public static Class86 aClass86_34;

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "[I")
	public static int[] anIntArray197;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
	public static int anInt2065 = 0;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)V")
	public static void method1590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static172.anInt3511 == 0 || arg0 == 0 || Static223.anInt4343 >= 50 || arg1 == -1) {
			return;
		}
		Static148.anIntArray319[Static223.anInt4343] = arg1;
		Static10.anIntArray24[Static223.anInt4343] = arg0;
		Static155.anIntArray332[Static223.anInt4343] = arg2;
		Static27.aClass71Array1[Static223.anInt4343] = null;
		Static204.anIntArray465[Static223.anInt4343] = 0;
		Static223.anInt4343++;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIII)V")
	public static void method1592(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static29.method406(arg1, arg0, arg1 + arg3, arg0 - -arg2);
		Static29.method423(arg1, arg0, arg3, arg2, 0);
		if (Static6.anInt110 < 100) {
			return;
		}
		if (Static233.aClass1_Sub1_Sub8_6 == null || Static233.aClass1_Sub1_Sub8_6.anInt2984 != arg3 || arg2 != Static233.aClass1_Sub1_Sub8_6.anInt2985) {
			@Pc(47) Class1_Sub1_Sub8_Sub1 local47 = new Class1_Sub1_Sub8_Sub1(arg3, arg2);
			Static29.method408(local47.anIntArray310, arg3, arg2);
			Static1.method29(0, 0, Static12.anInt239, arg2, 0, Static164.anInt3383, arg3, 0);
			Static233.aClass1_Sub1_Sub8_6 = local47;
			Static133.aClass35_1.method3264();
		}
		Static233.aClass1_Sub1_Sub8_6.method2424(arg1, arg0);
		@Pc(82) int local82 = arg1 + arg3 * Static65.anInt4125 / Static164.anInt3383;
		@Pc(91) int local91 = arg0 + arg2 * Static97.anInt1979 / Static12.anInt239;
		@Pc(97) int local97 = arg3 * Static112.anInt2217 / Static164.anInt3383;
		@Pc(103) int local103 = Static85.anInt1756 * arg2 / Static12.anInt239;
		Static29.method401(local82, local91, local97, local103, 16711680, 128);
		Static29.method411(local82, local91, local97, local103, 16711680);
		if (Static192.anInt3939 <= 0 || Static192.anInt3939 % 10 >= 5) {
			return;
		}
		for (@Pc(138) Class1_Sub2 local138 = (Class1_Sub2) Static223.aClass75_22.method2239(); local138 != null; local138 = (Class1_Sub2) Static223.aClass75_22.method2238()) {
			if (local138.anInt60 == Static199.anInt4011) {
				@Pc(154) int local154 = arg1 + arg3 * local138.anInt50 / Static164.anInt3383;
				@Pc(163) int local163 = arg2 * local138.anInt54 / Static12.anInt239 + arg0;
				Static29.method423(local154 - 2, local163 + -2, 4, 4, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)V")
	public static void method1593(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static159.aBoolean199) {
			Static144.method2380();
		} else if (arg0 != -1 && (arg0 != Static35.anInt737 || !Static68.method1007()) && Static152.anInt3168 != 0 && !Static159.aBoolean199) {
			Static74.method1094(arg0, Static58.aClass86_Sub1_9, Static152.anInt3168);
		}
		Static35.anInt737 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLclient!pa;ILclient!pa;Lclient!ki;)V")
	public static void method1594(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(3) Class86 arg2, @OriginalArg(4) Class1_Sub1_Sub10_Sub1 arg3) {
		Static54.aClass86_17 = arg1;
		Static212.aClass86_76 = arg2;
		Static198.aBoolean186 = arg0;
		@Pc(19) int local19 = Static212.aClass86_76.method3319() - 1;
		Static109.anInt2173 = local19 * 256 + Static212.aClass86_76.method3323(local19);
		Static173.aClass1_Sub1_Sub10_Sub1_2 = arg3;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
	public static int method1595(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}
}
