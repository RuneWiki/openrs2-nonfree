import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "Lclient!rda;")
	public static Class309 aClass309_3;

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
	public static int anInt4944 = 0;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)I")
	public static int method4404() {
		@Pc(12) Class33 local12 = Static582.aClass33_13;
		@Pc(14) boolean local14 = false;
		if (Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() != 0) {
			@Pc(25) Canvas local25 = new Canvas();
			local25.setSize(100, 100);
			local12 = Static356.method4761((Interface9) null, 0, 0, (Class34) null, local25);
			local14 = true;
		}
		@Pc(42) long local42 = Static429.method5935();
		for (@Pc(44) int local44 = 0; local44 < 10000; local44++) {
			local12.method8067();
		}
		@Pc(72) int local72 = (int) (Static429.method5935() - local42);
		local12.method8103(0, 0, -16777216, 100, 100);
		if (local14) {
			local12.method8070();
		}
		return local72;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([Lclient!tf;I)V")
	public static void method4405(@OriginalArg(0) Class17[] arg0) {
		Static623.anInt9775 = arg0.length;
		Static128.aClass17Array3 = new Class17[Static623.anInt9775 + 10];
		Static2.anIntArray1 = new int[Static623.anInt9775 + 10];
		Static685.method6469(arg0, 0, Static128.aClass17Array3, 0, Static623.anInt9775);
		for (@Pc(30) int local30 = 0; local30 < Static623.anInt9775; local30++) {
			Static2.anIntArray1[local30] = Static128.aClass17Array3[local30].method5251();
		}
		for (@Pc(49) int local49 = Static623.anInt9775; local49 < Static128.aClass17Array3.length; local49++) {
			Static2.anIntArray1[local49] = 12;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
	public static void method4406() {
		if (Static239.aClass207_2.aBoolean398) {
			Static197.anInt5439 = 96;
			return;
		}
		try {
			@Pc(15) Method local15 = Runtime.class.getMethod("maxMemory");
			if (local15 != null) {
				try {
					@Pc(19) Runtime local19 = Runtime.getRuntime();
					@Pc(25) Long local25 = (Long) local15.invoke(local19, (Object[]) null);
					Static197.anInt5439 = (int) (local25 / 1048576L) + 1;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(FIIFIFLclient!fba;IFFB)[B")
	public static byte[] method4407(@OriginalArg(0) float arg0, @OriginalArg(3) float arg1, @OriginalArg(5) float arg2, @OriginalArg(6) Class107 arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static46.method826(0, arg2, arg3, arg0, local15, arg5, arg1, arg4);
		return local15;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZII)V")
	public static void method4409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = Static124.aClass4_Sub20_4.aClass8_Sub22_5.method7414() * arg2 >> 8;
		if (local13 == 0 || arg1 == -1) {
			return;
		}
		if (!Static299.aBoolean350 && Static573.anInt8886 != -1 && Static242.method3573() && !Static121.method2179()) {
			Static399.aClass4_Sub3_Sub4_2 = Static447.method6133();
			@Pc(41) Class4_Sub3_Sub4 local41 = Static182.method2909(Static399.aClass4_Sub3_Sub4_2);
			Static559.method7421(local41);
		}
		Static64.method1419(Static349.aClass34_75, local13, arg1);
		Static201.method3062(-1, 255);
		Static299.aBoolean350 = true;
	}
}
