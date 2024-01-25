import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public final class Class89_Sub2 extends Class89 {

	@OriginalMember(owner = "client!it", name = "H", descriptor = "I")
	private final int anInt4953;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!rp;I)V")
	public Class89_Sub2(@OriginalArg(0) Class298 arg0, @OriginalArg(1) int arg1) {
		Static251.anInterface24_1 = (Interface24) arg0.method7278();
		this.anInt4953 = arg1;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "()V")
	@Override
	protected void method4210() {
		Static251.anInterface24_1.method5171(this.anInt4953, super.anIntArray272);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
	@Override
	public void method4211(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static251.anInterface24_1.method5169(this.anInt4953, arg0);
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "()V")
	@Override
	protected void method4212() {
		Static251.anInterface24_1.method5173(this.anInt4953);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4217(@OriginalArg(0) Component arg0) throws Exception {
		Static251.anInterface24_1.method5170(Static168.anInt3272, arg0, Static411.aBoolean570);
	}

	@OriginalMember(owner = "client!it", name = "d", descriptor = "()I")
	@Override
	protected int method4219() {
		return Static251.anInterface24_1.method5172(this.anInt4953);
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "()V")
	@Override
	protected void method4215() {
		Static251.anInterface24_1.method5168(this.anInt4953);
	}
}
