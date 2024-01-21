import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
	private final int anInt90;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!cf;I)V")
	public Class3_Sub1(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1) {
		Static4.anInterface2_1 = arg0.method191();
		this.anInt90 = arg1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "()V")
	@Override
	protected void method1517() {
		Static4.anInterface2_1.method931(this.anInt90);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1531(@OriginalArg(0) Component arg0) throws Exception {
		Static4.anInterface2_1.method935(arg0, Static106.anInt2355, Static72.aBoolean117);
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "()V")
	@Override
	protected void method1528() {
		Static4.anInterface2_1.method930(this.anInt90, super.anIntArray309);
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "()V")
	@Override
	protected void method1529() {
		Static4.anInterface2_1.method932(this.anInt90);
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	@Override
	public void method1527(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static4.anInterface2_1.method933(this.anInt90, arg0);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "()I")
	@Override
	protected int method1525() {
		return Static4.anInterface2_1.method934(this.anInt90);
	}
}
