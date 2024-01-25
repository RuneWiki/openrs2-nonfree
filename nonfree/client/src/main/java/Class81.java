import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class81 {

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
	private int anInt2607;

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
	private int anInt2602;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
	private int anInt2601;

	@OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
	private int anInt2609;

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
	private int anInt2604;

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "I")
	private int anInt2610;

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
	private int anInt2606;

	@OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
	private int anInt2612;

	@OriginalMember(owner = "client!ew", name = "n", descriptor = "I")
	private int anInt2613;

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
	private int anInt2608;

	static {
		new Class67("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt2607 = arg3 * arg3;
		this.anInt2602 = arg1;
		this.anInt2601 = arg0;
		this.anInt2609 = arg2;
		this.anInt2604 = this.anInt2602 + arg7;
		this.anInt2610 = this.anInt2601 + arg4;
		this.anInt2606 = arg5 + this.anInt2601;
		this.anInt2612 = arg9 + this.anInt2609;
		this.anInt2613 = arg8 + this.anInt2609;
		this.anInt2608 = arg6 + this.anInt2602;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIIIIIIIIBI)V")
	public void method2217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		this.anInt2601 = arg7;
		this.anInt2609 = arg2;
		this.anInt2602 = arg3;
		this.anInt2607 = arg4 * arg4;
		this.anInt2610 = this.anInt2601 + arg5;
		this.anInt2608 = arg6 + this.anInt2602;
		this.anInt2606 = this.anInt2601 + arg9;
		this.anInt2613 = arg8 + this.anInt2609;
		this.anInt2612 = this.anInt2609 + arg0;
		this.anInt2604 = this.anInt2602 + arg1;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIBI)Z")
	public boolean method2218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt2610 > arg0 || this.anInt2606 < arg0) {
			return false;
		} else if (this.anInt2608 > arg2 || arg2 > this.anInt2604) {
			return false;
		} else if (arg1 >= this.anInt2613 && arg1 <= this.anInt2612) {
			@Pc(66) int local66 = arg0 - this.anInt2601;
			@Pc(72) int local72 = arg1 - this.anInt2609;
			return local66 * local66 + local72 * local72 < this.anInt2607;
		} else {
			return false;
		}
	}
}
