import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!jm", name = "S", descriptor = "I")
	private int anInt2772;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!tk;I)V")
	public Class51_Sub1(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1) {
		Static130.anInterface4_1 = arg0.method3938();
		this.anInt2772 = arg1;
	}

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)V")
	@Override
	public void method3285(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static130.anInterface4_1.method2866(arg0, this.anInt2772);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3284(@OriginalArg(0) Component arg0) throws Exception {
		Static130.anInterface4_1.method2864(Static79.anInt1529, Static14.aBoolean153, arg0);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "()V")
	@Override
	protected void method3269() {
		Static130.anInterface4_1.method2867(this.anInt2772, this.anIntArray358);
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "()I")
	@Override
	protected int method3271() {
		return Static130.anInterface4_1.method2862(this.anInt2772);
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "()V")
	@Override
	protected void method3277() {
		Static130.anInterface4_1.method2865(this.anInt2772);
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "()V")
	@Override
	protected void method3270() {
		Static130.anInterface4_1.method2863(this.anInt2772);
	}
}
