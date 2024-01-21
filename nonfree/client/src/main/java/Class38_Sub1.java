import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
	private final int anInt4007;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!na;I)V")
	public Class38_Sub1(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1) {
		Static179.anInterface3_2 = arg0.method1786();
		this.anInt4007 = arg1;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "()I")
	@Override
	protected int method2950() {
		return Static179.anInterface3_2.method2734(this.anInt4007);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2939(@OriginalArg(0) Component arg0) throws Exception {
		Static179.anInterface3_2.method2735(Static47.anInt1073, arg0, Static112.aBoolean97);
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "()V")
	@Override
	protected void method2956() {
		Static179.anInterface3_2.method2738(this.anInt4007);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "()V")
	@Override
	protected void method2948() {
		Static179.anInterface3_2.method2733(this.anInt4007);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	@Override
	public void method2953(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static179.anInterface3_2.method2737(arg0, this.anInt4007);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "()V")
	@Override
	protected void method2942() {
		Static179.anInterface3_2.method2736(this.anInt4007, super.anIntArray492);
	}
}
