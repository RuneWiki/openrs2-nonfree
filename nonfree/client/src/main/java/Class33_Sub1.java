import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public final class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!kt", name = "H", descriptor = "I")
	private final int anInt5927;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!cea;I)V")
	public Class33_Sub1(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1) {
		Static346.anInterface27_1 = (Interface27) arg0.method952();
		this.anInt5927 = arg1;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method8238(@OriginalArg(0) Component arg0) throws Exception {
		Static346.anInterface27_1.method8227(arg0, Static103.anInt1658, Static510.aBoolean777);
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "()V")
	@Override
	protected void method8233() {
		Static346.anInterface27_1.method8226(this.anInt5927);
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "()V")
	@Override
	protected void method8240() {
		Static346.anInterface27_1.method8223(this.anInt5927, super.anIntArray542);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "()V")
	@Override
	protected void method8231() {
		Static346.anInterface27_1.method8222(this.anInt5927);
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V")
	@Override
	public void method8237(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static346.anInterface27_1.method8224(this.anInt5927, arg0);
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "()I")
	@Override
	protected int method8235() {
		return Static346.anInterface27_1.method8225(this.anInt5927);
	}
}
