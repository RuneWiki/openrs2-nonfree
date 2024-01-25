import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public final class Class127_Sub1 extends Class127 {

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
	private final int anInt5011;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!qn;I)V")
	public Class127_Sub1(@OriginalArg(0) Class291 arg0, @OriginalArg(1) int arg1) {
		Static298.anInterface8_1 = (Interface8) arg0.method7141();
		this.anInt5011 = arg1;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
	@Override
	protected void method7558() {
		Static298.anInterface8_1.method4108(this.anInt5011, super.anIntArray739);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()I")
	@Override
	protected int method7557() {
		return Static298.anInterface8_1.method4110(this.anInt5011);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	@Override
	public void method7561(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static298.anInterface8_1.method4107(this.anInt5011, arg0);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7572(@OriginalArg(0) Component arg0) throws Exception {
		Static298.anInterface8_1.method4111(Static348.anInt5701, Static219.aBoolean313, arg0);
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "()V")
	@Override
	protected void method7559() {
		Static298.anInterface8_1.method4109(this.anInt5011);
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "()V")
	@Override
	protected void method7560() {
		Static298.anInterface8_1.method4112(this.anInt5011);
	}
}
