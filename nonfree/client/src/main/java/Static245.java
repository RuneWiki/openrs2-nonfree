import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!nr", name = "J", descriptor = "Lclient!aq;")
	public static Class5 aClass5_5;

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
	public static final int anInt4396 = 1339;

	@OriginalMember(owner = "client!nr", name = "H", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_131 = new Class41(27, 16);

	@OriginalMember(owner = "client!nr", name = "I", descriptor = "[I")
	public static final int[] anIntArray543 = new int[32];

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)I")
	public static int method3905() {
		if ((double) Static302.aFloat6 == 3.0D) {
			return 37;
		} else if ((double) Static302.aFloat6 == 4.0D) {
			return 50;
		} else if ((double) Static302.aFloat6 == 6.0D) {
			return 75;
		} else if ((double) Static302.aFloat6 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!km;Lclient!kj;III)V")
	public static void method3906(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class227 local12;
		if (arg3 < Static166.anInt2967) {
			local12 = Static297.aClass227ArrayArrayArray7[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass12_Sub5_2 != null && local12.aClass12_Sub5_2.method5455()) {
				arg1.method5454(Static292.anInt5158, arg0, 0, true, 0, local12.aClass12_Sub5_2);
			}
		}
		if (arg4 < Static166.anInt2967) {
			local12 = Static297.aClass227ArrayArrayArray7[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass12_Sub5_2 != null && local12.aClass12_Sub5_2.method5455()) {
				arg1.method5454(0, arg0, 0, true, Static292.anInt5158, local12.aClass12_Sub5_2);
			}
		}
		if (arg3 < Static166.anInt2967 && arg4 < Static244.anInt1024) {
			local12 = Static297.aClass227ArrayArrayArray7[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass12_Sub5_2 != null && local12.aClass12_Sub5_2.method5455()) {
				arg1.method5454(Static292.anInt5158, arg0, 0, true, Static292.anInt5158, local12.aClass12_Sub5_2);
			}
		}
		if (arg3 < Static166.anInt2967 && arg4 > 0) {
			local12 = Static297.aClass227ArrayArrayArray7[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass12_Sub5_2 != null && local12.aClass12_Sub5_2.method5455()) {
				arg1.method5454(Static292.anInt5158, arg0, 0, true, -Static292.anInt5158, local12.aClass12_Sub5_2);
			}
		}
	}
}
