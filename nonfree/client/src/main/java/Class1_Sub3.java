import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "Lclient!pt;")
	public final Interface16 anInterface16_5;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!jca;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface16_5 = arg0.method8934(arg1, arg2, Static702.aClass335_19, arg3, false);
		this.anInterface16_5.method8248(false, false);
	}

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!jca;II[I)V")
	public Class1_Sub3(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface16_5 = arg0.method8950(arg3, arg1, arg2, false);
		this.anInterface16_5.method8248(false, false);
	}
}
