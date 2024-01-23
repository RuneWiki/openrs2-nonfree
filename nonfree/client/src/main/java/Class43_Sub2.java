import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
	private int anInt3057;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!la;I)V")
	public Class43_Sub2(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		Static133.anInterface2_1 = arg0.method2870();
		this.anInt3057 = arg1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "()I")
	@Override
	protected int method2442() {
		return Static133.anInterface2_1.method3855(this.anInt3057);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	@Override
	public void method2441(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static133.anInterface2_1.method3858(arg0, this.anInt3057);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2447(@OriginalArg(0) Component arg0) throws Exception {
		Static133.anInterface2_1.method3860(arg0, Static49.aBoolean84, Static107.anInt2456);
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "()V")
	@Override
	protected void method2450() {
		Static133.anInterface2_1.method3859(this.anInt3057);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "()V")
	@Override
	protected void method2446() {
		Static133.anInterface2_1.method3857(this.anInt3057);
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "()V")
	@Override
	protected void method2452() {
		Static133.anInterface2_1.method3856(this.anInt3057, this.anIntArray304);
	}
}
