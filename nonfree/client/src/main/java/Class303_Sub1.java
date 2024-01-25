import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public final class Class303_Sub1 extends Class303 {

	@OriginalMember(owner = "client!sfa", name = "L", descriptor = "I")
	private final int anInt8122;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lclient!ii;I)V")
	public Class303_Sub1(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1) {
		Static480.anInterface16_1 = (Interface16) arg0.method3818();
		this.anInt8122 = arg1;
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "()V")
	@Override
	protected void method7981() {
		Static480.anInterface16_1.method4961(this.anInt8122, super.anIntArray722);
	}

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "()I")
	@Override
	protected int method7986() {
		return Static480.anInterface16_1.method4960(this.anInt8122);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7982(@OriginalArg(0) Component arg0) throws Exception {
		Static480.anInterface16_1.method4958(Static379.anInt7010, arg0, Static558.aBoolean667);
	}

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "(I)V")
	@Override
	public void method7985(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static480.anInterface16_1.method4959(arg0, this.anInt8122);
	}

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "()V")
	@Override
	protected void method7984() {
		Static480.anInterface16_1.method4962(this.anInt8122);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "()V")
	@Override
	protected void method7976() {
		Static480.anInterface16_1.method4957(this.anInt8122);
	}
}
