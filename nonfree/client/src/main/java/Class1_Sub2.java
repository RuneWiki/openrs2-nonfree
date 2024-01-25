import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "Lclient!vq;")
	public final Class39_Sub4_Sub1 aClass39_Sub4_Sub1_5;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!hk;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass39_Sub4_Sub1_5 = Static608.method8045(arg1, arg2, arg0, arg3);
		this.aClass39_Sub4_Sub1_5.method8469(false, false);
	}
}
