import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public final class Class190_Sub2 extends Class190 {

	@OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
	private final int anInt8727;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!ge;I)V")
	public Class190_Sub2(@OriginalArg(0) Class112 arg0, @OriginalArg(1) int arg1) {
		Static505.anInterface9_1 = (Interface9) arg0.method3231();
		this.anInt8727 = arg1;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "()I")
	@Override
	protected int method7500() {
		return Static505.anInterface9_1.method3474(this.anInt8727);
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	@Override
	public void method7492(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static505.anInterface9_1.method3475(arg0, this.anInt8727);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
	@Override
	protected void method7489() {
		Static505.anInterface9_1.method3470(this.anInt8727);
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "()V")
	@Override
	protected void method7495() {
		Static505.anInterface9_1.method3472(this.anInt8727);
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "()V")
	@Override
	protected void method7503() {
		Static505.anInterface9_1.method3471(this.anInt8727, super.anIntArray540);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7497(@OriginalArg(0) Component arg0) throws Exception {
		Static505.anInterface9_1.method3473(Static339.aBoolean677, arg0, Static78.anInt1661);
	}
}
