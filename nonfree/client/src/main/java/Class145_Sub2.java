import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public final class Class145_Sub2 extends Class145 {

	@OriginalMember(owner = "client!maa", name = "k", descriptor = "Lclient!es;")
	public final Class79_Sub2_Sub1 aClass79_Sub2_Sub1_4;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lclient!gi;II[B)V")
	public Class145_Sub2(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass79_Sub2_Sub1_4 = Static95.method2003(arg3, arg0, arg1, arg2);
		this.aClass79_Sub2_Sub1_4.method2529(false, false);
	}
}
