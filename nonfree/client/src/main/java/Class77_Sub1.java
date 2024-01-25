import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public final class Class77_Sub1 extends Class77 {

	@OriginalMember(owner = "client!md", name = "K", descriptor = "I")
	private final int anInt3893;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!ji;I)V")
	public Class77_Sub1(@OriginalArg(0) Class124 arg0, @OriginalArg(1) int arg1) {
		Static242.anInterface1_2 = arg0.method2516();
		this.anInt3893 = arg1;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "()V")
	@Override
	protected void method4273() {
		Static242.anInterface1_2.method119(this.anInt3893);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "()V")
	@Override
	protected void method4263() {
		Static242.anInterface1_2.method116(this.anInt3893, super.anIntArray329);
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
	@Override
	public void method4268(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static242.anInterface1_2.method117(arg0, this.anInt3893);
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "()I")
	@Override
	protected int method4275() {
		return Static242.anInterface1_2.method118(this.anInt3893);
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "()V")
	@Override
	protected void method4277() {
		Static242.anInterface1_2.method115(this.anInt3893);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4269(@OriginalArg(0) Component arg0) throws Exception {
		Static242.anInterface1_2.method114(Static25.aBoolean39, Static155.anInt2607, arg0);
	}
}
