import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public final class Class232_Sub1 extends Class232 {

	@OriginalMember(owner = "client!ou", name = "F", descriptor = "I")
	private final int anInt7677;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!lu;I)V")
	public Class232_Sub1(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1) {
		Static441.anInterface12_1 = (Interface12) arg0.method5298();
		this.anInt7677 = arg1;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "()I")
	@Override
	protected int method8509() {
		return Static441.anInterface12_1.method5761(this.anInt7677);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "()V")
	@Override
	protected void method8508() {
		Static441.anInterface12_1.method5762(this.anInt7677);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method8513(@OriginalArg(0) Component arg0) throws Exception {
		Static441.anInterface12_1.method5759(Static293.aBoolean421, arg0, Static656.anInt1392);
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "()V")
	@Override
	protected void method8518() {
		Static441.anInterface12_1.method5760(this.anInt7677, super.anIntArray642);
	}

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "()V")
	@Override
	protected void method8522() {
		Static441.anInterface12_1.method5764(this.anInt7677);
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
	@Override
	public void method8521(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static441.anInterface12_1.method5763(this.anInt7677, arg0);
	}
}
