import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!la", name = "K", descriptor = "Lclient!ifa;")
	public static final Class163 aClass163_30 = new Class163();

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)Lclient!es;")
	public static Class4_Sub11 method4513() {
		@Pc(14) Class4_Sub11 local14 = Static445.method6120();
		local14.method8873(0L);
		local14.method8857(Static602.aString115);
		local14.method8873(Static238.aLong116);
		local14.method8873(Static291.aLong137);
		local14.method8878(Static271.aBigInteger4, Static522.aBigInteger9);
		return local14;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(III)I")
	public static int method4515(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
