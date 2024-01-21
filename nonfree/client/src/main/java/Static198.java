import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!v", name = "r", descriptor = "[I")
	public static final int[] anIntArray379 = Class16.anIntArray39;

	@OriginalMember(owner = "client!v", name = "w", descriptor = "[I")
	public static final int[] anIntArray380 = Class16.anIntArray44;

	@OriginalMember(owner = "client!v", name = "D", descriptor = "I")
	public static int anInt3934 = 0;

	@OriginalMember(owner = "client!v", name = "K", descriptor = "[I")
	public static final int[] anIntArray387 = new int[10000];

	@OriginalMember(owner = "client!v", name = "X", descriptor = "[I")
	public static final int[] anIntArray388 = new int[10000];

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!eh;II)Lclient!v;")
	public static Class24_Sub7 method2988(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method852(0, arg1);
		return local5 == null ? null : new Class24_Sub7(local5);
	}
}
