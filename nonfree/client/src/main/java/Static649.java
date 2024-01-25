import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static649 {

	@OriginalMember(owner = "client!vw", name = "i", descriptor = "Lclient!aj;")
	public static Class15 aClass15_160;

	@OriginalMember(owner = "client!vw", name = "Eb", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_152 = new Class218(87, 7);

	@OriginalMember(owner = "client!vw", name = "Hb", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_153 = new Class218(69, 8);

	@OriginalMember(owner = "client!vw", name = "Kb", descriptor = "I")
	public static int anInt10340 = 0;

	@OriginalMember(owner = "client!vw", name = "Lb", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_78 = new Class165(50);

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
	public static void method8991() {
		Static304.aClass33_11 = null;
		Static276.anInt4810 = -1;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IBII)V")
	public static void method8993(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class3_Sub11_Sub4 local17 = Static583.method8201(9, (long) arg0);
		local17.method2195();
		local17.anInt2394 = arg2;
		local17.anInt2400 = arg1;
	}
}
