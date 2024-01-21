import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
	public static int anInt1703;

	@OriginalMember(owner = "client!fg", name = "V", descriptor = "Lclient!ag;")
	public static Class4 aClass4_47;

	@OriginalMember(owner = "client!fg", name = "Z", descriptor = "[Lclient!dd;")
	public static Class13[] aClass13Array13 = new Class13[100];

	@OriginalMember(owner = "client!fg", name = "ab", descriptor = "Lclient!dd;")
	private static Class13 aClass13_583 = Static161.method2971("Password: ");

	@OriginalMember(owner = "client!fg", name = "cb", descriptor = "Lclient!ld;")
	public static Class47 aClass47_12 = new Class47(50);

	@OriginalMember(owner = "client!fg", name = "lb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_584 = Static161.method2971(" loggt sich aus)3");

	@OriginalMember(owner = "client!fg", name = "nb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_585 = aClass13_583;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[Lclient!fd;)V")
	public static void method1287(@OriginalArg(1) int arg0, @OriginalArg(2) Class20[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class20 local17 = arg1[local11];
			if (local17 != null) {
				if (local17.anInt1619 == 0) {
					if (local17.aClass20Array1 != null) {
						method1287(arg0, local17.aClass20Array1);
					}
					@Pc(38) Class1_Sub22 local38 = (Class1_Sub22) Static18.aClass45_3.method1988((long) local17.anInt1630);
					if (local38 != null) {
						Static73.method1541(local38.anInt3978, arg0);
					}
				}
				@Pc(54) Class1_Sub23 local54;
				if (arg0 == 0 && local17.anObjectArray14 != null) {
					local54 = new Class1_Sub23();
					local54.anObjectArray29 = local17.anObjectArray14;
					local54.aClass20_13 = local17;
					Static1.method43(local54);
				}
				if (arg0 == 1 && local17.anObjectArray11 != null) {
					if (local17.anInt1608 >= 0) {
						@Pc(81) Class20 local81 = Static119.method2230(local17.anInt1630);
						if (local81 == null || local81.aClass20Array1 == null || local17.anInt1608 >= local81.aClass20Array1.length || local17 != local81.aClass20Array1[local17.anInt1608]) {
							continue;
						}
					}
					local54 = new Class1_Sub23();
					local54.anObjectArray29 = local17.anObjectArray11;
					local54.aClass20_13 = local17;
					Static1.method43(local54);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!bg;Z)V")
	public static void method1289(@OriginalArg(0) Class1_Sub2_Sub1_Sub4 arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static73.anIntArray224.length; local5++) {
			Static73.anIntArray224[local5] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) ((double) 256 * 128.0D * Math.random());
			Static73.anIntArray224[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(67) int local67;
		for (local32 = 0; local32 < 20; local32++) {
			for (local55 = 1; local55 < 255; local55++) {
				for (local59 = 1; local59 < 127; local59++) {
					local67 = local59 + (local55 << 7);
					Static35.anIntArray128[local67] = (Static73.anIntArray224[local67 + 128] + Static73.anIntArray224[local67 + 1] + Static73.anIntArray224[local67 - 1] + Static73.anIntArray224[local67 + -128]) / 4;
				}
			}
			@Pc(110) int[] local110 = Static73.anIntArray224;
			Static73.anIntArray224 = Static35.anIntArray128;
			Static35.anIntArray128 = local110;
		}
		if (arg0 == null) {
			return;
		}
		local55 = 0;
		for (local59 = 0; local59 < arg0.anInt512; local59++) {
			for (local67 = 0; local67 < arg0.anInt514; local67++) {
				if (arg0.aByteArray17[local55++] != 0) {
					@Pc(146) int local146 = arg0.anInt516 + local59 + 16;
					@Pc(153) int local153 = arg0.anInt511 + local67 + 16;
					@Pc(159) int local159 = (local146 << 7) + local153;
					Static73.anIntArray224[local159] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V")
	public static void method1290() {
		aClass13_585 = null;
		aClass13_583 = null;
		aClass4_47 = null;
		aClass13_584 = null;
		aClass47_12 = null;
		aClass13Array13 = null;
	}
}
