import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!dj;")
	public static Class12_Sub3_Sub1 aClass12_Sub3_Sub1_1;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "[Lclient!rh;")
	public static Class60_Sub1[] aClass60_Sub1Array2;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "Lclient!i;")
	public static Class41 aClass41_1260 = Static184.method2923(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "[I")
	public static int[] anIntArray487 = new int[256];

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
	public static int anInt4716 = 0;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Lclient!i;")
	public static Class41 aClass41_1261 = Static184.method2923("mod_icons");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I")
	public static int method3262(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIJZ)Lclient!i;")
	public static Class41 method3263(@OriginalArg(2) long arg0) {
		@Pc(26) int local26 = 1;
		for (@Pc(31) long local31 = arg0 / (long) 10; local31 != 0L; local31 /= 10) {
			local26++;
		}
		@Pc(50) int local50 = local26;
		if (arg0 < 0L) {
			local50 = local26 + 1;
		}
		@Pc(62) byte[] local62 = new byte[local50];
		if (arg0 < 0L) {
			local62[0] = 45;
		}
		for (@Pc(80) int local80 = 0; local80 < local26; local80++) {
			@Pc(88) int local88 = (int) (arg0 % (long) 10);
			arg0 /= 10;
			if (local88 < 0) {
				local88 = -local88;
			}
			if (local88 > 9) {
				local88 += 39;
			}
			local62[local50 - local80 - 1] = (byte) (local88 + 48);
		}
		@Pc(129) Class41 local129 = new Class41();
		local129.aByteArray26 = local62;
		local129.anInt2012 = local50;
		return local129;
	}
}
