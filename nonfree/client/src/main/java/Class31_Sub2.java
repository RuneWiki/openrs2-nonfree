import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
	private final int anInt3937;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!pf;I)V")
	public Class31_Sub2(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1) {
		Static169.anInterface1_2 = arg0.method2225();
		this.anInt3937 = arg1;
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "()V")
	@Override
	protected void method2995() {
		Static169.anInterface1_2.method1501(this.anInt3937);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	@Override
	public void method2993(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static169.anInterface1_2.method1502(arg0, this.anInt3937);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "()V")
	@Override
	protected void method2994() {
		Static169.anInterface1_2.method1505(this.anInt3937);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
	@Override
	protected void method2989() {
		Static169.anInterface1_2.method1503(this.anInt3937, super.anIntArray417);
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "()I")
	@Override
	protected int method2998() {
		return Static169.anInterface1_2.method1500(this.anInt3937);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3002(@OriginalArg(0) Component arg0) throws Exception {
		Static169.anInterface1_2.method1504(Static185.anInt3915, Static107.aBoolean100, arg0);
	}
}
