import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class139 {

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
	public int anInt3979;

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
	private int anInt3982;

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
	public int anInt3983;

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "J")
	public long aLong128;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
	public int anInt3985;

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
	public int anInt3987;

	@OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
	public int anInt3989;

	@OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
	public int anInt3990;

	@OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
	public int anInt3992;

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
	public int anInt3993;

	@OriginalMember(owner = "client!kv", name = "t", descriptor = "I")
	public int anInt3995;

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
	public int anInt3986 = 0;

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
	public int anInt3988 = 0;

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "Z")
	private boolean aBoolean457 = false;

	static {
		new Class119("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
	public void method3242() {
		this.anInt3990 = Class1_Sub4_Sub8_Sub1.anIntArray49[this.anInt3982 << 3];
		this.anInt3985 = (int) Math.sqrt((double) (this.anInt3983 * this.anInt3983 + this.anInt3995 * this.anInt3995 + this.anInt3979 * this.anInt3979));
		if (this.anInt3992 == 0) {
			this.anInt3992 = 1;
		}
		if (this.anInt3993 == 0) {
			this.aLong128 = 2147483647L;
		} else if (this.anInt3993 == 1) {
			this.aLong128 = this.anInt3985 * 8 / this.anInt3992;
			this.aLong128 *= this.aLong128;
		} else if (this.anInt3993 == 2) {
			this.aLong128 = this.anInt3985 * 8 / this.anInt3992;
		}
		if (this.aBoolean457) {
			this.anInt3985 *= -1;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!ug;B)V")
	public void method3243(@OriginalArg(0) Class1_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5337();
			if (local5 == 0) {
				return;
			}
			this.method3245(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IBLclient!ug;)V")
	private void method3245(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub28 arg1) {
		if (arg0 == 1) {
			this.anInt3982 = arg1.method5335();
		} else if (arg0 == 2) {
			arg1.method5337();
		} else if (arg0 == 3) {
			this.anInt3995 = arg1.method5355();
			this.anInt3983 = arg1.method5355();
			this.anInt3979 = arg1.method5355();
		} else if (arg0 == 4) {
			this.anInt3993 = arg1.method5337();
			this.anInt3992 = arg1.method5355();
		} else if (arg0 == 6) {
			this.anInt3989 = arg1.method5337();
		} else if (arg0 == 8) {
			this.anInt3986 = 1;
		} else if (arg0 == 9) {
			this.anInt3988 = 1;
		} else if (arg0 == 10) {
			this.aBoolean457 = true;
			return;
		}
	}
}
