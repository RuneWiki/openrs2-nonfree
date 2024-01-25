import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!taa", name = "i", descriptor = "I")
	public static int anInt8920;

	@OriginalMember(owner = "client!taa", name = "g", descriptor = "Lclient!ko;")
	public static final Class208 aClass208_9 = new Class208("", 12);

	@OriginalMember(owner = "client!taa", name = "e", descriptor = "I")
	public static int anInt8921 = 0;

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString101 = null;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(III)I")
	public static int method7648(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static87.method1378(arg1 - 1, arg0 - 1) + Static87.method1378(arg1 + 1, arg0 + -1) + Static87.method1378(arg1 + -1, arg0 + 1) + Static87.method1378(arg1 + 1, arg0 - -1);
		@Pc(70) int local70 = Static87.method1378(arg1 - 1, arg0) + Static87.method1378(arg1 + 1, arg0) + Static87.method1378(arg1, arg0 - 1) + Static87.method1378(arg1, arg0 + 1);
		@Pc(75) int local75 = Static87.method1378(arg1, arg0);
		return local41 / 16 + local70 / 8 + local75 / 4;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)I")
	public static int method7650() {
		return Static54.anIntArray64 == null ? 0 : Static54.anIntArray64.length * 2;
	}
}
