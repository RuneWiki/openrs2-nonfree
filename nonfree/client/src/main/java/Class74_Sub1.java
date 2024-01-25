import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class Class74_Sub1 extends Class74 {

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "Lclient!ef;")
	public final Class28_Sub3_Sub1 aClass28_Sub3_Sub1_1;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!ge;II[B)V")
	public Class74_Sub1(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass28_Sub3_Sub1_1 = Static359.method1259(arg3, arg0, arg1, arg2);
		this.aClass28_Sub3_Sub1_1.method1257(false, false);
	}
}
