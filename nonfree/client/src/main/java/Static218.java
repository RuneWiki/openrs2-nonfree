import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "[Lclient!f;")
	public static Class76[] aClass76Array3;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Lclient!pc;")
	public static Class188 aClass188_18;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_15 = new Class44(13, 8);

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[100];

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLclient!ql;)I")
	public static int method769(@OriginalArg(1) Class4_Sub2_Sub2_Sub1 arg0) {
		@Pc(13) int local13 = arg0.anInt5745;
		@Pc(17) Class12 local17 = arg0.method5131();
		if (arg0.aBoolean561) {
			local13 = arg0.anInt5728;
		} else if (local17.anInt334 == arg0.anInt6458 || arg0.anInt6458 == local17.anInt330 || arg0.anInt6458 == local17.anInt336 || arg0.anInt6458 == local17.anInt361) {
			local13 = arg0.anInt5738;
		} else if (arg0.anInt6458 == local17.anInt335 || local17.anInt364 == arg0.anInt6458 || arg0.anInt6458 == local17.anInt351 || local17.anInt322 == arg0.anInt6458) {
			local13 = arg0.anInt5744;
		}
		return local13;
	}
}
