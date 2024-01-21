import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!eh", name = "u", descriptor = "[I")
	public static int[] anIntArray93 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
	public static int anInt992 = 0;

	@OriginalMember(owner = "client!eh", name = "w", descriptor = "[Lclient!pf;")
	public static Class60[] aClass60Array1 = new Class60[4];

	@OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
	public static int anInt999 = 0;

	@OriginalMember(owner = "client!eh", name = "H", descriptor = "[I")
	public static int[] anIntArray94 = new int[50];

	@OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
	public static volatile int anInt1005 = 0;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)[Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4[] method777() {
		@Pc(8) Class3_Sub1_Sub3_Sub4[] local8 = new Class3_Sub1_Sub3_Sub4[Static96.anInt2130];
		for (@Pc(18) int local18 = 0; local18 < Static96.anInt2130; local18++) {
			@Pc(24) Class3_Sub1_Sub3_Sub4 local24 = new Class3_Sub1_Sub3_Sub4();
			local24.anInt3224 = Static57.anInt1344;
			local24.anInt3222 = Static86.anInt1939;
			local24.anInt3221 = Static42.anIntArray46[local18];
			local24.anInt3225 = Static72.anIntArray177[local18];
			local24.anInt3223 = Static37.anIntArray89[local18];
			local24.anInt3226 = Static143.anIntArray350[local18];
			@Pc(54) byte[] local54 = Static124.aByteArrayArray8[local18];
			@Pc(60) int local60 = local24.anInt3226 * local24.anInt3223;
			local24.anIntArray336 = new int[local60];
			for (@Pc(66) int local66 = 0; local66 < local60; local66++) {
				local24.anIntArray336[local66] = Static9.anIntArray12[local54[local66] & 0xFF];
			}
			local8[local18] = local24;
		}
		Static90.method1592();
		return local8;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!je;[BIB)V")
	public static void method778(@OriginalArg(0) Class43 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class3_Sub19 local15 = new Class3_Sub19();
		local15.aByteArray35 = arg1;
		local15.aLong183 = arg2;
		local15.aClass43_4 = arg0;
		local15.anInt3102 = 0;
		@Pc(30) Class72 local30 = Static124.aClass72_39;
		synchronized (Static124.aClass72_39) {
			Static124.aClass72_39.method2404(local15);
		}
		Static47.method1341();
	}

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V")
	public static void method779() {
		aClass60Array1 = null;
		anIntArray93 = null;
		anIntArray94 = null;
	}
}
