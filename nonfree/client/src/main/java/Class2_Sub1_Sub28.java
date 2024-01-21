import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class2_Sub1_Sub28 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qa", name = "eb", descriptor = "[I")
	public static int[] anIntArray279 = new int[256];

	@OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
	private int anInt3072;

	static {
		for (@Pc(36) int local36 = 0; local36 < 256; local36++) {
			@Pc(39) int local39 = local36;
			for (@Pc(41) int local41 = 0; local41 < 8; local41++) {
				if ((local39 & 0x1) == 1) {
					local39 = local39 >>> 1 ^ 0xEDB88320;
				} else {
					local39 >>>= 0x1;
				}
			}
			anIntArray279[local36] = local39;
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(III)I")
	private int method2066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = this.anInt3072;
		if (local11 == 1) {
			return arg0 + arg1;
		} else if (local11 == 2) {
			return arg0 - arg1;
		} else if (local11 == 3) {
			return arg0 * arg1 >> 12;
		} else if (local11 == 4) {
			return arg1 == 0 ? 4096 : (arg0 << 12) / arg1;
		} else if (local11 == 5) {
			return 4096 - ((4096 - arg1) * (-arg0 + 4096) >> 12);
		} else if (local11 == 6) {
			return arg1 >= 2048 ? 4096 - ((4096 - arg0) * (4096 - arg1) >> 11) : arg1 * arg0 >> 11;
		} else if (local11 == 7) {
			return arg0 == 4096 ? 4096 : (arg1 << 12) / (4096 - arg0);
		} else if (local11 == 8) {
			return arg0 == 0 ? 0 : 4096 - (4096 - arg1 << 12) / arg0;
		} else if (local11 == 9) {
			return arg0 >= arg1 ? arg1 : arg0;
		} else if (local11 == 10) {
			return arg1 >= arg0 ? arg1 : arg0;
		} else if (local11 == 11) {
			return arg1 < arg0 ? arg0 - arg1 : -arg0 + arg1;
		} else if (local11 == 12) {
			return arg1 + arg0 - (arg0 * arg1 >> 11);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(21) int[] local21 = this.method2796(0, arg0);
			@Pc(27) int[] local27 = this.method2796(1, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static120.anInt2812; local29++) {
				local11[local29] = this.method2066(local21[local29], local27[local29]);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3072 = arg0.method1402();
		} else if (arg1 == 1) {
			super.aBoolean175 = arg0.method1402() == 1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123) {
			@Pc(25) int[][] local25 = this.method2794(0, arg0);
			@Pc(31) int[][] local31 = this.method2794(1, arg0);
			@Pc(35) int[] local35 = local15[2];
			@Pc(39) int[] local39 = local15[0];
			@Pc(43) int[] local43 = local15[1];
			@Pc(47) int[] local47 = local25[0];
			@Pc(51) int[] local51 = local25[1];
			@Pc(55) int[] local55 = local31[0];
			@Pc(59) int[] local59 = local25[2];
			@Pc(63) int[] local63 = local31[1];
			@Pc(67) int[] local67 = local31[2];
			for (@Pc(69) int local69 = 0; local69 < Static120.anInt2812; local69++) {
				local39[local69] = this.method2066(local47[local69], local55[local69]);
				local43[local69] = this.method2066(local51[local69], local63[local69]);
				local35[local69] = this.method2066(local59[local69], local67[local69]);
			}
		}
		return local15;
	}
}
