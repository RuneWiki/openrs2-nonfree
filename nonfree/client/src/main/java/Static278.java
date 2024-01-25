import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_55 = new Class269(76, -1);

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
	public static int anInt5322 = 0;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)Lclient!sha;")
	public static Class2_Sub5_Sub19 method4445() {
		return Static292.aClass2_Sub5_Sub19_3;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
	public static void method4446() {
		Static203.method3539();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)I")
	public static int method4447(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V")
	public static void method4448(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		@Pc(7) Class368 local7 = Static455.aClass368Array1[99];
		for (@Pc(9) int local9 = 99; local9 > 0; local9--) {
			Static455.aClass368Array1[local9] = Static455.aClass368Array1[local9 - 1];
		}
		if (local7 == null) {
			local7 = new Class368(arg4, arg5, arg2, arg3, arg6, arg0, arg1, arg7);
		} else {
			local7.method8470(arg1, arg2, arg5, arg3, arg0, arg6, arg4, arg7);
		}
		Static455.aClass368Array1[0] = local7;
		Static284.anInt9999 = Static44.anInt975;
		Static445.anInt7874++;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V")
	public static void method4449(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static472.method6789(arg0, arg3, true, arg2, arg1, -1);
	}
}
