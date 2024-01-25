import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!k", name = "j", descriptor = "Lclient!tq;")
	public static Class191 aClass191_101;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray13;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "I")
	public static int anInt3272;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Lclient!on;")
	public static Class146 aClass146_10;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_99 = new Class119(260);

	@OriginalMember(owner = "client!k", name = "i", descriptor = "I")
	public static int anInt3271 = 0;

	@OriginalMember(owner = "client!k", name = "n", descriptor = "[I")
	public static final int[] anIntArray277 = new int[4096];

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3042(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BLclient!rd;)V")
	public static void method3043(@OriginalArg(1) Class168 arg0) {
		Static316.anInt6385 = 3;
		Static89.method2054(true);
		Static40.aBoolean79 = true;
		Static228.anInt934 = 0;
		Static326.anInt6624 = 1;
		Static89.aBoolean169 = true;
		Static303.anInt6082 = 127;
		Static21.aBoolean59 = true;
		Static322.anInt6490 = 2;
		Static209.aBoolean435 = true;
		Static148.aBoolean262 = true;
		Static315.aBoolean563 = true;
		Static7.anInt152 = 0;
		Static343.anInt6875 = 0;
		Static234.anInt4499 = 0;
		Static201.aBoolean337 = true;
		Static348.aBoolean606 = true;
		Static103.aBoolean202 = true;
		Static2.anInt65 = 127;
		Static287.anInt5818 = 255;
		Static304.aBoolean545 = true;
		if (Static339.anInt6736 < 96) {
			Static341.method5888(0);
		} else {
			Static341.method5888(2);
		}
		Static84.anInt1828 = 0;
		Static32.aBoolean70 = true;
		Static231.aBoolean537 = true;
		Static114.anInt6585 = 0;
		Static229.aBoolean222 = false;
		Static84.anInt1829 = 2;
		Static234.aBoolean412 = false;
		Static349.anInt6923 = Static161.anInt3262 == 1 ? 2 : 4;
		Static259.aBoolean475 = false;
		Static6.anInt150 = 2;
		@Pc(92) Class130 local92 = null;
		try {
			@Pc(96) Class193 local96 = arg0.method4836();
			while (local96.anInt6293 == 0) {
				Static102.method2276(1L);
			}
			if (local96.anInt6293 == 1) {
				local92 = (Class130) local96.anObject7;
				@Pc(118) byte[] local118 = new byte[(int) local92.method3573()];
				@Pc(133) int local133;
				for (@Pc(120) int local120 = 0; local120 < local118.length; local120 += local133) {
					local133 = local92.method3572(local118.length - local120, local118, local120);
					if (local133 == -1) {
						throw new IOException("EOF");
					}
				}
				Static306.method5412(new Class2_Sub10(local118));
			}
		} catch (@Pc(162) Exception local162) {
		}
		try {
			if (local92 != null) {
				local92.method3574();
			}
		} catch (@Pc(169) Exception local169) {
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IZLjava/lang/String;Z)I")
	public static int method3044(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg1.length();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(43) char local43 = arg1.charAt(local37);
			if (local37 == 0) {
				if (local43 == '-') {
					local28 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(91) int local91;
			if (local43 >= '0' && local43 <= '9') {
				local91 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local91 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local91 = local43 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local91) {
				throw new NumberFormatException();
			}
			if (local28) {
				local91 = -local91;
			}
			@Pc(119) int local119 = local91 + local32 * arg0;
			if (local119 / arg0 != local32) {
				throw new NumberFormatException();
			}
			local30 = true;
			local32 = local119;
		}
		if (!local30) {
			throw new NumberFormatException();
		}
		return local32;
	}
}
