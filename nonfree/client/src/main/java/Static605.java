import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method8279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static417.aBoolean571 || !Static253.aBoolean399) {
			return false;
		} else if (Static141.anInt3106 < 100) {
			return false;
		} else {
			@Pc(38) int local38;
			@Pc(42) int local42;
			if (arg1 != arg4 || arg0 != arg3) {
				for (local38 = arg1; local38 <= arg4; local38++) {
					for (local42 = arg3; local42 <= arg0; local42++) {
						if (-Static411.anInt7540 == Static22.anIntArrayArrayArray21[arg2][local38][local42]) {
							return false;
						}
					}
				}
				local42 = (arg1 << Static415.anInt7579) + 1;
				@Pc(105) int local105 = (arg3 << Static415.anInt7579) + 2;
				if (Static24.method592((arg0 + 1 - arg3) * Static312.anInt5690, local42, Static331.aClass112Array3[arg2].method7819(arg3, arg1), (arg4 + 1 - arg1) * Static312.anInt5690, local105, arg5)) {
					Static33.anInt861++;
					return true;
				} else {
					return false;
				}
			} else if (Static182.method3302(arg2, arg3, arg1)) {
				local38 = arg1 << Static415.anInt7579;
				local42 = arg3 << Static415.anInt7579;
				if (Static24.method592(Static312.anInt5690, local38, Static331.aClass112Array3[arg2].method7819(arg3, arg1), Static312.anInt5690, local42, arg5)) {
					Static33.anInt861++;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIILclient!ha;IIILclient!bj;IIB)V")
	public static void method8281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class87 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub5_Sub2 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg3 > arg2 && arg0 + arg2 > arg3 && arg1 - 13 < arg5 && arg1 + 3 > arg5) {
			arg9 = arg10;
		}
		@Pc(43) String local43 = Static475.method7385(arg8);
		Static4.aClass64_1.method7506(arg9, arg2 + 3, arg1, local43, Static185.aClass20Array5, Static67.anIntArray140);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[IZZIIILclient!oea;)Lclient!m;")
	public static Class88_Sub2_Sub1 method8282(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class87_Sub2 arg5) {
		if (arg5.aBoolean550 || Static504.method7825(arg3) && Static504.method7825(arg0)) {
			return new Class88_Sub2_Sub1(arg5, 3553, arg3, arg0, false, arg1, arg4, 0);
		} else if (arg5.aBoolean538) {
			return new Class88_Sub2_Sub1(arg5, 34037, arg3, arg0, false, arg1, arg4, 0);
		} else {
			return new Class88_Sub2_Sub1(arg5, arg3, arg0, Static347.method5404(arg3), Static347.method5404(arg0), arg1);
		}
	}
}
