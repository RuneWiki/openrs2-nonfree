import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public final class Class82_Sub2 extends Class82 {

	@OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
	private final int anInt3721;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lclient!pc;I)V")
	public Class82_Sub2(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		Static173.anInterface3_2 = arg0.method1957();
		this.anInt3721 = arg1;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2631(@OriginalArg(0) Component arg0) throws Exception {
		Static173.anInterface3_2.method2528(arg0, Static45.anInt1131, Static128.aBoolean130);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "()I")
	@Override
	protected int method2629() {
		return Static173.anInterface3_2.method2529(this.anInt3721);
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "()V")
	@Override
	protected void method2643() {
		Static173.anInterface3_2.method2530(this.anInt3721);
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "()V")
	@Override
	protected void method2632() {
		Static173.anInterface3_2.method2531(this.anInt3721);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "()V")
	@Override
	protected void method2630() {
		Static173.anInterface3_2.method2533(this.anInt3721, super.anIntArray403);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	@Override
	public void method2640(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static173.anInterface3_2.method2532(this.anInt3721, arg0);
	}
}
