import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_57 = new Class132(4);

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_100 = new Class134("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V")
	public static void method5306(@OriginalArg(0) int arg0) {
		if (arg0 == Static307.anInt5290) {
			return;
		}
		Static166.anInt2852 = Static426.anInt6923 = Static76.anIntArray122[arg0];
		Static127.method1895();
		Static202.anIntArrayArray18 = new int[Static166.anInt2852][Static426.anInt6923];
		Static353.anIntArrayArray49 = new int[Static166.anInt2852][Static426.anInt6923];
		Static121.anIntArrayArrayArray1 = new int[4][Static166.anInt2852 >> 3][Static426.anInt6923 >> 3];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static361.aClass71Array1[local36] = Static338.method4532(Static426.anInt6923, Static166.anInt2852);
		}
		Static111.aByteArrayArrayArray1 = new byte[4][Static166.anInt2852][Static426.anInt6923];
		Static447.method5635(Static426.anInt6923, Static166.anInt2852);
		Static264.method3521(Static426.anInt6923 >> 3, Static82.aClass163_1, Static166.anInt2852 >> 3);
		Static307.anInt5290 = arg0;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)Z")
	public static boolean method5307() {
		if (Static359.aBoolean442) {
			try {
				Static469.method4194("showVideoAd", Static79.aClass183_2.anApplet1);
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIILclient!or;IB)Ljava/awt/Frame;")
	public static Frame method5308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class183 arg3) {
		if (!arg3.method3924()) {
			return null;
		}
		@Pc(26) Class238[] local26 = Static125.method1836(arg3);
		if (local26 == null) {
			return null;
		}
		@Pc(32) boolean local32 = false;
		for (@Pc(34) int local34 = 0; local34 < local26.length; local34++) {
			if (local26[local34].anInt6531 == arg0 && arg1 == local26[local34].anInt6530 && (!local32 || local26[local34].anInt6534 > arg2)) {
				arg2 = local26[local34].anInt6534;
				local32 = true;
			}
		}
		if (!local32) {
			return null;
		}
		@Pc(95) Class91 local95 = arg3.method3925(arg2, arg1, arg0);
		while (local95.anInt2446 == 0) {
			Static429.method5376(10L);
		}
		@Pc(110) Frame local110 = (Frame) local95.anObject3;
		if (local110 == null) {
			return null;
		} else if (local95.anInt2446 == 2) {
			Static128.method1909(local110, arg3);
			return null;
		} else {
			return local110;
		}
	}
}
