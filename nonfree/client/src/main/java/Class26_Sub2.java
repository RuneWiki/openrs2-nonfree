import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public final class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
	private final int anInt2785;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!w;I)V")
	public Class26_Sub2(@OriginalArg(0) Class79 arg0, @OriginalArg(1) int arg1) {
		Static109.anInterface3_1 = arg0.method2090();
		this.anInt2785 = arg1;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	@Override
	public void method1928(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static109.anInterface3_1.method2084(this.anInt2785, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "()V")
	@Override
	protected void method1923() {
		Static109.anInterface3_1.method2085(this.anInt2785, super.anIntArray421);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1937(@OriginalArg(0) Component arg0) throws Exception {
		Static109.anInterface3_1.method2083(Static18.aBoolean56, arg0, Static44.anInt1243);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()I")
	@Override
	protected int method1922() {
		return Static109.anInterface3_1.method2082(this.anInt2785);
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "()V")
	@Override
	protected void method1931() {
		Static109.anInterface3_1.method2081(this.anInt2785);
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "()V")
	@Override
	protected void method1933() {
		Static109.anInterface3_1.method2086(this.anInt2785);
	}
}
