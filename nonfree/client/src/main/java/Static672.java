import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static672 {

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "Lclient!lda;")
	public static final Class225 aClass225_14 = new Class225(11, 0, 1, 2);

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "[[B")
	public static final byte[][] aByteArrayArray24 = new byte[50][];

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_188 = new Class186(23, -2);

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "[Lclient!vi;")
	public static final Class387[] aClass387Array1 = new Class387[8];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!rba;Z)Lclient!pw;")
	public static Class296 method8906(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(13) int local13 = arg0.method5312();
		return new Class296(local13);
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)Lclient!raa;")
	public static Class199 method8909() {
		try {
			return new Class199_Sub2();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class199) Class.forName("sm").getDeclaredConstructor().newInstance();
			} catch (@Pc(21) Throwable local21) {
				return new Class199_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIZ)Z")
	public static boolean method8910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	public static void method8911() {
		for (@Pc(17) Class3_Sub4_Sub5 local17 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8391(); local17 != null; local17 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8392()) {
			if (Static105.method1374(local17.anInt2775)) {
				Static16.method287(local17);
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(II)V")
	public static void method8913(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub24 local15 = (Class3_Sub24) Static699.aClass136_50.method3503((long) arg0);
		if (local15 != null) {
			local15.aBoolean271 = !local15.aBoolean271;
			local15.aClass78_Sub1_1.method2105(local15.aBoolean271);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZIJ)Ljava/lang/String;")
	public static String method8914(@OriginalArg(0) int arg0, @OriginalArg(3) long arg1) {
		Static207.method3080(arg1);
		@Pc(17) Calendar local17 = Static321.aCalendar11;
		@Pc(21) int local21 = local17.get(5);
		@Pc(25) int local25 = local17.get(2);
		@Pc(29) int local29 = local17.get(1);
		@Pc(33) int local33 = local17.get(11);
		@Pc(45) int local45 = local17.get(12);
		return arg0 == 3 ? Static390.method5898(arg0, arg1) : Integer.toString(local21 / 10) + local21 % 10 + "-" + Static677.aStringArrayArray2[arg0][local25] + "-" + local29 + " " + local33 / 10 + local33 % 10 + ":" + local45 / 10 + local45 % 10;
	}
}
