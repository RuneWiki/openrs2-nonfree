import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public final class Class104_Sub2 extends Class104 {

	@OriginalMember(owner = "client!ww", name = "N", descriptor = "I")
	private final int anInt9414;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!uf;I)V")
	public Class104_Sub2(@OriginalArg(0) Class283 arg0, @OriginalArg(1) int arg1) {
		Static547.anInterface1_2 = arg0.method7173();
		this.anInt9414 = arg1;
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "()V")
	@Override
	protected void method7811() {
		Static547.anInterface1_2.method562(this.anInt9414);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "()I")
	@Override
	protected int method7808() {
		return Static547.anInterface1_2.method564(this.anInt9414);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7814(@OriginalArg(0) Component arg0) throws Exception {
		Static547.anInterface1_2.method560(Static302.anInt5530, arg0, Static313.aBoolean513);
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "(I)V")
	@Override
	public void method7819(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static547.anInterface1_2.method561(arg0, this.anInt9414);
	}

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "()V")
	@Override
	protected void method7820() {
		Static547.anInterface1_2.method565(this.anInt9414);
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "()V")
	@Override
	protected void method7812() {
		Static547.anInterface1_2.method563(this.anInt9414, super.anIntArray768);
	}
}
