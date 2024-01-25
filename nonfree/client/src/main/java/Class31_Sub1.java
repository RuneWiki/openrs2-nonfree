import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
	private final int anInt1164;

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
	private final int anInt1162;

	@OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
	private final int anInt1170;

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
	private final int anInt1161;

	static {
		new Class256("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(IIIIIII)V")
	public Class31_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1164 = arg2;
		this.anInt1162 = arg1;
		this.anInt1170 = arg0;
		this.anInt1161 = arg3;
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(III)V")
	@Override
	public void method5446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt1170 * arg1 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt1164 >> 12;
		@Pc(28) int local28 = this.anInt1162 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt1161 >> 12;
		Static167.method2613(super.anInt6936, super.anInt6939, super.anInt6934, local10, local28, local35, local21);
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(III)V")
	@Override
	public void method5445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt1170 * arg1 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt1164 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt1162 >> 12;
		@Pc(39) int local39 = this.anInt1161 * arg0 >> 12;
		Static250.method3255(local39, super.anInt6934, local32, local18, local25, super.anInt6939);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)V")
	@Override
	public void method5444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1170 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt1164 >> 12;
		@Pc(31) int local31 = this.anInt1162 * arg0 >> 12;
		@Pc(38) int local38 = this.anInt1161 * arg0 >> 12;
		Static112.method1694(super.anInt6936, local10, local38, local31, local17);
	}
}
