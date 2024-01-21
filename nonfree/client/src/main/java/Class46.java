import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class46 {

	@OriginalMember(owner = "client!me", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "I")
	private int anInt1826;

	@OriginalMember(owner = "client!me", name = "B", descriptor = "I")
	private int anInt1835;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(II)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static33.method652(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			this.anIntArrayArray15 = new int[local20][14];
			@Pc(29) int local29 = arg1 / local16;
			this.anInt1826 = local20;
			this.anInt1835 = local29;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray15[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(81) double local81 = (double) local29 / (double) local20;
				while (local70 > local60) {
					@Pc(85) double local85 = local81;
					@Pc(93) double local93 = ((double) local60 - local52) * 3.141592653589793D;
					if (local93 < -1.0E-4D || local93 > 1.0E-4D) {
						local85 = local81 * (Math.sin(local93) / local93);
					}
					local85 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local85 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I")
	public int method1193(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray15 != null) {
			arg0 = (int) ((long) this.anInt1835 * (long) arg0 / (long) this.anInt1826) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)I")
	public int method1195(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray15 != null) {
			arg0 = (int) ((long) this.anInt1835 * (long) arg0 / (long) this.anInt1826);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BI)[B")
	public byte[] method1197(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray15 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt1835 / (long) this.anInt1826) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray15[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local33 + local50] += local43 * local48[local50];
				}
				local35 += this.anInt1835;
				@Pc(80) int local80 = local35 / this.anInt1826;
				local35 -= this.anInt1826 * local80;
				local33 += local80;
			}
			arg0 = new byte[local28];
			for (@Pc(101) int local101 = 0; local101 < local28; local101++) {
				@Pc(111) int local111 = local31[local101] + 32768 >> 16;
				if (local111 < -128) {
					arg0[local101] = -128;
				} else if (local111 <= 127) {
					arg0[local101] = (byte) local111;
				} else {
					arg0[local101] = 127;
				}
			}
		}
		return arg0;
	}
}
