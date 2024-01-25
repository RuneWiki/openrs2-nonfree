import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class5_Sub1_Sub10 extends Class5_Sub1 {

	@OriginalMember(owner = "client!iba", name = "cb", descriptor = "I")
	private int anInt4067;

	@OriginalMember(owner = "client!iba", name = "bb", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!iba", name = "F", descriptor = "I")
	private int anInt4073;

	@OriginalMember(owner = "client!iba", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!iba", name = "W", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!iba", name = "O", descriptor = "I")
	private int anInt4081;

	@OriginalMember(owner = "client!iba", name = "T", descriptor = "I")
	private int anInt4071 = 0;

	@OriginalMember(owner = "client!iba", name = "N", descriptor = "I")
	private int anInt4074 = 8;

	@OriginalMember(owner = "client!iba", name = "L", descriptor = "I")
	private int anInt4072 = 81;

	@OriginalMember(owner = "client!iba", name = "M", descriptor = "I")
	private int anInt4078 = 1024;

	@OriginalMember(owner = "client!iba", name = "P", descriptor = "I")
	private int anInt4075 = 409;

	@OriginalMember(owner = "client!iba", name = "I", descriptor = "I")
	private int anInt4083 = 4;

	@OriginalMember(owner = "client!iba", name = "J", descriptor = "I")
	private int anInt4084 = 204;

	@OriginalMember(owner = "client!iba", name = "R", descriptor = "I")
	private int anInt4076 = 1024;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt4083 = arg1.method8529();
		} else if (arg0 == 1) {
			this.anInt4074 = arg1.method8529();
		} else if (arg0 == 2) {
			this.anInt4075 = arg1.method8519();
		} else if (arg0 == 3) {
			this.anInt4084 = arg1.method8519();
		} else if (arg0 == 4) {
			this.anInt4076 = arg1.method8519();
		} else if (arg0 == 5) {
			this.anInt4071 = arg1.method8519();
		} else if (arg0 == 6) {
			this.anInt4072 = arg1.method8519();
		} else if (arg0 == 7) {
			this.anInt4078 = arg1.method8519();
		}
	}

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "(B)V")
	private void method3549() {
		@Pc(12) Random local12 = new Random((long) this.anInt4074);
		this.anInt4081 = this.anInt4072 / 2;
		this.anInt4073 = 4096 / this.anInt4074;
		this.anInt4067 = 4096 / this.anInt4083;
		@Pc(43) int local43 = this.anInt4067 / 2;
		@Pc(48) int local48 = this.anInt4073 / 2;
		this.anIntArray229 = new int[this.anInt4074 + 1];
		this.anIntArrayArray27 = new int[this.anInt4074][this.anInt4083 + 1];
		this.anIntArrayArray28 = new int[this.anInt4074][this.anInt4083];
		this.anIntArray229[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt4074; local78++) {
			@Pc(90) int local90;
			@Pc(102) int local102;
			if (local78 > 0) {
				local90 = this.anInt4073;
				local102 = (Static547.method7966(4096, local12) - 2048) * this.anInt4084 >> 12;
				@Pc(110) int local110 = local90 + (local102 * local48 >> 12);
				this.anIntArray229[local78] = this.anIntArray229[local78 - 1] + local110;
			}
			this.anIntArrayArray27[local78][0] = 0;
			for (local90 = 0; local90 < this.anInt4083; local90++) {
				if (local90 > 0) {
					local102 = this.anInt4067;
					@Pc(156) int local156 = (Static547.method7966(4096, local12) - 2048) * this.anInt4075 >> 12;
					local102 += local43 * local156 >> 12;
					this.anIntArrayArray27[local78][local90] = this.anIntArrayArray27[local78][local90 - 1] + local102;
				}
				this.anIntArrayArray28[local78][local90] = this.anInt4078 > 0 ? 4096 - Static547.method7966(this.anInt4078, local12) : 4096;
			}
			this.anIntArrayArray27[local78][this.anInt4083] = 4096;
		}
		this.anIntArray229[this.anInt4074] = 4096;
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(24) int local24 = 0;
			@Pc(31) int local31;
			for (local31 = Static23.anIntArray27[arg0] + this.anInt4071; local31 < 0; local31 += 4096) {
			}
			while (local31 > 4096) {
				local31 -= 4096;
			}
			while (local24 < this.anInt4074 && this.anIntArray229[local24] <= local31) {
				local24++;
			}
			@Pc(74) int local74 = local24 - 1;
			@Pc(85) boolean local85 = (local24 & 0x1) == 0;
			@Pc(90) int local90 = this.anIntArray229[local24];
			@Pc(97) int local97 = this.anIntArray229[local24 - 1];
			if (local97 + this.anInt4081 < local31 && local31 < local90 - this.anInt4081) {
				for (@Pc(117) int local117 = 0; local117 < Static648.anInt9588; local117++) {
					@Pc(121) int local121 = 0;
					@Pc(131) int local131 = local85 ? this.anInt4076 : -this.anInt4076;
					@Pc(143) int local143;
					for (local143 = Static293.anIntArray288[local117] + (local131 * this.anInt4067 >> 12); local143 < 0; local143 += 4096) {
					}
					while (local143 > 4096) {
						local143 -= 4096;
					}
					while (local121 < this.anInt4083 && this.anIntArrayArray27[local74][local121] <= local143) {
						local121++;
					}
					@Pc(191) int local191 = local121 - 1;
					@Pc(198) int local198 = this.anIntArrayArray27[local74][local191];
					@Pc(205) int local205 = this.anIntArrayArray27[local74][local121];
					if (local198 + this.anInt4081 < local143 && local143 < local205 - this.anInt4081) {
						local11[local117] = this.anIntArrayArray28[local74][local191];
					} else {
						local11[local117] = 0;
					}
				}
			} else {
				Static682.method794(local11, 0, Static648.anInt9588, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
	@Override
	public void method9204() {
		this.method3549();
	}
}
