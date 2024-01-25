import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "[I")
	public static final int[] anIntArray674 = new int[2048];

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "Lclient!pr;")
	public static final Class188 aClass188_41 = new Class188();

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "[Lclient!km;")
	public static final Class28_Sub1_Sub1_Sub1[] aClass28_Sub1_Sub1_Sub1Array41 = new Class28_Sub1_Sub1_Sub1[32768];

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[S[Ljava/lang/String;BI)V")
	public static void method5546(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(23) int local23 = (arg3 + arg0) / 2;
		@Pc(25) int local25 = arg0;
		@Pc(29) String local29 = arg2[local23];
		arg2[local23] = arg2[arg3];
		arg2[arg3] = local29;
		@Pc(43) short local43 = arg1[local23];
		arg1[local23] = arg1[arg3];
		arg1[arg3] = local43;
		for (@Pc(55) int local55 = arg0; local55 < arg3; local55++) {
			if (local29 == null || arg2[local55] != null && (local55 & 0x1) > arg2[local55].compareTo(local29)) {
				@Pc(76) String local76 = arg2[local55];
				arg2[local55] = arg2[local25];
				arg2[local25] = local76;
				@Pc(90) short local90 = arg1[local55];
				arg1[local55] = arg1[local25];
				arg1[local25++] = local90;
			}
		}
		arg2[arg3] = arg2[local25];
		arg2[local25] = local29;
		arg1[arg3] = arg1[local25];
		arg1[local25] = local43;
		method5546(arg0, arg1, arg2, local25 - 1);
		method5546(local25 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(B)V")
	public static void method5549() {
		Static383.anInt6416 = 0;
		Static34.anInt590 = 0;
		Static365.anInt6147 = 0;
		Static210.anInt3710 = 0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5554(@OriginalArg(0) String arg0) {
		Static24.method309("", arg0, "", 0, 0);
	}
}
