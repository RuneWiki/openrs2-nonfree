import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class Class63_Sub2 extends Class63 {

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
	private final int anInt3872;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!kk;I)V")
	public Class63_Sub2(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1) {
		Static223.anInterface5_1 = (Interface5) arg0.method4340();
		this.anInt3872 = arg1;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "()I")
	@Override
	protected int method3491() {
		return Static223.anInterface5_1.method2473(this.anInt3872);
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	@Override
	public void method3496(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static223.anInterface5_1.method2471(arg0, this.anInt3872);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3494(@OriginalArg(0) Component arg0) throws Exception {
		Static223.anInterface5_1.method2472(Static568.aBoolean763, arg0, Static92.anInt9993);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
	@Override
	protected void method3490() {
		Static223.anInterface5_1.method2474(this.anInt3872);
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "()V")
	@Override
	protected void method3499() {
		Static223.anInterface5_1.method2475(this.anInt3872);
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "()V")
	@Override
	protected void method3501() {
		Static223.anInterface5_1.method2476(this.anInt3872, super.anIntArray320);
	}
}
