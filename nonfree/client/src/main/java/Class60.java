import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class Class60 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
	public final int anInt4585;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
	public final int anInt4587;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
	protected final int anInt4584;

	static {
		new Class55("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(III)V")
	protected Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4585 = arg1;
		this.anInt4587 = arg0;
		this.anInt4584 = arg2;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	public abstract void method3640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(III)V")
	public abstract void method3642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(III)V")
	public abstract void method3643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
