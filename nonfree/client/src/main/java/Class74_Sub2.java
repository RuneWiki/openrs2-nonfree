import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class74_Sub2 extends Class74 {

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Lclient!hf;")
	public final Class62_Sub2_Sub1 aClass62_Sub2_Sub1_5;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!bt;II[B)V")
	public Class74_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass62_Sub2_Sub1_5 = Static274.method4386(arg3, arg2, arg0, arg1);
		this.aClass62_Sub2_Sub1_5.method2681(false, false);
	}
}
