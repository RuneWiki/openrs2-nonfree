import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public final class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "Lclient!me;")
	public final Class64_Sub4_Sub1 aClass64_Sub4_Sub1_1;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!na;II[B)V")
	public Class102_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass64_Sub4_Sub1_1 = Static342.method4851(arg0, arg3, arg1, arg2);
		this.aClass64_Sub4_Sub1_1.method3530(false, false);
	}
}
