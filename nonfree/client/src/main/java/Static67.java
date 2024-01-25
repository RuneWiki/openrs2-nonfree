import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
	public static int anInt814;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "Lclient!kl;")
	public static final Class211 aClass211_1 = new Class211();

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Z")
	public static boolean method810(@OriginalArg(0) int arg0) {
		if (arg0 == 22 || arg0 == 8 || arg0 == 5 || arg0 == 20 || arg0 == 4 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 19;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V")
	public static void method811(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0 * Static687.aClass6_Sub44_33.aClass7_Sub13_2.method3338() >> 8;
		if (local8 == 0 || arg1 == -1) {
			return;
		}
		if (!Static588.aBoolean698 && Static478.anInt8119 != -1 && Static107.method2044() && !Static110.method2073()) {
			Static664.aClass6_Sub17_Sub4_4 = Static30.method348();
			@Pc(49) Class6_Sub17_Sub4 local49 = Static462.method7026(Static664.aClass6_Sub17_Sub4_4);
			Static638.method8616(local49);
		}
		Static551.method7805(arg1, Static676.aClass223_124, local8);
		Static101.method1969(-1, 255);
		Static588.aBoolean698 = true;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	public static void method816() {
		for (@Pc(6) Class6_Sub2_Sub2 local6 = (Class6_Sub2_Sub2) Static228.aClass82_5.method2071(); local6 != null; local6 = (Class6_Sub2_Sub2) Static228.aClass82_5.method2078()) {
			if (local6.anInt618 > 1) {
				local6.anInt618 = 0;
				Static519.aClass359_58.method8515(((Class6_Sub2_Sub11) local6.aClass82_1.aClass6_Sub2_17.aClass6_Sub2_65).aLong170, local6);
				local6.aClass82_1.method2075();
			}
		}
		Static574.anInt9192 = 0;
		Static539.anInt8776 = 0;
		Static116.aClass340_17.method8129();
		Static548.aClass74_63.method1398();
		Static228.aClass82_5.method2075();
		Static8.method113(Static358.aClass6_Sub2_Sub11_3);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(JLclient!ha;I)V")
	public static void method819(@OriginalArg(0) long arg0, @OriginalArg(1) Class75 arg1) {
		Static518.anInt8550 = Static689.anInt10537;
		Static21.anInt285 = 0;
		Static354.anInt6011 = 0;
		Static689.anInt10537 = 0;
		@Pc(21) long local21 = Static549.method7758();
		for (@Pc(26) Class60_Sub4 local26 = (Class60_Sub4) Static374.aClass385_6.method8778(); local26 != null; local26 = (Class60_Sub4) Static374.aClass385_6.method8773()) {
			if (local26.method4549(arg1, arg0)) {
				Static354.anInt6011++;
			}
		}
		if (Static666.aBoolean760 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static374.aClass385_6.method8780() + ", running: " + Static354.anInt6011);
			System.out.println("Emitters: " + Static21.anInt285 + " Particles: " + Static689.anInt10537 + ". Time taken: " + (Static549.method7758() - local21) + "ms");
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)V")
	public static void method821(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static423.anInt7240 = arg2;
		Static41.anInt544 = 2;
		Static305.aClass260_2 = Static525.aClass260_4;
		Static430.method3630(false, arg1, arg0, false);
	}
}
