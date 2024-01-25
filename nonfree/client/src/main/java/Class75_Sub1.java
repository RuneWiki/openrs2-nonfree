import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Class75_Sub1 extends Class75 {

	@OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
	private final int anInt5712;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!hu;I)V")
	public Class75_Sub1(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1) {
		Static318.anInterface8_2 = arg0.method2345();
		this.anInt5712 = arg1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()V")
	@Override
	protected void method5347() {
		Static318.anInterface8_2.method1996(this.anInt5712);
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "()I")
	@Override
	protected int method5361() {
		return Static318.anInterface8_2.method1997(this.anInt5712);
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "()V")
	@Override
	protected void method5364() {
		Static318.anInterface8_2.method1994(this.anInt5712);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	@Override
	public void method5353(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static318.anInterface8_2.method1992(this.anInt5712, arg0);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5352(@OriginalArg(0) Component arg0) throws Exception {
		Static318.anInterface8_2.method1993(Static410.anInt6810, arg0, Static394.aBoolean454);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "()V")
	@Override
	protected void method5351() {
		Static318.anInterface8_2.method1995(this.anInt5712, super.anIntArray615);
	}
}
