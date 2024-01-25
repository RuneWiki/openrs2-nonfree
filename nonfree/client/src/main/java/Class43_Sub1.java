import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
	private final int anInt1180;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!tq;I)V")
	public Class43_Sub1(@OriginalArg(0) Class285 arg0, @OriginalArg(1) int arg1) {
		Static52.anInterface6_1 = (Interface6) arg0.method7048();
		this.anInt1180 = arg1;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()I")
	@Override
	protected int method7018() {
		return Static52.anInterface6_1.method3991(this.anInt1180);
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "()V")
	@Override
	protected void method7023() {
		Static52.anInterface6_1.method3987(this.anInt1180, super.anIntArray727);
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
	@Override
	public void method7024(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static52.anInterface6_1.method3988(arg0, this.anInt1180);
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "()V")
	@Override
	protected void method7026() {
		Static52.anInterface6_1.method3986(this.anInt1180);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7021(@OriginalArg(0) Component arg0) throws Exception {
		Static52.anInterface6_1.method3989(Static361.anInt6755, arg0, Static8.aBoolean56);
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "()V")
	@Override
	protected void method7020() {
		Static52.anInterface6_1.method3990(this.anInt1180);
	}
}
