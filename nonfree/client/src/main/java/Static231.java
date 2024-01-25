import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "Lclient!ok;")
	public static final Class262 aClass262_20 = new Class262();

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "[S")
	private static final short[] aShortArray73 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "[S")
	private static final short[] aShortArray74 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "[S")
	private static final short[] aShortArray75 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "[F")
	public static final float[] aFloatArray28 = new float[4];

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "[[S")
	public static final short[][] aShortArrayArray7 = new short[][] { aShortArray73, aShortArray75, aShortArray74 };

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BI)V")
	public static void method3503() {
		@Pc(1) Class264 local1 = Static566.aClass264_56;
		synchronized (Static566.aClass264_56) {
			Static566.aClass264_56.method6366(5);
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)Lclient!so;")
	public static Class14_Sub29 method3508() {
		@Pc(6) Class14_Sub29 local6 = Static244.method3635();
		local6.method5905((long) 0);
		local6.method5855(Static12.aString1);
		local6.method5905(Static133.aLong67);
		local6.method5905(Static385.aLong199);
		local6.method5851(Static604.aBigInteger11, Static315.aBigInteger6);
		return local6;
	}
}
