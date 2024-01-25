import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "[I")
	public static final int[] anIntArray343 = new int[200];

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "S")
	public static short aShort66 = 256;

	@OriginalMember(owner = "client!hk", name = "E", descriptor = "Lclient!mv;")
	public static final Class1_Sub11_Sub1 aClass1_Sub11_Sub1_3 = new Class1_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
	public static int anInt5699 = 0;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZIZII)V")
	public static void method4417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg5 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) Class114_Sub1 local20 = Static237.aClass114_Sub1Array3[local14];
		Static237.aClass114_Sub1Array3[local14] = Static237.aClass114_Sub1Array3[arg5];
		Static237.aClass114_Sub1Array3[arg5] = local20;
		for (@Pc(32) int local32 = arg0; local32 < arg5; local32++) {
			if (Static72.method1138(arg2, arg3, Static237.aClass114_Sub1Array3[local32], arg1, local20, arg4) <= 0) {
				@Pc(54) Class114_Sub1 local54 = Static237.aClass114_Sub1Array3[local32];
				Static237.aClass114_Sub1Array3[local32] = Static237.aClass114_Sub1Array3[local16];
				Static237.aClass114_Sub1Array3[local16++] = local54;
			}
		}
		Static237.aClass114_Sub1Array3[arg5] = Static237.aClass114_Sub1Array3[local16];
		Static237.aClass114_Sub1Array3[local16] = local20;
		method4417(arg0, arg1, arg2, arg3, arg4, local16 - 1);
		method4417(local16 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)V")
	public static void method4419(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static130.anInt2246 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!dh;)V")
	public static void method4420(@OriginalArg(1) Class1_Sub11 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static161.anInt1935; local7++) {
			@Pc(20) int local20 = arg0.method4469();
			@Pc(24) int local24 = arg0.method4485();
			if (local24 == 65535) {
				local24 = -1;
			}
			if (Static169.aClass114_Sub1Array2[local20] != null) {
				Static169.aClass114_Sub1Array2[local20].anInt2758 = local24;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V")
	public static void method4421(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static357.aByteArrayArrayArray11 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)I")
	public static int method4422(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
