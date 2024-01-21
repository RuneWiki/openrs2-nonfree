import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!kf", name = "X", descriptor = "I")
	public static int anInt2300;

	@OriginalMember(owner = "client!kf", name = "qb", descriptor = "I")
	public static int anInt2312;

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_688 = Static81.method1507("glow3:");

	@OriginalMember(owner = "client!kf", name = "Q", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_689 = Static81.method1507("Login limit exceeded)3");

	@OriginalMember(owner = "client!kf", name = "nb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_695 = Static81.method1507("Close");

	@OriginalMember(owner = "client!kf", name = "R", descriptor = "Lclient!dj;")
	public static Class24 aClass24_690 = aClass24_695;

	@OriginalMember(owner = "client!kf", name = "ab", descriptor = "Lclient!dj;")
	public static Class24 aClass24_691 = aClass24_689;

	@OriginalMember(owner = "client!kf", name = "kb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_694 = Static81.method1507("Unexpected server response)3");

	@OriginalMember(owner = "client!kf", name = "cb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_692 = aClass24_694;

	@OriginalMember(owner = "client!kf", name = "hb", descriptor = "[Lclient!dj;")
	public static final Class24[] aClass24Array15 = new Class24[100];

	@OriginalMember(owner = "client!kf", name = "ib", descriptor = "I")
	public static int anInt2308 = 0;

	@OriginalMember(owner = "client!kf", name = "jb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_693 = aClass24_688;

	@OriginalMember(owner = "client!kf", name = "rb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_696 = aClass24_688;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)[B")
	public static byte[] method1781(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub2_Sub12 local17 = (Class1_Sub2_Sub12) Static149.aClass86_48.method2816((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(43) int local43 = 0; local43 < 255; local43++) {
				@Pc(50) int local50 = 255 - local43;
				@Pc(57) int local57 = Static132.method2265(local50, local28);
				@Pc(61) byte local61 = local22[local57];
				local22[local57] = local22[local50];
				local22[local50] = local22[511 - local43] = local61;
			}
			local17 = new Class1_Sub2_Sub12(local22);
			Static149.aClass86_48.method2821(local17, (long) arg0);
		}
		return local17.aByteArray22;
	}

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)V")
	public static void method1782() {
		Static72.aClass86_25.method2817();
		Static156.aClass46_10.method1587();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!ve;)V")
	public static void method1783(@OriginalArg(1) Class69 arg0) {
		Static174.aClass69_34 = arg0;
		Static148.anInt3290 = Static174.aClass69_34.method2216(4);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILclient!ve;)[Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3[] method1785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class69 arg2) {
		return Static149.method2564(arg0, arg1, arg2) ? Static84.method1556() : null;
	}

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "(I)V")
	public static void method1786() {
		Static204.anInt4555 = 0;
		@Pc(12) int local12 = (Static87.aClass5_Sub2_Sub1_1.anInt2501 >> 7) + Static196.anInt4343;
		@Pc(19) int local19 = (Static87.aClass5_Sub2_Sub1_1.anInt2448 >> 7) + Static127.anInt2789;
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static204.anInt4555 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static204.anInt4555 = 1;
		}
		if (Static204.anInt4555 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static204.anInt4555 = 0;
		}
	}
}
