import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public final class Class80_Sub2 extends Class80 {

	@OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
	private final int anInt6715;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!wd;I)V")
	public Class80_Sub2(@OriginalArg(0) Class354 arg0, @OriginalArg(1) int arg1) {
		Static348.anInterface24_1 = (Interface24) arg0.method8222();
		this.anInt6715 = arg1;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "()V")
	@Override
	protected void method5602() {
		Static348.anInterface24_1.method3967(this.anInt6715, super.anIntArray347);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static348.anInterface24_1.method3970(arg0, this.anInt6715);
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "()V")
	@Override
	protected void method5610() {
		Static348.anInterface24_1.method3968(this.anInt6715);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5613(@OriginalArg(0) Component arg0) throws Exception {
		Static348.anInterface24_1.method3971(Static262.anInt5047, Static161.aBoolean31, arg0);
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "()I")
	@Override
	protected int method5608() {
		return Static348.anInterface24_1.method3966(this.anInt6715);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "()V")
	@Override
	protected void method5600() {
		Static348.anInterface24_1.method3969(this.anInt6715);
	}
}
