import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public final class Class76_Sub1 extends Class76 {

	@OriginalMember(owner = "client!eea", name = "F", descriptor = "I")
	private final int anInt1900;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lclient!laa;I)V")
	public Class76_Sub1(@OriginalArg(0) Class198 arg0, @OriginalArg(1) int arg1) {
		Static113.anInterface22_1 = (Interface22) arg0.method4297();
		this.anInt1900 = arg1;
	}

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "()V")
	@Override
	protected void method2512() {
		Static113.anInterface22_1.method4723(this.anInt1900);
	}

	@OriginalMember(owner = "client!eea", name = "d", descriptor = "()I")
	@Override
	protected int method2518() {
		return Static113.anInterface22_1.method4724(this.anInt1900);
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "()V")
	@Override
	protected void method2510() {
		Static113.anInterface22_1.method4721(this.anInt1900);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2515(@OriginalArg(0) Component arg0) throws Exception {
		Static113.anInterface22_1.method4722(arg0, Static269.aBoolean372, Static304.anInt5650);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "()V")
	@Override
	protected void method2508() {
		Static113.anInterface22_1.method4725(this.anInt1900, super.anIntArray129);
	}

	@OriginalMember(owner = "client!eea", name = "d", descriptor = "(I)V")
	@Override
	public void method2520(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static113.anInterface22_1.method4720(this.anInt1900, arg0);
	}
}
