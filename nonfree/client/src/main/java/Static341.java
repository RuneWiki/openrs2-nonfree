import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
	public static int anInt6237;

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_147 = new Class263(2, -2);

	@OriginalMember(owner = "client!qu", name = "l", descriptor = "Z")
	public static boolean aBoolean397 = false;

	@OriginalMember(owner = "client!qu", name = "n", descriptor = "Lclient!pu;")
	public static final Class203 aClass203_43 = new Class203();

	@OriginalMember(owner = "client!qu", name = "o", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_148 = new Class263(102, 7);

	@OriginalMember(owner = "client!qu", name = "p", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_149 = new Class263(5, 12);

	@OriginalMember(owner = "client!qu", name = "q", descriptor = "Lclient!dw;")
	public static final Class65 aClass65_8 = new Class65("", 13);

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BI)V")
	public static void method4802() {
		@Pc(10) Class91 local10 = Static406.aClass91_61;
		synchronized (Static406.aClass91_61) {
			Static406.aClass91_61.method1998(5);
		}
		local10 = Static117.aClass91_39;
		synchronized (Static117.aClass91_39) {
			Static117.aClass91_39.method1998(5);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!jh;")
	public static RuntimeException_Sub1 method4803(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString34 = local9.aString34 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!qs;IB)Lclient!qm;")
	public static Class209 method4804(@OriginalArg(1) Class211 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) byte[] local14 = arg0.method4758(0, arg1);
		return local14 == null ? null : new Class209(local14);
	}
}
