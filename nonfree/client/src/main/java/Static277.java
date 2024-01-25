import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray13;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_93 = new Class44(14, -2);

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
	public static int anInt4826 = 0;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(JJ)J")
	public static long method4024(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
	public static void method4028() {
		if (Static656.anIntArray814 != null && Static646.anIntArray808 != null) {
			return;
		}
		Static656.anIntArray814 = new int[256];
		Static646.anIntArray808 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(27) double local27 = (double) local18 / 255.0D * 6.283185307179586D;
			Static656.anIntArray814[local18] = (int) (Math.sin(local27) * 4096.0D);
			Static646.anIntArray808[local18] = (int) (Math.cos(local27) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
	public static void method4032() {
		Static354.aClass137_31.L(Static213.anInt4048, Static56.aClass14_Sub22_5.aClass21_Sub17_1.method5452() == 1 ? Static358.anInt6601 + 256 << 2 : -1, 0);
	}
}
