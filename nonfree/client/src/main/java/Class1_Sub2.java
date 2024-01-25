import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "Lclient!js;")
	public final Interface15 anInterface15_2;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!uv;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface15_2 = arg0.method4056(arg1, Static268.aClass178_6, arg3, false, arg2);
		this.anInterface15_2.method8452(false, false);
	}

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!uv;II[I)V")
	public Class1_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface15_2 = arg0.method4015(arg1, arg2, arg3, false);
		this.anInterface15_2.method8452(false, false);
	}
}
