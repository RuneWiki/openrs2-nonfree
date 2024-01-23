import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class48_Sub1 extends Class48 {

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
	private int anInt1647;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!pc;I)V")
	public Class48_Sub1(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1) {
		Static81.anInterface2_1 = arg0.method2687();
		this.anInt1647 = arg1;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
	@Override
	protected void method3217() {
		Static81.anInterface2_1.method1454(this.anInt1647);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "()V")
	@Override
	protected void method3232() {
		Static81.anInterface2_1.method1453(this.anInt1647);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3229(@OriginalArg(0) Component arg0) throws Exception {
		Static81.anInterface2_1.method1452(arg0, Static130.aBoolean114, Static50.anInt1044);
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "()I")
	@Override
	protected int method3235() {
		return Static81.anInterface2_1.method1451(this.anInt1647);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	@Override
	public void method3218(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static81.anInterface2_1.method1449(this.anInt1647, arg0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
	@Override
	protected void method3215() {
		Static81.anInterface2_1.method1450(this.anInt1647, super.anIntArray464);
	}
}
