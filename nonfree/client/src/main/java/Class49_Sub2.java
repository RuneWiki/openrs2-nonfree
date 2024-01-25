import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public final class Class49_Sub2 extends Class49 {

	@OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
	private final int anInt2449;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!et;I)V")
	public Class49_Sub2(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1) {
		Static114.anInterface10_2 = arg0.method1734();
		this.anInt2449 = arg1;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "()V")
	@Override
	protected void method2071() {
		Static114.anInterface10_2.method4438(this.anInt2449);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2066(@OriginalArg(0) Component arg0) throws Exception {
		Static114.anInterface10_2.method4436(arg0, Static422.aBoolean649, Static261.anInt4928);
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "()V")
	@Override
	protected void method2072() {
		Static114.anInterface10_2.method4437(this.anInt2449);
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "()V")
	@Override
	protected void method2073() {
		Static114.anInterface10_2.method4441(this.anInt2449, super.anIntArray162);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "()I")
	@Override
	protected int method2067() {
		return Static114.anInterface10_2.method4439(this.anInt2449);
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V")
	@Override
	public void method2065(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static114.anInterface10_2.method4440(arg0, this.anInt2449);
	}
}
