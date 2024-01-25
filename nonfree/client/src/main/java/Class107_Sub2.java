import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class Class107_Sub2 extends Class107 {

	@OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
	private final int anInt10328;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!kj;I)V")
	public Class107_Sub2(@OriginalArg(0) Class202 arg0, @OriginalArg(1) int arg1) {
		Static659.anInterface22_1 = (Interface22) arg0.method4724();
		this.anInt10328 = arg1;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "()I")
	@Override
	protected int method8600() {
		return Static659.anInterface22_1.method5951(this.anInt10328);
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "()V")
	@Override
	protected void method8612() {
		Static659.anInterface22_1.method5949(this.anInt10328, super.anIntArray599);
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
	@Override
	public void method8603(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static659.anInterface22_1.method5952(this.anInt10328, arg0);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "()V")
	@Override
	protected void method8607() {
		Static659.anInterface22_1.method5953(this.anInt10328);
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "()V")
	@Override
	protected void method8608() {
		Static659.anInterface22_1.method5954(this.anInt10328);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method8609(@OriginalArg(0) Component arg0) throws Exception {
		Static659.anInterface22_1.method5950(Static227.anInt3654, Static135.aBoolean154, arg0);
	}
}
