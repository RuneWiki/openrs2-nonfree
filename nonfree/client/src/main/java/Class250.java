import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class250 {

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
	public int anInt6442;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
	public int anInt6443;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
	public int anInt6444;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
	public int anInt6445;

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
	public int anInt6447;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
	public int anInt6449;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
	public int anInt6451;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
	private int anInt6452;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
	public int anInt6453;

	@OriginalMember(owner = "client!wl", name = "w", descriptor = "J")
	public long aLong239;

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
	public int anInt6458;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "Z")
	private boolean aBoolean502 = false;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
	public int anInt6448 = 0;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
	public int anInt6450 = 0;

	static {
		new Class57("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZLclient!rp;I)V")
	private void method5696(@OriginalArg(1) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6452 = arg0.method2767();
		} else if (arg1 == 2) {
			arg0.method2739();
		} else if (arg1 == 3) {
			this.anInt6447 = arg0.method2726();
			this.anInt6458 = arg0.method2726();
			this.anInt6449 = arg0.method2726();
		} else if (arg1 == 4) {
			this.anInt6444 = arg0.method2739();
			this.anInt6443 = arg0.method2726();
		} else if (arg1 == 6) {
			this.anInt6442 = arg0.method2739();
		} else if (arg1 == 8) {
			this.anInt6448 = 1;
		} else if (arg1 == 9) {
			this.anInt6450 = 1;
		} else if (arg1 == 10) {
			this.aBoolean502 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!rp;I)V")
	public void method5697(@OriginalArg(0) Class3_Sub5 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method2739();
			if (local16 == 0) {
				return;
			}
			this.method5696(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
	public void method5699() {
		this.anInt6453 = Class226.anIntArray613[this.anInt6452 << 3];
		this.anInt6445 = (int) Math.sqrt((double) (this.anInt6449 * this.anInt6449 + this.anInt6447 * this.anInt6447 + this.anInt6458 * this.anInt6458));
		if (this.anInt6443 == 0) {
			this.anInt6443 = 1;
		}
		if (this.anInt6444 == 0) {
			this.aLong239 = 2147483647L;
		} else if (this.anInt6444 == 1) {
			this.aLong239 = this.anInt6445 * 8 / this.anInt6443;
			this.aLong239 *= this.aLong239;
		} else if (this.anInt6444 == 2) {
			this.aLong239 = this.anInt6445 * 8 / this.anInt6443;
		}
		if (this.aBoolean502) {
			this.anInt6445 *= -1;
		}
	}
}
