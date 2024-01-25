import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class73_Sub1 extends Class73 {

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "Lclient!wh;")
	public final Class23_Sub3_Sub1 aClass23_Sub3_Sub1_1;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!ih;II[B)V")
	public Class73_Sub1(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass23_Sub3_Sub1_1 = Static165.method2163(arg0, arg1, arg2, arg3);
		this.aClass23_Sub3_Sub1_1.method5808(false, false);
	}
}
