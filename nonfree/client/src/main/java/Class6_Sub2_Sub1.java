import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MQTIFFLX")
public class Class6_Sub2_Sub1 extends Class6_Sub2 {

	@OriginalMember(owner = "client!MQTIFFLX", name = "i", descriptor = "[Lclient!VCPFYTXG;")
	public Class41[] aClass41Array9;

	@OriginalMember(owner = "client!MQTIFFLX", name = "j", descriptor = "I")
	public int anInt714 = 1000;

	@OriginalMember(owner = "client!MQTIFFLX", name = "a", descriptor = "(IIIIIIIII)V")
	public void method481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class6_Sub2_Sub1_Sub6 local3 = this.method482();
		if (local3 != null) {
			this.anInt714 = local3.anInt714;
			local3.method481(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!MQTIFFLX", name = "a", descriptor = "(Z)Lclient!WEVRTBOZ;")
	protected Class6_Sub2_Sub1_Sub6 method482() {
		try {
			return null;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("11257, " + true + ", " + local8.toString());
			throw new RuntimeException();
		}
	}
}
