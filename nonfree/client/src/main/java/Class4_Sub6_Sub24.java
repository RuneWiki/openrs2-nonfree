import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class4_Sub6_Sub24 extends Class4_Sub6 {

	@OriginalMember(owner = "client!mv", name = "C", descriptor = "I")
	private int anInt4795;

	@OriginalMember(owner = "client!mv", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!mv", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!mv", name = "R", descriptor = "[I")
	private int[] anIntArray313;

	@OriginalMember(owner = "client!mv", name = "S", descriptor = "I")
	private int anInt4808;

	@OriginalMember(owner = "client!mv", name = "U", descriptor = "I")
	private int anInt4810;

	@OriginalMember(owner = "client!mv", name = "E", descriptor = "I")
	private int anInt4797 = 81;

	@OriginalMember(owner = "client!mv", name = "L", descriptor = "I")
	private int anInt4802 = 1024;

	@OriginalMember(owner = "client!mv", name = "P", descriptor = "I")
	private int anInt4806 = 4;

	@OriginalMember(owner = "client!mv", name = "D", descriptor = "I")
	private int anInt4796 = 409;

	@OriginalMember(owner = "client!mv", name = "T", descriptor = "I")
	private int anInt4809 = 0;

	@OriginalMember(owner = "client!mv", name = "Q", descriptor = "I")
	private int anInt4807 = 1024;

	@OriginalMember(owner = "client!mv", name = "W", descriptor = "I")
	private int anInt4811 = 8;

	@OriginalMember(owner = "client!mv", name = "O", descriptor = "I")
	private int anInt4805 = 204;

	static {
		new Class83("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt4806 = arg1.method2490();
		} else if (arg0 == 1) {
			this.anInt4811 = arg1.method2490();
		} else if (arg0 == 2) {
			this.anInt4796 = arg1.method2536();
		} else if (arg0 == 3) {
			this.anInt4805 = arg1.method2536();
		} else if (arg0 == 4) {
			this.anInt4802 = arg1.method2536();
		} else if (arg0 == 5) {
			this.anInt4809 = arg1.method2536();
		} else if (arg0 == 6) {
			this.anInt4797 = arg1.method2536();
		} else if (arg0 == 7) {
			this.anInt4807 = arg1.method2536();
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(25) int local25 = 0;
			@Pc(33) int local33;
			for (local33 = Static165.anIntArray209[arg0] + this.anInt4809; local33 < 0; local33 += 4096) {
			}
			while (local33 > 4096) {
				local33 -= 4096;
			}
			while (this.anInt4811 > local25 && local33 >= this.anIntArray313[local25]) {
				local25++;
			}
			@Pc(70) int local70 = local25 - 1;
			@Pc(78) boolean local78 = (local25 & 0x1) == 0;
			@Pc(83) int local83 = this.anIntArray313[local25];
			@Pc(90) int local90 = this.anIntArray313[local25 - 1];
			if (local33 > local90 + this.anInt4795 && local33 < local83 - this.anInt4795) {
				for (@Pc(108) int local108 = 0; local108 < Static80.anInt1616; local108++) {
					@Pc(119) int local119 = local78 ? this.anInt4802 : -this.anInt4802;
					@Pc(121) int local121 = 0;
					@Pc(132) int local132;
					for (local132 = (this.anInt4810 * local119 >> 12) + Static341.anIntArray504[local108]; local132 < 0; local132 += 4096) {
					}
					while (local132 > 4096) {
						local132 -= 4096;
					}
					while (this.anInt4806 > local121 && local132 >= this.anIntArrayArray39[local70][local121]) {
						local121++;
					}
					@Pc(168) int local168 = local121 - 1;
					@Pc(175) int local175 = this.anIntArrayArray39[local70][local168];
					@Pc(182) int local182 = this.anIntArrayArray39[local70][local121];
					if (local132 > this.anInt4795 + local175 && local132 < local182 - this.anInt4795) {
						local11[local108] = this.anIntArrayArray40[local70][local168];
					} else {
						local11[local108] = 0;
					}
				}
			} else {
				Static459.method3327(local11, 0, Static80.anInt1616, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "(I)V")
	private void method3711() {
		@Pc(12) Random local12 = new Random((long) this.anInt4811);
		this.anInt4810 = 4096 / this.anInt4806;
		this.anInt4808 = 4096 / this.anInt4811;
		this.anInt4795 = this.anInt4797 / 2;
		@Pc(35) int local35 = this.anInt4810 / 2;
		this.anIntArray313 = new int[this.anInt4811 + 1];
		@Pc(47) int local47 = this.anInt4808 / 2;
		this.anIntArrayArray39 = new int[this.anInt4811][this.anInt4806 + 1];
		this.anIntArrayArray40 = new int[this.anInt4811][this.anInt4806];
		this.anIntArray313[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt4811; local70++) {
			@Pc(80) int local80;
			@Pc(92) int local92;
			if (local70 > 0) {
				local80 = this.anInt4808;
				local92 = (Static226.method3443(local12, 4096) - 2048) * this.anInt4805 >> 12;
				@Pc(100) int local100 = local80 + (local92 * local47 >> 12);
				this.anIntArray313[local70] = local100 + this.anIntArray313[local70 - 1];
			}
			this.anIntArrayArray39[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt4806; local80++) {
				if (local80 > 0) {
					local92 = this.anInt4810;
					@Pc(143) int local143 = (Static226.method3443(local12, 4096) - 2048) * this.anInt4796 >> 12;
					local92 += local35 * local143 >> 12;
					this.anIntArrayArray39[local70][local80] = local92 + this.anIntArrayArray39[local70][local80 - 1];
				}
				this.anIntArrayArray40[local70][local80] = this.anInt4807 > 0 ? 4096 - Static226.method3443(local12, this.anInt4807) : 4096;
			}
			this.anIntArrayArray39[local70][this.anInt4806] = 4096;
		}
		this.anIntArray313[this.anInt4811] = 4096;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V")
	@Override
	public void method5509() {
		this.method3711();
	}
}
