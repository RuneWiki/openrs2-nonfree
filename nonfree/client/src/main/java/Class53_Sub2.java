import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class53_Sub2 extends Class53 {

	@OriginalMember(owner = "client!uq", name = "O", descriptor = "I")
	private final int anInt7017;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!pc;I)V")
	public Class53_Sub2(@OriginalArg(0) Class196 arg0, @OriginalArg(1) int arg1) {
		Static415.anInterface2_2 = arg0.method3898();
		this.anInt7017 = arg1;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "()V")
	@Override
	protected void method5626() {
		Static415.anInterface2_2.method1509(this.anInt7017);
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "()I")
	@Override
	protected int method5629() {
		return Static415.anInterface2_2.method1508(this.anInt7017);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5635(@OriginalArg(0) Component arg0) throws Exception {
		Static415.anInterface2_2.method1507(Static145.anInt2577, Static391.aBoolean443, arg0);
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
	@Override
	public void method5624(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static415.anInterface2_2.method1506(this.anInt7017, arg0);
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "()V")
	@Override
	protected void method5627() {
		Static415.anInterface2_2.method1510(this.anInt7017);
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "()V")
	@Override
	protected void method5631() {
		Static415.anInterface2_2.method1505(this.anInt7017, super.anIntArray528);
	}
}
