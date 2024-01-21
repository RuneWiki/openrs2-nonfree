import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class41_Sub2 extends Class41 {

	@OriginalMember(owner = "client!le", name = "M", descriptor = "I")
	private final int anInt2317;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!ih;I)V")
	public Class41_Sub2(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1) {
		Static93.anInterface3_2 = arg0.method1113();
		this.anInt2317 = arg1;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()V")
	@Override
	protected void method1518() {
		Static93.anInterface3_2.method1576(this.anInt2317, super.anIntArray174);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
	@Override
	protected void method1506() {
		Static93.anInterface3_2.method1578(this.anInt2317);
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "()V")
	@Override
	protected void method1523() {
		Static93.anInterface3_2.method1580(this.anInt2317);
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "()I")
	@Override
	protected int method1520() {
		return Static93.anInterface3_2.method1579(this.anInt2317);
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
	@Override
	public void method1517(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static93.anInterface3_2.method1575(this.anInt2317, arg0);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1514(@OriginalArg(0) Component arg0) throws Exception {
		Static93.anInterface3_2.method1577(arg0, Static23.aBoolean20, Static50.anInt1375);
	}
}
