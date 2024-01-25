import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
	private final int anInt952;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!mr;I)V")
	public Class35_Sub1(@OriginalArg(0) Class226 arg0, @OriginalArg(1) int arg1) {
		Static44.anInterface9_1 = (Interface9) arg0.method4857();
		this.anInt952 = arg1;
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "()V")
	@Override
	protected void method2747() {
		Static44.anInterface9_1.method5173(this.anInt952);
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
	@Override
	public void method2748(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static44.anInterface9_1.method5170(this.anInt952, arg0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "()V")
	@Override
	protected void method2733() {
		Static44.anInterface9_1.method5169(this.anInt952, super.anIntArray215);
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "()I")
	@Override
	protected int method2744() {
		return Static44.anInterface9_1.method5168(this.anInt952);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2741(@OriginalArg(0) Component arg0) throws Exception {
		Static44.anInterface9_1.method5172(arg0, Static452.aBoolean540, Static283.anInt7446);
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "()V")
	@Override
	protected void method2743() {
		Static44.anInterface9_1.method5171(this.anInt952);
	}
}
