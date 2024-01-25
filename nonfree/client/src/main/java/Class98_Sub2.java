import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class98_Sub2 extends Class98 {

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Lclient!ak;")
	public final Interface2 anInterface2_2;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!ej;II[B)V")
	public Class98_Sub2(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface2_2 = arg0.method6958(false, arg2, arg3, Static106.aClass141_3, arg1);
		this.anInterface2_2.method6718(false, false);
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!ej;II[I)V")
	public Class98_Sub2(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface2_2 = arg0.method6951(false, arg2, arg1, arg3);
		this.anInterface2_2.method6718(false, false);
	}
}
