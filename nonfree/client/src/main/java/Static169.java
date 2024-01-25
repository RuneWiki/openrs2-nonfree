import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
	public static int anInt3515;

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "Lclient!wl;")
	public static final Class377 aClass377_6 = new Class377();

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
	public static int anInt3514 = 0;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!rg;B)V")
	public static void method3107(@OriginalArg(0) Class6_Sub40 arg0) {
		@Pc(9) int local9 = arg0.method8587();
		Static343.aClass367Array1 = new Class367[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static343.aClass367Array1[local14] = new Class367();
			Static343.aClass367Array1[local14].anInt10222 = arg0.method8587();
			Static343.aClass367Array1[local14].aString115 = arg0.method8555();
		}
		Static550.anInt9388 = arg0.method8587();
		Static320.anInt6122 = arg0.method8587();
		Static270.anInt5361 = arg0.method8587();
		Static231.aClass51_Sub1Array2 = new Class51_Sub1[Static320.anInt6122 + 1 - Static550.anInt9388];
		for (@Pc(74) int local74 = 0; local74 < Static270.anInt5361; local74++) {
			@Pc(80) int local80 = arg0.method8587();
			@Pc(88) Class51_Sub1 local88 = Static231.aClass51_Sub1Array2[local80] = new Class51_Sub1();
			local88.anInt1509 = arg0.method8604();
			local88.anInt1504 = arg0.method8579();
			local88.anInt1514 = local80 + Static550.anInt9388;
			local88.aString14 = arg0.method8555();
			local88.aString15 = arg0.method8555();
		}
		anInt3515 = arg0.method8579();
		Static224.aBoolean311 = true;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(CB)Z")
	public static boolean method3109(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(32) char[] local32 = Static15.aCharArray9;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(40) char local40 = local32[local34];
				if (arg0 == local40) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIIII)V")
	public static void method3110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 - arg2;
		@Pc(14) int local14 = arg0 - arg4;
		if (local9 == 0) {
			if (local14 != 0) {
				Static636.method8951(arg0, arg2, arg1, arg4);
			}
		} else if (local14 == 0) {
			Static638.method8957(arg4, arg3, arg2, arg1);
		} else {
			@Pc(56) int local56 = (local14 << 12) / local9;
			@Pc(65) int local65 = arg4 - (arg2 * local56 >> 12);
			@Pc(79) int local79;
			@Pc(77) int local77;
			if (Static347.anInt6542 > arg2) {
				local77 = local65 + (local56 * Static347.anInt6542 >> 12);
				local79 = Static347.anInt6542;
			} else if (arg2 <= Static553.anInt9425) {
				local77 = arg4;
				local79 = arg2;
			} else {
				local77 = (Static553.anInt9425 * local56 >> 12) + local65;
				local79 = Static553.anInt9425;
			}
			@Pc(117) int local117;
			@Pc(115) int local115;
			if (Static347.anInt6542 > arg3) {
				local117 = Static347.anInt6542;
				local115 = (local56 * Static347.anInt6542 >> 12) + local65;
			} else if (Static553.anInt9425 >= arg3) {
				local115 = arg0;
				local117 = arg3;
			} else {
				local115 = local65 + (Static553.anInt9425 * local56 >> 12);
				local117 = Static553.anInt9425;
			}
			if (Static100.anInt10042 > local77) {
				local79 = (Static100.anInt10042 - local65 << 12) / local56;
				local77 = Static100.anInt10042;
			} else if (Static567.anInt9578 < local77) {
				local79 = (Static567.anInt9578 - local65 << 12) / local56;
				local77 = Static567.anInt9578;
			}
			if (Static100.anInt10042 > local115) {
				local117 = (Static100.anInt10042 - local65 << 12) / local56;
				local115 = Static100.anInt10042;
			} else if (local115 > Static567.anInt9578) {
				local117 = (Static567.anInt9578 - local65 << 12) / local56;
				local115 = Static567.anInt9578;
			}
			Static492.method7385(local79, local77, local117, local115, arg1);
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/io/File;I)[B")
	public static byte[] method3112(@OriginalArg(0) File arg0) {
		return Static262.method4658(arg0, (int) arg0.length());
	}
}
