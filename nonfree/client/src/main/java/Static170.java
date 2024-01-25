import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ig", name = "Z", descriptor = "I")
	public static int anInt3086;

	@OriginalMember(owner = "client!ig", name = "W", descriptor = "Lclient!of;")
	public static final Class174 aClass174_99 = new Class174("K", "T", "K", "K");

	@OriginalMember(owner = "client!ig", name = "X", descriptor = "Z")
	public static boolean aBoolean243 = false;

	@OriginalMember(owner = "client!ig", name = "Y", descriptor = "I")
	public static int anInt3085 = 0;

	@OriginalMember(owner = "client!ig", name = "ab", descriptor = "[[I")
	public static final int[][] anIntArrayArray14 = new int[6][];

	@OriginalMember(owner = "client!ig", name = "bb", descriptor = "I")
	public static int anInt3087 = 500;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZI)V")
	public static void method2608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub3_Sub4 local12 = Static281.method3883(13, arg0);
		local12.method1003();
		local12.anInt972 = arg1;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)Lclient!bb;")
	public static Class1_Sub1 method2609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static389.aClass227ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub1_2;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)Lclient!ot;")
	public static Class63 method2610() {
		try {
			return new Class63_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class63) Class.forName("Class63_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(22) Throwable local22) {
				return new Class63_Sub2();
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;IZZ)I")
	public static int method2614(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) char local39 = arg0.charAt(local33);
			if (local33 == 0) {
				if (local39 == '-') {
					local24 = true;
					continue;
				}
				if (local39 == '+') {
					continue;
				}
			}
			@Pc(66) int local66;
			if (local39 >= '0' && local39 <= '9') {
				local66 = local39 - '0';
			} else if (local39 >= 'A' && local39 <= 'Z') {
				local66 = local39 - '7';
			} else if (local39 >= 'a' && local39 <= 'z') {
				local66 = local39 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local66 >= arg1) {
				throw new NumberFormatException();
			}
			if (local24) {
				local66 = -local66;
			}
			@Pc(112) int local112 = arg1 * local28 + local66;
			if (local112 / arg1 != local28) {
				throw new NumberFormatException();
			}
			local26 = true;
			local28 = local112;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}
}
