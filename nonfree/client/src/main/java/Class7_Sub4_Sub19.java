import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class7_Sub4_Sub19 extends Class7_Sub4 {

	@OriginalMember(owner = "client!lm", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
	private int anInt3804;

	@OriginalMember(owner = "client!lm", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!lm", name = "P", descriptor = "[I")
	private int[] anIntArray519;

	@OriginalMember(owner = "client!lm", name = "ab", descriptor = "I")
	private int anInt3818;

	@OriginalMember(owner = "client!lm", name = "cb", descriptor = "I")
	private int anInt3820;

	@OriginalMember(owner = "client!lm", name = "K", descriptor = "I")
	private int anInt3805 = 1024;

	@OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
	private int anInt3803 = 8;

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
	private int anInt3802 = 1024;

	@OriginalMember(owner = "client!lm", name = "X", descriptor = "I")
	private int anInt3816 = 81;

	@OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
	private int anInt3801 = 204;

	@OriginalMember(owner = "client!lm", name = "S", descriptor = "I")
	private int anInt3811 = 0;

	@OriginalMember(owner = "client!lm", name = "V", descriptor = "I")
	private int anInt3814 = 4;

	@OriginalMember(owner = "client!lm", name = "Z", descriptor = "I")
	private int anInt3817 = 409;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)V")
	private void method3443() {
		@Pc(12) Random local12 = new Random((long) this.anInt3803);
		this.anInt3804 = this.anInt3816 / 2;
		this.anInt3820 = 4096 / this.anInt3814;
		this.anInt3818 = 4096 / this.anInt3803;
		@Pc(35) int local35 = this.anInt3820 / 2;
		@Pc(40) int local40 = this.anInt3818 / 2;
		this.anIntArrayArray27 = new int[this.anInt3803][this.anInt3814];
		this.anIntArray519 = new int[this.anInt3803 + 1];
		this.anIntArrayArray26 = new int[this.anInt3803][this.anInt3814 + 1];
		this.anIntArray519[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt3803; local70++) {
			@Pc(77) int local77;
			@Pc(89) int local89;
			if (local70 > 0) {
				local77 = this.anInt3818;
				local89 = (Static350.method5618(4096, local12) - 2048) * this.anInt3801 >> 12;
				@Pc(97) int local97 = local77 + (local40 * local89 >> 12);
				this.anIntArray519[local70] = this.anIntArray519[local70 - 1] + local97;
			}
			this.anIntArrayArray26[local70][0] = 0;
			for (local77 = 0; local77 < this.anInt3814; local77++) {
				if (local77 > 0) {
					local89 = this.anInt3820;
					@Pc(140) int local140 = (Static350.method5618(4096, local12) - 2048) * this.anInt3817 >> 12;
					local89 += local140 * local35 >> 12;
					this.anIntArrayArray26[local70][local77] = local89 + this.anIntArrayArray26[local70][local77 - 1];
				}
				this.anIntArrayArray27[local70][local77] = this.anInt3805 > 0 ? 4096 - Static350.method5618(this.anInt3805, local12) : 4096;
			}
			this.anIntArrayArray26[local70][this.anInt3814] = 4096;
		}
		this.anIntArray519[this.anInt3803] = 4096;
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)V")
	@Override
	public void method5635() {
		this.method3443();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = Static314.anIntArray756[arg0] + this.anInt3811; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (this.anInt3803 > local25 && this.anIntArray519[local25] <= local32) {
				local25++;
			}
			@Pc(66) int local66 = local25 - 1;
			@Pc(77) boolean local77 = (local25 & 0x1) == 0;
			@Pc(82) int local82 = this.anIntArray519[local25];
			@Pc(89) int local89 = this.anIntArray519[local25 - 1];
			if (local32 > this.anInt3804 + local89 && local82 - this.anInt3804 > local32) {
				for (@Pc(115) int local115 = 0; local115 < Static201.anInt4174; local115++) {
					@Pc(119) int local119 = 0;
					@Pc(128) int local128 = local77 ? this.anInt3802 : -this.anInt3802;
					@Pc(139) int local139;
					for (local139 = (this.anInt3820 * local128 >> 12) + Static129.anIntArray375[local115]; local139 < 0; local139 += 4096) {
					}
					while (local139 > 4096) {
						local139 -= 4096;
					}
					while (local119 < this.anInt3814 && this.anIntArrayArray26[local66][local119] <= local139) {
						local119++;
					}
					@Pc(174) int local174 = local119 - 1;
					@Pc(181) int local181 = this.anIntArrayArray26[local66][local174];
					@Pc(188) int local188 = this.anIntArrayArray26[local66][local119];
					if (this.anInt3804 + local181 < local139 && local139 < local188 - this.anInt3804) {
						local11[local115] = this.anIntArrayArray27[local66][local174];
					} else {
						local11[local115] = 0;
					}
				}
			} else {
				Static366.method4203(local11, 0, Static201.anInt4174, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3814 = arg0.method2772();
		} else if (arg1 == 1) {
			this.anInt3803 = arg0.method2772();
		} else if (arg1 == 2) {
			this.anInt3817 = arg0.method2764();
		} else if (arg1 == 3) {
			this.anInt3801 = arg0.method2764();
		} else if (arg1 == 4) {
			this.anInt3802 = arg0.method2764();
		} else if (arg1 == 5) {
			this.anInt3811 = arg0.method2764();
		} else if (arg1 == 6) {
			this.anInt3816 = arg0.method2764();
		} else if (arg1 == 7) {
			this.anInt3805 = arg0.method2764();
		}
	}
}
