import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class85_Sub1 extends Class85 {

	@OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
	private final int anInt2406;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!is;I)V")
	public Class85_Sub1(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1) {
		Static112.anInterface11_1 = arg0.method2817();
		this.anInt2406 = arg1;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "()V")
	@Override
	protected void method4214() {
		Static112.anInterface11_1.method5010(this.anInt2406);
	}

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "()I")
	@Override
	protected int method4220() {
		return Static112.anInterface11_1.method5011(this.anInt2406);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4221(@OriginalArg(0) Component arg0) throws Exception {
		Static112.anInterface11_1.method5014(Static44.aBoolean66, Static42.anInt4820, arg0);
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "()V")
	@Override
	protected void method4217() {
		Static112.anInterface11_1.method5013(this.anInt2406);
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "()V")
	@Override
	protected void method4218() {
		Static112.anInterface11_1.method5012(this.anInt2406, super.anIntArray923);
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
	@Override
	public void method4225(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static112.anInterface11_1.method5015(this.anInt2406, arg0);
	}
}
