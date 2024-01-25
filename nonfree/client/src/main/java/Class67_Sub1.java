import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class67_Sub1 extends Class67 {

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!bb;")
	public final Class3_Sub2_Sub1 aClass3_Sub2_Sub1_1;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!kfa;II[B)V")
	public Class67_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass3_Sub2_Sub1_1 = Static283.method4492(arg1, arg0, arg2, arg3);
		this.aClass3_Sub2_Sub1_1.method953(false, false);
	}
}
