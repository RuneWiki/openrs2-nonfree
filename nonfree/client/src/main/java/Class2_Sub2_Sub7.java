import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class2_Sub2_Sub7 extends Class2_Sub2 {

	@OriginalMember(owner = "client!df", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!df", name = "N", descriptor = "I")
	private int anInt1375;

	@OriginalMember(owner = "client!df", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
	private int anInt1377;

	@OriginalMember(owner = "client!df", name = "U", descriptor = "[I")
	private int[] anIntArray120;

	@OriginalMember(owner = "client!df", name = "W", descriptor = "I")
	private int anInt1382;

	@OriginalMember(owner = "client!df", name = "G", descriptor = "I")
	private int anInt1371 = 1024;

	@OriginalMember(owner = "client!df", name = "L", descriptor = "I")
	private int anInt1374 = 81;

	@OriginalMember(owner = "client!df", name = "D", descriptor = "I")
	private int anInt1369 = 8;

	@OriginalMember(owner = "client!df", name = "P", descriptor = "I")
	private int anInt1376 = 204;

	@OriginalMember(owner = "client!df", name = "S", descriptor = "I")
	private int anInt1379 = 1024;

	@OriginalMember(owner = "client!df", name = "T", descriptor = "I")
	private int anInt1380 = 4;

	@OriginalMember(owner = "client!df", name = "R", descriptor = "I")
	private int anInt1378 = 0;

	@OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
	private int anInt1383 = 409;

	static {
		new Class134("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(24) int local24 = 0;
			@Pc(32) int local32;
			for (local32 = Static405.anIntArray555[arg0] + this.anInt1378; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (local24 < this.anInt1369 && local32 >= this.anIntArray120[local24]) {
				local24++;
			}
			@Pc(60) int local60 = local24 - 1;
			@Pc(71) boolean local71 = (local24 & 0x1) == 0;
			@Pc(76) int local76 = this.anIntArray120[local24];
			@Pc(83) int local83 = this.anIntArray120[local24 - 1];
			if (local32 > local83 + this.anInt1382 && local32 < local76 - this.anInt1382) {
				for (@Pc(110) int local110 = 0; local110 < Static217.anInt3574; local110++) {
					@Pc(114) int local114 = 0;
					@Pc(123) int local123 = local71 ? this.anInt1379 : -this.anInt1379;
					@Pc(134) int local134;
					for (local134 = (local123 * this.anInt1375 >> 12) + Static145.anIntArray199[local110]; local134 < 0; local134 += 4096) {
					}
					while (local134 > 4096) {
						local134 -= 4096;
					}
					while (this.anInt1380 > local114 && local134 >= this.anIntArrayArray9[local60][local114]) {
						local114++;
					}
					@Pc(173) int local173 = local114 - 1;
					@Pc(180) int local180 = this.anIntArrayArray9[local60][local173];
					@Pc(187) int local187 = this.anIntArrayArray9[local60][local114];
					if (local180 + this.anInt1382 < local134 && local134 < local187 - this.anInt1382) {
						local11[local110] = this.anIntArrayArray10[local60][local173];
					} else {
						local11[local110] = 0;
					}
				}
			} else {
				Static464.method1962(local11, 0, Static217.anInt3574, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
	private void method1076() {
		@Pc(12) Random local12 = new Random((long) this.anInt1369);
		this.anInt1382 = this.anInt1374 / 2;
		this.anInt1377 = 4096 / this.anInt1369;
		this.anInt1375 = 4096 / this.anInt1380;
		@Pc(41) int local41 = this.anInt1375 / 2;
		this.anIntArrayArray9 = new int[this.anInt1369][this.anInt1380 + 1];
		this.anIntArrayArray10 = new int[this.anInt1369][this.anInt1380];
		@Pc(62) int local62 = this.anInt1377 / 2;
		this.anIntArray120 = new int[this.anInt1369 + 1];
		this.anIntArray120[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt1369; local76++) {
			@Pc(83) int local83;
			@Pc(95) int local95;
			if (local76 > 0) {
				local83 = this.anInt1377;
				local95 = (Static175.method2474(4096, local12) - 2048) * this.anInt1376 >> 12;
				@Pc(103) int local103 = local83 + (local95 * local62 >> 12);
				this.anIntArray120[local76] = local103 + this.anIntArray120[local76 - 1];
			}
			this.anIntArrayArray9[local76][0] = 0;
			for (local83 = 0; local83 < this.anInt1380; local83++) {
				if (local83 > 0) {
					local95 = this.anInt1375;
					@Pc(146) int local146 = (Static175.method2474(4096, local12) - 2048) * this.anInt1383 >> 12;
					local95 += local41 * local146 >> 12;
					this.anIntArrayArray9[local76][local83] = this.anIntArrayArray9[local76][local83 - 1] + local95;
				}
				this.anIntArrayArray10[local76][local83] = this.anInt1371 > 0 ? 4096 - Static175.method2474(this.anInt1371, local12) : 4096;
			}
			this.anIntArrayArray9[local76][this.anInt1380] = 4096;
		}
		this.anIntArray120[this.anInt1369] = 4096;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V")
	@Override
	public void method5475() {
		this.method1076();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1380 = arg0.method3580();
		} else if (arg1 == 1) {
			this.anInt1369 = arg0.method3580();
		} else if (arg1 == 2) {
			this.anInt1383 = arg0.method3555();
		} else if (arg1 == 3) {
			this.anInt1376 = arg0.method3555();
		} else if (arg1 == 4) {
			this.anInt1379 = arg0.method3555();
		} else if (arg1 == 5) {
			this.anInt1378 = arg0.method3555();
		} else if (arg1 == 6) {
			this.anInt1374 = arg0.method3555();
		} else if (arg1 == 7) {
			this.anInt1371 = arg0.method3555();
		}
	}
}
