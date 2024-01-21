import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!df;")
	public static Class16 aClass16_24;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Lclient!df;")
	public static Class16 aClass16_25;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!qf;")
	public static Class60 aClass60_380 = Static59.method1195("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "Lclient!qf;")
	public static Class60 aClass60_381 = Static59.method1195("mod_icons");

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Lclient!qf;")
	public static Class60 aClass60_382 = Static59.method1195("(U0a )2 in: ");

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Lclient!qf;")
	private static Class60 aClass60_384 = Static59.method1195("Hidden");

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_383 = aClass60_384;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	public static int anInt997 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIII[BLclient!qb;I[Lclient!td;I)V")
	public static void method653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) Class58 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class72[] arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = -1;
		@Pc(17) Class3_Sub12 local17 = new Class3_Sub12(arg5);
		while (true) {
			@Pc(21) int local21 = local17.method1948();
			if (local21 == 0) {
				return;
			}
			local7 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local17.method1948();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local29 >> 12;
				@Pc(59) int local59 = local17.method1936();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				if (arg9 == local55 && local51 >= arg3 && local51 < arg3 + 8 && local45 >= arg4 && arg4 + 8 > local45) {
					@Pc(94) Class3_Sub1_Sub17 local94 = Static18.method517(local7);
					@Pc(111) int local111 = arg1 + Static115.method2116(local94.anInt3449, local51 & 0x7, local94.anInt3441, local45 & 0x7, arg2, local67);
					@Pc(128) int local128 = Static123.method2251(arg2, local51 & 0x7, local94.anInt3441, local45 & 0x7, local94.anInt3449, local67) + arg7;
					if (local111 > 0 && local128 > 0 && local111 < 103 && local128 < 103) {
						@Pc(142) int local142 = arg0;
						if ((Static60.aByteArrayArrayArray4[1][local111][local128] & 0x2) == 2) {
							local142 = arg0 - 1;
						}
						@Pc(158) Class72 local158 = null;
						if (local142 >= 0) {
							local158 = arg8[local142];
						}
						Static103.method2013(local67 + arg2 & 0x3, local128, arg6, local111, local7, local158, local63, arg0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method654() {
		aClass60_380 = null;
		aClass60_383 = null;
		aClass60_382 = null;
		aClass16_25 = null;
		aClass60_384 = null;
		aClass60_381 = null;
		aClass16_24 = null;
		anIntArrayArrayArray1 = null;
		aBigInteger1 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method655(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static6.aClass26_1);
		arg0.addMouseMotionListener(Static6.aClass26_1);
		arg0.addFocusListener(Static6.aClass26_1);
	}
}
