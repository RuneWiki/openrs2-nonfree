import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
	private final int anInt1327;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!ap;I)V")
	public Class26_Sub1(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		Static52.anInterface1_2 = arg0.method271();
		this.anInt1327 = arg1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "()V")
	@Override
	protected void method4216() {
		Static52.anInterface1_2.method3(this.anInt1327);
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
	@Override
	public void method4226(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static52.anInterface1_2.method4(this.anInt1327, arg0);
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "()V")
	@Override
	protected void method4229() {
		Static52.anInterface1_2.method2(this.anInt1327, super.anIntArray425);
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "()V")
	@Override
	protected void method4222() {
		Static52.anInterface1_2.method5(this.anInt1327);
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "()I")
	@Override
	protected int method4221() {
		return Static52.anInterface1_2.method6(this.anInt1327);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4230(@OriginalArg(0) Component arg0) throws Exception {
		Static52.anInterface1_2.method1(Static223.anInt5818, Static111.aBoolean172, arg0);
	}
}
