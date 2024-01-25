import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class302 {

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
	public int anInt8607;

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "I")
	public int anInt8610;

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
	public int anInt8611;

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
	public int anInt8613;

	@OriginalMember(owner = "client!vda", name = "h", descriptor = "J")
	public long aLong227;

	@OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
	public int anInt8614;

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
	public int anInt8616;

	@OriginalMember(owner = "client!vda", name = "n", descriptor = "I")
	public int anInt8618;

	@OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
	public int anInt8620;

	@OriginalMember(owner = "client!vda", name = "r", descriptor = "I")
	private int anInt8621;

	@OriginalMember(owner = "client!vda", name = "s", descriptor = "I")
	public int anInt8622;

	@OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
	public int anInt8612 = 0;

	@OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
	public int anInt8617 = 0;

	@OriginalMember(owner = "client!vda", name = "q", descriptor = "Z")
	private boolean aBoolean591 = false;

	static {
		new Class114("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
	public void method7299() {
		this.anInt8620 = Class307.anIntArray743[this.anInt8621 << 3];
		this.anInt8618 = (int) Math.sqrt((double) (this.anInt8610 * this.anInt8610 + this.anInt8613 * this.anInt8613 + this.anInt8616 * this.anInt8616));
		if (this.anInt8614 == 0) {
			this.anInt8614 = 1;
		}
		if (this.anInt8622 == 0) {
			this.aLong227 = 2147483647L;
		} else if (this.anInt8622 == 1) {
			this.aLong227 = this.anInt8618 * 8 / this.anInt8614;
			this.aLong227 *= this.aLong227;
		} else if (this.anInt8622 == 2) {
			this.aLong227 = this.anInt8618 * 8 / this.anInt8614;
		}
		if (this.aBoolean591) {
			this.anInt8618 *= -1;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!gw;II)V")
	private void method7300(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt8621 = arg0.method3056();
		} else if (arg1 == 2) {
			arg0.method3043();
		} else if (arg1 == 3) {
			this.anInt8613 = arg0.method3037();
			this.anInt8616 = arg0.method3037();
			this.anInt8610 = arg0.method3037();
		} else if (arg1 == 4) {
			this.anInt8622 = arg0.method3043();
			this.anInt8614 = arg0.method3037();
		} else if (arg1 == 6) {
			this.anInt8611 = arg0.method3043();
		} else if (arg1 == 8) {
			this.anInt8617 = 1;
		} else if (arg1 == 9) {
			this.anInt8612 = 1;
		} else if (arg1 == 10) {
			this.aBoolean591 = true;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILclient!gw;)V")
	public void method7303(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method3043();
			if (local3 == 0) {
				return;
			}
			this.method7300(arg0, local3);
		}
	}
}
