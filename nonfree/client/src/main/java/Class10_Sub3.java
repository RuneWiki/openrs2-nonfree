import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Lclient!ah;")
	public final Class11_Sub1_Sub1 aClass11_Sub1_Sub1_5;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!ad;II[B)V")
	public Class10_Sub3(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass11_Sub1_Sub1_5 = Static236.method1277(arg0, arg3, arg1, arg2);
		this.aClass11_Sub1_Sub1_5.method605(false, false);
	}
}
