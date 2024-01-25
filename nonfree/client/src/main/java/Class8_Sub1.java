import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
	private final int anInt184;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!pi;I)V")
	public Class8_Sub1(@OriginalArg(0) Class258 arg0, @OriginalArg(1) int arg1) {
		Static8.anInterface23_1 = (Interface23) arg0.method5889();
		this.anInt184 = arg1;
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "()V")
	@Override
	protected void method5527() {
		Static8.anInterface23_1.method4815(this.anInt184, super.anIntArray393);
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "()I")
	@Override
	protected int method5521() {
		return Static8.anInterface23_1.method4813(this.anInt184);
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "()V")
	@Override
	protected void method5523() {
		Static8.anInterface23_1.method4818(this.anInt184);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "()V")
	@Override
	protected void method5520() {
		Static8.anInterface23_1.method4817(this.anInt184);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5518(@OriginalArg(0) Component arg0) throws Exception {
		Static8.anInterface23_1.method4814(arg0, Static305.aBoolean394, Static404.anInt6999);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	@Override
	public void method5522(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static8.anInterface23_1.method4816(arg0, this.anInt184);
	}
}
