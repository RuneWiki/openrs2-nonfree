import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Lclient!vt;")
	public final Class125_Sub1_Sub1 aClass125_Sub1_Sub1_2;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!aq;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass125_Sub1_Sub1_2 = Static445.method5891(arg1, arg3, arg0, arg2);
		this.aClass125_Sub1_Sub1_2.method9224(false, false);
	}
}
