import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public final class Class62_Sub2 extends Class62 {

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "Lclient!cq;")
	public final Class13_Sub1_Sub1 aClass13_Sub1_Sub1_5;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!ht;II[B)V")
	public Class62_Sub2(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass13_Sub1_Sub1_5 = Static96.method1521(arg2, arg3, arg0, arg1);
		this.aClass13_Sub1_Sub1_5.method1055(false, false);
	}
}
