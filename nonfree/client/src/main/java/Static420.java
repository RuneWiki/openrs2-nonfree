import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Z")
	public static boolean aBoolean673 = false;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_112 = new Class276(50, 8);

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray31 = new boolean[100];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Z")
	public static boolean method6744() {
		return Static309.anInt6170 > 0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)I")
	public static int method6746(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIII)V")
	public static void method6747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class38 local3 = new Class38();
		local3.anInt1216 = arg1 >> Static309.anInt6172;
		local3.anInt1214 = arg2 >> Static309.anInt6172;
		local3.anInt1223 = arg3 >> Static309.anInt6172;
		local3.anInt1218 = arg4 >> Static309.anInt6172;
		local3.anInt1208 = arg0;
		local3.anInt1220 = arg1;
		local3.anInt1225 = arg2;
		local3.anInt1213 = arg3;
		local3.anInt1224 = arg4;
		local3.anInt1219 = arg5;
		local3.anInt1215 = arg6;
		Static189.aClass38Array2[Static141.anInt3256++] = local3;
	}
}
