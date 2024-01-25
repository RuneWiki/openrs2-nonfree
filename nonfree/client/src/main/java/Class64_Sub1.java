import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public final class Class64_Sub1 extends Class64 {

	@OriginalMember(owner = "client!dga", name = "J", descriptor = "I")
	private final int anInt1986;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!lc;I)V")
	public Class64_Sub1(@OriginalArg(0) Class207 arg0, @OriginalArg(1) int arg1) {
		Static94.anInterface12_1 = (Interface12) arg0.method4582();
		this.anInt1986 = arg1;
	}

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "(I)V")
	@Override
	public void method2215(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static94.anInterface12_1.method6928(this.anInt1986, arg0);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2221(@OriginalArg(0) Component arg0) throws Exception {
		Static94.anInterface12_1.method6925(Static157.aBoolean213, arg0, Static434.anInt6851);
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "()I")
	@Override
	protected int method2210() {
		return Static94.anInterface12_1.method6930(this.anInt1986);
	}

	@OriginalMember(owner = "client!dga", name = "e", descriptor = "()V")
	@Override
	protected void method2218() {
		Static94.anInterface12_1.method6926(this.anInt1986);
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "()V")
	@Override
	protected void method2211() {
		Static94.anInterface12_1.method6927(this.anInt1986);
	}

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "()V")
	@Override
	protected void method2217() {
		Static94.anInterface12_1.method6929(this.anInt1986, super.anIntArray157);
	}
}
