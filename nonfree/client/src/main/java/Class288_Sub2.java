import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class288_Sub2 extends Class288 {

	@OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
	private final int anInt8065;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!n;I)V")
	public Class288_Sub2(@OriginalArg(0) Class221 arg0, @OriginalArg(1) int arg1) {
		Static507.anInterface6_1 = (Interface6) arg0.method5192();
		this.anInt8065 = arg1;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6800(@OriginalArg(0) Component arg0) throws Exception {
		Static507.anInterface6_1.method2808(Static134.aBoolean244, arg0, Static124.anInt3635);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "()V")
	@Override
	protected void method6795() {
		Static507.anInterface6_1.method2810(this.anInt8065);
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "()I")
	@Override
	protected int method6807() {
		return Static507.anInterface6_1.method2807(this.anInt8065);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "()V")
	@Override
	protected void method6803() {
		Static507.anInterface6_1.method2811(this.anInt8065, super.anIntArray617);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	@Override
	public void method6801(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static507.anInterface6_1.method2809(this.anInt8065, arg0);
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "()V")
	@Override
	protected void method6808() {
		Static507.anInterface6_1.method2812(this.anInt8065);
	}
}
