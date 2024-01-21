import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!o", name = "w", descriptor = "[I")
	public static final int[] anIntArray213 = Class1_Sub3_Sub1_Sub4.anIntArray317;

	@OriginalMember(owner = "client!o", name = "C", descriptor = "I")
	public static int anInt2761 = 0;

	@OriginalMember(owner = "client!o", name = "Z", descriptor = "[I")
	public static final int[] anIntArray220 = Class1_Sub3_Sub1_Sub4.anIntArray320;

	@OriginalMember(owner = "client!o", name = "fb", descriptor = "[I")
	public static final int[] anIntArray222 = new int[10000];

	@OriginalMember(owner = "client!o", name = "lb", descriptor = "[I")
	public static final int[] anIntArray224 = new int[10000];

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!ab;II)Lclient!o;")
	public static Class8_Sub7 method1997(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method3265(arg1, 0);
		return local5 == null ? null : new Class8_Sub7(local5);
	}
}
