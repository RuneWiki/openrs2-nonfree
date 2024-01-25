import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cca", name = "O", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!cca", name = "Q", descriptor = "I")
	private int anInt1381;

	@OriginalMember(owner = "client!cca", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!cca", name = "W", descriptor = "I")
	private int anInt1386;

	@OriginalMember(owner = "client!cca", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!cca", name = "cb", descriptor = "I")
	private int anInt1391;

	@OriginalMember(owner = "client!cca", name = "L", descriptor = "I")
	private int anInt1378 = 81;

	@OriginalMember(owner = "client!cca", name = "R", descriptor = "I")
	private int anInt1382 = 8;

	@OriginalMember(owner = "client!cca", name = "T", descriptor = "I")
	private int anInt1384 = 204;

	@OriginalMember(owner = "client!cca", name = "bb", descriptor = "I")
	private int anInt1390 = 409;

	@OriginalMember(owner = "client!cca", name = "Y", descriptor = "I")
	private int anInt1387 = 1024;

	@OriginalMember(owner = "client!cca", name = "N", descriptor = "I")
	private int anInt1379 = 0;

	@OriginalMember(owner = "client!cca", name = "Z", descriptor = "I")
	private int anInt1388 = 1024;

	@OriginalMember(owner = "client!cca", name = "gb", descriptor = "I")
	private int anInt1395 = 4;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt1395 = arg1.method4487();
		} else if (arg0 == 1) {
			this.anInt1382 = arg1.method4487();
		} else if (arg0 == 2) {
			this.anInt1390 = arg1.method4494();
		} else if (arg0 == 3) {
			this.anInt1384 = arg1.method4494();
		} else if (arg0 == 4) {
			this.anInt1388 = arg1.method4494();
		} else if (arg0 == 5) {
			this.anInt1379 = arg1.method4494();
		} else if (arg0 == 6) {
			this.anInt1378 = arg1.method4494();
		} else if (arg0 == 7) {
			this.anInt1387 = arg1.method4494();
		}
	}

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "(I)V")
	@Override
	public void method8197() {
		this.method1453();
	}

	@OriginalMember(owner = "client!cca", name = "h", descriptor = "(I)V")
	private void method1453() {
		@Pc(16) Random local16 = new Random((long) this.anInt1382);
		this.anInt1391 = 4096 / this.anInt1395;
		this.anInt1386 = this.anInt1378 / 2;
		this.anInt1381 = 4096 / this.anInt1382;
		@Pc(39) int local39 = this.anInt1391 / 2;
		this.anIntArray92 = new int[this.anInt1382 + 1];
		this.anIntArrayArray10 = new int[this.anInt1382][this.anInt1395];
		this.anIntArrayArray9 = new int[this.anInt1382][this.anInt1395 + 1];
		@Pc(67) int local67 = this.anInt1381 / 2;
		this.anIntArray92[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt1382; local74++) {
			@Pc(81) int local81;
			@Pc(93) int local93;
			if (local74 > 0) {
				local81 = this.anInt1381;
				local93 = (Static438.method6797(4096, local16) - 2048) * this.anInt1384 >> 12;
				@Pc(101) int local101 = local81 + (local93 * local67 >> 12);
				this.anIntArray92[local74] = local101 + this.anIntArray92[local74 - 1];
			}
			this.anIntArrayArray9[local74][0] = 0;
			for (local81 = 0; local81 < this.anInt1395; local81++) {
				if (local81 > 0) {
					local93 = this.anInt1391;
					@Pc(144) int local144 = (Static438.method6797(4096, local16) - 2048) * this.anInt1390 >> 12;
					local93 += local144 * local39 >> 12;
					this.anIntArrayArray9[local74][local81] = local93 + this.anIntArrayArray9[local74][local81 - 1];
				}
				this.anIntArrayArray10[local74][local81] = this.anInt1387 > 0 ? 4096 - Static438.method6797(this.anInt1387, local16) : 4096;
			}
			this.anIntArrayArray9[local74][this.anInt1395] = 4096;
		}
		this.anIntArray92[this.anInt1382] = 4096;
	}

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(22) int local22 = 0;
			@Pc(30) int local30;
			for (local30 = Static392.anIntArray673[arg0] + this.anInt1379; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (local22 < this.anInt1382 && this.anIntArray92[local22] <= local30) {
				local22++;
			}
			@Pc(63) int local63 = local22 - 1;
			@Pc(71) boolean local71 = (local22 & 0x1) == 0;
			@Pc(76) int local76 = this.anIntArray92[local22];
			@Pc(83) int local83 = this.anIntArray92[local22 - 1];
			if (this.anInt1386 + local83 < local30 && local76 - this.anInt1386 > local30) {
				for (@Pc(106) int local106 = 0; local106 < Static254.anInt4973; local106++) {
					@Pc(117) int local117 = local71 ? this.anInt1388 : -this.anInt1388;
					@Pc(119) int local119 = 0;
					@Pc(130) int local130;
					for (local130 = Static457.anIntArray732[local106] + (local117 * this.anInt1391 >> 12); local130 < 0; local130 += 4096) {
					}
					while (local130 > 4096) {
						local130 -= 4096;
					}
					while (this.anInt1395 > local119 && this.anIntArrayArray9[local63][local119] <= local130) {
						local119++;
					}
					@Pc(168) int local168 = local119 - 1;
					@Pc(175) int local175 = this.anIntArrayArray9[local63][local168];
					@Pc(182) int local182 = this.anIntArrayArray9[local63][local119];
					if (local130 > this.anInt1386 + local175 && local130 < local182 - this.anInt1386) {
						local11[local106] = this.anIntArrayArray10[local63][local168];
					} else {
						local11[local106] = 0;
					}
				}
			} else {
				Static556.method7040(local11, 0, Static254.anInt4973, 0);
			}
		}
		return local11;
	}
}
