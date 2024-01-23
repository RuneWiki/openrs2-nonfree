import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class103_Sub2 extends Class103 {

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
	private int anInt3600;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!pm;I)V")
	public Class103_Sub2(@OriginalArg(0) Class139 arg0, @OriginalArg(1) int arg1) {
		Static191.anInterface4_1 = arg0.method3511();
		this.anInt3600 = arg1;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	@Override
	public void method3012(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static191.anInterface4_1.method2524(arg0, this.anInt3600);
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "()V")
	@Override
	protected void method3024() {
		Static191.anInterface4_1.method2520(this.anInt3600);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3019(@OriginalArg(0) Component arg0) throws Exception {
		Static191.anInterface4_1.method2522(Static138.aBoolean183, arg0, Static288.anInt5395);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "()I")
	@Override
	protected int method3015() {
		return Static191.anInterface4_1.method2521(this.anInt3600);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "()V")
	@Override
	protected void method3017() {
		Static191.anInterface4_1.method2519(this.anInt3600);
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "()V")
	@Override
	protected void method3018() {
		Static191.anInterface4_1.method2523(this.anInt3600, this.anIntArray393);
	}
}
