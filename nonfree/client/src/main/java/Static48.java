import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
	public static int anInt1663 = 0;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "[I")
	public static final int[] anIntArray47 = new int[1];

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)I")
	public static int method1561(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(37) int local37 = local31 | local31 >>> 16;
		return ~local37 & arg0;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V")
	public static void method1562() {
		@Pc(15) Class360 local15 = null;
		try {
			local15 = Static161.method3134("2");
			@Pc(28) Class6_Sub8 local28 = new Class6_Sub8(Static494.anInt8611 * 6 + 3);
			local28.method8211(1);
			local28.method8241(Static494.anInt8611);
			for (@Pc(38) int local38 = 0; local38 < Static267.anIntArray256.length; local38++) {
				if (Static272.aBooleanArray10[local38]) {
					local28.method8241(local38);
					local28.method8202(Static267.anIntArray256[local38]);
				}
			}
			local15.method8361(local28.aByteArray102, 0, local28.anInt10061);
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (local15 != null) {
				local15.method8359();
			}
		} catch (@Pc(76) Exception local76) {
		}
		Static135.aLong82 = Static582.method8056();
		Static128.aBoolean242 = false;
	}
}
