import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public final class Class112_Sub2 extends Class112 {

	@OriginalMember(owner = "client!mba", name = "I", descriptor = "I")
	private final int anInt6569;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!td;I)V")
	public Class112_Sub2(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1) {
		Static355.anInterface13_1 = (Interface13) arg0.method8146();
		this.anInt6569 = arg1;
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "()V")
	@Override
	protected void method5382() {
		Static355.anInterface13_1.method8513(this.anInt6569);
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "()V")
	@Override
	protected void method5379() {
		Static355.anInterface13_1.method8515(this.anInt6569, super.anIntArray471);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "()I")
	@Override
	protected int method5378() {
		return Static355.anInterface13_1.method8516(this.anInt6569);
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)V")
	@Override
	public void method5386(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static355.anInterface13_1.method8517(arg0, this.anInt6569);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5384(@OriginalArg(0) Component arg0) throws Exception {
		Static355.anInterface13_1.method8514(arg0, Static515.anInt9036, Static40.aBoolean129);
	}

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "()V")
	@Override
	protected void method5383() {
		Static355.anInterface13_1.method8512(this.anInt6569);
	}
}
