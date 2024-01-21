import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class43 {

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
	private int anInt1853;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	private int anInt1858;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(II)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static66.method2121(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			this.anInt1853 = local20;
			@Pc(27) int local27 = arg0 / local16;
			this.anInt1858 = local27;
			this.anIntArrayArray28 = new int[local27][14];
			for (@Pc(37) int local37 = 0; local37 < local27; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray28[local37];
				@Pc(52) double local52 = (double) local37 / (double) local27 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(84) double local84 = (double) local20 / (double) local27;
				while (local73 > local60) {
					@Pc(94) double local94 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(96) double local96 = local84;
					if (local94 < -1.0E-4D || local94 > 1.0E-4D) {
						local96 = local84 * (Math.sin(local94) / local94);
					}
					local96 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local96 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I")
	public int method1209(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray28 != null) {
			arg0 = (int) ((long) this.anInt1853 * (long) arg0 / (long) this.anInt1858) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)I")
	public int method1213(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray28 != null) {
			arg0 = (int) ((long) this.anInt1853 * (long) arg0 / (long) this.anInt1858);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[B)[B")
	public byte[] method1214(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray28 != null) {
			@Pc(27) int local27 = (int) ((long) arg0.length * (long) this.anInt1853 / (long) this.anInt1858) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(43) int[] local43 = this.anIntArrayArray28[local32];
				@Pc(47) byte local47 = arg0[local36];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local49 + local34] += local43[local49] * local47;
				}
				local32 += this.anInt1853;
				@Pc(78) int local78 = local32 / this.anInt1858;
				local34 += local78;
				local32 -= local78 * this.anInt1858;
			}
			arg0 = new byte[local27];
			for (@Pc(99) int local99 = 0; local99 < local27; local99++) {
				@Pc(109) int local109 = local30[local99] + 32768 >> 16;
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
