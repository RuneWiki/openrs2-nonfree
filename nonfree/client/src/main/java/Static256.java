import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!kp", name = "E", descriptor = "Lclient!ba;")
	public static final Class17 aClass17_21 = new Class17(8);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIILclient!tm;Lclient!tm;)V")
	public static void method4325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class49_Sub3 arg3, @OriginalArg(4) Class49_Sub3 arg4) {
		@Pc(4) Class255 local4 = Static188.method2930(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass49_Sub3_1 = arg3;
			local4.aClass49_Sub3_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!kr;B)V")
	public static void method4326(@OriginalArg(0) Class171 arg0) {
		Static468.anInt7887 = 0;
		Static175.anInt3116 = 0;
		Static214.aClass299_2 = new Class299();
		Static413.aClass72_Sub1_Sub1_Sub1Array2 = new Class72_Sub1_Sub1_Sub1[1024];
		Static487.aClass72_Sub4Array1 = new Class72_Sub4[Static74.anIntArray157[Static69.anInt1331] + 1];
		Static115.anInt2354 = 0;
		Static371.anInt6837 = 0;
		Static117.method1986(arg0);
		Static328.method5050(arg0);
	}
}
