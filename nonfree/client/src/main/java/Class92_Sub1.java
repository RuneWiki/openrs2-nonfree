import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class92_Sub1 extends Class92 {

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "Lclient!mf;")
	public final Class19_Sub3_Sub1 aClass19_Sub3_Sub1_3;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!ks;II[B)V")
	public Class92_Sub1(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass19_Sub3_Sub1_3 = Static376.method3683(arg2, arg0, arg1, arg3);
		this.aClass19_Sub3_Sub1_3.method3681(false, false);
	}
}
