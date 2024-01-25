import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "Lclient!cf;")
	public final Interface7 anInterface7_5;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lclient!jj;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface7_5 = arg0.method6825(arg2, false, arg3, Static212.aClass155_46, arg1);
		this.anInterface7_5.method8723(false, false);
	}

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lclient!jj;II[I)V")
	public Class1_Sub3(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface7_5 = arg0.method6727(arg1, false, arg3, arg2);
		this.anInterface7_5.method8723(false, false);
	}
}
