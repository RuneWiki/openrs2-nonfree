import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
	private final int anInt3183;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!bi;I)V")
	public Class9_Sub1(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1) {
		Static156.anInterface3_2 = arg0.method301();
		this.anInt3183 = arg1;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "()I")
	@Override
	protected int method2936() {
		return Static156.anInterface3_2.method2362(this.anInt3183);
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "()V")
	@Override
	protected void method2939() {
		Static156.anInterface3_2.method2360(this.anInt3183);
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "()V")
	@Override
	protected void method2938() {
		Static156.anInterface3_2.method2363(this.anInt3183);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()V")
	@Override
	protected void method2935() {
		Static156.anInterface3_2.method2361(this.anInt3183, super.anIntArray408);
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	@Override
	public void method2942(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static156.anInterface3_2.method2358(arg0, this.anInt3183);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2937(@OriginalArg(0) Component arg0) throws Exception {
		Static156.anInterface3_2.method2359(Static30.aBoolean37, arg0, Static62.anInt1362);
	}
}
