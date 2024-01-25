import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class195 {

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
	private int anInt5405;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
	private int anInt5399;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(II)V")
	public Class195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static102.method1618(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt5405 = local24;
			this.anInt5399 = local20;
			this.anIntArrayArray44 = new int[local24][14];
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray44[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(83) double local83 = (double) local20 / (double) local24;
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

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)I")
	public int method4379(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray44 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt5399 / (long) this.anInt5405);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(II)I")
	public int method4383(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray44 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt5399 / (long) this.anInt5405) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B[B)[B")
	public byte[] method4384(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray44 != null) {
			@Pc(23) int local23 = (int) ((long) this.anInt5399 * (long) arg0.length / (long) this.anInt5405) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray44[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local28 + local45] += local38 * local43[local45];
				}
				local30 += this.anInt5399;
				@Pc(75) int local75 = local30 / this.anInt5405;
				local28 += local75;
				local30 -= this.anInt5405 * local75;
			}
			arg0 = new byte[local23];
			for (@Pc(100) int local100 = 0; local100 < local23; local100++) {
				@Pc(110) int local110 = local26[local100] + 32768 >> 16;
				if (local110 < -128) {
					arg0[local100] = -128;
				} else if (local110 <= 127) {
					arg0[local100] = (byte) local110;
				} else {
					arg0[local100] = 127;
				}
			}
		}
		return arg0;
	}
}
