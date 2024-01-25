import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public final class Class93_Sub2 extends Class93 {

	@OriginalMember(owner = "client!paa", name = "J", descriptor = "I")
	private final int anInt7216;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!fc;I)V")
	public Class93_Sub2(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1) {
		Static416.anInterface17_1 = (Interface17) arg0.method2098();
		this.anInt7216 = arg1;
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "()V")
	@Override
	protected void method6361() {
		Static416.anInterface17_1.method3563(this.anInt7216);
	}

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "()I")
	@Override
	protected int method6365() {
		return Static416.anInterface17_1.method3567(this.anInt7216);
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "()V")
	@Override
	protected void method6360() {
		Static416.anInterface17_1.method3562(this.anInt7216);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6362(@OriginalArg(0) Component arg0) throws Exception {
		Static416.anInterface17_1.method3564(arg0, Static21.aBoolean12, Static491.anInt8290);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "()V")
	@Override
	protected void method6356() {
		Static416.anInterface17_1.method3565(this.anInt7216, super.anIntArray382);
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "(I)V")
	@Override
	public void method6371(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static416.anInterface17_1.method3566(arg0, this.anInt7216);
	}
}
