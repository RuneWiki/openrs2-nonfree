import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString40;

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_146 = new Class214(10, 8);

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_147 = new Class214(25, 8);

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "[S")
	public static short[] aShortArray72 = new short[256];

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
	public static int anInt4620 = 0;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "Lclient!fh;")
	public static final Class73 aClass73_6 = new Class73("RC", 1);

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIII)Lclient!kv;")
	public static Class41 method3944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg0 * 76724863L ^ (long) arg4 * 475427L ^ (long) arg2 * 97549L ^ (long) arg5 * 67481L ^ (long) arg1 * 986053L ^ (long) arg3 * 32147369L;
		@Pc(41) Class41 local41 = (Class41) Static429.aClass83_60.method2338(local33);
		if (local41 == null) {
			local41 = Static182.aClass30_12.method2057(arg5, arg2, arg4, arg1, arg3, arg0);
			Static429.aClass83_60.method2337(local41, local33);
			return local41;
		} else {
			return local41;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)V")
	public static void method3945(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(2, arg0);
		local8.method517();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!vb;")
	public static RuntimeException_Sub1 method3947(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString77 = local9.aString77 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
