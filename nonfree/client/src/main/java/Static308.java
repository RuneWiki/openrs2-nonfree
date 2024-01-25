import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!mt", name = "K", descriptor = "Lclient!fl;")
	public static Class96 aClass96_4;

	@OriginalMember(owner = "client!mt", name = "qb", descriptor = "I")
	public static int anInt5728;

	@OriginalMember(owner = "client!mt", name = "A", descriptor = "I")
	public static int anInt5706 = 0;

	@OriginalMember(owner = "client!mt", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString52 = "";

	@OriginalMember(owner = "client!mt", name = "vb", descriptor = "[S")
	public static short[] aShortArray111 = new short[256];

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)V")
	public static void method4861(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub11 local12 = Static541.method7520(5, arg0);
		local12.method4945();
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLclient!gv;)V")
	public static void method4862(@OriginalArg(1) Class1_Sub16 arg0) {
		if (arg0.aClass1_Sub37_5 != null) {
			arg0.aClass1_Sub37_5.anInt7859 = 0;
		}
		arg0.aBoolean498 = false;
		for (@Pc(23) Class1_Sub16 local23 = arg0.method5748(); local23 != null; local23 = arg0.method5752()) {
			method4862(local23);
		}
	}
}
