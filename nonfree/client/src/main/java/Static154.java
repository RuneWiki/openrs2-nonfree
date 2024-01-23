import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "Lclient!kb;")
	public static Class83 aClass83_109;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	public static int anInt3555 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(CI)Z")
	public static boolean method2863(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(29) char[] local29 = Static194.aCharArray5;
			for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
				@Pc(39) char local39 = local29[local31];
				if (local39 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!ok;II)V")
	public static void method2864(@OriginalArg(0) int arg0, @OriginalArg(1) Class116 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte12 == 0) {
			arg1.anInt4366 = arg1.anInt4329;
		} else if (arg1.aByte12 == 1) {
			arg1.anInt4366 = arg1.anInt4329 + (arg2 - arg1.anInt4299) / 2;
		} else if (arg1.aByte12 == 2) {
			arg1.anInt4366 = arg2 - arg1.anInt4299 - arg1.anInt4329;
		} else if (arg1.aByte12 == 3) {
			arg1.anInt4366 = arg1.anInt4329 * arg2 >> 14;
		} else if (arg1.aByte12 == 4) {
			arg1.anInt4366 = (arg1.anInt4329 * arg2 >> 14) + (arg2 - arg1.anInt4299) / 2;
		} else {
			arg1.anInt4366 = arg2 - (arg2 * arg1.anInt4329 >> 14) - arg1.anInt4299;
		}
		if (arg1.aByte14 == 0) {
			arg1.anInt4371 = arg1.anInt4325;
		} else if (arg1.aByte14 == 1) {
			arg1.anInt4371 = (arg0 - arg1.anInt4363) / 2 + arg1.anInt4325;
		} else if (arg1.aByte14 == 2) {
			arg1.anInt4371 = arg0 - arg1.anInt4325 - arg1.anInt4363;
		} else if (arg1.aByte14 == 3) {
			arg1.anInt4371 = arg0 * arg1.anInt4325 >> 14;
		} else if (arg1.aByte14 == 4) {
			arg1.anInt4371 = (arg0 - arg1.anInt4363) / 2 + (arg0 * arg1.anInt4325 >> 14);
		} else {
			arg1.anInt4371 = arg0 - (arg0 * arg1.anInt4325 >> 14) - arg1.anInt4363;
		}
		if (!Static24.aBoolean27 || Static37.method866(arg1).anInt1450 == 0 && arg1.anInt4376 != 0) {
			return;
		}
		if (arg1.anInt4371 < 0) {
			arg1.anInt4371 = 0;
		} else if (arg0 < arg1.anInt4363 + arg1.anInt4371) {
			arg1.anInt4371 = arg0 - arg1.anInt4363;
		}
		if (arg1.anInt4366 < 0) {
			arg1.anInt4366 = 0;
		} else if (arg1.anInt4299 + arg1.anInt4366 > arg2) {
			arg1.anInt4366 = arg2 - arg1.anInt4299;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLclient!kb;)V")
	public static void method2866(@OriginalArg(1) Class83 arg0) {
		Static108.aClass83_68 = arg0;
	}
}
