import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public final class Class119_Sub2 extends Class119 {

	@OriginalMember(owner = "client!t", name = "L", descriptor = "I")
	private final int anInt5534;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!mj;I)V")
	public Class119_Sub2(@OriginalArg(0) Class156 arg0, @OriginalArg(1) int arg1) {
		Static324.anInterface8_2 = arg0.method3660();
		this.anInt5534 = arg1;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	@Override
	protected void method4979() {
		Static324.anInterface8_2.method4413(this.anInt5534);
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "()I")
	@Override
	protected int method4995() {
		return Static324.anInterface8_2.method4411(this.anInt5534);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	@Override
	public void method4978(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static324.anInterface8_2.method4410(this.anInt5534, arg0);
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "()V")
	@Override
	protected void method4984() {
		Static324.anInterface8_2.method4412(this.anInt5534);
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
	@Override
	protected void method4980() {
		Static324.anInterface8_2.method4415(this.anInt5534, super.anIntArray603);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4993(@OriginalArg(0) Component arg0) throws Exception {
		Static324.anInterface8_2.method4414(Static340.aBoolean439, arg0, Static374.anInt6244);
	}
}
