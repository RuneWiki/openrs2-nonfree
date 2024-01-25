import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!me;")
	public final Class85_Sub3_Sub1 aClass85_Sub3_Sub1_1;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!dia;II[B)V")
	public Class1_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass85_Sub3_Sub1_1 = Static338.method5088(arg3, arg2, arg0, arg1);
		this.aClass85_Sub3_Sub1_1.method5365(false, false);
	}
}
