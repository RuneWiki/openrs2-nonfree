import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!al", name = "x", descriptor = "Lclient!wha;")
	public static Class385 aClass385_31;

	@OriginalMember(owner = "client!al", name = "l", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_187 = new Class44(109, 4);

	@OriginalMember(owner = "client!al", name = "m", descriptor = "[B")
	public static final byte[] aByteArray140 = new byte[520];

	@OriginalMember(owner = "client!al", name = "w", descriptor = "Lclient!gq;")
	public static final Class132 aClass132_31 = new Class132();

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(B)Lclient!rh;")
	public static Class104 method9250() {
		try {
			return (Class104) Class.forName("Class104_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(B)V")
	public static void method9251() {
		if (Static430.anInt7691 == 9) {
			Static67.method1345(5);
		} else if (Static430.anInt7691 == 5 || Static430.anInt7691 == 6) {
			Static67.method1345(3);
		} else if (Static430.anInt7691 == 12) {
			Static67.method1345(3);
			return;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIIIII[B)V")
	public static void method9252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		if (arg3 > 0 && !Static178.method2845(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static178.method2845(arg2)) {
			@Pc(31) int local31 = Static25.method477(arg1);
			@Pc(33) int local33 = 0;
			@Pc(40) int local40 = arg3 >= arg2 ? arg2 : arg3;
			@Pc(44) int local44 = arg3 >> 1;
			@Pc(48) int local48 = arg2 >> 1;
			@Pc(50) byte[] local50 = arg5;
			@Pc(57) byte[] local57 = new byte[local31 * local48 * local44];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local33, arg0, arg3, arg2, 0, arg1, 5121, local50, 0);
				if (local40 <= 1) {
					return;
				}
				@Pc(77) int local77 = arg3 * local31;
				for (@Pc(79) int local79 = 0; local79 < local31; local79++) {
					@Pc(83) int local83 = local79;
					@Pc(85) int local85 = local79;
					@Pc(89) int local89 = local77 + local79;
					for (@Pc(91) int local91 = 0; local91 < local48; local91++) {
						for (@Pc(95) int local95 = 0; local95 < local44; local95++) {
							@Pc(101) byte local101 = local50[local85];
							local85 += local31;
							@Pc(111) int local111 = local101 + local50[local85];
							local85 += local31;
							@Pc(121) int local121 = local111 + local50[local89];
							local89 += local31;
							@Pc(131) int local131 = local121 + local50[local89];
							local89 += local31;
							local57[local83] = (byte) (local131 >> 2);
							local83 += local31;
						}
						local85 += local77;
						local89 += local77;
					}
				}
				@Pc(176) byte[] local176 = local57;
				local57 = local50;
				local50 = local176;
				arg3 = local44;
				arg2 = local48;
				local40 >>= 0x1;
				local48 >>= 0x1;
				local33++;
				local44 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(JB)V")
	public static void method9254(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static276.method4020(arg0 - 1L);
			Static276.method4020(1L);
		} else {
			Static276.method4020(arg0);
		}
	}
}
