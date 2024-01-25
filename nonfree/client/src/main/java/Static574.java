import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!sw", name = "o", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_238 = new Class160(41, 8);

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "Lclient!fw;")
	public static final Class125 aClass125_40 = new Class125(512);

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)V")
	public static void method8188() {
		@Pc(5) Class345 local5 = null;
		try {
			@Pc(11) Class230 local11 = Static344.aClass173_5.method4249("");
			while (local11.anInt6256 == 0) {
				Static548.method7968(1L);
			}
			if (local11.anInt6256 == 1) {
				local5 = (Class345) local11.anObject12;
				@Pc(32) Class14_Sub21 local32 = Static181.aClass14_Sub26_9.method5279();
				local5.method8257(local32.aByteArray99, 0, local32.anInt8936);
			}
		} catch (@Pc(42) Exception local42) {
		}
		try {
			if (local5 != null) {
				local5.method8253();
			}
		} catch (@Pc(49) Exception local49) {
		}
	}

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(III)Z")
	public static boolean method8190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(23) Class128 local23 = Static212.aClass249_4.method6119(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local23.method2687(arg1);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)[B")
	public static byte[] method8194(@OriginalArg(0) int arg0) {
		@Pc(10) Class14_Sub2_Sub2 local10 = (Class14_Sub2_Sub2) Static688.aClass378_7.method9082((long) arg0);
		if (local10 == null) {
			@Pc(15) byte[] local15 = new byte[512];
			@Pc(21) Random local21 = new Random((long) arg0);
			for (@Pc(23) int local23 = 0; local23 < 255; local23++) {
				local15[local23] = (byte) local23;
			}
			for (@Pc(37) int local37 = 0; local37 < 255; local37++) {
				@Pc(43) int local43 = 255 - local37;
				@Pc(48) int local48 = Static645.method9067(local43, local21);
				@Pc(52) byte local52 = local15[local48];
				local15[local48] = local15[local43];
				local15[local43] = local15[511 - local37] = local52;
			}
			local10 = new Class14_Sub2_Sub2(local15);
			Static688.aClass378_7.method9078(local10, (long) arg0);
		}
		return local10.aByteArray7;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(III)I")
	public static int method8195(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method8196(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg5 && arg0 == arg2 && arg6 == arg1 && arg3 == arg7) {
			Static425.method6394(arg2, arg4, arg6, arg3, arg8);
			return;
		}
		@Pc(44) int local44 = arg8;
		@Pc(46) int local46 = arg2;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(54) int local54 = arg2 * 3;
		@Pc(58) int local58 = arg5 * 3;
		@Pc(62) int local62 = arg0 * 3;
		@Pc(66) int local66 = arg1 * 3;
		@Pc(70) int local70 = arg7 * 3;
		@Pc(79) int local79 = local58 + arg6 - arg8 - local66;
		@Pc(87) int local87 = local62 + arg3 - local70 - arg2;
		@Pc(95) int local95 = local50 + local66 - local58 - local58;
		@Pc(106) int local106 = local70 + local54 - local62 - local62;
		@Pc(111) int local111 = local58 - local50;
		@Pc(115) int local115 = local62 - local54;
		for (@Pc(117) int local117 = 128; local117 <= 4096; local117 += 128) {
			@Pc(125) int local125 = local117 * local117 >> 12;
			@Pc(131) int local131 = local117 * local125 >> 12;
			@Pc(135) int local135 = local79 * local131;
			@Pc(139) int local139 = local131 * local87;
			@Pc(143) int local143 = local95 * local125;
			@Pc(147) int local147 = local125 * local106;
			@Pc(151) int local151 = local117 * local111;
			@Pc(155) int local155 = local115 * local117;
			@Pc(165) int local165 = (local151 + local143 + local135 >> 12) + arg8;
			@Pc(176) int local176 = arg2 + (local139 + local147 + local155 >> 12);
			Static425.method6394(local46, arg4, local165, local176, local44);
			local44 = local165;
			local46 = local176;
		}
	}
}
