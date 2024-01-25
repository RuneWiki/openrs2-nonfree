import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class157 {

	@OriginalMember(owner = "client!jda", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
	private int anInt4324;

	@OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
	private int anInt4325;

	static {
		new Class40("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(II)V")
	public Class157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static194.method3244(arg0, arg1);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anIntArrayArray29 = new int[local24][14];
			this.anInt4324 = local20;
			this.anInt4325 = local24;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray29[local37];
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

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BI)I")
	public int method3778(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray29 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4324 / (long) this.anInt4325);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(B[B)[B")
	public byte[] method3779(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray29 != null) {
			@Pc(23) int local23 = (int) ((long) arg0.length * (long) this.anInt4324 / (long) this.anInt4325) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray29[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local45 + local28] += local43[local45] * local38;
				}
				local30 += this.anInt4324;
				@Pc(76) int local76 = local30 / this.anInt4325;
				local30 -= local76 * this.anInt4325;
				local28 += local76;
			}
			arg0 = new byte[local23];
			for (@Pc(97) int local97 = 0; local97 < local23; local97++) {
				@Pc(107) int local107 = local26[local97] + 32768 >> 16;
				if (local107 < -128) {
					arg0[local97] = -128;
				} else if (local107 > 127) {
					arg0[local97] = 127;
				} else {
					arg0[local97] = (byte) local107;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(BI)I")
	public int method3782(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray29 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4324 / (long) this.anInt4325) + 6;
		}
		return arg0;
	}
}
