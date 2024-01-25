import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!km", name = "u", descriptor = "Lclient!f;")
	public static Class10 aClass10_18;

	@OriginalMember(owner = "client!km", name = "A", descriptor = "I")
	public static int anInt5094;

	@OriginalMember(owner = "client!km", name = "o", descriptor = "[Lclient!naa;")
	public static final Class221[] aClass221Array1 = new Class221[8];

	@OriginalMember(owner = "client!km", name = "s", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_91 = new Class319(12, 11);

	@OriginalMember(owner = "client!km", name = "y", descriptor = "I")
	public static int anInt5092 = 0;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
	public static int method4277(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(67) char local67;
			if (local17 == '\u0000') {
				local67 = arg2.charAt(local13++);
			} else {
				local67 = local17;
			}
			@Pc(80) char local80;
			if (local19 == '\u0000') {
				local80 = arg1.charAt(local15++);
			} else {
				local80 = local19;
			}
			local17 = Static262.method4098(local67);
			local19 = Static262.method4098(local80);
			local67 = Static174.method2668(local67, arg0);
			local80 = Static174.method2668(local80, arg0);
			if (local67 != local80 && Character.toUpperCase(local67) != Character.toUpperCase(local80)) {
				local67 = Character.toLowerCase(local67);
				local80 = Character.toLowerCase(local80);
				if (local67 != local80) {
					return Static254.method4032(local67, arg0) - Static254.method4032(local80, arg0);
				}
			}
		}
		@Pc(152) int local152 = Math.min(local8, local11);
		for (@Pc(154) int local154 = 0; local154 < local152; local154++) {
			if (arg0 == 2) {
				local15 = local11 - local154 - 1;
				local13 = local8 - local154 - 1;
			} else {
				local15 = local154;
				local13 = local154;
			}
			@Pc(183) char local183 = arg2.charAt(local13);
			@Pc(187) char local187 = arg1.charAt(local15);
			if (local183 != local187 && Character.toUpperCase(local183) != Character.toUpperCase(local187)) {
				local183 = Character.toLowerCase(local183);
				local187 = Character.toLowerCase(local187);
				if (local183 != local187) {
					return Static254.method4032(local183, arg0) - Static254.method4032(local187, arg0);
				}
			}
		}
		@Pc(232) int local232 = local8 - local11;
		if (local232 != 0) {
			return local232;
		}
		for (@Pc(238) int local238 = 0; local238 < local152; local238++) {
			@Pc(244) char local244 = arg2.charAt(local238);
			@Pc(248) char local248 = arg1.charAt(local238);
			if (local244 != local248) {
				return Static254.method4032(local244, arg0) - Static254.method4032(local248, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public static void method4278() {
		Static28.method2615();
		Static582.aClass36_4 = null;
		Static517.aClass36_3 = null;
		Static174.aClass12_9 = null;
		Static176.aClass278ArrayArray1 = null;
		Static277.aClass36_1 = null;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLclient!gba;)[Lclient!wn;")
	public static Class360[] method4279(@OriginalArg(1) Class114 arg0) {
		if (!arg0.method2505()) {
			return new Class360[0];
		}
		@Pc(16) Class23 local16 = arg0.method2510();
		while (local16.anInt875 == 0) {
			Static423.method5918(10L);
		}
		if (local16.anInt875 == 2) {
			return new Class360[0];
		}
		@Pc(43) int[] local43 = (int[]) local16.anObject1;
		@Pc(49) Class360[] local49 = new Class360[local43.length >> 2];
		for (@Pc(51) int local51 = 0; local51 < local49.length; local51++) {
			@Pc(57) Class360 local57 = new Class360();
			local49[local51] = local57;
			local57.anInt9503 = local43[local51 << 2];
			local57.anInt9501 = local43[(local51 << 2) + 1];
			local57.anInt9499 = local43[(local51 << 2) + 2];
			local57.anInt9500 = local43[(local51 << 2) + 3];
		}
		return local49;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4282(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static67.method1436(Static455.method6387(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IZ)V")
	public static void method4283(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static313.aFloat106 = 3.0F;
		} else if (arg0 == 50) {
			Static313.aFloat106 = 4.0F;
		} else if (arg0 == 75) {
			Static313.aFloat106 = 6.0F;
		} else if (arg0 == 100) {
			Static313.aFloat106 = 8.0F;
		} else if (arg0 == 200) {
			Static313.aFloat106 = 16.0F;
		}
		Static248.anInt4641 = -1;
		Static248.anInt4641 = -1;
	}
}
