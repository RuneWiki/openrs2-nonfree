import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
	private final int anInt505;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!ve;I)V")
	public Class11_Sub1(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1) {
		Static13.anInterface1_1 = arg0.method1943();
		this.anInt505 = arg1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "()I")
	@Override
	protected int method1839() {
		return Static13.anInterface1_1.method695(this.anInt505);
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	@Override
	public void method1843(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static13.anInterface1_1.method697(this.anInt505, arg0);
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "()V")
	@Override
	protected void method1849() {
		Static13.anInterface1_1.method693(this.anInt505);
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "()V")
	@Override
	protected void method1844() {
		Static13.anInterface1_1.method694(this.anInt505, super.anIntArray333);
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "()V")
	@Override
	protected void method1841() {
		Static13.anInterface1_1.method698(this.anInt505);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1838(@OriginalArg(0) Component arg0) throws Exception {
		Static13.anInterface1_1.method696(Static6.aBoolean2, arg0, Static115.anInt2690);
	}
}
