import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_4;

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
	public static int anInt584;

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
	public static int anInt586;

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
	public static volatile int anInt581 = 0;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "Lclient!he;")
	public static Class44 aClass44_8 = new Class44();

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray5 = new byte[250][];

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
	public static int anInt585 = 0;

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "Lclient!qe;")
	public static Class78 aClass78_110 = Static199.method3560(":");

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BII)V")
	public static void method427(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) ((arg1 << 16) + arg0);
		@Pc(16) Class2_Sub3_Sub16 local16 = (Class2_Sub3_Sub16) Static106.aClass103_12.method3659(local10);
		if (local16 != null) {
			Static8.aClass102_1.method3627(local16);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
	public static void method428() {
		Static183.aClass110_20.method3889();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!qe;Z)V")
	public static void method430(@OriginalArg(0) Class78 arg0) {
		if (Static146.aClass2_Sub10Array1 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		@Pc(12) long local12 = arg0.method3016();
		if (local12 == 0L) {
			return;
		}
		while (Static146.aClass2_Sub10Array1.length > local8 && Static146.aClass2_Sub10Array1[local8].aLong188 != local12) {
			local8++;
		}
		if (local8 < Static146.aClass2_Sub10Array1.length && Static146.aClass2_Sub10Array1[local8] != null) {
			Static161.aClass2_Sub23_Sub1_5.method2155(241);
			Static161.aClass2_Sub23_Sub1_5.method2103(Static146.aClass2_Sub10Array1[local8].aLong188);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([BB)V")
	public static void method431(@OriginalArg(0) byte[] arg0) {
		@Pc(7) int local7 = 0;
		while (true) {
			while (arg0.length > local7) {
				@Pc(20) int local20 = (arg0[local7++] & 0xFF) * 64 - Static221.anInt4795;
				@Pc(31) int local31 = (arg0[local7++] & 0xFF) * 64 - Static45.anInt815;
				@Pc(65) byte local65;
				@Pc(58) int local58;
				if (local20 > 0 && local31 > 0 && local20 + 64 < Static151.anInt3457 && local31 + 64 < Static30.anInt547) {
					local58 = local20 >> 6;
					@Pc(89) int local89 = Static30.anInt547 - local31 - 1 >> 6;
					for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
						for (@Pc(95) int local95 = -64; local95 < 0; local95++) {
							local65 = arg0[local7++];
							if (local65 != 0) {
								if (Static164.aByteArrayArrayArray12[local58][local89] == null) {
									Static164.aByteArrayArrayArray12[local58][local89] = new byte[4096];
								}
								Static164.aByteArrayArrayArray12[local58][local89][(-(local95 + 1) << 6) + local91] = local65;
								@Pc(137) byte local137 = arg0[local7++];
								if (Static142.aByteArrayArrayArray11[local58][local89] == null) {
									Static142.aByteArrayArrayArray11[local58][local89] = new byte[4096];
								}
								Static142.aByteArrayArrayArray11[local58][local89][local91 + (-(local95 + 1) << 6)] = local137;
							}
						}
					}
				} else {
					for (local58 = -4096; local58 < 0; local58++) {
						local65 = arg0[local7++];
						if (local65 != 0) {
							local7++;
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)Lclient!fj;")
	public static Class2_Sub3_Sub9 method432(@OriginalArg(0) int arg0) {
		@Pc(15) Class2_Sub3_Sub9 local15 = (Class2_Sub3_Sub9) Static158.aClass110_15.method3891((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(29) byte[] local29 = Static67.aClass72_60.method3197(Static50.method648(arg0), Static45.method592(arg0));
		local15 = new Class2_Sub3_Sub9();
		local15.anInt1274 = arg0;
		if (local29 != null) {
			local15.method1056(new Class2_Sub23(local29));
		}
		local15.method1060();
		Static158.aClass110_15.method3894(local15, (long) arg0);
		return local15;
	}
}
