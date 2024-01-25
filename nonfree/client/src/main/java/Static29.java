import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "Lclient!za;")
	public static Class75 aClass75_4;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "Lclient!un;")
	public static Class249 aClass249_1;

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
	public static int anInt504 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Lclient!on;")
	public static Class28_Sub5 method474(@OriginalArg(1) int arg0) {
		@Pc(7) Class97[] local7 = Class20.aClass97Array3;
		synchronized (Class20.aClass97Array3) {
			@Pc(29) Class28_Sub5 local29;
			if (Class20.aClass97Array3.length <= arg0 || Class20.aClass97Array3[arg0].method2151()) {
				local29 = new Class28_Sub5();
				local29.aClass28_Sub4Array1 = new Class28_Sub4[arg0];
				for (@Pc(35) int local35 = 0; local35 < arg0; local35++) {
					local29.aClass28_Sub4Array1[local35] = new Class28_Sub4();
				}
			} else {
				local29 = (Class28_Sub5) Class20.aClass97Array3[arg0].method2153();
				local29.method5916();
				@Pc(68) int local68 = Static224.anIntArray346[arg0]--;
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)V")
	public static void method475(@OriginalArg(1) int arg0) {
		if (Static16.anInt5171 == arg0) {
			return;
		}
		Static234.anInt3949 = Static371.anInt6492 = Static39.anIntArray57[arg0];
		Static251.method3486();
		Static51.anIntArrayArray26 = new int[Static234.anInt3949][Static371.anInt6492];
		Static111.anIntArrayArrayArray4 = new int[4][Static234.anInt3949 >> 3][Static371.anInt6492 >> 3];
		Static404.anIntArrayArray61 = new int[Static234.anInt3949][Static371.anInt6492];
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			Static89.aClass225Array2[local44] = Static399.method5600(Static371.anInt6492, Static234.anInt3949);
		}
		Static419.aByteArrayArrayArray17 = new byte[4][Static234.anInt3949][Static371.anInt6492];
		Static121.method1958(Static234.anInt3949, Static371.anInt6492);
		Static381.method5253(Static371.anInt6492 >> 3, Static234.anInt3949 >> 3, Static257.aClass75_8);
		Static16.anInt5171 = arg0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!eo;")
	public static RuntimeException_Sub1 method476(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString12 = local9.aString12 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
