import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public final class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!sfa", name = "K", descriptor = "I")
	private final int anInt7857;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lclient!cr;I)V")
	public Class45_Sub2(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		Static464.anInterface21_1 = (Interface21) arg0.method932();
		this.anInt7857 = arg1;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6499(@OriginalArg(0) Component arg0) throws Exception {
		Static464.anInterface21_1.method5491(Static570.aBoolean666, arg0, Static508.anInt8600);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "()V")
	@Override
	protected void method6490() {
		Static464.anInterface21_1.method5489(this.anInt7857);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V")
	@Override
	public void method6489(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static464.anInterface21_1.method5487(this.anInt7857, arg0);
	}

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "()I")
	@Override
	protected int method6497() {
		return Static464.anInterface21_1.method5492(this.anInt7857);
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "()V")
	@Override
	protected void method6494() {
		Static464.anInterface21_1.method5488(this.anInt7857, super.anIntArray621);
	}

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "()V")
	@Override
	protected void method6503() {
		Static464.anInterface21_1.method5490(this.anInt7857);
	}
}
