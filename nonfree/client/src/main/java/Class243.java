import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class243 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
	private int anInt6638;

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
	private int anInt6645;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	static {
		new Class134("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(II)V")
	public Class243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static32.method482(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt6638 = local24;
			this.anInt6645 = local20;
			this.anIntArrayArray51 = new int[local20][14];
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray51[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(86) double local86 = (double) local24 / (double) local20;
				while (local60 < local73) {
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

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)I")
	public int method5144(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray51 != null) {
			arg0 = (int) ((long) this.anInt6638 * (long) arg0 / (long) this.anInt6645) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([BB)[B")
	public byte[] method5147(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray51 != null) {
			@Pc(23) int local23 = (int) ((long) arg0.length * (long) this.anInt6638 / (long) this.anInt6645) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray51[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local28 + local45] += local38 * local43[local45];
				}
				local30 += this.anInt6638;
				@Pc(75) int local75 = local30 / this.anInt6645;
				local30 -= this.anInt6645 * local75;
				local28 += local75;
			}
			arg0 = new byte[local23];
			for (@Pc(96) int local96 = 0; local96 < local23; local96++) {
				@Pc(106) int local106 = local26[local96] + 32768 >> 16;
				if (local106 < -128) {
					arg0[local96] = -128;
				} else if (local106 > 127) {
					arg0[local96] = 127;
				} else {
					arg0[local96] = (byte) local106;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)I")
	public int method5149(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray51 != null) {
			arg0 = (int) ((long) this.anInt6638 * (long) arg0 / (long) this.anInt6645);
		}
		return arg0;
	}
}
