import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!bba", name = "I", descriptor = "I")
	private final int anInt836;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lclient!ufa;I)V")
	public Class24_Sub1(@OriginalArg(0) Class326 arg0, @OriginalArg(1) int arg1) {
		Static26.anInterface10_1 = (Interface10) arg0.method7799();
		this.anInt836 = arg1;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1131(@OriginalArg(0) Component arg0) throws Exception {
		Static26.anInterface10_1.method4942(Static149.anInt2863, arg0, Static124.aBoolean223);
	}

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "()V")
	@Override
	protected void method1133() {
		Static26.anInterface10_1.method4943(this.anInt836, super.anIntArray66);
	}

	@OriginalMember(owner = "client!bba", name = "d", descriptor = "()V")
	@Override
	protected void method1141() {
		Static26.anInterface10_1.method4938(this.anInt836);
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "()I")
	@Override
	protected int method1130() {
		return Static26.anInterface10_1.method4941(this.anInt836);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "()V")
	@Override
	protected void method1129() {
		Static26.anInterface10_1.method4940(this.anInt836);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V")
	@Override
	public void method1127(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static26.anInterface10_1.method4939(this.anInt836, arg0);
	}
}
