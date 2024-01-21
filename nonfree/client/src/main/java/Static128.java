import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!md", name = "x", descriptor = "[I")
	public static final int[] anIntArray166 = Class3_Sub3_Sub2_Sub5.anIntArray303;

	@OriginalMember(owner = "client!md", name = "C", descriptor = "[I")
	public static final int[] anIntArray169 = new int[10000];

	@OriginalMember(owner = "client!md", name = "G", descriptor = "I")
	public static int anInt2510 = 0;

	@OriginalMember(owner = "client!md", name = "N", descriptor = "[I")
	public static final int[] anIntArray171 = Class3_Sub3_Sub2_Sub5.anIntArray300;

	@OriginalMember(owner = "client!md", name = "hb", descriptor = "[I")
	public static final int[] anIntArray176 = new int[10000];

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!ke;II)Lclient!md;")
	public static Class26_Sub5 method1788(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1581(arg1, 0);
		return local5 == null ? null : new Class26_Sub5(local5);
	}
}
