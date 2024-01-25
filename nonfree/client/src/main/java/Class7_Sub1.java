import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!af", name = "l", descriptor = "I")
	private final int anInt240;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "I")
	private final int anInt243;

	@OriginalMember(owner = "client!af", name = "s", descriptor = "I")
	private final int anInt244;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "I")
	private final int anInt237;

	static {
		new Class267("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIII)V")
	public Class7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt240 = arg0;
		this.anInt243 = arg2;
		this.anInt244 = arg1;
		this.anInt237 = arg3;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(III)V")
	@Override
	public void method4835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt240 >> 12;
		@Pc(17) int local17 = this.anInt243 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt244 >> 12;
		@Pc(31) int local31 = this.anInt237 * arg1 >> 12;
		Static434.method6304(local24, super.anInt5771, local31, local10, local17);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III)V")
	@Override
	public void method4834(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(III)V")
	@Override
	public void method4836(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt240 * arg1 >> 12;
		@Pc(22) int local22 = this.anInt243 * arg1 >> 12;
		@Pc(29) int local29 = this.anInt244 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt237 * arg0 >> 12;
		Static383.method5691(local15, super.anInt5772, local36, super.anInt5771, super.anInt5773, local29, local22);
	}
}
