import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
	private final int anInt472;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!oc;I)V")
	public Class10_Sub1(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1) {
		Static15.anInterface2_1 = arg0.method1535();
		this.anInt472 = arg1;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
	@Override
	public void method1294(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static15.anInterface2_1.method1628(arg0, this.anInt472);
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "()V")
	@Override
	protected void method1302() {
		Static15.anInterface2_1.method1631(this.anInt472, super.anIntArray291);
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "()V")
	@Override
	protected void method1304() {
		Static15.anInterface2_1.method1632(this.anInt472);
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "()V")
	@Override
	protected void method1293() {
		Static15.anInterface2_1.method1629(this.anInt472);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1298(@OriginalArg(0) Component arg0) throws Exception {
		Static15.anInterface2_1.method1627(arg0, Static45.anInt2755, Static69.aBoolean49);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "()I")
	@Override
	protected int method1292() {
		return Static15.anInterface2_1.method1630(this.anInt472);
	}
}
