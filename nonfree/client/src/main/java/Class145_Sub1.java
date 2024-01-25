import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public final class Class145_Sub1 extends Class145 {

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "Lclient!ps;")
	public final Class6_Sub1_Sub1 aClass6_Sub1_Sub1_5;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!fd;II[B)V")
	public Class145_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass6_Sub1_Sub1_5 = Static38.method671(arg3, arg0, arg1, arg2);
		this.aClass6_Sub1_Sub1_5.method4196(false, false);
	}
}
