import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class3_Sub2_Sub38 extends Class3_Sub2 {

	@OriginalMember(owner = "client!vm", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!vm", name = "M", descriptor = "I")
	private int anInt5918;

	@OriginalMember(owner = "client!vm", name = "O", descriptor = "I")
	private int anInt5920;

	@OriginalMember(owner = "client!vm", name = "V", descriptor = "I")
	private int anInt5927;

	@OriginalMember(owner = "client!vm", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray79;

	@OriginalMember(owner = "client!vm", name = "ib", descriptor = "[I")
	private int[] anIntArray613;

	@OriginalMember(owner = "client!vm", name = "S", descriptor = "I")
	private int anInt5924 = 0;

	@OriginalMember(owner = "client!vm", name = "P", descriptor = "I")
	private int anInt5921 = 1024;

	@OriginalMember(owner = "client!vm", name = "Y", descriptor = "I")
	private int anInt5929 = 1024;

	@OriginalMember(owner = "client!vm", name = "N", descriptor = "I")
	private int anInt5919 = 204;

	@OriginalMember(owner = "client!vm", name = "ab", descriptor = "I")
	private int anInt5931 = 409;

	@OriginalMember(owner = "client!vm", name = "T", descriptor = "I")
	private int anInt5925 = 4;

	@OriginalMember(owner = "client!vm", name = "hb", descriptor = "I")
	private int anInt5936 = 8;

	@OriginalMember(owner = "client!vm", name = "kb", descriptor = "I")
	private int anInt5938 = 81;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "(I)V")
	private void method4856() {
		@Pc(12) Random local12 = new Random((long) this.anInt5936);
		this.anInt5920 = 4096 / this.anInt5936;
		this.anIntArrayArray78 = new int[this.anInt5936][this.anInt5925];
		this.anIntArrayArray79 = new int[this.anInt5936][this.anInt5925 + 1];
		this.anInt5918 = this.anInt5938 / 2;
		@Pc(45) int local45 = this.anInt5920 / 2;
		this.anIntArray613 = new int[this.anInt5936 + 1];
		this.anInt5927 = 4096 / this.anInt5925;
		@Pc(63) int local63 = this.anInt5927 / 2;
		this.anIntArray613[0] = 0;
		for (@Pc(79) int local79 = 0; local79 < this.anInt5936; local79++) {
			@Pc(92) int local92;
			@Pc(104) int local104;
			if (local79 > 0) {
				local92 = this.anInt5920;
				local104 = (Static276.method4529(4096, local12) - 2048) * this.anInt5919 >> 12;
				@Pc(112) int local112 = local92 + (local45 * local104 >> 12);
				this.anIntArray613[local79] = this.anIntArray613[local79 - 1] + local112;
			}
			this.anIntArrayArray79[local79][0] = 0;
			for (local92 = 0; local92 < this.anInt5925; local92++) {
				if (local92 > 0) {
					local104 = this.anInt5927;
					@Pc(161) int local161 = (Static276.method4529(4096, local12) - 2048) * this.anInt5931 >> 12;
					local104 += local161 * local63 >> 12;
					this.anIntArrayArray79[local79][local92] = this.anIntArrayArray79[local79][local92 - 1] + local104;
				}
				this.anIntArrayArray78[local79][local92] = this.anInt5921 > 0 ? 4096 - Static276.method4529(this.anInt5921, local12) : 4096;
			}
			this.anIntArrayArray79[local79][this.anInt5925] = 4096;
		}
		this.anIntArray613[this.anInt5936] = 4096;
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V")
	@Override
	public void method4952() {
		this.method4856();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt5925 = arg1.method3915();
		} else if (arg0 == 1) {
			this.anInt5936 = arg1.method3915();
		} else if (arg0 == 2) {
			this.anInt5931 = arg1.method3948();
		} else if (arg0 == 3) {
			this.anInt5919 = arg1.method3948();
		} else if (arg0 == 4) {
			this.anInt5929 = arg1.method3948();
		} else if (arg0 == 5) {
			this.anInt5924 = arg1.method3948();
		} else if (arg0 == 6) {
			this.anInt5938 = arg1.method3948();
		} else if (arg0 == 7) {
			this.anInt5921 = arg1.method3948();
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(28) int local28 = 0;
			@Pc(35) int local35;
			for (local35 = Static205.anIntArray450[arg0] + this.anInt5924; local35 < 0; local35 += 4096) {
			}
			while (local35 > 4096) {
				local35 -= 4096;
			}
			while (local28 < this.anInt5936 && this.anIntArray613[local28] <= local35) {
				local28++;
			}
			@Pc(74) int local74 = local28 - 1;
			@Pc(82) boolean local82 = (local28 & 0x1) == 0;
			@Pc(87) int local87 = this.anIntArray613[local28];
			@Pc(94) int local94 = this.anIntArray613[local28 - 1];
			if (this.anInt5918 + local94 < local35 && local87 - this.anInt5918 > local35) {
				for (@Pc(112) int local112 = 0; local112 < Static22.anInt421; local112++) {
					@Pc(124) int local124 = local82 ? this.anInt5929 : -this.anInt5929;
					@Pc(126) int local126 = 0;
					@Pc(137) int local137;
					for (local137 = Static185.anIntArray424[local112] + (this.anInt5927 * local124 >> 12); local137 < 0; local137 += 4096) {
					}
					while (local137 > 4096) {
						local137 -= 4096;
					}
					while (this.anInt5925 > local126 && local137 >= this.anIntArrayArray79[local74][local126]) {
						local126++;
					}
					@Pc(177) int local177 = this.anIntArrayArray79[local74][local126];
					@Pc(181) int local181 = local126 - 1;
					@Pc(188) int local188 = this.anIntArrayArray79[local74][local181];
					if (local188 + this.anInt5918 < local137 && local177 - this.anInt5918 > local137) {
						local21[local112] = this.anIntArrayArray78[local74][local181];
					} else {
						local21[local112] = 0;
					}
				}
			} else {
				Static326.method4267(local21, 0, Static22.anInt421, 0);
			}
		}
		return local21;
	}
}
