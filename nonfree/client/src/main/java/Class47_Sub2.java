import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class47_Sub2 extends Class47 {

	@OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
	private final int anInt5940;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!ne;I)V")
	public Class47_Sub2(@OriginalArg(0) Class139 arg0, @OriginalArg(1) int arg1) {
		Static305.anInterface6_2 = arg0.method3870();
		this.anInt5940 = arg1;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "()I")
	@Override
	protected int method5319() {
		return Static305.anInterface6_2.method3068(this.anInt5940);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5330(@OriginalArg(0) Component arg0) throws Exception {
		Static305.anInterface6_2.method3072(Static226.anInt4449, arg0, Static188.aBoolean287);
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "()V")
	@Override
	protected void method5334() {
		Static305.anInterface6_2.method3070(this.anInt5940);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "()V")
	@Override
	protected void method5322() {
		Static305.anInterface6_2.method3071(this.anInt5940);
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "()V")
	@Override
	protected void method5329() {
		Static305.anInterface6_2.method3069(this.anInt5940, super.anIntArray576);
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
	@Override
	public void method5332(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static305.anInterface6_2.method3073(arg0, this.anInt5940);
	}
}
