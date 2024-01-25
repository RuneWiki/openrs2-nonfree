import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!gea", name = "v", descriptor = "Lclient!m;")
	public static Class118 aClass118_6;

	@OriginalMember(owner = "client!gea", name = "w", descriptor = "Ljava/lang/Object;")
	public static Object anObject7;

	@OriginalMember(owner = "client!gea", name = "x", descriptor = "[I")
	public static int[] anIntArray278;

	@OriginalMember(owner = "client!gea", name = "l", descriptor = "Lclient!paa;")
	public static final Class229 aClass229_7 = new Class229(3, 7);

	@OriginalMember(owner = "client!gea", name = "u", descriptor = "I")
	public static int anInt2904 = 0;

	@OriginalMember(owner = "client!gea", name = "y", descriptor = "I")
	public static int anInt2905 = 0;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!r;IIIB)Lclient!ud;")
	public static Class291 method2472(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return arg0 == null ? null : new Class291(arg3, arg2, arg1, arg0.e(), arg0.wa(), arg0.va(), arg0.TA(), arg0.n(), arg0.Q(), arg0.U());
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILjava/lang/String;I[B)I")
	public static int method2474(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(10) int local10 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17 += 4) {
			@Pc(25) int local25 = Static74.method1288(arg1.charAt(local17));
			@Pc(44) int local44 = local17 + 1 >= local10 ? -1 : Static74.method1288(arg1.charAt(local17 + 1));
			@Pc(63) int local63 = local17 + 2 >= local10 ? -1 : Static74.method1288(arg1.charAt(local17 + 2));
			@Pc(80) int local80 = local17 + 3 < local10 ? Static74.method1288(arg1.charAt(local17 + 3)) : -1;
			arg2[arg0++] = (byte) (local44 >>> 4 | local25 << 2);
			if (local63 == -1) {
				break;
			}
			arg2[arg0++] = (byte) ((local44 & 0xF) << 4 | local63 >>> 2);
			if (local80 == -1) {
				break;
			}
			arg2[arg0++] = (byte) ((local63 & 0x3) << 6 | local80);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!fu;)V")
	public static void method2475(@OriginalArg(0) Class49_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort117; local2 <= arg0.aShort115; local2++) {
			for (@Pc(6) int local6 = arg0.aShort116; local6 <= arg0.aShort118; local6++) {
				@Pc(16) Class255 local16 = Static242.aClass255ArrayArrayArray2[arg0.aByte98][local2][local6];
				if (local16 != null) {
					@Pc(21) Class63 local21 = local16.aClass63_3;
					@Pc(23) Class63 local23 = null;
					while (local21 != null) {
						if (local21.aClass49_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass63_3 = local21.aClass63_1;
							} else {
								local23.aClass63_1 = local21.aClass63_1;
							}
							local21.method1466();
							break;
						}
						local23 = local21;
						local21 = local21.aClass63_1;
					}
					local16.aByte104 = 0;
					for (@Pc(56) Class63 local56 = local16.aClass63_3; local56 != null; local56 = local56.aClass63_1) {
						local16.aByte104 = (byte) (local16.aByte104 | local56.anInt1607);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(III[IIIII)V")
	public static void method2476(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg5 > 0 && !Static535.method7411(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static535.method7411(arg1)) {
			@Pc(47) int local47 = 0;
			@Pc(54) int local54 = arg5 < arg1 ? arg5 : arg1;
			@Pc(58) int local58 = arg5 >> 1;
			@Pc(62) int local62 = arg1 >> 1;
			@Pc(64) int[] local64 = arg2;
			@Pc(69) int[] local69 = new int[local62 * local58];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local47, arg4, arg5, arg1, 0, 32993, arg3, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(88) int local88 = 0;
				@Pc(90) int local90 = 0;
				@Pc(94) int local94 = arg5;
				@Pc(96) int[] local96 = local69;
				for (@Pc(98) int local98 = 0; local98 < local62; local98++) {
					for (@Pc(102) int local102 = 0; local102 < local58; local102++) {
						@Pc(109) int local109 = local64[local90++];
						@Pc(114) int local114 = local64[local90++];
						@Pc(119) int local119 = local64[local94++];
						@Pc(125) int local125 = local109 >> 16 & 0xFF;
						@Pc(130) int local130 = local64[local94++];
						@Pc(134) int local134 = local109 & 0xFF;
						@Pc(140) int local140 = local109 >> 24 & 0xFF;
						@Pc(146) int local146 = local109 >> 8 & 0xFF;
						@Pc(152) int local152 = local134 + (local114 & 0xFF);
						@Pc(160) int local160 = local146 + (local114 >> 8 & 0xFF);
						@Pc(168) int local168 = local125 + (local114 >> 16 & 0xFF);
						@Pc(176) int local176 = local140 + (local114 >> 24 & 0xFF);
						@Pc(184) int local184 = local160 + (local119 >> 8 & 0xFF);
						@Pc(192) int local192 = local176 + (local119 >> 24 & 0xFF);
						@Pc(200) int local200 = local168 + (local119 >> 16 & 0xFF);
						@Pc(206) int local206 = local152 + (local119 & 0xFF);
						@Pc(214) int local214 = local184 + (local130 >> 8 & 0xFF);
						@Pc(222) int local222 = local200 + (local130 >> 16 & 0xFF);
						@Pc(230) int local230 = local192 + (local130 >> 24 & 0xFF);
						@Pc(236) int local236 = local206 + (local130 & 0xFF);
						local69[local88++] = (local222 & 0x3FC) << 14 | local230 << 22 & 0xFF000000 | (local214 & 0x3FC) << 6 | local236 >> 2 & 0xFF;
					}
					local94 += arg5;
					local90 += arg5;
				}
				local69 = local64;
				arg5 = local58;
				arg1 = local62;
				local64 = local96;
				local58 >>= 0x1;
				local47++;
				local54 >>= 0x1;
				local62 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
