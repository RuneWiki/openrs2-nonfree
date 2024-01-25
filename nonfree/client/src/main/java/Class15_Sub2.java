import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!hp", name = "K", descriptor = "I")
	private final int anInt3856;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!pq;I)V")
	public Class15_Sub2(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1) {
		Static185.anInterface4_1 = arg0.method6081();
		this.anInt3856 = arg1;
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V")
	@Override
	public void method3562(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static185.anInterface4_1.method1516(arg0, this.anInt3856);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3556(@OriginalArg(0) Component arg0) throws Exception {
		Static185.anInterface4_1.method1514(Static121.aBoolean214, Static411.anInt9206, arg0);
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "()I")
	@Override
	protected int method3558() {
		return Static185.anInterface4_1.method1519(this.anInt3856);
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "()V")
	@Override
	protected void method3564() {
		Static185.anInterface4_1.method1518(this.anInt3856, super.anIntArray297);
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "()V")
	@Override
	protected void method3567() {
		Static185.anInterface4_1.method1515(this.anInt3856);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "()V")
	@Override
	protected void method3553() {
		Static185.anInterface4_1.method1517(this.anInt3856);
	}
}
