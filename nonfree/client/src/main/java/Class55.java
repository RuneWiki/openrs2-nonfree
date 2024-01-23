import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class55 {

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	private int anInt1712;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
	private int anInt1716;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(II)V")
	public Class55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(17) int local17 = Static182.method3104(arg1, arg0);
			@Pc(21) int local21 = arg0 / local17;
			this.anInt1712 = local21;
			this.anIntArrayArray11 = new int[local21][14];
			@Pc(33) int local33 = arg1 / local17;
			this.anInt1716 = local33;
			for (@Pc(38) int local38 = 0; local38 < local21; local38++) {
				@Pc(46) int[] local46 = this.anIntArrayArray11[local38];
				@Pc(54) double local54 = (double) local38 / (double) local21 + 6.0D;
				@Pc(60) double local60 = (double) local33 / (double) local21;
				@Pc(68) int local68 = (int) Math.floor(local54 + 1.0D - 7.0D);
				@Pc(74) int local74 = (int) Math.ceil(local54 + 7.0D);
				if (local68 < 0) {
					local68 = 0;
				}
				if (local74 > 14) {
					local74 = 14;
				}
				while (local68 < local74) {
					@Pc(101) double local101 = ((double) local68 - local54) * 3.141592653589793D;
					@Pc(103) double local103 = local60;
					if (-1.0E-4D > local101 || local101 > 1.0E-4D) {
						local103 = local60 * (Math.sin(local101) / local101);
					}
					local103 *= Math.cos(((double) local68 - local54) * 0.2243994752564138D) * 0.46D + 0.54D;
					local46[local68] = (int) Math.floor(local103 * 65536.0D + 0.5D);
					local68++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)I")
	public int method1610(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray11 != null) {
			arg0 = (int) ((long) this.anInt1716 * (long) arg0 / (long) this.anInt1712);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[B)[B")
	public byte[] method1612(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray11 != null) {
			@Pc(26) int local26 = (int) ((long) arg0.length * (long) this.anInt1716 / (long) this.anInt1712) + 14;
			@Pc(28) int local28 = 0;
			@Pc(31) int[] local31 = new int[local26];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35;
			for (local35 = 0; local35 < arg0.length; local35++) {
				@Pc(48) int[] local48 = this.anIntArrayArray11[local28];
				@Pc(52) byte local52 = arg0[local35];
				@Pc(54) int local54;
				for (local54 = 0; local54 < 14; local54++) {
					local31[local33 + local54] += local52 * local48[local54];
				}
				local28 += this.anInt1716;
				local54 = local28 / this.anInt1712;
				local33 += local54;
				local28 -= this.anInt1712 * local54;
			}
			arg0 = new byte[local26];
			for (local35 = 0; local35 < local26; local35++) {
				@Pc(119) int local119 = local31[local35] + 32768 >> 16;
				if (local119 < -128) {
					arg0[local35] = -128;
				} else if (local119 > 127) {
					arg0[local35] = 127;
				} else {
					arg0[local35] = (byte) local119;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)I")
	public int method1615(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray11 != null) {
			arg0 = (int) ((long) this.anInt1716 * (long) arg0 / (long) this.anInt1712) + 6;
		}
		return arg0;
	}
}
