import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class2_Sub3_Sub18 extends Class2_Sub3 {

	@OriginalMember(owner = "client!m", name = "U", descriptor = "I")
	private int anInt2119;

	@OriginalMember(owner = "client!m", name = "W", descriptor = "I")
	private int anInt2120;

	@OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
	private int anInt2123;

	@OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
	private int anInt2125;

	@OriginalMember(owner = "client!m", name = "fb", descriptor = "I")
	private int anInt2126;

	@OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
	private int anInt2128;

	@OriginalMember(owner = "client!m", name = "T", descriptor = "I")
	private int anInt2118;

	@OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
	private int anInt2122;

	@OriginalMember(owner = "client!m", name = "gb", descriptor = "I")
	private int anInt2127;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77) {
			@Pc(27) int[][] local27 = this.method3017(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local17[0];
			@Pc(43) int[] local43 = local27[2];
			@Pc(47) int[] local47 = local17[2];
			@Pc(51) int[] local51 = local17[1];
			for (@Pc(53) int local53 = 0; local53 < Static53.anInt1184; local53++) {
				this.method1727(local43[local53], local35[local53], local31[local53]);
				for (this.anInt2119 += this.anInt2122; this.anInt2119 < 0; this.anInt2119 += 4096) {
				}
				this.anInt2126 += this.anInt2118;
				this.anInt2120 += this.anInt2127;
				if (this.anInt2120 < 0) {
					this.anInt2120 = 0;
				}
				if (this.anInt2126 < 0) {
					this.anInt2126 = 0;
				}
				while (this.anInt2119 > 4096) {
					this.anInt2119 -= 4096;
				}
				if (this.anInt2120 > 4096) {
					this.anInt2120 = 4096;
				}
				if (this.anInt2126 > 4096) {
					this.anInt2126 = 4096;
				}
				this.method1726(this.anInt2120, this.anInt2126, this.anInt2119);
				local39[local53] = this.anInt2128;
				local51[local53] = this.anInt2123;
				local47[local53] = this.anInt2125;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt2122 = arg1.method2941();
		} else if (arg0 == 1) {
			this.anInt2118 = (arg1.method2948() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt2127 = (arg1.method2948() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIBI)V")
	private void method1726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(34) int local34 = arg0 <= 2048 ? arg0 * (arg1 + 4096) >> 12 : arg1 + arg0 - (arg1 * arg0 >> 12);
		if (local34 <= 0) {
			this.anInt2128 = this.anInt2123 = this.anInt2125 = arg0;
			return;
		}
		@Pc(46) int local46 = arg0 + arg0 - local34;
		@Pc(55) int local55 = (local34 - local46 << 12) / local34;
		@Pc(59) int local59 = arg2 * 6;
		@Pc(63) int local63 = local59 >> 12;
		@Pc(72) int local72 = local59 - (local63 << 12);
		@Pc(78) int local78 = local34 * local55 >> 12;
		@Pc(84) int local84 = local72 * local78 >> 12;
		@Pc(89) int local89 = local46 + local84;
		@Pc(94) int local94 = local34 - local84;
		if (local63 == 0) {
			this.anInt2125 = local46;
			this.anInt2128 = local34;
			this.anInt2123 = local89;
			return;
		}
		if (local63 == 1) {
			this.anInt2128 = local94;
			this.anInt2125 = local46;
			this.anInt2123 = local34;
			return;
		}
		if (local63 == 2) {
			this.anInt2125 = local89;
			this.anInt2123 = local34;
			this.anInt2128 = local46;
			return;
		}
		if (local63 == 3) {
			this.anInt2128 = local46;
			this.anInt2125 = local34;
			this.anInt2123 = local94;
			return;
		}
		if (local63 == 4) {
			this.anInt2123 = local46;
			this.anInt2128 = local89;
			this.anInt2125 = local34;
			return;
		}
		if (local63 == 5) {
			this.anInt2128 = local34;
			this.anInt2123 = local46;
			this.anInt2125 = local94;
			return;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZII)V")
	private void method1727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) int local23 = arg1 < arg2 ? arg2 : arg1;
		@Pc(34) int local34 = arg0 <= local23 ? local23 : arg0;
		@Pc(41) int local41 = arg1 <= arg2 ? arg1 : arg2;
		@Pc(52) int local52 = local41 <= arg0 ? local41 : arg0;
		@Pc(57) int local57 = local34 - local52;
		this.anInt2120 = (local34 + local52) / 2;
		if (local57 <= 0) {
			return;
		}
		if (this.anInt2120 > 0 && this.anInt2120 < 4096) {
			this.anInt2126 = (local57 << 12) / (this.anInt2120 <= 2048 ? this.anInt2120 * 2 : 8192 - (this.anInt2120 * 2));
		}
		@Pc(108) int local108 = (local34 - arg2 << 12) / local57;
		@Pc(117) int local117 = (local34 - arg1 << 12) / local57;
		@Pc(126) int local126 = (local34 - arg0 << 12) / local57;
		if (local34 == arg2) {
			this.anInt2119 = arg1 == local52 ? local126 + 20480 : -local117 + 4096;
		} else if (local34 == arg1) {
			this.anInt2119 = local52 == arg0 ? local108 + 4096 : 12288 - local126;
		} else {
			this.anInt2119 = arg2 == local52 ? local117 + 12288 : -local108 + 20480;
		}
		this.anInt2119 /= 6;
	}
}
