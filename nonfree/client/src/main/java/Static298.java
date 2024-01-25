import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "Lclient!sb;")
	public static Class307 aClass307_2;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
	public static int anInt6265;

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
	public static int anInt6266;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "[F")
	public static final float[] aFloatArray55 = new float[16];

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
	public static int anInt6262 = 0;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_122 = new Class215(76, 6);

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "[I")
	public static final int[] anIntArray366 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "J")
	public static long aLong137 = 20000000L;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)Lclient!qj;")
	public static Class280 method5320(@OriginalArg(1) int arg0) {
		@Pc(10) Class280 local10 = (Class280) Static500.aClass169_52.method5002((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static577.aClass157_93.method4564(0, arg0);
		local10 = new Class280();
		if (local20 != null) {
			local10.method7180(arg0, new Class2_Sub11(local20));
		}
		Static500.aClass169_52.method5001(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)V")
	public static void method5321(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg0, 9);
		local8.method3093();
	}
}
