import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "[Lclient!f;")
	public static Class3[] aClass3Array5;

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
	public static int anInt2621;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
	public static int anInt2618 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!ea;Lclient!jb;Lclient!f;IIII)V")
	public static void method1948(@OriginalArg(1) Class57 arg0, @OriginalArg(2) Class126 arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == null) {
			return;
		}
		@Pc(24) int local24;
		if (anInt2621 == 4) {
			local24 = (int) Static146.aFloat82 & 0x3FFF;
		} else {
			local24 = Static94.anInt2046 + (int) Static146.aFloat82 & 0x3FFF;
		}
		@Pc(43) int local43 = Math.max(arg1.anInt3421 / 2, arg1.anInt3442 / 2) + 10;
		@Pc(51) int local51 = arg3 * arg3 + arg4 * arg4;
		if (local51 > local43 * local43) {
			return;
		}
		@Pc(61) int local61 = Class56.anIntArray119[local24];
		@Pc(65) int local65 = Class56.anIntArray120[local24];
		if (anInt2621 != 4) {
			local61 = local61 * 256 / (Static109.anInt6939 + 256);
			local65 = local65 * 256 / (Static109.anInt6939 + 256);
		}
		@Pc(94) int local94 = local65 * arg4 + arg3 * local61 >> 15;
		@Pc(105) int local105 = local65 * arg3 - local61 * arg4 >> 15;
		arg2.method5878(arg1.anInt3421 / 2 + arg5 + local94 - arg2.ja() / 2, arg6 + arg1.anInt3442 / 2 - local105 + -(arg2.JA() / 2), arg0, arg5, arg6);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)I")
	public static int method1949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static442.aByteArrayArray21 == null ? 0 : (Static442.aByteArrayArray21[arg0][arg1] & 0xFF) << 3;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!vj;")
	public static Class6_Sub2 method1950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class53 local7 = Static40.aClass53ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class165 local14 = local7.aClass165_1; local14 != null; local14 = local14.aClass165_2) {
			@Pc(18) Class6_Sub2 local18 = local14.aClass6_Sub2_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort82 == arg1 && local18.aShort85 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)V")
	public static void method1951() {
		Static220.aClass69_50.method1594(50);
		Static123.aClass69_69.method1594(50);
		Static454.aClass69_72.method1594(50);
		Static242.aClass69_48.method1594(50);
		Static273.aClass69_44.method1594(50);
	}
}
