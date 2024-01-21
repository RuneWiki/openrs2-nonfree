import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!da", name = "W", descriptor = "I")
	private final int anInt602;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!we;I)V")
	public Class15_Sub1(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1) {
		Static18.anInterface3_1 = arg0.method2162();
		this.anInt602 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
	@Override
	protected void method1521() {
		Static18.anInterface3_1.method1240(this.anInt602, super.anIntArray316);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1536(@OriginalArg(0) Component arg0) throws Exception {
		Static18.anInterface3_1.method1237(Static33.aBoolean47, Static1.anInt3, arg0);
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
	@Override
	protected void method1537() {
		Static18.anInterface3_1.method1241(this.anInt602);
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()I")
	@Override
	protected int method1538() {
		return Static18.anInterface3_1.method1238(this.anInt602);
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
	@Override
	public void method1532(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static18.anInterface3_1.method1239(this.anInt602, arg0);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
	@Override
	protected void method1533() {
		Static18.anInterface3_1.method1236(this.anInt602);
	}
}
