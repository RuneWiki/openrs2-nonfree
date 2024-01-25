import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
	private final int anInt3905;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!lh;I)V")
	public Class39_Sub1(@OriginalArg(0) Class120 arg0, @OriginalArg(1) int arg1) {
		Static175.anInterface7_2 = arg0.method3228();
		this.anInt3905 = arg1;
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "()I")
	@Override
	protected int method4802() {
		return Static175.anInterface7_2.method4244(this.anInt3905);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4803(@OriginalArg(0) Component arg0) throws Exception {
		Static175.anInterface7_2.method4240(Static288.aBoolean515, arg0, Static57.anInt1232);
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "()V")
	@Override
	protected void method4799() {
		Static175.anInterface7_2.method4242(this.anInt3905);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "()V")
	@Override
	protected void method4796() {
		Static175.anInterface7_2.method4243(this.anInt3905);
	}

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "()V")
	@Override
	protected void method4805() {
		Static175.anInterface7_2.method4245(this.anInt3905, super.anIntArray460);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	@Override
	public void method4794(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static175.anInterface7_2.method4241(this.anInt3905, arg0);
	}
}
