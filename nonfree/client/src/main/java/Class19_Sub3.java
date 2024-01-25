import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public final class Class19_Sub3 extends Class19 {

	@OriginalMember(owner = "client!ufa", name = "h", descriptor = "Lclient!ae;")
	public final Interface1 anInterface1_4;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lclient!fo;II[B)V")
	public Class19_Sub3(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface1_4 = arg0.method5572(Static451.aClass333_14, false, arg3, arg1, arg2);
		this.anInterface1_4.method7753(false, false);
	}

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lclient!fo;II[I)V")
	public Class19_Sub3(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface1_4 = arg0.method5556(arg3, arg1, false, arg2);
		this.anInterface1_4.method7753(false, false);
	}
}
