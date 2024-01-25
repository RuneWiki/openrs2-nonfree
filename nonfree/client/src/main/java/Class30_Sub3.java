import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class30_Sub3 extends Class30 {

	@OriginalMember(owner = "client!na", name = "q", descriptor = "I")
	private final int anInt6095;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "I")
	private final int anInt6098;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "I")
	private final int anInt6097;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "I")
	private final int anInt6093;

	static {
		new Class67("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIIII)V")
	public Class30_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6095 = arg2;
		this.anInt6098 = arg0;
		this.anInt6097 = arg3;
		this.anInt6093 = arg1;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
	@Override
	public void method7125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6098 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt6095 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt6093 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt6097 >> 12;
		Static83.method1707(local17, local31, local24, super.anInt8662, super.anInt8661, super.anInt8664, local10);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7127(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt6098 * arg1 >> 12;
		@Pc(21) int local21 = this.anInt6095 * arg1 >> 12;
		@Pc(28) int local28 = this.anInt6093 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt6097 >> 12;
		Static227.method4092(local28, super.anInt8661, local35, local14, local21, super.anInt8662);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt6098 * arg0 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt6095 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt6093 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt6097 >> 12;
		Static242.method4204(local35, local21, local10, local28, super.anInt8664);
	}
}
