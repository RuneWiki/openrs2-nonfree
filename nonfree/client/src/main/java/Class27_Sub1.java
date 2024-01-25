import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!br", name = "k", descriptor = "I")
	private final int anInt646;

	@OriginalMember(owner = "client!br", name = "v", descriptor = "I")
	private final int anInt657;

	@OriginalMember(owner = "client!br", name = "p", descriptor = "I")
	private final int anInt651;

	@OriginalMember(owner = "client!br", name = "h", descriptor = "I")
	private final int anInt643;

	@OriginalMember(owner = "client!br", name = "o", descriptor = "I")
	private final int anInt650;

	@OriginalMember(owner = "client!br", name = "i", descriptor = "I")
	private final int anInt644;

	@OriginalMember(owner = "client!br", name = "j", descriptor = "I")
	private final int anInt645;

	@OriginalMember(owner = "client!br", name = "r", descriptor = "I")
	private final int anInt653;

	static {
		new Class83("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class27_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt646 = arg7;
		this.anInt657 = arg6;
		this.anInt651 = arg5;
		this.anInt643 = arg3;
		this.anInt650 = arg4;
		this.anInt644 = arg1;
		this.anInt645 = arg2;
		this.anInt653 = arg0;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(III)V")
	@Override
	public void method3936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III)V")
	@Override
	public void method3935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt653 * arg1 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt644 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt645 >> 12;
		@Pc(37) int local37 = this.anInt643 * arg0 >> 12;
		@Pc(44) int local44 = this.anInt650 * arg1 >> 12;
		@Pc(51) int local51 = this.anInt651 * arg0 >> 12;
		@Pc(58) int local58 = this.anInt657 * arg1 >> 12;
		@Pc(65) int local65 = this.anInt646 * arg0 >> 12;
		Static376.method4895(local58, local44, local37, local65, local30, local51, local16, super.anInt5152, local23);
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(III)V")
	@Override
	public void method3939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
