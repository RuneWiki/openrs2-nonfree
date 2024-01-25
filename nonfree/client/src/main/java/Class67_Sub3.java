import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class67_Sub3 extends Class67 {

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!dca;")
	public final Interface4 anInterface4_5;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!nh;II[B)V")
	public Class67_Sub3(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface4_5 = arg0.method5665(arg3, arg2, Static129.aClass161_5, arg1, false);
		this.anInterface4_5.method7375(false, false);
	}

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!nh;II[I)V")
	public Class67_Sub3(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface4_5 = arg0.method5699(arg2, false, arg1, arg3);
		this.anInterface4_5.method7375(false, false);
	}
}
