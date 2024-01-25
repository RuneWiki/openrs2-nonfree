import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
	public static int anInt6697;

	@OriginalMember(owner = "client!ta", name = "Sb", descriptor = "I")
	public static int anInt6742;

	@OriginalMember(owner = "client!ta", name = "Q", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_105 = new Class25(29, 7);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILclient!jk;Lclient!jk;)V")
	public static void method5521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub4 arg3, @OriginalArg(4) Class3_Sub4 arg4) {
		@Pc(4) Class189 local4 = Static396.method5419(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass3_Sub4_3 = arg3;
			local4.aClass3_Sub4_2 = arg4;
		}
	}
}
