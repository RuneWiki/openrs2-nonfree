import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
	private final int anInt431;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!dc;I)V")
	public Class15_Sub1(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1) {
		Static17.anInterface1_1 = arg0.method385();
		this.anInt431 = arg1;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "()I")
	@Override
	protected int method1199() {
		return Static17.anInterface1_1.method360(this.anInt431);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "()V")
	@Override
	protected void method1196() {
		Static17.anInterface1_1.method364(this.anInt431, super.anIntArray197);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1194(@OriginalArg(0) Component arg0) throws Exception {
		Static17.anInterface1_1.method362(Static116.anInt2873, arg0, Static48.aBoolean123);
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "()V")
	@Override
	protected void method1202() {
		Static17.anInterface1_1.method363(this.anInt431);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	@Override
	public void method1195(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static17.anInterface1_1.method361(this.anInt431, arg0);
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "()V")
	@Override
	protected void method1201() {
		Static17.anInterface1_1.method365(this.anInt431);
	}
}
