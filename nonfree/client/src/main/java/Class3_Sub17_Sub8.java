import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public final class Class3_Sub17_Sub8 extends Class3_Sub17 {

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
	private int anInt5609 = -1;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLclient!eaa;)V")
	@Override
	public void method9118(@OriginalArg(1) Class84 arg0) {
		arg0.method2320(this.anInt5609);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ika;Z)V")
	@Override
	public void method9119(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt5609 = arg0.method2028(-14795);
	}
}
