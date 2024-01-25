import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class96_Sub2 extends Class96 {

	@OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
	private final int anInt4105;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!dq;I)V")
	public Class96_Sub2(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1) {
		Static239.anInterface10_2 = arg0.method1368();
		this.anInt4105 = arg1;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "()V")
	@Override
	protected void method3463() {
		Static239.anInterface10_2.method4572(this.anInt4105);
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "()I")
	@Override
	protected int method3475() {
		return Static239.anInterface10_2.method4568(this.anInt4105);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3461(@OriginalArg(0) Component arg0) throws Exception {
		Static239.anInterface10_2.method4567(Static203.anInt3626, Static158.aBoolean222, arg0);
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
	@Override
	public void method3469(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static239.anInterface10_2.method4569(arg0, this.anInt4105);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "()V")
	@Override
	protected void method3462() {
		Static239.anInterface10_2.method4570(this.anInt4105, super.anIntArray269);
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "()V")
	@Override
	protected void method3464() {
		Static239.anInterface10_2.method4571(this.anInt4105);
	}
}
