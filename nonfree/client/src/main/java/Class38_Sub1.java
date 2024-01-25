import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
	private final int anInt915;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!or;I)V")
	public Class38_Sub1(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1) {
		Static52.anInterface4_1 = arg0.method3909();
		this.anInt915 = arg1;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "()I")
	@Override
	protected int method1489() {
		return Static52.anInterface4_1.method1086(this.anInt915);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1483(@OriginalArg(0) Component arg0) throws Exception {
		Static52.anInterface4_1.method1081(Static257.aBoolean291, Static333.anInt5628, arg0);
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
	@Override
	public void method1488(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static52.anInterface4_1.method1084(this.anInt915, arg0);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "()V")
	@Override
	protected void method1482() {
		Static52.anInterface4_1.method1085(this.anInt915);
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "()V")
	@Override
	protected void method1491() {
		Static52.anInterface4_1.method1082(this.anInt915);
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "()V")
	@Override
	protected void method1493() {
		Static52.anInterface4_1.method1083(this.anInt915, super.anIntArray141);
	}
}
