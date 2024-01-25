import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "Lclient!naa;")
	public static Class216 aClass216_3;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Z")
	public static boolean method7725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!tp;IZIILclient!aa;Lclient!hu;)V")
	public static void method7726(@OriginalArg(0) int arg0, @OriginalArg(1) Class331 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) Class21 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(18) int local18;
		if (Static427.anInt8005 == 4) {
			local18 = (int) Static499.aFloat185 & 0x3FFF;
		} else {
			local18 = Static642.anInt10689 + (int) Static499.aFloat185 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg1.anInt9553 / 2, arg1.anInt9505 / 2) + 10;
		@Pc(46) int local46 = arg0 * arg0 + arg4 * arg4;
		if (local37 * local37 < local46) {
			return;
		}
		@Pc(60) int local60 = Class344.anIntArray579[local18];
		@Pc(64) int local64 = Class344.anIntArray578[local18];
		if (Static427.anInt8005 != 4) {
			local64 = local64 * 256 / (Static423.anInt7961 + 256);
			local60 = local60 * 256 / (Static423.anInt7961 + 256);
		}
		@Pc(108) int local108 = local64 * arg0 + arg4 * local60 >> 14;
		@Pc(119) int local119 = arg4 * local64 - arg0 * local60 >> 14;
		arg6.method5800(local108 + arg3 + arg1.anInt9553 / 2 - arg6.method5779() / 2, -local119 + (arg1.anInt9505 / 2 + arg2 - arg6.method5785() / 2), arg5, arg3, arg2);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public static void method7727() {
		if (Static354.anInt6822 == 0) {
			return;
		}
		try {
			if (++Static244.anInt5399 > 2000) {
				if (Static319.aClass240_2 != null) {
					Static319.aClass240_2.method6372();
					Static319.aClass240_2 = null;
				}
				if (Static122.anInt3286 >= 2) {
					Static98.anInt2635 = -5;
					Static354.anInt6822 = 0;
					return;
				}
				Static631.aClass280_5.method7028();
				Static354.anInt6822 = 1;
				Static244.anInt5399 = 0;
				Static122.anInt3286++;
			}
			if (Static354.anInt6822 == 1) {
				Static10.aClass301_1 = Static631.aClass280_5.method7026(Static51.aClass118_1);
				Static354.anInt6822 = 2;
			}
			if (Static354.anInt6822 == 2) {
				if (Static10.aClass301_1.anInt8915 == 2) {
					throw new IOException();
				}
				if (Static10.aClass301_1.anInt8915 != 1) {
					return;
				}
				Static319.aClass240_2 = Static368.method5739((Socket) Static10.aClass301_1.anObject18);
				Static10.aClass301_1 = null;
				Static441.method6809();
				Static354.anInt6822 = 4;
			}
			if (Static354.anInt6822 == 4 && Static319.aClass240_2.method6379(1)) {
				Static319.aClass240_2.method6374(Static442.aClass8_Sub8_Sub2_2.aByteArray107, 0, 1);
				@Pc(113) int local113 = Static442.aClass8_Sub8_Sub2_2.aByteArray107[0] & 0xFF;
				Static354.anInt6822 = 0;
				Static98.anInt2635 = local113;
				Static319.aClass240_2.method6372();
				Static319.aClass240_2 = null;
			}
		} catch (@Pc(126) IOException local126) {
			if (Static319.aClass240_2 != null) {
				Static319.aClass240_2.method6372();
				Static319.aClass240_2 = null;
			}
			if (Static122.anInt3286 < 2) {
				Static631.aClass280_5.method7028();
				Static354.anInt6822 = 1;
				Static122.anInt3286++;
				Static244.anInt5399 = 0;
			} else {
				Static354.anInt6822 = 0;
				Static98.anInt2635 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "([IIIZIZILclient!nv;)Lclient!tea;")
	public static Class20_Sub4_Sub1 method7732(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class16_Sub3 arg5) {
		if (arg5.aBoolean534 || Static439.method6796(arg2) && Static439.method6796(arg1)) {
			return new Class20_Sub4_Sub1(arg5, 3553, arg2, arg1, false, arg0, arg3, 0);
		} else if (arg5.aBoolean521) {
			return new Class20_Sub4_Sub1(arg5, 34037, arg2, arg1, false, arg0, arg3, 0);
		} else {
			return new Class20_Sub4_Sub1(arg5, arg2, arg1, Static629.method8469(arg2), Static629.method8469(arg1), arg0);
		}
	}
}
