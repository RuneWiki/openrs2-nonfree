import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_182 = Static158.method3034("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Lclient!ob;")
	public static Class60 aClass60_183 = aClass60_182;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_185 = Static158.method3034("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "[Lclient!ob;")
	public static final Class60[] aClass60Array6 = new Class60[200];

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Lclient!bd;")
	public static Class2_Sub1_Sub3 method617(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub1_Sub3 local15 = (Class2_Sub1_Sub3) Static7.aClass89_70.method3437((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static91.aClass13_19.method521(arg0, 1);
		local15 = new Class2_Sub1_Sub3();
		if (local25 != null) {
			local15.method393(new Class2_Sub3(local25), arg0);
		}
		Static7.aClass89_70.method3432(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([BIII)I")
	public static int method619(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(12) int local12 = arg2; local12 < arg1; local12++) {
			local5 = local5 >>> 8 ^ Class70.anIntArray424[(arg0[local12] ^ local5) & 0xFF];
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)Z")
	public static boolean method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!og;)Lclient!df;")
	public static Class4_Sub2 method621(@OriginalArg(1) Class2_Sub3 arg0) {
		return new Class4_Sub2(arg0.method219(), arg0.method219(), arg0.method219(), arg0.method219(), arg0.method239(), arg0.method218());
	}
}
