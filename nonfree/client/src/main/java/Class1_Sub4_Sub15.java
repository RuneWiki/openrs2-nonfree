import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class1_Sub4_Sub15 extends Class1_Sub4 {

	@OriginalMember(owner = "client!la", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray76;

	@OriginalMember(owner = "client!la", name = "ob", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!la", name = "vb", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!la", name = "db", descriptor = "I")
	private int anInt2567;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(27) int[] local27 = this.method3215(arg0, 0);
			@Pc(30) int local30 = this.anInt2567;
			@Pc(48) int local48;
			@Pc(46) int local46;
			@Pc(79) int[] local79;
			@Pc(84) int[] local84;
			@Pc(93) int local93;
			@Pc(97) int local97;
			@Pc(101) int local101;
			if (local30 == 2) {
				for (local30 = 0; local30 < Static73.anInt1888; local30++) {
					local46 = local27[local30];
					for (local48 = 1; local48 < this.anIntArrayArray76.length - 1 && this.anIntArrayArray76[local48][0] <= local46; local48++) {
					}
					local79 = this.anIntArrayArray76[local48 - 1];
					local84 = this.anIntArrayArray76[local48];
					local93 = this.method1852(local48 - 2)[1];
					local97 = local79[1];
					local101 = local84[1];
					@Pc(110) int local110 = this.method1852(local48 + 1)[1];
					@Pc(120) int local120 = local97 + local110 - local93 - local101;
					@Pc(138) int local138 = (local46 - local79[0] << 12) / (local84[0] - local79[0]);
					@Pc(144) int local144 = local138 * local138 >> 12;
					@Pc(151) int local151 = local93 - local97 - local120;
					@Pc(156) int local156 = local101 - local93;
					@Pc(166) int local166 = (local138 * local120 >> 12) * local144 >> 12;
					@Pc(172) int local172 = local151 * local144 >> 12;
					@Pc(180) int local180 = local138 * local156 >> 12;
					local7[local30] = local97 + local180 + local166 + local172;
				}
			} else if (local30 == 1) {
				for (local30 = 0; local30 < Static73.anInt1888; local30++) {
					local46 = local27[local30];
					for (local48 = 1; this.anIntArrayArray76.length - 1 > local48 && this.anIntArrayArray76[local48][0] <= local46; local48++) {
					}
					local84 = this.anIntArrayArray76[local48];
					local79 = this.anIntArrayArray76[local48 - 1];
					local93 = (local46 - local79[0] << 12) / (local84[0] - local79[0]);
					local97 = 4096 - Static29.anIntArray62[local93 >> 5 & 0xFF] >> 1;
					local101 = 4096 - local97;
					local7[local30] = local101 * local79[1] + local84[1] * local97 >> 12;
				}
			} else {
				for (local30 = 0; local30 < Static73.anInt1888; local30++) {
					local46 = local27[local30];
					for (local48 = 1; this.anIntArrayArray76.length - 1 > local48 && local46 >= this.anIntArrayArray76[local48][0]; local48++) {
					}
					local84 = this.anIntArrayArray76[local48];
					local79 = this.anIntArrayArray76[local48 - 1];
					local93 = (local46 - local79[0] << 12) / (local84[0] - local79[0]);
					local97 = 4096 - local93;
					local7[local30] = local97 * local79[1] + local84[1] * local93 >> 12;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(B)V")
	private void method1850() {
		@Pc(8) int[] local8 = this.anIntArrayArray76[0];
		@Pc(17) int[] local17 = this.anIntArrayArray76[this.anIntArrayArray76.length - 2];
		@Pc(30) int[] local30 = this.anIntArrayArray76[1];
		@Pc(39) int[] local39 = this.anIntArrayArray76[this.anIntArrayArray76.length - 1];
		this.anIntArray226 = new int[] { local8[0] + local8[0] - local30[0], local8[1] - -local8[1] + -local30[1] };
		this.anIntArray225 = new int[] { local17[0] + local17[0] - local39[0], local17[1] - (local39[1] - local17[1]) };
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt2567 = arg0.method544();
		this.anIntArrayArray76 = new int[arg0.method544()][2];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray76.length; local20++) {
			this.anIntArrayArray76[local20][0] = arg0.method546();
			this.anIntArrayArray76[local20][1] = arg0.method546();
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
	@Override
	public void method3207() {
		if (this.anIntArrayArray76 == null) {
			this.anIntArrayArray76 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray76.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2567 == 2) {
			this.method1850();
		}
		Static145.method2764();
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(II)[I")
	private int[] method1852(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray226;
		} else if (arg0 >= this.anIntArrayArray76.length) {
			return this.anIntArray225;
		} else {
			return this.anIntArrayArray76[arg0];
		}
	}
}
