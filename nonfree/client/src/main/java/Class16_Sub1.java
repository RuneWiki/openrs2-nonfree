import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!av", name = "Q", descriptor = "I")
	private final int anInt762;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!li;I)V")
	public Class16_Sub1(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1) {
		Static22.anInterface7_1 = arg0.method3402();
		this.anInt762 = arg1;
	}

	@OriginalMember(owner = "client!av", name = "d", descriptor = "()V")
	@Override
	protected void method4124() {
		Static22.anInterface7_1.method4102(this.anInt762);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4115(@OriginalArg(0) Component arg0) throws Exception {
		Static22.anInterface7_1.method4100(Static324.aBoolean657, Static232.anInt4442, arg0);
	}

	@OriginalMember(owner = "client!av", name = "e", descriptor = "(I)V")
	@Override
	public void method4118(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static22.anInterface7_1.method4099(arg0, this.anInt762);
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "()I")
	@Override
	protected int method4121() {
		return Static22.anInterface7_1.method4101(this.anInt762);
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "()V")
	@Override
	protected void method4120() {
		Static22.anInterface7_1.method4097(this.anInt762, super.anIntArray355);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "()V")
	@Override
	protected void method4116() {
		Static22.anInterface7_1.method4098(this.anInt762);
	}
}
