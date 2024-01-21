import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
	private final int anInt2685;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!gg;I)V")
	public Class2_Sub2(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1) {
		Static91.anInterface1_2 = arg0.method1479();
		this.anInt2685 = arg1;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
	@Override
	protected void method1978() {
		Static91.anInterface1_2.method3113(this.anInt2685);
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	@Override
	public void method1983(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static91.anInterface1_2.method3111(this.anInt2685, arg0);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1985(@OriginalArg(0) Component arg0) throws Exception {
		Static91.anInterface1_2.method3114(arg0, Static166.anInt4307, Static9.aBoolean13);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
	@Override
	protected void method1973() {
		Static91.anInterface1_2.method3115(this.anInt2685);
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "()I")
	@Override
	protected int method1982() {
		return Static91.anInterface1_2.method3110(this.anInt2685);
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "()V")
	@Override
	protected void method1987() {
		Static91.anInterface1_2.method3112(this.anInt2685, super.anIntArray253);
	}
}
