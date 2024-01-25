import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!dd;")
	public final Class65_Sub1_Sub1 aClass65_Sub1_Sub1_2;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!ep;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass65_Sub1_Sub1_2 = Static572.method7835(arg3, arg0, arg1, arg2);
		this.aClass65_Sub1_Sub1_2.method1424(false, false);
	}
}
