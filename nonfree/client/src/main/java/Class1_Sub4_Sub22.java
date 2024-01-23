import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class1_Sub4_Sub22 extends Class1_Sub4 {

	@OriginalMember(owner = "client!k", name = "J", descriptor = "I")
	private int anInt2777 = 12288;

	@OriginalMember(owner = "client!k", name = "M", descriptor = "I")
	private int anInt2780 = 0;

	@OriginalMember(owner = "client!k", name = "L", descriptor = "I")
	private int anInt2779 = 4096;

	@OriginalMember(owner = "client!k", name = "K", descriptor = "I")
	private int anInt2778 = 8192;

	@OriginalMember(owner = "client!k", name = "S", descriptor = "I")
	private int anInt2785 = 2048;

	@OriginalMember(owner = "client!k", name = "T", descriptor = "I")
	private int anInt2786 = 0;

	@OriginalMember(owner = "client!k", name = "O", descriptor = "I")
	private int anInt2782 = 2048;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IZI)Z")
	private boolean method2400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg0 + arg1) * this.anInt2777 >> 12;
		@Pc(27) int local27 = Static107.anIntArray193[local12 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt2777;
		@Pc(41) int local41 = (local34 << 12) / this.anInt2778;
		@Pc(48) int local48 = this.anInt2779 * local41 >> 12;
		return local48 > arg1 - arg0 && -local48 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(B)V")
	@Override
	public void method4755() {
		Static17.method243();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2782 = arg0.method1386();
		} else if (arg1 == 1) {
			this.anInt2786 = arg0.method1386();
		} else if (arg1 == 2) {
			this.anInt2780 = arg0.method1386();
		} else if (arg1 == 3) {
			this.anInt2785 = arg0.method1386();
		} else if (arg1 == 4) {
			this.anInt2777 = arg0.method1386();
		} else if (arg1 == 5) {
			this.anInt2779 = arg0.method1386();
		} else if (arg1 == 6) {
			this.anInt2778 = arg0.method1386();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)Z")
	private boolean method2402(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt2777 >> 12;
		@Pc(23) int local23 = Static107.anIntArray193[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt2777;
		@Pc(37) int local37 = (local30 << 12) / this.anInt2778;
		@Pc(44) int local44 = local37 * this.anInt2779 >> 12;
		return arg0 + arg1 < local44 && arg0 + arg1 > -local44;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(20) int[] local20 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(30) int local30 = Static250.anIntArray398[arg0] - 2048;
			for (@Pc(32) int local32 = 0; local32 < Static182.anInt3492; local32++) {
				@Pc(45) int local45 = Static279.anIntArray454[local32] - 2048;
				@Pc(50) int local50 = this.anInt2786 + local30;
				@Pc(55) int local55 = local45 + this.anInt2782;
				@Pc(60) int local60 = local45 + this.anInt2780;
				@Pc(71) int local71 = local60 >= -2048 ? local60 : local60 + 4096;
				@Pc(80) int local80 = local55 >= -2048 ? local55 : local55 + 4096;
				@Pc(89) int local89 = local50 < -2048 ? local50 + 4096 : local50;
				@Pc(95) int local95 = local30 + this.anInt2785;
				@Pc(106) int local106 = local71 > 2048 ? local71 - 4096 : local71;
				@Pc(117) int local117 = local80 > 2048 ? local80 - 4096 : local80;
				@Pc(128) int local128 = local95 >= -2048 ? local95 : local95 + 4096;
				@Pc(137) int local137 = local89 <= 2048 ? local89 : local89 - 4096;
				@Pc(148) int local148 = local128 > 2048 ? local128 - 4096 : local128;
				local20[local32] = this.method2402(local137, local117) || this.method2400(local106, local148) ? 4096 : 0;
			}
		}
		return local20;
	}
}
