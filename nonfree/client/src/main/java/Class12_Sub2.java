import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
	private final int anInt3700;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!qd;I)V")
	public Class12_Sub2(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1) {
		Static166.anInterface1_2 = arg0.method2192();
		this.anInt3700 = arg1;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "()V")
	@Override
	protected void method2663() {
		Static166.anInterface1_2.method496(this.anInt3700, super.anIntArray418);
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "()V")
	@Override
	protected void method2664() {
		Static166.anInterface1_2.method493(this.anInt3700);
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "()V")
	@Override
	protected void method2668() {
		Static166.anInterface1_2.method495(this.anInt3700);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()I")
	@Override
	protected int method2662() {
		return Static166.anInterface1_2.method494(this.anInt3700);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2656(@OriginalArg(0) Component arg0) throws Exception {
		Static166.anInterface1_2.method492(arg0, Static149.anInt3584, Static3.aBoolean5);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	@Override
	public void method2658(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static166.anInterface1_2.method491(arg0, this.anInt3700);
	}
}
