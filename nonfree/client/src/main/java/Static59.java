import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_14 = new Class136(128, 4);

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_42 = new Class194(96, 10);

	@OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
	public static int anInt1084 = 0;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!aq;BLclient!st;)Lclient!kaa;")
	public static Class3_Sub27 method1040(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Class314 arg1) {
		@Pc(16) Class3_Sub27 local16 = Static430.method6552();
		local16.aClass314_84 = arg1;
		local16.anInt5446 = arg1.anInt8959;
		if (local16.anInt5446 == -1) {
			local16.aClass3_Sub9_Sub2_2 = new Class3_Sub9_Sub2(260);
		} else if (local16.anInt5446 == -2) {
			local16.aClass3_Sub9_Sub2_2 = new Class3_Sub9_Sub2(10000);
		} else if (local16.anInt5446 <= 18) {
			local16.aClass3_Sub9_Sub2_2 = new Class3_Sub9_Sub2(20);
		} else if (local16.anInt5446 <= 98) {
			local16.aClass3_Sub9_Sub2_2 = new Class3_Sub9_Sub2(100);
		} else {
			local16.aClass3_Sub9_Sub2_2 = new Class3_Sub9_Sub2(260);
		}
		local16.aClass3_Sub9_Sub2_2.method5650(arg0);
		local16.aClass3_Sub9_Sub2_2.method5652(local16.aClass314_84.method7690());
		local16.anInt5444 = 0;
		return local16;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "([[SZ[[F)[[S")
	public static short[][] method1042(@OriginalArg(0) short[][] arg0, @OriginalArg(2) float[][] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			for (@Pc(16) int local16 = 0; local16 < arg0[local12].length; local16++) {
				arg0[local12][local16] = (short) (int) (arg1[local12][local16] * 16383.0F);
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)V")
	public static void method1043() {
		Static133.aClass249Array30 = null;
	}
}
