import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class1_Sub3_Sub30 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ni", name = "X", descriptor = "I")
	private int anInt2962 = 2048;

	@OriginalMember(owner = "client!ni", name = "U", descriptor = "I")
	private int anInt2959 = 12288;

	@OriginalMember(owner = "client!ni", name = "Z", descriptor = "I")
	private int anInt2963 = 2048;

	@OriginalMember(owner = "client!ni", name = "V", descriptor = "I")
	private int anInt2960 = 8192;

	@OriginalMember(owner = "client!ni", name = "fb", descriptor = "I")
	private int anInt2968 = 0;

	@OriginalMember(owner = "client!ni", name = "eb", descriptor = "I")
	private int anInt2967 = 0;

	@OriginalMember(owner = "client!ni", name = "bb", descriptor = "I")
	private int anInt2965 = 4096;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(B)V")
	@Override
	public void method3474() {
		Static191.method3137();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BII)Z")
	private boolean method2402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = (arg0 + arg1) * this.anInt2959 >> 12;
		@Pc(24) int local24 = Static106.anIntArray203[local9 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local24 << 12) / this.anInt2959;
		@Pc(42) int local42 = (local35 << 12) / this.anInt2960;
		@Pc(49) int local49 = local42 * this.anInt2965 >> 12;
		return local49 > arg0 - arg1 && arg0 - arg1 > -local49;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(III)Z")
	private boolean method2403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt2959 * (arg0 - arg1) >> 12;
		@Pc(27) int local27 = Static106.anIntArray203[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt2959;
		@Pc(41) int local41 = (local34 << 12) / this.anInt2960;
		@Pc(48) int local48 = local41 * this.anInt2965 >> 12;
		return local48 > arg0 + arg1 && -local48 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt2963 = arg1.method2178();
		} else if (arg0 == 1) {
			this.anInt2968 = arg1.method2178();
		} else if (arg0 == 2) {
			this.anInt2967 = arg1.method2178();
		} else if (arg0 == 3) {
			this.anInt2962 = arg1.method2178();
		} else if (arg0 == 4) {
			this.anInt2959 = arg1.method2178();
		} else if (arg0 == 5) {
			this.anInt2965 = arg1.method2178();
		} else if (arg0 == 6) {
			this.anInt2960 = arg1.method2178();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(17) int local17 = Static23.anIntArray47[arg0] - 2048;
			for (@Pc(19) int local19 = 0; local19 < Static76.anInt1531; local19++) {
				@Pc(27) int local27 = Static106.anIntArray202[local19] - 2048;
				@Pc(32) int local32 = this.anInt2963 + local27;
				@Pc(38) int local38 = local17 + this.anInt2962;
				@Pc(47) int local47 = local38 < -2048 ? local38 + 4096 : local38;
				@Pc(52) int local52 = local17 + this.anInt2968;
				@Pc(57) int local57 = this.anInt2967 + local27;
				@Pc(68) int local68 = local47 <= 2048 ? local47 : local47 - 4096;
				@Pc(79) int local79 = local57 >= -2048 ? local57 : local57 + 4096;
				@Pc(88) int local88 = local52 >= -2048 ? local52 : local52 + 4096;
				@Pc(99) int local99 = local32 < -2048 ? local32 + 4096 : local32;
				@Pc(108) int local108 = local88 <= 2048 ? local88 : local88 - 4096;
				@Pc(117) int local117 = local99 <= 2048 ? local99 : local99 - 4096;
				@Pc(126) int local126 = local79 > 2048 ? local79 - 4096 : local79;
				local7[local19] = this.method2403(local108, local117) || this.method2402(local68, local126) ? 4096 : 0;
			}
		}
		return local7;
	}
}
