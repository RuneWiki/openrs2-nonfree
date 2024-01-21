import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class2_Sub4_Sub31 extends Class2_Sub4 {

	@OriginalMember(owner = "client!rf", name = "U", descriptor = "[I")
	private int[] anIntArray314;

	@OriginalMember(owner = "client!rf", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!rf", name = "bb", descriptor = "I")
	private int anInt3666;

	@OriginalMember(owner = "client!rf", name = "eb", descriptor = "I")
	private int anInt3669;

	@OriginalMember(owner = "client!rf", name = "ib", descriptor = "I")
	private int anInt3673;

	@OriginalMember(owner = "client!rf", name = "lb", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!rf", name = "cb", descriptor = "I")
	private int anInt3667 = 1024;

	@OriginalMember(owner = "client!rf", name = "fb", descriptor = "I")
	private int anInt3670 = 81;

	@OriginalMember(owner = "client!rf", name = "ob", descriptor = "I")
	private int anInt3678 = 204;

	@OriginalMember(owner = "client!rf", name = "nb", descriptor = "I")
	private int anInt3677 = 409;

	@OriginalMember(owner = "client!rf", name = "kb", descriptor = "I")
	private int anInt3675 = 4;

	@OriginalMember(owner = "client!rf", name = "gb", descriptor = "I")
	private int anInt3671 = 8;

	@OriginalMember(owner = "client!rf", name = "ab", descriptor = "I")
	private int anInt3665 = 1024;

	@OriginalMember(owner = "client!rf", name = "sb", descriptor = "I")
	private int anInt3680 = 0;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)V")
	private void method2523() {
		@Pc(12) Random local12 = new Random((long) this.anInt3671);
		this.anIntArrayArray28 = new int[this.anInt3671][this.anInt3675 + 1];
		this.anInt3666 = 4096 / this.anInt3671;
		this.anInt3669 = this.anInt3670 / 2;
		this.anIntArray314 = new int[this.anInt3671 + 1];
		this.anInt3673 = 4096 / this.anInt3675;
		this.anIntArray314[0] = 0;
		this.anIntArrayArray29 = new int[this.anInt3671][this.anInt3675];
		@Pc(63) int local63 = this.anInt3673 / 2;
		@Pc(68) int local68 = this.anInt3666 / 2;
		for (@Pc(70) int local70 = 0; local70 < this.anInt3671; local70++) {
			@Pc(77) int local77;
			@Pc(89) int local89;
			if (local70 > 0) {
				local77 = this.anInt3666;
				local89 = (Static120.method1889(local12, 4096) - 2048) * this.anInt3678 >> 12;
				@Pc(97) int local97 = local77 + (local68 * local89 >> 12);
				this.anIntArray314[local70] = local97 + this.anIntArray314[local70 - 1];
			}
			this.anIntArrayArray28[local70][0] = 0;
			for (local77 = 0; local77 < this.anInt3675; local77++) {
				if (local77 > 0) {
					local89 = this.anInt3673;
					@Pc(140) int local140 = (Static120.method1889(local12, 4096) - 2048) * this.anInt3677 >> 12;
					local89 += local140 * local63 >> 12;
					this.anIntArrayArray28[local70][local77] = local89 + this.anIntArrayArray28[local70][local77 - 1];
				}
				this.anIntArrayArray29[local70][local77] = this.anInt3665 > 0 ? 4096 - Static120.method1889(local12, this.anInt3665) : 4096;
			}
			this.anIntArrayArray28[local70][this.anInt3675] = 4096;
		}
		this.anIntArray314[this.anInt3671] = 4096;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			for (local20 = this.anInt3680 + Static2.anIntArray5[arg0]; local20 < 0; local20 += 4096) {
			}
			while (local20 > 4096) {
				local20 -= 4096;
			}
			while (this.anInt3671 > local13 && local20 >= this.anIntArray314[local13]) {
				local13++;
			}
			@Pc(55) int local55 = local13 - 1;
			@Pc(63) boolean local63 = (local13 & 0x1) == 0;
			@Pc(70) int local70 = this.anIntArray314[local13 - 1];
			@Pc(75) int local75 = this.anIntArray314[local13];
			if (this.anInt3669 + local70 < local20 && local20 < local75 - this.anInt3669) {
				for (@Pc(90) int local90 = 0; local90 < Static118.anInt2608; local90++) {
					@Pc(101) int local101 = local63 ? this.anInt3667 : -this.anInt3667;
					@Pc(112) int local112;
					for (local112 = Static141.anIntArray130[local90] + (this.anInt3673 * local101 >> 12); local112 < 0; local112 += 4096) {
					}
					@Pc(122) int local122 = 0;
					while (local112 > 4096) {
						local112 -= 4096;
					}
					while (this.anInt3675 > local122 && local112 >= this.anIntArrayArray28[local55][local122]) {
						local122++;
					}
					@Pc(155) int local155 = local122 - 1;
					@Pc(162) int local162 = this.anIntArrayArray28[local55][local122];
					@Pc(169) int local169 = this.anIntArrayArray28[local55][local155];
					if (local112 > this.anInt3669 + local169 && local112 < local162 - this.anInt3669) {
						local7[local90] = this.anIntArrayArray29[local55][local155];
					} else {
						local7[local90] = 0;
					}
				}
			} else {
				Static220.method1004(local7, 0, Static118.anInt2608, 0);
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3675 = arg1.method1534();
		} else if (arg0 == 1) {
			this.anInt3671 = arg1.method1534();
		} else if (arg0 == 2) {
			this.anInt3677 = arg1.method1557();
		} else if (arg0 == 3) {
			this.anInt3678 = arg1.method1557();
		} else if (arg0 == 4) {
			this.anInt3667 = arg1.method1557();
		} else if (arg0 == 5) {
			this.anInt3680 = arg1.method1557();
		} else if (arg0 == 6) {
			this.anInt3670 = arg1.method1557();
		} else if (arg0 == 7) {
			this.anInt3665 = arg1.method1557();
		}
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
	@Override
	public void method3133() {
		this.method2523();
	}
}
