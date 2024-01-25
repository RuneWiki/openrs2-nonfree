import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "Lclient!iba;")
	public final Class3_Sub2_Sub1 aClass3_Sub2_Sub1_2;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!wh;II[B)V")
	public Class1_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass3_Sub2_Sub1_2 = Static318.method5302(arg2, arg1, arg0, arg3);
		this.aClass3_Sub2_Sub1_2.method3904(false, false);
	}
}
