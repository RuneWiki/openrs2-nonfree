import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!mga", name = "I", descriptor = "I")
	private final int anInt7071;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lclient!cea;I)V")
	public Class34_Sub2(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1) {
		Static371.anInterface7_1 = (Interface7) arg0.method1312();
		this.anInt7071 = arg1;
	}

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "()V")
	@Override
	protected void method6335() {
		Static371.anInterface7_1.method7402(this.anInt7071, super.anIntArray335);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "()V")
	@Override
	protected void method6321() {
		Static371.anInterface7_1.method7398(this.anInt7071);
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "()V")
	@Override
	protected void method6326() {
		Static371.anInterface7_1.method7403(this.anInt7071);
	}

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "()I")
	@Override
	protected int method6334() {
		return Static371.anInterface7_1.method7399(this.anInt7071);
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)V")
	@Override
	public void method6324(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static371.anInterface7_1.method7400(arg0, this.anInt7071);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6332(@OriginalArg(0) Component arg0) throws Exception {
		Static371.anInterface7_1.method7401(Static237.anInt4718, arg0, Static41.aBoolean53);
	}
}
