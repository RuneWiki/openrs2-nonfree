import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!br", name = "m", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!br", name = "o", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!br", name = "p", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!br", name = "s", descriptor = "I")
	private int anInt850 = -1;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!im;B)V")
	@Override
	public void method8505(@OriginalArg(0) Class166 arg0) {
		arg0.method4095(this.anInt850, this.anInt848, this.anInt847, this.anInt846);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BLclient!mc;)V")
	@Override
	public void method8507(@OriginalArg(1) Class5_Sub41 arg0) {
		this.anInt850 = arg0.method7860();
		this.anInt848 = arg0.method7804();
		this.anInt846 = arg0.method7816();
		this.anInt847 = arg0.method7816();
	}
}
