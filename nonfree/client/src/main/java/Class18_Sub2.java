import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class18_Sub2 extends Class18 {

	@OriginalMember(owner = "client!of", name = "O", descriptor = "I")
	private final int anInt2310;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!kc;I)V")
	public Class18_Sub2(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1) {
		Static85.anInterface1_2 = arg0.method1097();
		this.anInt2310 = arg1;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "()V")
	@Override
	protected void method1532() {
		Static85.anInterface1_2.method4(this.anInt2310, super.anIntArray194);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "()V")
	@Override
	protected void method1528() {
		Static85.anInterface1_2.method6(this.anInt2310);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1531(@OriginalArg(0) Component arg0) throws Exception {
		Static85.anInterface1_2.method5(Static7.anInt420, arg0, Static28.aBoolean44);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "()I")
	@Override
	protected int method1529() {
		return Static85.anInterface1_2.method7(this.anInt2310);
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "()V")
	@Override
	protected void method1538() {
		Static85.anInterface1_2.method9(this.anInt2310);
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
	@Override
	public void method1542(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static85.anInterface1_2.method8(arg0, this.anInt2310);
	}
}
