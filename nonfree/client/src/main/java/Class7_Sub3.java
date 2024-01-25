import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class7_Sub3 extends Class7 {

	@OriginalMember(owner = "client!n", name = "h", descriptor = "I")
	private final int anInt4673;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "I")
	private final int anInt4675;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "I")
	private final int anInt4681;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "I")
	private final int anInt4676;

	static {
		new Class267("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
		new Class267("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIIII)V")
	public Class7_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4673 = arg0;
		this.anInt4675 = arg2;
		this.anInt4681 = arg3;
		this.anInt4676 = arg1;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(III)V")
	@Override
	public void method4835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(III)V")
	@Override
	public void method4836(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
	@Override
	public void method4834(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt4673 * arg1 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt4675 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt4676 >> 12;
		@Pc(38) int local38 = this.anInt4681 * arg0 >> 12;
		Static292.method4380(super.anInt5773, local17, local24, local38, local31);
	}
}
