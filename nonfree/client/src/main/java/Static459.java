import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "Lclient!pc;")
	public static Class16 aClass16_6;

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "Lclient!qd;")
	public static final Class200 aClass200_6 = new Class200("", 16);

	@OriginalMember(owner = "client!ya", name = "p", descriptor = "Lclient!el;")
	public static final Class1_Sub17 aClass1_Sub17_4 = new Class1_Sub17(0, -1);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method4507(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = arg0.length();
		while (local14 < local17 && Static213.method3366(arg0.charAt(local14))) {
			local14++;
		}
		while (local17 > local14 && Static213.method3366(arg0.charAt(local17 - 1))) {
			local17--;
		}
		@Pc(50) int local50 = local17 - local14;
		if (local50 < 1 || local50 > 12) {
			return null;
		}
		@Pc(67) StringBuffer local67 = new StringBuffer(local50);
		for (@Pc(69) int local69 = local14; local69 < local17; local69++) {
			@Pc(74) char local74 = arg0.charAt(local69);
			if (Static44.method812(local74)) {
				@Pc(82) char local82 = Static351.method4860(local74);
				if (local82 != '\u0000') {
					local67.append(local82);
				}
			}
		}
		if (local67.length() == 0) {
			return null;
		} else {
			return local67.toString();
		}
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!ga;ILclient!od;Ljava/awt/Canvas;BI)Lclient!ya;")
	public static synchronized Class39 method4522(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class180 arg2, @OriginalArg(3) Canvas arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			if (!Static225.aBooleanArray30[local7]) {
				local5 = local7;
				break;
			}
		}
		if (local5 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(57) Class39 local57;
		if (arg1 == 0) {
			local57 = Static132.method2291(local5, arg3, arg0);
		} else if (arg1 == 1) {
			local57 = Static76.method1513(arg4, local5, arg3, arg0, arg2);
		} else if (arg1 == 2) {
			local57 = Static346.method4844(arg2, arg3, arg0, local5);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static225.aBooleanArray30[local5] = true;
		return local57;
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)[B")
	public static byte[] method4527(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub2_Sub4 local18 = (Class1_Sub2_Sub4) Static195.aClass29_3.method757((long) arg0);
		if (local18 == null) {
			@Pc(23) byte[] local23 = new byte[512];
			@Pc(29) Random local29 = new Random((long) arg0);
			for (@Pc(31) int local31 = 0; local31 < 255; local31++) {
				local23[local31] = (byte) local31;
			}
			for (@Pc(43) int local43 = 0; local43 < 255; local43++) {
				@Pc(48) int local48 = 255 - local43;
				@Pc(53) int local53 = Static300.method5748(local29, local48);
				@Pc(57) byte local57 = local23[local53];
				local23[local53] = local23[local48];
				local23[local48] = local23[511 - local43] = local57;
			}
			local18 = new Class1_Sub2_Sub4(local23);
			Static195.aClass29_3.method756(local18, (long) arg0);
		}
		return local18.aByteArray25;
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(B)V")
	public static void method4541() {
		if (Static177.aClass39_3 != null) {
			Static177.aClass39_3.method4523();
			Static177.aClass39_3 = null;
			Static157.aClass71_6 = null;
		}
	}
}
