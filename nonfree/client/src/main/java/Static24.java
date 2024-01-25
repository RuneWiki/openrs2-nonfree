import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "I")
	public static int anInt587;

	@OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
	public static int anInt593;

	@OriginalMember(owner = "client!ao", name = "G", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_8 = new Class240(85, 1);

	@OriginalMember(owner = "client!ao", name = "K", descriptor = "[[B")
	public static final byte[][] aByteArrayArray1 = new byte[50][];

	@OriginalMember(owner = "client!ao", name = "M", descriptor = "Z")
	public static boolean aBoolean32 = false;

	@OriginalMember(owner = "client!ao", name = "N", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZI)V")
	public static void method561(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static187.anInt3418 != -1) {
				Static223.method3279(Static187.anInt3418);
			}
			for (@Pc(15) Class3_Sub25 local15 = (Class3_Sub25) Static513.aClass333_33.method7490(); local15 != null; local15 = (Class3_Sub25) Static513.aClass333_33.method7487()) {
				if (!local15.method9036()) {
					local15 = (Class3_Sub25) Static513.aClass333_33.method7490();
					if (local15 == null) {
						break;
					}
				}
				Static186.method2905(local15, true, false);
			}
			Static187.anInt3418 = -1;
			Static513.aClass333_33 = new Class333(8);
			Static155.method2484();
			Static187.anInt3418 = Static104.anInt2019;
			Static630.method8507(false);
			Static184.method2885();
			Static250.method3769(Static187.anInt3418);
		}
		Static437.aBoolean506 = false;
		Static330.aString71 = "";
		Static525.aString100 = "";
		Static176.method2777();
		Static530.anInt8325 = -1;
		Static108.method1705(Static452.anInt7275);
		Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 = new Class34_Sub1_Sub1_Sub2_Sub1();
		Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614 = Static98.anInt361 * 512 / 2;
		Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619 = Static438.anInt7120 * 512 / 2;
		Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray529[0] = Static98.anInt361 / 2;
		Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray528[0] = Static438.anInt7120 / 2;
		Static564.anInt9117 = 0;
		Static370.anInt6266 = 0;
		if (Static451.anInt7263 == 2) {
			Static564.anInt9117 = Static362.anInt6197 << 9;
			Static370.anInt6266 = Static178.anInt3269 << 9;
		} else {
			Static29.method628();
		}
		Static451.method6102();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)Z")
	public static boolean method562(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "(B)Z")
	public static boolean method564() {
		try {
			@Pc(12) Class361 local12 = new Class361();
			@Pc(19) byte[] local19 = local12.method8336(Static395.aByteArray57);
			Static484.method6392(local19);
			return true;
		} catch (@Pc(26) Exception local26) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)Z")
	public static boolean method565() {
		return Static221.anInt3831 >= 1;
	}
}
