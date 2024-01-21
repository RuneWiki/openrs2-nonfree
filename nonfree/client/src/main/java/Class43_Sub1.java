import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!o", name = "X", descriptor = "I")
	private final int anInt2285;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lclient!vb;I)V")
	public Class43_Sub1(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		Static83.anInterface1_1 = arg0.method2179();
		this.anInt2285 = arg1;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1916(@OriginalArg(0) Component arg0) throws Exception {
		Static83.anInterface1_1.method494(Static110.anInt2948, Static31.aBoolean156, arg0);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "()V")
	@Override
	protected void method1910() {
		Static83.anInterface1_1.method492(this.anInt2285);
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
	@Override
	public void method1923(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static83.anInterface1_1.method493(this.anInt2285, arg0);
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "()V")
	@Override
	protected void method1925() {
		Static83.anInterface1_1.method496(this.anInt2285, super.anIntArray337);
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "()I")
	@Override
	protected int method1919() {
		return Static83.anInterface1_1.method495(this.anInt2285);
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "()V")
	@Override
	protected void method1920() {
		Static83.anInterface1_1.method491(this.anInt2285);
	}
}
