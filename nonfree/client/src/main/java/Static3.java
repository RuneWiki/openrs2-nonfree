import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	public static int anInt112;

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "B")
	public static byte aByte1;

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "[I")
	public static int[] anIntArray12;

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
	public static int anInt118;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString2 = "wave:";

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
	public static int anInt114 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()V")
	public static void method66() {
		for (@Pc(1) int local1 = 0; local1 < Static79.anInt1733; local1++) {
			@Pc(8) Class45 local8 = Static242.aClass45Array3[local1];
			Static9.method164(local8);
			Static242.aClass45Array3[local1] = null;
		}
		Static79.anInt1733 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(ZI)V")
	public static void method67(@OriginalArg(0) boolean arg0) {
		@Pc(19) byte[][] local19;
		if (Static71.aBoolean165 && arg0) {
			local19 = Static172.aByteArrayArray11;
		} else {
			local19 = Static186.aByteArrayArray13;
		}
		@Pc(26) int local26 = Static120.aByteArrayArray8.length;
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) byte[] local35 = local19[local28];
			if (local35 != null) {
				@Pc(49) int local49 = (Static135.anIntArray209[local28] >> 8) * 64 - Static38.anInt714;
				@Pc(60) int local60 = (Static135.anIntArray209[local28] & 0xFF) * 64 - Static135.anInt2659;
				Static246.method3875();
				Static198.method3332(arg0, local49, local35, Static122.aClass60Array1, local60);
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!si;)V")
	public static void method68(@OriginalArg(1) Class157 arg0) {
		@Pc(14) int local14 = arg0.anInt4686;
		if (local14 == 324) {
			if (Static31.anInt571 == -1) {
				Static143.anInt2795 = arg0.anInt4681;
				Static31.anInt571 = arg0.anInt4673;
			}
			if (Static135.aClass61_1.aBoolean180) {
				arg0.anInt4673 = Static31.anInt571;
			} else {
				arg0.anInt4673 = Static143.anInt2795;
			}
		} else if (local14 == 325) {
			if (Static31.anInt571 == -1) {
				Static31.anInt571 = arg0.anInt4673;
				Static143.anInt2795 = arg0.anInt4681;
			}
			if (Static135.aClass61_1.aBoolean180) {
				arg0.anInt4673 = Static143.anInt2795;
			} else {
				arg0.anInt4673 = Static31.anInt571;
			}
		} else if (local14 == 327) {
			arg0.anInt4666 = 150;
			arg0.anInt4745 = (int) (Math.sin((double) Static167.anInt637 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt4669 = 5;
			arg0.anInt4668 = -1;
		} else if (local14 == 328) {
			if (Static138.aClass11_Sub4_Sub1_3.aString99 == null) {
				arg0.anInt4668 = 0;
			} else {
				arg0.anInt4666 = 150;
				arg0.anInt4745 = (int) (Math.sin((double) Static167.anInt637 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt4669 = 5;
				arg0.anInt4668 = ((int) Static282.method4276(Static138.aClass11_Sub4_Sub1_3.aString99) << 11) + 2047;
				arg0.anInt4714 = Static138.aClass11_Sub4_Sub1_3.anInt3799;
				arg0.anInt4724 = Static138.aClass11_Sub4_Sub1_3.anInt3826;
				arg0.anInt4721 = Static138.aClass11_Sub4_Sub1_3.anInt3828;
				arg0.anInt4732 = 0;
			}
		}
	}
}
