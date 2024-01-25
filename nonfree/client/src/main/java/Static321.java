import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_152 = new Class150(20, 10);

	@OriginalMember(owner = "client!naa", name = "g", descriptor = "J")
	public static long aLong174 = 0L;

	@OriginalMember(owner = "client!naa", name = "h", descriptor = "Z")
	public static boolean aBoolean424 = false;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(III[II)V")
	public static void method5153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(8) int local8 = arg3 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (arg1 < local11) {
			@Pc(15) int local15 = arg1 + 1;
			arg2[local15] = arg0;
			@Pc(20) int local20 = local15 + 1;
			arg2[local20] = arg0;
			@Pc(25) int local25 = local20 + 1;
			arg2[local25] = arg0;
			@Pc(30) int local30 = local25 + 1;
			arg2[local30] = arg0;
			@Pc(35) int local35 = local30 + 1;
			arg2[local35] = arg0;
			@Pc(40) int local40 = local35 + 1;
			arg2[local40] = arg0;
			@Pc(45) int local45 = local40 + 1;
			arg2[local45] = arg0;
			arg1 = local45 + 1;
			arg2[arg1] = arg0;
		}
		while (local8 > arg1) {
			arg1++;
			arg2[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IZLclient!co;)V")
	public static void method5154(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (Static271.aClass149_4 == null) {
			return;
		}
		try {
			Static271.aClass149_4.method3481(0L);
			Static271.aClass149_4.method3474(arg0, arg1.aByteArray66, 24);
		} catch (@Pc(14) Exception local14) {
		}
	}
}
