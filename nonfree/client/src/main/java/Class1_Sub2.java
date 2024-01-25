import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "Lclient!kt;")
	public final Interface12 anInterface12_2;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lclient!wk;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface12_2 = arg0.method6339(arg3, arg1, arg2, Static83.aClass255_1, false);
		this.anInterface12_2.method7449(false, false);
	}

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lclient!wk;II[I)V")
	public Class1_Sub2(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface12_2 = arg0.method6292(false, arg3, arg2, arg1);
		this.anInterface12_2.method7449(false, false);
	}
}
