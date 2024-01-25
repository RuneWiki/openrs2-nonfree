import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public final class Class101_Sub1 extends Class101 {

	@OriginalMember(owner = "client!gw", name = "H", descriptor = "I")
	private final int anInt2288;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!nt;I)V")
	public Class101_Sub1(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1) {
		Static146.anInterface6_1 = arg0.method3845();
		this.anInt2288 = arg1;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "()I")
	@Override
	protected int method4845() {
		return Static146.anInterface6_1.method3599(this.anInt2288);
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "()V")
	@Override
	protected void method4850() {
		Static146.anInterface6_1.method3598(this.anInt2288);
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V")
	@Override
	public void method4854(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static146.anInterface6_1.method3595(arg0, this.anInt2288);
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "()V")
	@Override
	protected void method4853() {
		Static146.anInterface6_1.method3597(this.anInt2288, super.anIntArray454);
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "()V")
	@Override
	protected void method4858() {
		Static146.anInterface6_1.method3594(this.anInt2288);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4848(@OriginalArg(0) Component arg0) throws Exception {
		Static146.anInterface6_1.method3596(Static167.aBoolean276, arg0, Static234.anInt4244);
	}
}
