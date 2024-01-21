import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
	private final int anInt809;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!bb;I)V")
	public Class24_Sub1(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1) {
		Static31.anInterface1_2 = arg0.method280();
		this.anInt809 = arg1;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	@Override
	public void method1466(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static31.anInterface1_2.method454(this.anInt809, arg0);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "()V")
	@Override
	protected void method1463() {
		Static31.anInterface1_2.method459(this.anInt809, super.anIntArray344);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1460(@OriginalArg(0) Component arg0) throws Exception {
		Static31.anInterface1_2.method457(Static39.anInt1014, Static59.aBoolean73, arg0);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()I")
	@Override
	protected int method1458() {
		return Static31.anInterface1_2.method455(this.anInt809);
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "()V")
	@Override
	protected void method1467() {
		Static31.anInterface1_2.method458(this.anInt809);
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "()V")
	@Override
	protected void method1465() {
		Static31.anInterface1_2.method456(this.anInt809);
	}
}
