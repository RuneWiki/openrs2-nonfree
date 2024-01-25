import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public final class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!sfa", name = "P", descriptor = "I")
	private final int anInt8664;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lclient!tga;I)V")
	public Class45_Sub2(@OriginalArg(0) Class349 arg0, @OriginalArg(1) int arg1) {
		Static544.anInterface4_1 = (Interface4) arg0.method7733();
		this.anInt8664 = arg1;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7461(@OriginalArg(0) Component arg0) throws Exception {
		Static544.anInterface4_1.method1480(Static417.anInt7038, arg0, Static404.aBoolean460);
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "()V")
	@Override
	protected void method7449() {
		Static544.anInterface4_1.method1477(this.anInt8664, super.anIntArray495);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "()V")
	@Override
	protected void method7458() {
		Static544.anInterface4_1.method1479(this.anInt8664);
	}

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "()V")
	@Override
	protected void method7447() {
		Static544.anInterface4_1.method1476(this.anInt8664);
	}

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "()I")
	@Override
	protected int method7460() {
		return Static544.anInterface4_1.method1475(this.anInt8664);
	}

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static544.anInterface4_1.method1478(this.anInt8664, arg0);
	}
}
