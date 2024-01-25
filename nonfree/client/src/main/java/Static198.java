import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Lclient!wa;")
	public static Class258 aClass258_5;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "Lclient!mh;")
	public static Class155 aClass155_3;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "Lclient!mn;")
	public static final Class163 aClass163_24 = new Class163(32);

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_80 = new Class265(25, 20);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;Lclient!si;B)I")
	public static int method3097(@OriginalArg(0) String arg0, @OriginalArg(1) Class2_Sub23 arg1) {
		@Pc(14) int local14 = arg1.anInt6952;
		@Pc(18) byte[] local18 = Static146.method2425(arg0);
		arg1.method5475(local18.length);
		arg1.anInt6952 += Static391.aClass157_3.method3608(arg1.aByteArray130, arg1.anInt6952, 0, local18.length, local18);
		return arg1.anInt6952 - local14;
	}
}
