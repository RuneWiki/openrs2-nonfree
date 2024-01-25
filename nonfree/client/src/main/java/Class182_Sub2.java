import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class182_Sub2 extends Class182 {

	@OriginalMember(owner = "client!po", name = "m", descriptor = "I")
	private final int anInt7280;

	@OriginalMember(owner = "client!po", name = "n", descriptor = "I")
	private final int anInt7281;

	@OriginalMember(owner = "client!po", name = "r", descriptor = "I")
	private final int anInt7284;

	@OriginalMember(owner = "client!po", name = "k", descriptor = "I")
	private final int anInt7279;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(IIIIIII)V")
	public Class182_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7280 = arg2;
		this.anInt7281 = arg0;
		this.anInt7284 = arg1;
		this.anInt7279 = arg3;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
	@Override
	public void method6586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt7281 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt7280 * arg1 >> 12;
		@Pc(28) int local28 = this.anInt7284 * arg0 >> 12;
		@Pc(35) int local35 = this.anInt7279 * arg0 >> 12;
		Static71.method1600(local28, super.anInt7939, local35, local17, local10);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 * this.anInt7281 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt7280 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt7284 >> 12;
		@Pc(37) int local37 = this.anInt7279 * arg0 >> 12;
		Static370.method5735(local37, local23, local16, local30, super.anInt7939, super.anInt7942, super.anInt7941);
	}
}
