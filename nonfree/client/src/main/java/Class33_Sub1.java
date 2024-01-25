import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
	private final int anInt1229;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!hs;I)V")
	public Class33_Sub1(@OriginalArg(0) Class103 arg0, @OriginalArg(1) int arg1) {
		Static49.anInterface4_1 = arg0.method2833();
		this.anInt1229 = arg1;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "()I")
	@Override
	protected int method3056() {
		return Static49.anInterface4_1.method2488(this.anInt1229);
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "()V")
	@Override
	protected void method3058() {
		Static49.anInterface4_1.method2487(this.anInt1229);
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "()V")
	@Override
	protected void method3053() {
		Static49.anInterface4_1.method2489(this.anInt1229, super.anIntArray282);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "()V")
	@Override
	protected void method3047() {
		Static49.anInterface4_1.method2491(this.anInt1229);
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
	@Override
	public void method3060(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static49.anInterface4_1.method2492(arg0, this.anInt1229);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3051(@OriginalArg(0) Component arg0) throws Exception {
		Static49.anInterface4_1.method2490(Static94.anInt2028, Static29.aBoolean45, arg0);
	}
}
