import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!sea", name = "j", descriptor = "Lclient!rm;")
	public final Interface20 anInterface20_6;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!pj;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface20_6 = arg0.method6257(arg3, arg2, false, Static356.aClass223_12, arg1);
		this.anInterface20_6.method4639(false, false);
	}

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!pj;II[I)V")
	public Class1_Sub3(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface20_6 = arg0.method6181(arg2, false, arg1, arg3);
		this.anInterface20_6.method4639(false, false);
	}
}
