import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
	private final int anInt4607;

	@OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
	private final int anInt4608;

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
	private final int anInt4604;

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
	private final int anInt4605;

	static {
		new Class182("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(IIIIIII)V")
	public Class20_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4607 = arg3;
		this.anInt4608 = arg1;
		this.anInt4604 = arg2;
		this.anInt4605 = arg0;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)V")
	@Override
	public void method3819(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4605 >> 12;
		@Pc(25) int local25 = this.anInt4604 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt4608 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt4607 >> 12;
		Static439.method5806(local25, super.anInt4733, super.anInt4731, super.anInt4732, local39, local10, local32);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZI)V")
	@Override
	public void method3815(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)V")
	@Override
	public void method3816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt4605 * arg0 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt4604 >> 12;
		@Pc(30) int local30 = this.anInt4608 * arg1 >> 12;
		@Pc(37) int local37 = this.anInt4607 * arg1 >> 12;
		Static236.method3469(local30, super.anInt4731, local16, local23, local37);
	}
}
