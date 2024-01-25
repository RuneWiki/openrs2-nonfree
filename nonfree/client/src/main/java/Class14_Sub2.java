import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!ts", name = "K", descriptor = "I")
	private final int anInt5701;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!ng;I)V")
	public Class14_Sub2(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1) {
		Static349.anInterface10_2 = arg0.method3281();
		this.anInt5701 = arg1;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
	@Override
	public void method4895(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static349.anInterface10_2.method4472(this.anInt5701, arg0);
	}

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "()V")
	@Override
	protected void method4890() {
		Static349.anInterface10_2.method4470(this.anInt5701);
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "()I")
	@Override
	protected int method4889() {
		return Static349.anInterface10_2.method4469(this.anInt5701);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4902(@OriginalArg(0) Component arg0) throws Exception {
		Static349.anInterface10_2.method4467(Static250.aBoolean432, arg0, Static212.anInt3652);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "()V")
	@Override
	protected void method4886() {
		Static349.anInterface10_2.method4468(this.anInt5701, super.anIntArray682);
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "()V")
	@Override
	protected void method4887() {
		Static349.anInterface10_2.method4471(this.anInt5701);
	}
}
