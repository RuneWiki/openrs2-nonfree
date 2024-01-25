import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public abstract class Class61 {

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
	public static final int[] anIntArray237;

	static {
		new Class93("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
		anIntArray237 = new int[32];
		@Pc(10) int local10 = 2;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			anIntArray237[local12] = local10 - 1;
			local10 += local10;
		}
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	protected Class61() {
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public abstract void method2652();

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)Z")
	protected abstract boolean method2653();

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)Z")
	protected abstract boolean method2655();

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)I")
	public abstract int method2658();

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)I")
	public abstract int method2659();

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)Z")
	public abstract boolean method2660();

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)Z")
	public final boolean method2662() {
		return this.method2660() || this.method2653() || this.method2655();
	}

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "(I)Lclient!ka;")
	public abstract Class2_Sub16 method2663();

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "(I)V")
	public abstract void method2664();
}
