import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class9_Sub3 extends Class9 {

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
	private final int anInt2985;

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	private final int anInt2986;

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
	private final int anInt2994;

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
	private final int anInt2992;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
	private final int anInt2987;

	@OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
	private final int anInt2995;

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
	private final int anInt2991;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
	private final int anInt2989;

	static {
		new Class96("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class9_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2985 = arg2;
		this.anInt2986 = arg0;
		this.anInt2994 = arg3;
		this.anInt2992 = arg4;
		this.anInt2987 = arg5;
		this.anInt2995 = arg6;
		this.anInt2991 = arg7;
		this.anInt2989 = arg1;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method4774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt2986 * arg0 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt2989 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt2985 >> 12;
		@Pc(39) int local39 = this.anInt2994 * arg1 >> 12;
		@Pc(46) int local46 = this.anInt2992 * arg0 >> 12;
		@Pc(53) int local53 = arg1 * this.anInt2987 >> 12;
		@Pc(60) int local60 = arg0 * this.anInt2995 >> 12;
		@Pc(67) int local67 = this.anInt2991 * arg1 >> 12;
		Static40.method527(local60, local32, local25, local46, local67, local18, local39, super.anInt6017, local53);
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(III)V")
	@Override
	public void method4773(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V")
	@Override
	public void method4772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
