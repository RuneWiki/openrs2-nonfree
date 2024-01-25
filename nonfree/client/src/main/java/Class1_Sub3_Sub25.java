import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class1_Sub3_Sub25 extends Class1_Sub3 {

	@OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
	private int anInt4400;

	@OriginalMember(owner = "client!nl", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!nl", name = "S", descriptor = "[I")
	private int[] anIntArray404;

	@OriginalMember(owner = "client!nl", name = "T", descriptor = "I")
	private int anInt4408;

	@OriginalMember(owner = "client!nl", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!nl", name = "gb", descriptor = "I")
	private int anInt4419;

	@OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
	private int anInt4405 = 1024;

	@OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
	private int anInt4406 = 1024;

	@OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
	private int anInt4407 = 0;

	@OriginalMember(owner = "client!nl", name = "Y", descriptor = "I")
	private int anInt4413 = 81;

	@OriginalMember(owner = "client!nl", name = "bb", descriptor = "I")
	private int anInt4416 = 8;

	@OriginalMember(owner = "client!nl", name = "X", descriptor = "I")
	private int anInt4412 = 409;

	@OriginalMember(owner = "client!nl", name = "cb", descriptor = "I")
	private int anInt4417 = 204;

	@OriginalMember(owner = "client!nl", name = "ab", descriptor = "I")
	private int anInt4415 = 4;

	static {
		new Class34("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4415 = arg1.method4532();
		} else if (arg0 == 1) {
			this.anInt4416 = arg1.method4532();
		} else if (arg0 == 2) {
			this.anInt4412 = arg1.method4556();
		} else if (arg0 == 3) {
			this.anInt4417 = arg1.method4556();
		} else if (arg0 == 4) {
			this.anInt4406 = arg1.method4556();
		} else if (arg0 == 5) {
			this.anInt4407 = arg1.method4556();
		} else if (arg0 == 6) {
			this.anInt4413 = arg1.method4556();
		} else if (arg0 == 7) {
			this.anInt4405 = arg1.method4556();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = Static266.anIntArray454[arg0] + this.anInt4407; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (this.anInt4416 > local25 && this.anIntArray404[local25] <= local32) {
				local25++;
			}
			@Pc(63) int local63 = local25 - 1;
			@Pc(71) boolean local71 = (local25 & 0x1) == 0;
			@Pc(76) int local76 = this.anIntArray404[local25];
			@Pc(83) int local83 = this.anIntArray404[local25 - 1];
			if (this.anInt4408 + local83 < local32 && local32 < local76 - this.anInt4408) {
				for (@Pc(97) int local97 = 0; local97 < Static153.anInt3378; local97++) {
					@Pc(101) int local101 = 0;
					@Pc(110) int local110 = local71 ? this.anInt4406 : -this.anInt4406;
					@Pc(122) int local122;
					for (local122 = Static107.anIntArray234[local97] + (this.anInt4400 * local110 >> 12); local122 < 0; local122 += 4096) {
					}
					while (local122 > 4096) {
						local122 -= 4096;
					}
					while (local101 < this.anInt4415 && local122 >= this.anIntArrayArray50[local63][local101]) {
						local101++;
					}
					@Pc(155) int local155 = local101 - 1;
					@Pc(162) int local162 = this.anIntArrayArray50[local63][local101];
					@Pc(169) int local169 = this.anIntArrayArray50[local63][local155];
					if (local122 > this.anInt4408 + local169 && local162 - this.anInt4408 > local122) {
						local19[local97] = this.anIntArrayArray49[local63][local155];
					} else {
						local19[local97] = 0;
					}
				}
			} else {
				Static361.method1333(local19, 0, Static153.anInt3378, 0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "(I)V")
	private void method3979() {
		@Pc(12) Random local12 = new Random((long) this.anInt4416);
		this.anInt4408 = this.anInt4413 / 2;
		this.anInt4419 = 4096 / this.anInt4416;
		this.anInt4400 = 4096 / this.anInt4415;
		@Pc(35) int local35 = this.anInt4400 / 2;
		this.anIntArray404 = new int[this.anInt4416 + 1];
		this.anIntArrayArray49 = new int[this.anInt4416][this.anInt4415];
		this.anIntArrayArray50 = new int[this.anInt4416][this.anInt4415 + 1];
		@Pc(63) int local63 = this.anInt4419 / 2;
		this.anIntArray404[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt4416; local70++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local70 > 0) {
				local85 = this.anInt4419;
				local97 = (Static295.method4970(local12, 4096) - 2048) * this.anInt4417 >> 12;
				@Pc(105) int local105 = local85 + (local63 * local97 >> 12);
				this.anIntArray404[local70] = this.anIntArray404[local70 - 1] + local105;
			}
			this.anIntArrayArray50[local70][0] = 0;
			for (local85 = 0; local85 < this.anInt4415; local85++) {
				if (local85 > 0) {
					local97 = this.anInt4400;
					@Pc(151) int local151 = (Static295.method4970(local12, 4096) - 2048) * this.anInt4412 >> 12;
					local97 += local151 * local35 >> 12;
					this.anIntArrayArray50[local70][local85] = this.anIntArrayArray50[local70][local85 - 1] + local97;
				}
				this.anIntArrayArray49[local70][local85] = this.anInt4405 <= 0 ? 4096 : 4096 - Static295.method4970(local12, this.anInt4405);
			}
			this.anIntArrayArray50[local70][this.anInt4415] = 4096;
		}
		this.anIntArray404[this.anInt4416] = 4096;
	}

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)V")
	@Override
	public void method5535() {
		this.method3979();
	}
}
