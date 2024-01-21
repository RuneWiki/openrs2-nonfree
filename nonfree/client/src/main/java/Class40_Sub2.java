import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
	private final int anInt3674;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!rf;I)V")
	public Class40_Sub2(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1) {
		Static145.anInterface3_2 = arg0.method2486();
		this.anInt3674 = arg1;
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "()V")
	@Override
	protected void method2521() {
		Static145.anInterface3_2.method2556(this.anInt3674);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2519(@OriginalArg(0) Component arg0) throws Exception {
		Static145.anInterface3_2.method2555(arg0, Static80.aBoolean110, Static35.anInt974);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "()V")
	@Override
	protected void method2514() {
		Static145.anInterface3_2.method2557(this.anInt3674);
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
	@Override
	public void method2524(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static145.anInterface3_2.method2554(arg0, this.anInt3674);
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "()V")
	@Override
	protected void method2520() {
		Static145.anInterface3_2.method2552(this.anInt3674, super.anIntArray483);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "()I")
	@Override
	protected int method2518() {
		return Static145.anInterface3_2.method2553(this.anInt3674);
	}
}
