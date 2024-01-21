import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!qe", name = "Mb", descriptor = "I")
	private final int anInt2653;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!ba;I)V")
	public Class10_Sub2(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1) {
		Static95.anInterface3_2 = arg0.method144();
		this.anInt2653 = arg1;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()V")
	@Override
	protected void method1712() {
		Static95.anInterface3_2.method1422(this.anInt2653);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
	@Override
	public void method1719(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static95.anInterface3_2.method1423(arg0, this.anInt2653);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1714(@OriginalArg(0) Component arg0) throws Exception {
		Static95.anInterface3_2.method1425(Static73.anInt2059, arg0, Static52.aBoolean78);
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "()V")
	@Override
	protected void method1724() {
		Static95.anInterface3_2.method1421(this.anInt2653, super.anIntArray287);
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "()V")
	@Override
	protected void method1722() {
		Static95.anInterface3_2.method1420(this.anInt2653);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "()I")
	@Override
	protected int method1713() {
		return Static95.anInterface3_2.method1424(this.anInt2653);
	}
}
