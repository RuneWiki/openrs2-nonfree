import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!cg;")
	public static Class65 aClass65_1;

	@OriginalMember(owner = "client!ob", name = "J", descriptor = "Lclient!kb;")
	public static Class194 aClass194_1;

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
	public static final int anInt7141 = 1337;

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray48 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)V")
	public static void method6185(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class120 local14 = Static110.aClass120ArrayArray1[arg2][arg0];
		Static281.method4145(arg1, local14 == null ? Static152.aClass120_1 : local14);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[B)[B")
	public static byte[] method6187(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(12) byte[] local12 = new byte[arg0.length];
			Static682.method799(arg0, 0, local12, 0, arg0.length);
			return local12;
		}
	}
}
