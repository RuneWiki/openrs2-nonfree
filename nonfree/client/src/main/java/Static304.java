import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "Lclient!vk;")
	public static Class185 aClass185_8;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
	public static int anInt5802;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString350 = "flash2:";

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString351 = "red:";

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)V")
	public static void method4698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Static110.aClass4_Sub10_Sub1_1.method4687(230);
		}
		if (arg1 == 1) {
			Static110.aClass4_Sub10_Sub1_1.method4687(207);
		}
		Static110.aClass4_Sub10_Sub1_1.method4623(++Static41.aByte1);
		Static110.aClass4_Sub10_Sub1_1.method4618(Static54.aBooleanArray4[82] ? 1 : 0);
		Static110.aClass4_Sub10_Sub1_1.method4668(Static295.anInt5480 + arg2);
		Static110.aClass4_Sub10_Sub1_1.method4673(arg0 + Static220.anInt3983);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)I")
	public static int method4699(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)I")
	public static int method4700() {
		return Static60.aBoolean68 && Static54.aBooleanArray4[81] && Static300.anInt5638 > 2 ? Static86.anIntArray160[Static300.anInt5638 - 2] : Static86.anIntArray160[Static300.anInt5638 - 1];
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method4706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class4_Sub19 local7 = Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass182_1 != null && local7.aClass182_1.aLong193 == arg3) {
			return true;
		} else if (local7.aClass186_1 != null && local7.aClass186_1.aLong199 == arg3) {
			return true;
		} else if (local7.aClass42_1 != null && local7.aClass42_1.aLong45 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt3554; local46++) {
				if (local7.aClass33Array3[local46].aLong38 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)V")
	public static void method4707() {
		Static195.anIntArray402 = null;
		Static58.anIntArray85 = null;
		Static110.anIntArray185 = null;
		Static301.anIntArray643 = null;
		Static187.anIntArray391 = null;
		Static230.aByteArrayArray36 = null;
	}
}
