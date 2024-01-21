import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!de", name = "I", descriptor = "I")
	private final int anInt946;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!ma;I)V")
	public Class19_Sub1(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1) {
		Static32.anInterface3_1 = arg0.method1747();
		this.anInt946 = arg1;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "()I")
	@Override
	protected int method889() {
		return Static32.anInterface3_1.method2841(this.anInt946);
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "()V")
	@Override
	protected void method890() {
		Static32.anInterface3_1.method2839(this.anInt946);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	@Override
	public void method885(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static32.anInterface3_1.method2842(arg0, this.anInt946);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "()V")
	@Override
	protected void method882() {
		Static32.anInterface3_1.method2843(this.anInt946);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method893(@OriginalArg(0) Component arg0) throws Exception {
		Static32.anInterface3_1.method2844(Static63.anInt1680, arg0, Static46.aBoolean62);
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "()V")
	@Override
	protected void method896() {
		Static32.anInterface3_1.method2840(this.anInt946, super.anIntArray207);
	}
}
