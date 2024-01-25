import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public final class Class2_Sub34_Sub1 extends Class2_Sub34 {

	@OriginalMember(owner = "client!om", name = "t", descriptor = "I")
	private int anInt7523 = -1;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!et;Z)V")
	@Override
	public void method8952(@OriginalArg(0) Class2_Sub20 arg0) {
		this.anInt7523 = arg0.method8575();
		arg0.method8581(-17416);
		if (arg0.method8581(-17416) != 255) {
			arg0.anInt9723--;
			arg0.method8590();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!nw;B)V")
	@Override
	public void method8955(@OriginalArg(0) Class2_Sub43 arg0) {
		arg0.method6386(this.anInt7523);
	}
}
