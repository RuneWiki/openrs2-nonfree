import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!dq", name = "W", descriptor = "[I")
	public static final int[] anIntArray123;

	@OriginalMember(owner = "client!dq", name = "L", descriptor = "I")
	private int anInt1666 = 16;

	@OriginalMember(owner = "client!dq", name = "T", descriptor = "I")
	private int anInt1674 = 2000;

	@OriginalMember(owner = "client!dq", name = "N", descriptor = "I")
	private int anInt1668 = 0;

	@OriginalMember(owner = "client!dq", name = "Q", descriptor = "I")
	private int anInt1671 = 4096;

	@OriginalMember(owner = "client!dq", name = "S", descriptor = "I")
	private int anInt1673 = 0;

	static {
		new Class62("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
		anIntArray123 = new int[256];
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(18) int local18 = local15;
			for (@Pc(20) int local20 = 0; local20 < 8; local20++) {
				if ((local18 & 0x1) == 1) {
					local18 = local18 >>> 1 ^ 0xEDB88320;
				} else {
					local18 >>>= 0x1;
				}
			}
			anIntArray123[local15] = local18;
		}
	}

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt1668 = arg1.method5732();
		} else if (arg0 == 1) {
			this.anInt1674 = arg1.method5753();
		} else if (arg0 == 2) {
			this.anInt1666 = arg1.method5732();
		} else if (arg0 == 3) {
			this.anInt1673 = arg1.method5753();
		} else if (arg0 == 4) {
			this.anInt1671 = arg1.method5753();
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(20) int local20 = this.anInt1671 >> 1;
			@Pc(25) int[][] local25 = super.aClass156_41.method3898();
			@Pc(32) Random local32 = new Random((long) this.anInt1668);
			for (@Pc(34) int local34 = 0; local34 < this.anInt1674; local34++) {
				@Pc(54) int local54 = this.anInt1671 > 0 ? this.anInt1673 + Static371.method5907(this.anInt1671, local32) - local20 : this.anInt1673;
				@Pc(60) int local60 = local54 >> 4 & 0xFF;
				@Pc(65) int local65 = Static371.method5907(Static391.anInt7118, local32);
				@Pc(70) int local70 = Static371.method5907(Static299.anInt5583, local32);
				@Pc(82) int local82 = local65 + (Static89.anIntArray149[local60] * this.anInt1666 >> 12);
				@Pc(93) int local93 = (Static40.anIntArray60[local60] * this.anInt1666 >> 12) + local70;
				@Pc(98) int local98 = local93 - local70;
				@Pc(103) int local103 = local82 - local65;
				if (local103 != 0 || local98 != 0) {
					if (local98 < 0) {
						local98 = -local98;
					}
					if (local103 < 0) {
						local103 = -local103;
					}
					@Pc(137) boolean local137 = local103 < local98;
					@Pc(141) int local141;
					@Pc(145) int local145;
					if (local137) {
						local141 = local65;
						local65 = local70;
						local145 = local82;
						local70 = local141;
						local82 = local93;
						local93 = local145;
					}
					if (local65 > local82) {
						local141 = local65;
						local145 = local70;
						local65 = local82;
						local70 = local93;
						local82 = local141;
						local93 = local145;
					}
					local141 = local70;
					local145 = local82 - local65;
					@Pc(182) int local182 = local93 - local70;
					@Pc(187) int local187 = -local145 / 2;
					@Pc(191) int local191 = 2048 / local145;
					@Pc(201) int local201 = 1024 - (Static371.method5907(4096, local32) >> 2);
					if (local182 < 0) {
						local182 = -local182;
					}
					@Pc(217) int local217 = local70 >= local93 ? -1 : 1;
					for (@Pc(219) int local219 = local65; local219 < local82; local219++) {
						@Pc(232) int local232 = (local219 - local65) * local191 + local201 + 1024;
						@Pc(236) int local236 = Static235.anInt4676 & local219;
						@Pc(240) int local240 = local141 & Static67.anInt1510;
						if (local137) {
							local25[local240][local236] = local232;
						} else {
							local25[local236][local240] = local232;
						}
						local187 += local182;
						if (local187 > 0) {
							local187 += -local145;
							local141 += local217;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
	@Override
	public void method6067() {
		Static155.method2766();
	}
}
