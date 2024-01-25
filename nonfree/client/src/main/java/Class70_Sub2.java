import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class70_Sub2 extends Class70 {

	@OriginalMember(owner = "client!w", name = "K", descriptor = "I")
	private final int anInt10705;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!vo;I)V")
	public Class70_Sub2(@OriginalArg(0) Class389 arg0, @OriginalArg(1) int arg1) {
		Static696.anInterface14_1 = (Interface14) arg0.method9281();
		this.anInt10705 = arg1;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method9361(@OriginalArg(0) Component arg0) throws Exception {
		Static696.anInterface14_1.method7645(Static42.aBoolean76, Static24.anInt294, arg0);
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()V")
	@Override
	protected void method9355() {
		Static696.anInterface14_1.method7646(this.anInt10705);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()I")
	@Override
	protected int method9364() {
		return Static696.anInterface14_1.method7648(this.anInt10705);
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()V")
	@Override
	protected void method9359() {
		Static696.anInterface14_1.method7649(this.anInt10705);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
	@Override
	protected void method9354() {
		Static696.anInterface14_1.method7647(this.anInt10705, super.anIntArray742);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	@Override
	public void method9360(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static696.anInterface14_1.method7644(this.anInt10705, arg0);
	}
}
