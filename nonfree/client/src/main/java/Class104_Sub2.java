import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public final class Class104_Sub2 extends Class104 {

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "Lclient!al;")
	public final Class10_Sub1_Sub1 aClass10_Sub1_Sub1_2;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!ur;II[B)V")
	public Class104_Sub2(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass10_Sub1_Sub1_2 = Static264.method3745(arg2, arg1, arg0, arg3);
		this.aClass10_Sub1_Sub1_2.method201(false, false);
	}
}
