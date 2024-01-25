import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!sg", name = "O", descriptor = "Lclient!wq;")
	public static Class45_Sub1 aClass45_Sub1_1;

	@OriginalMember(owner = "client!sg", name = "J", descriptor = "Lclient!qca;")
	public static final Class271 aClass271_11 = new Class271(9, 0, 4, 1);

	@OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
	public static int anInt8629 = 0;

	@OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
	public static int anInt8630 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method7239(@OriginalArg(0) String arg0) {
		return Static88.method5861(arg0);
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)Ljava/lang/String;")
	public static String method7240() {
		@Pc(5) String local5 = "www";
		if (Static81.aClass86_4 == Static267.aClass86_7) {
			local5 = "www-wtrc";
		} else if (Static267.aClass86_7 == Static20.aClass86_1) {
			local5 = "www-wtqa";
		} else if (Static267.aClass86_7 == Static567.aClass86_9) {
			local5 = "www-wtwip";
		}
		@Pc(32) String local32 = "";
		if (Static538.aString82 != null) {
			local32 = "/p=" + Static538.aString82;
		}
		return "http://" + local5 + "." + Static499.aClass63_15.aString19 + ".com/l=" + Static377.anInt6756 + "/a=" + Static619.anInt10076 + local32 + "/";
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(JJ)J")
	public static long method7241(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!bba;Z)V")
	public static void method7242(@OriginalArg(0) Class11_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort95; local2 <= arg0.aShort96; local2++) {
			for (@Pc(6) int local6 = arg0.aShort97; local6 <= arg0.aShort94; local6++) {
				@Pc(16) Class217 local16 = Static440.aClass217ArrayArrayArray3[arg0.aByte124][local2][local6];
				if (local16 != null) {
					@Pc(21) Class61 local21 = local16.aClass61_2;
					@Pc(23) Class61 local23 = null;
					while (local21 != null) {
						if (local21.aClass11_Sub1_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass61_2 = local21.aClass61_1;
							} else {
								local23.aClass61_1 = local21.aClass61_1;
							}
							local21.method1456();
							break;
						}
						local23 = local21;
						local21 = local21.aClass61_1;
					}
				}
			}
		}
		if (!arg1) {
			Static395.method2904(arg0);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BIIIZILclient!eq;)V")
	public static void method7244(@OriginalArg(3) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class97 arg2) {
		Static43.anInt969 = 2;
		Static192.aClass97_53 = arg2;
		Static189.aClass2_Sub2_Sub1_1 = null;
		Static14.anInt259 = 0;
		Static119.anInt2867 = arg1;
		Static629.anInt10135 = arg0;
		Static158.anInt3597 = 1;
		Static493.aBoolean629 = false;
	}
}
