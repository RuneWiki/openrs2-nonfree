import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class Class85 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "Z")
	public boolean aBoolean164;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "Z")
	protected boolean aBoolean169;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "Z")
	protected boolean aBoolean175;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "Z")
	public boolean aBoolean166 = false;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
	public int anInt2481 = 127;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Z")
	public boolean aBoolean167 = false;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "Z")
	public boolean aBoolean165 = true;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
	public int anInt2483 = 2;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "Z")
	public boolean aBoolean170 = true;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
	protected int anInt2485 = 2;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "Z")
	public boolean aBoolean172 = true;

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "Z")
	public boolean aBoolean173 = true;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
	public int anInt2486 = 0;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "Z")
	public boolean aBoolean174 = true;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
	public int anInt2484 = 2;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "Z")
	public boolean aBoolean168 = true;

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
	public int anInt2487 = 127;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
	public int anInt2493 = 0;

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
	public int anInt2491 = 3;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
	public int anInt2488 = 0;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
	public int anInt2489 = 1;

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "Z")
	public boolean aBoolean171 = true;

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "Z")
	public boolean aBoolean178 = true;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
	public int anInt2482 = 0;

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Z")
	public boolean aBoolean176 = true;

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
	protected int anInt2495 = 0;

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "Z")
	public boolean aBoolean179 = true;

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "Z")
	protected boolean aBoolean177 = true;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
	public int anInt2480 = 0;

	@OriginalMember(owner = "client!tg", name = "G", descriptor = "Z")
	public boolean aBoolean180 = true;

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
	public int anInt2496 = 255;

	@OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
	public int anInt2500 = 0;

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
	public int anInt2494 = 2;

	@OriginalMember(owner = "client!tg", name = "N", descriptor = "Z")
	public boolean aBoolean181 = false;

	static {
		new Class182("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	protected Class85() {
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Z")
	public final boolean method2105(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean169 : this.aBoolean175;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)I")
	public final int method2106(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt2485 : this.anInt2495;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZI)V")
	public final void method2107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.anInt2485 = arg1;
		} else {
			this.anInt2495 = arg1;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZII)V")
	public final void method2108(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.aBoolean169 = arg0;
		} else {
			this.aBoolean175 = arg0;
		}
	}
}
