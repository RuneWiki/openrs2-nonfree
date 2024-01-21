import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
	private final int anInt1479;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!ue;I)V")
	public Class29_Sub1(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1) {
		Static46.anInterface2_1 = arg0.method1876();
		this.anInt1479 = arg1;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "()V")
	@Override
	protected void method1273() {
		Static46.anInterface2_1.method1144(this.anInt1479);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "()V")
	@Override
	protected void method1265() {
		Static46.anInterface2_1.method1143(this.anInt1479);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1268(@OriginalArg(0) Component arg0) throws Exception {
		Static46.anInterface2_1.method1145(Static35.anInt1167, arg0, Static36.aBoolean74);
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
	@Override
	public void method1279(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static46.anInterface2_1.method1146(arg0, this.anInt1479);
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "()I")
	@Override
	protected int method1277() {
		return Static46.anInterface2_1.method1148(this.anInt1479);
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "()V")
	@Override
	protected void method1269() {
		Static46.anInterface2_1.method1147(this.anInt1479, super.anIntArray279);
	}
}
