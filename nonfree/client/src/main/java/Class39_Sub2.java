import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
	private final int anInt5868;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!lp;I)V")
	public Class39_Sub2(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1) {
		Static303.anInterface3_2 = arg0.method4803();
		this.anInt5868 = arg1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "()V")
	@Override
	protected void method5058() {
		Static303.anInterface3_2.method3341(this.anInt5868, super.anIntArray415);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "()V")
	@Override
	protected void method5069() {
		Static303.anInterface3_2.method3342(this.anInt5868);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
	@Override
	public void method5065(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static303.anInterface3_2.method3340(this.anInt5868, arg0);
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "()I")
	@Override
	protected int method5070() {
		return Static303.anInterface3_2.method3344(this.anInt5868);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "()V")
	@Override
	protected void method5067() {
		Static303.anInterface3_2.method3345(this.anInt5868);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5064(@OriginalArg(0) Component arg0) throws Exception {
		Static303.anInterface3_2.method3343(Static267.aBoolean348, arg0, Static77.anInt2079);
	}
}
