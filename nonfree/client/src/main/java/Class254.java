import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class254 {

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
	private int anInt7340;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
	private int anInt7341;

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray97;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(II)V")
	public Class254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static372.method6000(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anInt7340 = local20;
			this.anInt7341 = local16;
			this.anIntArrayArray97 = new int[local20][14];
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray97[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(80) double local80 = (double) local16 / (double) local20;
				while (local69 > local56) {
					@Pc(89) double local89 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(91) double local91 = local80;
					if (local89 < -1.0E-4D || local89 > 1.0E-4D) {
						local91 = local80 * (Math.sin(local89) / local89);
					}
					local91 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local91 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I")
	public int method6583(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray97 != null) {
			arg0 = (int) ((long) this.anInt7341 * (long) arg0 / (long) this.anInt7340);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z[B)[B")
	public byte[] method6586(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray97 != null) {
			@Pc(28) int local28 = (int) ((long) this.anInt7341 * (long) arg0.length / (long) this.anInt7340) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray97[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local33 + local50] += local43 * local48[local50];
				}
				local35 += this.anInt7341;
				@Pc(82) int local82 = local35 / this.anInt7340;
				local35 -= local82 * this.anInt7340;
				local33 += local82;
			}
			arg0 = new byte[local28];
			for (@Pc(103) int local103 = 0; local103 < local28; local103++) {
				@Pc(113) int local113 = local31[local103] + 32768 >> 16;
				if (local113 < -128) {
					arg0[local103] = -128;
				} else if (local113 > 127) {
					arg0[local103] = 127;
				} else {
					arg0[local103] = (byte) local113;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(II)I")
	public int method6589(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray97 != null) {
			arg0 = (int) ((long) this.anInt7341 * (long) arg0 / (long) this.anInt7340) + 6;
		}
		return arg0;
	}
}
