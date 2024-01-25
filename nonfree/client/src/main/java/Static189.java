import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
	public static int anInt3449;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_90 = new Class163(35, 2);

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
	public static int anInt3452 = 0;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Lclient!la;")
	public static final Class136 aClass136_92 = new Class136(101, -1);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;Lclient!nj;I)I")
	public static int method2956(@OriginalArg(0) String arg0, @OriginalArg(1) Class3_Sub25 arg1) {
		@Pc(6) int local6 = arg1.anInt4974;
		@Pc(10) byte[] local10 = Static59.method1111(arg0);
		arg1.method4110(local10.length);
		arg1.anInt4974 += Static371.aClass88_1.method2076(arg1.anInt4974, local10, arg1.aByteArray88, 0, local10.length);
		return arg1.anInt4974 - local6;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)I")
	public static int method2957() {
		if ((double) Static211.aFloat4 == 3.0D) {
			return 37;
		} else if ((double) Static211.aFloat4 == 4.0D) {
			return 50;
		} else if ((double) Static211.aFloat4 == 6.0D) {
			return 75;
		} else if ((double) Static211.aFloat4 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)I")
	public static int method2959(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
