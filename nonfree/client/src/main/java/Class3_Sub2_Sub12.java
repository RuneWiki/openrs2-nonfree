import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class3_Sub2_Sub12 extends Class3_Sub2 {

	@OriginalMember(owner = "client!iu", name = "H", descriptor = "I")
	private int anInt3599;

	@OriginalMember(owner = "client!iu", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!iu", name = "O", descriptor = "I")
	private int anInt3605;

	@OriginalMember(owner = "client!iu", name = "T", descriptor = "I")
	private int anInt3609;

	@OriginalMember(owner = "client!iu", name = "W", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!iu", name = "eb", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!iu", name = "S", descriptor = "I")
	private int anInt3608 = 8;

	@OriginalMember(owner = "client!iu", name = "M", descriptor = "I")
	private int anInt3603 = 0;

	@OriginalMember(owner = "client!iu", name = "R", descriptor = "I")
	private int anInt3607 = 409;

	@OriginalMember(owner = "client!iu", name = "U", descriptor = "I")
	private int anInt3610 = 204;

	@OriginalMember(owner = "client!iu", name = "X", descriptor = "I")
	private int anInt3612 = 4;

	@OriginalMember(owner = "client!iu", name = "N", descriptor = "I")
	private int anInt3604 = 81;

	@OriginalMember(owner = "client!iu", name = "Y", descriptor = "I")
	private int anInt3613 = 1024;

	@OriginalMember(owner = "client!iu", name = "ab", descriptor = "I")
	private int anInt3615 = 1024;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)V")
	private void method2883() {
		@Pc(12) Random local12 = new Random((long) this.anInt3608);
		this.anInt3609 = 4096 / this.anInt3612;
		this.anInt3599 = 4096 / this.anInt3608;
		this.anInt3605 = this.anInt3604 / 2;
		@Pc(35) int local35 = this.anInt3609 / 2;
		this.anIntArrayArray24 = new int[this.anInt3608][this.anInt3612 + 1];
		this.anIntArrayArray23 = new int[this.anInt3608][this.anInt3612];
		@Pc(56) int local56 = this.anInt3599 / 2;
		this.anIntArray227 = new int[this.anInt3608 + 1];
		this.anIntArray227[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt3608; local70++) {
			@Pc(80) int local80;
			@Pc(92) int local92;
			if (local70 > 0) {
				local80 = this.anInt3599;
				local92 = (Static180.method2865(local12, 4096) - 2048) * this.anInt3610 >> 12;
				@Pc(100) int local100 = local80 + (local92 * local56 >> 12);
				this.anIntArray227[local70] = this.anIntArray227[local70 - 1] + local100;
			}
			this.anIntArrayArray24[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt3612; local80++) {
				if (local80 > 0) {
					local92 = this.anInt3609;
					@Pc(141) int local141 = (Static180.method2865(local12, 4096) - 2048) * this.anInt3607 >> 12;
					local92 += local141 * local35 >> 12;
					this.anIntArrayArray24[local70][local80] = this.anIntArrayArray24[local70][local80 - 1] + local92;
				}
				this.anIntArrayArray23[local70][local80] = this.anInt3615 > 0 ? 4096 - Static180.method2865(local12, this.anInt3615) : 4096;
			}
			this.anIntArrayArray24[local70][this.anInt3612] = 4096;
		}
		this.anIntArray227[this.anInt3608] = 4096;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = this.anInt3603 + Static441.anIntArray522[arg0]; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (this.anInt3608 > local17 && this.anIntArray227[local17] <= local24) {
				local17++;
			}
			@Pc(58) int local58 = local17 - 1;
			@Pc(69) boolean local69 = (local17 & 0x1) == 0;
			@Pc(74) int local74 = this.anIntArray227[local17];
			@Pc(81) int local81 = this.anIntArray227[local17 - 1];
			if (this.anInt3605 + local81 < local24 && local74 - this.anInt3605 > local24) {
				for (@Pc(104) int local104 = 0; local104 < Static406.anInt6694; local104++) {
					@Pc(115) int local115 = local69 ? this.anInt3613 : -this.anInt3613;
					@Pc(117) int local117 = 0;
					@Pc(128) int local128;
					for (local128 = (local115 * this.anInt3609 >> 12) + Static86.anIntArray125[local104]; local128 < 0; local128 += 4096) {
					}
					while (local128 > 4096) {
						local128 -= 4096;
					}
					while (this.anInt3612 > local117 && this.anIntArrayArray24[local58][local117] <= local128) {
						local117++;
					}
					@Pc(164) int local164 = local117 - 1;
					@Pc(171) int local171 = this.anIntArrayArray24[local58][local164];
					@Pc(178) int local178 = this.anIntArrayArray24[local58][local117];
					if (local128 > this.anInt3605 + local171 && local178 - this.anInt3605 > local128) {
						local11[local104] = this.anIntArrayArray23[local58][local164];
					} else {
						local11[local104] = 0;
					}
				}
			} else {
				Static462.method4617(local11, 0, Static406.anInt6694, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3612 = arg0.method2582();
		} else if (arg1 == 1) {
			this.anInt3608 = arg0.method2582();
		} else if (arg1 == 2) {
			this.anInt3607 = arg0.method2588();
		} else if (arg1 == 3) {
			this.anInt3610 = arg0.method2588();
		} else if (arg1 == 4) {
			this.anInt3613 = arg0.method2588();
		} else if (arg1 == 5) {
			this.anInt3603 = arg0.method2588();
		} else if (arg1 == 6) {
			this.anInt3604 = arg0.method2588();
		} else if (arg1 == 7) {
			this.anInt3615 = arg0.method2588();
		}
	}

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "(I)V")
	@Override
	public void method5898() {
		this.method2883();
	}
}
