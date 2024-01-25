import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
	private final int anInt6854;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!wv;I)V")
	public Class15_Sub2(@OriginalArg(0) Class366 arg0, @OriginalArg(1) int arg1) {
		Static354.anInterface10_1 = (Interface10) arg0.method8275();
		this.anInt6854 = arg1;
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "()V")
	@Override
	protected void method5352() {
		Static354.anInterface10_1.method7706(this.anInt6854);
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "()V")
	@Override
	protected void method5344() {
		Static354.anInterface10_1.method7708(this.anInt6854);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "()V")
	@Override
	protected void method5342() {
		Static354.anInterface10_1.method7707(this.anInt6854, super.anIntArray387);
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "()I")
	@Override
	protected int method5347() {
		return Static354.anInterface10_1.method7705(this.anInt6854);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5350(@OriginalArg(0) Component arg0) throws Exception {
		Static354.anInterface10_1.method7704(arg0, Static455.aBoolean611, Static544.anInt9957);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
	@Override
	public void method5343(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static354.anInterface10_1.method7709(this.anInt6854, arg0);
	}
}
