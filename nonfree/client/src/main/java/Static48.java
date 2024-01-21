import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_14;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "Lclient!kb;")
	public static Class9 aClass9_27;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
	public static int anInt1373 = 0;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
	public static int anInt1375 = 0;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "[I")
	public static int[] anIntArray110 = new int[4000];

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "Lclient!v;")
	public static Class62 aClass62_579 = Static45.method753("Mio");

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!rd;ILclient!ne;)V")
	public static void method780(@OriginalArg(1) Class42_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(3) Class3_Sub11 local3 = new Class3_Sub11();
		local3.anInt2177 = 1;
		local3.aClass42_Sub1_49 = arg0;
		local3.aLong81 = arg1;
		local3.aClass46_4 = arg2;
		@Pc(22) Class24 local22 = Static44.aClass24_37;
		synchronized (Static44.aClass24_37) {
			Static44.aClass24_37.method535(local3);
		}
		Static63.method1511();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method781() {
		aClass9_27 = null;
		aClass3_Sub1_Sub1_Sub1_14 = null;
		aClass62_579 = null;
		anIntArray109 = null;
		anIntArray110 = null;
	}
}
