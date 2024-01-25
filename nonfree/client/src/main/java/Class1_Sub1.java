import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!jja", name = "h", descriptor = "Lclient!ke;")
	public final Class64_Sub4_Sub1 aClass64_Sub4_Sub1_1;

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "(Lclient!uja;II[B)V")
	public Class1_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass64_Sub4_Sub1_1 = Static431.method6279(arg2, arg3, arg1, arg0);
		this.aClass64_Sub4_Sub1_1.method4548(false, false);
	}
}
