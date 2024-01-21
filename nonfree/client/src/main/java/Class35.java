import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class35 {

	@OriginalMember(owner = "client!l", name = "d", descriptor = "I")
	private final int anInt1476;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "I")
	private final int anInt1485;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(II)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static60.method894(arg1, arg0);
		@Pc(12) int local12 = arg1 / local8;
		@Pc(16) int local16 = arg0 / local8;
		this.anInt1476 = local16;
		this.anInt1485 = local12;
		if (local12 != local16) {
			this.anIntArrayArray13 = new int[local16][14];
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray13[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) double local69 = (double) local12 / (double) local16;
				@Pc(75) int local75 = (int) Math.ceil(local48 + 7.0D);
				if (local75 > 14) {
					local75 = 14;
				}
				while (local75 > local56) {
					@Pc(92) double local92 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(94) double local94 = local69;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local94 = local69 * (Math.sin(local92) / local92);
					}
					local94 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local94 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)I")
	public int method808(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray13 != null) {
			arg0 = arg0 * this.anInt1485 / this.anInt1476;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([BB)[B")
	public byte[] method811(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray13 != null) {
			@Pc(15) int local15 = arg0.length * this.anInt1485 / this.anInt1476 + 14;
			@Pc(17) int local17 = 0;
			@Pc(20) int[] local20 = new int[local15];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < arg0.length; local24++) {
				@Pc(30) byte local30 = arg0[local24];
				@Pc(35) int[] local35 = this.anIntArrayArray13[local22];
				for (@Pc(37) int local37 = 0; local37 < 14; local37++) {
					local20[local37 + local17] += local30 * local35[local37];
				}
				local22 += this.anInt1485;
				@Pc(68) int local68 = local22 / this.anInt1476;
				local22 -= local68 * this.anInt1476;
				local17 += local68;
			}
			arg0 = new byte[local15];
			for (@Pc(89) int local89 = 0; local89 < local15; local89++) {
				@Pc(99) int local99 = local20[local89] + 32768 >> 16;
				if (local99 < -128) {
					arg0[local89] = -128;
				} else if (local99 <= 127) {
					arg0[local89] = (byte) local99;
				} else {
					arg0[local89] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
	public int method815(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray13 != null) {
			arg0 = this.anInt1485 * arg0 / this.anInt1476 + 7;
		}
		return arg0;
	}
}
