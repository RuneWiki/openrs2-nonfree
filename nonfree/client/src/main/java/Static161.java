import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!iq", name = "U", descriptor = "J")
	public static long aLong90;

	@OriginalMember(owner = "client!iq", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString26;

	@OriginalMember(owner = "client!iq", name = "Q", descriptor = "Lclient!o;")
	public static final Class169 aClass169_149 = new Class169("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!iq", name = "S", descriptor = "Lclient!sl;")
	public static final Class213 aClass213_12 = new Class213("", 14);

	@OriginalMember(owner = "client!iq", name = "T", descriptor = "Lclient!o;")
	public static final Class169 aClass169_150 = new Class169("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!fn;I)V")
	public static void method2395(@OriginalArg(0) Class1_Sub14 arg0) {
		if (Static25.aClass132ArrayArrayArray1 == null) {
			return;
		}
		@Pc(8) Interface6 local8 = null;
		if (arg0.anInt1826 == 0) {
			local8 = (Interface6) Static186.method2676(arg0.anInt1833, arg0.anInt1831, arg0.anInt1823);
		}
		if (arg0.anInt1826 == 1) {
			local8 = (Interface6) Static153.method2323(arg0.anInt1833, arg0.anInt1831, arg0.anInt1823);
		}
		if (arg0.anInt1826 == 2) {
			local8 = (Interface6) Static67.method1123(arg0.anInt1833, arg0.anInt1831, arg0.anInt1823, ki.class);
		}
		if (arg0.anInt1826 == 3) {
			local8 = (Interface6) Static91.method1355(arg0.anInt1833, arg0.anInt1831, arg0.anInt1823);
		}
		if (local8 == null) {
			arg0.anInt1824 = 0;
			arg0.anInt1837 = -1;
			arg0.anInt1827 = 0;
		} else {
			arg0.anInt1837 = local8.method5250();
			arg0.anInt1827 = local8.method5246();
			arg0.anInt1824 = local8.method5251();
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)V")
	public static void method2397() {
		if (Static385.aBoolean579) {
			return;
		}
		Static355.method3867(Static66.aClass132ArrayArrayArray2);
		if (Static329.aClass132ArrayArrayArray4 != null) {
			Static355.method3867(Static329.aClass132ArrayArrayArray4);
		}
		Static385.aBoolean579 = true;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIBII)V")
	public static void method2398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = Static140.method5231(arg2, Static264.anInt4589, Static194.anInt3448);
		@Pc(19) int local19 = Static140.method5231(arg1, Static264.anInt4589, Static194.anInt3448);
		@Pc(25) int local25 = Static140.method5231(arg3, Static98.anInt1774, Static372.anInt1561);
		@Pc(36) int local36 = Static140.method5231(arg4, Static98.anInt1774, Static372.anInt1561);
		for (@Pc(38) int local38 = local13; local38 <= local19; local38++) {
			Static382.method5419(Static369.anIntArrayArray35[local38], local25, local36, arg0);
		}
	}
}
