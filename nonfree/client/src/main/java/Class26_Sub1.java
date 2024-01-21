import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
	private final int anInt899;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!fe;I)V")
	public Class26_Sub1(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		Static34.anInterface3_1 = arg0.method599();
		this.anInt899 = arg1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	@Override
	public void method1797(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static34.anInterface3_1.method2216(arg0, this.anInt899);
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "()V")
	@Override
	protected void method1806() {
		Static34.anInterface3_1.method2215(this.anInt899, super.anIntArray278);
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "()V")
	@Override
	protected void method1804() {
		Static34.anInterface3_1.method2217(this.anInt899);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1808(@OriginalArg(0) Component arg0) throws Exception {
		Static34.anInterface3_1.method2214(Static7.aBoolean9, arg0, Static123.anInt3048);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()I")
	@Override
	protected int method1795() {
		return Static34.anInterface3_1.method2213(this.anInt899);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "()V")
	@Override
	protected void method1796() {
		Static34.anInterface3_1.method2218(this.anInt899);
	}
}
