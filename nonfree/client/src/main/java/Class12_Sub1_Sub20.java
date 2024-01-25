import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class12_Sub1_Sub20 extends Class12_Sub1 {

	@OriginalMember(owner = "client!ok", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!ok", name = "J", descriptor = "[I")
	private int[] anIntArray460;

	@OriginalMember(owner = "client!ok", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
	private int anInt6639;

	@OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
	private int anInt6641;

	@OriginalMember(owner = "client!ok", name = "Y", descriptor = "I")
	private int anInt6646;

	@OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
	private int anInt6631 = 81;

	@OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
	private int anInt6632 = 1024;

	@OriginalMember(owner = "client!ok", name = "Q", descriptor = "I")
	private int anInt6638 = 4;

	@OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
	private int anInt6636 = 1024;

	@OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
	private int anInt6640 = 0;

	@OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
	private int anInt6643 = 8;

	@OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
	private int anInt6637 = 409;

	@OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
	private int anInt6635 = 204;

	static {
		new Class88("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6638 = arg0.method5216();
		} else if (arg1 == 1) {
			this.anInt6643 = arg0.method5216();
		} else if (arg1 == 2) {
			this.anInt6637 = arg0.method5199();
		} else if (arg1 == 3) {
			this.anInt6635 = arg0.method5199();
		} else if (arg1 == 4) {
			this.anInt6632 = arg0.method5199();
		} else if (arg1 == 5) {
			this.anInt6640 = arg0.method5199();
		} else if (arg1 == 6) {
			this.anInt6631 = arg0.method5199();
		} else if (arg1 == 7) {
			this.anInt6636 = arg0.method5199();
		}
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
	@Override
	public void method7797() {
		this.method5550();
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(Z)V")
	private void method5550() {
		@Pc(12) Random local12 = new Random((long) this.anInt6643);
		this.anInt6646 = this.anInt6631 / 2;
		this.anInt6641 = 4096 / this.anInt6643;
		this.anInt6639 = 4096 / this.anInt6638;
		@Pc(35) int local35 = this.anInt6639 / 2;
		@Pc(46) int local46 = this.anInt6641 / 2;
		this.anIntArray460 = new int[this.anInt6643 + 1];
		this.anIntArrayArray58 = new int[this.anInt6643][this.anInt6638];
		this.anIntArrayArray59 = new int[this.anInt6643][this.anInt6638 + 1];
		this.anIntArray460[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt6643; local76++) {
			@Pc(83) int local83;
			@Pc(95) int local95;
			if (local76 > 0) {
				local83 = this.anInt6641;
				local95 = (Static114.method2345(local12, 4096) - 2048) * this.anInt6635 >> 12;
				@Pc(103) int local103 = local83 + (local95 * local46 >> 12);
				this.anIntArray460[local76] = local103 + this.anIntArray460[local76 - 1];
			}
			this.anIntArrayArray59[local76][0] = 0;
			for (local83 = 0; local83 < this.anInt6638; local83++) {
				if (local83 > 0) {
					local95 = this.anInt6639;
					@Pc(146) int local146 = (Static114.method2345(local12, 4096) - 2048) * this.anInt6637 >> 12;
					local95 += local146 * local35 >> 12;
					this.anIntArrayArray59[local76][local83] = local95 + this.anIntArrayArray59[local76][local83 - 1];
				}
				this.anIntArrayArray58[local76][local83] = this.anInt6636 <= 0 ? 4096 : 4096 - Static114.method2345(local12, this.anInt6636);
			}
			this.anIntArrayArray59[local76][this.anInt6638] = 4096;
		}
		this.anIntArray460[this.anInt6643] = 4096;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(23) int local23 = 0;
			@Pc(31) int local31;
			for (local31 = Static353.anIntArray458[arg0] + this.anInt6640; local31 < 0; local31 += 4096) {
			}
			while (local31 > 4096) {
				local31 -= 4096;
			}
			while (this.anInt6643 > local23 && this.anIntArray460[local23] <= local31) {
				local23++;
			}
			@Pc(63) int local63 = local23 - 1;
			@Pc(71) boolean local71 = (local23 & 0x1) == 0;
			@Pc(76) int local76 = this.anIntArray460[local23];
			@Pc(83) int local83 = this.anIntArray460[local23 - 1];
			if (local83 + this.anInt6646 < local31 && local31 < local76 - this.anInt6646) {
				for (@Pc(105) int local105 = 0; local105 < Static357.anInt6670; local105++) {
					@Pc(109) int local109 = 0;
					@Pc(118) int local118 = local71 ? this.anInt6632 : -this.anInt6632;
					@Pc(130) int local130;
					for (local130 = Static347.anIntArray455[local105] + (local118 * this.anInt6639 >> 12); local130 < 0; local130 += 4096) {
					}
					while (local130 > 4096) {
						local130 -= 4096;
					}
					while (local109 < this.anInt6638 && local130 >= this.anIntArrayArray59[local63][local109]) {
						local109++;
					}
					@Pc(170) int local170 = local109 - 1;
					@Pc(177) int local177 = this.anIntArrayArray59[local63][local170];
					@Pc(184) int local184 = this.anIntArrayArray59[local63][local109];
					if (local130 > local177 + this.anInt6646 && local184 - this.anInt6646 > local130) {
						local13[local105] = this.anIntArrayArray58[local63][local170];
					} else {
						local13[local105] = 0;
					}
				}
			} else {
				Static554.method3495(local13, 0, Static357.anInt6670, 0);
			}
		}
		return local13;
	}
}
