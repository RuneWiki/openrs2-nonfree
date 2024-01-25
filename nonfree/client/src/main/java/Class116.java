import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class116 {

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
	public int anInt3620;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	public int anInt3623;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
	public int anInt3626;

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
	public int anInt3628;

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
	public int anInt3629;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
	public int anInt3631;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
	public int anInt3632;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
	public int anInt3624 = 128;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
	public int anInt3634 = 128;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
	public int anInt3622;

	static {
		new Class182("From", "Von:", "De", "De");
		new Class182("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(I)V")
	public Class116(@OriginalArg(0) int arg0) {
		this.anInt3622 = arg0;
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IIIIII)V")
	private Class116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3622 = arg0;
		this.anInt3634 = arg2;
		this.anInt3629 = arg4;
		this.anInt3624 = arg1;
		this.anInt3623 = arg3;
		this.anInt3628 = arg5;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!ii;I)V")
	public void method2926(@OriginalArg(0) Class116 arg0) {
		this.anInt3628 = arg0.anInt3628;
		this.anInt3634 = arg0.anInt3634;
		this.anInt3622 = arg0.anInt3622;
		this.anInt3624 = arg0.anInt3624;
		this.anInt3629 = arg0.anInt3629;
		this.anInt3623 = arg0.anInt3623;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)Lclient!ii;")
	public Class116 method2927() {
		return new Class116(this.anInt3622, this.anInt3624, this.anInt3634, this.anInt3623, this.anInt3629, this.anInt3628);
	}
}
