import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class180 {

	@OriginalMember(owner = "client!np", name = "b", descriptor = "I")
	public int anInt4661;

	@OriginalMember(owner = "client!np", name = "c", descriptor = "B")
	private byte aByte51;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "I")
	public int anInt4662;

	@OriginalMember(owner = "client!np", name = "f", descriptor = "I")
	public int anInt4664;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "I")
	public int anInt4665;

	@OriginalMember(owner = "client!np", name = "h", descriptor = "I")
	public int anInt4666;

	static {
		new Class231("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V")
	public Class180() {
	}

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!ha;)V")
	public Class180(@OriginalArg(0) Class6_Sub15 arg0) {
		this.aByte51 = arg0.method3116();
		this.anInt4661 = arg0.method3108();
		this.anInt4665 = arg0.method3109();
		this.anInt4662 = arg0.method3109();
		this.anInt4664 = arg0.method3109();
		this.anInt4666 = arg0.method3109();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I")
	public int method4145() {
		return (this.aByte51 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)I")
	public int method4147() {
		return this.aByte51 & 0x7;
	}
}
