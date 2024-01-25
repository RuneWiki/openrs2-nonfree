import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class156_Sub1 extends Class156 {

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!l;")
	public final Class8_Sub1_Sub1 aClass8_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!sq;II[B)V")
	public Class156_Sub1(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass8_Sub1_Sub1_3 = Static360.method3374(arg0, arg3, arg1, arg2);
		this.aClass8_Sub1_Sub1_3.method3370(false, false);
	}
}
