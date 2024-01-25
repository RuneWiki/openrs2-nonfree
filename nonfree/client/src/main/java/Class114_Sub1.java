import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public final class Class114_Sub1 extends Class114 {

	@OriginalMember(owner = "client!gba", name = "G", descriptor = "I")
	private final int anInt3939;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!fl;I)V")
	public Class114_Sub1(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		Static175.anInterface13_1 = (Interface13) arg0.method3136();
		this.anInt3939 = arg1;
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static175.anInterface13_1.method5099(arg0, this.anInt3939);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "()V")
	@Override
	protected void method4230() {
		Static175.anInterface13_1.method5100(this.anInt3939, super.anIntArray219);
	}

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "()V")
	@Override
	protected void method4235() {
		Static175.anInterface13_1.method5098(this.anInt3939);
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "()I")
	@Override
	protected int method4231() {
		return Static175.anInterface13_1.method5101(this.anInt3939);
	}

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "()V")
	@Override
	protected void method4232() {
		Static175.anInterface13_1.method5097(this.anInt3939);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4226(@OriginalArg(0) Component arg0) throws Exception {
		Static175.anInterface13_1.method5096(Static528.aBoolean739, arg0, Static322.anInt6392);
	}
}
