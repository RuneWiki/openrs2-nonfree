import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Lclient!rc;")
	public static final Class279 aClass279_12 = new Class279();

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)Z")
	public static boolean method5664(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class2_Sub5 local10 = (Class2_Sub5) Static375.aClass8_38.method210(); local10 != null; local10 = (Class2_Sub5) Static375.aClass8_38.method218()) {
			if (Static489.method6854(local10.anInt902) && (long) arg0 == local10.aLong30) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method5666(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 == 0) {
			Static307.aClass100_6 = Static448.method6213(Static72.aClass2_Sub12_Sub1_1.anInt1927 * 2, 0, Static391.anInterface5_8, Static471.aCanvas12, Static355.aClass259_114);
			if (arg1 != null) {
				Static307.aClass100_6.ja(0);
				@Pc(25) Class294 local25 = Static437.method6281(Static72.aClass259_33, Static230.anInt4311);
				@Pc(34) Class29 local34 = Static307.aClass100_6.method6225(local25, Static596.method254(Static490.aClass259_153, Static230.anInt4311));
				Static468.method6574();
				Static458.method6493(Static307.aClass100_6, true, local25, local34, arg1);
			}
		} else {
			@Pc(51) Class100 local51 = null;
			@Pc(79) Class29 local79;
			@Pc(70) Class294 local70;
			if (arg1 != null) {
				local51 = Static448.method6213(0, 0, Static391.anInterface5_8, Static471.aCanvas12, Static355.aClass259_114);
				local51.ja(0);
				local70 = Static437.method6281(Static72.aClass259_33, Static230.anInt4311);
				local79 = local51.method6225(local70, Static596.method254(Static490.aClass259_153, Static230.anInt4311));
				Static468.method6574();
				Static458.method6493(local51, true, local70, local79, arg1);
			}
			try {
				Static307.aClass100_6 = Static448.method6213(Static72.aClass2_Sub12_Sub1_1.anInt1927 * 2, arg0, Static391.anInterface5_8, Static471.aCanvas12, Static355.aClass259_114);
				if (arg1 != null) {
					local51.ja(0);
					local70 = Static437.method6281(Static72.aClass259_33, Static230.anInt4311);
					local79 = local51.method6225(local70, Static596.method254(Static490.aClass259_153, Static230.anInt4311));
					Static468.method6574();
					Static458.method6493(local51, true, local70, local79, arg1);
				}
				if (Static307.aClass100_6.method6246()) {
					@Pc(137) boolean local137 = true;
					try {
						local137 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(147) Throwable local147) {
					}
					@Pc(153) Class2_Sub13 local153;
					if (local137) {
						local153 = Static307.aClass100_6.method6234(146800640);
					} else {
						local153 = Static307.aClass100_6.method6234(104857600);
					}
					Static307.aClass100_6.method6223(local153);
				}
			} catch (@Pc(164) Throwable local164) {
				Static307.aClass100_6 = Static448.method6213(0, 0, Static391.anInterface5_8, Static471.aCanvas12, Static355.aClass259_114);
				arg0 = 0;
			}
			if (local51 != null) {
				try {
					local51.method6262();
				} catch (@Pc(181) Throwable local181) {
				}
			}
		}
		Static391.anInt6846 = arg0;
		Static247.method3875();
		Static307.aClass100_6.va(32);
		Static509.aClass68_7 = Static307.aClass100_6.method6258();
		Static46.aClass68_1 = Static307.aClass100_6.method6258();
		Static262.method4041();
		Static307.aClass100_6.method6242(!Static72.aClass2_Sub12_Sub1_1.aBoolean162);
		if (Static307.aClass100_6.method6230()) {
			Static224.method3515(Static72.aClass2_Sub12_Sub1_1.aBoolean168);
		}
		Static203.method3298(Static307.aClass100_6, Static49.anInt1174 >> 3, Static188.anInt3850 >> 3);
		Static6.method168();
		Static335.aBoolean491 = false;
		Static402.aClass289Array1 = null;
		Static545.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
	public static void method5667() {
		if (Static474.aBoolean641) {
			return;
		}
		if (Static72.aClass2_Sub12_Sub1_1.aBoolean151) {
			Static412.aFloat13 = (int) Static412.aFloat13 + 47 & 0xFFFFFFF0;
		} else {
			Static402.aFloat205 += (12.0F - Static402.aFloat205) / 2.0F;
		}
		Static341.aBoolean494 = true;
		Static474.aBoolean641 = true;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(IB)I")
	public static int method5668(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIZIZ)V")
	public static void method5669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if ((arg4 ? Static72.aClass2_Sub12_Sub1_1.anInt1920 : Static72.aClass2_Sub12_Sub1_1.anInt1916) != 0 && arg1 != 0 && Static245.anInt4559 < 50 && arg0 != -1) {
			Static515.aClass351Array1[Static245.anInt4559++] = new Class351((byte) (arg4 ? 3 : 2), arg0, arg1, arg2, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	public static void method5670() {
		Static96.aClass8_12 = new Class8();
	}
}
