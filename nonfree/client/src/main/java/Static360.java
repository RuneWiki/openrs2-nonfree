import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "[I")
	public static int[] anIntArray510;

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_233 = new Class106("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!wj", name = "s", descriptor = "S")
	public static short aShort95 = 256;

	@OriginalMember(owner = "client!wj", name = "u", descriptor = "[Lclient!np;")
	public static final Class1_Sub4_Sub20[] aClass1_Sub4_Sub20Array6 = new Class1_Sub4_Sub20[14];

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "([SB)[S")
	public static short[] method5981(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			Static374.method2827(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}
}
