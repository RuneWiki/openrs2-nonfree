import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class97_Sub1 extends Class97 {

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "Lclient!bc;")
	public final Class18_Sub1_Sub1 aClass18_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!hj;II[B)V")
	public Class97_Sub1(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass18_Sub1_Sub1_3 = Static356.method506(arg0, arg2, arg3, arg1);
		this.aClass18_Sub1_Sub1_3.method500(false, false);
	}
}
