import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!w", name = "O", descriptor = "I")
	private final int anInt2970;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!q;I)V")
	public Class34_Sub2(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1) {
		Static128.anInterface3_2 = arg0.method1641();
		this.anInt2970 = arg1;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
	@Override
	protected void method2118() {
		Static128.anInterface3_2.method182(this.anInt2970, super.anIntArray351);
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()I")
	@Override
	protected int method2119() {
		return Static128.anInterface3_2.method181(this.anInt2970);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2120(@OriginalArg(0) Component arg0) throws Exception {
		Static128.anInterface3_2.method179(Static34.aBoolean59, arg0, Static68.anInt1863);
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()V")
	@Override
	protected void method2121() {
		Static128.anInterface3_2.method180(this.anInt2970);
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
	@Override
	public void method2124(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static128.anInterface3_2.method178(this.anInt2970, arg0);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()V")
	@Override
	protected void method2116() {
		Static128.anInterface3_2.method177(this.anInt2970);
	}
}
