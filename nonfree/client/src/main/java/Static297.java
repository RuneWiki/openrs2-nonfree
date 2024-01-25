import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "Lclient!ra;")
	public static Class170 aClass170_98;

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "Lclient!kj;")
	public static final Class111 aClass111_1 = new Class111();

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "[I")
	public static final int[] anIntArray439 = new int[8];

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
	public static int anInt5709 = 2;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_98 = new Class66(2);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method5043(@OriginalArg(2) String arg0) {
		return Static200.method5054(arg0, 16);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method5044(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = (local15 << 5) + arg0.charAt(local17) - local15;
		}
		return local15;
	}
}
