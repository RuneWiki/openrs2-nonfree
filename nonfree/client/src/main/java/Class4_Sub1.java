import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
	private final int anInt148;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!da;I)V")
	public Class4_Sub1(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1) {
		Static6.anInterface3_1 = arg0.method627();
		this.anInt148 = arg1;
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "()V")
	@Override
	protected void method2770() {
		Static6.anInterface3_1.method2799(this.anInt148);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2774(@OriginalArg(0) Component arg0) throws Exception {
		Static6.anInterface3_1.method2800(arg0, Static178.anInt4019, Static128.aBoolean131);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "()V")
	@Override
	protected void method2768() {
		Static6.anInterface3_1.method2802(this.anInt148, super.anIntArray429);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "()I")
	@Override
	protected int method2766() {
		return Static6.anInterface3_1.method2797(this.anInt148);
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
	@Override
	public void method2783(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static6.anInterface3_1.method2801(arg0, this.anInt148);
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "()V")
	@Override
	protected void method2769() {
		Static6.anInterface3_1.method2798(this.anInt148);
	}
}
