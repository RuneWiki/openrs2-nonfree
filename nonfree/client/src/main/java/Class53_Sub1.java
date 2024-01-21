import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class53_Sub1 extends Class53 {

	@OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
	private final int anInt2936;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!e;I)V")
	public Class53_Sub1(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1) {
		Static107.anInterface2_2 = arg0.method980();
		this.anInt2936 = arg1;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	@Override
	public void method3047(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static107.anInterface2_2.method1378(arg0, this.anInt2936);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "()V")
	@Override
	protected void method3043() {
		Static107.anInterface2_2.method1377(this.anInt2936, super.anIntArray456);
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "()I")
	@Override
	protected int method3054() {
		return Static107.anInterface2_2.method1379(this.anInt2936);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "()V")
	@Override
	protected void method3041() {
		Static107.anInterface2_2.method1381(this.anInt2936);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3046(@OriginalArg(0) Component arg0) throws Exception {
		Static107.anInterface2_2.method1376(arg0, Static97.aBoolean323, Static135.anInt3382);
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "()V")
	@Override
	protected void method3045() {
		Static107.anInterface2_2.method1380(this.anInt2936);
	}
}
