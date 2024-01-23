import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!la", name = "R", descriptor = "I")
	private int anInt2748;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!jh;I)V")
	public Class24_Sub1(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		Static148.anInterface2_2 = arg0.method1965();
		this.anInt2748 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "()I")
	@Override
	protected int method2456() {
		return Static148.anInterface2_2.method945(this.anInt2748);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2467(@OriginalArg(0) Component arg0) throws Exception {
		Static148.anInterface2_2.method940(Static129.aBoolean297, Static234.anInt4892, arg0);
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "()V")
	@Override
	protected void method2461() {
		Static148.anInterface2_2.method944(this.anInt2748);
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "()V")
	@Override
	protected void method2459() {
		Static148.anInterface2_2.method942(this.anInt2748);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	@Override
	public void method2457(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static148.anInterface2_2.method943(arg0, this.anInt2748);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
	@Override
	protected void method2454() {
		Static148.anInterface2_2.method941(this.anInt2748, this.anIntArray365);
	}
}
