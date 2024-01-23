import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class1_Sub1_Sub22 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
	private int anInt3728;

	@OriginalMember(owner = "client!mc", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
	private int anInt3729;

	@OriginalMember(owner = "client!mc", name = "V", descriptor = "[I")
	private int[] anIntArray334;

	@OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
	private int anInt3731;

	@OriginalMember(owner = "client!mc", name = "hb", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
	private int anInt3724 = 8;

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
	private int anInt3722 = 1024;

	@OriginalMember(owner = "client!mc", name = "fb", descriptor = "I")
	private int anInt3739 = 4;

	@OriginalMember(owner = "client!mc", name = "eb", descriptor = "I")
	private int anInt3738 = 1024;

	@OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
	private int anInt3726 = 409;

	@OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
	private int anInt3737 = 204;

	@OriginalMember(owner = "client!mc", name = "bb", descriptor = "I")
	private int anInt3735 = 81;

	@OriginalMember(owner = "client!mc", name = "Z", descriptor = "I")
	private int anInt3733 = 0;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V")
	@Override
	public void method4720() {
		this.method2723();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3739 = arg0.method2199();
		} else if (arg1 == 1) {
			this.anInt3724 = arg0.method2199();
		} else if (arg1 == 2) {
			this.anInt3726 = arg0.method2244();
		} else if (arg1 == 3) {
			this.anInt3737 = arg0.method2244();
		} else if (arg1 == 4) {
			this.anInt3722 = arg0.method2244();
		} else if (arg1 == 5) {
			this.anInt3733 = arg0.method2244();
		} else if (arg1 == 6) {
			this.anInt3735 = arg0.method2244();
		} else if (arg1 == 7) {
			this.anInt3738 = arg0.method2244();
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
	private void method2723() {
		@Pc(8) Random local8 = new Random((long) this.anInt3724);
		this.anInt3731 = 4096 / this.anInt3724;
		this.anIntArrayArray48 = new int[this.anInt3724][this.anInt3739];
		this.anIntArrayArray47 = new int[this.anInt3724][this.anInt3739 + 1];
		this.anInt3729 = this.anInt3735 / 2;
		this.anInt3728 = 4096 / this.anInt3739;
		this.anIntArray334 = new int[this.anInt3724 + 1];
		this.anIntArray334[0] = 0;
		@Pc(63) int local63 = this.anInt3731 / 2;
		@Pc(68) int local68 = this.anInt3728 / 2;
		for (@Pc(70) int local70 = 0; local70 < this.anInt3724; local70++) {
			@Pc(84) int local84;
			@Pc(96) int local96;
			if (local70 > 0) {
				local84 = this.anInt3731;
				local96 = (Static207.method3275(4096, local8) - 2048) * this.anInt3737 >> 12;
				@Pc(104) int local104 = local84 + (local63 * local96 >> 12);
				this.anIntArray334[local70] = local104 + this.anIntArray334[local70 - 1];
			}
			this.anIntArrayArray47[local70][0] = 0;
			for (local84 = 0; local84 < this.anInt3739; local84++) {
				if (local84 > 0) {
					local96 = this.anInt3728;
					@Pc(148) int local148 = (Static207.method3275(4096, local8) - 2048) * this.anInt3726 >> 12;
					local96 += local68 * local148 >> 12;
					this.anIntArrayArray47[local70][local84] = local96 + this.anIntArrayArray47[local70][local84 - 1];
				}
				this.anIntArrayArray48[local70][local84] = this.anInt3738 > 0 ? 4096 - Static207.method3275(this.anInt3738, local8) : 4096;
			}
			this.anIntArrayArray47[local70][this.anInt3739] = 4096;
		}
		this.anIntArray334[this.anInt3724] = 4096;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt3733 + Static256.anIntArray474[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt3724 > local23 && local30 >= this.anIntArray334[local23]) {
				local23++;
			}
			@Pc(69) int local69 = local23 - 1;
			@Pc(80) boolean local80 = (local23 & 0x1) == 0;
			@Pc(85) int local85 = this.anIntArray334[local23];
			@Pc(92) int local92 = this.anIntArray334[local23 - 1];
			if (local30 > local92 + this.anInt3729 && local30 < local85 - this.anInt3729) {
				for (@Pc(106) int local106 = 0; local106 < Static62.anInt1350; local106++) {
					@Pc(122) int local122 = local80 ? this.anInt3722 : -this.anInt3722;
					@Pc(133) int local133 = (this.anInt3728 * local122 >> 12) + Static3.anIntArray3[local106];
					@Pc(135) int local135 = 0;
					while (local133 < 0) {
						local133 += 4096;
					}
					while (local133 > 4096) {
						local133 -= 4096;
					}
					while (this.anInt3739 > local135 && this.anIntArrayArray47[local69][local135] <= local133) {
						local135++;
					}
					@Pc(177) int local177 = this.anIntArrayArray47[local69][local135];
					@Pc(181) int local181 = local135 - 1;
					@Pc(188) int local188 = this.anIntArrayArray47[local69][local181];
					if (local133 > this.anInt3729 + local188 && local133 < local177 - this.anInt3729) {
						local17[local106] = this.anIntArrayArray48[local69][local181];
					} else {
						local17[local106] = 0;
					}
				}
			} else {
				Static319.method1417(local17, 0, Static62.anInt1350, 0);
			}
		}
		return local17;
	}
}
