import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!gt", name = "T", descriptor = "Lclient!em;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!gt", name = "P", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!gt", name = "U", descriptor = "Lclient!la;")
	public static final Class136 aClass136_68 = new Class136(79, 12);

	@OriginalMember(owner = "client!gt", name = "X", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_68 = new Class163(75, 3);

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(BII)I")
	public static int method2173(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static451.anIntArray504[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(BI)V")
	public static void method2174(@OriginalArg(1) int arg0) {
		if (!Static163.method5702(arg0)) {
			return;
		}
		@Pc(14) Class82[] local14 = Static298.aClass82ArrayArray2[arg0];
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			@Pc(26) Class82 local26 = local14[local20];
			if (local26 != null) {
				local26.anInt2267 = 0;
				local26.anInt2219 = 1;
				local26.anInt2202 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)I")
	public static int method2175(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
