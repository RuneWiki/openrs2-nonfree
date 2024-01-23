import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
	private int anInt1923;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!qg;I)V")
	public Class31_Sub1(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1) {
		Static73.anInterface2_1 = arg0.method2617();
		this.anInt1923 = arg1;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1511(@OriginalArg(0) Component arg0) throws Exception {
		Static73.anInterface2_1.method2585(Static6.aBoolean13, arg0, Static10.anInt374);
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "()V")
	@Override
	protected void method1507() {
		Static73.anInterface2_1.method2583(this.anInt1923);
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
	@Override
	public void method1508(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static73.anInterface2_1.method2581(this.anInt1923, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "()V")
	@Override
	protected void method1512() {
		Static73.anInterface2_1.method2586(this.anInt1923);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "()V")
	@Override
	protected void method1499() {
		Static73.anInterface2_1.method2582(this.anInt1923, super.anIntArray207);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "()I")
	@Override
	protected int method1497() {
		return Static73.anInterface2_1.method2584(this.anInt1923);
	}
}
