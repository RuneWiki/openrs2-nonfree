import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "I")
	public static int anInt6146;

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_100 = new Class287(56, 0);

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_202 = new Class123(94, 10);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)I")
	public static int method4969(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)Z")
	public static boolean method4970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 | Static395.method5583(arg0, arg1) || Static81.method1881(arg0, arg1);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!pca;Ljava/lang/String;BILclient!la;IILclient!ufa;ILclient!ua;I)V")
	public static void method4972(@OriginalArg(0) int arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class63 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class328 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class53 arg9, @OriginalArg(11) int arg10) {
		@Pc(19) int local19;
		if (Static188.anInt4080 == 4) {
			local19 = (int) Static209.aFloat229 & 0x3FFF;
		} else {
			local19 = (int) Static209.aFloat229 + Static270.anInt5118 & 0x3FFF;
		}
		@Pc(38) int local38 = Math.max(arg1.anInt7285 / 2, arg1.anInt7215 / 2) + 10;
		@Pc(47) int local47 = arg10 * arg10 + arg3 * arg3;
		if (local38 * local38 < local47) {
			return;
		}
		@Pc(57) int local57 = Class3_Sub28.anIntArray232[local19];
		@Pc(61) int local61 = Class3_Sub28.anIntArray231[local19];
		if (Static188.anInt4080 != 4) {
			local57 = local57 * 256 / (Static350.anInt6241 + 256);
			local61 = local61 * 256 / (Static350.anInt6241 + 256);
		}
		@Pc(93) int local93 = arg3 * local57 + local61 * arg10 >> 14;
		@Pc(104) int local104 = local61 * arg3 - arg10 * local57 >> 14;
		@Pc(111) int local111 = arg7.method7368(null, arg2, 100);
		@Pc(119) int local119 = arg7.method7369(arg2, null, 0, 100);
		@Pc(125) int local125 = local93 - local111 / 2;
		if (local125 >= -arg1.anInt7285 && arg1.anInt7285 >= local125 && -arg1.anInt7215 <= local104 && arg1.anInt7215 >= local104) {
			arg4.method6882(local111, arg6, 0, arg0, null, arg0 + arg1.anInt7215 / 2 - local104 - arg8 - local119, arg2, 1, arg1.anInt7285 / 2 + arg5 + local125, 0, arg5, 0, arg9, null, 50);
		}
	}
}
