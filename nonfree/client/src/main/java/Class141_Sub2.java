import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public final class Class141_Sub2 extends Class141 {

	@OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
	private final int anInt6760;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!gba;I)V")
	public Class141_Sub2(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1) {
		Static383.anInterface16_1 = (Interface16) arg0.method2511();
		this.anInt6760 = arg1;
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "()V")
	@Override
	protected void method5536() {
		Static383.anInterface16_1.method2577(this.anInt6760);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5534(@OriginalArg(0) Component arg0) throws Exception {
		Static383.anInterface16_1.method2579(Static582.aBoolean692, arg0, Static426.anInt7216);
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "()V")
	@Override
	protected void method5538() {
		Static383.anInterface16_1.method2574(this.anInt6760);
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "()I")
	@Override
	protected int method5532() {
		return Static383.anInterface16_1.method2576(this.anInt6760);
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
	@Override
	public void method5533(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static383.anInterface16_1.method2578(this.anInt6760, arg0);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "()V")
	@Override
	protected void method5528() {
		Static383.anInterface16_1.method2575(this.anInt6760, super.anIntArray450);
	}
}
