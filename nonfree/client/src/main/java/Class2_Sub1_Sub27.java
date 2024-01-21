import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class2_Sub1_Sub27 extends Class2_Sub1 {

	@OriginalMember(owner = "client!p", name = "X", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!p", name = "hb", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!p", name = "R", descriptor = "I")
	private int anInt2871;

	@OriginalMember(owner = "client!p", name = "U", descriptor = "I")
	private int anInt2873;

	@OriginalMember(owner = "client!p", name = "W", descriptor = "I")
	private int anInt2875;

	@OriginalMember(owner = "client!p", name = "ib", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!p", name = "cb", descriptor = "Z")
	private boolean aBoolean118;

	@OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
	private int anInt2870;

	@OriginalMember(owner = "client!p", name = "jb", descriptor = "I")
	private int anInt2883;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
	private void method1924() {
		@Pc(27) int local27;
		if (this.anInt2873 > 0) {
			this.anIntArray247 = new int[this.anInt2870];
			this.anIntArray249 = new int[this.anInt2870];
			for (local27 = 0; local27 < this.anInt2870; local27++) {
				this.anIntArray249[local27] = (int) (Math.pow((double) (this.anInt2873 / 4096), (double) local27) * 4096.0D);
				this.anIntArray247[local27] = (int) (Math.pow(2.0D, (double) local27) * 4096.0D);
			}
		} else if (this.anIntArray249 != null && this.anInt2870 == this.anIntArray249.length) {
			this.anIntArray247 = new int[this.anInt2870];
			for (local27 = 0; local27 < this.anInt2870; local27++) {
				this.anIntArray247[local27] = (int) (Math.pow(2.0D, (double) local27) * 4096.0D);
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean118 = arg0.method1402() == 1;
		} else if (arg1 == 1) {
			this.anInt2870 = arg0.method1402();
		} else if (arg1 == 2) {
			this.anInt2873 = arg0.method1400();
			if (this.anInt2873 < 0) {
				this.anIntArray249 = new int[this.anInt2870];
				for (@Pc(72) int local72 = 0; local72 < this.anInt2870; local72++) {
					this.anIntArray249[local72] = arg0.method1400();
				}
			}
		} else if (arg1 == 3) {
			this.anInt2883 = this.anInt2871 = arg0.method1402();
		} else if (arg1 == 4) {
			this.anInt2875 = arg0.method1402();
		} else if (arg1 == 5) {
			this.anInt2883 = arg0.method1402();
		} else if (arg1 == 6) {
			this.anInt2871 = arg0.method1402();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(20) int local20 = this.anInt2883 << 12;
			@Pc(25) int local25 = this.anInt2871 << 12;
			@Pc(32) int local32 = this.anInt2871 * Static11.anIntArray8[arg0];
			for (@Pc(34) int local34 = 0; local34 < Static120.anInt2812; local34++) {
				@Pc(38) int local38 = 0;
				@Pc(45) int local45 = this.anInt2883 * Static69.anIntArray117[local34];
				for (@Pc(47) int local47 = 0; local47 < this.anInt2870; local47++) {
					@Pc(54) int local54 = this.anIntArray249[local47];
					@Pc(59) int local59 = this.anIntArray247[local47];
					@Pc(83) int local83 = this.method1926(local20 * local59 >> 12, local25 * local59 >> 12, local59 * local32 >> 12, local59 * local45 >> 12);
					local38 += local54 * local83 >> 12;
				}
				if (this.aBoolean118) {
					local38 = (local38 >> 1) + 2048;
				}
				local11[local34] = local38;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZIIII)I")
	private int method1926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg3 & 0xFFFFF000;
		@Pc(11) int local11 = arg3 - local7;
		@Pc(15) int local15 = local7 >> 12;
		@Pc(19) int local19 = arg2 & 0xFFFFF000;
		@Pc(23) int local23 = arg2 - local19;
		@Pc(27) int local27 = arg1 & 0xFFFFF000;
		@Pc(31) int local31 = local19 >> 12;
		@Pc(35) int local35 = arg0 & 0xFFFFF000;
		@Pc(39) int local39 = local15 + 1;
		if (local39 >= local35 >> 12) {
			local39 = 0;
		}
		local39 &= 0xFF;
		local7 = local15 & 0xFF;
		@Pc(58) int local58 = local31 + 1;
		local19 = local31 & 0xFF;
		if (local58 >= local27 >> 12) {
			local58 = 0;
		}
		local58 &= 0xFF;
		@Pc(86) int local86 = this.anIntArray250[local39 + this.anIntArray250[local58]] % 4;
		@Pc(98) int local98 = this.anIntArray250[this.anIntArray250[local19] + local39] % 4;
		@Pc(116) int local116 = this.anIntArray250[this.anIntArray250[local58] + local7] % 4;
		@Pc(128) int local128 = this.anIntArray250[this.anIntArray250[local19] + local7] % 4;
		@Pc(136) int local136 = Static176.method2762(local23, Static95.anIntArrayArray38[local128], local11);
		@Pc(146) int local146 = Static176.method2762(local23, Static95.anIntArrayArray38[local98], local11 - 4096);
		@Pc(156) int local156 = Static176.method2762(local23 - 4096, Static95.anIntArrayArray38[local116], local11);
		@Pc(168) int local168 = Static176.method2762(local23 - 4096, Static95.anIntArrayArray38[local86], local11 - 4096);
		@Pc(172) int local172 = Static160.method427(local11);
		@Pc(176) int local176 = Static160.method427(local23);
		@Pc(182) int local182 = Static143.method2225(local136, local172, local146);
		@Pc(188) int local188 = Static143.method2225(local156, local172, local168);
		return Static143.method2225(local182, local176, local188);
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(B)V")
	private void method1927() {
		@Pc(12) Random local12 = new Random((long) this.anInt2875);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.anIntArray250[local14] = -1;
		}
		for (@Pc(27) int local27 = 0; local27 < 255; local27++) {
			@Pc(48) int local48;
			do {
				local48 = Static77.method1232(255, local12);
			} while (this.anIntArray250[local48] != -1);
			this.anIntArray250[local48 + 255] = this.anIntArray250[local48] = local27;
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
	@Override
	public void method2789() {
		this.method1927();
		this.method1924();
	}
}
