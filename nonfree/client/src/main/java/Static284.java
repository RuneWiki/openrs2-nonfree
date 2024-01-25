import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
	public static int anInt4848;

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "Lclient!gga;")
	public static Class6_Sub23 aClass6_Sub23_4;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIII)I")
	public static int method4118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static289.aClass12Array3 == null) {
			return 0;
		}
		@Pc(19) int local19 = arg0 >> 9;
		@Pc(23) int local23 = arg2 >> 9;
		if (local19 < 0 || local23 < 0 || Static491.anInt9856 - 1 < local19 || local23 > Static393.anInt6574 - 1) {
			return 0;
		}
		@Pc(47) int local47 = arg1;
		if (arg1 < 3 && (Static90.aByteArrayArrayArray2[1][local19][local23] & 0x2) != 0) {
			local47 = arg1 + 1;
		}
		return Static289.aClass12Array3[local47].method7854(arg2, arg0);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIILclient!kka;)V")
	public static void method4119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub5 arg4) {
		@Pc(4) Class351 local4 = Static31.method714(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10006 = (arg1 << Static185.anInt3178) + Static625.anInt10177;
		arg4.anInt10004 = arg3;
		arg4.anInt10001 = (arg2 << Static185.anInt3178) + Static625.anInt10177;
		local4.aClass2_Sub1_Sub5_1 = arg4;
		@Pc(33) int local33 = Static289.aClass12Array3 == Static68.aClass12Array2 ? 1 : 0;
		if (arg4.method8447()) {
			if (arg4.method8446()) {
				arg4.aClass2_Sub1_22 = Static643.aClass2_Sub1Array5[local33];
				Static643.aClass2_Sub1Array5[local33] = arg4;
				return;
			}
			arg4.aClass2_Sub1_22 = Static229.aClass2_Sub1Array2[local33];
			Static229.aClass2_Sub1Array2[local33] = arg4;
			Static119.aBoolean126 = true;
			return;
		}
		arg4.aClass2_Sub1_22 = Static512.aClass2_Sub1Array4[local33];
		Static512.aClass2_Sub1Array4[local33] = arg4;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
	public static void method4121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static338.anInt5833 != 0) {
			if (arg0 >= 0) {
				Static490.anIntArray539[arg0] = arg1;
			} else {
				for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
					Static490.anIntArray539[local19] = arg1;
				}
			}
		}
		Static544.aClass6_Sub8_Sub4_10.method5068(arg1, arg0);
	}
}
