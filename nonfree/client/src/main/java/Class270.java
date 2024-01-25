import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class270 {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
	private int anInt8182;

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
	private int anInt8187;

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray77;

	static {
		new Class67("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(II)V")
	public Class270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static438.method6625(arg1, arg0);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt8182 = local20;
			this.anInt8187 = local16;
			this.anIntArrayArray77 = new int[local16][14];
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray77[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(82) double local82 = (double) local20 / (double) local16;
				while (local56 < local69) {
					@Pc(92) double local92 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(94) double local94 = local82;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local94 = local82 * (Math.sin(local92) / local92);
					}
					local94 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local94 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B[B)[B")
	public byte[] method6779(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray77 != null) {
			@Pc(31) int local31 = (int) ((long) arg0.length * (long) this.anInt8182 / (long) this.anInt8187) + 14;
			@Pc(34) int[] local34 = new int[local31];
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < arg0.length; local40++) {
				@Pc(46) byte local46 = arg0[local40];
				@Pc(51) int[] local51 = this.anIntArrayArray77[local38];
				for (@Pc(53) int local53 = 0; local53 < 14; local53++) {
					local34[local53 + local36] += local51[local53] * local46;
				}
				local38 += this.anInt8182;
				@Pc(84) int local84 = local38 / this.anInt8187;
				local36 += local84;
				local38 -= this.anInt8187 * local84;
			}
			arg0 = new byte[local31];
			for (@Pc(109) int local109 = 0; local109 < local31; local109++) {
				@Pc(119) int local119 = local34[local109] + 32768 >> 16;
				if (local119 < -128) {
					arg0[local109] = -128;
				} else if (local119 > 127) {
					arg0[local109] = 127;
				} else {
					arg0[local109] = (byte) local119;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)I")
	public int method6780(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray77 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt8182 / (long) this.anInt8187) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(II)I")
	public int method6782(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray77 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt8182 / (long) this.anInt8187);
		}
		return arg0;
	}
}
