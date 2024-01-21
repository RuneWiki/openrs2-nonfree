import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
	private int anInt2053;

	@OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
	private int anInt2055;

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
	private int anInt2060;

	@OriginalMember(owner = "client!kc", name = "eb", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!kc", name = "jb", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
	private int anInt2049 = 409;

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
	private int anInt2050 = 0;

	@OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
	private int anInt2052 = 4;

	@OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
	private int anInt2059 = 1024;

	@OriginalMember(owner = "client!kc", name = "hb", descriptor = "I")
	private int anInt2065 = 8;

	@OriginalMember(owner = "client!kc", name = "fb", descriptor = "I")
	private int anInt2063 = 81;

	@OriginalMember(owner = "client!kc", name = "db", descriptor = "I")
	private int anInt2062 = 1024;

	@OriginalMember(owner = "client!kc", name = "ib", descriptor = "I")
	private int anInt2066 = 204;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
	@Override
	public void method3260() {
		this.method1645();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2052 = arg0.method260();
		} else if (arg1 == 1) {
			this.anInt2065 = arg0.method260();
		} else if (arg1 == 2) {
			this.anInt2049 = arg0.method269();
		} else if (arg1 == 3) {
			this.anInt2066 = arg0.method269();
		} else if (arg1 == 4) {
			this.anInt2062 = arg0.method269();
		} else if (arg1 == 5) {
			this.anInt2050 = arg0.method269();
		} else if (arg1 == 6) {
			this.anInt2063 = arg0.method269();
		} else if (arg1 == 7) {
			this.anInt2059 = arg0.method269();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(23) int local23 = 0;
			@Pc(31) int local31;
			for (local31 = Static81.anIntArray174[arg0] + this.anInt2050; local31 < 0; local31 += 4096) {
			}
			while (local31 > 4096) {
				local31 -= 4096;
			}
			while (local23 < this.anInt2065 && local31 >= this.anIntArray205[local23]) {
				local23++;
			}
			@Pc(74) boolean local74 = (local23 & 0x1) == 0;
			@Pc(78) int local78 = local23 - 1;
			@Pc(85) int local85 = this.anIntArray205[local23 - 1];
			@Pc(90) int local90 = this.anIntArray205[local23];
			if (local31 > this.anInt2055 + local85 && local90 - this.anInt2055 > local31) {
				for (@Pc(105) int local105 = 0; local105 < Static135.anInt2897; local105++) {
					@Pc(116) int local116 = local74 ? this.anInt2062 : -this.anInt2062;
					@Pc(127) int local127 = (local116 * this.anInt2053 >> 12) + Static107.anIntArray304[local105];
					@Pc(129) int local129 = 0;
					while (local127 < 0) {
						local127 += 4096;
					}
					while (local127 > 4096) {
						local127 -= 4096;
					}
					while (this.anInt2052 > local129 && this.anIntArrayArray16[local78][local129] <= local127) {
						local129++;
					}
					@Pc(166) int local166 = this.anIntArrayArray16[local78][local129];
					@Pc(170) int local170 = local129 - 1;
					@Pc(177) int local177 = this.anIntArrayArray16[local78][local170];
					if (this.anInt2055 + local177 < local127 && local166 - this.anInt2055 > local127) {
						local11[local105] = this.anIntArrayArray17[local78][local170];
					} else {
						local11[local105] = 0;
					}
				}
			} else {
				Static222.method2223(local11, 0, Static135.anInt2897, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
	private void method1645() {
		@Pc(12) Random local12 = new Random((long) this.anInt2065);
		this.anInt2053 = 4096 / this.anInt2052;
		@Pc(23) int local23 = this.anInt2053 / 2;
		this.anIntArrayArray16 = new int[this.anInt2065][this.anInt2052 + 1];
		this.anIntArrayArray17 = new int[this.anInt2065][this.anInt2052];
		this.anInt2060 = 4096 / this.anInt2065;
		@Pc(50) int local50 = this.anInt2060 / 2;
		this.anInt2055 = this.anInt2063 / 2;
		this.anIntArray205 = new int[this.anInt2065 + 1];
		this.anIntArray205[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt2065; local70++) {
			@Pc(80) int local80;
			@Pc(92) int local92;
			if (local70 > 0) {
				local80 = this.anInt2060;
				local92 = (Static4.method87(local12, 4096) - 2048) * this.anInt2066 >> 12;
				@Pc(100) int local100 = local80 + (local92 * local50 >> 12);
				this.anIntArray205[local70] = local100 + this.anIntArray205[local70 - 1];
			}
			this.anIntArrayArray16[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt2052; local80++) {
				if (local80 > 0) {
					local92 = this.anInt2053;
					@Pc(140) int local140 = (Static4.method87(local12, 4096) - 2048) * this.anInt2049 >> 12;
					local92 += local140 * local23 >> 12;
					this.anIntArrayArray16[local70][local80] = local92 + this.anIntArrayArray16[local70][local80 - 1];
				}
				this.anIntArrayArray17[local70][local80] = this.anInt2059 > 0 ? 4096 - Static4.method87(local12, this.anInt2059) : 4096;
			}
			this.anIntArrayArray16[local70][this.anInt2052] = 4096;
		}
		this.anIntArray205[this.anInt2065] = 4096;
	}
}
