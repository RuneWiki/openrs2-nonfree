import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!de", name = "ib", descriptor = "I")
	public static int anInt795;

	@OriginalMember(owner = "client!de", name = "jb", descriptor = "I")
	public static int anInt796;

	@OriginalMember(owner = "client!de", name = "kb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
	public static int anInt790 = 0;

	@OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
	public static int anInt791 = 0;

	@OriginalMember(owner = "client!de", name = "bb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_392 = Static193.method3027(" ");

	@OriginalMember(owner = "client!de", name = "db", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[8];

	@OriginalMember(owner = "client!de", name = "fb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_393 = Static193.method3027("Mem:");

	@OriginalMember(owner = "client!de", name = "gb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_394 = Static193.method3027("<)4col> x");

	@OriginalMember(owner = "client!de", name = "lb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_395 = Static193.method3027("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!de", name = "ob", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_396 = Static193.method3027(":tradereq:");

	@OriginalMember(owner = "client!de", name = "pb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_397 = Static193.method3027("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!de", name = "qb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_398 = Static193.method3027("Texturen geladen)3");

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(III)Lclient!mi;")
	public static Class64 method637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass64_1 == null ? null : local7.aClass64_1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!qc;I)V")
	public static void method638(@OriginalArg(0) Class3_Sub3_Sub2_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static39.anIntArray41.length; local7++) {
			Static39.anIntArray41[local7] = 0;
		}
		@Pc(28) int local28;
		for (@Pc(19) int local19 = 0; local19 < 5000; local19++) {
			local28 = (int) ((double) 256 * Math.random() * 128.0D);
			Static39.anIntArray41[local28] = (int) (Math.random() * 256.0D);
		}
		@Pc(50) int local50;
		@Pc(53) int local53;
		@Pc(61) int local61;
		for (local28 = 0; local28 < 20; local28++) {
			for (local50 = 1; local50 < 255; local50++) {
				for (local53 = 1; local53 < 127; local53++) {
					local61 = local53 + (local50 << 7);
					Static203.anIntArray359[local61] = (Static39.anIntArray41[local61 + 128] + Static39.anIntArray41[local61 - 128] + Static39.anIntArray41[local61 + -1] + Static39.anIntArray41[local61 - -1]) / 4;
				}
			}
			@Pc(105) int[] local105 = Static39.anIntArray41;
			Static39.anIntArray41 = Static203.anIntArray359;
			Static203.anIntArray359 = local105;
		}
		if (arg0 == null) {
			return;
		}
		local50 = 0;
		for (local53 = 0; local53 < arg0.anInt3216; local53++) {
			for (local61 = 0; local61 < arg0.anInt3220; local61++) {
				if (arg0.aByteArray32[local50++] != 0) {
					@Pc(139) int local139 = local53 + arg0.anInt3218 + 16;
					@Pc(146) int local146 = arg0.anInt3219 + local61 + 16;
					@Pc(152) int local152 = local146 + (local139 << 7);
					Static39.anIntArray41[local152] = 0;
				}
			}
		}
	}
}
