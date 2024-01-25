import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "Lclient!baa;")
	public final Interface2 anInterface2_2;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!bm;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface2_2 = arg0.method1992(arg1, arg2, arg3, false, Static104.aClass82_3);
		this.anInterface2_2.method6506(false, false);
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!bm;II[I)V")
	public Class1_Sub2(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface2_2 = arg0.method2023(arg3, false, arg1, arg2);
		this.anInterface2_2.method6506(false, false);
	}
}
