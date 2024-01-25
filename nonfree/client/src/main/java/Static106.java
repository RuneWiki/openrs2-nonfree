import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "Lclient!lh;")
	public static final Class151 aClass151_51 = new Class151(64);

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
	public static int anInt2089 = 1;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "[S")
	public static short[] aShortArray13 = new short[256];

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!hh;II)Lclient!lo;")
	public static Class155 method1704(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1) {
		@Pc(11) byte[] local11 = arg1.method2349(arg0, 0);
		return local11 == null ? null : new Class155(local11);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V")
	public static void method1705(@OriginalArg(1) int arg0) {
		Static171.anInt3055 = arg0;
		Static331.aClass151_143.method3298();
	}
}
