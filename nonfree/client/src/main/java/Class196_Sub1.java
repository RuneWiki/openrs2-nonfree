import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class196_Sub1 extends Class196 {

	@OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
	private final int anInt5655;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!pe;I)V")
	public Class196_Sub1(@OriginalArg(0) Class246 arg0, @OriginalArg(1) int arg1) {
		Static295.anInterface5_1 = (Interface5) arg0.method6138();
		this.anInt5655 = arg1;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "()V")
	@Override
	protected void method6414() {
		Static295.anInterface5_1.method7287(this.anInt5655);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "()I")
	@Override
	protected int method6405() {
		return Static295.anInterface5_1.method7290(this.anInt5655);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	@Override
	public void method6410(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static295.anInterface5_1.method7289(arg0, this.anInt5655);
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "()V")
	@Override
	protected void method6411() {
		Static295.anInterface5_1.method7292(this.anInt5655);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6406(@OriginalArg(0) Component arg0) throws Exception {
		Static295.anInterface5_1.method7291(Static83.aBoolean193, arg0, Static77.anInt1912);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "()V")
	@Override
	protected void method6409() {
		Static295.anInterface5_1.method7288(this.anInt5655, super.anIntArray541);
	}
}
