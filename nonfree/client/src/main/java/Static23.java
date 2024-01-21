import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!cb", name = "T", descriptor = "[I")
	public static final int[] anIntArray67 = Class2_Sub1_Sub7_Sub1.anIntArray129;

	@OriginalMember(owner = "client!cb", name = "gb", descriptor = "[I")
	public static final int[] anIntArray70 = new int[10000];

	@OriginalMember(owner = "client!cb", name = "mb", descriptor = "[I")
	public static final int[] anIntArray73 = Class2_Sub1_Sub7_Sub1.anIntArray133;

	@OriginalMember(owner = "client!cb", name = "sb", descriptor = "[I")
	public static final int[] anIntArray74 = new int[10000];

	@OriginalMember(owner = "client!cb", name = "Kb", descriptor = "I")
	public static int anInt734 = 0;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!pe;II)Lclient!cb;")
	public static Class2_Sub1_Sub1_Sub1 method578(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method521(0, arg1);
		return local5 == null ? null : new Class2_Sub1_Sub1_Sub1(local5);
	}
}
