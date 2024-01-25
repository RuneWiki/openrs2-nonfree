import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!il", name = "D", descriptor = "I")
	private final int anInt2742;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!dq;I)V")
	public Class45_Sub1(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1) {
		Static152.anInterface9_2 = arg0.method1189();
		this.anInt2742 = arg1;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3358(@OriginalArg(0) Component arg0) throws Exception {
		Static152.anInterface9_2.method4801(Static221.anInt4100, Static148.aBoolean202, arg0);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "()V")
	@Override
	protected void method3353() {
		Static152.anInterface9_2.method4799(this.anInt2742, super.anIntArray443);
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "()V")
	@Override
	protected void method3364() {
		Static152.anInterface9_2.method4802(this.anInt2742);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "()V")
	@Override
	protected void method3354() {
		Static152.anInterface9_2.method4800(this.anInt2742);
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "()I")
	@Override
	protected int method3355() {
		return Static152.anInterface9_2.method4804(this.anInt2742);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	@Override
	public void method3362(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static152.anInterface9_2.method4803(this.anInt2742, arg0);
	}
}
