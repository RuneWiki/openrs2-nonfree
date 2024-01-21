import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "Lclient!ai;")
	public static Class6 aClass6_416 = Static38.method685("<col=ff0000>");

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "[Lclient!td;")
	public static Class79[] aClass79Array1 = new Class79[50];

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "Lclient!ai;")
	public static Class6 aClass6_417 = Static38.method685("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)Lclient!wa;")
	public static Class87 method940(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static180.aClass87ArrayArray1[local7] == null || Static180.aClass87ArrayArray1[local7][local11] == null) {
			@Pc(25) boolean local25 = Static36.method641(local7);
			if (!local25) {
				return null;
			}
		}
		return Static180.aClass87ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lclient!ai;")
	public static Class6 method941(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static106.method2806(arg0) : Static108.aClass6_739;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!c;I)Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1 method943(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1) {
		return Static36.method638(arg0, arg1) ? Static23.method398() : null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method944() {
		aClass6_416 = null;
		aClass6_417 = null;
		aClass79Array1 = null;
	}
}
