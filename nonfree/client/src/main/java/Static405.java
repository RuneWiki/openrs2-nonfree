import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!um", name = "e", descriptor = "Lclient!cb;")
	public static Class4_Sub6 aClass4_Sub6_2 = null;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public static void method5342() {
		Static86.aClass69_60.method1600();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!m;I)Lclient!qa;")
	public static Class30 method5343(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface10 arg2) {
		return new Class30_Sub2(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
	public static void method5344() {
		@Pc(5) Class69 local5 = Static67.aClass69_13;
		synchronized (Static67.aClass69_13) {
			Static67.aClass69_13.method1593();
		}
		local5 = Static51.aClass69_11;
		synchronized (Static51.aClass69_11) {
			Static51.aClass69_11.method1593();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "([BB)Lclient!ci;")
	public static Class4_Sub1_Sub4 method5346(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class4_Sub1_Sub4 local9 = new Class4_Sub1_Sub4();
		@Pc(14) Class4_Sub30 local14 = new Class4_Sub30(arg0);
		local14.anInt6244 = local14.aByteArray79.length - 2;
		@Pc(34) int local34 = local14.method4877();
		@Pc(45) int local45 = local14.aByteArray79.length - local34 - 2 - 12;
		local14.anInt6244 = local45;
		@Pc(52) int local52 = local14.method4872();
		local9.anInt1386 = local14.method4877();
		local9.anInt1384 = local14.method4877();
		local9.anInt1383 = local14.method4877();
		local9.anInt1385 = local14.method4877();
		@Pc(76) int local76 = local14.method4864();
		@Pc(84) int local84;
		@Pc(90) int local90;
		if (local76 > 0) {
			local9.aClass196Array1 = new Class196[local76];
			for (local84 = 0; local84 < local76; local84++) {
				local90 = local14.method4877();
				@Pc(97) Class196 local97 = new Class196(Static183.method2711(local90));
				local9.aClass196Array1[local84] = local97;
				while (local90-- > 0) {
					@Pc(108) int local108 = local14.method4872();
					@Pc(112) int local112 = local14.method4872();
					local97.method4474((long) local108, new Class4_Sub15(local112));
				}
			}
		}
		local14.anInt6244 = 0;
		local9.aString17 = local14.method4836();
		local9.anIntArray86 = new int[local52];
		local9.aStringArray7 = new String[local52];
		local9.anIntArray88 = new int[local52];
		local84 = 0;
		while (local45 > local14.anInt6244) {
			local90 = local14.method4877();
			if (local90 == 3) {
				local9.aStringArray7[local84] = local14.method4867().intern();
			} else if (local90 >= 100 || local90 == 21 || local90 == 38 || local90 == 39) {
				local9.anIntArray88[local84] = local14.method4864();
			} else {
				local9.anIntArray88[local84] = local14.method4872();
			}
			local9.anIntArray86[local84++] = local90;
		}
		return local9;
	}
}
