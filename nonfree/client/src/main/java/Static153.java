import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!js", name = "Hb", descriptor = "I")
	public static int anInt2895;

	@OriginalMember(owner = "client!js", name = "Lb", descriptor = "I")
	public static int anInt2899;

	@OriginalMember(owner = "client!js", name = "Eb", descriptor = "Z")
	public static volatile boolean aBoolean190 = true;

	@OriginalMember(owner = "client!js", name = "Mb", descriptor = "I")
	public static int anInt2900 = 0;

	@OriginalMember(owner = "client!js", name = "Nb", descriptor = "[I")
	public static final int[] anIntArray194 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method2455(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) byte local13 = 2;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(21) char local21 = arg0.charAt(local15);
			if (local13 == 0) {
				local21 = Character.toLowerCase(local21);
			} else if (local13 == 2 || Character.isUpperCase(local21)) {
				local21 = Static172.method2815(local21);
			}
			if (Character.isLetter(local21)) {
				local13 = 0;
			} else if (local21 == '.' || local21 == '?' || local21 == '!') {
				local13 = 2;
			} else if (!Character.isSpaceChar(local21)) {
				local13 = 1;
			} else if (local13 != 2) {
				local13 = 1;
			}
			local11[local15] = local21;
		}
		return new String(local11);
	}

	@OriginalMember(owner = "client!js", name = "t", descriptor = "(I)V")
	public static void method2456() {
		for (@Pc(15) Class10_Sub2 local15 = (Class10_Sub2) Static220.aClass210_11.method5608(); local15 != null; local15 = (Class10_Sub2) Static220.aClass210_11.method5615()) {
			local15.method983();
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(III)Z")
	public static boolean method2460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static274.anInt5509; local1++) {
			@Pc(6) Class177 local6 = Static23.aClass177Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt5482 == 1) {
				local15 = local6.anInt5493 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt5495 + (local6.anInt5476 * local15 >> 8);
					local37 = local6.anInt5496 + (local6.anInt5481 * local15 >> 8);
					local47 = local6.anInt5485 + (local6.anInt5489 * local15 >> 8);
					local57 = local6.anInt5494 + (local6.anInt5497 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5482 == 2) {
				local15 = arg0 - local6.anInt5493;
				if (local15 > 0) {
					local27 = local6.anInt5495 + (local6.anInt5476 * local15 >> 8);
					local37 = local6.anInt5496 + (local6.anInt5481 * local15 >> 8);
					local47 = local6.anInt5485 + (local6.anInt5489 * local15 >> 8);
					local57 = local6.anInt5494 + (local6.anInt5497 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5482 == 3) {
				local15 = local6.anInt5495 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt5493 + (local6.anInt5492 * local15 >> 8);
					local37 = local6.anInt5488 + (local6.anInt5483 * local15 >> 8);
					local47 = local6.anInt5485 + (local6.anInt5489 * local15 >> 8);
					local57 = local6.anInt5494 + (local6.anInt5497 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5482 == 4) {
				local15 = arg2 - local6.anInt5495;
				if (local15 > 0) {
					local27 = local6.anInt5493 + (local6.anInt5492 * local15 >> 8);
					local37 = local6.anInt5488 + (local6.anInt5483 * local15 >> 8);
					local47 = local6.anInt5485 + (local6.anInt5489 * local15 >> 8);
					local57 = local6.anInt5494 + (local6.anInt5497 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5482 == 5) {
				local15 = arg1 - local6.anInt5485;
				if (local15 > 0) {
					local27 = local6.anInt5493 + (local6.anInt5492 * local15 >> 8);
					local37 = local6.anInt5488 + (local6.anInt5483 * local15 >> 8);
					local47 = local6.anInt5495 + (local6.anInt5476 * local15 >> 8);
					local57 = local6.anInt5496 + (local6.anInt5481 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!js", name = "v", descriptor = "(I)V")
	public static void method2463() {
		@Pc(1) Class26 local1 = Static193.aClass26_37;
		synchronized (Static193.aClass26_37) {
			Static193.aClass26_37.method328();
		}
	}
}
