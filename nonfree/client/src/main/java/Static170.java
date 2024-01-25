import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
	public static int anInt3533;

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_44 = new Class241(56, 5);

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "[I")
	public static final int[] anIntArray189 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)Z")
	public static boolean method3322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BI[BI)I")
	public static int method3323(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(16) int local16 = arg2; local16 < arg0; local16++) {
			local7 = local7 >>> 8 ^ Class30.anIntArray30[(arg1[local16] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method3325(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static382.anInt6638;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(24) Class382 local24 = Static431.aClass156_1.method4046(arg0[local13]);
			if (local24.anInt10168 != -1) {
				@Pc(36) Class49 local36 = (Class49) Static200.aClass359_23.method8517((long) local24.anInt10168);
				if (local36 == null) {
					@Pc(44) Class64 local44 = Static691.method1249(Static583.aClass223_113, local24.anInt10168, 0);
					if (local44 != null) {
						local36 = Static202.aClass75_5.method6714(local44, true);
						Static200.aClass359_23.method8515((long) local24.anInt10168, local36);
					}
				}
				if (local36 != null) {
					Static532.aClass49Array14[local11] = local36;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)V")
	public static void method3326() {
		for (@Pc(15) int local15 = 0; local15 < Static74.anInt1034; local15++) {
			@Pc(21) Class124 local21 = Static534.aClass124Array6[local15];
			if (local21.aByte48 == 3) {
				if (local21.aClass6_Sub17_Sub2_1 == null) {
					local21.anInt3564 = Integer.MIN_VALUE;
				} else {
					Static544.aClass6_Sub17_Sub3_2.method4663(local21.aClass6_Sub17_Sub2_1);
				}
			}
		}
	}
}
