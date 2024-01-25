import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "Lclient!dc;")
	public static Class45 aClass45_3;

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "[Lclient!aq;")
	public static Class5[] aClass5Array18;

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_231 = new Class221("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_198 = new Class41(71, 18);

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
	public static int anInt6526 = 0;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	public static void method5586() {
		Static307.aClass100_1 = new Class100(8);
		Static99.anInt1955 = 0;
		for (@Pc(17) Class22_Sub6 local17 = (Class22_Sub6) Static35.aClass56_1.method1259(); local17 != null; local17 = (Class22_Sub6) Static35.aClass56_1.method1254()) {
			local17.method3557();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IBI)I")
	public static int method5591(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = local12 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local12;
	}
}
