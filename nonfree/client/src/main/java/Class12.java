import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class12 {

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
	private int anInt491;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
	private int anInt482;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(II)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static34.method74(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anIntArrayArray10 = new int[local24][14];
			this.anInt491 = local20;
			this.anInt482 = local24;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray10[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) double local73 = (double) local20 / (double) local24;
				@Pc(79) int local79 = (int) Math.ceil(local52 + 7.0D);
				if (local79 > 14) {
					local79 = 14;
				}
				while (local60 < local79) {
					@Pc(96) double local96 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(98) double local98 = local73;
					if (local96 < -1.0E-4D || local96 > 1.0E-4D) {
						local98 = local73 * (Math.sin(local96) / local96);
					}
					local98 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local98 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)I")
	public int method410(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray10 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt491 / (long) this.anInt482) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)I")
	public int method411(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray10 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt491 / (long) this.anInt482);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[B)[B")
	public byte[] method415(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray10 != null) {
			@Pc(23) int local23 = (int) ((long) this.anInt491 * (long) arg0.length / (long) this.anInt482) + 14;
			@Pc(25) int local25 = 0;
			@Pc(28) int[] local28 = new int[local23];
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray10[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local28[local25 + local45] += local38 * local43[local45];
				}
				local30 += this.anInt491;
				@Pc(74) int local74 = local30 / this.anInt482;
				local30 -= this.anInt482 * local74;
				local25 += local74;
			}
			arg0 = new byte[local23];
			for (@Pc(99) int local99 = 0; local99 < local23; local99++) {
				@Pc(109) int local109 = local28[local99] + 32768 >> 16;
				if (local109 < -128) {
					arg0[local99] = -128;
				} else if (local109 <= 127) {
					arg0[local99] = (byte) local109;
				} else {
					arg0[local99] = 127;
				}
			}
		}
		return arg0;
	}
}
