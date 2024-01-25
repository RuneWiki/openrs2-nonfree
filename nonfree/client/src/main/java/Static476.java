import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!sba", name = "l", descriptor = "[I")
	public static int[] anIntArray579;

	@OriginalMember(owner = "client!sba", name = "q", descriptor = "I")
	public static int anInt8172 = 0;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(ILclient!rj;ILclient!es;)V")
	public static void method6766(@OriginalArg(1) Class287 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub15 arg2) {
		@Pc(14) Class2_Sub48 local14 = new Class2_Sub48();
		local14.anInt9286 = arg2.method4325();
		local14.anInt9285 = arg2.method4307();
		local14.anIntArray671 = new int[local14.anInt9286];
		local14.aByteArrayArrayArray48 = new byte[local14.anInt9286][][];
		local14.aClass347Array2 = new Class347[local14.anInt9286];
		local14.anIntArray670 = new int[local14.anInt9286];
		local14.anIntArray672 = new int[local14.anInt9286];
		local14.aClass347Array1 = new Class347[local14.anInt9286];
		for (@Pc(56) int local56 = 0; local56 < local14.anInt9286; local56++) {
			try {
				@Pc(62) int local62 = arg2.method4325();
				@Pc(76) String local76;
				@Pc(80) String local80;
				@Pc(82) int local82;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local76 = arg2.method4324();
					local80 = arg2.method4324();
					local82 = 0;
					if (local62 == 1) {
						local82 = arg2.method4307();
					}
					local14.anIntArray671[local56] = local62;
					local14.anIntArray672[local56] = local82;
					local14.aClass347Array1[local56] = arg0.method6545(local80, Static245.method3788(local76));
				} else if (local62 == 3 || local62 == 4) {
					local76 = arg2.method4324();
					local80 = arg2.method4324();
					local82 = arg2.method4325();
					@Pc(133) String[] local133 = new String[local82];
					for (@Pc(135) int local135 = 0; local135 < local82; local135++) {
						local133[local135] = arg2.method4324();
					}
					@Pc(150) byte[][] local150 = new byte[local82][];
					@Pc(163) int local163;
					if (local62 == 3) {
						for (@Pc(157) int local157 = 0; local157 < local82; local157++) {
							local163 = arg2.method4307();
							local150[local157] = new byte[local163];
							arg2.method4346(local150[local157], local163);
						}
					}
					local14.anIntArray671[local56] = local62;
					@Pc(188) Class[] local188 = new Class[local82];
					for (local163 = 0; local163 < local82; local163++) {
						local188[local163] = Static245.method3788(local133[local163]);
					}
					local14.aClass347Array2[local56] = arg0.method6541(Static245.method3788(local76), local80, local188);
					local14.aByteArrayArrayArray48[local56] = local150;
				}
			} catch (@Pc(223) ClassNotFoundException local223) {
				local14.anIntArray670[local56] = -1;
			} catch (@Pc(230) SecurityException local230) {
				local14.anIntArray670[local56] = -2;
			} catch (@Pc(237) NullPointerException local237) {
				local14.anIntArray670[local56] = -3;
			} catch (@Pc(244) Exception local244) {
				local14.anIntArray670[local56] = -4;
			} catch (@Pc(251) Throwable local251) {
				local14.anIntArray670[local56] = -5;
			}
		}
		Static96.aClass8_12.method212(local14);
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IB)V")
	public static void method6767(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(2, arg0);
		local8.method6095();
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BII)Z")
	public static boolean method6768(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static95.method1481(arg0, arg1) | (arg0 & 0x70000) != 0 || Static222.method3494(arg0, arg1);
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
	public static void method6769() {
		Static309.method4629();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static495.aClass355Array1[local8].method7806();
		}
		Static361.method6164();
		Static542.method7382();
		System.gc();
		Static307.aClass100_6.ya();
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(III)V")
	public static void method6770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class2_Sub3_Sub13 local16 = Static382.method5650(5, arg1);
		local16.method6098();
		local16.anInt7258 = arg0;
	}
}
