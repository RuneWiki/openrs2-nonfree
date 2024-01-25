import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "Lclient!ch;")
	public final Interface3 anInterface3_6;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!wu;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface3_6 = arg0.method6125(arg2, false, arg3, Static598.aClass250_15, arg1);
		this.anInterface3_6.method7839(false, false);
	}

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!wu;II[I)V")
	public Class1_Sub3(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface3_6 = arg0.method6097(false, arg2, arg3, arg1);
		this.anInterface3_6.method7839(false, false);
	}
}
