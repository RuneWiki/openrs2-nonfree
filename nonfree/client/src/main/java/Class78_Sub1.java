import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!fr", name = "M", descriptor = "I")
	private final int anInt1737;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!ko;I)V")
	public Class78_Sub1(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1) {
		Static95.anInterface3_1 = arg0.method2716();
		this.anInt1737 = arg1;
	}

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "()V")
	@Override
	protected void method5515() {
		Static95.anInterface3_1.method2308(this.anInt1737);
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
	@Override
	public void method5517(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static95.anInterface3_1.method2311(this.anInt1737, arg0);
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "()I")
	@Override
	protected int method5512() {
		return Static95.anInterface3_1.method2313(this.anInt1737);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "()V")
	@Override
	protected void method5503() {
		Static95.anInterface3_1.method2310(this.anInt1737);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5508(@OriginalArg(0) Component arg0) throws Exception {
		Static95.anInterface3_1.method2312(Static178.aBoolean224, arg0, Static352.anInt6698);
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "()V")
	@Override
	protected void method5504() {
		Static95.anInterface3_1.method2309(this.anInt1737, super.anIntArray535);
	}
}
