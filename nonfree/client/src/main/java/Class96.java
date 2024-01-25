import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class96 {

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
	private int anInt2592;

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
	private int anInt2593;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(II)V")
	public Class96(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static271.method4039(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt2592 = local20;
			this.anIntArrayArray31 = new int[local20][14];
			this.anInt2593 = local24;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray31[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(84) double local84 = (double) local24 / (double) local20;
				while (local60 < local73) {
					@Pc(93) double local93 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(95) double local95 = local84;
					if (local93 < -1.0E-4D || local93 > 1.0E-4D) {
						local95 = local84 * (Math.sin(local93) / local93);
					}
					local95 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local95 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "([BZ)[B")
	public byte[] method2273(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray31 != null) {
			@Pc(23) int local23 = (int) ((long) this.anInt2593 * (long) arg0.length / (long) this.anInt2592) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray31[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local45 + local28] += local38 * local43[local45];
				}
				local30 += this.anInt2593;
				@Pc(74) int local74 = local30 / this.anInt2592;
				local30 -= this.anInt2592 * local74;
				local28 += local74;
			}
			arg0 = new byte[local23];
			for (@Pc(99) int local99 = 0; local99 < local23; local99++) {
				@Pc(109) int local109 = local26[local99] + 32768 >> 16;
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

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)I")
	public int method2275(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray31 != null) {
			arg0 = (int) ((long) this.anInt2593 * (long) arg0 / (long) this.anInt2592) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)I")
	public int method2276(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray31 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2593 / (long) this.anInt2592);
		}
		return arg0;
	}
}
