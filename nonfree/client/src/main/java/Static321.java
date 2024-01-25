import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
	public static int anInt5589;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "Z")
	public static boolean aBoolean403 = false;

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString74 = null;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIILclient!ha;ILclient!sfa;IIIII)V")
	public static void method5056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class144 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class14_Sub2_Sub17 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg1 != 23448) {
			return;
		}
		if (arg5 > arg10 && arg0 + arg10 > arg5 && arg7 - 13 < arg9 && arg7 + 3 > arg9) {
			arg2 = arg11;
		}
		@Pc(42) String local42 = Static36.method632(arg6);
		Static255.aClass68_4.method9423(Static399.aClass45Array24, Static16.anIntArray22, local42, arg10 + 3, arg7, arg2);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIII[BII[BI)V")
	public static void method5057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(15) int local15 = -(arg0 & 0x3);
		for (@Pc(18) int local18 = -arg1; local18 < 0; local18++) {
			@Pc(28) int local28;
			for (@Pc(24) int local24 = local10; local24 < 0; local24++) {
				local28 = arg5++;
				arg6[local28] += arg3[arg7++];
				@Pc(40) int local40 = arg5++;
				arg6[local40] += arg3[arg7++];
				@Pc(52) int local52 = arg5++;
				arg6[local52] += arg3[arg7++];
				@Pc(64) int local64 = arg5++;
				arg6[local64] += arg3[arg7++];
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local28 = arg5++;
				arg6[local28] += arg3[arg7++];
			}
			arg7 += arg4;
			arg5 += arg2;
		}
		if (false) {
			method5056(-26, 77, -55, -18, (Class144) null, 54, (Class14_Sub2_Sub17) null, -16, 89, 29, -35, 34);
		}
	}
}
