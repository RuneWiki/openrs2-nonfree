import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!jn", name = "w", descriptor = "I")
	public static int anInt4157;

	@OriginalMember(owner = "client!jn", name = "D", descriptor = "[Z")
	public static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!jn", name = "C", descriptor = "Lclient!oda;")
	public static final Class212 aClass212_2 = new Class212("runescape", 0);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "([ILclient!hca;I[I[I)V")
	public static void method3620(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(13) int local13 = arg2[local7];
			@Pc(17) int local17 = arg3[local7];
			@Pc(21) int local21 = arg0[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && arg1.aClass149Array3.length > local23; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg1.aClass149Array3[local23] = null;
					} else {
						@Pc(40) Class4 local40 = Static396.aClass157_2.method3745(local13);
						@Pc(43) int local43 = local40.anInt123;
						@Pc(48) Class149 local48 = arg1.aClass149Array3[local23];
						if (local48 != null) {
							if (local13 == local48.anInt4196) {
								if (local43 == 0) {
									local48 = arg1.aClass149Array3[local23] = null;
								} else if (local43 == 1) {
									local48.anInt4200 = 0;
									local48.anInt4192 = 1;
									local48.anInt4199 = 0;
									local48.anInt4197 = 0;
									local48.anInt4194 = local21;
									Static250.method3962(0, arg1.anInt7659, arg1.aByte90, local40, arg1 == Static266.aClass1_Sub1_Sub2_Sub1_1, arg1.anInt7660);
								} else if (local43 == 2) {
									local48.anInt4199 = 0;
								}
							} else if (local40.anInt128 >= Static396.aClass157_2.method3745(local48.anInt4196).anInt128) {
								local48 = arg1.aClass149Array3[local23] = null;
							}
						}
						if (local48 == null) {
							local48 = arg1.aClass149Array3[local23] = new Class149();
							local48.anInt4192 = 1;
							local48.anInt4199 = 0;
							local48.anInt4197 = 0;
							local48.anInt4200 = 0;
							local48.anInt4194 = local21;
							local48.anInt4196 = local13;
							Static250.method3962(0, arg1.anInt7659, arg1.aByte90, local40, arg1 == Static266.aClass1_Sub1_Sub2_Sub1_1, arg1.anInt7660);
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)Z")
	public static boolean method3625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II[BIIIII[B)V")
	public static void method3626(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(15) int local15 = -(arg4 >> 2);
		@Pc(20) int local20 = -(arg4 & 0x3);
		for (@Pc(23) int local23 = -arg2; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg5++;
				arg7[local31] += arg1[arg6++];
				@Pc(43) int local43 = arg5++;
				arg7[local43] += arg1[arg6++];
				@Pc(55) int local55 = arg5++;
				arg7[local55] += arg1[arg6++];
				@Pc(67) int local67 = arg5++;
				arg7[local67] += arg1[arg6++];
			}
			for (@Pc(85) int local85 = local20; local85 < 0; local85++) {
				local31 = arg5++;
				arg7[local31] += arg1[arg6++];
			}
			arg6 += arg0;
			arg5 += arg3;
		}
	}
}
