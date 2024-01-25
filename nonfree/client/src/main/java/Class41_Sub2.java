import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class41_Sub2 extends Class41 {

	@OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
	private final int anInt9445;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!ec;I)V")
	public Class41_Sub2(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1) {
		Static581.anInterface9_1 = (Interface9) arg0.method1888();
		this.anInt9445 = arg1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	@Override
	public void method7693(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static581.anInterface9_1.method1582(arg0, this.anInt9445);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "()I")
	@Override
	protected int method7694() {
		return Static581.anInterface9_1.method1583(this.anInt9445);
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "()V")
	@Override
	protected void method7697() {
		Static581.anInterface9_1.method1579(this.anInt9445, super.anIntArray510);
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "()V")
	@Override
	protected void method7710() {
		Static581.anInterface9_1.method1581(this.anInt9445);
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "()V")
	@Override
	protected void method7705() {
		Static581.anInterface9_1.method1584(this.anInt9445);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7699(@OriginalArg(0) Component arg0) throws Exception {
		Static581.anInterface9_1.method1580(Static16.anInt10139, Static608.aBoolean713, arg0);
	}
}
