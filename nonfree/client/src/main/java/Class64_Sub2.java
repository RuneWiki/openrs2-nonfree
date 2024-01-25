import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public final class Class64_Sub2 extends Class64 {

	@OriginalMember(owner = "client!dka", name = "G", descriptor = "I")
	private final int anInt1972;

	@OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(Lclient!vt;I)V")
	public Class64_Sub2(@OriginalArg(0) Class380 arg0, @OriginalArg(1) int arg1) {
		Static107.anInterface10_1 = (Interface10) arg0.method8808();
		this.anInt1972 = arg1;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1733(@OriginalArg(0) Component arg0) throws Exception {
		Static107.anInterface10_1.method5526(Static555.aBoolean676, arg0, Static328.anInt8868);
	}

	@OriginalMember(owner = "client!dka", name = "d", descriptor = "(I)V")
	@Override
	public void method1740(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static107.anInterface10_1.method5530(this.anInt1972, arg0);
	}

	@OriginalMember(owner = "client!dka", name = "b", descriptor = "()I")
	@Override
	protected int method1736() {
		return Static107.anInterface10_1.method5527(this.anInt1972);
	}

	@OriginalMember(owner = "client!dka", name = "c", descriptor = "()V")
	@Override
	protected void method1737() {
		Static107.anInterface10_1.method5529(this.anInt1972, super.anIntArray115);
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "()V")
	@Override
	protected void method1727() {
		Static107.anInterface10_1.method5528(this.anInt1972);
	}

	@OriginalMember(owner = "client!dka", name = "d", descriptor = "()V")
	@Override
	protected void method1738() {
		Static107.anInterface10_1.method5531(this.anInt1972);
	}
}
