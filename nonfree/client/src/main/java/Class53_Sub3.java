import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class53_Sub3 extends Class53 {

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "Lclient!mca;")
	public final Interface12 anInterface12_5;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!rr;II[B)V")
	public Class53_Sub3(@OriginalArg(0) Class31_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface12_5 = arg0.method7087(arg3, false, Static199.aClass245_11, arg2, arg1);
		this.anInterface12_5.method2990(false, false);
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!rr;II[I)V")
	public Class53_Sub3(@OriginalArg(0) Class31_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface12_5 = arg0.method7089(arg3, arg1, false, arg2);
		this.anInterface12_5.method2990(false, false);
	}
}
