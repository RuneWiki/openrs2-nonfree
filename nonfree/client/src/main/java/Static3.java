import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "fb", descriptor = "Lclient!qe;")
	public static Class3_Sub19 aClass3_Sub19_1;

	@OriginalMember(owner = "client!ab", name = "jb", descriptor = "Lclient!od;")
	public static Class3_Sub1_Sub4_Sub2_Sub1 aClass3_Sub1_Sub4_Sub2_Sub1_1;

	@OriginalMember(owner = "client!ab", name = "eb", descriptor = "I")
	public static volatile int anInt72 = 0;

	@OriginalMember(owner = "client!ab", name = "tb", descriptor = "I")
	public static int anInt81 = 0;

	@OriginalMember(owner = "client!ab", name = "Vb", descriptor = "Lclient!he;")
	private static Class26 aClass26_62 = Static6.method100("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!ab", name = "Gb", descriptor = "Lclient!he;")
	public static Class26 aClass26_59 = aClass26_62;

	@OriginalMember(owner = "client!ab", name = "Ib", descriptor = "Lclient!he;")
	public static Class26 aClass26_60 = Static6.method100(" x ");

	@OriginalMember(owner = "client!ab", name = "Jb", descriptor = "I")
	public static int anInt89 = 0;

	@OriginalMember(owner = "client!ab", name = "Nb", descriptor = "Lclient!he;")
	public static Class26 aClass26_61 = Static6.method100("");

	@OriginalMember(owner = "client!ab", name = "Pb", descriptor = "I")
	public static int anInt92 = -1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLclient!cb;Lclient!eb;I)V")
	public static void method51(@OriginalArg(1) Class12 arg0, @OriginalArg(2) Class16_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub13 local7 = new Class3_Sub13();
		local7.aLong100 = arg2;
		local7.anInt2070 = 1;
		local7.aClass12_4 = arg0;
		local7.aClass16_Sub1_10 = arg1;
		@Pc(22) Class65 local22 = Static59.aClass65_45;
		synchronized (Static59.aClass65_45) {
			Static59.aClass65_45.method1955(local7);
		}
		Static105.method1950();
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)V")
	public static void method58() {
		aClass3_Sub19_1 = null;
		aClass26_59 = null;
		aClass26_62 = null;
		aClass26_60 = null;
		aClass26_61 = null;
		aClass3_Sub1_Sub4_Sub2_Sub1_1 = null;
	}
}
