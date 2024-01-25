import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!wp;")
	public final Interface26 anInterface26_5;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!kd;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface26_5 = arg0.method7788(false, Static78.aClass114_19, arg2, arg3, arg1);
		this.anInterface26_5.method4348(false, false);
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!kd;II[I)V")
	public Class1_Sub3(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface26_5 = arg0.method7787(arg3, arg1, arg2, false);
		this.anInterface26_5.method4348(false, false);
	}
}
