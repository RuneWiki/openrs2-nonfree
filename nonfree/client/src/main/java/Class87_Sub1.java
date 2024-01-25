import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class87_Sub1 extends Class87 {

	@OriginalMember(owner = "client!en", name = "g", descriptor = "Lclient!og;")
	public final Class4_Sub2_Sub1 aClass4_Sub2_Sub1_1;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!jj;II[B)V")
	public Class87_Sub1(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass4_Sub2_Sub1_1 = Static302.method4982(arg0, arg2, arg3, arg1);
		this.aClass4_Sub2_Sub1_1.method5467(false, false);
	}
}
