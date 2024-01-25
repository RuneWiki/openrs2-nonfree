import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "Lclient!gv;")
	public final Class94_Sub2_Sub1 aClass94_Sub2_Sub1_5;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!dw;II[B)V")
	public Class1_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass94_Sub2_Sub1_5 = Static301.method5120(arg1, arg0, arg2, arg3);
		this.aClass94_Sub2_Sub1_5.method3120(false, false);
	}
}
