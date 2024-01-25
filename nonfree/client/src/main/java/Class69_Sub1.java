import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public final class Class69_Sub1 extends Class69 {

	@OriginalMember(owner = "client!df", name = "K", descriptor = "I")
	private final int anInt2132;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!dj;I)V")
	public Class69_Sub1(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1) {
		Static89.anInterface13_1 = arg0.method1978();
		this.anInt2132 = arg1;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "()V")
	@Override
	protected void method6844() {
		Static89.anInterface13_1.method6056(this.anInt2132, super.anIntArray615);
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "()I")
	@Override
	protected int method6847() {
		return Static89.anInterface13_1.method6057(this.anInt2132);
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
	@Override
	public void method6846(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static89.anInterface13_1.method6055(this.anInt2132, arg0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
	@Override
	protected void method6837() {
		Static89.anInterface13_1.method6052(this.anInt2132);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6849(@OriginalArg(0) Component arg0) throws Exception {
		Static89.anInterface13_1.method6053(Static140.aBoolean250, arg0, Static426.anInt6103);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "()V")
	@Override
	protected void method6843() {
		Static89.anInterface13_1.method6054(this.anInt2132);
	}
}
