import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class1_Sub1_Sub26 extends Class1_Sub1 {

	@OriginalMember(owner = "client!r", name = "U", descriptor = "I")
	private int anInt3873 = 0;

	@OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
	private int anInt3880 = 8192;

	@OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
	private int anInt3879 = 2048;

	@OriginalMember(owner = "client!r", name = "kb", descriptor = "I")
	private int anInt3885 = 12288;

	@OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
	private int anInt3887 = 2048;

	@OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
	private int anInt3881 = 4096;

	@OriginalMember(owner = "client!r", name = "X", descriptor = "I")
	private int anInt3876 = 0;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(29) int local29 = Static187.anIntArray345[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static11.anInt294; local31++) {
				@Pc(39) int local39 = local29 + this.anInt3876;
				@Pc(45) int local45 = Static36.anIntArray81[local31] - 2048;
				@Pc(50) int local50 = this.anInt3879 + local45;
				@Pc(59) int local59 = local50 < -2048 ? local50 + 4096 : local50;
				@Pc(68) int local68 = local59 > 2048 ? local59 - 4096 : local59;
				@Pc(77) int local77 = local39 >= -2048 ? local39 : local39 + 4096;
				@Pc(86) int local86 = local77 <= 2048 ? local77 : local77 - 4096;
				@Pc(91) int local91 = local45 + this.anInt3873;
				@Pc(96) int local96 = this.anInt3887 + local29;
				@Pc(107) int local107 = local96 < -2048 ? local96 + 4096 : local96;
				@Pc(116) int local116 = local91 >= -2048 ? local91 : local91 + 4096;
				@Pc(125) int local125 = local116 > 2048 ? local116 - 4096 : local116;
				@Pc(136) int local136 = local107 <= 2048 ? local107 : local107 - 4096;
				local19[local31] = this.method2835(local68, local86) || this.method2831(local125, local136) ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(III)Z")
	private boolean method2831(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg1 + arg0) * this.anInt3885 >> 12;
		@Pc(30) int local30 = Static167.anIntArray320[local12 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local30 << 12) / this.anInt3885;
		@Pc(44) int local44 = (local37 << 12) / this.anInt3880;
		@Pc(51) int local51 = local44 * this.anInt3881 >> 12;
		return local51 > arg1 - arg0 && arg1 - arg0 > -local51;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)Z")
	private boolean method2835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.anInt3885 * (arg1 - arg0) >> 12;
		@Pc(19) int local19 = Static167.anIntArray320[local9 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local19 << 12) / this.anInt3885;
		@Pc(37) int local37 = (local30 << 12) / this.anInt3880;
		@Pc(52) int local52 = local37 * this.anInt3881 >> 12;
		return arg0 + arg1 < local52 && -local52 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3879 = arg0.method2964();
		} else if (arg1 == 1) {
			this.anInt3876 = arg0.method2964();
		} else if (arg1 == 2) {
			this.anInt3873 = arg0.method2964();
		} else if (arg1 == 3) {
			this.anInt3887 = arg0.method2964();
		} else if (arg1 == 4) {
			this.anInt3885 = arg0.method2964();
		} else if (arg1 == 5) {
			this.anInt3881 = arg0.method2964();
		} else if (arg1 == 6) {
			this.anInt3880 = arg0.method2964();
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	@Override
	public void method3716() {
		Static96.method1624();
	}
}
