import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class32 {

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	private int anInt1986;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
	private int anInt1989;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(II)V")
	public Class32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static145.method2763(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anIntArrayArray54 = new int[local20][14];
			this.anInt1986 = local24;
			this.anInt1989 = local20;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(47) double local47 = (double) local37 / (double) local20 + 6.0D;
				@Pc(52) int[] local52 = this.anIntArrayArray54[local37];
				@Pc(60) int local60 = (int) Math.floor(local47 + 1.0D - 7.0D);
				@Pc(66) int local66 = (int) Math.ceil(local47 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(81) double local81 = (double) local24 / (double) local20;
				while (local66 > local60) {
					@Pc(85) double local85 = local81;
					@Pc(92) double local92 = ((double) local60 - local47) * 3.141592653589793D;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local85 = local81 * (Math.sin(local92) / local92);
					}
					local85 *= Math.cos(((double) local60 - local47) * 0.2243994752564138D) * 0.46D + 0.54D;
					local52[local60] = (int) Math.floor(local85 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)I")
	public int method1301(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray54 != null) {
			arg0 = (int) ((long) this.anInt1986 * (long) arg0 / (long) this.anInt1989) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
	public int method1302(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray54 != null) {
			arg0 = (int) ((long) this.anInt1986 * (long) arg0 / (long) this.anInt1989);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[B)[B")
	public byte[] method1303(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray54 != null) {
			@Pc(23) int local23 = (int) ((long) arg0.length * (long) this.anInt1986 / (long) this.anInt1989) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(39) int[] local39 = this.anIntArrayArray54[local28];
				@Pc(43) byte local43 = arg0[local32];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local45 + local30] += local43 * local39[local45];
				}
				local28 += this.anInt1986;
				@Pc(74) int local74 = local28 / this.anInt1989;
				local30 += local74;
				local28 -= local74 * this.anInt1989;
			}
			arg0 = new byte[local23];
			for (@Pc(95) int local95 = 0; local95 < local23; local95++) {
				@Pc(105) int local105 = local26[local95] + 32768 >> 16;
				if (local105 < -128) {
					arg0[local95] = -128;
				} else if (local105 > 127) {
					arg0[local95] = 127;
				} else {
					arg0[local95] = (byte) local105;
				}
			}
		}
		return arg0;
	}
}
