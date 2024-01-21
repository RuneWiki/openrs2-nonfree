import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
	private final int anInt1512;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!dd;I)V")
	public Class22_Sub2(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		Static52.anInterface3_2 = arg0.method484();
		this.anInt1512 = arg1;
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "()I")
	@Override
	protected int method939() {
		return Static52.anInterface3_2.method1685(this.anInt1512);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
	@Override
	protected void method926() {
		Static52.anInterface3_2.method1681(this.anInt1512);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
	@Override
	public void method929(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static52.anInterface3_2.method1684(this.anInt1512, arg0);
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "()V")
	@Override
	protected void method930() {
		Static52.anInterface3_2.method1686(this.anInt1512);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method933(@OriginalArg(0) Component arg0) throws Exception {
		Static52.anInterface3_2.method1683(Static121.aBoolean163, Static12.anInt553, arg0);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "()V")
	@Override
	protected void method927() {
		Static52.anInterface3_2.method1682(this.anInt1512, super.anIntArray156);
	}
}
