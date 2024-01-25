import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "Lclient!gq;")
	public final Interface3 anInterface3_1;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!re;II[B)V")
	public Class40_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface3_1 = arg0.method5662(Static526.aClass292_15, arg3, false, arg2, arg1);
		this.anInterface3_1.method7318(false, false);
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!re;II[I)V")
	public Class40_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface3_1 = arg0.method5661(arg2, false, arg1, arg3);
		this.anInterface3_1.method7318(false, false);
	}
}
