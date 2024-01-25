import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class255 {

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
	private int anInt7288;

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
	private int anInt7292;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(II)V")
	public Class255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static208.method2937(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anIntArrayArray63 = new int[local20][14];
			this.anInt7288 = local20;
			this.anInt7292 = local24;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray63[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(83) double local83 = (double) local24 / (double) local20;
				while (local60 < local70) {
					@Pc(93) double local93 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(95) double local95 = local83;
					if (local93 < -1.0E-4D || local93 > 1.0E-4D) {
						local95 = local83 * (Math.sin(local93) / local93);
					}
					local95 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local95 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)I")
	public int method5703(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray63 != null) {
			arg0 = (int) ((long) this.anInt7292 * (long) arg0 / (long) this.anInt7288);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "([BI)[B")
	public byte[] method5704(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray63 != null) {
			@Pc(24) int local24 = (int) ((long) this.anInt7292 * (long) arg0.length / (long) this.anInt7288) + 14;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(29) int local29 = 0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
				@Pc(39) byte local39 = arg0[local33];
				@Pc(44) int[] local44 = this.anIntArrayArray63[local31];
				for (@Pc(46) int local46 = 0; local46 < 14; local46++) {
					local27[local29 + local46] += local39 * local44[local46];
				}
				local31 += this.anInt7292;
				@Pc(78) int local78 = local31 / this.anInt7288;
				local31 -= this.anInt7288 * local78;
				local29 += local78;
			}
			arg0 = new byte[local24];
			for (@Pc(99) int local99 = 0; local99 < local24; local99++) {
				@Pc(109) int local109 = local27[local99] + 32768 >> 16;
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

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZI)I")
	public int method5706(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray63 != null) {
			arg0 = (int) ((long) this.anInt7292 * (long) arg0 / (long) this.anInt7288) + 6;
		}
		return arg0;
	}
}
