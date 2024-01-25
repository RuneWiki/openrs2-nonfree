import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class110_Sub2 extends Class110 {

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
	private final int anInt5920;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!kj;I)V")
	public Class110_Sub2(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		Static338.anInterface10_2 = arg0.method3212();
		this.anInt5920 = arg1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	@Override
	public void method4775(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static338.anInterface10_2.method4486(this.anInt5920, arg0);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4784(@OriginalArg(0) Component arg0) throws Exception {
		Static338.anInterface10_2.method4481(Static78.anInt1548, arg0, Static93.aBoolean97);
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "()V")
	@Override
	protected void method4781() {
		Static338.anInterface10_2.method4485(this.anInt5920);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "()V")
	@Override
	protected void method4779() {
		Static338.anInterface10_2.method4482(this.anInt5920);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "()V")
	@Override
	protected void method4774() {
		Static338.anInterface10_2.method4483(this.anInt5920, super.anIntArray467);
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "()I")
	@Override
	protected int method4783() {
		return Static338.anInterface10_2.method4484(this.anInt5920);
	}
}
