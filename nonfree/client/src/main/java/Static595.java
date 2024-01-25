import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!sl", name = "z", descriptor = "Ljava/lang/Class;")
	private static Class aClass26;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "()V")
	public static void method7679() {
		for (@Pc(1) int local1 = 0; local1 < Static647.aClass405Array1.length; local1++) {
			Static647.aClass405Array1[local1].method9484();
		}
		Static647.aClass405Array1 = null;
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)V")
	public static void method7680() {
		Static694.aClass307_93.method7006();
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V")
	public static void method7681() {
		if (Static122.aClass47_1.aBoolean106) {
			Static7.anInt229 = 96;
			return;
		}
		try {
			@Pc(36) Method local36 = (aClass26 == null ? (aClass26 = Class3_Sub1_Sub29.a("java.lang.Runtime")) : aClass26).getMethod("maxMemory");
			if (local36 != null) {
				try {
					@Pc(40) Runtime local40 = Runtime.getRuntime();
					@Pc(46) Long local46 = (Long) local36.invoke(local40, (Object[]) null);
					Static7.anInt229 = (int) (local46 / 1048576L) + 1;
				} catch (@Pc(56) Throwable local56) {
				}
			}
		} catch (@Pc(58) Exception local58) {
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IJ)V")
	public static void method7682(@OriginalArg(1) long arg0) {
		@Pc(16) int local16 = Static635.anInt9788 + Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694;
		@Pc(21) int local21 = Static331.anInt5334 + Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695;
		if (Static690.anInt10754 - local16 < -2000 || Static690.anInt10754 - local16 > 2000 || Static504.anInt8040 - local21 < -2000 || Static504.anInt8040 - local21 > 2000) {
			Static690.anInt10754 = local16;
			Static504.anInt8040 = local21;
		}
		@Pc(71) int local71;
		@Pc(79) int local79;
		if (Static690.anInt10754 != local16) {
			local71 = local16 - Static690.anInt10754;
			local79 = (int) (arg0 * (long) local71 / 320L);
			if (local71 <= 0) {
				if (local79 == 0) {
					local79 = -1;
				} else if (local71 > local79) {
					local79 = local71;
				}
			} else if (local79 == 0) {
				local79 = 1;
			} else if (local79 > local71) {
				local79 = local71;
			}
			Static690.anInt10754 += local79;
		}
		Static447.aFloat107 += (float) arg0 * Static522.aFloat127 / 6.0F;
		if (local21 != Static504.anInt8040) {
			local71 = local21 - Static504.anInt8040;
			local79 = (int) (arg0 * (long) local71 / 320L);
			if (local71 <= 0) {
				if (local79 == 0) {
					local79 = -1;
				} else if (local79 < local71) {
					local79 = local71;
				}
			} else if (local79 == 0) {
				local79 = 1;
			} else if (local71 < local79) {
				local79 = local71;
			}
			Static504.anInt8040 += local79;
		}
		Static382.aFloat40 += Static150.aFloat57 * (float) arg0 / 6.0F;
		Static651.method8576();
	}
}
