import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static654 {

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "Lclient!sja;")
	public static Class342 aClass342_80;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "I")
	public static int anInt10061;

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "Lclient!nda;")
	public static Class258 aClass258_4;

	@OriginalMember(owner = "client!uia", name = "e", descriptor = "Lclient!ik;")
	public static Class182 aClass182_121;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IC)Z")
	public static boolean method8579(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(45) char[] local45 = Static145.aCharArray8;
			for (@Pc(47) int local47 = 0; local47 < local45.length; local47++) {
				@Pc(53) char local53 = local45[local47];
				if (local53 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(I[Ljava/lang/String;BI[I)V")
	public static void method8581(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(28) int local28 = (arg2 + arg0) / 2;
		@Pc(30) int local30 = arg2;
		@Pc(34) String local34 = arg1[local28];
		arg1[local28] = arg1[arg0];
		arg1[arg0] = local34;
		@Pc(48) int local48 = arg3[local28];
		arg3[local28] = arg3[arg0];
		arg3[arg0] = local48;
		for (@Pc(60) int local60 = arg2; local60 < arg0; local60++) {
			if (local34 == null || arg1[local60] != null && (local60 & 0x1) > arg1[local60].compareTo(local34)) {
				@Pc(91) String local91 = arg1[local60];
				arg1[local60] = arg1[local30];
				arg1[local30] = local91;
				@Pc(105) int local105 = arg3[local60];
				arg3[local60] = arg3[local30];
				arg3[local30++] = local105;
			}
		}
		arg1[arg0] = arg1[local30];
		arg1[local30] = local34;
		arg3[arg0] = arg3[local30];
		arg3[local30] = local48;
		method8581(local30 - 1, arg1, arg2, arg3);
		method8581(arg0, arg1, local30 + 1, arg3);
	}
}
