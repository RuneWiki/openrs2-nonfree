import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class84_Sub2 extends Class84 {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!gn;")
	public final Class70_Sub4_Sub1 aClass70_Sub4_Sub1_5;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!ql;II[B)V")
	public Class84_Sub2(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass70_Sub4_Sub1_5 = Static360.method1996(arg2, arg3, arg1, arg0);
		this.aClass70_Sub4_Sub1_5.method1991(false, false);
	}
}
