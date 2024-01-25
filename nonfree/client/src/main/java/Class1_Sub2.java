import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "Lclient!wda;")
	public final Interface26 anInterface26_5;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lclient!gt;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface26_5 = arg0.method5113(arg3, false, arg2, Static249.aClass187_7, arg1);
		this.anInterface26_5.method8053(false, false);
	}

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lclient!gt;II[I)V")
	public Class1_Sub2(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface26_5 = arg0.method5098(false, arg2, arg1, arg3);
		this.anInterface26_5.method8053(false, false);
	}
}
