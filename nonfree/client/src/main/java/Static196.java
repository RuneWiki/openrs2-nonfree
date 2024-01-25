import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "Lclient!ug;")
	public static final Class243 aClass243_22 = new Class243();

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "[I")
	public static final int[] anIntArray247 = new int[2];

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
	public static int anInt3898 = 0;

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "[I")
	public static final int[] anIntArray248 = new int[3];

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "Z")
	public static boolean aBoolean336 = true;

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "[I")
	public static final int[] anIntArray249 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZI)V")
	public static void method3115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub4_Sub12 local12 = Static393.method5080(arg1, 6);
		local12.method3248();
		local12.anInt4063 = arg0;
	}
}
