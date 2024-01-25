import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!pt", name = "O", descriptor = "I")
	public static int anInt7087;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_1 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_2 = new Class263(Static90.aClass68_4);

	@OriginalMember(owner = "client!pt", name = "p", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_3 = new Class263(Static90.aClass68_4);

	@OriginalMember(owner = "client!pt", name = "q", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_4 = new Class263(Static90.aClass68_4);

	@OriginalMember(owner = "client!pt", name = "r", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_5 = new Class263(Static90.aClass68_4);

	@OriginalMember(owner = "client!pt", name = "s", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_6 = new Class263(Static90.aClass68_4);

	@OriginalMember(owner = "client!pt", name = "t", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_7 = new Class263(Static90.aClass68_4);

	@OriginalMember(owner = "client!pt", name = "u", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_8 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "v", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_9 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "w", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_10 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "x", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_11 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "y", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_12 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "z", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_13 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "A", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_14 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "B", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_15 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "C", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_16 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "D", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_17 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "E", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_18 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "F", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_19 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "G", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_20 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "H", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_21 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "I", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_22 = new Class263(Static90.aClass68_2);

	@OriginalMember(owner = "client!pt", name = "J", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_23 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "K", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_24 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "L", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_25 = new Class263(Static90.aClass68_1);

	@OriginalMember(owner = "client!pt", name = "M", descriptor = "Lclient!pt;")
	public static final Class263 aClass263_26 = new Class263(Static90.aClass68_3);

	@OriginalMember(owner = "client!pt", name = "N", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_137 = new Class56(92, -1);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(III)Lclient!tq;")
	public static Class41_Sub2_Sub2 method5942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class299 local7 = Static309.aClass299ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass41_Sub2_Sub2_2;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5944(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static131.method2611(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static579.anInt9370; local30++) {
			@Pc(36) String local36 = Static483.aStringArray33[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static131.method2611(local36);
			if (local36 != null && local36.equals(local20)) {
				Static579.anInt9370--;
				for (@Pc(60) int local60 = local30; local60 < Static579.anInt9370; local60++) {
					Static483.aStringArray33[local60] = Static483.aStringArray33[local60 + 1];
					Static189.aStringArray16[local60] = Static189.aStringArray16[local60 + 1];
					Static527.aStringArray36[local60] = Static527.aStringArray36[local60 + 1];
					Static119.aStringArray8[local60] = Static119.aStringArray8[local60 + 1];
					Static160.aBooleanArray10[local60] = Static160.aBooleanArray10[local60 + 1];
				}
				Static49.anInt890 = Static109.anInt2171;
				@Pc(121) Class3_Sub42 local121 = Static591.method7910(Static9.aClass199_3, Static107.aClass303_29);
				local121.aClass3_Sub11_Sub1_1.method5213(Static325.method4707(arg0));
				local121.aClass3_Sub11_Sub1_1.method5227(arg0);
				Static511.method6885(local121);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method5946(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!wp;Z)Lclient!wp;")
	public static Class361 method5948(@OriginalArg(0) Class361 arg0) {
		if (arg0.anInt9663 != -1) {
			return Static265.method4040(arg0.anInt9663);
		}
		@Pc(24) int local24 = arg0.anInt9594 >>> 16;
		@Pc(29) Class162 local29 = new Class162(Static216.aClass354_18);
		for (@Pc(34) Class3_Sub49 local34 = (Class3_Sub49) local29.method3920(); local34 != null; local34 = (Class3_Sub49) local29.method3917()) {
			if (local24 == local34.anInt8836) {
				return Static265.method4040((int) local34.aLong273);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(Z)[Lclient!pt;")
	public static Class263[] method5950() {
		return new Class263[] { aClass263_1, aClass263_2, aClass263_3, aClass263_4, aClass263_5, aClass263_6, aClass263_7, aClass263_8, aClass263_9, aClass263_10, aClass263_11, aClass263_12, aClass263_13, aClass263_14, aClass263_15, aClass263_16, aClass263_17, aClass263_18, aClass263_19, aClass263_20, aClass263_21, aClass263_22, aClass263_23, aClass263_24, aClass263_25, aClass263_26 };
	}
}
