import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "F")
	public static float aFloat74;

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
	public static int anInt5181 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
	public static void method4094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static434.aClass165_Sub1_1.anInt4205 != 0 && arg0 != 0 && Static126.anInt2092 < 50 && arg4 != -1) {
			Static409.aClass253Array2[Static126.anInt2092++] = new Class253((byte) 1, arg4, arg0, arg3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)I")
	public static int method4095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(26) int local26 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local26;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
	public static void method4096() {
		Static111.aClass220_8.method5105();
		Static57.aClass71_1.method1429();
		Static429.aClass71_10.method1429();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method4097(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) long local31 = arg0; local31 != 0L; local31 /= 37L) {
				local29++;
			}
			@Pc(47) StringBuffer local47 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(51) long local51 = arg0;
				arg0 /= 37L;
				local47.append(Static105.aCharArray2[(int) (local51 - arg0 * 37L)]);
			}
			return local47.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZIII)V")
	public static void method4098(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) long local19 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		@Pc(25) Class2_Sub12 local25 = (Class2_Sub12) Static261.aClass220_23.method5099(local19);
		if (local25 == null) {
			local25 = new Class2_Sub12();
			Static261.aClass220_23.method5104(local25, local19);
		}
		if (local25.anIntArray212.length <= arg2) {
			@Pc(50) int[] local50 = new int[arg2 + 1];
			@Pc(55) int[] local55 = new int[arg2 + 1];
			for (@Pc(57) int local57 = 0; local57 < local25.anIntArray212.length; local57++) {
				local50[local57] = local25.anIntArray212[local57];
				local55[local57] = local25.anIntArray213[local57];
			}
			for (@Pc(87) int local87 = local25.anIntArray212.length; local87 < arg2; local87++) {
				local50[local87] = -1;
				local55[local87] = 0;
			}
			local25.anIntArray212 = local50;
			local25.anIntArray213 = local55;
		}
		local25.anIntArray212[arg2] = arg4;
		local25.anIntArray213[arg2] = arg3;
	}
}
