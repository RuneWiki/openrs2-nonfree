import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class88_Sub2 extends Class88 {

	@OriginalMember(owner = "client!im", name = "L", descriptor = "I")
	private final int anInt3038;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!sc;I)V")
	public Class88_Sub2(@OriginalArg(0) Class179 arg0, @OriginalArg(1) int arg1) {
		Static141.anInterface2_1 = arg0.method4883();
		this.anInt3038 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "()I")
	@Override
	protected int method2708() {
		return Static141.anInterface2_1.method1431(this.anInt3038);
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V")
	@Override
	public void method2716(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static141.anInterface2_1.method1436(arg0, this.anInt3038);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2717(@OriginalArg(0) Component arg0) throws Exception {
		Static141.anInterface2_1.method1434(Static226.aBoolean429, arg0, Static36.anInt551);
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "()V")
	@Override
	protected void method2711() {
		Static141.anInterface2_1.method1435(this.anInt3038);
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "()V")
	@Override
	protected void method2710() {
		Static141.anInterface2_1.method1433(this.anInt3038);
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "()V")
	@Override
	protected void method2713() {
		Static141.anInterface2_1.method1432(this.anInt3038, super.anIntArray244);
	}
}
