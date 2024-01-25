import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger10 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
	public static int anInt8895 = 0;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
	public static int anInt8897 = 16777215;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7596(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static450.anInt7035 >= 200 && !Static54.aBoolean83 || Static450.anInt7035 >= 200) {
			Static417.method5293(Static279.aClass179_11.method4066(Static164.anInt2984));
			return;
		}
		@Pc(40) String local40 = Static317.method4379(arg0);
		if (local40 == null) {
			return;
		}
		@Pc(84) String local84;
		for (@Pc(45) int local45 = 0; local45 < Static450.anInt7035; local45++) {
			@Pc(53) String local53 = Static317.method4379(Static289.aStringArray20[local45]);
			if (local53 != null && local53.equals(local40)) {
				Static417.method5293(arg0 + Static279.aClass179_38.method4066(Static164.anInt2984));
				return;
			}
			if (Static496.aStringArray41[local45] != null) {
				local84 = Static317.method4379(Static496.aStringArray41[local45]);
				if (local84 != null && local84.equals(local40)) {
					Static417.method5293(arg0 + Static279.aClass179_38.method4066(Static164.anInt2984));
					return;
				}
			}
		}
		for (@Pc(111) int local111 = 0; local111 < Static633.anInt9792; local111++) {
			local84 = Static317.method4379(Static16.aStringArray4[local111]);
			if (local84 != null && local84.equals(local40)) {
				Static417.method5293(Static279.aClass179_43.method4066(Static164.anInt2984) + arg0 + Static279.aClass179_44.method4066(Static164.anInt2984));
				return;
			}
			if (Static301.aStringArray21[local111] != null) {
				@Pc(155) String local155 = Static317.method4379(Static301.aStringArray21[local111]);
				if (local155 != null && local155.equals(local40)) {
					Static417.method5293(Static279.aClass179_43.method4066(Static164.anInt2984) + arg0 + Static279.aClass179_44.method4066(Static164.anInt2984));
					return;
				}
			}
		}
		if (Static317.method4379(Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aString37).equals(local40)) {
			Static417.method5293(Static279.aClass179_41.method4066(Static164.anInt2984));
		} else {
			@Pc(209) Class4_Sub48 local209 = Static335.method4615(Static662.aClass216_153, Static669.aClass196_2);
			local209.aClass4_Sub11_Sub1_2.method8822(Static115.method2143(arg0));
			local209.aClass4_Sub11_Sub1_2.method8857(arg0);
			Static410.method5170(local209);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Z")
	public static boolean method7599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static562.method7444(arg0, arg1) | (arg1 & 0x70000) != 0 || Static567.method7517(arg1, arg0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZIIILclient!pc;I[II)Lclient!qt;")
	public static Class116_Sub2_Sub1 method7604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class33_Sub3 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg2.aBoolean571 || Static211.method8993(arg1) && Static211.method8993(arg5)) {
			return new Class116_Sub2_Sub1(arg2, 3553, arg1, arg5, false, arg4, arg3, 0);
		} else if (arg2.aBoolean568) {
			return new Class116_Sub2_Sub1(arg2, 34037, arg1, arg5, false, arg4, arg3, 0);
		} else {
			return new Class116_Sub2_Sub1(arg2, arg1, arg5, Static162.method2593(arg1), Static162.method2593(arg5), arg4);
		}
	}
}
