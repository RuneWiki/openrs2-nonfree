import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public final class Class80_Sub1 extends Class80 {

	@OriginalMember(owner = "client!eaa", name = "I", descriptor = "I")
	private final int anInt2976;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!gh;I)V")
	public Class80_Sub1(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1) {
		Static113.anInterface22_1 = (Interface22) arg0.method3406();
		this.anInt2976 = arg1;
	}

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)V")
	@Override
	public void method3200(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static113.anInterface22_1.method2194(arg0, this.anInt2976);
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "()I")
	@Override
	protected int method3197() {
		return Static113.anInterface22_1.method2193(this.anInt2976);
	}

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "()V")
	@Override
	protected void method3204() {
		Static113.anInterface22_1.method2196(this.anInt2976, super.anIntArray210);
	}

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "()V")
	@Override
	protected void method3203() {
		Static113.anInterface22_1.method2195(this.anInt2976);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3199(@OriginalArg(0) Component arg0) throws Exception {
		Static113.anInterface22_1.method2197(Static345.anInt6689, arg0, Static343.aBoolean463);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "()V")
	@Override
	protected void method3190() {
		Static113.anInterface22_1.method2192(this.anInt2976);
	}
}
