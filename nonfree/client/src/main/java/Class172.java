import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class172 {

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
	private int anInt4749;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
	private int anInt4753;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(II)V")
	public Class172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static90.method1689(arg0, arg1);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anIntArrayArray43 = new int[local24][14];
			this.anInt4749 = local20;
			this.anInt4753 = local24;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray43[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(86) double local86 = (double) local20 / (double) local24;
				while (local73 > local60) {
					@Pc(95) double local95 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(97) double local97 = local86;
					if (local95 < -1.0E-4D || local95 > 1.0E-4D) {
						local97 = local86 * (Math.sin(local95) / local95);
					}
					local97 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local97 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "([BZ)[B")
	public byte[] method3822(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray43 != null) {
			@Pc(28) int local28 = (int) ((long) this.anInt4749 * (long) arg0.length / (long) this.anInt4753) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray43[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local50 + local33] += local43 * local48[local50];
				}
				local35 += this.anInt4749;
				@Pc(81) int local81 = local35 / this.anInt4753;
				local33 += local81;
				local35 -= this.anInt4753 * local81;
			}
			arg0 = new byte[local28];
			for (@Pc(102) int local102 = 0; local102 < local28; local102++) {
				@Pc(112) int local112 = local31[local102] + 32768 >> 16;
				if (local112 < -128) {
					arg0[local102] = -128;
				} else if (local112 <= 127) {
					arg0[local102] = (byte) local112;
				} else {
					arg0[local102] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
	public int method3823(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray43 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4749 / (long) this.anInt4753);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)I")
	public int method3824(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray43 != null) {
			arg0 = (int) ((long) this.anInt4749 * (long) arg0 / (long) this.anInt4753) + 6;
		}
		return arg0;
	}
}
