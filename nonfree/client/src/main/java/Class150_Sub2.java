import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class150_Sub2 extends Class150 {

	@OriginalMember(owner = "client!lv", name = "K", descriptor = "I")
	private final int anInt6117;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lclient!ft;I)V")
	public Class150_Sub2(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1) {
		Static361.anInterface26_1 = (Interface26) arg0.method3349();
		this.anInt6117 = arg1;
	}

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "()V")
	@Override
	protected void method5489() {
		Static361.anInterface26_1.method1351(this.anInt6117);
	}

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "()I")
	@Override
	protected int method5491() {
		return Static361.anInterface26_1.method1350(this.anInt6117);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "()V")
	@Override
	protected void method5488() {
		Static361.anInterface26_1.method1353(this.anInt6117, super.anIntArray360);
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "()V")
	@Override
	protected void method5497() {
		Static361.anInterface26_1.method1349(this.anInt6117);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5494(@OriginalArg(0) Component arg0) throws Exception {
		Static361.anInterface26_1.method1354(Static30.aBoolean32, arg0, Static90.anInt9479);
	}

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "(I)V")
	@Override
	public void method5496(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static361.anInterface26_1.method1352(this.anInt6117, arg0);
	}
}
