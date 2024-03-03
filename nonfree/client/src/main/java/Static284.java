import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString57;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZ)V", line = 6)
	public static void method5256(@OriginalArg(0) int arg0) {
		if (!Static203.aClass177_Sub1_2.aBoolean363) {
			arg0 = -1;
		}
		if (Class11_Sub2_Sub1.anInt721 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class220 local25 = Static206.aClass150_3.method3732(arg0);
			@Pc(29) Class48 local29 = local25.method5659();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static305.aClass152_5.method3771(local29.method1682(), new Point(local25.anInt6191, local25.anInt6188), local29.method1687(), Static21.aCanvas1, local29.method1685());
				Class11_Sub2_Sub1.anInt721 = arg0;
			}
		}
		if (arg0 == -1 && Class11_Sub2_Sub1.anInt721 != -1) {
			Static305.aClass152_5.method3771(-1, new Point(), null, Static21.aCanvas1, -1);
			Class11_Sub2_Sub1.anInt721 = -1;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILclient!oe;BI)V", line = 46)
	public static void method5257(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub5_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt4589 && arg0 != -1) {
			@Pc(78) Class157 local78 = Static37.aClass85_1.method2373(arg0);
			@Pc(81) int local81 = local78.anInt4017;
			if (local81 == 1) {
				arg1.anInt4584 = 1;
				arg1.anInt4615 = 0;
				arg1.anInt4599 = 0;
				arg1.anInt4582 = arg2;
				arg1.anInt4590 = 0;
				Static1.method4(local78, false, arg1.aByte78, arg1.anInt6768, arg1.anInt6770, arg1.anInt4599);
			}
			if (local81 == 2) {
				arg1.anInt4590 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt4589 == -1 || Static37.aClass85_1.method2373(arg0).anInt4018 >= Static37.aClass85_1.method2373(arg1.anInt4589).anInt4018) {
			arg1.anInt4589 = arg0;
			arg1.anInt4590 = 0;
			arg1.anInt4599 = 0;
			arg1.anInt4615 = 0;
			arg1.anInt4584 = 1;
			arg1.anInt4582 = arg2;
			arg1.anInt4633 = arg1.anInt4634;
			if (arg1.anInt4589 != -1) {
				Static1.method4(Static37.aClass85_1.method2373(arg1.anInt4589), false, arg1.aByte78, arg1.anInt6768, arg1.anInt6770, arg1.anInt4599);
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)J", line = 102)
	public static long method5258() {
		return Static293.aClass5_1.method4406();
	}
}
