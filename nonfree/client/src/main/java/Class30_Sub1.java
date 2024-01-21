import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
	private final int anInt1432;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!qf;I)V")
	public Class30_Sub1(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1) {
		Static49.anInterface1_1 = arg0.method2527();
		this.anInt1432 = arg1;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "()V")
	@Override
	protected void method2679() {
		Static49.anInterface1_1.method941(this.anInt1432);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	@Override
	public void method2672(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static49.anInterface1_1.method946(arg0, this.anInt1432);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2682(@OriginalArg(0) Component arg0) throws Exception {
		Static49.anInterface1_1.method945(arg0, Static31.aBoolean51, Static96.anInt4194);
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "()I")
	@Override
	protected int method2686() {
		return Static49.anInterface1_1.method942(this.anInt1432);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "()V")
	@Override
	protected void method2678() {
		Static49.anInterface1_1.method944(this.anInt1432);
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "()V")
	@Override
	protected void method2680() {
		Static49.anInterface1_1.method943(this.anInt1432, super.anIntArray596);
	}
}
