import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class66_Sub2 extends Class66 {

	@OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
	private final int anInt6862;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!od;I)V")
	public Class66_Sub2(@OriginalArg(0) Class180 arg0, @OriginalArg(1) int arg1) {
		Static424.anInterface3_2 = arg0.method4099();
		this.anInt6862 = arg1;
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "()I")
	@Override
	protected int method5635() {
		return Static424.anInterface3_2.method1883(this.anInt6862);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5633(@OriginalArg(0) Component arg0) throws Exception {
		Static424.anInterface3_2.method1881(Static247.anInt7108, Static222.aBoolean288, arg0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	@Override
	public void method5620(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static424.anInterface3_2.method1885(this.anInt6862, arg0);
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "()V")
	@Override
	protected void method5625() {
		Static424.anInterface3_2.method1886(this.anInt6862);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "()V")
	@Override
	protected void method5622() {
		Static424.anInterface3_2.method1884(this.anInt6862, super.anIntArray615);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "()V")
	@Override
	protected void method5621() {
		Static424.anInterface3_2.method1882(this.anInt6862);
	}
}
