import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
	public static int anInt867;

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
	public static int anInt870;

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
	public static int anInt864 = 0;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([II[JII)V")
	public static void method757(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(11) int local11 = (arg3 + arg2) / 2;
		@Pc(13) int local13 = arg2;
		@Pc(17) long local17 = arg1[local11];
		arg1[local11] = arg1[arg3];
		arg1[arg3] = local17;
		@Pc(31) int local31 = arg0[local11];
		arg0[local11] = arg0[arg3];
		arg0[arg3] = local31;
		for (@Pc(43) int local43 = arg2; local43 < arg3; local43++) {
			if (local17 + (long) (local43 & 0x1) > arg1[local43]) {
				@Pc(62) long local62 = arg1[local43];
				arg1[local43] = arg1[local13];
				arg1[local13] = local62;
				@Pc(76) int local76 = arg0[local43];
				arg0[local43] = arg0[local13];
				arg0[local13++] = local76;
			}
		}
		arg1[arg3] = arg1[local13];
		arg1[local13] = local17;
		arg0[arg3] = arg0[local13];
		arg0[local13] = local31;
		method757(arg0, arg1, arg2, local13 - 1);
		method757(arg0, arg1, local13 + 1, arg3);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method760(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub2_Sub11 local13 = Static5.method35(arg1, 2);
		local13.method2866();
		local13.aString190 = arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	public static void method761() {
		Static247.aClass187_126.method4530();
		Static16.aClass187_158.method4530();
	}
}
