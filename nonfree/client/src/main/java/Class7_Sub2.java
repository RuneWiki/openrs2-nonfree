import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
	private final int anInt6633;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!nh;I)V")
	public Class7_Sub2(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1) {
		Static346.anInterface1_2 = arg0.method3901();
		this.anInt6633 = arg1;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "()V")
	@Override
	protected void method5547() {
		Static346.anInterface1_2.method1895(this.anInt6633, super.anIntArray527);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	@Override
	public void method5544(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static346.anInterface1_2.method1892(arg0, this.anInt6633);
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "()V")
	@Override
	protected void method5550() {
		Static346.anInterface1_2.method1896(this.anInt6633);
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "()V")
	@Override
	protected void method5557() {
		Static346.anInterface1_2.method1897(this.anInt6633);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "()I")
	@Override
	protected int method5546() {
		return Static346.anInterface1_2.method1893(this.anInt6633);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5554(@OriginalArg(0) Component arg0) throws Exception {
		Static346.anInterface1_2.method1894(arg0, Static330.aBoolean615, Static38.anInt1250);
	}
}
