import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class82_Sub3 extends Class82 {

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
	private final int anInt6442;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
	private final int anInt6440;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
	private final int anInt6441;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
	private final int anInt6447;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
	private final int anInt6446;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
	private final int anInt6444;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
	private final int anInt6435;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	private final int anInt6439;

	static {
		new Class175("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
		new Class175("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class82_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt6442 = arg6;
		this.anInt6440 = arg2;
		this.anInt6441 = arg7;
		this.anInt6447 = arg5;
		this.anInt6446 = arg3;
		this.anInt6444 = arg4;
		this.anInt6435 = arg0;
		this.anInt6439 = arg1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt6435 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt6439 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt6440 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt6446 >> 12;
		@Pc(46) int local46 = this.anInt6444 * arg1 >> 12;
		@Pc(53) int local53 = arg0 * this.anInt6447 >> 12;
		@Pc(60) int local60 = arg1 * this.anInt6442 >> 12;
		@Pc(67) int local67 = arg0 * this.anInt6441 >> 12;
		Static122.method2167(super.anInt6503, local17, local10, local67, local53, local24, local46, local60, local39);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5121(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
	@Override
	public void method5120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
