import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "Lclient!fh;")
	public static Class58 aClass58_89;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "[Lclient!dc;")
	public static Class37[] aClass37Array1 = new Class37[8];

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Lclient!cc;")
	public static Class26 aClass26_50 = new Class26(32);

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Z")
	public static boolean aBoolean331 = false;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
	public static int anInt4760 = 0;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	public static int anInt4761 = 0;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
	public static int anInt4762 = 0;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZJB)V")
	public static void method3960(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1) {
		if (arg1 == 0L) {
			return;
		}
		if (Static239.anInt4517 >= 100) {
			Static186.method4394("", 0, Static29.aString38);
			return;
		}
		@Pc(25) String local25 = Static216.method3514(arg1);
		@Pc(27) int local27;
		for (local27 = 0; local27 < Static239.anInt4517; local27++) {
			if (Static132.aLongArray16[local27] == arg1) {
				Static186.method4394("", 0, local25 + Static111.aString128);
				return;
			}
		}
		for (local27 = 0; local27 < Static272.anInt5215; local27++) {
			if (Static285.aLongArray54[local27] == arg1) {
				Static186.method4394("", 0, Static227.aString267 + local25 + Static89.aString113);
				return;
			}
		}
		if (local25.equals(Static154.aClass53_Sub1_Sub1_2.aString88)) {
			Static186.method4394("", 0, Static172.aString205);
			return;
		}
		Static132.aLongArray16[Static239.anInt4517] = arg1;
		Static130.aStringArray18[Static239.anInt4517] = Static226.method423(arg1);
		Static60.aBooleanArray5[Static239.anInt4517++] = arg0;
		Static98.anInt2102 = Static261.anInt4980;
		Static110.aClass4_Sub10_Sub1_1.method4687(197);
		Static110.aClass4_Sub10_Sub1_1.method4619(arg1);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZZIII)V")
	public static void method3961(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (Static94.aBoolean138) {
			@Pc(24) int local24 = arg2 - 334;
			if (local24 < 0) {
				local24 = 0;
			} else if (local24 > 100) {
				local24 = 100;
			}
			@Pc(50) int local50 = Static275.aShort45 + (Static164.aShort25 - Static275.aShort45) * local24 / 100;
			if (Static157.aShort18 > local50) {
				local50 = Static157.aShort18;
			} else if (local50 > Static10.aShort1) {
				local50 = Static10.aShort1;
			}
			@Pc(76) int local76 = arg2 * 512 * local50 / (arg4 * 334);
			@Pc(114) int local114;
			@Pc(121) int local121;
			@Pc(85) short local85;
			if (local76 < Static24.aShort9) {
				local85 = Static24.aShort9;
				local50 = arg4 * local85 * 334 / (arg2 * 512);
				if (local50 > Static10.aShort1) {
					local50 = Static10.aShort1;
					local114 = arg2 * local50 * 512 / (local85 * 334);
					local121 = (arg4 - local114) / 2;
					if (arg1) {
						Static104.method1699();
						Static104.method1702(arg3, arg0, local121, arg2, 0);
						Static104.method1702(arg3 + arg4 - local121, arg0, local121, arg2, 0);
					}
					arg4 -= local121 * 2;
					arg3 += local121;
				}
			} else if (local76 > Static280.aShort11) {
				local85 = Static280.aShort11;
				local50 = local85 * arg4 * 334 / (arg2 * 512);
				if (local50 < Static157.aShort18) {
					local50 = Static157.aShort18;
					local114 = arg4 * 334 * local85 / (local50 * 512);
					local121 = (arg2 - local114) / 2;
					if (arg1) {
						Static104.method1699();
						Static104.method1702(arg3, arg0, arg4, local121, 0);
						Static104.method1702(arg3, arg0 + arg2 - local121, arg4, local121, 0);
					}
					arg2 -= local121 * 2;
					arg0 += local121;
				}
			}
			Static292.anInt5441 = arg2 * local50 / 334;
		}
		Static255.anInt4857 = arg0;
		Static183.anInt3483 = arg3;
		Static240.anInt4547 = (short) arg4;
		Static69.anInt1333 = (short) arg2;
	}
}
