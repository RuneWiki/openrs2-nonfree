import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class27 {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
	public int anInt971;

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
	public int anInt973;

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
	public int anInt976;

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
	public int anInt978;

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
	public int anInt980;

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
	public int anInt982;

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "J")
	public long aLong28;

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
	public int anInt985;

	@OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
	public int anInt987;

	@OriginalMember(owner = "client!bp", name = "x", descriptor = "I")
	public int anInt988;

	@OriginalMember(owner = "client!bp", name = "y", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
	public int anInt972 = 0;

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
	public int anInt983 = 0;

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "Z")
	private boolean aBoolean89 = false;

	static {
		new Class256("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!md;Z)V")
	public void method709(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3737();
			if (local9 == 0) {
				return;
			}
			this.method715(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!md;IB)V")
	private void method715(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt989 = arg0.method3711();
		} else if (arg1 == 2) {
			arg0.method3737();
		} else if (arg1 == 3) {
			this.anInt987 = arg0.method3731();
			this.anInt985 = arg0.method3731();
			this.anInt982 = arg0.method3731();
		} else if (arg1 == 4) {
			this.anInt971 = arg0.method3737();
			this.anInt973 = arg0.method3731();
		} else if (arg1 == 6) {
			this.anInt980 = arg0.method3737();
		} else if (arg1 == 8) {
			this.anInt972 = 1;
		} else if (arg1 == 9) {
			this.anInt983 = 1;
		} else if (arg1 == 10) {
			this.aBoolean89 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	public void method716() {
		this.anInt988 = Class184.anIntArray350[this.anInt989 << 3];
		this.anInt976 = (int) Math.sqrt((double) (this.anInt982 * this.anInt982 + this.anInt985 * this.anInt985 + this.anInt987 * this.anInt987));
		if (this.anInt973 == 0) {
			this.anInt973 = 1;
		}
		if (this.anInt971 == 0) {
			this.aLong28 = 2147483647L;
		} else if (this.anInt971 == 1) {
			this.aLong28 = this.anInt976 * 8 / this.anInt973;
			this.aLong28 *= this.aLong28;
		} else if (this.anInt971 == 2) {
			this.aLong28 = this.anInt976 * 8 / this.anInt973;
		}
		if (this.aBoolean89) {
			this.anInt976 *= -1;
		}
	}
}
