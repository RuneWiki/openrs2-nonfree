import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Lclient!ub;")
	public final Class29_Sub3_Sub1 aClass29_Sub3_Sub1_1;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!vf;II[B)V")
	public Class1_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass29_Sub3_Sub1_1 = Static608.method8368(arg2, arg1, arg0, arg3);
		this.aClass29_Sub3_Sub1_1.method8174(false, false);
	}
}
