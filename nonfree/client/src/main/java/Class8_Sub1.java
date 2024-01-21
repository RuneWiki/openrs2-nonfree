import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
	private final int anInt441;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!t;I)V")
	public Class8_Sub1(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1) {
		Static13.anInterface2_1 = arg0.method3149();
		this.anInt441 = arg1;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "()V")
	@Override
	protected void method2792() {
		Static13.anInterface2_1.method3384(this.anInt441, super.anIntArray410);
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "()V")
	@Override
	protected void method2802() {
		Static13.anInterface2_1.method3383(this.anInt441);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "()I")
	@Override
	protected int method2789() {
		return Static13.anInterface2_1.method3382(this.anInt441);
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "()V")
	@Override
	protected void method2798() {
		Static13.anInterface2_1.method3385(this.anInt441);
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	@Override
	public void method2800(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static13.anInterface2_1.method3386(arg0, this.anInt441);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2799(@OriginalArg(0) Component arg0) throws Exception {
		Static13.anInterface2_1.method3387(Static16.aBoolean15, arg0, Static98.anInt2858);
	}
}
