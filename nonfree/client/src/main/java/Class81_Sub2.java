import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class81_Sub2 extends Class81 {

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "Lclient!pm;")
	public final Interface17 anInterface17_3;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!mj;II[B)V")
	public Class81_Sub2(@OriginalArg(0) Class45_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface17_3 = arg0.method5013(arg2, arg3, arg1, Static213.aClass314_19, false);
		this.anInterface17_3.method6973(false, false);
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!mj;II[I)V")
	public Class81_Sub2(@OriginalArg(0) Class45_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface17_3 = arg0.method4904(false, arg2, arg1, arg3);
		this.anInterface17_3.method6973(false, false);
	}
}
