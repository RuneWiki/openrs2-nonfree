import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!sg", name = "z", descriptor = "Lclient!n;")
	public static Interface12 anInterface12_16;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_81 = new Class243(78, 1);

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
	public static final int anInt7965 = 1406;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "Z")
	public static boolean aBoolean587 = false;

	@OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
	public static int anInt7972 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
	public static void method6681() {
		@Pc(10) int local10 = 0;
		if (Static281.aClass2_Sub19_Sub1_1.method2134(Static266.anInt4923)) {
			local10 = 55;
		}
		if (!Static281.aClass2_Sub19_Sub1_1.aBoolean179) {
			local10 |= 0x40;
		}
		Static91.method1699(local10);
		Static505.aClass206_4.method5327(local10);
		Static464.aClass115_1.method2973(local10);
		Static21.aClass255_2.method6585(local10);
		Static305.aClass14_1.method554(local10);
		Static86.method1676(local10);
		Static329.method3406(local10);
		Static342.method5378(local10);
		Static509.method7450(local10);
		Static410.method6418();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ih;IIII)V")
	public static void method6683(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) Class2_Sub46 local14 = (Class2_Sub46) Static160.aClass249_18.method6527(); local14 != null; local14 = (Class2_Sub46) Static160.aClass249_18.method6525()) {
			if (arg1 == local14.anInt8978 && local14.anInt8984 == arg3 << 7 && arg2 << 7 == local14.anInt8990 && local14.aClass129_1.anInt3646 == arg0.anInt3646) {
				if (local14.aClass2_Sub12_Sub3_4 != null) {
					Static288.aClass2_Sub12_Sub2_5.method2088(local14.aClass2_Sub12_Sub3_4);
					local14.aClass2_Sub12_Sub3_4 = null;
				}
				if (local14.aClass2_Sub12_Sub3_3 != null) {
					Static288.aClass2_Sub12_Sub2_5.method2088(local14.aClass2_Sub12_Sub3_3);
					local14.aClass2_Sub12_Sub3_3 = null;
				}
				local14.method7802();
				return;
			}
		}
	}
}
