import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class174_Sub2 extends Class174 {

	@OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
	private final int anInt6322;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!kq;I)V")
	public Class174_Sub2(@OriginalArg(0) Class110 arg0, @OriginalArg(1) int arg1) {
		Static329.anInterface9_2 = arg0.method3355();
		this.anInt6322 = arg1;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "()V")
	@Override
	protected void method5517() {
		Static329.anInterface9_2.method5313(this.anInt6322);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	@Override
	public void method5509(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static329.anInterface9_2.method5310(arg0, this.anInt6322);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5512(@OriginalArg(0) Component arg0) throws Exception {
		Static329.anInterface9_2.method5311(Static111.aBoolean191, Static184.anInt3834, arg0);
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "()I")
	@Override
	protected int method5522() {
		return Static329.anInterface9_2.method5312(this.anInt6322);
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "()V")
	@Override
	protected void method5524() {
		Static329.anInterface9_2.method5309(this.anInt6322, super.anIntArray785);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "()V")
	@Override
	protected void method5516() {
		Static329.anInterface9_2.method5314(this.anInt6322);
	}
}
