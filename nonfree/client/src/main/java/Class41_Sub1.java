import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
	private final int anInt1937;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!rh;I)V")
	public Class41_Sub1(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1) {
		Static75.anInterface2_1 = arg0.method2569();
		this.anInt1937 = arg1;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "()V")
	@Override
	protected void method2045() {
		Static75.anInterface2_1.method2459(this.anInt1937);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2043(@OriginalArg(0) Component arg0) throws Exception {
		Static75.anInterface2_1.method2458(arg0, Static68.aBoolean82, Static154.anInt4087);
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "()I")
	@Override
	protected int method2050() {
		return Static75.anInterface2_1.method2461(this.anInt1937);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	@Override
	public void method2041(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static75.anInterface2_1.method2457(arg0, this.anInt1937);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "()V")
	@Override
	protected void method2044() {
		Static75.anInterface2_1.method2462(this.anInt1937, super.anIntArray252);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
	@Override
	protected void method2035() {
		Static75.anInterface2_1.method2460(this.anInt1937);
	}
}
