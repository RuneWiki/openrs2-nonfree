import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public final class Class188_Sub1 extends Class188 {

	@OriginalMember(owner = "client!kia", name = "K", descriptor = "I")
	private final int anInt5303;

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lclient!hga;I)V")
	public Class188_Sub1(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		Static298.anInterface23_1 = (Interface23) arg0.method3570();
		this.anInt5303 = arg1;
	}

	@OriginalMember(owner = "client!kia", name = "d", descriptor = "()V")
	@Override
	protected void method7773() {
		Static298.anInterface23_1.method4171(this.anInt5303, super.anIntArray571);
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "()V")
	@Override
	protected void method7760() {
		Static298.anInterface23_1.method4172(this.anInt5303);
	}

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "()I")
	@Override
	protected int method7770() {
		return Static298.anInterface23_1.method4175(this.anInt5303);
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7769(@OriginalArg(0) Component arg0) throws Exception {
		Static298.anInterface23_1.method4173(Static447.aBoolean556, Static276.anInt4980, arg0);
	}

	@OriginalMember(owner = "client!kia", name = "c", descriptor = "()V")
	@Override
	protected void method7771() {
		Static298.anInterface23_1.method4170(this.anInt5303);
	}

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "(I)V")
	@Override
	public void method7759(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static298.anInterface23_1.method4174(arg0, this.anInt5303);
	}
}
