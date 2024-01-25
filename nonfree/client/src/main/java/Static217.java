import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!in", name = "k", descriptor = "I")
	public static int anInt3703;

	@OriginalMember(owner = "client!in", name = "l", descriptor = "F")
	public static float aFloat52;

	@OriginalMember(owner = "client!in", name = "v", descriptor = "I")
	public static int anInt3710;

	@OriginalMember(owner = "client!in", name = "w", descriptor = "I")
	public static int anInt3711;

	@OriginalMember(owner = "client!in", name = "s", descriptor = "Z")
	public static boolean aBoolean247 = false;

	@OriginalMember(owner = "client!in", name = "u", descriptor = "J")
	public static long aLong105 = -1L;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIFIFFLclient!ue;IFFI[B)V")
	public static void method3194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(8) Class310 arg5, @OriginalArg(10) float arg6, @OriginalArg(11) float arg7, @OriginalArg(13) byte[] arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg5.method6881(arg4 / (float) 128, local12, arg6 * 127.0F, 0, arg7 / (float) 128, arg0, arg3 / (float) 16);
			local42 = arg1;
			arg6 *= arg2;
			for (local48 = 0; local48 < 16384; local48++) {
				arg8[local42] = (byte) ((float) arg8[local42] + local12[local48]);
				local42++;
			}
			arg4 *= 2.0F;
			arg7 *= 2.0F;
			arg3 *= 2.0F;
		}
		local42 = arg1;
		for (local48 = 0; local48 < 16384; local48++) {
			arg8[local42] = (byte) (arg8[local42] + 127);
			local42++;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)V")
	public static void method3195(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		Static468.aBoolean540 = arg2;
		Static87.aString23 = arg0;
		Static442.aString89 = arg1;
		if (!Static468.aBoolean540 && Static466.anInt7907 != 3 && (Static87.aString23.equals("") || Static442.aString89.equals(""))) {
			Static348.method7153(3);
			return;
		}
		Static156.aBoolean183 = false;
		if (Static466.anInt7907 != 1) {
			Static287.anInt9621 = -1;
			Static213.anInt472 = 0;
		}
		Static348.method7153(-3);
		Static141.anInt2537 = 1;
		Static182.anInt3207 = 0;
		Static109.anInt9295 = 0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IILclient!dda;I)J")
	public static long method3196(@OriginalArg(1) int arg0, @OriginalArg(2) Interface6 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(14) long local14 = Long.MIN_VALUE;
		@Pc(21) Class313 local21 = Static260.aClass100_1.method2008(arg1.method7555());
		@Pc(42) long local42 = (long) (arg0 | 0x40000000 | arg2 << 7 | arg1.method7551() << 14 | arg1.method7553() << 20);
		if (local21.lb == 0) {
			local42 |= local14;
		}
		if (local21.anInt8457 == 1) {
			local42 |= local5;
		}
		if (local21.aBoolean595) {
			local42 |= local7;
		}
		return local42 | (long) arg1.method7555() << 32;
	}
}
