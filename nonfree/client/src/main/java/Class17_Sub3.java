import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class17_Sub3 extends Class17 {

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "Lclient!hr;")
	public final Interface7 anInterface7_2;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!gj;II[B)V")
	public Class17_Sub3(@OriginalArg(0) Class90_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface7_2 = arg0.method7622(arg3, arg1, false, Static357.aClass171_12, arg2);
		this.anInterface7_2.method7047(false, false);
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!gj;II[I)V")
	public Class17_Sub3(@OriginalArg(0) Class90_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface7_2 = arg0.method7597(arg1, arg2, arg3, false);
		this.anInterface7_2.method7047(false, false);
	}
}
