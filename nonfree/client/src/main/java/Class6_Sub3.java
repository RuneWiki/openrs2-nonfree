import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "Lclient!eb;")
	public final Class77_Sub1_Sub1 aClass77_Sub1_Sub1_4;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!kga;II[B)V")
	public Class6_Sub3(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass77_Sub1_Sub1_4 = Static108.method2381(arg1, arg2, arg0, arg3);
		this.aClass77_Sub1_Sub1_4.method2266(false, false);
	}
}
