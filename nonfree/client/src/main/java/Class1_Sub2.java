import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "Lclient!ah;")
	public final Interface2 anInterface2_5;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!gca;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface2_5 = arg0.method7944(arg3, arg2, Static624.aClass358_16, arg1, false);
		this.anInterface2_5.method3687(false, false);
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!gca;II[I)V")
	public Class1_Sub2(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface2_5 = arg0.method7875(false, arg1, arg3, arg2);
		this.anInterface2_5.method3687(false, false);
	}
}
