import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!cq", name = "X", descriptor = "I")
	private final int anInt1355;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!ml;I)V")
	public Class35_Sub1(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1) {
		Static49.anInterface9_1 = arg0.method3750();
		this.anInt1355 = arg1;
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "()V")
	@Override
	protected void method2558() {
		Static49.anInterface9_1.method4828(this.anInt1355);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
	@Override
	public void method2552(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static49.anInterface9_1.method4830(this.anInt1355, arg0);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "()V")
	@Override
	protected void method2553() {
		Static49.anInterface9_1.method4827(this.anInt1355);
	}

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "()V")
	@Override
	protected void method2565() {
		Static49.anInterface9_1.method4825(this.anInt1355, super.anIntArray255);
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "()I")
	@Override
	protected int method2557() {
		return Static49.anInterface9_1.method4829(this.anInt1355);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2555(@OriginalArg(0) Component arg0) throws Exception {
		Static49.anInterface9_1.method4826(Static314.aBoolean451, Static251.anInt5134, arg0);
	}
}
