import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Class183_Sub1 extends Class183 {

	@OriginalMember(owner = "client!vr", name = "K", descriptor = "I")
	private final int anInt8740;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!gaa;I)V")
	public Class183_Sub1(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		Static519.anInterface4_2 = arg0.method2401();
		this.anInt8740 = arg1;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "()V")
	@Override
	protected void method7415() {
		Static519.anInterface4_2.method4154(this.anInt8740);
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "()I")
	@Override
	protected int method7418() {
		return Static519.anInterface4_2.method4149(this.anInt8740);
	}

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "()V")
	@Override
	protected void method7429() {
		Static519.anInterface4_2.method4153(this.anInt8740, super.anIntArray835);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
	@Override
	public void method7417(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static519.anInterface4_2.method4152(arg0, this.anInt8740);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7414(@OriginalArg(0) Component arg0) throws Exception {
		Static519.anInterface4_2.method4151(Static477.anInt7971, arg0, Static187.aBoolean231);
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "()V")
	@Override
	protected void method7428() {
		Static519.anInterface4_2.method4150(this.anInt8740);
	}
}
