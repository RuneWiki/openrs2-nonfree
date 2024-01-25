import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!wk;")
	public final Interface27 anInterface27_5;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!ij;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface27_5 = arg0.method8198(arg3, Static210.aClass104_18, arg1, arg2, false);
		this.anInterface27_5.method7134(false, false);
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!ij;II[I)V")
	public Class1_Sub3(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface27_5 = arg0.method8257(false, arg3, arg2, arg1);
		this.anInterface27_5.method7134(false, false);
	}
}
