import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!gn;I)V")
	public Class9_Sub1(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1) {
		Static7.anInterface5_1 = arg0.method1620();
		this.anInt246 = arg1;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "()V")
	@Override
	protected void method4336() {
		Static7.anInterface5_1.method3654(this.anInt246);
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "()V")
	@Override
	protected void method4339() {
		Static7.anInterface5_1.method3652(this.anInt246, this.anIntArray562);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4344(@OriginalArg(0) Component arg0) throws Exception {
		Static7.anInterface5_1.method3653(Static199.aBoolean240, arg0, Static43.anInt1255);
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	@Override
	public void method4343(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static7.anInterface5_1.method3651(arg0, this.anInt246);
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "()I")
	@Override
	protected int method4349() {
		return Static7.anInterface5_1.method3650(this.anInt246);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "()V")
	@Override
	protected void method4335() {
		Static7.anInterface5_1.method3655(this.anInt246);
	}
}
