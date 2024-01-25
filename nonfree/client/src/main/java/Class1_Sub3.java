import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "Lclient!ec;")
	public final Interface7 anInterface7_3;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!ai;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface7_3 = arg0.method7446(arg3, arg1, arg2, false, Static337.aClass327_12);
		this.anInterface7_3.method5805(false, false);
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!ai;II[I)V")
	public Class1_Sub3(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface7_3 = arg0.method7526(arg1, arg2, false, arg3);
		this.anInterface7_3.method5805(false, false);
	}
}
