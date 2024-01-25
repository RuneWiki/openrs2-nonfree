import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "I")
	public static int anInt232;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aia", name = "f", descriptor = "Ljava/lang/Class;")
	private static Class aClass2;

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "I")
	public static int anInt229 = 0;

	@OriginalMember(owner = "client!aia", name = "g", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_6 = new Class241(15, -1);

	@OriginalMember(owner = "client!aia", name = "e", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_4 = new Class322(118, -2);

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "[Lclient!jba;")
	public static final Class21_Sub1[] aClass21_Sub1Array1 = new Class21_Sub1[37];

	@OriginalMember(owner = "client!aia", name = "h", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "([Lclient!rfa;II)V")
	public static void method207(@OriginalArg(0) Class60_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class60_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9049;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9049 > local27 + (local29 & 0x1)) {
				@Pc(44) Class60_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method207(arg0, arg1, local10 - 1);
		method207(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)Lclient!saa;")
	public static Class321 method208(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static358.aClass321Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(B)V")
	public static void method209() {
		try {
			@Pc(28) Method local28 = (aClass2 == null ? (aClass2 = Class16.a("java.lang.Runtime")) : aClass2).getMethod("availableProcessors");
			if (local28 != null) {
				try {
					@Pc(32) Runtime local32 = Runtime.getRuntime();
					@Pc(38) Integer local38 = (Integer) local28.invoke(local32, (Object[]) null);
					Static573.anInt9174 = local38;
				} catch (@Pc(43) Throwable local43) {
				}
			}
		} catch (@Pc(45) Exception local45) {
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V")
	public static void method210() {
		Static434.anInt7433 = 0;
		Static49.anInt596++;
		Static563.anInt9103 = 0;
		Static110.method2070();
		Static478.method7148();
		Static393.method6033();
		@Pc(30) boolean local30 = false;
		@Pc(40) int local40;
		for (@Pc(32) int local32 = 0; local32 < Static434.anInt7433; local32++) {
			local40 = Static201.anIntArray211[local32];
			@Pc(47) Class6_Sub11 local47 = (Class6_Sub11) Static419.aClass74_45.method1401((long) local40);
			@Pc(50) Class60_Sub1_Sub1_Sub3_Sub2 local50 = local47.aClass60_Sub1_Sub1_Sub3_Sub2_1;
			if (Static49.anInt596 != local50.anInt4866) {
				if (Static484.aBoolean623 && Static323.method5078(local40)) {
					Static90.method8269();
				}
				if (local50.aClass294_1.method7159((byte) -65)) {
					Static85.method1252(local50);
				}
				local50.method4435((Class294) null);
				local30 = true;
				local47.method9051();
			}
		}
		if (local30) {
			Static251.anInt4781 = Static419.aClass74_45.method1400();
			Static419.aClass74_45.method1402(Static216.aClass6_Sub11Array1);
		}
		if (Static525.aClass260_4.anInt7198 != Static525.aClass260_4.aClass6_Sub15_Sub1_2.anInt3174) {
			throw new RuntimeException("gnp1 pos:" + Static525.aClass260_4.aClass6_Sub15_Sub1_2.anInt3174 + " psize:" + Static525.aClass260_4.anInt7198);
		}
		for (local40 = 0; local40 < Static201.anInt4069; local40++) {
			if (Static419.aClass74_45.method1401((long) Static531.anIntArray580[local40]) == null) {
				throw new RuntimeException("gnp2 pos:" + local40 + " size:" + Static201.anInt4069);
			}
		}
		if (Static251.anInt4781 - Static201.anInt4069 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static251.anInt4781 - Static201.anInt4069));
		}
		for (@Pc(214) int local214 = 0; local214 < Static251.anInt4781; local214++) {
			if (Static49.anInt596 != Static216.aClass6_Sub11Array1[local214].aClass60_Sub1_Sub1_Sub3_Sub2_1.anInt4866) {
				throw new RuntimeException("gnp4 uk:" + Static216.aClass6_Sub11Array1[local214].aClass60_Sub1_Sub1_Sub3_Sub2_1.anInt4845);
			}
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!u;Z)Z")
	public static boolean method212(@OriginalArg(0) Class352 arg0) {
		return Static88.aClass352_3 == arg0 || Static452.aClass352_7 == arg0 || Static353.aClass352_6 == arg0 || Static31.aClass352_1 == arg0 || arg0 == Static340.aClass352_5;
	}
}
