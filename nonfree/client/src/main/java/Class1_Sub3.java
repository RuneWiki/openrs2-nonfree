import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!no", name = "j", descriptor = "Lclient!bo;")
	public final Class44_Sub1_Sub1 aClass44_Sub1_Sub1_3;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!kv;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass44_Sub1_Sub1_3 = Static387.method5664(arg2, arg3, arg0, arg1);
		this.aClass44_Sub1_Sub1_3.method794(false, false);
	}
}
