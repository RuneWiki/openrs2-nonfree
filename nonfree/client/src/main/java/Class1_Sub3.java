import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!oja", name = "i", descriptor = "Lclient!ada;")
	public final Interface1 anInterface1_4;

	@OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(Lclient!wg;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface1_4 = arg0.method8174(arg2, false, arg3, Static360.aClass276_15, arg1);
		this.anInterface1_4.method8629(false, false);
	}

	@OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(Lclient!wg;II[I)V")
	public Class1_Sub3(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface1_4 = arg0.method8273(false, arg1, arg2, arg3);
		this.anInterface1_4.method8629(false, false);
	}
}
