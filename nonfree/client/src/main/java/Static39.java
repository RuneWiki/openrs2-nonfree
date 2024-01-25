import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "Lclient!cq;")
	public static Class8 aClass8_13;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
	public static int anInt1002 = 0;

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString35 = "Hidden";

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V")
	public static void method785(@OriginalArg(0) int arg0) {
		Static111.anIntArray187 = new int[arg0];
		Static142.anIntArray277 = new int[arg0];
		Static207.anIntArray398 = new int[arg0];
		Static25.anIntArray25 = new int[arg0];
		Static67.anIntArray105 = new int[arg0];
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)Lclient!hi;")
	public static Class96 method789(@OriginalArg(1) int arg0) {
		@Pc(10) Class96 local10 = (Class96) Static223.aClass37_30.method915((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static293.aClass134_130.method3009(arg0, 30);
		local10 = new Class96();
		if (local20 != null) {
			local10.method1836(new Class1_Sub21(local20), arg0);
		}
		Static223.aClass37_30.method922((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!wj;")
	public static Class168 method790(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class168_Sub1");
			@Pc(15) Class168 local15 = (Class168) local11.getDeclaredConstructor().newInstance();
			local15.method5329(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class168_Sub2 local26 = new Class168_Sub2();
			local26.method5329(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
	public static void method793() {
		@Pc(8) Class1_Sub2_Sub15 local8 = Static17.method307(15, 0);
		local8.method4782();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIILclient!ii;Lclient!ps;)V")
	public static void method794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class105 arg2, @OriginalArg(4) Class163 arg3) {
		if (arg3.anInt4934 == 2) {
			for (@Pc(62) int local62 = arg1; local62 <= arg0; local62++) {
				@Pc(71) int local71 = arg3.anIntArray461[local62] - 1;
				if (local71 != -1) {
					@Pc(106) boolean local106;
					if (Static254.anInt5233 == 1 && Static151.anInt3083 == local62 && Static223.anInt1490 == arg3.anInt4947) {
						local106 = Static269.method4846(local71, arg3.anIntArray460[local62], arg2, 0, null, 2, arg3.anInt4919) == null;
						if (local106) {
							Static44.aClass14_3.method300(new Class1_Sub32(local71, arg3.anIntArray460[local62], 2, 0, arg3.anInt4919, false));
						}
					} else {
						local106 = Static269.method4846(local71, arg3.anIntArray460[local62], arg2, -13623264, null, 1, arg3.anInt4919) == null;
						if (local106) {
							Static44.aClass14_3.method300(new Class1_Sub32(local71, arg3.anIntArray460[local62], 1, -13623264, arg3.anInt4919, false));
						}
					}
				}
			}
		} else if (arg3.anInt4934 == 5) {
			@Pc(36) boolean local36 = Static269.method4846(arg3.anInt4924, arg3.anInt5006, arg2, arg3.anInt4968 | 0xFF000000, arg3.aBoolean408 ? Static127.aClass10_Sub1_Sub2_Sub2_1.aClass136_1 : null, arg3.anInt4967, arg3.anInt4919) == null;
			if (local36) {
				Static44.aClass14_3.method300(new Class1_Sub32(arg3.anInt4924, arg3.anInt5006, arg3.anInt4967, arg3.anInt4968 | 0xFF000000, arg3.anInt4919, arg3.aBoolean408));
			}
		}
	}
}
