import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
	private final int anInt1580;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!qe;I)V")
	public Class21_Sub1(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1) {
		Static60.anInterface3_1 = arg0.method2131();
		this.anInt1580 = arg1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "()V")
	@Override
	protected void method1336() {
		Static60.anInterface3_1.method2871(this.anInt1580);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	@Override
	public void method1335(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static60.anInterface3_1.method2872(arg0, this.anInt1580);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1350(@OriginalArg(0) Component arg0) throws Exception {
		Static60.anInterface3_1.method2874(arg0, Static114.aBoolean125, Static113.anInt2749);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "()V")
	@Override
	protected void method1339() {
		Static60.anInterface3_1.method2870(this.anInt1580);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "()I")
	@Override
	protected int method1338() {
		return Static60.anInterface3_1.method2875(this.anInt1580);
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "()V")
	@Override
	protected void method1345() {
		Static60.anInterface3_1.method2873(this.anInt1580, super.anIntArray187);
	}
}
