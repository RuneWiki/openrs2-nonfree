import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class31 {

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
	private int anInt1140;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	private int anInt1138;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(II)V")
	public Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static61.method1113(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			this.anIntArrayArray14 = new int[local16][14];
			@Pc(25) int local25 = arg1 / local12;
			this.anInt1140 = local16;
			this.anInt1138 = local25;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray14[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(54) double local54 = (double) local25 / (double) local16;
				@Pc(62) int local62 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local62 < 0) {
					local62 = 0;
				}
				@Pc(75) int local75 = (int) Math.ceil(local48 + 7.0D);
				if (local75 > 14) {
					local75 = 14;
				}
				while (local75 > local62) {
					@Pc(90) double local90 = ((double) local62 - local48) * 3.141592653589793D;
					@Pc(92) double local92 = local54;
					if (local90 < -1.0E-4D || local90 > 1.0E-4D) {
						local92 = local54 * (Math.sin(local90) / local90);
					}
					local92 *= Math.cos(((double) local62 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local62] = (int) Math.floor(local92 * 65536.0D + 0.5D);
					local62++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)I")
	public int method786(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray14 != null) {
			arg0 = (int) ((long) this.anInt1138 * (long) arg0 / (long) this.anInt1140);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)I")
	public int method788(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray14 != null) {
			arg0 = (int) ((long) this.anInt1138 * (long) arg0 / (long) this.anInt1140) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B[B)[B")
	public byte[] method789(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray14 != null) {
			@Pc(23) int local23 = (int) ((long) this.anInt1138 * (long) arg0.length / (long) this.anInt1140) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray14[local28];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local45 + local30] += local38 * local43[local45];
				}
				local28 += this.anInt1138;
				@Pc(74) int local74 = local28 / this.anInt1140;
				local30 += local74;
				local28 -= this.anInt1140 * local74;
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
