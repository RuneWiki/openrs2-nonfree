import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class213 {

	@OriginalMember(owner = "client!r", name = "h", descriptor = "I")
	private int anInt5678;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "I")
	private int anInt5673;

	static {
		new Class231("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(II)V")
	public Class213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static189.method5438(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anInt5678 = local20;
			this.anIntArrayArray50 = new int[local20][14];
			this.anInt5673 = local16;
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray50[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(82) double local82 = (double) local16 / (double) local20;
				while (local69 > local56) {
					@Pc(91) double local91 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(93) double local93 = local82;
					if (local91 < -1.0E-4D || local91 > 1.0E-4D) {
						local93 = local82 * (Math.sin(local91) / local91);
					}
					local93 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local93 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)I")
	public int method4778(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray50 != null) {
			arg0 = (int) ((long) this.anInt5673 * (long) arg0 / (long) this.anInt5678) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[B)[B")
	public byte[] method4781(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray50 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt5673 / (long) this.anInt5678) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray50[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local33 + local50] += local48[local50] * local43;
				}
				local35 += this.anInt5673;
				@Pc(81) int local81 = local35 / this.anInt5678;
				local35 -= local81 * this.anInt5678;
				local33 += local81;
			}
			arg0 = new byte[local28];
			for (@Pc(102) int local102 = 0; local102 < local28; local102++) {
				@Pc(112) int local112 = local31[local102] + 32768 >> 16;
				if (local112 < -128) {
					arg0[local102] = -128;
				} else if (local112 > 127) {
					arg0[local102] = 127;
				} else {
					arg0[local102] = (byte) local112;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)I")
	public int method4782(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray50 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt5673 / (long) this.anInt5678);
		}
		return arg0;
	}
}
