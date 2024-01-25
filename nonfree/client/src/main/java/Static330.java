import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!qq", name = "E", descriptor = "[Lclient!uu;")
	public static Class39_Sub2_Sub1_Sub1[] aClass39_Sub2_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZ)V")
	public static void method4637(@OriginalArg(1) boolean arg0) {
		for (@Pc(11) Class1_Sub29 local11 = (Class1_Sub29) Static205.aClass266_32.method6000(); local11 != null; local11 = (Class1_Sub29) Static205.aClass266_32.method5994()) {
			if (local11.aClass1_Sub7_Sub4_3 != null) {
				Static38.aClass1_Sub7_Sub1_1.method3979(local11.aClass1_Sub7_Sub4_3);
				local11.aClass1_Sub7_Sub4_3 = null;
			}
			if (local11.aClass1_Sub7_Sub4_2 != null) {
				Static38.aClass1_Sub7_Sub1_1.method3979(local11.aClass1_Sub7_Sub4_2);
				local11.aClass1_Sub7_Sub4_2 = null;
			}
			local11.method6071();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(56) Class1_Sub29 local56 = (Class1_Sub29) Static14.aClass266_3.method6000(); local56 != null; local56 = (Class1_Sub29) Static14.aClass266_3.method5994()) {
			if (local56.aClass1_Sub7_Sub4_3 != null) {
				Static38.aClass1_Sub7_Sub1_1.method3979(local56.aClass1_Sub7_Sub4_3);
				local56.aClass1_Sub7_Sub4_3 = null;
			}
			local56.method6071();
		}
		for (@Pc(85) Class1_Sub29 local85 = (Class1_Sub29) Static51.aClass27_9.method555(); local85 != null; local85 = (Class1_Sub29) Static51.aClass27_9.method563()) {
			if (local85.aClass1_Sub7_Sub4_3 != null) {
				Static38.aClass1_Sub7_Sub1_1.method3979(local85.aClass1_Sub7_Sub4_3);
				local85.aClass1_Sub7_Sub4_3 = null;
			}
			local85.method6071();
		}
	}

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "(I)V")
	public static void method4638() {
		if (Static273.anInt4878 == -1) {
			return;
		}
		@Pc(11) int local11 = Static16.aClass228_1.method5485();
		@Pc(15) int local15 = Static16.aClass228_1.method5486();
		@Pc(20) Class1_Sub27 local20 = (Class1_Sub27) Static384.aClass266_45.method6000();
		if (local20 != null) {
			local11 = local20.method4581();
			local15 = local20.method4582();
		}
		Static162.method2525(0, 0, Static255.anInt4574, 0, 0, Static207.anInt3842, Static273.anInt4878, local15, local11);
		if (Static139.aClass219_9 != null) {
			Static58.method1058(local11, local15);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILclient!ih;II)V")
	public static void method4639(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub18 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg2 << 28 | arg0 << 14 | arg3);
		@Pc(22) Class1_Sub20 local22 = (Class1_Sub20) Static184.aClass27_23.method553(local16);
		if (local22 == null) {
			local22 = new Class1_Sub20();
			Static184.aClass27_23.method564(local16, local22);
			local22.aClass266_29.method5998(arg1);
			return;
		}
		@Pc(50) Class268 local50 = Static196.aClass139_1.method3228(arg1.anInt3167);
		@Pc(53) int local53 = local50.anInt7787;
		if (local50.anInt7785 == 1) {
			local53 *= arg1.anInt3163 + 1;
		}
		for (@Pc(70) Class1_Sub18 local70 = (Class1_Sub18) local22.aClass266_29.method6000(); local70 != null; local70 = (Class1_Sub18) local22.aClass266_29.method5994()) {
			local50 = Static196.aClass139_1.method3228(local70.anInt3167);
			@Pc(81) int local81 = local50.anInt7787;
			if (local50.anInt7785 == 1) {
				local81 *= local70.anInt3163 + 1;
			}
			if (local53 > local81) {
				Static75.method1282(local70, arg1);
				return;
			}
		}
		local22.aClass266_29.method5998(arg1);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIII)V")
	public static void method4641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg0;
		@Pc(17) int local17 = -arg0;
		@Pc(19) int local19 = -1;
		Static217.method3280(Static59.anIntArrayArray34[arg1], arg2 - arg0, arg3, arg2 + arg0);
		while (local14 > local12) {
			local19 += 2;
			local12++;
			local17 += local19;
			if (local17 >= 0) {
				local14--;
				local17 -= local14 << 1;
				@Pc(59) int[] local59 = Static59.anIntArrayArray34[arg1 + local14];
				@Pc(65) int[] local65 = Static59.anIntArrayArray34[arg1 - local14];
				@Pc(69) int local69 = local12 + arg2;
				@Pc(74) int local74 = arg2 - local12;
				Static217.method3280(local59, local74, arg3, local69);
				Static217.method3280(local65, local74, arg3, local69);
			}
			@Pc(90) int local90 = local14 + arg2;
			@Pc(95) int local95 = arg2 - local14;
			@Pc(101) int[] local101 = Static59.anIntArrayArray34[local12 + arg1];
			@Pc(108) int[] local108 = Static59.anIntArrayArray34[arg1 - local12];
			Static217.method3280(local101, local95, arg3, local90);
			Static217.method3280(local108, local95, arg3, local90);
		}
	}
}
