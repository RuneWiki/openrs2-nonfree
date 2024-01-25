import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "Lclient!uu;")
	public static Class114_Sub1 aClass114_Sub1_21;

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
	public static int anInt10696;

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "Lclient!dc;")
	public static final Class72 aClass72_28 = new Class72();

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "Lclient!wc;")
	public static Class397 aClass397_181 = new Class397(69, 0);

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)V")
	public static void method9078() {
		Static87.aClass286_3.method6633();
		Static461.aClass143_4.method3264();
		Static661.aClass73_1.method1987();
		Static216.aClass53_3.method1524();
		Static255.aClass14_1.method620();
		Static606.aClass62_2.method1885();
		Static592.aClass155_2.method3428();
		Static381.aClass106_2.method2619();
		Static90.aClass98_3.method2479();
		Static266.aClass161_1.method3495();
		Static118.aClass17_1.method654();
		Static368.aClass67_1.method1948();
		Static288.aClass97_1.method2462();
		Static139.aClass68_3.method1959();
		Static47.aClass111_3.method2746();
		Static642.aClass358_1.method8253();
		Static583.aClass150_2.method3386();
		Class3_Sub33_Sub3.lb.method6969();
		Static499.aClass297_1.method6925();
		Static242.aClass205_1.method4783();
		Static608.aClass370_1.method8508();
		Static291.aClass251_1.method5497();
		Static346.aClass295_1.method6909();
		Static502.method6853();
		Static645.method8478();
		Static514.method8588();
		Static518.method6971();
		Static149.method2493();
		Static645.aClass307_88.method6998();
		Static317.aClass307_56.method6998();
		Static157.aClass307_33.method6998();
		Static576.aClass307_94.method6998();
		Static540.aClass307_83.method6998();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIZ)Lclient!nk;")
	public static Class9_Sub6 method9083(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) Class319[] local7 = Class163.aClass319Array1;
		synchronized (Class163.aClass319Array1) {
			@Pc(37) Class9_Sub6 local37;
			if (Class163.aClass319Array1.length <= arg0 || Class163.aClass319Array1[arg0].method7190()) {
				local37 = new Class9_Sub6();
				local37.aClass9_Sub9Array1 = new Class9_Sub9[arg0];
				for (@Pc(59) int local59 = 0; local59 < arg0; local59++) {
					local37.aClass9_Sub9Array1[local59] = new Class9_Sub9();
				}
			} else {
				local37 = (Class9_Sub6) Class163.aClass319Array1[arg0].method7193();
				local37.method9182();
				@Pc(44) int local44 = Static636.anIntArray711[arg0]--;
			}
			local37.aBoolean452 = arg1;
			return local37;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)V")
	public static void method9090(@OriginalArg(1) int arg0) {
		for (@Pc(9) Class3 local9 = Static407.aClass313_32.method7103(); local9 != null; local9 = Static407.aClass313_32.method7110()) {
			if ((long) arg0 == (local9.aLong345 >> 48 & 0xFFFFL)) {
				local9.method9596();
			}
		}
	}
}
