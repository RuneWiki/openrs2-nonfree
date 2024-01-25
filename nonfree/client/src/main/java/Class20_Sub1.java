import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
	private final int anInt390;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	private final int anInt393;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	private final int anInt389;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	private final int anInt397;

	static {
		new Class182("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
		new Class182("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt390 = arg1;
		this.anInt393 = arg2;
		this.anInt389 = arg0;
		this.anInt397 = arg3;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZI)V")
	@Override
	public void method3815(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt389 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt393 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt390 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt397 >> 12;
		Static283.method4007(local10, super.anInt4732, local31, super.anInt4733, local17, local24);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
	@Override
	public void method3819(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt389 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt393 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt390 >> 12;
		@Pc(39) int local39 = this.anInt397 * arg1 >> 12;
		Static361.method4859(local10, local32, super.anInt4733, super.anInt4732, super.anInt4731, local39, local25);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BII)V")
	@Override
	public void method3816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt389 >> 12;
		@Pc(17) int local17 = this.anInt393 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt390 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt397 * arg1 >> 12;
		Static310.method4305(local24, local10, local31, local17, super.anInt4731);
	}
}
