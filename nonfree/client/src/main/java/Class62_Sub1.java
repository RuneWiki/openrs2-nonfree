import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
	private int anInt2273;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!ej;I)V")
	public Class62_Sub1(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1) {
		Static103.anInterface2_2 = arg0.method1056();
		this.anInt2273 = arg1;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "()I")
	@Override
	protected int method2418() {
		return Static103.anInterface2_2.method3472(this.anInt2273);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	@Override
	public void method2408(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static103.anInterface2_2.method3473(arg0, this.anInt2273);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
	@Override
	protected void method2409() {
		Static103.anInterface2_2.method3474(this.anInt2273);
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "()V")
	@Override
	protected void method2421() {
		Static103.anInterface2_2.method3471(this.anInt2273);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2405(@OriginalArg(0) Component arg0) throws Exception {
		Static103.anInterface2_2.method3469(Static97.aBoolean189, arg0, Static14.anInt334);
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "()V")
	@Override
	protected void method2410() {
		Static103.anInterface2_2.method3470(this.anInt2273, super.anIntArray274);
	}
}
