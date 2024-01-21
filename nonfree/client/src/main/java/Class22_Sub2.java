import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
	private final int anInt1593;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!de;I)V")
	public Class22_Sub2(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		Static74.anInterface1_2 = arg0.method465();
		this.anInt1593 = arg1;
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "()V")
	@Override
	protected void method1090() {
		Static74.anInterface1_2.method256(this.anInt1593);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1096(@OriginalArg(0) Component arg0) throws Exception {
		Static74.anInterface1_2.method260(Static106.aBoolean99, Static119.anInt2551, arg0);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "()I")
	@Override
	protected int method1089() {
		return Static74.anInterface1_2.method255(this.anInt1593);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "()V")
	@Override
	protected void method1084() {
		Static74.anInterface1_2.method259(this.anInt1593, super.anIntArray210);
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "()V")
	@Override
	protected void method1094() {
		Static74.anInterface1_2.method258(this.anInt1593);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	@Override
	public void method1085(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static74.anInterface1_2.method257(this.anInt1593, arg0);
	}
}
