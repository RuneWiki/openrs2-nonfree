import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!eca", name = "e", descriptor = "Lclient!hea;")
	public final Class132_Sub1_Sub1 aClass132_Sub1_Sub1_2;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!ap;II[B)V")
	public Class19_Sub2(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass132_Sub1_Sub1_2 = Static569.method8023(arg3, arg1, arg0, arg2);
		this.aClass132_Sub1_Sub1_2.method3694(false, false);
	}
}
