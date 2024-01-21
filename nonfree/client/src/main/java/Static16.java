import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Lclient!jc;")
	public static Class40 aClass40_7;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Z")
	public static boolean aBoolean18 = false;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "I")
	public static int anInt633 = 0;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "I")
	public static int anInt647 = 0;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public static void method408() {
		aClass40_7 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIB[Lclient!gg;)Lclient!gg;")
	public static Class28 method411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28[] arg2) {
		@Pc(8) int local8 = 0;
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			if (arg2[local14 + arg0] == null) {
				arg2[local14 + arg0] = Static127.aClass28_1769;
			}
			local8 += arg2[arg0 + local14].anInt1718;
		}
		@Pc(44) int local44 = 0;
		@Pc(47) byte[] local47 = new byte[local8];
		@Pc(57) Class28 local57;
		for (@Pc(49) int local49 = 0; local49 < arg1; local49++) {
			local57 = arg2[local49 + arg0];
			Static184.method1640(local57.aByteArray14, 0, local47, local44, local57.anInt1718);
			local44 += local57.anInt1718;
		}
		local57 = new Class28();
		local57.anInt1718 = local8;
		local57.aByteArray14 = local47;
		return local57;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	public static void method414() {
		try {
			if (Static101.aClass82_2 == null) {
				Static101.aClass82_2 = new Class82(Static76.aClass66_2, Static83.method1481(new Class28[] { Static99.aClass28_1454, Static136.aClass28_1829, Static99.aClass28_1455 }).method1110());
			} else {
				@Pc(12) byte[] local12 = Static101.aClass82_2.method2412();
				if (local12 != null) {
					@Pc(19) Class2_Sub2 local19 = new Class2_Sub2(local12);
					Static9.anInt467 = local19.method1680();
					Static47.aClass31Array3 = new Class31[Static9.anInt467];
					for (@Pc(28) int local28 = 0; local28 < Static9.anInt467; local28++) {
						@Pc(38) Class31 local38 = Static47.aClass31Array3[local28] = new Class31();
						@Pc(42) int local42 = local19.method1680();
						local38.aBoolean91 = (local42 & 0x8000) != 0;
						local38.anInt1795 = local42 & 0x7FFF;
						local38.aClass28_1046 = local19.method1662();
						local38.anInt1798 = local19.method1659();
						local38.anInt1793 = local28;
						local38.anInt1794 = Static153.method2368(local38.aClass28_1046);
					}
					Static41.method739(Static47.aClass31Array3.length - 1, Static160.anIntArray326, Static47.aClass31Array3, Static96.anIntArray229, 0);
					Static101.aClass82_2 = null;
					Static82.aBoolean103 = true;
				}
			}
		} catch (@Pc(124) Exception local124) {
			local124.printStackTrace();
			Static101.aClass82_2 = null;
		}
	}
}
