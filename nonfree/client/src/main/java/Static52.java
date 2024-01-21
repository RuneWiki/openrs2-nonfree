import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "Lclient!jc;")
	public static Class40 aClass40_15;

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "[[S")
	public static short[][] aShortArrayArray3 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Lclient!gg;")
	public static Class28 aClass28_810 = Static107.method1838(" loggt sich ein)3");

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLclient!gg;)V")
	public static void method961(@OriginalArg(1) Class28 arg0) {
		if (Static58.aClass2_Sub9Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(14) long local14 = arg0.method1129();
		if (local14 == 0L) {
			return;
		}
		while (local10 < Static58.aClass2_Sub9Array1.length && local14 != Static58.aClass2_Sub9Array1[local10].aLong145) {
			local10++;
		}
		if (Static58.aClass2_Sub9Array1.length > local10 && Static58.aClass2_Sub9Array1[local10] != null) {
			Static128.aClass2_Sub2_Sub1_2.method1711(192);
			Static128.aClass2_Sub2_Sub1_2.method1666(Static58.aClass2_Sub9Array1[local10].aLong145);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method964() {
		if (!Static163.aBoolean157) {
			return;
		}
		@Pc(18) Class24 local18 = Static12.method360(Static34.anInt958, Static59.anInt1550);
		if (local18 != null && local18.anObjectArray11 != null) {
			@Pc(27) Class2_Sub21 local27 = new Class2_Sub21();
			local27.anObjectArray29 = local18.anObjectArray11;
			local27.aClass24_9 = local18;
			Static118.method2854(local27);
		}
		Static163.aBoolean157 = false;
		Static104.method1828(local18);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIB)V")
	public static void method966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class65 local11 = Static147.aClass65ArrayArrayArray1[Static103.anInt2568][arg1][arg0];
		if (local11 == null) {
			Static112.method1889(Static103.anInt2568, arg1, arg0);
			return;
		}
		@Pc(20) int local20 = -99999999;
		@Pc(25) Class2_Sub4_Sub1_Sub6 local25 = (Class2_Sub4_Sub1_Sub6) local11.method2115();
		@Pc(27) Class2_Sub4_Sub1_Sub6 local27 = null;
		while (local25 != null) {
			@Pc(33) Class2_Sub4_Sub12 local33 = Static58.method1034(local25.anInt2595);
			@Pc(36) int local36 = local33.anInt2227;
			if (local33.anInt2237 == 1) {
				local36 *= local25.anInt2590 + 1;
			}
			if (local20 < local36) {
				local27 = local25;
				local20 = local36;
			}
			local25 = (Class2_Sub4_Sub1_Sub6) local11.method2117();
		}
		if (local27 == null) {
			Static112.method1889(Static103.anInt2568, arg1, arg0);
			return;
		}
		local11.method2120(local27);
		local25 = (Class2_Sub4_Sub1_Sub6) local11.method2115();
		@Pc(89) Class2_Sub4_Sub1_Sub6 local89 = null;
		@Pc(91) Class2_Sub4_Sub1_Sub6 local91 = null;
		while (local25 != null) {
			if (local27.anInt2595 != local25.anInt2595) {
				if (local91 == null) {
					local91 = local25;
				}
				if (local25.anInt2595 != local91.anInt2595 && local89 == null) {
					local89 = local25;
				}
			}
			local25 = (Class2_Sub4_Sub1_Sub6) local11.method2117();
		}
		@Pc(134) long local134 = (long) ((arg0 << 7) + arg1 + 1610612736);
		Static141.method2247(Static103.anInt2568, arg1, arg0, Static103.method1808(Static103.anInt2568, arg1 * 128 + 64, arg0 * 128 + 64), local27, local134, local91, local89);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)Z")
	public static boolean method968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 * Static22.anInt738 + arg0 * Static66.anInt1786 >> 16;
		@Pc(19) int local19 = arg2 * Static66.anInt1786 - arg0 * Static22.anInt738 >> 16;
		@Pc(29) int local29 = arg1 * Static112.anInt2717 + local19 * Static175.anInt3887 >> 16;
		@Pc(39) int local39 = arg1 * Static175.anInt3887 - local19 * Static112.anInt2717 >> 16;
		if (local29 >= 50 && local29 <= 3500) {
			@Pc(55) int local55 = Static96.anInt2436 + (local9 << 9) / local29;
			@Pc(63) int local63 = Static13.anInt594 + (local39 << 9) / local29;
			return local55 >= Static123.anInt2918 && local55 <= Static63.anInt1753 && local63 >= Static38.anInt1031 && local63 <= Static81.anInt2514;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public static void method970() {
		aByteArrayArray2 = null;
		aShortArrayArray3 = null;
		aClass28_810 = null;
		aClass40_15 = null;
	}
}
