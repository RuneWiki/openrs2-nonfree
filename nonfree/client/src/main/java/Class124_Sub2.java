import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class124_Sub2 extends Class124 {

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "Lclient!qq;")
	public final Class81_Sub4_Sub1 aClass81_Sub4_Sub1_5;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!cg;II[B)V")
	public Class124_Sub2(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass81_Sub4_Sub1_5 = Static375.method4750(arg1, arg2, arg3, arg0);
		this.aClass81_Sub4_Sub1_5.method4745(false, false);
	}
}
