import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class93_Sub3 extends Class93 {

	@OriginalMember(owner = "client!od", name = "f", descriptor = "Lclient!qaa;")
	public final Interface14 anInterface14_4;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!fc;II[B)V")
	public Class93_Sub3(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface14_4 = arg0.method5484(arg1, arg3, false, arg2, Static379.aClass261_10);
		this.anInterface14_4.method8238(false, false);
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!fc;II[I)V")
	public Class93_Sub3(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface14_4 = arg0.method5385(arg3, arg2, arg1, false);
		this.anInterface14_4.method8238(false, false);
	}
}
