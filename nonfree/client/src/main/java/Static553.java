import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!vf", name = "K", descriptor = "Lclient!mn;")
	public static Class227 aClass227_5;

	@OriginalMember(owner = "client!vf", name = "E", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_276 = new Class235(84, 4);

	@OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
	public static int anInt9202 = 0;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V")
	public static void method7538() {
		Class134_Sub2.lb = null;
		Static466.anIntArray618 = null;
		Static345.aBoolean454 = false;
		Static142.anIntArray229 = null;
		Static526.anIntArray671 = null;
		Static339.anIntArray458 = null;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method7539(@OriginalArg(0) Class134 arg0) {
		arg0.da(0, 0, Static130.anInt2566, 350);
		arg0.J(0, 0, Static130.anInt2566, 350, Static299.anInt5150 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static483.anInt8128;
		@Pc(35) int local35;
		if (Static32.anInt511 > 0) {
			local35 = 346 - Static483.anInt8128 - 4;
			@Pc(46) int local46 = local27 * local35 / (local27 + Static32.anInt511 - 1);
			@Pc(48) int local48 = 4;
			if (Static32.anInt511 > 1) {
				local48 = (local35 - local46) * (-Static156.anInt2829 + -1 + Static32.anInt511) / (Static32.anInt511 - 1) + 4;
			}
			arg0.J(Static130.anInt2566 - 16, local48, 12, local46, Static299.anInt5150 << 24 | 0x332277, 2);
			for (@Pc(87) int local87 = Static156.anInt2829; Static156.anInt2829 + local27 > local87 && local87 < Static32.anInt511; local87++) {
				@Pc(96) String[] local96 = Static500.method7455('\b', Static514.aStringArray35[local87]);
				@Pc(105) int local105 = (Static130.anInt2566 - 16 - 8) / local96.length;
				for (@Pc(107) int local107 = 0; local107 < local96.length; local107++) {
					@Pc(116) int local116 = local105 * local107 + 8;
					arg0.da(local116, 0, local105 + local116 - 8, 350);
					Static442.aClass64_12.method6602(-1, Static18.method168(local96[local107]), local116, -16777216, 348 - Static483.anInt8128 * (local87 - Static156.anInt2829) - Static268.aClass334_14.anInt9008 - Static457.anInt7855);
				}
			}
		}
		Static28.aClass64_1.method6618(330, "Build: 618", -16777216, Static130.anInt2566 - 25, -1);
		arg0.da(0, 0, Static130.anInt2566, 350);
		arg0.method6894(350 - Static457.anInt7855, -1, 0, Static130.anInt2566);
		Static418.aClass64_11.method6602(-1, "--> " + Static18.method168(Static356.aString59), 10, -16777216, 349 - Static373.aClass334_13.anInt9008);
		if (!Static161.aBoolean224) {
			return;
		}
		local35 = -1;
		if (Static301.anInt5197 % 30 > 15) {
			local35 = 16777215;
		}
		arg0.method6948(12, Static373.aClass334_13.method7354("--> " + Static18.method168(Static356.aString59).substring(0, Static184.anInt3252)) + 10, 339 - Static373.aClass334_13.anInt9008, local35);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method7541(@OriginalArg(0) Class134 arg0) {
		Static515.aClass110Array1 = new Class110[Static480.anIntArray622.length];
		for (@Pc(11) int local11 = 0; local11 < Static480.anIntArray622.length; local11++) {
			@Pc(25) int local25 = Static480.anIntArray622[local11];
			@Pc(30) Class334 local30 = Static423.method5847(Static267.aClass270_53, local25);
			@Pc(38) Class64 local38 = arg0.method6899(local30, Static601.method2075(Static576.aClass270_119, local25));
			Static515.aClass110Array1[local11] = new Class110(local38, local30);
		}
	}
}
