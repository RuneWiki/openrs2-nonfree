import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
	private final int anInt1786;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!od;I)V")
	public Class25_Sub1(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1) {
		Static55.anInterface2_1 = arg0.method2268();
		this.anInt1786 = arg1;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	@Override
	public void method1564(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static55.anInterface2_1.method376(this.anInt1786, arg0);
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "()V")
	@Override
	protected void method1558() {
		Static55.anInterface2_1.method374(this.anInt1786);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "()V")
	@Override
	protected void method1557() {
		Static55.anInterface2_1.method373(this.anInt1786, super.anIntArray197);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1555(@OriginalArg(0) Component arg0) throws Exception {
		Static55.anInterface2_1.method375(arg0, Static71.aBoolean84, Static74.anInt2248);
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "()I")
	@Override
	protected int method1559() {
		return Static55.anInterface2_1.method377(this.anInt1786);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "()V")
	@Override
	protected void method1554() {
		Static55.anInterface2_1.method372(this.anInt1786);
	}
}
