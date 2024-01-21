import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!a", name = "S", descriptor = "I")
	private final int anInt55;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!ba;I)V")
	public Class1_Sub1(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		Static1.anInterface1_1 = arg0.method120();
		this.anInt55 = arg1;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	@Override
	public void method1395(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static1.anInterface1_1.method41(this.anInt55, arg0);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1389(@OriginalArg(0) Component arg0) throws Exception {
		Static1.anInterface1_1.method42(Static49.aBoolean48, arg0, Static38.anInt1141);
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "()I")
	@Override
	protected int method1392() {
		return Static1.anInterface1_1.method43(this.anInt55);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
	@Override
	protected void method1386() {
		Static1.anInterface1_1.method45(this.anInt55);
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "()V")
	@Override
	protected void method1390() {
		Static1.anInterface1_1.method46(this.anInt55, super.anIntArray263);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
	@Override
	protected void method1387() {
		Static1.anInterface1_1.method44(this.anInt55);
	}
}
