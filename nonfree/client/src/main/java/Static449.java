import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!sw", name = "j", descriptor = "Lclient!lg;")
	public static Class177 aClass177_9;

	@OriginalMember(owner = "client!sw", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[100];

	@OriginalMember(owner = "client!sw", name = "m", descriptor = "Z")
	public static boolean aBoolean499 = true;

	@OriginalMember(owner = "client!sw", name = "p", descriptor = "[I")
	public static final int[] anIntArray595 = new int[8];

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method6458(@OriginalArg(0) Class9 arg0) {
		for (@Pc(1) int local1 = Static382.anInt6687; local1 < Static538.anInt9338; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static488.anInt8353; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static60.anInt1677; local7++) {
					@Pc(16) Class206 local16 = Static313.aClass206ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class47_Sub4 local21 = local16.aClass47_Sub4_2;
						@Pc(24) Class47_Sub4 local24 = local16.aClass47_Sub4_1;
						if (local21 != null && local21.method7156()) {
							Static287.method4852(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7156()) {
								Static287.method4852(arg0, local24, local1, local4, local7, 1, 1);
								local24.method7166(arg0, 0, false, 0, 0, local21);
								local24.method7162();
							}
							local21.method7162();
						}
						for (@Pc(70) Class168 local70 = local16.aClass168_2; local70 != null; local70 = local70.aClass168_1) {
							@Pc(74) Class47_Sub2 local74 = local70.aClass47_Sub2_2;
							if (local74 != null && local74.method7156()) {
								Static287.method4852(arg0, local74, local1, local4, local7, local74.aShort116 + 1 - local74.aShort115, local74.aShort114 - local74.aShort117 + 1);
								local74.method7162();
							}
						}
						@Pc(111) Class47_Sub3 local111 = local16.aClass47_Sub3_1;
						if (local111 != null && local111.method7156()) {
							Static369.method5692(arg0, local111, local1, local4, local7);
							local111.method7162();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "()V")
	public static void method6460() {
		for (@Pc(1) int local1 = 0; local1 < Static321.anInt6084; local1++) {
			if (!Static78.aBooleanArray9[local1]) {
				@Pc(10) Class201 local10 = Static172.aClass201Array3[local1];
				@Pc(13) Class1_Sub27 local13 = local10.aClass1_Sub27_2;
				@Pc(16) int local16 = local10.anInt5980;
				@Pc(22) int local22 = local13.method5496() - Static444.anInt7507;
				@Pc(30) int local30 = (local22 * 2 >> Static246.anInt4759) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method5493() - local22 >> Static246.anInt4759;
				@Pc(53) int local53 = local13.method5495() - local22 >> Static246.anInt4759;
				@Pc(61) int local61 = local13.method5495() + local22 >> Static246.anInt4759;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static60.anInt1677) {
					local61 = Static60.anInt1677 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray110[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static488.anInt8353) {
						local108 = Static488.anInt8353 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class47_Sub2 local141 = Static52.method1507(local16, local125, local78, pc.class);
						if (local141 != null && local141.aByte93 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte93 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray110[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray110[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray110[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray110[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static78.aBooleanArray9[local1] = true;
				Static290.aClass10Array7[local16].method6335(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6461(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class1_Sub1_Sub13 local13 = Static476.method6225(3, arg0);
		local13.method4919();
		local13.aString54 = arg1;
	}
}
