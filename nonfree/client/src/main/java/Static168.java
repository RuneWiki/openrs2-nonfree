import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
	public static int anInt2996;

	@OriginalMember(owner = "client!ji", name = "C", descriptor = "Lclient!fk;")
	public static Class74 aClass74_1;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "Z")
	public static boolean aBoolean222 = false;

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "[I")
	public static final int[] anIntArray336 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
	public static int anInt3003 = 0;

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_81 = new Class41(57, 6);

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method2729(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static315.anInt5584 = 7;
		Static292.anInt5158 = 0x1 << Static315.anInt5584;
		Static365.anInt2303 = Static292.anInt5158 >> 1;
		Static304.anInt2196 = (int) Math.sqrt((double) (Static365.anInt2303 * Static365.anInt2303 + Static365.anInt2303 * Static365.anInt2303));
		Static166.anInt2967 = arg0;
		Static244.anInt1024 = arg1;
		Static273.anInt4882 = arg2;
		Static242.aClass227ArrayArrayArray4 = new Class227[4][Static166.anInt2967][Static244.anInt1024];
		Static39.aClass33Array2 = new Class33[4];
		if (arg3) {
			Static298.anIntArrayArray46 = new int[Static166.anInt2967][Static244.anInt1024];
			Static354.aByteArrayArray20 = new byte[Static166.anInt2967][Static244.anInt1024];
			Static57.aByteArrayArray14 = new byte[Static166.anInt2967][Static244.anInt1024];
			Static91.aClass227ArrayArrayArray1 = new Class227[1][Static166.anInt2967][Static244.anInt1024];
			Static345.aClass33Array3 = new Class33[1];
		} else {
			Static298.anIntArrayArray46 = null;
			Static354.aByteArrayArray20 = null;
			Static57.aByteArrayArray14 = null;
			Static91.aClass227ArrayArrayArray1 = null;
			Static345.aClass33Array3 = null;
		}
		if (arg4) {
			Static259.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static305.aClass2_Sub14_Sub1Array2 = new Class2_Sub14_Sub1[65535];
			Static163.aBooleanArray64 = new boolean[65535];
			Static356.anInt6269 = 0;
		} else {
			Static259.aLongArrayArrayArray1 = null;
			Static305.aClass2_Sub14_Sub1Array2 = null;
			Static163.aBooleanArray64 = null;
			Static356.anInt6269 = 0;
		}
		Static78.method1407(false);
		Static196.aClass242Array1 = new Class242[500];
		Static224.anInt2647 = 0;
		Static219.aClass242Array2 = new Class242[500];
		Static50.anInt1032 = 0;
		Static231.anIntArrayArrayArray9 = new int[4][Static166.anInt2967 + 1][Static244.anInt1024 + 1];
		Static258.aClass12_Sub1Array3 = new Class12_Sub1[5000];
		Static278.anInt1555 = 0;
		Static227.aBooleanArrayArray5 = new boolean[Static273.anInt4882 + Static273.anInt4882 + 1][Static273.anInt4882 + Static273.anInt4882 + 1];
		Static15.aBooleanArrayArray1 = new boolean[Static273.anInt4882 + Static273.anInt4882 + 2][Static273.anInt4882 + Static273.anInt4882 + 2];
		Static42.aClass51_1 = null;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IB)V")
	public static void method2731(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub1_Sub2 local8 = Static323.method4982(arg0, 1);
		local8.method412();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method2732(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg0.indexOf(arg1); local9 != -1; local9 = arg0.indexOf(arg1, local9 + arg2.length())) {
			arg0 = arg0.substring(0, local9) + arg2 + arg0.substring(local9 + arg1.length());
		}
		return arg0;
	}
}
