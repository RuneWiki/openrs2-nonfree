import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class101_Sub2 extends Class101 {

	@OriginalMember(owner = "client!me", name = "N", descriptor = "I")
	private int anInt3491;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!nf;I)V")
	public Class101_Sub2(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1) {
		Static166.anInterface3_1 = arg0.method2999();
		this.anInt3491 = arg1;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	@Override
	public void method2804(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static166.anInterface3_1.method1444(this.anInt3491, arg0);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "()V")
	@Override
	protected void method2802() {
		Static166.anInterface3_1.method1445(this.anInt3491, this.anIntArray278);
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "()I")
	@Override
	protected int method2808() {
		return Static166.anInterface3_1.method1443(this.anInt3491);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "()V")
	@Override
	protected void method2800() {
		Static166.anInterface3_1.method1447(this.anInt3491);
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "()V")
	@Override
	protected void method2805() {
		Static166.anInterface3_1.method1446(this.anInt3491);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2796(@OriginalArg(0) Component arg0) throws Exception {
		Static166.anInterface3_1.method1442(Static64.aBoolean221, Static152.anInt3130, arg0);
	}
}
