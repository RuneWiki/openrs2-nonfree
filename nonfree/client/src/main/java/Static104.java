import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!ev", name = "P", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_42 = new Class27(34, 0);

	@OriginalMember(owner = "client!ev", name = "R", descriptor = "I")
	public static int anInt2112 = 0;

	@OriginalMember(owner = "client!ev", name = "T", descriptor = "Lclient!mf;")
	public static final Class163 aClass163_19 = new Class163();

	@OriginalMember(owner = "client!ev", name = "V", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!ev", name = "W", descriptor = "[J")
	public static final long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!ev", name = "X", descriptor = "I")
	public static int anInt2115 = 0;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IILclient!za;Lclient!l;III)V")
	public static void method1822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static264.anInt4667 < 100) {
			Static175.method1577(arg2, arg3);
		}
		arg2.ba(arg1, arg4, arg5 + arg1, arg0 + arg4);
		@Pc(37) int local37;
		@Pc(56) int local56;
		if (Static264.anInt4667 < 100) {
			local37 = arg5 / 2 + arg1;
			arg2.P(arg1, arg4, arg5, arg0, -16777216, 0);
			local56 = arg4 + arg0 / 2 - 20 - 18;
			arg2.method5811(local37 - 152, local56, 304, 34, Static92.aColorArray4[Static397.anInt6720].getRGB(), 0);
			arg2.P(local37 - 150, local56 + 2, Static264.anInt4667 * 3, 30, Static344.aColorArray6[Static397.anInt6720].getRGB(), 0);
			Static330.aClass57_3.method5953(local37, Static200.aClass182_135.method4155(Static191.anInt3842), Static164.aColorArray5[Static397.anInt6720].getRGB(), local56 + 20, -1);
			return;
		}
		@Pc(112) int local112 = Static90.anInt1909 - (int) ((float) arg5 / Static143.aFloat50);
		local37 = Static55.anInt999 + (int) ((float) arg0 / Static143.aFloat50);
		local56 = (int) ((float) arg5 / Static143.aFloat50) + Static90.anInt1909;
		Static316.anInt5456 = (int) ((float) (arg5 * 2) / Static143.aFloat50);
		Static400.anInt6751 = Static55.anInt999 - (int) ((float) arg0 / Static143.aFloat50);
		@Pc(155) int local155 = Static55.anInt999 - (int) ((float) arg0 / Static143.aFloat50);
		Static366.anInt6329 = (int) ((float) (arg0 * 2) / Static143.aFloat50);
		Static323.anInt5541 = Static90.anInt1909 - (int) ((float) arg5 / Static143.aFloat50);
		Static143.method2386(local112 + Static143.anInt2867, local37 + Static143.anInt2863, Static143.anInt2867 + local56, local155 + Static143.anInt2863, arg1, arg4, arg1 + arg5, arg0 + 1 + arg4);
		Static143.method2379(arg2);
		@Pc(201) Class163 local201 = Static143.method2376(arg2);
		Static52.method874(local201, arg2);
		if (Static301.anInt5208 > 0) {
			Static351.anInt6021--;
			if (Static351.anInt6021 == 0) {
				Static351.anInt6021 = 20;
				Static301.anInt5208--;
			}
		}
		if (!Static419.aBoolean462) {
			return;
		}
		@Pc(229) int local229 = arg1 + arg5 - 5;
		@Pc(236) int local236 = arg4 + arg0 - 8;
		Static114.aClass57_4.method5958("Fps:" + Static273.anInt4775, local236, local229, 16776960);
		@Pc(251) int local251 = local236 - 15;
		@Pc(253) Runtime local253 = Runtime.getRuntime();
		@Pc(262) int local262 = (int) ((local253.totalMemory() - local253.freeMemory()) / 1024L);
		@Pc(264) int local264 = 16776960;
		if (local262 > 65536) {
			local264 = 16711680;
		}
		Static114.aClass57_4.method5958("Mem:" + local262 + "k", local251, local229, local264);
		local236 = local251 - 15;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V")
	public static void method1823(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		Static178.method2949(-1, null, arg2, arg3, arg1, arg0, arg4);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 < 0 || arg4 < 0 || arg2 >= Static2.anInt7 - 1 || Static17.anInt315 - 1 <= arg4) {
			return;
		}
		if (Static309.aClass11ArrayArrayArray2 == null) {
			return;
		}
		@Pc(39) Interface10 local39;
		if (arg1 != 0) {
			if (arg1 == 1) {
				local39 = (Interface10) Static137.method2391(arg3, arg2, arg4);
				if (local39 != null) {
					if (local39 instanceof Class24_Sub1_Sub1) {
						((Class24_Sub1_Sub1) local39).aClass133_1.method3160(arg5);
						return;
					}
					@Pc(57) int local57 = local39.method5706();
					if (arg0 != 4 && arg0 != 5) {
						if (arg0 == 6) {
							Static50.method855(4, arg1, arg2, arg3, arg4, arg5, local57, arg6 + 4);
						} else if (arg0 == 7) {
							Static50.method855(4, arg1, arg2, arg3, arg4, arg5, local57, (arg6 + 2 & 0x3) + 4);
							return;
						} else if (arg0 == 8) {
							Static50.method855(4, arg1, arg2, arg3, arg4, arg5, local57, arg6 + 4);
							Static50.method855(4, arg1, arg2, arg3, arg4, arg5, local57, (arg6 + 2 & 0x3) + 4);
							return;
						}
						return;
					}
					Static50.method855(4, arg1, arg2, arg3, arg4, arg5, local57, arg6);
					return;
				}
				return;
			}
			if (arg1 != 2) {
				if (arg1 == 3) {
					local39 = (Interface10) Static447.method5138(arg3, arg2, arg4);
					if (local39 != null) {
						if (!(local39 instanceof Class24_Sub4_Sub2)) {
							Static50.method855(arg0, arg1, arg2, arg3, arg4, arg5, local39.method5706(), arg6);
							return;
						}
						((Class24_Sub4_Sub2) local39).aClass133_2.method3160(arg5);
						return;
					}
				}
				return;
			}
			local39 = (Interface10) Static106.method1867(arg3, arg2, arg4, rj.class);
			if (local39 != null) {
				if (arg0 == 11) {
					arg0 = 10;
				}
				if (!(local39 instanceof Class24_Sub3_Sub6)) {
					Static50.method855(arg0, arg1, arg2, arg3, arg4, arg5, local39.method5706(), arg6);
					return;
				}
				((Class24_Sub3_Sub6) local39).aClass133_3.method3160(arg5);
				return;
			}
			return;
		}
		local39 = (Interface10) Static96.method1755(arg3, arg2, arg4);
		@Pc(245) Interface10 local245 = (Interface10) Static140.method2396(arg3, arg2, arg4);
		if (local39 != null && arg0 != 2) {
			if (local39 instanceof Class24_Sub5_Sub3) {
				((Class24_Sub5_Sub3) local39).aClass133_4.method3160(arg5);
			} else {
				Static50.method855(arg0, arg1, arg2, arg3, arg4, arg5, local39.method5706(), arg6);
			}
		}
		if (local245 == null) {
			return;
		}
		if (!(local245 instanceof Class24_Sub5_Sub3)) {
			Static50.method855(arg0, arg1, arg2, arg3, arg4, arg5, local245.method5706(), arg6);
			return;
		}
		((Class24_Sub5_Sub3) local245).aClass133_4.method3160(arg5);
		return;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(BIIII)V")
	public static void method1825(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static115.anInt2362 <= arg0 - arg1 && Static146.anInt3034 >= arg1 + arg0 && Static319.anInt5496 <= arg3 - arg1 && arg3 + arg1 <= Static160.anInt3220) {
			Static323.method4425(arg1, arg0, arg3, arg2);
		} else {
			Static318.method4368(arg1, arg3, arg0, arg2);
		}
	}
}
