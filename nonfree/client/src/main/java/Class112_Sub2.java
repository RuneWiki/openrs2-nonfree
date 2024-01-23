import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class112_Sub2 extends Class112 {

	@OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
	private int anInt5586;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!we;I)V")
	public Class112_Sub2(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1) {
		Static285.anInterface5_1 = arg0.method4608();
		this.anInt5586 = arg1;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "()I")
	@Override
	protected int method4449() {
		return Static285.anInterface5_1.method4375(this.anInt5586);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4448(@OriginalArg(0) Component arg0) throws Exception {
		Static285.anInterface5_1.method4378(arg0, Static75.anInt1523, Static155.aBoolean207);
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "()V")
	@Override
	protected void method4460() {
		Static285.anInterface5_1.method4377(this.anInt5586);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	@Override
	public void method4457(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static285.anInterface5_1.method4379(this.anInt5586, arg0);
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "()V")
	@Override
	protected void method4451() {
		Static285.anInterface5_1.method4374(this.anInt5586);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "()V")
	@Override
	protected void method4450() {
		Static285.anInterface5_1.method4376(this.anInt5586, this.anIntArray448);
	}
}
