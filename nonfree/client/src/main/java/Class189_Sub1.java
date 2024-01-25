import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class189_Sub1 extends Class189 {

	@OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
	private final int anInt5455;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!tt;I)V")
	public Class189_Sub1(@OriginalArg(0) Class313 arg0, @OriginalArg(1) int arg1) {
		Static296.anInterface20_1 = (Interface20) arg0.method6992();
		this.anInt5455 = arg1;
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "()V")
	@Override
	protected void method4935() {
		Static296.anInterface20_1.method5024(this.anInt5455, super.anIntArray437);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "()I")
	@Override
	protected int method4934() {
		return Static296.anInterface20_1.method5021(this.anInt5455);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4947(@OriginalArg(0) Component arg0) throws Exception {
		Static296.anInterface20_1.method5019(Static313.anInt6055, arg0, Static480.aBoolean552);
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "()V")
	@Override
	protected void method4942() {
		Static296.anInterface20_1.method5023(this.anInt5455);
	}

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "()V")
	@Override
	protected void method4944() {
		Static296.anInterface20_1.method5022(this.anInt5455);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	@Override
	public void method4938(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static296.anInterface20_1.method5020(this.anInt5455, arg0);
	}
}
