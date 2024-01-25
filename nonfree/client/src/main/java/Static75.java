import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!dt", name = "w", descriptor = "Lclient!qi;")
	public static Class207 aClass207_1;

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
	public static int anInt1851 = 0;

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[200];

	@OriginalMember(owner = "client!dt", name = "t", descriptor = "I")
	public static int anInt1854 = 0;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!bt;I)V")
	public static void method1638(@OriginalArg(0) Class30_Sub1 arg0) {
		@Pc(12) byte[] local12;
		if (Static375.anObject10 == null) {
			@Pc(5) Class42_Sub2_Sub1 local5 = new Class42_Sub2_Sub1();
			local12 = local5.method4158();
			Static375.anObject10 = Static445.method6066(local12);
		}
		if (Static257.anObject5 == null) {
			@Pc(27) Class42_Sub1_Sub1 local27 = new Class42_Sub1_Sub1();
			local12 = local27.method1202();
			Static257.anObject5 = Static445.method6066(local12);
		}
		@Pc(44) Class146 local44 = arg0.aClass146_1;
		if (local44.method3827() && Static298.anObject8 == null) {
			local12 = Static381.method5398(16.0F, 0.6F, new Class66_Sub1(419684), 0.5F, 4.0F, 4.0F);
			Static298.anObject8 = Static445.method6066(local12);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1639(@OriginalArg(1) String arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static143.aStringArray14.length; local5++) {
			if (Static143.aStringArray14[local5].equalsIgnoreCase(arg0)) {
				return local5;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBLclient!wn;)V")
	public static void method1640(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		if (Static103.aClass159_1 == null) {
			return;
		}
		try {
			Static103.aClass159_1.method4067(0L);
			Static103.aClass159_1.method4066(arg0, 24, arg1.aByteArray77);
		} catch (@Pc(18) Exception local18) {
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method1641(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static401.anInt7085; local16++) {
			if (arg0.equalsIgnoreCase(Static146.aStringArray15[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static253.aStringArray23[local16])) {
				return true;
			}
		}
		return false;
	}
}
