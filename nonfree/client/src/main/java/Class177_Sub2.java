import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public final class Class177_Sub2 extends Class177 {

	@OriginalMember(owner = "client!vea", name = "I", descriptor = "I")
	private final int anInt9175;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lclient!ft;I)V")
	public Class177_Sub2(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1) {
		Static552.anInterface9_1 = (Interface9) arg0.method2180();
		this.anInt9175 = arg1;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "()V")
	@Override
	protected void method7503() {
		Static552.anInterface9_1.method5659(this.anInt9175);
	}

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "()V")
	@Override
	protected void method7512() {
		Static552.anInterface9_1.method5657(this.anInt9175);
	}

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "()V")
	@Override
	protected void method7510() {
		Static552.anInterface9_1.method5660(this.anInt9175, super.anIntArray691);
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "()I")
	@Override
	protected int method7505() {
		return Static552.anInterface9_1.method5655(this.anInt9175);
	}

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)V")
	@Override
	public void method7517(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static552.anInterface9_1.method5658(arg0, this.anInt9175);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7513(@OriginalArg(0) Component arg0) throws Exception {
		Static552.anInterface9_1.method5656(arg0, Class1_Sub30_Sub1.lb, Static19.aBoolean22);
	}
}
