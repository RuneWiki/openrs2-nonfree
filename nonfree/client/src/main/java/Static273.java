import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!kv", name = "C", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray19;

	@OriginalMember(owner = "client!kv", name = "D", descriptor = "[Lclient!d;")
	public static Class59[] aClass59Array4;

	@OriginalMember(owner = "client!kv", name = "u", descriptor = "I")
	public static int anInt5224 = 0;

	@OriginalMember(owner = "client!kv", name = "I", descriptor = "I")
	public static int anInt5233 = 0;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)Z")
	public static boolean method4514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIB)V")
	public static void method4515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static555.aClass327_13.method7196(Static230.aClass156_23.method4065(Static25.anInt769));
		@Pc(28) int local28;
		for (@Pc(22) Class6_Sub45 local22 = (Class6_Sub45) Static182.aClass361_23.method7838(); local22 != null; local22 = (Class6_Sub45) Static182.aClass361_23.method7845()) {
			local28 = Static235.method4086(local22);
			if (local13 < local28) {
				local13 = local28;
			}
		}
		local13 += 8;
		local28 = Static421.anInt7365 * 16 + 21;
		@Pc(54) int local54 = arg0 - local13 / 2;
		if (local54 + local13 > Static240.anInt4852) {
			local54 = Static240.anInt4852 - local13;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(74) int local74 = arg1;
		if (Static196.anInt4059 < local28 + arg1) {
			local74 = Static196.anInt4059 - local28;
		}
		if (local74 < 0) {
			local74 = 0;
		}
		Static574.anInt9422 = local54;
		Static587.aBoolean734 = true;
		Static397.anInt6954 = local74;
		Static144.anInt3166 = Static421.anInt7365 * 16 + (Static370.aBoolean454 ? 26 : 22);
		Static363.anInt6354 = local13;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method4517(@OriginalArg(1) String arg0) {
		Static417.method5982("", "", "", arg0, 0, 4);
	}
}
