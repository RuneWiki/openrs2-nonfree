import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!np", name = "c", descriptor = "I")
	public static int anInt3936;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "[[I")
	public static int[][] anIntArrayArray145;

	@OriginalMember(owner = "client!np", name = "b", descriptor = "I")
	public static int anInt3935 = 0;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "[I")
	public static final int[] anIntArray461 = new int[500];

	@OriginalMember(owner = "client!np", name = "f", descriptor = "[I")
	public static final int[] anIntArray462 = new int[13];

	@OriginalMember(owner = "client!np", name = "g", descriptor = "I")
	public static int anInt3938 = 0;

	@OriginalMember(owner = "client!np", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[100];

	@OriginalMember(owner = "client!np", name = "i", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_70 = new Class70(64);

	@OriginalMember(owner = "client!np", name = "j", descriptor = "I")
	public static int anInt3939 = 0;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method3840(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static63.anInt1153 > 0) {
			local21 = Static186.aByteArrayArray12[--Static63.anInt1153];
			Static186.aByteArrayArray12[Static63.anInt1153] = null;
			return local21;
		} else if (arg0 == 5000 && Static289.anInt5440 > 0) {
			local21 = Static292.aByteArrayArray16[--Static289.anInt5440];
			Static292.aByteArrayArray16[Static289.anInt5440] = null;
			return local21;
		} else if (arg0 == 30000 && Static138.anInt4579 > 0) {
			local21 = Static109.aByteArrayArray6[--Static138.anInt4579];
			Static109.aByteArrayArray6[Static138.anInt4579] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZI)V")
	public static void method3841(@OriginalArg(1) int arg0) {
		Static287.anInt5401 = arg0;
		@Pc(7) Class70 local7 = Static319.aClass70_101;
		synchronized (Static319.aClass70_101) {
			Static319.aClass70_101.method1399();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III)V")
	public static void method3842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class187 local7 = Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null && local7.aClass44_Sub3_1 != null) {
			local7.aClass44_Sub3_1 = null;
		}
	}
}
