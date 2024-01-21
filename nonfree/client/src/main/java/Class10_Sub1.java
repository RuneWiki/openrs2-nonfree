import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
	private final int anInt1202;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!a;I)V")
	public Class10_Sub1(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1) {
		Static45.anInterface1_2 = arg0.method5();
		this.anInt1202 = arg1;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "()V")
	@Override
	protected void method1774() {
		Static45.anInterface1_2.method789(this.anInt1202);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1775(@OriginalArg(0) Component arg0) throws Exception {
		Static45.anInterface1_2.method794(Static105.aBoolean119, Static68.anInt1622, arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "()V")
	@Override
	protected void method1773() {
		Static45.anInterface1_2.method792(this.anInt1202, super.anIntArray234);
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "()V")
	@Override
	protected void method1779() {
		Static45.anInterface1_2.method791(this.anInt1202);
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
	@Override
	public void method1785(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static45.anInterface1_2.method790(this.anInt1202, arg0);
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "()I")
	@Override
	protected int method1784() {
		return Static45.anInterface1_2.method793(this.anInt1202);
	}
}
