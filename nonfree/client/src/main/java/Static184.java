import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!it", name = "b", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!it", name = "i", descriptor = "Lclient!gu;")
	public static Class100 aClass100_3;

	@OriginalMember(owner = "client!it", name = "r", descriptor = "Lclient!m;")
	public static Interface7 anInterface7_8;

	@OriginalMember(owner = "client!it", name = "e", descriptor = "Z")
	public static boolean aBoolean198 = false;

	@OriginalMember(owner = "client!it", name = "g", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[4];

	@OriginalMember(owner = "client!it", name = "h", descriptor = "[[B")
	public static final byte[][] aByteArrayArray61 = new byte[50][];

	@OriginalMember(owner = "client!it", name = "j", descriptor = "J")
	public static long aLong99 = 0L;

	@OriginalMember(owner = "client!it", name = "m", descriptor = "Lclient!bj;")
	public static Class27 aClass27_23 = new Class27(64);

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IBILclient!vh;)Lclient!gv;")
	public static Class101 method2821(@OriginalArg(2) int arg0, @OriginalArg(3) Class250 arg1) {
		@Pc(9) byte[] local9 = arg1.method5667(0, arg0);
		return local9 == null ? null : new Class101(local9);
	}
}
