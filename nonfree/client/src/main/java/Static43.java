import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cm", name = "C", descriptor = "Ljava/lang/StringBuffer;")
	public static StringBuffer aStringBuffer3 = new StringBuffer(100);

	@OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
	public static int anInt2517 = 0;

	@OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
	public static int anInt2518 = 256;

	@OriginalMember(owner = "client!cm", name = "G", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39 = new String[100];

	@OriginalMember(owner = "client!cm", name = "H", descriptor = "I")
	public static int anInt2519 = 0;

	@OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
	public static int anInt2520 = 0;

	@OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
	public static int anInt2521 = -1;

	@OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
	public static int anInt2522 = 0;

	@OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
	public static int anInt2523 = -1;

	@OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
	public static int anInt2524 = -1;

	@OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
	public static int anInt2525 = -1;

	@OriginalMember(owner = "client!cm", name = "Q", descriptor = "I")
	public static int anInt2526 = 256;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method2020(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg2[arg5];
		@Pc(9) int local9 = local3 + arg4[arg5];
		@Pc(13) int local13 = arg2[arg6];
		@Pc(19) int local19 = local13 + arg4[arg6];
		@Pc(21) int local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(37) int local37 = arg3[arg5];
		if (arg3[arg6] < local37) {
			local37 = arg3[arg6];
		}
		@Pc(50) byte[] local50 = arg1[arg5];
		@Pc(54) byte[] local54 = arg0[arg6];
		@Pc(58) int local58 = local21 - local3;
		@Pc(62) int local62 = local21 - local13;
		for (@Pc(64) int local64 = local21; local64 < local28; local64++) {
			@Pc(77) int local77 = local50[local58++] + local54[local62++];
			if (local77 < local37) {
				local37 = local77;
			}
		}
		return -local37;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public static String method2024(@OriginalArg(0) String arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 == '<' || local13 == '>') {
				local4 += 3;
			}
		}
		@Pc(29) StringBuffer local29 = new StringBuffer(local2 + local4);
		for (@Pc(31) int local31 = 0; local31 < local2; local31++) {
			@Pc(38) char local38 = arg0.charAt(local31);
			if (local38 == '<') {
				local29.append("<lt>");
			} else if (local38 == '>') {
				local29.append("<gt>");
			} else {
				local29.append(local38);
			}
		}
		return local29.toString();
	}
}
