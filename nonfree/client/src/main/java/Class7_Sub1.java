import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!af", name = "I", descriptor = "I")
	private final int anInt204;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!ew;I)V")
	public Class7_Sub1(@OriginalArg(0) Class99 arg0, @OriginalArg(1) int arg1) {
		Static7.anInterface1_1 = (Interface1) arg0.method1781();
		this.anInt204 = arg1;
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "()I")
	@Override
	protected int method6316() {
		return Static7.anInterface1_1.method6305(this.anInt204);
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
	@Override
	public void method6317(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static7.anInterface1_1.method6308(this.anInt204, arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6318(@OriginalArg(0) Component arg0) throws Exception {
		Static7.anInterface1_1.method6310(Static591.anInt9580, Static517.aBoolean697, arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "()V")
	@Override
	protected void method6313() {
		Static7.anInterface1_1.method6306(this.anInt204, super.anIntArray525);
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "()V")
	@Override
	protected void method6314() {
		Static7.anInterface1_1.method6307(this.anInt204);
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "()V")
	@Override
	protected void method6315() {
		Static7.anInterface1_1.method6309(this.anInt204);
	}
}
