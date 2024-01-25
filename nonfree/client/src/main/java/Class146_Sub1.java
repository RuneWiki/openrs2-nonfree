import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class146_Sub1 extends Class146 {

	@OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
	private final int anInt3947;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!ae;I)V")
	public Class146_Sub1(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1) {
		Static210.anInterface14_2 = arg0.method298();
		this.anInt3947 = arg1;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5762(@OriginalArg(0) Component arg0) throws Exception {
		Static210.anInterface14_2.method6466(Static527.anInt8915, Static543.aBoolean438, arg0);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "()V")
	@Override
	protected void method5754() {
		Static210.anInterface14_2.method6464(this.anInt3947);
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "()V")
	@Override
	protected void method5759() {
		Static210.anInterface14_2.method6461(this.anInt3947);
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "()V")
	@Override
	protected void method5766() {
		Static210.anInterface14_2.method6463(this.anInt3947, super.anIntArray555);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	@Override
	public void method5755(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static210.anInterface14_2.method6462(arg0, this.anInt3947);
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "()I")
	@Override
	protected int method5764() {
		return Static210.anInterface14_2.method6465(this.anInt3947);
	}
}
