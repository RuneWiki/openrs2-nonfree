import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class52_Sub2 extends Class52 {

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "Lclient!dg;")
	public final Class20_Sub1_Sub1 aClass20_Sub1_Sub1_4;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!h;II[B)V")
	public Class52_Sub2(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass20_Sub1_Sub1_4 = Static362.method1392(arg0, arg1, arg2, arg3);
		this.aClass20_Sub1_Sub1_4.method1388(false, false);
	}
}
