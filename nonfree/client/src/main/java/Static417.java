import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "[[S")
	public static short[][] aShortArrayArray9;

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "[I")
	public static int[] anIntArray447;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_178 = new Class163(23, 8);

	@OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
	public static int anInt7005 = -1;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5713(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) + Static456.method6227(arg0.charAt(local17)) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V")
	public static void method5714() {
		if (Static418.anIntArray448 != null && Static331.anIntArray491 != null) {
			return;
		}
		Static331.anIntArray491 = new int[256];
		Static418.anIntArray448 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static418.anIntArray448[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static331.anIntArray491[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!uu;)V")
	public static void method5715(@OriginalArg(1) Class250 arg0) {
		Static233.anInt3997 = arg0.method5790("titlebg");
		Static244.anInt4146 = arg0.method5790("logo");
	}
}
