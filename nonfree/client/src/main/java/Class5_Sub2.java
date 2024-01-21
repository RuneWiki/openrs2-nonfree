import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
	private final int anInt2231;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!ke;I)V")
	public Class5_Sub2(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1) {
		Static106.anInterface2_2 = arg0.method1480();
		this.anInt2231 = arg1;
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "()V")
	@Override
	protected void method1799() {
		Static106.anInterface2_2.method934(this.anInt2231);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "()I")
	@Override
	protected int method1787() {
		return Static106.anInterface2_2.method938(this.anInt2231);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1800(@OriginalArg(0) Component arg0) throws Exception {
		Static106.anInterface2_2.method935(arg0, Static149.aBoolean131, Static22.anInt472);
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "()V")
	@Override
	protected void method1797() {
		Static106.anInterface2_2.method937(this.anInt2231, super.anIntArray210);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "()V")
	@Override
	protected void method1792() {
		Static106.anInterface2_2.method933(this.anInt2231);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	@Override
	public void method1788(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static106.anInterface2_2.method936(this.anInt2231, arg0);
	}
}
