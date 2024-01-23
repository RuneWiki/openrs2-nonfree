import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
	private int anInt2662;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!mc;I)V")
	public Class15_Sub2(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		Static117.anInterface3_1 = arg0.method2011();
		this.anInt2662 = arg1;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1994(@OriginalArg(0) Component arg0) throws Exception {
		Static117.anInterface3_1.method2492(arg0, Static59.aBoolean76, Static191.anInt4086);
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
	@Override
	public void method1999(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static117.anInterface3_1.method2491(this.anInt2662, arg0);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()V")
	@Override
	protected void method1987() {
		Static117.anInterface3_1.method2490(this.anInt2662);
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "()I")
	@Override
	protected int method1992() {
		return Static117.anInterface3_1.method2488(this.anInt2662);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
	@Override
	protected void method1984() {
		Static117.anInterface3_1.method2489(this.anInt2662, super.anIntArray335);
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "()V")
	@Override
	protected void method1995() {
		Static117.anInterface3_1.method2487(this.anInt2662);
	}
}
