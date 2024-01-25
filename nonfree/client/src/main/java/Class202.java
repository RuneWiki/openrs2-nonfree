import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class202 {

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
	public int anInt5758;

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "Lclient!qm;")
	public Class202 aClass202_2;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
	public int anInt5761;

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
	public int anInt5763;

	@OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
	public int anInt5768;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
	public int anInt5769;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
	public int anInt5772;

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
	public int anInt5773;

	@OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
	public int anInt5778;

	@OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
	public int anInt5779;

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "B")
	public final byte aByte75;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	private final int anInt5757;

	@OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
	public final int anInt5774;

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
	public final int anInt5771;

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
	public final int anInt5777;

	static {
		new Class256("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(IIIIB)V")
	public Class202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte75 = arg4;
		this.anInt5757 = arg0;
		this.anInt5774 = arg3;
		this.anInt5771 = arg1;
		this.anInt5777 = arg2;
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!qm;I)V")
	public Class202(@OriginalArg(0) Class202 arg0, @OriginalArg(1) int arg1) {
		this.aClass202_2 = arg0;
		this.anInt5774 = this.aClass202_2.anInt5774 + arg1;
		this.anInt5757 = this.aClass202_2.anInt5757;
		this.aByte75 = this.aClass202_2.aByte75;
		this.anInt5777 = this.aClass202_2.anInt5777 + arg1;
		this.anInt5771 = this.aClass202_2.anInt5771 + arg1;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIB)Lclient!qm;")
	public Class202 method4609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class202(this.anInt5757, arg0, arg1, arg2, this.aByte75);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)Lclient!af;")
	public Class6 method4612() {
		return Static103.method1622(this.anInt5757);
	}
}
