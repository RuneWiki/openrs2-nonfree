import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!ng", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString44;

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "Lclient!ko;")
	public static final Class183 aClass183_6 = new Class183("WIP", 2);

	@OriginalMember(owner = "client!ng", name = "E", descriptor = "Lclient!cq;")
	public static Class56 aClass56_123 = null;

	@OriginalMember(owner = "client!ng", name = "F", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_68 = new Class303(54, -1);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILclient!wn;IIB)V")
	public static void method5378(@OriginalArg(0) int arg0, @OriginalArg(1) Class41_Sub2_Sub1_Sub4_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray629[0];
		@Pc(15) int local15 = arg1.anIntArray628[0];
		if (local10 < 0 || local10 >= Static54.anInt1038 || local15 < 0 || local15 >= Static140.anInt3026 || (arg2 < 0 || arg2 >= Static54.anInt1038 || arg0 < 0 || Static140.anInt3026 <= arg0)) {
			return;
		}
		@Pc(75) int local75 = Static92.method1744(arg0, Static252.anIntArray240, 0, 0, Static67.anIntArray66, true, -4, Static460.aClass169Array3[arg1.aByte117], arg1.method7858(), local10, local15, arg2, 0, 0);
		if (local75 >= 1 && local75 <= 3) {
			for (@Pc(87) int local87 = 0; local87 < local75 - 1; local87++) {
				arg1.method7877(Static67.anIntArray66[local87], (byte) 2, Static252.anIntArray240[local87]);
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[BIIIII[BI)V")
	public static void method5381(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(20) int local20 = -(arg0 & 0x3);
		for (@Pc(23) int local23 = -arg5; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg3++;
				arg1[local31] += arg6[arg2++];
				@Pc(43) int local43 = arg3++;
				arg1[local43] += arg6[arg2++];
				@Pc(55) int local55 = arg3++;
				arg1[local55] += arg6[arg2++];
				@Pc(67) int local67 = arg3++;
				arg1[local67] += arg6[arg2++];
			}
			for (@Pc(85) int local85 = local20; local85 < 0; local85++) {
				local31 = arg3++;
				arg1[local31] += arg6[arg2++];
			}
			arg2 += arg4;
			arg3 += arg7;
		}
	}
}
