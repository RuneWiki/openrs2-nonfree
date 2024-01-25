import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!rt", name = "E", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!rt", name = "L", descriptor = "I")
	public static int anInt8719;

	@OriginalMember(owner = "client!rt", name = "J", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[100];

	@OriginalMember(owner = "client!rt", name = "K", descriptor = "Z")
	public static boolean aBoolean616 = false;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "([[[Lclient!dn;I)V")
	public static void method7454(@OriginalArg(0) Class77[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class77[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class77 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass4_Sub1_Sub5_1 instanceof Interface2) {
							((Interface2) local23.aClass4_Sub1_Sub5_1).method7384();
						}
						if (local23.aClass4_Sub1_Sub4_2 instanceof Interface2) {
							((Interface2) local23.aClass4_Sub1_Sub4_2).method7384();
						}
						if (local23.aClass4_Sub1_Sub4_1 instanceof Interface2) {
							((Interface2) local23.aClass4_Sub1_Sub4_1).method7384();
						}
						if (local23.aClass4_Sub1_Sub3_2 instanceof Interface2) {
							((Interface2) local23.aClass4_Sub1_Sub3_2).method7384();
						}
						if (local23.aClass4_Sub1_Sub3_1 instanceof Interface2) {
							((Interface2) local23.aClass4_Sub1_Sub3_1).method7384();
						}
						for (@Pc(73) Class128 local73 = local23.aClass128_1; local73 != null; local73 = local73.aClass128_2) {
							@Pc(78) Class4_Sub1_Sub2 local78 = local73.aClass4_Sub1_Sub2_1;
							if (local78 instanceof Interface2) {
								((Interface2) local78).method7384();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "(B)V")
	public static void method7455() {
		Static41.aClass14_1.method3834();
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			Static7.aLongArray7[local18] = 0L;
		}
		for (@Pc(30) int local30 = 0; local30 < 32; local30++) {
			Static32.aLongArray18[local30] = 0L;
		}
		Static17.anInt778 = 0;
	}
}
