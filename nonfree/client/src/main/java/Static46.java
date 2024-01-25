import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
	public static int anInt608;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "Z")
	public static boolean aBoolean79 = false;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
	public static void method598() {
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub12_2);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub12_1);
		Static650.aClass2_Sub30_29.method2988(2, Static650.aClass2_Sub30_29.aClass11_Sub27_2);
		Static650.aClass2_Sub30_29.method2988(2, Static650.aClass2_Sub30_29.aClass11_Sub27_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub25_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub10_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub24_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub1_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub21_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub4_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub16_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub29_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub26_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub7_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub18_2);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub18_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub19_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub13_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub23_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub17_1);
		Static334.method4628();
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub14_1);
		Static650.aClass2_Sub30_29.method2988(3, Static650.aClass2_Sub30_29.aClass11_Sub9_1);
		Static593.method8176();
		Static408.method6014();
		Static30.aBoolean64 = true;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!et;)Lclient!wca;")
	public static Class321 method601(@OriginalArg(1) Class2_Sub20 arg0) {
		@Pc(7) int local7 = arg0.method8575();
		@Pc(21) Class18 local21 = Static562.method7826()[arg0.method8581(-17416)];
		@Pc(28) Class239 local28 = Static505.method7161()[arg0.method8581(-17416)];
		@Pc(32) int local32 = arg0.method8598();
		@Pc(38) int local38 = arg0.method8598();
		return new Class321(local7, local21, local28, local32, local38);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BII)Z")
	public static boolean method603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
