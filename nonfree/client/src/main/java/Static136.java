import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static136 {

	@OriginalMember(owner = "client!gm", name = "D", descriptor = "I")
	public static int anInt2425;

	@OriginalMember(owner = "client!gm", name = "t", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_47 = new Class134("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!gm", name = "x", descriptor = "[S")
	public static final short[] aShortArray9 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!gm", name = "z", descriptor = "Z")
	public static boolean aBoolean159 = true;

	@OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
	public static int anInt2424 = 0;

	@OriginalMember(owner = "client!gm", name = "B", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_81 = new Class102(2, 7);

	@OriginalMember(owner = "client!gm", name = "C", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_48 = new Class134("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)B")
	public static byte method2010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
