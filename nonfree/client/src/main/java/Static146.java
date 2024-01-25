import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	public static final int anInt2797 = 4096;

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
	public static final int anInt2802 = 4096;

	@OriginalMember(owner = "client!hb", name = "Ib", descriptor = "I")
	public static final int anInt2808 = Static184.method2920(2200);

	@OriginalMember(owner = "client!hb", name = "bc", descriptor = "I")
	public static int anInt2810 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!hh;[Lclient!hb;)Lclient!hb;")
	public static Class32_Sub1 method2163(@OriginalArg(0) Class26_Sub2 arg0, @OriginalArg(1) Class32_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class32_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class32_Sub1(arg0, arg1);
		}
	}
}
