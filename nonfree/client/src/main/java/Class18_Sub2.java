import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class18_Sub2 extends Class18 {

	@OriginalMember(owner = "client!vt", name = "M", descriptor = "I")
	private final int anInt7149;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!dr;I)V")
	public Class18_Sub2(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1) {
		Static431.anInterface5_2 = arg0.method1366();
		this.anInt7149 = arg1;
	}

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)V")
	@Override
	public void method5643(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static431.anInterface5_2.method2532(this.anInt7149, arg0);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "()I")
	@Override
	protected int method5629() {
		return Static431.anInterface5_2.method2528(this.anInt7149);
	}

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "()V")
	@Override
	protected void method5641() {
		Static431.anInterface5_2.method2530(this.anInt7149);
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "()V")
	@Override
	protected void method5640() {
		Static431.anInterface5_2.method2529(this.anInt7149);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5632(@OriginalArg(0) Component arg0) throws Exception {
		Static431.anInterface5_2.method2531(arg0, Static314.aBoolean392, Static410.anInt6842);
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "()V")
	@Override
	protected void method5635() {
		Static431.anInterface5_2.method2527(this.anInt7149, super.anIntArray601);
	}
}
