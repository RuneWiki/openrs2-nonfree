import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "[B")
	public static final byte[] aByteArray95 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)V")
	public static void method6593(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static494.aString82 = arg2;
		Static179.aString36 = arg1;
		Static294.aBoolean383 = arg0;
		if (!Static294.aBoolean383 && Static312.anInt6059 != 3 && (Static494.aString82.equals("") || Static179.aString36.equals(""))) {
			Static442.method6681(3);
			return;
		}
		Static463.aBoolean590 = false;
		if (Static312.anInt6059 != 1) {
			Static535.anInt9273 = 0;
			Static97.anInt2022 = -1;
		}
		Static442.method6681(-3);
		Static462.anInt8307 = 0;
		Static428.anInt7883 = 1;
		Static498.anInt8761 = 0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Z")
	public static boolean method6594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static414.anInt7559; local1++) {
			@Pc(6) Class324 local6 = Static384.aClass324Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt9476 == 1) {
				local15 = local6.anInt9472 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt9467 + (local6.anInt9475 * local15 >> 8);
					local37 = local6.anInt9479 + (local6.anInt9465 * local15 >> 8);
					local47 = local6.anInt9468 + (local6.anInt9470 * local15 >> 8);
					local57 = local6.anInt9469 + (local6.anInt9471 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt9476 == 2) {
				local15 = arg0 - local6.anInt9472;
				if (local15 > 0) {
					local27 = local6.anInt9467 + (local6.anInt9475 * local15 >> 8);
					local37 = local6.anInt9479 + (local6.anInt9465 * local15 >> 8);
					local47 = local6.anInt9468 + (local6.anInt9470 * local15 >> 8);
					local57 = local6.anInt9469 + (local6.anInt9471 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt9476 == 3) {
				local15 = local6.anInt9467 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt9472 + (local6.anInt9463 * local15 >> 8);
					local37 = local6.anInt9477 + (local6.anInt9462 * local15 >> 8);
					local47 = local6.anInt9468 + (local6.anInt9470 * local15 >> 8);
					local57 = local6.anInt9469 + (local6.anInt9471 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt9476 == 4) {
				local15 = arg2 - local6.anInt9467;
				if (local15 > 0) {
					local27 = local6.anInt9472 + (local6.anInt9463 * local15 >> 8);
					local37 = local6.anInt9477 + (local6.anInt9462 * local15 >> 8);
					local47 = local6.anInt9468 + (local6.anInt9470 * local15 >> 8);
					local57 = local6.anInt9469 + (local6.anInt9471 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt9476 == 5) {
				local15 = arg1 - local6.anInt9468;
				if (local15 > 0) {
					local27 = local6.anInt9472 + (local6.anInt9463 * local15 >> 8);
					local37 = local6.anInt9477 + (local6.anInt9462 * local15 >> 8);
					local47 = local6.anInt9467 + (local6.anInt9475 * local15 >> 8);
					local57 = local6.anInt9479 + (local6.anInt9465 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
