import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!cn", name = "R", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!rj;I)V")
	public Class28_Sub1(@OriginalArg(0) Class154 arg0, @OriginalArg(1) int arg1) {
		Static39.anInterface2_1 = arg0.method3899();
		this.anInt828 = arg1;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "()V")
	@Override
	protected void method4766() {
		Static39.anInterface2_1.method2150(this.anInt828, this.anIntArray505);
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "()I")
	@Override
	protected int method4775() {
		return Static39.anInterface2_1.method2147(this.anInt828);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "()V")
	@Override
	protected void method4763() {
		Static39.anInterface2_1.method2149(this.anInt828);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4765(@OriginalArg(0) Component arg0) throws Exception {
		Static39.anInterface2_1.method2148(arg0, Static257.aBoolean319, Static303.anInt5383);
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)V")
	@Override
	public void method4776(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static39.anInterface2_1.method2152(arg0, this.anInt828);
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "()V")
	@Override
	protected void method4773() {
		Static39.anInterface2_1.method2151(this.anInt828);
	}
}
