import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public abstract class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
	public final int anInt9382;

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
	protected int anInt9380;

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
	protected int anInt9383;

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
	protected final int anInt9386;

	static {
		new Class67("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(IIII)V")
	protected Class6_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9382 = arg3;
		this.anInt9380 = arg2;
		this.anInt9383 = arg0;
		this.anInt9386 = arg1;
	}
}
