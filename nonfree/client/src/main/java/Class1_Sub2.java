import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "Lclient!sb;")
	public final Class167_Sub3_Sub1 aClass167_Sub3_Sub1_4;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!rs;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass167_Sub3_Sub1_4 = Static636.method8978(arg2, arg0, arg3, arg1);
		this.aClass167_Sub3_Sub1_4.method7524(false, false);
	}
}
