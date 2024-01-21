import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "J")
	public static long aLong44;

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_15 = new Class85(64);

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
	public static int anInt1450 = 0;

	@OriginalMember(owner = "client!hb", name = "N", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_686 = Static193.method3027(":");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIILclient!m;JLclient!m;Lclient!m;)V")
	public static void method1055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class26 arg6, @OriginalArg(7) Class26 arg7) {
		@Pc(3) Class35 local3 = new Class35();
		local3.aClass26_1 = arg4;
		local3.anInt1300 = arg1 * 128 + 64;
		local3.anInt1302 = arg2 * 128 + 64;
		local3.anInt1294 = arg3;
		local3.aLong36 = arg5;
		local3.aClass26_2 = arg6;
		local3.aClass26_3 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class3_Sub6 local42 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt827; local46++) {
				@Pc(52) Class99 local52 = local42.aClass99Array1[local46];
				if ((local52.aLong144 & 0x400000L) == 4194304L) {
					@Pc(63) int local63 = local52.aClass26_11.method2995();
					if (local63 != -32768 && local63 < local34) {
						local34 = local63;
					}
				}
			}
		}
		local3.anInt1293 = -local34;
		if (Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub6(arg0, arg1, arg2);
		}
		Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass35_1 = local3;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
	public static void method1056() {
		Static153.aByteArrayArrayArray14 = new byte[4][104][104];
		Static119.aByteArrayArrayArray12 = new byte[4][105][105];
		Static35.aByteArrayArrayArray3 = new byte[4][104][104];
		Static60.aByteArrayArrayArray15 = new byte[4][104][104];
		Static160.anInt3303 = 99;
		Static138.anIntArray202 = new int[104];
		Static9.anIntArray17 = new int[104];
		Static103.aByteArrayArrayArray9 = new byte[4][104][104];
		Static184.anIntArray322 = new int[104];
		Static183.anIntArray206 = new int[104];
		Static41.anIntArrayArrayArray5 = new int[4][105][105];
		Static207.anIntArray374 = new int[104];
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
	public static void method1057() {
		if (Static35.aClass9_1 != null) {
			@Pc(7) Class9 local7 = Static35.aClass9_1;
			synchronized (Static35.aClass9_1) {
				Static35.aClass9_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!ke;)V")
	public static void method1059(@OriginalArg(1) Class52 arg0) {
		Static144.aClass52_33 = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
	public static void method1060() {
		while (true) {
			@Pc(10) Class10 local10 = Static155.aClass10_87;
			@Pc(17) Class3_Sub17 local17;
			synchronized (Static155.aClass10_87) {
				local17 = (Class3_Sub17) Static102.aClass10_58.method270();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass52_Sub1_16.method1593(local17.aClass18_2, local17.aByteArray17, false, (int) local17.aLong147);
		}
	}
}
