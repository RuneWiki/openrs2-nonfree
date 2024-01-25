import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!qs", name = "mb", descriptor = "J")
	public static long aLong260;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)Z")
	public static boolean method7146(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!kia;II[I)V")
	public static void method7147(@OriginalArg(0) Class41_Sub1_Sub1_Sub3_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(8) boolean local8;
		@Pc(10) int local10;
		if (arg0.anIntArray521 != null) {
			local8 = true;
			for (local10 = 0; local10 < arg0.anIntArray521.length; local10++) {
				if (arg0.anIntArray521[local10] != arg2[local10]) {
					local8 = false;
					break;
				}
			}
			if (local8 && arg0.anInt9503 != -1) {
				@Pc(45) Class65 local45 = Static459.aClass128_2.method2686(arg0.anInt9503);
				@Pc(48) int local48 = local45.anInt1425;
				if (local48 == 1) {
					arg0.anInt9475 = 0;
					arg0.anInt9461 = 1;
					arg0.anInt9463 = arg1;
					arg0.anInt9459 = 0;
					arg0.anInt9507 = 0;
					if (!arg0.aBoolean692) {
						Static119.method1899(arg0.anInt9507, arg0, local45);
					}
				}
				if (local48 == 2) {
					arg0.anInt9475 = 0;
				}
			}
		}
		local8 = true;
		for (local10 = 0; local10 < arg2.length; local10++) {
			if (arg2[local10] != -1) {
				local8 = false;
			}
			if (arg0.anIntArray521 == null || arg0.anIntArray521[local10] == -1 || Static459.aClass128_2.method2686(arg2[local10]).anInt1419 >= Static459.aClass128_2.method2686(arg0.anIntArray521[local10]).anInt1419) {
				arg0.anInt9463 = arg1;
				arg0.anIntArray521 = arg2;
				arg0.anInt9525 = arg0.anInt9526;
			}
		}
		if (local8) {
			arg0.anIntArray521 = arg2;
			arg0.anInt9463 = arg1;
			arg0.anInt9525 = arg0.anInt9526;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!cb;Lclient!cb;Lclient!cb;ILclient!cb;)V")
	public static void method7148(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(4) Class50 arg3) {
		Static342.aClass50_98 = arg3;
		Static149.aClass50_41 = arg2;
		Static54.aClass50_151 = arg0;
		Static227.aClass394ArrayArray2 = new Class394[Static342.aClass50_98.method902()][];
		Static68.aBooleanArray1 = new boolean[Static342.aClass50_98.method902()];
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(IBI)Z")
	public static boolean method7149(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && Static317.aByteArrayArrayArray13[1].length > arg0 && Static317.aByteArrayArrayArray13[1][arg0].length > arg1) {
			return (Static317.aByteArrayArrayArray13[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
