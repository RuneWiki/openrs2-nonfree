import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "Lclient!qa;")
	public static Class109 aClass109_13;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
	public static int anInt10057;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "[I")
	public static int[] anIntArray660 = new int[2];

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;Lclient!jc;B)I")
	public static int method8736(@OriginalArg(0) String arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		@Pc(13) int local13 = arg1.anInt3174;
		@Pc(17) byte[] local17 = Static668.method8852(arg0);
		arg1.method2996(local17.length);
		arg1.anInt3174 += Static448.aClass157_1.method4051(0, arg1.aByteArray20, local17, arg1.anInt3174, local17.length);
		return arg1.anInt3174 - local13;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILclient!vo;BLclient!ha;)V")
	public static void method8737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class381 arg2, @OriginalArg(4) Class75 arg3) {
		for (@Pc(16) int local16 = 63; local16 >= 0; local16--) {
			@Pc(34) int local34 = (local16 & 0x3F) << 10 | 0x3F | 0x380;
			Static529.method7605(true, false);
			@Pc(42) int local42 = Static229.anIntArray228[local34];
			Static217.method3969(false, true);
			arg3.aa(arg0, arg1 + ((63 - local16) * arg2.anInt10131 >> 6), arg2.anInt10159, (arg2.anInt10131 >> 6) + 1, local42, 0);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIZII)V")
	public static void method8738(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() == 0) {
			Static159.method3128(false);
		} else {
			Static82.anInt1265 = Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431();
			Static536.method7652(true, 0);
		}
		Static245.anInt4710 = arg3;
		Static387.aBoolean503 = arg1;
		Static260.anInt8684 = arg2;
		Static627.method6473(arg0);
	}
}
