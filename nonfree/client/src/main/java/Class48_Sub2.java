import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class48_Sub2 extends Class48 {

	@OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
	private final int anInt1957;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!gt;I)V")
	public Class48_Sub2(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		Static88.anInterface5_1 = arg0.method2350();
		this.anInt1957 = arg1;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "()I")
	@Override
	protected int method1824() {
		return Static88.anInterface5_1.method3072(this.anInt1957);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1829(@OriginalArg(0) Component arg0) throws Exception {
		Static88.anInterface5_1.method3068(Static14.anInt4962, arg0, Static100.aBoolean156);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "()V")
	@Override
	protected void method1823() {
		Static88.anInterface5_1.method3071(this.anInt1957);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	@Override
	public void method1835(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static88.anInterface5_1.method3070(this.anInt1957, arg0);
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "()V")
	@Override
	protected void method1831() {
		Static88.anInterface5_1.method3069(this.anInt1957, super.anIntArray150);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "()V")
	@Override
	protected void method1822() {
		Static88.anInterface5_1.method3073(this.anInt1957);
	}
}
