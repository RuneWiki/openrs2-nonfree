import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public final class Class58_Sub2 extends Class58 {

	@OriginalMember(owner = "client!oda", name = "K", descriptor = "I")
	private final int anInt6619;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Lclient!k;I)V")
	public Class58_Sub2(@OriginalArg(0) Class168 arg0, @OriginalArg(1) int arg1) {
		Static382.anInterface6_1 = (Interface6) arg0.method4090();
		this.anInt6619 = arg1;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5317(@OriginalArg(0) Component arg0) throws Exception {
		Static382.anInterface6_1.method5819(arg0, Static102.aBoolean181, Static180.anInt3952);
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "()V")
	@Override
	protected void method5320() {
		Static382.anInterface6_1.method5822(this.anInt6619);
	}

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "()I")
	@Override
	protected int method5322() {
		return Static382.anInterface6_1.method5820(this.anInt6619);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "()V")
	@Override
	protected void method5316() {
		Static382.anInterface6_1.method5821(this.anInt6619, super.anIntArray373);
	}

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "()V")
	@Override
	protected void method5324() {
		Static382.anInterface6_1.method5823(this.anInt6619);
	}

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "(I)V")
	@Override
	public void method5325(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static382.anInterface6_1.method5818(arg0, this.anInt6619);
	}
}
