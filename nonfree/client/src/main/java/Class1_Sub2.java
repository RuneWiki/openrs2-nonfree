import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!me", name = "f", descriptor = "Lclient!de;")
	public final Interface4 anInterface4_4;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!lb;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface4_4 = arg0.method9841(arg3, false, arg2, arg1, Static408.aClass295_11);
		this.anInterface4_4.method6853(false, false);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!lb;II[I)V")
	public Class1_Sub2(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface4_4 = arg0.method9753(arg3, false, arg2, arg1);
		this.anInterface4_4.method6853(false, false);
	}
}
