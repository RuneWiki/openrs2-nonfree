import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class116_Sub1 extends Class116 {

	@OriginalMember(owner = "client!im", name = "K", descriptor = "I")
	private final int anInt3194;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!ec;I)V")
	public Class116_Sub1(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1) {
		Static177.anInterface6_2 = arg0.method1470();
		this.anInt3194 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "()I")
	@Override
	protected int method5584() {
		return Static177.anInterface6_2.method2581(this.anInt3194);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "()V")
	@Override
	protected void method5578() {
		Static177.anInterface6_2.method2585(this.anInt3194, super.anIntArray610);
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "()V")
	@Override
	protected void method5579() {
		Static177.anInterface6_2.method2583(this.anInt3194);
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "()V")
	@Override
	protected void method5586() {
		Static177.anInterface6_2.method2584(this.anInt3194);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5585(@OriginalArg(0) Component arg0) throws Exception {
		Static177.anInterface6_2.method2582(arg0, Static208.anInt3680, Static213.aBoolean232);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	@Override
	public void method5572(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static177.anInterface6_2.method2586(arg0, this.anInt3194);
	}
}
