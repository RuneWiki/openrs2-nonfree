import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!le", name = "L", descriptor = "I")
	private final int anInt5642;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!qg;I)V")
	public Class39_Sub2(@OriginalArg(0) Class286 arg0, @OriginalArg(1) int arg1) {
		Static319.anInterface23_1 = (Interface23) arg0.method6578();
		this.anInt5642 = arg1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
	@Override
	protected void method4889() {
		Static319.anInterface23_1.method5754(this.anInt5642);
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "()I")
	@Override
	protected int method4903() {
		return Static319.anInterface23_1.method5753(this.anInt5642);
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "()V")
	@Override
	protected void method4899() {
		Static319.anInterface23_1.method5751(this.anInt5642, super.anIntArray351);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4901(@OriginalArg(0) Component arg0) throws Exception {
		Static319.anInterface23_1.method5749(Static489.anInt8544, Static40.aBoolean75, arg0);
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()V")
	@Override
	protected void method4897() {
		Static319.anInterface23_1.method5750(this.anInt5642);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	@Override
	public void method4893(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static319.anInterface23_1.method5752(this.anInt5642, arg0);
	}
}
