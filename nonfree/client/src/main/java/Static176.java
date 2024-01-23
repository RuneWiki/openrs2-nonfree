import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
	public static int anInt3693;

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
	public static int anInt3680 = 0;

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1203 = Static186.method3527("Loaded interfaces");

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1200 = aClass50_1203;

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1201 = Static186.method3527("Connection lost)3");

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
	public static int anInt3690 = 128;

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
	public static int anInt3691 = -1;

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1202 = aClass50_1201;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)Lclient!pg;")
	public static Class1_Sub17 method2913() {
		@Pc(8) Class1_Sub17 local8 = new Class1_Sub17(24);
		local8.method2175(2);
		local8.method2175(Static231.anInt4421);
		local8.method2175(Static1.aBoolean1 ? 1 : 0);
		local8.method2175(Static34.aBoolean18 ? 1 : 0);
		local8.method2175(Static24.aBoolean14 ? 1 : 0);
		local8.method2175(Static205.aBoolean196 ? 1 : 0);
		local8.method2175(Static125.aBoolean111 ? 1 : 0);
		local8.method2175(Static74.aBoolean69 ? 1 : 0);
		local8.method2175(Static148.aBoolean130 ? 1 : 0);
		local8.method2175(Static35.aBoolean27 ? 1 : 0);
		local8.method2175(Static214.anInt4250);
		local8.method2175(Static129.aBoolean113 ? 1 : 0);
		local8.method2175(Static70.aBoolean65 ? 1 : 0);
		local8.method2175(Static137.aBoolean119 ? 1 : 0);
		local8.method2175(Static207.anInt4148);
		local8.method2175(Static151.aBoolean134 ? 1 : 0);
		local8.method2175(Static172.anInt3511);
		local8.method2175(Static152.anInt3168);
		local8.method2175(Static146.anInt3076);
		local8.method2151(Static27.anInt541);
		local8.method2151(Static118.anInt2320);
		return local8;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BLclient!pa;)V")
	public static void method2914(@OriginalArg(1) Class86 arg0) {
		anInt3693 = arg0.method3336(Static157.aClass50_1074);
	}
}
