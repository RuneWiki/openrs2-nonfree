import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
	protected int anInt5818;

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
	protected final int anInt5817;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
	protected int anInt5822;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
	public final int anInt5820;

	static {
		new Class151("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(IIII)V")
	protected Class20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5818 = arg2;
		this.anInt5817 = arg1;
		this.anInt5822 = arg0;
		this.anInt5820 = arg3;
	}
}
