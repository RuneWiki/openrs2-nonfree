import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public final class Class81_Sub1 extends Class81 {

	@OriginalMember(owner = "client!eca", name = "e", descriptor = "Lclient!br;")
	public final Class24_Sub1_Sub1 aClass24_Sub1_Sub1_3;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!vj;II[B)V")
	public Class81_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass24_Sub1_Sub1_3 = Static58.method1203(arg3, arg1, arg2, arg0);
		this.aClass24_Sub1_Sub1_3.method824(false, false);
	}
}
