import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "Lclient!ns;")
	public static final Class247 aClass247_18 = new Class247(4);

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "Lclient!ns;")
	public static final Class247 aClass247_14 = new Class247(1);

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "Lclient!ns;")
	public static final Class247 aClass247_11 = new Class247(1);

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "Lclient!ns;")
	public static final Class247 aClass247_12 = new Class247(2);

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "Lclient!ns;")
	public static final Class247 aClass247_13 = new Class247(4);

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "Lclient!ns;")
	public static final Class247 aClass247_15 = new Class247(2);

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "Lclient!ns;")
	public static final Class247 aClass247_16 = new Class247(4);

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "Lclient!ns;")
	public static final Class247 aClass247_17 = new Class247(2);

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
	public static int anInt6764 = 0;

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method5958() {
		if (Static251.aBoolean343 || Static510.aClass5_Sub4_Sub14_1 == null) {
			return "";
		} else if ((Static510.aClass5_Sub4_Sub14_1.aString91 == null || Static510.aClass5_Sub4_Sub14_1.aString91.length() == 0) && Static510.aClass5_Sub4_Sub14_1.aString89 != null && Static510.aClass5_Sub4_Sub14_1.aString89.length() > 0) {
			return Static510.aClass5_Sub4_Sub14_1.aString89;
		} else {
			return Static510.aClass5_Sub4_Sub14_1.aString91;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(FFFBLclient!cq;IFIIIF)[B")
	public static byte[] method5959(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) Class61 arg3, @OriginalArg(6) float arg4, @OriginalArg(10) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static422.method6376(arg5, arg0, arg1, arg3, 0, arg4, arg2, local10);
		return local10;
	}
}
