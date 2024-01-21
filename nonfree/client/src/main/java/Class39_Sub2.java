import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
	private final int anInt2355;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!jb;I)V")
	public Class39_Sub2(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1) {
		Static96.anInterface3_2 = arg0.method979();
		this.anInt2355 = arg1;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "()V")
	@Override
	protected void method1688() {
		Static96.anInterface3_2.method1461(this.anInt2355);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	@Override
	public void method1677(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static96.anInterface3_2.method1463(arg0, this.anInt2355);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()V")
	@Override
	protected void method1676() {
		Static96.anInterface3_2.method1465(this.anInt2355, super.anIntArray234);
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "()I")
	@Override
	protected int method1687() {
		return Static96.anInterface3_2.method1462(this.anInt2355);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1680(@OriginalArg(0) Component arg0) throws Exception {
		Static96.anInterface3_2.method1464(Static31.anInt846, arg0, Static70.aBoolean68);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "()V")
	@Override
	protected void method1681() {
		Static96.anInterface3_2.method1466(this.anInt2355);
	}
}
