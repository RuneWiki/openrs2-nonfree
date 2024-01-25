import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
	public static int anInt3732;

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "Lclient!pt;")
	public static Class201 aClass201_4;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
	public static int anInt3728 = 0;

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_85 = new Class25(16, 6);

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "Lclient!jd;")
	public static final Class129 aClass129_6 = new Class129("LOCAL", 4);

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString34 = null;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)Lclient!fv;")
	public static Class11_Sub1 method3076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class36 local7 = Static175.aClass36ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub1_3;
	}
}
