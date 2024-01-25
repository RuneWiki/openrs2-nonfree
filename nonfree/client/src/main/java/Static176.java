import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "Lclient!st;")
	public static final Class314 aClass314_56 = new Class314(22, 6);

	@OriginalMember(owner = "client!gda", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIIII)V")
	public static void method2899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg3 - arg1;
		@Pc(20) int local20 = arg0 - arg4;
		if (local9 == 0) {
			if (local20 != 0) {
				Static574.method8064(arg2, arg4, arg0, arg1);
			}
		} else if (local20 == 0) {
			Static350.method5653(arg1, arg4, arg2, arg3);
		} else {
			@Pc(57) int local57 = (local20 << 12) / local9;
			@Pc(66) int local66 = arg4 - (local57 * arg1 >> 12);
			@Pc(87) int local87;
			@Pc(85) int local85;
			if (arg1 < Static474.anInt8118) {
				local87 = Static474.anInt8118;
				local85 = (Static474.anInt8118 * local57 >> 12) + local66;
			} else if (Static576.anInt9425 < arg1) {
				local85 = local66 + (Static576.anInt9425 * local57 >> 12);
				local87 = Static576.anInt9425;
			} else {
				local85 = arg4;
				local87 = arg1;
			}
			@Pc(123) int local123;
			@Pc(121) int local121;
			if (Static474.anInt8118 > arg3) {
				local121 = local66 + (local57 * Static474.anInt8118 >> 12);
				local123 = Static474.anInt8118;
			} else if (arg3 > Static576.anInt9425) {
				local123 = Static576.anInt9425;
				local121 = local66 + (local57 * Static576.anInt9425 >> 12);
			} else {
				local121 = arg0;
				local123 = arg3;
			}
			if (local121 < Static298.anInt5919) {
				local123 = (Static298.anInt5919 - local66 << 12) / local57;
				local121 = Static298.anInt5919;
			} else if (Static596.anInt9703 < local121) {
				local123 = (Static596.anInt9703 - local66 << 12) / local57;
				local121 = Static596.anInt9703;
			}
			if (local85 < Static298.anInt5919) {
				local85 = Static298.anInt5919;
				local87 = (Static298.anInt5919 - local66 << 12) / local57;
			} else if (Static596.anInt9703 < local85) {
				local87 = (Static596.anInt9703 - local66 << 12) / local57;
				local85 = Static596.anInt9703;
			}
			Static68.method1191(local87, arg2, local85, local123, local121);
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(BI)V")
	public static void method2901(@OriginalArg(1) int arg0) {
		for (@Pc(5) Class3 local5 = Static389.aClass25_29.method435(); local5 != null; local5 = Static389.aClass25_29.method432()) {
			if ((long) arg0 == (local5.aLong277 >> 48 & 0xFFFFL)) {
				local5.method8682();
			}
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method2904(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static88.aBoolean123) {
			try {
				@Pc(26) Class192 local26 = (Class192) Class.forName("Class192_Sub1").getDeclaredConstructor().newInstance();
				local26.method7233(arg0);
				return local26;
			} catch (@Pc(33) Throwable local33) {
				Static88.aBoolean123 = true;
			}
		}
		return arg0;
	}
}
