import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public final class Class3_Sub17_Sub5 extends Class3_Sub17 {

	@OriginalMember(owner = "client!gea", name = "n", descriptor = "I")
	private int anInt3370 = -1;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BLclient!eaa;)V")
	@Override
	public void method9118(@OriginalArg(1) Class84 arg0) {
		arg0.method2328(this.anInt3370);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!ika;Z)V")
	@Override
	public void method9119(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt3370 = arg0.method2028(-14795);
	}
}
