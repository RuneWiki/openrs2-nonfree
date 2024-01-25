import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!r", name = "j", descriptor = "F")
	public static float aFloat180;

	@OriginalMember(owner = "client!r", name = "o", descriptor = "Lclient!dba;")
	public static Class63 aClass63_20;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)[Lclient!pa;")
	public static Class249[] method7373() {
		return new Class249[] { Static361.aClass249_22, Static559.aClass249_24, Static271.aClass249_12 };
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!fa;Ljava/awt/Canvas;ILclient!tf;)Lclient!r;")
	public static synchronized Class45 method7375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface3 arg2, @OriginalArg(3) Canvas arg3, @OriginalArg(5) Class322 arg4) {
		if (arg0 == 0) {
			return Static491.method6648(arg2, arg3);
		} else if (arg0 == 2) {
			return Static315.method4623(arg2, arg3);
		} else if (arg0 == 1) {
			return Static261.method3995(arg1, arg2, arg3);
		} else if (arg0 == 5) {
			return Static76.method1596(arg4, arg2, arg1, arg3);
		} else if (arg0 == 3) {
			return Static603.method5040(arg4, arg3, arg1, arg2);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BIIIII)I")
	public static int method7377(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static68.aClass34Array1 == null) {
			return 0;
		}
		if (arg1 < 3) {
			@Pc(19) int local19 = arg3 >> 9;
			@Pc(23) int local23 = arg0 >> 9;
			if (arg4 < 0 || arg2 < 0 || arg4 > Static54.anInt1038 - 1 || arg2 > Static140.anInt3026 - 1) {
				return 0;
			}
			if (local19 < 1 || local23 < 1 || local19 > Static54.anInt1038 - 1 || Static140.anInt3026 - 1 < local23) {
				return 0;
			}
			@Pc(86) boolean local86 = (Static503.aByteArrayArrayArray11[1][arg3 >> 9][arg0 >> 9] & 0x2) != 0;
			@Pc(111) boolean local111;
			@Pc(130) boolean local130;
			if ((arg3 & 0x1FF) == 0) {
				local111 = (Static503.aByteArrayArrayArray11[1][local19 - 1][arg0 >> 9] & 0x2) != 0;
				local130 = (Static503.aByteArrayArrayArray11[1][local19][arg0 >> 9] & 0x2) != 0;
				if (local130 != local111) {
					local86 = (Static503.aByteArrayArrayArray11[1][arg4][arg2] & 0x2) != 0;
				}
			}
			if ((arg0 & 0x1FF) == 0) {
				local111 = (Static503.aByteArrayArrayArray11[1][arg3 >> 9][local23 - 1] & 0x2) != 0;
				local130 = (Static503.aByteArrayArrayArray11[1][arg3 >> 9][local23] & 0x2) != 0;
				if (local130 != local111) {
					local86 = (Static503.aByteArrayArrayArray11[1][arg4][arg2] & 0x2) != 0;
				}
			}
			if (local86) {
				arg1++;
			}
		}
		return Static68.aClass34Array1[arg1].method6530(arg3, arg0);
	}
}
