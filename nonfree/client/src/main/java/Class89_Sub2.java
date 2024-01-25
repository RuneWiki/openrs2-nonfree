import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class89_Sub2 extends Class89 {

	@OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
	private final int anInt6782;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!kd;I)V")
	public Class89_Sub2(@OriginalArg(0) Class123 arg0, @OriginalArg(1) int arg1) {
		Static367.anInterface1_2 = arg0.method3245();
		this.anInt6782 = arg1;
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
	@Override
	public void method5868(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static367.anInterface1_2.method389(this.anInt6782, arg0);
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "()V")
	@Override
	protected void method5860() {
		Static367.anInterface1_2.method387(this.anInt6782);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "()I")
	@Override
	protected int method5854() {
		return Static367.anInterface1_2.method386(this.anInt6782);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5866(@OriginalArg(0) Component arg0) throws Exception {
		Static367.anInterface1_2.method385(arg0, Static291.aBoolean399, Static392.anInt7144);
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "()V")
	@Override
	protected void method5857() {
		Static367.anInterface1_2.method390(this.anInt6782, super.anIntArray573);
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "()V")
	@Override
	protected void method5855() {
		Static367.anInterface1_2.method388(this.anInt6782);
	}
}
