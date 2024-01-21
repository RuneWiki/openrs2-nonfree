import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class42_Sub2 extends Class42 {

	@OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
	private final int anInt3136;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!vi;I)V")
	public Class42_Sub2(@OriginalArg(0) Class99 arg0, @OriginalArg(1) int arg1) {
		Static139.anInterface1_1 = arg0.method3417();
		this.anInt3136 = arg1;
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "()I")
	@Override
	protected int method2423() {
		return Static139.anInterface1_1.method736(this.anInt3136);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2419(@OriginalArg(0) Component arg0) throws Exception {
		Static139.anInterface1_1.method735(Static148.anInt3288, arg0, Static138.aBoolean145);
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
	@Override
	public void method2417(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static139.anInterface1_1.method733(this.anInt3136, arg0);
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "()V")
	@Override
	protected void method2421() {
		Static139.anInterface1_1.method737(this.anInt3136);
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "()V")
	@Override
	protected void method2428() {
		Static139.anInterface1_1.method732(this.anInt3136);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
	@Override
	protected void method2420() {
		Static139.anInterface1_1.method734(this.anInt3136, super.anIntArray256);
	}
}
