import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "Lclient!of;")
	public final Class76_Sub3_Sub1 aClass76_Sub3_Sub1_4;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!kw;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass76_Sub3_Sub1_4 = Static485.method7223(arg0, arg1, arg3, arg2);
		this.aClass76_Sub3_Sub1_4.method6412(false, false);
	}
}
