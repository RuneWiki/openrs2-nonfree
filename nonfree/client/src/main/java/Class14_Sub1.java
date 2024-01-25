import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!be", name = "F", descriptor = "I")
	private final int anInt847;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!rj;I)V")
	public Class14_Sub1(@OriginalArg(0) Class287 arg0, @OriginalArg(1) int arg1) {
		Static32.anInterface22_1 = (Interface22) arg0.method6544();
		this.anInt847 = arg1;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
	@Override
	public void method5528(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static32.anInterface22_1.method6630(arg0, this.anInt847);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "()V")
	@Override
	protected void method5527() {
		Static32.anInterface22_1.method6629(this.anInt847);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "()V")
	@Override
	protected void method5517() {
		Static32.anInterface22_1.method6628(this.anInt847);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "()I")
	@Override
	protected int method5526() {
		return Static32.anInterface22_1.method6631(this.anInt847);
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "()V")
	@Override
	protected void method5529() {
		Static32.anInterface22_1.method6632(this.anInt847, super.anIntArray454);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5519(@OriginalArg(0) Component arg0) throws Exception {
		Static32.anInterface22_1.method6633(arg0, Static162.anInt3474, Static591.aBoolean732);
	}
}
