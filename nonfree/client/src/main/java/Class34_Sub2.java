import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!wr", name = "P", descriptor = "I")
	private final int anInt6408;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!vj;I)V")
	public Class34_Sub2(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1) {
		Static355.anInterface6_2 = arg0.method5534();
		this.anInt6408 = arg1;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
	@Override
	public void method5818(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static355.anInterface6_2.method4245(this.anInt6408, arg0);
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "()V")
	@Override
	protected void method5833() {
		Static355.anInterface6_2.method4244(this.anInt6408);
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "()I")
	@Override
	protected int method5830() {
		return Static355.anInterface6_2.method4243(this.anInt6408);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "()V")
	@Override
	protected void method5826() {
		Static355.anInterface6_2.method4240(this.anInt6408, super.anIntArray722);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5824(@OriginalArg(0) Component arg0) throws Exception {
		Static355.anInterface6_2.method4242(arg0, Static16.aBoolean25, Static22.anInt358);
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "()V")
	@Override
	protected void method5828() {
		Static355.anInterface6_2.method4241(this.anInt6408);
	}
}
