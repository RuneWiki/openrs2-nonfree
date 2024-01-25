import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static123 {

	@OriginalMember(owner = "client!er", name = "n", descriptor = "I")
	public static int anInt2133;

	@OriginalMember(owner = "client!er", name = "c", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_34 = new Class160(73, 6);

	@OriginalMember(owner = "client!er", name = "j", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!er", name = "k", descriptor = "Lclient!nn;")
	public static final Class216 aClass216_5 = new Class216(5, 7);

	@OriginalMember(owner = "client!er", name = "l", descriptor = "I")
	public static int anInt2132 = 0;

	@OriginalMember(owner = "client!er", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray34 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IBI)Z")
	public static boolean method1856(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static272.method3839(arg0, arg1) | Static199.method2983(arg0, arg1) | Static305.method4677(arg0, arg1)) & Static300.method4186(arg0, arg1);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)I")
	public static int method1862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static151.aByteArrayArray8 == null ? 0 : Static151.aByteArrayArray8[arg0][arg1] & 0xFF;
	}
}
