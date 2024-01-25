import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static25 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "I")
	public static int anInt546;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!jp;B)Lclient!qda;")
	public static Class55_Sub4 method662(@OriginalArg(0) Class3_Sub25 arg0) {
		return new Class55_Sub4(arg0.method8589(), arg0.method8589(), arg0.method8589(), arg0.method8589(), arg0.method8589(), arg0.method8589(), arg0.method8589(), arg0.method8589(), arg0.method8607(), arg0.method8632());
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(JJ)J")
	public static long method663(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
