import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public final class Class62_Sub2 extends Class62 {

	@OriginalMember(owner = "client!hu", name = "N", descriptor = "I")
	private final int anInt2962;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!pb;I)V")
	public Class62_Sub2(@OriginalArg(0) Class194 arg0, @OriginalArg(1) int arg1) {
		Static165.anInterface8_1 = arg0.method4403();
		this.anInt2962 = arg1;
	}

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)V")
	@Override
	public void method2413(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static165.anInterface8_1.method3897(this.anInt2962, arg0);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2419(@OriginalArg(0) Component arg0) throws Exception {
		Static165.anInterface8_1.method3898(Static150.anInt7358, arg0, Static240.aBoolean266);
	}

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "()I")
	@Override
	protected int method2415() {
		return Static165.anInterface8_1.method3900(this.anInt2962);
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "()V")
	@Override
	protected void method2408() {
		Static165.anInterface8_1.method3899(this.anInt2962);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "()V")
	@Override
	protected void method2406() {
		Static165.anInterface8_1.method3901(this.anInt2962);
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "()V")
	@Override
	protected void method2414() {
		Static165.anInterface8_1.method3902(this.anInt2962, super.anIntArray254);
	}
}
