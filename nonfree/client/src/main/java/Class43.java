import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class43 {

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
	public static int[] anIntArray212 = new int[32];

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
	private int anInt1748;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	private int anInt1746;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray212[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(II)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static73.method1287(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			this.anInt1748 = local20;
			@Pc(27) int local27 = arg1 / local16;
			this.anIntArrayArray15 = new int[local20][14];
			this.anInt1746 = local27;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray15[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(58) double local58 = (double) local27 / (double) local20;
				@Pc(66) int local66 = (int) Math.floor(local52 + 1.0D - 7.0D);
				@Pc(72) int local72 = (int) Math.ceil(local52 + 7.0D);
				if (local66 < 0) {
					local66 = 0;
				}
				if (local72 > 14) {
					local72 = 14;
				}
				while (local66 < local72) {
					@Pc(92) double local92 = ((double) local66 - local52) * 3.141592653589793D;
					@Pc(94) double local94 = local58;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local94 = local58 * (Math.sin(local92) / local92);
					}
					local94 *= Math.cos(((double) local66 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local66] = (int) Math.floor(local94 * 65536.0D + 0.5D);
					local66++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I")
	public int method1122(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray15 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1746 / (long) this.anInt1748) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)I")
	public int method1123(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray15 != null) {
			arg0 = (int) ((long) this.anInt1746 * (long) arg0 / (long) this.anInt1748);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[B)[B")
	public byte[] method1124(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray15 != null) {
			@Pc(23) int local23 = (int) ((long) arg0.length * (long) this.anInt1746 / (long) this.anInt1748) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(39) int[] local39 = this.anIntArrayArray15[local30];
				@Pc(43) byte local43 = arg0[local32];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local28 + local45] += local39[local45] * local43;
				}
				local30 += this.anInt1746;
				@Pc(75) int local75 = local30 / this.anInt1748;
				local28 += local75;
				local30 -= this.anInt1748 * local75;
			}
			arg0 = new byte[local23];
			for (@Pc(96) int local96 = 0; local96 < local23; local96++) {
				@Pc(106) int local106 = local26[local96] + 32768 >> 16;
				if (local106 < -128) {
					arg0[local96] = -128;
				} else if (local106 <= 127) {
					arg0[local96] = (byte) local106;
				} else {
					arg0[local96] = 127;
				}
			}
		}
		return arg0;
	}
}
