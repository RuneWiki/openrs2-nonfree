import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class122_Sub2 extends Class122 {

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
	private final int anInt8199;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!nga;I)V")
	public Class122_Sub2(@OriginalArg(0) Class228 arg0, @OriginalArg(1) int arg1) {
		Static450.anInterface8_1 = (Interface8) arg0.method5939();
		this.anInt8199 = arg1;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "()V")
	@Override
	protected void method6813() {
		Static450.anInterface8_1.method7104(this.anInt8199);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
	@Override
	protected void method6801() {
		Static450.anInterface8_1.method7102(this.anInt8199, super.anIntArray513);
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "()I")
	@Override
	protected int method6809() {
		return Static450.anInterface8_1.method7105(this.anInt8199);
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "()V")
	@Override
	protected void method6815() {
		Static450.anInterface8_1.method7100(this.anInt8199);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6812(@OriginalArg(0) Component arg0) throws Exception {
		Static450.anInterface8_1.method7101(Static457.aBoolean715, Static590.anInt9843, arg0);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	@Override
	public void method6802(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static450.anInterface8_1.method7103(this.anInt8199, arg0);
	}
}
