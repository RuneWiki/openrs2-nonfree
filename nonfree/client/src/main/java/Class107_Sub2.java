import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Class107_Sub2 extends Class107 {

	@OriginalMember(owner = "client!mca", name = "F", descriptor = "I")
	private final int anInt6193;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lclient!br;I)V")
	public Class107_Sub2(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1) {
		Static398.anInterface7_1 = (Interface7) arg0.method1404();
		this.anInt6193 = arg1;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "()I")
	@Override
	protected int method5376() {
		return Static398.anInterface7_1.method6311(this.anInt6193);
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "()V")
	@Override
	protected void method5379() {
		Static398.anInterface7_1.method6310(this.anInt6193);
	}

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "()V")
	@Override
	protected void method5378() {
		Static398.anInterface7_1.method6308(this.anInt6193);
	}

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "()V")
	@Override
	protected void method5375() {
		Static398.anInterface7_1.method6309(this.anInt6193, super.anIntArray471);
	}

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "(I)V")
	@Override
	public void method5373(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static398.anInterface7_1.method6313(arg0, this.anInt6193);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5369(@OriginalArg(0) Component arg0) throws Exception {
		Static398.anInterface7_1.method6312(arg0, Static330.aBoolean659, Static330.anInt9773);
	}
}
