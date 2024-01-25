import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!kfa", name = "n", descriptor = "F")
	public static float aFloat114;

	@OriginalMember(owner = "client!kfa", name = "s", descriptor = "I")
	public static int anInt5041 = 0;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!kba;I)I")
	public static int method4224(@OriginalArg(0) Class20_Sub2_Sub4_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt4936;
		@Pc(14) Class138 local14 = arg0.method5346();
		if (arg0.aBoolean457) {
			local8 = arg0.anInt4924;
		} else if (local14.anInt3973 == arg0.anInt6454 || local14.anInt3976 == arg0.anInt6454 || local14.anInt3971 == arg0.anInt6454 || local14.anInt3981 == arg0.anInt6454) {
			local8 = arg0.anInt4931;
		} else if (arg0.anInt6454 == local14.anInt3966 || local14.anInt3987 == arg0.anInt6454 || arg0.anInt6454 == local14.anInt4003 || arg0.anInt6454 == local14.anInt4000) {
			local8 = arg0.anInt4919;
		}
		return local8;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZIIIZI)V")
	public static void method4225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (Static479.aClass1_Sub7_Sub1_1.anInt3096 != 0 && arg2 != 0 && Static113.anInt2286 < 50 && arg1 != -1) {
			Static450.aClass177Array1[Static113.anInt2286++] = new Class177((byte) 2, arg1, arg2, arg3, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "(I)V")
	public static void method4226() {
		if (Static136.aClass12_8 == null) {
			return;
		}
		Static312.aClass349_8.method7661();
		Static122.method2098();
		Static233.method3823();
		Static192.method3389();
		Static546.method7407();
		Static276.method4278();
		if (Static498.aClass224_1 != null) {
			Static498.aClass224_1.method5126();
		}
		Static561.method5042();
		Static181.method2770();
		Static1.method43();
		Static530.method7227();
		Static370.method5403(false);
		for (@Pc(37) int local37 = 0; local37 < 2048; local37++) {
			@Pc(43) Class20_Sub2_Sub4_Sub1_Sub1 local43 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local37];
			if (local43 != null) {
				for (@Pc(47) int local47 = 0; local47 < local43.aClass61Array3.length; local47++) {
					local43.aClass61Array3[local47] = null;
				}
			}
		}
		for (@Pc(68) int local68 = 0; local68 < Static491.anInt1754; local68++) {
			@Pc(75) Class20_Sub2_Sub4_Sub1_Sub2 local75 = Static471.aClass1_Sub39Array1[local68].aClass20_Sub2_Sub4_Sub1_Sub2_2;
			if (local75 != null) {
				for (@Pc(79) int local79 = 0; local79 < local75.aClass61Array3.length; local79++) {
					local75.aClass61Array3[local79] = null;
				}
			}
		}
		Static22.aClass209_1 = null;
		Static583.aClass209_6 = null;
		Static136.aClass12_8.method6465();
		Static136.aClass12_8 = null;
	}
}
