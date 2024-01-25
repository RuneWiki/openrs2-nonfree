import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class118_Sub1 extends Class118 {

	@OriginalMember(owner = "client!mv", name = "M", descriptor = "I")
	private final int anInt4452;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!ci;I)V")
	public Class118_Sub1(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1) {
		Static259.anInterface8_2 = arg0.method654();
		this.anInt4452 = arg1;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "()V")
	@Override
	protected void method3926() {
		Static259.anInterface8_2.method4752(this.anInt4452);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3941(@OriginalArg(0) Component arg0) throws Exception {
		Static259.anInterface8_2.method4748(Static3.anInt61, Static183.aBoolean268, arg0);
	}

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "()V")
	@Override
	protected void method3936() {
		Static259.anInterface8_2.method4751(this.anInt4452);
	}

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "()I")
	@Override
	protected int method3930() {
		return Static259.anInterface8_2.method4750(this.anInt4452);
	}

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)V")
	@Override
	public void method3939(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static259.anInterface8_2.method4753(arg0, this.anInt4452);
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "()V")
	@Override
	protected void method3929() {
		Static259.anInterface8_2.method4749(this.anInt4452, super.anIntArray372);
	}
}
