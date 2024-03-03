import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!jl", name = "Z", descriptor = "I")
	public static int anInt3135;

	@OriginalMember(owner = "client!jl", name = "ab", descriptor = "I")
	public static int anInt3136;

	@OriginalMember(owner = "client!jl", name = "bb", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!jl", name = "eb", descriptor = "Lclient!bk;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIILclient!ur;Lclient!vi;Lclient!kf;Ljava/lang/String;Lclient!nk;)V", line = 85)
	public static void method3148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class130 arg6, @OriginalArg(8) Class239 arg7, @OriginalArg(9) Class78 arg8, @OriginalArg(10) String arg9, @OriginalArg(11) Class161 arg10) {
		@Pc(15) int local15;
		if (Static291.anInt5899 == 4) {
			local15 = (int) Class187.aFloat66 & 0x3FFF;
		} else {
			local15 = Class2_Sub3_Sub1.anInt158 + (int) Class187.aFloat66 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg10.anInt4242 / 2, arg10.anInt4255 / 2) + 10;
		@Pc(43) int local43 = arg4 * arg4 + arg1 * arg1;
		if (local43 > local34 * local34) {
			return;
		}
		@Pc(53) int local53 = Class19.anIntArray178[local15];
		@Pc(57) int local57 = Class19.anIntArray177[local15];
		if (Static291.anInt5899 != 4) {
			local57 = local57 * 256 / (Class71.anInt2003 + 256);
			local53 = local53 * 256 / (Class71.anInt2003 + 256);
		}
		@Pc(86) int local86 = local57 * arg4 + local53 * arg1 >> 15;
		@Pc(96) int local96 = arg1 * local57 - local53 * arg4 >> 15;
		@Pc(103) int local103 = arg7.method6125(null, arg9, 100);
		@Pc(109) int local109 = local86 - local103 / 2;
		@Pc(117) int local117 = arg7.method6122(arg9, null);
		if (-arg10.anInt4242 <= local109 && arg10.anInt4242 >= local109 && -arg10.anInt4255 <= local96 && local96 <= arg10.anInt4255) {
			arg6.method5894(arg0, 0, arg10.anInt4242 / 2 + local109 + arg0, 1, 0, null, arg2, arg8, 50, arg9, 0, arg10.anInt4255 / 2 + arg2 - local117 - local96 - arg5, null, arg3, local103);
		}
	}

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V", line = 201)
	public static void method3149() {
		if (Class109.anInt2800 == 0) {
			return;
		}
		try {
			if (++Class134.anInt3553 > 1500) {
				if (Static312.aClass111_4 != null) {
					Static312.aClass111_4.method2801();
					Static312.aClass111_4 = null;
				}
				if (Class25.anInt666 >= 1) {
					Class109.anInt2800 = 0;
					Class2_Sub3_Sub6.anInt1045 = -5;
					return;
				}
				Class109.anInt2800 = 1;
				if (Static366.anInt7212 == Static255.anInt5144) {
					Static255.anInt5144 = Static34.anInt919;
				} else {
					Static255.anInt5144 = Static366.anInt7212;
				}
				Class25.anInt666++;
				Class134.anInt3553 = 0;
			}
			if (Class109.anInt2800 == 1) {
				Static5.aClass32_1 = Static305.aClass152_5.method3752(Static57.aString14, Static255.anInt5144);
				Class109.anInt2800 = 2;
			}
			@Pc(125) int local125;
			if (Class109.anInt2800 == 2) {
				if (Static5.aClass32_1.anInt992 == 2) {
					throw new IOException();
				}
				if (Static5.aClass32_1.anInt992 != 1) {
					return;
				}
				Static312.aClass111_4 = new Class111((Socket) Static5.aClass32_1.anObject2, Static305.aClass152_5);
				Static5.aClass32_1 = null;
				Static312.aClass111_4.method2799(Class14.aClass2_Sub4_Sub2_4.anInt5289, Class14.aClass2_Sub4_Sub2_4.aByteArray73);
				if (Static280.aClass221_2 != null) {
					Static280.aClass221_2.method6326();
				}
				if (Static177.aClass221_1 != null) {
					Static177.aClass221_1.method6326();
				}
				local125 = Static312.aClass111_4.method2802();
				if (Static280.aClass221_2 != null) {
					Static280.aClass221_2.method6326();
				}
				if (Static177.aClass221_1 != null) {
					Static177.aClass221_1.method6326();
				}
				if (local125 != 101) {
					Class2_Sub3_Sub6.anInt1045 = local125;
					Class109.anInt2800 = 0;
					Static312.aClass111_4.method2801();
					Static312.aClass111_4 = null;
					return;
				}
				Class109.anInt2800 = 3;
			}
			if (Class109.anInt2800 == 3 && Static312.aClass111_4.method2797() >= 2) {
				local125 = Static312.aClass111_4.method2802() << 8 | Static312.aClass111_4.method2802();
				Static350.method6280(local125);
				if (Class87.anInt2382 == -1) {
					Class109.anInt2800 = 0;
					Class2_Sub3_Sub6.anInt1045 = 6;
					Static312.aClass111_4.method2801();
					Static312.aClass111_4 = null;
				} else {
					Class109.anInt2800 = 0;
					Static312.aClass111_4.method2801();
					Static312.aClass111_4 = null;
					Static213.method4015();
				}
			}
		} catch (@Pc(208) IOException local208) {
			if (Static312.aClass111_4 != null) {
				Static312.aClass111_4.method2801();
				Static312.aClass111_4 = null;
			}
			if (Class25.anInt666 >= 1) {
				Class109.anInt2800 = 0;
				Class2_Sub3_Sub6.anInt1045 = -4;
			} else {
				Class109.anInt2800 = 1;
				Class134.anInt3553 = 0;
				if (Static255.anInt5144 == Static366.anInt7212) {
					Static255.anInt5144 = Static34.anInt919;
				} else {
					Static255.anInt5144 = Static366.anInt7212;
				}
				Class25.anInt666++;
			}
		}
	}
}
