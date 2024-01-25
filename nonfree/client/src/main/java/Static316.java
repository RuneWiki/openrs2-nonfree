import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
	public static int anInt5790;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!em;")
	public static final Class83 aClass83_116 = new Class83(22, -2);

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "S")
	public static short aShort63 = 1;

	@OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
	public static int anInt5789 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[B[BIIIIII)V")
	public static void method4691(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(15) int local15 = -(arg0 & 0x3);
		for (@Pc(23) int local23 = -arg5; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg3++;
				arg2[local31] += arg1[arg6++];
				@Pc(43) int local43 = arg3++;
				arg2[local43] += arg1[arg6++];
				@Pc(55) int local55 = arg3++;
				arg2[local55] += arg1[arg6++];
				@Pc(67) int local67 = arg3++;
				arg2[local67] += arg1[arg6++];
			}
			for (@Pc(82) int local82 = local15; local82 < 0; local82++) {
				local31 = arg3++;
				arg2[local31] += arg1[arg6++];
			}
			arg3 += arg7;
			arg6 += arg4;
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)Lclient!cu;")
	public static Class11_Sub1_Sub3 method4694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class360 local7 = Static568.aClass360ArrayArrayArray22[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!in;BII)V")
	public static void method4700(@OriginalArg(0) Class160 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static488.aClass160_36 != null || Static406.aBoolean553 || (arg0 == null || Static172.method2765(arg0) == null)) {
			return;
		}
		Static488.aClass160_36 = arg0;
		Static6.aClass160_45 = Static172.method2765(arg0);
		Static41.anInt8212 = arg2;
		Static419.anInt7395 = arg1;
		Static539.anInt9040 = 0;
		Static78.aBoolean97 = false;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([BI)Ljava/lang/String;")
	public static String method4702(@OriginalArg(0) byte[] arg0) {
		return Static8.method4852(arg0.length, arg0, 0);
	}
}
