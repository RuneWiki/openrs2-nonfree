import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public final class Class86_Sub3 extends Class86 {

	@OriginalMember(owner = "client!up", name = "h", descriptor = "Lclient!hq;")
	public final Class51_Sub1_Sub1 aClass51_Sub1_Sub1_5;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!jaa;II[B)V")
	public Class86_Sub3(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass51_Sub1_Sub1_5 = Static88.method1672(arg3, arg1, arg2, arg0);
		this.aClass51_Sub1_Sub1_5.method3535(false, false);
	}
}
