import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!hc;")
	public static Class51 aClass51_51;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
	public static int anInt3688;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!hc;")
	public static Class51 aClass51_52;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!ge;")
	public static Class7_Sub1 aClass7_Sub1_2 = null;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
	public static int anInt3686 = 1;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
	public static int anInt3692 = 2;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[B")
	public static byte[] method2742(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub15 local12 = (Class1_Sub2_Sub15) Static129.aClass58_9.method2093((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
				@Pc(45) int local45 = 255 - local38;
				@Pc(50) int local50 = Static205.method3438(local45, local23);
				@Pc(54) byte local54 = local17[local50];
				local17[local50] = local17[local45];
				local17[local45] = local17[511 - local38] = local54;
			}
			local12 = new Class1_Sub2_Sub15(local17);
			Static129.aClass58_9.method2089((long) arg0, local12);
		}
		return local12.aByteArray50;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Lclient!ql;")
	public static Class1_Sub13 method2743() {
		@Pc(8) Class1_Sub13 local8 = new Class1_Sub13(34);
		local8.method1766(11);
		local8.method1766(Static148.anInt398);
		local8.method1766(Static191.aBoolean213 ? 1 : 0);
		local8.method1766(Static3.aBoolean3 ? 1 : 0);
		local8.method1766(Static249.aBoolean270 ? 1 : 0);
		local8.method1766(Static132.aBoolean175 ? 1 : 0);
		local8.method1766(Static109.aBoolean156 ? 1 : 0);
		local8.method1766(Static210.aBoolean226 ? 1 : 0);
		local8.method1766(Static140.aBoolean181 ? 1 : 0);
		local8.method1766(Static19.aBoolean37 ? 1 : 0);
		local8.method1766(anInt3692);
		local8.method1766(Static183.aBoolean263 ? 1 : 0);
		local8.method1766(Static63.aBoolean96 ? 1 : 0);
		local8.method1766(Static174.aBoolean197 ? 1 : 0);
		local8.method1766(Static182.anInt4168);
		local8.method1766(Static69.aBoolean106 ? 1 : 0);
		local8.method1766(Static237.anInt5140);
		local8.method1766(Static106.anInt2847);
		local8.method1766(Static47.anInt1385);
		local8.method1789(Static26.anInt701);
		local8.method1789(Static66.anInt1836);
		local8.method1766(Static163.method2834());
		local8.method1754(Static164.anInt3852);
		local8.method1766(Static57.anInt1587);
		local8.method1766(Static87.aBoolean135 ? 1 : 0);
		local8.method1766(Static138.aBoolean180 ? 1 : 0);
		local8.method1766(Static216.anInt4750);
		local8.method1766(Static25.aBoolean44 ? 1 : 0);
		local8.method1766(Static188.aBoolean205 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
	public static void method2744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub2_Sub18 local13 = Static13.method232(arg0, 5);
		local13.method3810();
		local13.anInt5009 = arg1;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)I")
	public static int method2745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0 + (arg1 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!wb;I)V")
	public static void method2746(@OriginalArg(0) Class1_Sub30 arg0) {
		Static136.method2541(arg0, 200000);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method2748(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(16) int local16 = arg2.indexOf(arg1); local16 != -1; local16 = arg2.indexOf(arg1, local16 + arg0.length())) {
			arg2 = arg2.substring(0, local16) + arg0 + arg2.substring(local16 + arg1.length());
		}
		return arg2;
	}
}
