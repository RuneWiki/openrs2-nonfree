import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "Lclient!gp;")
	public final Interface6 anInterface6_2;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!nb;II[B)V")
	public Class1_Sub1(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface6_2 = arg0.method5670(arg3, arg2, false, Static407.aClass145_13, arg1);
		this.anInterface6_2.method9275(false, false);
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!nb;II[I)V")
	public Class1_Sub1(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface6_2 = arg0.method5567(arg1, false, arg2, arg3);
		this.anInterface6_2.method9275(false, false);
	}
}
