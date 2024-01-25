import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "Lclient!oc;")
	public final Class19_Sub4_Sub1 aClass19_Sub4_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!rl;II[B)V")
	public Class22_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass19_Sub4_Sub1_1 = Static203.method3130(arg0, arg3, arg2, arg1);
		this.aClass19_Sub4_Sub1_1.method4257(false, false);
	}
}
