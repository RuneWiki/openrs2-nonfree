import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
	public static int anInt706;

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "Lclient!l;")
	public static Class17 aClass17_6;

	@OriginalMember(owner = "client!bw", name = "w", descriptor = "I")
	public static int anInt717;

	@OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
	public static int anInt715 = 1;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)Z")
	public static boolean method605(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(III)Z")
	public static boolean method607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II[B[BIIIBI)V")
	public static void method608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg4++;
				arg3[local34] = (byte) (arg3[local34] - arg2[arg0++]);
				@Pc(47) int local47 = arg4++;
				arg3[local47] = (byte) (arg3[local47] - arg2[arg0++]);
				@Pc(60) int local60 = arg4++;
				arg3[local60] = (byte) (arg3[local60] - arg2[arg0++]);
				@Pc(73) int local73 = arg4++;
				arg3[local73] = (byte) (arg3[local73] - arg2[arg0++]);
			}
			for (@Pc(92) int local92 = local15; local92 < 0; local92++) {
				local34 = arg4++;
				arg3[local34] = (byte) (arg3[local34] - arg2[arg0++]);
			}
			arg0 += arg7;
			arg4 += arg6;
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V")
	public static void method609() {
		Static147.aClass171_53.method3936();
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method611(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static337.anInt5822;
		@Pc(9) int[] local9 = Static203.anIntArray384;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class3_Sub2_Sub1_Sub2 local21 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local9[local13]];
			if (local21 != null && local21 != Static375.aClass3_Sub2_Sub1_Sub2_7 && local21.aString56 != null && local21.aString56.equalsIgnoreCase(arg1)) {
				local11 = true;
				if (arg0 == 1) {
					Static159.method2586(Static202.aClass54_55);
					Static424.aClass2_Sub23_Sub2_1.method5454(local9[local13]);
					Static424.aClass2_Sub23_Sub2_1.method5449(0);
				} else if (arg0 == 4) {
					Static159.method2586(Static416.aClass54_100);
					Static424.aClass2_Sub23_Sub2_1.method5449(0);
					Static424.aClass2_Sub23_Sub2_1.method5470(local9[local13]);
				} else if (arg0 == 5) {
					Static159.method2586(Static336.aClass54_85);
					Static424.aClass2_Sub23_Sub2_1.method5454(local9[local13]);
					Static424.aClass2_Sub23_Sub2_1.method5489(0);
				} else if (arg0 == 6) {
					Static159.method2586(Static17.aClass54_10);
					Static424.aClass2_Sub23_Sub2_1.method5449(0);
					Static424.aClass2_Sub23_Sub2_1.method5502(local9[local13]);
				} else if (arg0 == 7) {
					Static159.method2586(Static129.aClass54_42);
					Static424.aClass2_Sub23_Sub2_1.method5454(local9[local13]);
					Static424.aClass2_Sub23_Sub2_1.method5459(0);
				}
				break;
			}
		}
		if (!local11) {
			Static321.method4516(Static250.aClass209_105.method4562(Static388.anInt6533) + arg1);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
	public static byte[] method614(@OriginalArg(0) Object arg0, @OriginalArg(2) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg0;
			return Static94.method1808(arg1, local21);
		} else if (arg0 instanceof Class13) {
			@Pc(35) Class13 local35 = (Class13) arg0;
			return local35.method266(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "(I)V")
	public static void method616() {
		@Pc(1) Class171 local1 = Static387.aClass171_52;
		synchronized (Static387.aClass171_52) {
			Static387.aClass171_52.method3936();
		}
	}
}
