import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class56_Sub2 extends Class56 {

	@OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
	private final int anInt3359;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!ja;I)V")
	public Class56_Sub2(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1) {
		Static164.anInterface3_2 = arg0.method1361();
		this.anInt3359 = arg1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()V")
	@Override
	protected void method2452() {
		Static164.anInterface3_2.method2429(this.anInt3359, super.anIntArray251);
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "()V")
	@Override
	protected void method2458() {
		Static164.anInterface3_2.method2424(this.anInt3359);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2450(@OriginalArg(0) Component arg0) throws Exception {
		Static164.anInterface3_2.method2425(Static91.anInt1796, arg0, Static150.aBoolean144);
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "()V")
	@Override
	protected void method2455() {
		Static164.anInterface3_2.method2428(this.anInt3359);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "()I")
	@Override
	protected int method2453() {
		return Static164.anInterface3_2.method2427(this.anInt3359);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	@Override
	public void method2446(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static164.anInterface3_2.method2426(this.anInt3359, arg0);
	}
}
