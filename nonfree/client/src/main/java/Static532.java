import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!uea", name = "y", descriptor = "I")
	public static int anInt8384;

	@OriginalMember(owner = "client!uea", name = "i", descriptor = "F")
	public static float aFloat184 = 0.25F;

	@OriginalMember(owner = "client!uea", name = "x", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_257 = new Class272(36, 6);

	@OriginalMember(owner = "client!uea", name = "z", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_61 = new Class10(8);

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method7027(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub3_Sub7 local15 = Static363.method5457(arg1, 3);
		local15.method839();
		local15.aString24 = arg0;
	}

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "(I)V")
	public static void method7028() {
		@Pc(9) int local9 = Static12.anInt137 * 512 + 256;
		@Pc(15) int local15 = Static41.anInt966 * 512 + 256;
		@Pc(23) int local23 = Static130.method2562(local15, Static209.anInt8182, local9) - Static500.anInt7956;
		if (Static326.anInt5856 < 100) {
			if (local9 > Static421.anInt7061) {
				Static421.anInt7061 += Static326.anInt5856 * (local9 - Static421.anInt7061) / 1000 + Static225.anInt4393;
				if (local9 < Static421.anInt7061) {
					Static421.anInt7061 = local9;
				}
			}
			if (Static421.anInt7061 > local9) {
				Static421.anInt7061 -= Static225.anInt4393 + Static326.anInt5856 * (Static421.anInt7061 - local9) / 1000;
				if (Static421.anInt7061 < local9) {
					Static421.anInt7061 = local9;
				}
			}
			if (local23 > Static545.anInt8633) {
				Static545.anInt8633 += (local23 - Static545.anInt8633) * Static326.anInt5856 / 1000 + Static225.anInt4393;
				if (local23 < Static545.anInt8633) {
					Static545.anInt8633 = local23;
				}
			}
			if (Static545.anInt8633 > local23) {
				Static545.anInt8633 -= Static225.anInt4393 + Static326.anInt5856 * (Static545.anInt8633 - local23) / 1000;
				if (Static545.anInt8633 < local23) {
					Static545.anInt8633 = local23;
				}
			}
			if (local15 > Static233.anInt4431) {
				Static233.anInt4431 += Static225.anInt4393 + Static326.anInt5856 * (local15 - Static233.anInt4431) / 1000;
				if (local15 < Static233.anInt4431) {
					Static233.anInt4431 = local15;
				}
			}
			if (local15 < Static233.anInt4431) {
				Static233.anInt4431 -= Static225.anInt4393 + Static326.anInt5856 * (Static233.anInt4431 - local15) / 1000;
				if (local15 > Static233.anInt4431) {
					Static233.anInt4431 = local15;
				}
			}
		} else {
			Static233.anInt4431 = Static41.anInt966 * 512 + 256;
			Static421.anInt7061 = Static12.anInt137 * 512 + 256;
			Static545.anInt8633 = Static130.method2562(Static233.anInt4431, Static209.anInt8182, Static421.anInt7061) - Static500.anInt7956;
		}
		local9 = Static206.anInt4180 * 512 + 256;
		local15 = Static452.anInt7420 * 512 + 256;
		local23 = Static130.method2562(local15, Static209.anInt8182, local9) - Static21.anInt546;
		@Pc(240) int local240 = local9 - Static421.anInt7061;
		@Pc(245) int local245 = local23 - Static545.anInt8633;
		@Pc(250) int local250 = local15 - Static233.anInt4431;
		@Pc(262) int local262 = (int) Math.sqrt((double) (local240 * local240 + local250 * local250));
		@Pc(273) int local273 = (int) (Math.atan2((double) local245, (double) local262) * 2607.5945876176133D) & 0x3FFF;
		@Pc(284) int local284 = (int) (-2607.5945876176133D * Math.atan2((double) local240, (double) local250)) & 0x3FFF;
		if (local273 < 1024) {
			local273 = 1024;
		}
		if (local273 > 3072) {
			local273 = 3072;
		}
		if (local273 > Static37.anInt878) {
			Static37.anInt878 += Static587.anInt9355 * (local273 - Static37.anInt878 >> 3) / 1000 + Static349.anInt6121 << 3;
			if (Static37.anInt878 > local273) {
				Static37.anInt878 = local273;
			}
		}
		if (local273 < Static37.anInt878) {
			Static37.anInt878 -= Static349.anInt6121 + Static587.anInt9355 * (Static37.anInt878 - local273 >> 3) / 1000 << 3;
			if (Static37.anInt878 < local273) {
				Static37.anInt878 = local273;
			}
		}
		@Pc(355) int local355 = local284 - Static154.anInt3150;
		if (local355 > 8192) {
			local355 -= 16384;
		}
		if (local355 < -8192) {
			local355 += 16384;
		}
		local355 >>= 0x3;
		if (local355 > 0) {
			Static154.anInt3150 += Static587.anInt9355 * local355 / 1000 + Static349.anInt6121 << 3;
			Static154.anInt3150 &= 0x3FFF;
		}
		if (local355 < 0) {
			Static154.anInt3150 -= Static349.anInt6121 + -local355 * Static587.anInt9355 / 1000 << 3;
			Static154.anInt3150 &= 0x3FFF;
		}
		@Pc(415) int local415 = local284 - Static154.anInt3150;
		if (local415 > 8192) {
			local415 -= 16384;
		}
		if (local415 < -8192) {
			local415 += 16384;
		}
		if (local415 < 0 && local355 > 0 || local415 > 0 && local355 < 0) {
			Static154.anInt3150 = local284;
		}
		Static68.anInt4065 = 0;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZILjava/io/File;)V")
	public static void method7030(@OriginalArg(2) File arg0) {
		if (Static534.anObject55 == null) {
			Static416.method5979();
		}
		try {
			@Pc(15) Class local15 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(36) Method local36 = local15.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local36.invoke(Static534.anObject55, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(56) Exception local56) {
			System.out.println("HeapDump error:");
			local56.printStackTrace();
		}
	}
}
