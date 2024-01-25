import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public final class Class146_Sub2 extends Class146 {

	@OriginalMember(owner = "client!po", name = "g", descriptor = "Lclient!hi;")
	public final Interface10 anInterface10_4;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!cf;II[B)V")
	public Class146_Sub2(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface10_4 = arg0.method4285(arg1, arg3, arg2, false, Static563.aClass93_13);
		this.anInterface10_4.method6171(false, false);
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!cf;II[I)V")
	public Class146_Sub2(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface10_4 = arg0.method4303(arg2, arg3, false, arg1);
		this.anInterface10_4.method6171(false, false);
	}
}
