import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public final class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!nca", name = "m", descriptor = "Lclient!em;")
	public final Class73_Sub1_Sub1 aClass73_Sub1_Sub1_3;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lclient!uq;II[B)V")
	public Class40_Sub2(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass73_Sub1_Sub1_3 = Static14.method425(arg3, arg2, arg0, arg1);
		this.aClass73_Sub1_Sub1_3.method1954(false, false);
	}
}
