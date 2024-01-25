import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	public static int anInt5404;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
	public static int anInt5405;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Lclient!f;")
	public static Class8 aClass8_22;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "Lclient!ck;")
	public static final Class3_Sub7_Sub1 aClass3_Sub7_Sub1_2 = new Class3_Sub7_Sub1(5000);

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "[F")
	public static final float[] aFloatArray13 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZLclient!bu;I)Lclient!nd;")
	public static Class161 method4236(@OriginalArg(2) Class32 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method785(0, arg1);
		return local14 == null ? null : new Class161(local14);
	}
}
