import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class111_Sub2 extends Class111 {

	@OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
	private int anInt5522;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!bk;I)V")
	public Class111_Sub2(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1) {
		Static280.anInterface2_2 = arg0.method443();
		this.anInt5522 = arg1;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4152(@OriginalArg(0) Component arg0) throws Exception {
		Static280.anInterface2_2.method1449(Static264.anInt5577, arg0, Static81.aBoolean130);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	@Override
	public void method4139(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static280.anInterface2_2.method1453(this.anInt5522, arg0);
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "()V")
	@Override
	protected void method4154() {
		Static280.anInterface2_2.method1454(this.anInt5522);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "()V")
	@Override
	protected void method4148() {
		Static280.anInterface2_2.method1450(this.anInt5522);
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "()I")
	@Override
	protected int method4155() {
		return Static280.anInterface2_2.method1451(this.anInt5522);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "()V")
	@Override
	protected void method4143() {
		Static280.anInterface2_2.method1452(this.anInt5522, this.anIntArray473);
	}
}
