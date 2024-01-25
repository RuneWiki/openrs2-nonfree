import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class3_Sub4_Sub4 extends Class3_Sub4 {

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
	private int anInt744;

	@OriginalMember(owner = "client!cc", name = "Y", descriptor = "[I")
	private int[] anIntArray41;

	@OriginalMember(owner = "client!cc", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
	private int anInt757;

	@OriginalMember(owner = "client!cc", name = "fb", descriptor = "I")
	private int anInt758;

	@OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
	private int anInt742 = 0;

	@OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
	private int anInt752 = 81;

	@OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
	private int anInt750 = 204;

	@OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
	private int anInt755 = 4;

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
	private int anInt748 = 1024;

	@OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
	private int anInt751 = 8;

	@OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
	private int anInt754 = 409;

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
	private int anInt743 = 1024;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
	private void method855() {
		@Pc(12) Random local12 = new Random((long) this.anInt751);
		this.anInt757 = 4096 / this.anInt755;
		this.anInt758 = this.anInt752 / 2;
		this.anInt744 = 4096 / this.anInt751;
		@Pc(35) int local35 = this.anInt757 / 2;
		@Pc(40) int local40 = this.anInt744 / 2;
		this.anIntArrayArray6 = new int[this.anInt751][this.anInt755 + 1];
		this.anIntArrayArray5 = new int[this.anInt751][this.anInt755];
		this.anIntArray41 = new int[this.anInt751 + 1];
		this.anIntArray41[0] = 0;
		for (@Pc(79) int local79 = 0; local79 < this.anInt751; local79++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local79 > 0) {
				local86 = this.anInt744;
				local98 = (Static438.method2068(local12, 4096) - 2048) * this.anInt750 >> 12;
				@Pc(106) int local106 = local86 + (local40 * local98 >> 12);
				this.anIntArray41[local79] = local106 + this.anIntArray41[local79 - 1];
			}
			this.anIntArrayArray6[local79][0] = 0;
			for (local86 = 0; local86 < this.anInt755; local86++) {
				if (local86 > 0) {
					local98 = this.anInt757;
					@Pc(149) int local149 = (Static438.method2068(local12, 4096) - 2048) * this.anInt754 >> 12;
					local98 += local35 * local149 >> 12;
					this.anIntArrayArray6[local79][local86] = this.anIntArrayArray6[local79][local86 - 1] + local98;
				}
				this.anIntArrayArray5[local79][local86] = this.anInt748 <= 0 ? 4096 : 4096 - Static438.method2068(local12, this.anInt748);
			}
			this.anIntArrayArray6[local79][this.anInt755] = 4096;
		}
		this.anIntArray41[this.anInt751] = 4096;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt755 = arg0.method4096();
		} else if (arg1 == 1) {
			this.anInt751 = arg0.method4096();
		} else if (arg1 == 2) {
			this.anInt754 = arg0.method4083();
		} else if (arg1 == 3) {
			this.anInt750 = arg0.method4083();
		} else if (arg1 == 4) {
			this.anInt743 = arg0.method4083();
		} else if (arg1 == 5) {
			this.anInt742 = arg0.method4083();
		} else if (arg1 == 6) {
			this.anInt752 = arg0.method4083();
		} else if (arg1 == 7) {
			this.anInt748 = arg0.method4083();
		}
	}

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)V")
	@Override
	public void method6146() {
		this.method855();
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = this.anInt742 + Static317.anIntArray337[arg0]; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (this.anInt751 > local17 && local24 >= this.anIntArray41[local17]) {
				local17++;
			}
			@Pc(63) int local63 = local17 - 1;
			@Pc(74) boolean local74 = (local17 & 0x1) == 0;
			@Pc(79) int local79 = this.anIntArray41[local17];
			@Pc(86) int local86 = this.anIntArray41[local17 - 1];
			if (this.anInt758 + local86 < local24 && local24 < local79 - this.anInt758) {
				for (@Pc(109) int local109 = 0; local109 < Static148.anInt2687; local109++) {
					@Pc(120) int local120 = local74 ? this.anInt743 : -this.anInt743;
					@Pc(122) int local122 = 0;
					@Pc(133) int local133;
					for (local133 = (local120 * this.anInt757 >> 12) + Static401.anIntArray419[local109]; local133 < 0; local133 += 4096) {
					}
					while (local133 > 4096) {
						local133 -= 4096;
					}
					while (local122 < this.anInt755 && this.anIntArrayArray6[local63][local122] <= local133) {
						local122++;
					}
					@Pc(170) int local170 = local122 - 1;
					@Pc(177) int local177 = this.anIntArrayArray6[local63][local122];
					@Pc(184) int local184 = this.anIntArrayArray6[local63][local170];
					if (this.anInt758 + local184 < local133 && local133 < local177 - this.anInt758) {
						local11[local109] = this.anIntArrayArray5[local63][local170];
					} else {
						local11[local109] = 0;
					}
				}
			} else {
				Static466.method206(local11, 0, Static148.anInt2687, 0);
			}
		}
		return local11;
	}
}
