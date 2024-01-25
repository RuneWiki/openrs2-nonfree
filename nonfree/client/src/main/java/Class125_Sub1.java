import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public final class Class125_Sub1 extends Class125 {

	@OriginalMember(owner = "client!to", name = "K", descriptor = "I")
	private final int anInt6581;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!fq;I)V")
	public Class125_Sub1(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1) {
		Static393.anInterface1_2 = arg0.method1883();
		this.anInt6581 = arg1;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "()V")
	@Override
	protected void method5870() {
		Static393.anInterface1_2.method1416(this.anInt6581);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5868(@OriginalArg(0) Component arg0) throws Exception {
		Static393.anInterface1_2.method1413(Static228.anInt4846, arg0, Static166.aBoolean323);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	@Override
	public void method5858(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static393.anInterface1_2.method1417(this.anInt6581, arg0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "()V")
	@Override
	protected void method5855() {
		Static393.anInterface1_2.method1414(this.anInt6581);
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "()I")
	@Override
	protected int method5861() {
		return Static393.anInterface1_2.method1415(this.anInt6581);
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "()V")
	@Override
	protected void method5871() {
		Static393.anInterface1_2.method1412(this.anInt6581, super.anIntArray508);
	}
}
