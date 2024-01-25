import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class90_Sub2 extends Class90 {

	@OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
	private final int anInt4439;

	@OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
	private final int anInt4435;

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
	private final int anInt4438;

	@OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
	private final int anInt4446;

	static {
		new Class158("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(IIIIIII)V")
	public Class90_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4439 = arg2;
		this.anInt4435 = arg1;
		this.anInt4438 = arg3;
		this.anInt4446 = arg0;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZII)V")
	@Override
	public void method5865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4446 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt4439 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt4435 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt4438 >> 12;
		Static343.method4835(local10, super.anInt7688, local30, local37, local17);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4446 >> 12;
		@Pc(17) int local17 = this.anInt4439 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt4435 >> 12;
		@Pc(31) int local31 = this.anInt4438 * arg0 >> 12;
		Static209.method3317(local31, super.anInt7686, super.anInt7684, local17, local24, local10);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)V")
	@Override
	public void method5868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt4446 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt4439 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt4435 >> 12;
		@Pc(31) int local31 = this.anInt4438 * arg0 >> 12;
		Static279.method4224(local31, super.anInt7686, local10, super.anInt7688, super.anInt7684, local24, local17);
	}
}
