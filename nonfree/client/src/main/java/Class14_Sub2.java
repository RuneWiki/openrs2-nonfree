import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
	private final int anInt6178;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!am;I)V")
	public Class14_Sub2(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1) {
		Static325.anInterface4_2 = arg0.method322();
		this.anInt6178 = arg1;
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "()V")
	@Override
	protected void method5486() {
		Static325.anInterface4_2.method2474(this.anInt6178);
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "()V")
	@Override
	protected void method5485() {
		Static325.anInterface4_2.method2477(this.anInt6178);
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "()V")
	@Override
	protected void method5487() {
		Static325.anInterface4_2.method2475(this.anInt6178, super.anIntArray530);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5475(@OriginalArg(0) Component arg0) throws Exception {
		Static325.anInterface4_2.method2476(Static344.anInt1063, arg0, Static250.aBoolean374);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "()I")
	@Override
	protected int method5476() {
		return Static325.anInterface4_2.method2478(this.anInt6178);
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)V")
	@Override
	public void method5484(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static325.anInterface4_2.method2479(this.anInt6178, arg0);
	}
}
