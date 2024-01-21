import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "Lclient!sg;")
	public static Class89 aClass89_1;

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_671 = Static81.method1507(")2");

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
	public static int anInt2251 = 0;

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
	public static int anInt2252 = 1;

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
	public static int anInt2253 = 0;

	@OriginalMember(owner = "client!kb", name = "R", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_672 = Static81.method1507("welle2:");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BILclient!ve;)Lclient!le;")
	public static Class1_Sub2_Sub8_Sub2 method1736(@OriginalArg(1) int arg0, @OriginalArg(2) Class69 arg1) {
		return Static136.method2383(arg0, arg1) ? Static61.method1190() : null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!vc;)Lclient!vc;")
	public static Class98 method1738(@OriginalArg(1) Class98 arg0) {
		@Pc(12) Class98 local12 = Static54.method2989(arg0);
		if (local12 == null) {
			local12 = arg0.aClass98_19;
		}
		return local12;
	}
}
