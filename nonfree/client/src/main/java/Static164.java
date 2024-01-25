import java.awt.Canvas;
import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!kq", name = "L", descriptor = "[Lclient!lg;")
	public static Class60[] aClass60Array7;

	@OriginalMember(owner = "client!kq", name = "P", descriptor = "Lclient!vm;")
	public static Class92 aClass92_7;

	@OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
	public static int anInt3686 = 0;

	@OriginalMember(owner = "client!kq", name = "H", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_59 = new Class154(4);

	@OriginalMember(owner = "client!kq", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString120 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method3146(@OriginalArg(1) Component arg0) {
		@Pc(9) Method local9 = Static172.aMethod2;
		if (local9 != null) {
			try {
				local9.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(23) Throwable local23) {
			}
		}
		arg0.addKeyListener(Static183.aClass141_1);
		arg0.addFocusListener(Static183.aClass141_1);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method3147(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static127.method2530(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static127.method2530(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(49) int local49 = local14 - local11;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(64) StringBuffer local64 = new StringBuffer(local49);
		for (@Pc(77) int local77 = local11; local77 < local14; local77++) {
			@Pc(83) char local83 = arg0.charAt(local77);
			if (Static161.method3105(local83)) {
				@Pc(91) char local91 = Static44.method809(local83);
				if (local91 != '\u0000') {
					local64.append(local91);
				}
			}
		}
		if (local64.length() == 0) {
			return null;
		} else {
			return local64.toString();
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZII)V")
	public static void method3148(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static73.anIntArray161[arg1] = arg0;
		@Pc(19) Class4_Sub32 local19 = (Class4_Sub32) Static264.aClass198_22.method5261((long) arg1);
		if (local19 == null) {
			local19 = new Class4_Sub32(4611686018427387905L);
			Static264.aClass198_22.method5267((long) arg1, local19);
		} else if (local19.aLong165 != 4611686018427387905L) {
			local19.aLong165 = Static274.method4763() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!wm;ILjava/lang/String;Z)V")
	public static void method3149(@OriginalArg(0) Class78 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(21) int local21 = Static232.aClass106_5.method2882(250, null, arg1);
		@Pc(30) int local30 = Static232.aClass106_5.method2876(250, arg1, null) * 13;
		aClass92_7.method4436(6, 6, local21 + 4 + 4, local30 - -4 + 4, -16777216, 0);
		aClass92_7.method4495(6, 6, local21 + 4 + 4, local30 - -8, -1, 0);
		arg0.method4068(local21, 0, -1, null, 10, 0, arg1, 10, local30, 0, null, null, 1, 1, -1);
		Static222.method3817(local30 + 4 + 4, local21 + 8, 6, 6);
		if (arg2) {
			aClass92_7.method4452();
		}
	}

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "(I)V")
	public static void method3150() {
		Static244.aClass60Array15 = null;
		Static48.aClass60_3 = null;
		Static310.aClass60Array17 = null;
		Static108.aClass60Array5 = null;
		Static14.aClass78_1 = null;
		Static27.aClass60Array2 = null;
		Static54.aClass60Array3 = null;
		Static19.aClass60Array19 = null;
		aClass60Array7 = null;
		Static118.aClass78_3 = null;
		Static81.aClass78_2 = null;
		Static118.aClass60Array6 = null;
		Static234.aClass60Array13 = null;
		Static67.aClass60Array4 = null;
		Static216.aClass60Array18 = null;
		Static220.aClass60Array10 = null;
		Static242.aClass60Array14 = null;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!al;Lclient!lh;BILjava/awt/Canvas;I)Lclient!vm;")
	public static Class92 method3151(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class120 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			if (!Static293.aBooleanArray28[local14]) {
				local12 = local14;
				Static293.aBooleanArray28[local14] = true;
				break;
			}
		}
		if (local12 == -1) {
			throw new IllegalStateException("No free toolkit instances");
		} else if (arg2 == 0) {
			return Static330.method5403(arg0, arg3, local12);
		} else if (arg2 == 1) {
			return Static296.method5022(arg1, arg3, arg4, local12, arg0);
		} else {
			throw new IllegalArgumentException("Unsupported mode");
		}
	}
}
