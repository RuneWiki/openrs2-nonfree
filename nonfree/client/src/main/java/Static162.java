import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	public static int anInt3405;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "[[Lclient!sn;")
	public static Class188[][] aClass188ArrayArray1;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "[I")
	public static final int[] anIntArray299 = new int[100];

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "[I")
	public static final int[] anIntArray300 = new int[50];

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIZZ)V")
	public static void method3224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		Static233.anInt4556 = arg0;
		Static180.anInt3712 = arg1;
		Static312.anInt6032 = arg2;
		Static82.aClass213ArrayArrayArray1 = new Class213[4][Static233.anInt4556][Static180.anInt3712];
		Static18.aClass114Array1 = new Class114[4];
		if (arg3) {
			Static342.aClass213ArrayArrayArray3 = new Class213[1][Static233.anInt4556][Static180.anInt3712];
			Static238.anIntArrayArray77 = new int[Static233.anInt4556][Static180.anInt3712];
			Static341.aClass114Array3 = new Class114[1];
		} else {
			Static342.aClass213ArrayArrayArray3 = null;
			Static238.anIntArrayArray77 = null;
			Static341.aClass114Array3 = null;
		}
		if (arg4) {
			Static118.anIntArrayArrayArray3 = new int[4][arg0][arg1];
			Static127.aClass14_Sub13_Sub1Array1 = new Class14_Sub13_Sub1[255];
			Static124.aBooleanArray13 = new boolean[255];
			Static4.anInt118 = 0;
		} else {
			Static118.anIntArrayArrayArray3 = null;
			Static127.aClass14_Sub13_Sub1Array1 = null;
			Static124.aBooleanArray13 = null;
			Static4.anInt118 = 0;
		}
		Static319.method5482(false);
		Static43.aClass193Array1 = new Class193[500];
		Static63.anInt1526 = 0;
		Static292.aClass193Array2 = new Class193[500];
		Static107.anInt2394 = 0;
		Static346.anIntArrayArrayArray13 = new int[4][Static233.anInt4556 + 1][Static180.anInt3712 + 1];
		Static352.aClass10_Sub3Array3 = new Class10_Sub3[5000];
		Static165.anInt5082 = 0;
		Static134.aBooleanArrayArray1 = new boolean[Static312.anInt6032 + Static312.anInt6032 + 1][Static312.anInt6032 + Static312.anInt6032 + 1];
		Static272.aBooleanArrayArray4 = new boolean[Static312.anInt6032 + Static312.anInt6032 + 2][Static312.anInt6032 + Static312.anInt6032 + 2];
		Static295.aClass57_1 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)V")
	public static void method3225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(14) int local14 = -1;
		@Pc(23) int local23 = Static222.method3991(arg1 + arg2, Static275.anInt5244, Static6.anInt136);
		@Pc(31) int local31 = Static222.method3991(arg1 - arg2, Static275.anInt5244, Static6.anInt136);
		Static27.method690(local23, Static104.anIntArrayArray31[arg3], arg0, local31);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(63) int local63;
			@Pc(67) int local67;
			@Pc(85) int local85;
			@Pc(93) int local93;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local63 = arg3 - local9;
				local67 = arg3 + local9;
				if (Static32.anInt750 <= local67 && Static112.anInt2485 >= local63) {
					local85 = Static222.method3991(local7 + arg1, Static275.anInt5244, Static6.anInt136);
					local93 = Static222.method3991(arg1 - local7, Static275.anInt5244, Static6.anInt136);
					if (local67 <= Static112.anInt2485) {
						Static27.method690(local85, Static104.anIntArrayArray31[local67], arg0, local93);
					}
					if (local63 >= Static32.anInt750) {
						Static27.method690(local85, Static104.anIntArrayArray31[local63], arg0, local93);
					}
				}
			}
			local7++;
			local63 = arg3 - local7;
			local67 = local7 + arg3;
			if (Static32.anInt750 <= local67 && local63 <= Static112.anInt2485) {
				local85 = Static222.method3991(local9 + arg1, Static275.anInt5244, Static6.anInt136);
				local93 = Static222.method3991(arg1 - local9, Static275.anInt5244, Static6.anInt136);
				if (Static112.anInt2485 >= local67) {
					Static27.method690(local85, Static104.anIntArrayArray31[local67], arg0, local93);
				}
				if (Static32.anInt750 <= local63) {
					Static27.method690(local85, Static104.anIntArrayArray31[local63], arg0, local93);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;ZBLclient!mp;)V")
	public static void method3226(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(26) int local26 = Static108.aClass76_5.method2249(null, 250, arg0);
		@Pc(35) int local35 = Static108.aClass76_5.method2253(250, null, arg0) * 13;
		Static218.aClass46_5.method5110(6, 6, local26 + 8, local35 + 4 + 4, -16777216, 0);
		Static218.aClass46_5.method5143(6, 6, local26 + 8, local35 - -4 + 4, -1, 0);
		arg2.method5577(10, null, 1, null, null, local35, 1, local26, -1, 0, 0, arg0, 10, 0, -1);
		Static26.method683(6, local35 + 4 + 4, 6, local26 + 4 + 4);
		if (arg1) {
			Static218.aClass46_5.method5118();
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	public static void method3228() {
		for (@Pc(10) Class1_Sub6 local10 = (Class1_Sub6) Static98.aClass126_3.method3391(); local10 != null; local10 = (Class1_Sub6) Static98.aClass126_3.method3391()) {
			Static70.method1723(local10);
		}
		Static42.method1034();
		Static42.method1029();
		Static42.method1042();
		Static42.method1032();
		Static42.method1031();
		Static42.method1036();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
	public static void method3229() {
		@Pc(1) Class11 local1 = Static5.aClass11_95;
		synchronized (Static5.aClass11_95) {
			Static5.aClass11_95.method215(5);
		}
	}
}
