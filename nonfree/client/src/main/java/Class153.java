import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class153 {

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
	public int anInt4401;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	public int anInt4402;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public int anInt4403;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	private int anInt4404;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	public int anInt4405;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "J")
	public long aLong117;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	public int anInt4409;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
	public int anInt4410;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	public int anInt4411;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
	public int anInt4412;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
	public int anInt4413;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "Z")
	private boolean aBoolean327 = false;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	public int anInt4408 = 0;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	public int anInt4398 = 0;

	static {
		new Class242("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!tl;I)V")
	private void method3321(@OriginalArg(1) Class4_Sub30 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4404 = arg0.method4877();
		} else if (arg1 == 2) {
			arg0.method4864();
		} else if (arg1 == 3) {
			this.anInt4403 = arg0.method4872();
			this.anInt4409 = arg0.method4872();
			this.anInt4413 = arg0.method4872();
		} else if (arg1 == 4) {
			this.anInt4410 = arg0.method4864();
			this.anInt4411 = arg0.method4872();
		} else if (arg1 == 6) {
			this.anInt4405 = arg0.method4864();
		} else if (arg1 == 8) {
			this.anInt4398 = 1;
		} else if (arg1 == 9) {
			this.anInt4408 = 1;
		} else if (arg1 == 10) {
			this.aBoolean327 = true;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!tl;)V")
	public void method3323(@OriginalArg(1) Class4_Sub30 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4864();
			if (local13 == 0) {
				return;
			}
			this.method3321(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method3324() {
		this.anInt4401 = Class56.anIntArray120[this.anInt4404 << 3];
		this.anInt4402 = (int) Math.sqrt((double) (this.anInt4403 * this.anInt4403 + this.anInt4409 * this.anInt4409 + this.anInt4413 * this.anInt4413));
		if (this.anInt4411 == 0) {
			this.anInt4411 = 1;
		}
		if (this.anInt4410 == 0) {
			this.aLong117 = 2147483647L;
		} else if (this.anInt4410 == 1) {
			this.aLong117 = this.anInt4402 * 8 / this.anInt4411;
			this.aLong117 *= this.aLong117;
		} else if (this.anInt4410 == 2) {
			this.aLong117 = this.anInt4402 * 8 / this.anInt4411;
		}
		if (this.aBoolean327) {
			this.anInt4402 *= -1;
		}
	}
}
