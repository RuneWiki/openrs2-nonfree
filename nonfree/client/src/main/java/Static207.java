import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!jw", name = "Cb", descriptor = "Lclient!oi;")
	public static Class185 aClass185_59;

	@OriginalMember(owner = "client!jw", name = "i", descriptor = "Lclient!kb;")
	public static final Class1_Sub27 aClass1_Sub27_2 = new Class1_Sub27(0, -1);

	@OriginalMember(owner = "client!jw", name = "rb", descriptor = "[B")
	public static final byte[] aByteArray40 = new byte[2048];

	@OriginalMember(owner = "client!jw", name = "xb", descriptor = "Z")
	public static boolean aBoolean358 = true;

	@OriginalMember(owner = "client!jw", name = "Ab", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_50 = new Class142("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(III)Z")
	public static boolean method3007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static391.anInt6296; local1++) {
			@Pc(6) Class254 local6 = Static331.aClass254Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt6679 == 1) {
				local15 = local6.anInt6686 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt6688 + (local6.anInt6672 * local15 >> 8);
					local37 = local6.anInt6677 + (local6.anInt6687 * local15 >> 8);
					local47 = local6.anInt6683 + (local6.anInt6685 * local15 >> 8);
					local57 = local6.anInt6671 + (local6.anInt6678 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6679 == 2) {
				local15 = arg0 - local6.anInt6686;
				if (local15 > 0) {
					local27 = local6.anInt6688 + (local6.anInt6672 * local15 >> 8);
					local37 = local6.anInt6677 + (local6.anInt6687 * local15 >> 8);
					local47 = local6.anInt6683 + (local6.anInt6685 * local15 >> 8);
					local57 = local6.anInt6671 + (local6.anInt6678 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6679 == 3) {
				local15 = local6.anInt6688 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt6686 + (local6.anInt6689 * local15 >> 8);
					local37 = local6.anInt6675 + (local6.anInt6682 * local15 >> 8);
					local47 = local6.anInt6683 + (local6.anInt6685 * local15 >> 8);
					local57 = local6.anInt6671 + (local6.anInt6678 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6679 == 4) {
				local15 = arg2 - local6.anInt6688;
				if (local15 > 0) {
					local27 = local6.anInt6686 + (local6.anInt6689 * local15 >> 8);
					local37 = local6.anInt6675 + (local6.anInt6682 * local15 >> 8);
					local47 = local6.anInt6683 + (local6.anInt6685 * local15 >> 8);
					local57 = local6.anInt6671 + (local6.anInt6678 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6679 == 5) {
				local15 = arg1 - local6.anInt6683;
				if (local15 > 0) {
					local27 = local6.anInt6686 + (local6.anInt6689 * local15 >> 8);
					local37 = local6.anInt6675 + (local6.anInt6682 * local15 >> 8);
					local47 = local6.anInt6688 + (local6.anInt6672 * local15 >> 8);
					local57 = local6.anInt6677 + (local6.anInt6687 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
