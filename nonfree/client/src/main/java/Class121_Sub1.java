import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public final class Class121_Sub1 extends Class121 {

	@OriginalMember(owner = "client!no", name = "J", descriptor = "I")
	private int anInt3721;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!uo;I)V")
	public Class121_Sub1(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1) {
		Static191.anInterface2_1 = arg0.method4374();
		this.anInt3721 = arg1;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "()V")
	@Override
	protected void method3573() {
		Static191.anInterface2_1.method1617(this.anInt3721);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3577(@OriginalArg(0) Component arg0) throws Exception {
		Static191.anInterface2_1.method1616(arg0, Static69.anInt1498, Static292.aBoolean497);
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "()I")
	@Override
	protected int method3582() {
		return Static191.anInterface2_1.method1618(this.anInt3721);
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "()V")
	@Override
	protected void method3574() {
		Static191.anInterface2_1.method1619(this.anInt3721);
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V")
	@Override
	public void method3578(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static191.anInterface2_1.method1621(arg0, this.anInt3721);
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "()V")
	@Override
	protected void method3587() {
		Static191.anInterface2_1.method1620(this.anInt3721, this.anIntArray462);
	}
}
