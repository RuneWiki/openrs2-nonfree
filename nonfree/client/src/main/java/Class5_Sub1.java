import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!af", name = "X", descriptor = "I")
	private final int anInt225;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!ih;I)V")
	public Class5_Sub1(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1) {
		Static7.anInterface3_1 = arg0.method1233();
		this.anInt225 = arg1;
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
	@Override
	public void method2602(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static7.anInterface3_1.method2281(this.anInt225, arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "()I")
	@Override
	protected int method2585() {
		return Static7.anInterface3_1.method2283(this.anInt225);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2600(@OriginalArg(0) Component arg0) throws Exception {
		Static7.anInterface3_1.method2278(Static143.anInt3288, arg0, Static126.aBoolean195);
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "()V")
	@Override
	protected void method2599() {
		Static7.anInterface3_1.method2282(this.anInt225, super.anIntArray381);
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "()V")
	@Override
	protected void method2593() {
		Static7.anInterface3_1.method2279(this.anInt225);
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "()V")
	@Override
	protected void method2590() {
		Static7.anInterface3_1.method2280(this.anInt225);
	}
}
