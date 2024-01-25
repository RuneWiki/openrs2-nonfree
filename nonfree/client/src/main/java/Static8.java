import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "Lclient!tc;")
	public static Class232 aClass232_1;

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "Lclient!gp;")
	public static Class1_Sub19 aClass1_Sub19_1;

	@OriginalMember(owner = "client!ah", name = "D", descriptor = "Lclient!kg;")
	public static Class132 aClass132_1;

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "[I")
	public static final int[] anIntArray10 = new int[14];

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "[Lclient!oj;")
	public static final Class177[] aClass177Array1 = new Class177[14];

	@OriginalMember(owner = "client!ah", name = "A", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_2 = new Class119("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
	public static int anInt128 = 0;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method94(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}
}
