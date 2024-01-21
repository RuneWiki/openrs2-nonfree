import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
	private final int anInt2309;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!vf;I)V")
	public Class12_Sub2(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1) {
		Static84.anInterface3_1 = arg0.method2043();
		this.anInt2309 = arg1;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	@Override
	public void method1513(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static84.anInterface3_1.method1934(this.anInt2309, arg0);
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "()V")
	@Override
	protected void method1525() {
		Static84.anInterface3_1.method1937(this.anInt2309);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1516(@OriginalArg(0) Component arg0) throws Exception {
		Static84.anInterface3_1.method1938(Static37.aBoolean28, arg0, Static78.anInt1981);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "()V")
	@Override
	protected void method1522() {
		Static84.anInterface3_1.method1936(this.anInt2309);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
	@Override
	protected void method1519() {
		Static84.anInterface3_1.method1933(this.anInt2309, super.anIntArray290);
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "()I")
	@Override
	protected int method1524() {
		return Static84.anInterface3_1.method1935(this.anInt2309);
	}
}
