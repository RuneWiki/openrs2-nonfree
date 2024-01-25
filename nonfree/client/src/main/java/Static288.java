import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "I")
	public static int anInt6150;

	@OriginalMember(owner = "client!kea", name = "l", descriptor = "I")
	public static int anInt6151;

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "Lclient!kea;")
	public static final Class176 aClass176_1 = new Class176();

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "Lclient!kea;")
	public static final Class176 aClass176_2 = new Class176();

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "Lclient!kea;")
	public static final Class176 aClass176_3 = new Class176();

	@OriginalMember(owner = "client!kea", name = "i", descriptor = "Lclient!kea;")
	public static final Class176 aClass176_4 = new Class176();

	@OriginalMember(owner = "client!kea", name = "k", descriptor = "Lclient!pn;")
	public static final Class266 aClass266_5 = new Class266();

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)V")
	public static void method5231(@OriginalArg(0) int arg0) {
		Static50.anInt1857 = arg0;
		@Pc(7) Class169 local7 = Static378.aClass169_18;
		synchronized (Static378.aClass169_18) {
			Static378.aClass169_18.method5009();
		}
		local7 = Static20.aClass169_4;
		synchronized (Static20.aClass169_4) {
			Static20.aClass169_4.method5009();
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!vl;Lclient!vl;I)V")
	public static void method5232(@OriginalArg(0) Class2_Sub6 arg0, @OriginalArg(1) Class2_Sub6 arg1) {
		if (arg1.aClass2_Sub6_65 != null) {
			arg1.method8933();
		}
		arg1.aClass2_Sub6_66 = arg0;
		arg1.aClass2_Sub6_65 = arg0.aClass2_Sub6_65;
		arg1.aClass2_Sub6_65.aClass2_Sub6_66 = arg1;
		arg1.aClass2_Sub6_66.aClass2_Sub6_65 = arg1;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIB)Z")
	public static boolean method5234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static46.method1674(arg1, arg0) & Static408.method6621(arg0, arg1);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(III)Z")
	public static boolean method5235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static46.method1674(arg1, arg0) | (arg0 & 0x60000) != 0 || Static586.method8661(arg0, arg1) || method5234(arg0, arg1);
	}
}
