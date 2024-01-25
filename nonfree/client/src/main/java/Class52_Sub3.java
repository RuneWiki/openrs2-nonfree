import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class52_Sub3 extends Class52 {

	@OriginalMember(owner = "client!os", name = "k", descriptor = "I")
	private final int anInt6825;

	@OriginalMember(owner = "client!os", name = "v", descriptor = "I")
	private final int anInt6836;

	@OriginalMember(owner = "client!os", name = "m", descriptor = "I")
	private final int anInt6827;

	@OriginalMember(owner = "client!os", name = "w", descriptor = "I")
	private final int anInt6837;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "I")
	private final int anInt6832;

	@OriginalMember(owner = "client!os", name = "s", descriptor = "I")
	private final int anInt6833;

	@OriginalMember(owner = "client!os", name = "n", descriptor = "I")
	private final int anInt6828;

	@OriginalMember(owner = "client!os", name = "i", descriptor = "I")
	private final int anInt6824;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class52_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt6825 = arg4;
		this.anInt6836 = arg2;
		this.anInt6827 = arg3;
		this.anInt6837 = arg5;
		this.anInt6832 = arg7;
		this.anInt6833 = arg0;
		this.anInt6828 = arg1;
		this.anInt6824 = arg6;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZII)V")
	@Override
	public void method5586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
	@Override
	public void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt6833 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt6828 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt6836 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt6827 >> 12;
		@Pc(38) int local38 = this.anInt6825 * arg0 >> 12;
		@Pc(45) int local45 = this.anInt6837 * arg1 >> 12;
		@Pc(57) int local57 = this.anInt6824 * arg0 >> 12;
		@Pc(64) int local64 = arg1 * this.anInt6832 >> 12;
		Static62.method6709(local17, local31, local38, local24, local64, local45, local10, local57, super.anInt6843);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
