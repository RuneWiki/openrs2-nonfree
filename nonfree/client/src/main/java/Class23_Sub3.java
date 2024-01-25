import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class Class23_Sub3 extends Class23 {

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "Lclient!jb;")
	public final Interface5 anInterface5_4;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!cb;II[B)V")
	public Class23_Sub3(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface5_4 = arg0.method7702(false, arg2, arg3, arg1, Static97.aClass16_17);
		this.anInterface5_4.method7967(false, false);
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!cb;II[I)V")
	public Class23_Sub3(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface5_4 = arg0.method7711(arg1, arg3, false, arg2);
		this.anInterface5_4.method7967(false, false);
	}
}
