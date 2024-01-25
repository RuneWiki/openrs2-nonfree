import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
	public static int anInt2767;

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
	public static int anInt2769;

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "Z")
	public static boolean aBoolean191 = false;

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
	public static void method2223() {
		try {
			@Pc(20) Method local20 = Runtime.class.getMethod("availableProcessors");
			if (local20 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Integer local30 = (Integer) local20.invoke(local24, (Object[]) null);
					Static205.anInt4226 = local30;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)I")
	public static int method2224(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local8 > local13 - local22 || local15 - local24 < local11) {
			if (local13 - local22 >= local8) {
				return -1;
			}
			if (local15 - local24 >= local11) {
				return 1;
			}
			@Pc(74) char local74;
			if (local22 == '\u0000') {
				local74 = arg2.charAt(local13++);
			} else {
				local74 = local22;
			}
			@Pc(90) char local90;
			if (local24 == '\u0000') {
				local90 = arg1.charAt(local15++);
			} else {
				local90 = local24;
			}
			local22 = Static227.method4133(local74);
			local24 = Static227.method4133(local90);
			local74 = Static144.method2628(local74, arg0);
			local90 = Static144.method2628(local90, arg0);
			if (local90 != local74 && Character.toUpperCase(local74) != Character.toUpperCase(local90)) {
				local74 = Character.toLowerCase(local74);
				local90 = Character.toLowerCase(local90);
				if (local90 != local74) {
					return Static94.method1602(local74, arg0) - Static94.method1602(local90, arg0);
				}
			}
		}
		@Pc(152) int local152 = Math.min(local8, local11);
		for (@Pc(154) int local154 = 0; local154 < local152; local154++) {
			if (arg0 == 2) {
				local13 = local8 - local154 - 1;
				local15 = local11 - local154 - 1;
			} else {
				local15 = local154;
				local13 = local154;
			}
			@Pc(184) char local184 = arg2.charAt(local13);
			@Pc(188) char local188 = arg1.charAt(local15);
			if (local188 != local184 && Character.toUpperCase(local184) != Character.toUpperCase(local188)) {
				local184 = Character.toLowerCase(local184);
				local188 = Character.toLowerCase(local188);
				if (local184 != local188) {
					return Static94.method1602(local184, arg0) - Static94.method1602(local188, arg0);
				}
			}
		}
		@Pc(224) int local224 = local8 - local11;
		if (local224 != 0) {
			return local224;
		}
		for (@Pc(230) int local230 = 0; local230 < local152; local230++) {
			@Pc(236) char local236 = arg2.charAt(local230);
			@Pc(240) char local240 = arg1.charAt(local230);
			if (local240 != local236) {
				return Static94.method1602(local236, arg0) - Static94.method1602(local240, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(B)V")
	public static void method2225() {
		if (!Static76.aBoolean131) {
			return;
		}
		while (true) {
			while (Static301.anInt5601 < Static222.aClass35_Sub1Array1.length) {
				@Pc(22) Class35_Sub1 local22 = Static222.aClass35_Sub1Array1[Static301.anInt5601];
				if (local22 != null && local22.anInt5027 == -1) {
					if (Static73.aClass2_Sub22_1 == null) {
						Static73.aClass2_Sub22_1 = Static359.aClass145_1.method3770(local22.aString48);
					}
					@Pc(45) int local45 = Static73.aClass2_Sub22_1.anInt3502;
					if (local45 == -1) {
						return;
					}
					Static301.anInt5601++;
					Static73.aClass2_Sub22_1 = null;
					local22.anInt5027 = local45;
				} else {
					Static301.anInt5601++;
				}
			}
			return;
		}
	}
}
