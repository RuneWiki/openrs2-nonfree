import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!be", name = "N", descriptor = "I")
	private int anInt449;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!na;I)V")
	public Class15_Sub1(@OriginalArg(0) Class112 arg0, @OriginalArg(1) int arg1) {
		Static15.anInterface5_1 = arg0.method2886();
		this.anInt449 = arg1;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "()I")
	@Override
	protected int method1247() {
		return Static15.anInterface5_1.method3552(this.anInt449);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	@Override
	public void method1258(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static15.anInterface5_1.method3550(this.anInt449, arg0);
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "()V")
	@Override
	protected void method1255() {
		Static15.anInterface5_1.method3554(this.anInt449);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "()V")
	@Override
	protected void method1254() {
		Static15.anInterface5_1.method3553(this.anInt449, this.anIntArray184);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "()V")
	@Override
	protected void method1244() {
		Static15.anInterface5_1.method3551(this.anInt449);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1250(@OriginalArg(0) Component arg0) throws Exception {
		Static15.anInterface5_1.method3549(Static263.aBoolean329, arg0, Static230.anInt3026);
	}
}
