import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public final class Class32_Sub2 extends Class32 {

	@OriginalMember(owner = "client!io", name = "g", descriptor = "Lclient!cw;")
	public final Class42_Sub1_Sub1 aClass42_Sub1_Sub1_4;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!gk;II[B)V")
	public Class32_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass42_Sub1_Sub1_4 = Static144.method2562(arg3, arg2, arg0, arg1);
		this.aClass42_Sub1_Sub1_4.method1269(false, false);
	}
}
