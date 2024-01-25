import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
	public static int anInt2733 = -60;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "J")
	public static long aLong81 = 0L;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)V")
	public static void method2633() {
		@Pc(5) Class119 local5 = Static162.aClass119_99;
		synchronized (Static162.aClass119_99) {
			Static162.aClass119_99.method3315(5);
		}
		local5 = Static217.aClass119_128;
		synchronized (Static217.aClass119_128) {
			Static217.aClass119_128.method3315(5);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIILclient!rd;)Ljava/awt/Frame;")
	public static Frame method2634(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class168 arg3) {
		if (!arg3.method4846()) {
			return null;
		}
		@Pc(20) Class106[] local20 = Static37.method857(arg3);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (local20[local28].anInt3264 == arg0 && local20[local28].anInt3267 == arg1 && (!local26 || local20[local28].anInt3266 > arg2)) {
				arg2 = local20[local28].anInt3266;
				local26 = true;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(85) Class193 local85 = arg3.method4841(arg0, arg2, arg1);
		while (local85.anInt6293 == 0) {
			Static102.method2276(10L);
		}
		@Pc(97) Frame local97 = (Frame) local85.anObject7;
		if (local97 == null) {
			return null;
		} else if (local85.anInt6293 == 2) {
			Static139.method2759(local97, arg3);
			return null;
		} else {
			return local97;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method2635() {
		while (true) {
			if (Static269.aClass2_Sub10_Sub1_3.method2046(Static71.anInt1574) >= 27) {
				@Pc(16) int local16 = Static269.aClass2_Sub10_Sub1_3.method2052(15);
				if (local16 != 32767) {
					@Pc(23) boolean local23 = false;
					if (Static37.aClass62_Sub1_Sub2_Sub1Array1[local16] == null) {
						Static37.aClass62_Sub1_Sub2_Sub1Array1[local16] = new Class62_Sub1_Sub2_Sub1();
						Static37.aClass62_Sub1_Sub2_Sub1Array1[local16].anInt5328 = local16;
						local23 = true;
					}
					@Pc(44) Class62_Sub1_Sub2_Sub1 local44 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local16];
					Static98.anIntArray215[Static169.anInt3463++] = local16;
					local44.anInt5333 = Static212.anInt4090;
					if (local44.aClass186_1 != null && local44.aClass186_1.method5203()) {
						Static18.method667(local44);
					}
					@Pc(77) int local77 = Static269.aClass2_Sub10_Sub1_3.method2052(3) + 4 << 11 & 0x3D68;
					@Pc(82) int local82 = Static269.aClass2_Sub10_Sub1_3.method2052(1);
					if (local82 == 1) {
						Static102.anIntArray217[Static95.anInt6378++] = local16;
					}
					@Pc(100) int local100 = Static269.aClass2_Sub10_Sub1_3.method2052(5);
					if (local100 > 15) {
						local100 -= 32;
					}
					@Pc(111) int local111 = Static269.aClass2_Sub10_Sub1_3.method2052(5);
					if (local111 > 15) {
						local111 -= 32;
					}
					@Pc(120) int local120 = Static269.aClass2_Sub10_Sub1_3.method2052(1);
					local44.method4723(Static83.method1900(Static269.aClass2_Sub10_Sub1_3.method2052(14)));
					local44.method4782(local44.aClass186_1.anInt5977);
					local44.anInt5294 = local44.aClass186_1.anInt5947 << 3;
					if (local44.anInt5294 == 0) {
						local44.method4783(0);
					} else if (local23) {
						local44.method4783(local77);
					}
					local44.method4771(Static182.anInt3603, local44.method4777(), local100 + Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], local111 + Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local120 == 1);
					if (local44.aClass186_1.method5203()) {
						Static52.method1200(local44, Static182.anInt3603, null, 0, local44.anIntArray396[0], null, local44.anIntArray397[0]);
					}
					continue;
				}
			}
			Static269.aClass2_Sub10_Sub1_3.method2051();
			return;
		}
	}
}
