import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!q", name = "E", descriptor = "I")
	private final int anInt2669;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!u;I)V")
	public Class34_Sub2(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1) {
		Static92.anInterface3_1 = arg0.method2129();
		this.anInt2669 = arg1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "()I")
	@Override
	protected int method1714() {
		return Static92.anInterface3_1.method2309(this.anInt2669);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1713(@OriginalArg(0) Component arg0) throws Exception {
		Static92.anInterface3_1.method2307(Static68.aBoolean70, arg0, Static68.anInt2134);
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "()V")
	@Override
	protected void method1715() {
		Static92.anInterface3_1.method2308(this.anInt2669);
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
	@Override
	public void method1719(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static92.anInterface3_1.method2310(arg0, this.anInt2669);
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "()V")
	@Override
	protected void method1723() {
		Static92.anInterface3_1.method2311(this.anInt2669, super.anIntArray284);
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "()V")
	@Override
	protected void method1721() {
		Static92.anInterface3_1.method2312(this.anInt2669);
	}
}
