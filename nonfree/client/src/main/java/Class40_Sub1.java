import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
	private int anInt2585;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!gj;I)V")
	public Class40_Sub1(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1) {
		Static115.anInterface1_2 = arg0.method1268();
		this.anInt2585 = arg1;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "()V")
	@Override
	protected void method3704() {
		Static115.anInterface1_2.method2288(this.anInt2585, super.anIntArray744);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3714(@OriginalArg(0) Component arg0) throws Exception {
		Static115.anInterface1_2.method2291(Static161.anInt3727, arg0, Static40.aBoolean26);
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
	@Override
	public void method3706(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static115.anInterface1_2.method2290(arg0, this.anInt2585);
	}

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "()V")
	@Override
	protected void method3718() {
		Static115.anInterface1_2.method2286(this.anInt2585);
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "()I")
	@Override
	protected int method3709() {
		return Static115.anInterface1_2.method2287(this.anInt2585);
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "()V")
	@Override
	protected void method3716() {
		Static115.anInterface1_2.method2289(this.anInt2585);
	}
}
