import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
	private final int anInt167;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!hf;I)V")
	public Class3_Sub2(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1) {
		Static4.anInterface1_1 = arg0.method1047();
		this.anInt167 = arg1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()V")
	@Override
	protected void method99() {
		Static4.anInterface1_1.method438(this.anInt167);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	@Override
	public void method98(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static4.anInterface1_1.method441(arg0, this.anInt167);
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "()I")
	@Override
	protected int method111() {
		return Static4.anInterface1_1.method443(this.anInt167);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "()V")
	@Override
	protected void method104() {
		Static4.anInterface1_1.method442(this.anInt167, super.anIntArray14);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method103(@OriginalArg(0) Component arg0) throws Exception {
		Static4.anInterface1_1.method440(Static88.anInt1852, arg0, Static29.aBoolean31);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "()V")
	@Override
	protected void method109() {
		Static4.anInterface1_1.method439(this.anInt167);
	}
}
