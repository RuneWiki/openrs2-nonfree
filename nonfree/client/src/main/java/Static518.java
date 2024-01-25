import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
	public static int anInt8715;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "Lclient!dh;")
	public static final Class64 aClass64_10 = new Class64("", 17);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIB)Lclient!jq;")
	public static Class156 method7135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class156 local14 = Static182.method2888(arg1);
		if (arg0 == -1) {
			return local14;
		} else if (local14 == null || local14.aClass156Array1 == null || arg0 >= local14.aClass156Array1.length) {
			return null;
		} else {
			return local14.aClass156Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method7136(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static544.aClass205Array3 == null) {
			return;
		}
		@Pc(8) Class49_Sub2_Sub2 local8 = null;
		@Pc(14) int local14;
		if (arg2 >= 0) {
			local14 = arg2 - 1;
			@Pc(21) Class1_Sub17 local21 = (Class1_Sub17) Static380.aClass17_29.method738((long) local14);
			if (local21 != null) {
				local8 = local21.aClass49_Sub2_Sub2_Sub2_2;
			}
		} else {
			local14 = -arg2 - 1;
			if (Static198.anInt3873 == local14) {
				local8 = Static63.aClass49_Sub2_Sub2_Sub1_1;
			} else {
				local8 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local14];
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(54) Class36 local54 = Static308.aClass96_4.method2274(arg7);
		@Pc(63) int local63;
		@Pc(66) int local66;
		if (arg10 == 1 || arg10 == 3) {
			local63 = local54.anInt975;
			local66 = local54.anInt947;
		} else {
			local66 = local54.anInt975;
			local63 = local54.anInt947;
		}
		@Pc(81) int local81 = arg8 + (local66 >> 1);
		@Pc(89) int local89 = arg8 + (local66 + 1 >> 1);
		@Pc(95) int local95 = arg12 + (local63 >> 1);
		@Pc(103) int local103 = arg12 + (local63 + 1 >> 1);
		@Pc(107) Class205 local107 = Static544.aClass205Array3[arg5];
		@Pc(130) int local130 = local107.ba(local81, local95) + local107.ba(local89, local95) + local107.ba(local81, local103) + local107.ba(local89, local103) >> 2;
		@Pc(134) Class1_Sub50 local134 = new Class1_Sub50();
		local134.anInt8761 = arg7;
		local134.anInt8767 = arg8;
		local134.anInt8760 = Static436.anInt6850 + arg3;
		local134.anInt8773 = arg10;
		local134.anInt8771 = arg12;
		local134.anInt8765 = arg0 + Static436.anInt6850;
		@Pc(165) int local165;
		if (arg9 > arg1) {
			local165 = arg9;
			arg9 = arg1;
			arg1 = local165;
		}
		local134.anInt8774 = local8.aByte98;
		local134.anInt8769 = arg11;
		if (arg4 < arg6) {
			local165 = arg6;
			arg6 = arg4;
			arg4 = local165;
		}
		local134.anInt8758 = arg8 + arg1;
		local134.anInt8756 = arg9 + arg8;
		local134.anInt8766 = local130;
		local134.anInt8768 = (local63 << 8) + (local134.anInt8771 << 9);
		local134.anInt8759 = arg4 + arg12;
		local134.anInt8757 = (local134.anInt8767 << 9) + (local66 << 8);
		local134.anInt8762 = arg6 + arg12;
		Static193.aClass37_79.method970(local134);
		local8.aClass1_Sub50_3 = local134;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZIIII)V")
	public static void method7137(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static422.anInt7388; local11++) {
			@Pc(17) Rectangle local17 = Class79.aRectangleArray1[local11];
			if (local17.x + local17.width > arg2 && local17.x < arg1 + arg2 && local17.height + local17.y > arg3 && local17.y < arg3 + arg0) {
				Static3.aBooleanArray1[local11] = true;
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)S")
	public static short method7138(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(44) int local44 = local24 <= 64 ? local24 * local20 >> 7 : local20 * (127 - local24) >> 7;
		@Pc(48) int local48 = local24 + local44;
		@Pc(57) int local57;
		if (local48 == 0) {
			local57 = local44 << 1;
		} else {
			local57 = (local44 << 8) / local48;
		}
		return (short) (local57 >> 4 << 7 | local14 << 10 | local48);
	}
}
