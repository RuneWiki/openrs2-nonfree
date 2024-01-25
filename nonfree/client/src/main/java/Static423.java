import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static423 {

	@OriginalMember(owner = "client!vl", name = "w", descriptor = "[[B")
	public static byte[][] aByteArrayArray64;

	@OriginalMember(owner = "client!vl", name = "z", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar42 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
	public static int anInt7418 = -1;

	@OriginalMember(owner = "client!vl", name = "D", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_166 = new Class209("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!vl", name = "E", descriptor = "Lclient!al;")
	public static final Class10 aClass10_43 = new Class10("stellardawn", 1);

	@OriginalMember(owner = "client!vl", name = "F", descriptor = "[B")
	public static final byte[] aByteArray136 = new byte[520];

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
	public static void method5843(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static440.aClass106ArrayArrayArray3 = Static79.aClass106ArrayArrayArray1;
			Static58.aClass64Array1 = Static440.aClass64Array3;
		} else {
			Static440.aClass106ArrayArrayArray3 = Static195.aClass106ArrayArrayArray2;
			Static58.aClass64Array1 = Static263.aClass64Array2;
		}
		Static254.anInt4782 = Static440.aClass106ArrayArrayArray3.length;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)I")
	public static int method5844(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)I")
	public static int method5846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static74.aByteArrayArray12 == null ? 0 : (Static74.aByteArrayArray12[arg0][arg1] & 0xFF) << 3;
	}
}
