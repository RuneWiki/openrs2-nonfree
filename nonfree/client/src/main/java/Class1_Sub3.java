import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "Lclient!to;")
	public final Class245_Sub2_Sub1 aClass245_Sub2_Sub1_3;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!gia;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass245_Sub2_Sub1_3 = Static305.method4657(arg0, arg2, arg1, arg3);
		this.aClass245_Sub2_Sub1_3.method8473(false, false);
	}
}
