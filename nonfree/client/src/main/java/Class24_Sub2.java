import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!gq;")
	public final Class8_Sub1_Sub1 aClass8_Sub1_Sub1_2;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!ih;II[B)V")
	public Class24_Sub2(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass8_Sub1_Sub1_2 = Static75.method1402(arg3, arg1, arg2, arg0);
		this.aClass8_Sub1_Sub1_2.method2252(false, false);
	}
}
