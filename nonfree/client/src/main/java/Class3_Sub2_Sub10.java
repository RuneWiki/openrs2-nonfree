import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class3_Sub2_Sub10 extends Class3_Sub2 {

	@OriginalMember(owner = "client!fi", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!fi", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!fi", name = "O", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
	private int anInt3755;

	@OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
	private int anInt3759;

	@OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
	private int anInt3760;

	@OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
	private int anInt3749 = 1024;

	@OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
	private int anInt3750 = 0;

	@OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
	private int anInt3754 = 4;

	@OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
	private int anInt3758 = 409;

	@OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
	private int anInt3756 = 81;

	@OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
	private int anInt3748 = 8;

	@OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
	private int anInt3757 = 204;

	@OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
	private int anInt3763 = 1024;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
	private void method3315() {
		@Pc(12) Random local12 = new Random((long) this.anInt3748);
		this.anInt3755 = 4096 / this.anInt3748;
		this.anInt3760 = this.anInt3756 / 2;
		this.anInt3759 = 4096 / this.anInt3754;
		@Pc(35) int local35 = this.anInt3759 / 2;
		this.anIntArray202 = new int[this.anInt3748 + 1];
		@Pc(53) int local53 = this.anInt3755 / 2;
		this.anIntArrayArray30 = new int[this.anInt3748][this.anInt3754 + 1];
		this.anIntArrayArray31 = new int[this.anInt3748][this.anInt3754];
		this.anIntArray202[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt3748; local76++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local76 > 0) {
				local86 = this.anInt3755;
				local98 = (Static106.method2589(local12, 4096) - 2048) * this.anInt3757 >> 12;
				@Pc(106) int local106 = local86 + (local53 * local98 >> 12);
				this.anIntArray202[local76] = local106 + this.anIntArray202[local76 - 1];
			}
			this.anIntArrayArray30[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt3754; local86++) {
				if (local86 > 0) {
					local98 = this.anInt3759;
					@Pc(146) int local146 = (Static106.method2589(local12, 4096) - 2048) * this.anInt3758 >> 12;
					local98 += local146 * local35 >> 12;
					this.anIntArrayArray30[local76][local86] = local98 + this.anIntArrayArray30[local76][local86 - 1];
				}
				this.anIntArrayArray31[local76][local86] = this.anInt3763 > 0 ? 4096 - Static106.method2589(local12, this.anInt3763) : 4096;
			}
			this.anIntArrayArray30[local76][this.anInt3754] = 4096;
		}
		this.anIntArray202[this.anInt3748] = 4096;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = this.anInt3750 + Static328.anIntArray387[arg0]; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (this.anInt3748 > local25 && local32 >= this.anIntArray202[local25]) {
				local25++;
			}
			@Pc(68) int local68 = local25 - 1;
			@Pc(79) boolean local79 = (local25 & 0x1) == 0;
			@Pc(84) int local84 = this.anIntArray202[local25];
			@Pc(91) int local91 = this.anIntArray202[local25 - 1];
			if (local32 > this.anInt3760 + local91 && local84 - this.anInt3760 > local32) {
				for (@Pc(106) int local106 = 0; local106 < Static164.anInt8839; local106++) {
					@Pc(117) int local117 = local79 ? this.anInt3749 : -this.anInt3749;
					@Pc(119) int local119 = 0;
					@Pc(130) int local130;
					for (local130 = (local117 * this.anInt3759 >> 12) + Static352.anIntArray400[local106]; local130 < 0; local130 += 4096) {
					}
					while (local130 > 4096) {
						local130 -= 4096;
					}
					while (local119 < this.anInt3754 && local130 >= this.anIntArrayArray30[local68][local119]) {
						local119++;
					}
					@Pc(167) int local167 = local119 - 1;
					@Pc(174) int local174 = this.anIntArrayArray30[local68][local167];
					@Pc(181) int local181 = this.anIntArrayArray30[local68][local119];
					if (local130 > this.anInt3760 + local174 && local130 < local181 - this.anInt3760) {
						local11[local106] = this.anIntArrayArray31[local68][local167];
					} else {
						local11[local106] = 0;
					}
				}
			} else {
				Static655.method6405(local11, 0, Static164.anInt8839, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	@Override
	public void method8332() {
		this.method3315();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt3754 = arg1.method8401();
		} else if (arg0 == 1) {
			this.anInt3748 = arg1.method8401();
		} else if (arg0 == 2) {
			this.anInt3758 = arg1.method8414();
		} else if (arg0 == 3) {
			this.anInt3757 = arg1.method8414();
		} else if (arg0 == 4) {
			this.anInt3749 = arg1.method8414();
		} else if (arg0 == 5) {
			this.anInt3750 = arg1.method8414();
		} else if (arg0 == 6) {
			this.anInt3756 = arg1.method8414();
		} else if (arg0 == 7) {
			this.anInt3763 = arg1.method8414();
		}
	}
}
