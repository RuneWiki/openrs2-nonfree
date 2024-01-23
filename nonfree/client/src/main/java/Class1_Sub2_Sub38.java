import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class1_Sub2_Sub38 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wa", name = "Q", descriptor = "I")
	private int anInt5781;

	@OriginalMember(owner = "client!wa", name = "R", descriptor = "[I")
	private int[] anIntArray525;

	@OriginalMember(owner = "client!wa", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!wa", name = "eb", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!wa", name = "gb", descriptor = "I")
	private int anInt5792;

	@OriginalMember(owner = "client!wa", name = "mb", descriptor = "I")
	private int anInt5798;

	@OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
	private int anInt5775 = 8;

	@OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
	private int anInt5788 = 409;

	@OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
	private int anInt5789 = 0;

	@OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
	private int anInt5787 = 4;

	@OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
	private int anInt5776 = 204;

	@OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
	private int anInt5784 = 1024;

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
	private int anInt5783 = 81;

	@OriginalMember(owner = "client!wa", name = "lb", descriptor = "I")
	private int anInt5797 = 1024;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5787 = arg0.method2595();
		} else if (arg1 == 1) {
			this.anInt5775 = arg0.method2595();
		} else if (arg1 == 2) {
			this.anInt5788 = arg0.method2593();
		} else if (arg1 == 3) {
			this.anInt5776 = arg0.method2593();
		} else if (arg1 == 4) {
			this.anInt5797 = arg0.method2593();
		} else if (arg1 == 5) {
			this.anInt5789 = arg0.method2593();
		} else if (arg1 == 6) {
			this.anInt5783 = arg0.method2593();
		} else if (arg1 == 7) {
			this.anInt5784 = arg0.method2593();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = Static7.anIntArray13[arg0] + this.anInt5789; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt5775 > local22 && local29 >= this.anIntArray525[local22]) {
				local22++;
			}
			@Pc(62) int local62 = local22 - 1;
			@Pc(71) boolean local71 = (local22 & 0x1) == 0;
			@Pc(76) int local76 = this.anIntArray525[local22];
			@Pc(83) int local83 = this.anIntArray525[local22 - 1];
			if (local29 > this.anInt5798 + local83 && local76 - this.anInt5798 > local29) {
				for (@Pc(113) int local113 = 0; local113 < Static299.anInt5670; local113++) {
					@Pc(125) int local125 = local71 ? this.anInt5797 : -this.anInt5797;
					@Pc(136) int local136;
					for (local136 = (this.anInt5781 * local125 >> 12) + Static310.anIntArray108[local113]; local136 < 0; local136 += 4096) {
					}
					@Pc(146) int local146 = 0;
					while (local136 > 4096) {
						local136 -= 4096;
					}
					while (this.anInt5787 > local146 && this.anIntArrayArray48[local62][local146] <= local136) {
						local146++;
					}
					@Pc(180) int local180 = this.anIntArrayArray48[local62][local146];
					@Pc(184) int local184 = local146 - 1;
					@Pc(191) int local191 = this.anIntArrayArray48[local62][local184];
					if (local136 > local191 + this.anInt5798 && local180 - this.anInt5798 > local136) {
						local15[local113] = this.anIntArrayArray49[local62][local184];
					} else {
						local15[local113] = 0;
					}
				}
			} else {
				Static319.method514(local15, 0, Static299.anInt5670, 0);
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)V")
	private void method4553() {
		@Pc(12) Random local12 = new Random((long) this.anInt5775);
		this.anInt5781 = 4096 / this.anInt5787;
		this.anInt5798 = this.anInt5783 / 2;
		@Pc(35) int local35 = this.anInt5781 / 2;
		this.anInt5792 = 4096 / this.anInt5775;
		this.anIntArrayArray48 = new int[this.anInt5775][this.anInt5787 + 1];
		this.anIntArray525 = new int[this.anInt5775 + 1];
		this.anIntArrayArray49 = new int[this.anInt5775][this.anInt5787];
		this.anIntArray525[0] = 0;
		@Pc(74) int local74 = this.anInt5792 / 2;
		for (@Pc(76) int local76 = 0; local76 < this.anInt5775; local76++) {
			@Pc(91) int local91;
			@Pc(103) int local103;
			if (local76 > 0) {
				local91 = this.anInt5792;
				local103 = (Static165.method2794(local12, 4096) - 2048) * this.anInt5776 >> 12;
				@Pc(111) int local111 = local91 + (local103 * local74 >> 12);
				this.anIntArray525[local76] = this.anIntArray525[local76 - 1] + local111;
			}
			this.anIntArrayArray48[local76][0] = 0;
			for (local91 = 0; local91 < this.anInt5787; local91++) {
				if (local91 > 0) {
					local103 = this.anInt5781;
					@Pc(158) int local158 = (Static165.method2794(local12, 4096) - 2048) * this.anInt5788 >> 12;
					local103 += local35 * local158 >> 12;
					this.anIntArrayArray48[local76][local91] = local103 + this.anIntArrayArray48[local76][local91 - 1];
				}
				this.anIntArrayArray49[local76][local91] = this.anInt5784 <= 0 ? 4096 : 4096 - Static165.method2794(local12, this.anInt5784);
			}
			this.anIntArrayArray48[local76][this.anInt5787] = 4096;
		}
		this.anIntArray525[this.anInt5775] = 4096;
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
	@Override
	public void method4578() {
		this.method4553();
	}
}
