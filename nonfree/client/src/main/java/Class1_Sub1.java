import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "Lclient!qt;")
	public final Class116_Sub2_Sub1 aClass116_Sub2_Sub1_1;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!pc;II[B)V")
	public Class1_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass116_Sub2_Sub1_1 = Static597.method7836(arg0, arg1, arg3, arg2);
		this.aClass116_Sub2_Sub1_1.method6838(false, false);
	}
}
