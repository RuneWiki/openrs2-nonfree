import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class10 {

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
	private int anInt698;

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
	private int anInt700;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V")
	public Class10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static13.method502(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			this.anInt698 = local16;
			@Pc(23) int local23 = arg0 / local12;
			this.anInt700 = local23;
			this.anIntArrayArray1 = new int[local23][14];
			for (@Pc(33) int local33 = 0; local33 < local23; local33++) {
				@Pc(43) double local43 = (double) local33 / (double) local23 + 6.0D;
				@Pc(48) int[] local48 = this.anIntArrayArray1[local33];
				@Pc(56) int local56 = (int) Math.floor(local43 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) double local69 = (double) local16 / (double) local23;
				@Pc(75) int local75 = (int) Math.ceil(local43 + 7.0D);
				if (local75 > 14) {
					local75 = 14;
				}
				while (local75 > local56) {
					@Pc(91) double local91 = ((double) local56 - local43) * 3.141592653589793D;
					@Pc(93) double local93 = local69;
					if (local91 < -1.0E-4D || local91 > 1.0E-4D) {
						local93 = local69 * (Math.sin(local91) / local91);
					}
					local93 *= Math.cos(((double) local56 - local43) * 0.2243994752564138D) * 0.46D + 0.54D;
					local48[local56] = (int) Math.floor(local93 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I")
	public int method450(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray1 != null) {
			arg0 = (int) ((long) this.anInt698 * (long) arg0 / (long) this.anInt700);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([BI)[B")
	public byte[] method454(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray1 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt698 * (long) arg0.length / (long) this.anInt700) + 14;
			@Pc(21) int local21 = 0;
			@Pc(24) int[] local24 = new int[local19];
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray1[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local24[local21 + local41] += local34 * local39[local41];
				}
				local26 += this.anInt698;
				@Pc(70) int local70 = local26 / this.anInt700;
				local21 += local70;
				local26 -= this.anInt700 * local70;
			}
			arg0 = new byte[local19];
			for (@Pc(95) int local95 = 0; local95 < local19; local95++) {
				@Pc(105) int local105 = local24[local95] + 32768 >> 16;
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

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)I")
	public int method455(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray1 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt698 / (long) this.anInt700) + 6;
		}
		return arg0;
	}
}
