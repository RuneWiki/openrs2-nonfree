import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class4_Sub2_Sub8 extends Class4_Sub2 {

	@OriginalMember(owner = "client!gea", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!gea", name = "J", descriptor = "I")
	private int anInt3394;

	@OriginalMember(owner = "client!gea", name = "L", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!gea", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!gea", name = "V", descriptor = "I")
	private int anInt3403;

	@OriginalMember(owner = "client!gea", name = "Y", descriptor = "I")
	private int anInt3406;

	@OriginalMember(owner = "client!gea", name = "U", descriptor = "I")
	private int anInt3402 = 1024;

	@OriginalMember(owner = "client!gea", name = "T", descriptor = "I")
	private int anInt3401 = 204;

	@OriginalMember(owner = "client!gea", name = "K", descriptor = "I")
	private int anInt3395 = 409;

	@OriginalMember(owner = "client!gea", name = "Q", descriptor = "I")
	private int anInt3398 = 81;

	@OriginalMember(owner = "client!gea", name = "Z", descriptor = "I")
	private int anInt3407 = 0;

	@OriginalMember(owner = "client!gea", name = "W", descriptor = "I")
	private int anInt3404 = 4;

	@OriginalMember(owner = "client!gea", name = "X", descriptor = "I")
	private int anInt3405 = 8;

	@OriginalMember(owner = "client!gea", name = "O", descriptor = "I")
	private int anInt3396 = 1024;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(I)V")
	@Override
	public void method8210() {
		this.method2704();
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(Z)V")
	private void method2704() {
		@Pc(12) Random local12 = new Random((long) this.anInt3405);
		this.anInt3394 = 4096 / this.anInt3405;
		this.anInt3406 = this.anInt3398 / 2;
		this.anInt3403 = 4096 / this.anInt3404;
		@Pc(35) int local35 = this.anInt3403 / 2;
		@Pc(44) int local44 = this.anInt3394 / 2;
		this.anIntArrayArray18 = new int[this.anInt3405][this.anInt3404];
		this.anIntArray166 = new int[this.anInt3405 + 1];
		this.anIntArrayArray17 = new int[this.anInt3405][this.anInt3404 + 1];
		this.anIntArray166[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt3405; local74++) {
			@Pc(81) int local81;
			@Pc(93) int local93;
			if (local74 > 0) {
				local81 = this.anInt3394;
				local93 = (Static319.method4997(local12, 4096) - 2048) * this.anInt3401 >> 12;
				@Pc(101) int local101 = local81 + (local93 * local44 >> 12);
				this.anIntArray166[local74] = local101 + this.anIntArray166[local74 - 1];
			}
			this.anIntArrayArray17[local74][0] = 0;
			for (local81 = 0; local81 < this.anInt3404; local81++) {
				if (local81 > 0) {
					local93 = this.anInt3403;
					@Pc(141) int local141 = (Static319.method4997(local12, 4096) - 2048) * this.anInt3395 >> 12;
					local93 += local141 * local35 >> 12;
					this.anIntArrayArray17[local74][local81] = local93 + this.anIntArrayArray17[local74][local81 - 1];
				}
				this.anIntArrayArray18[local74][local81] = this.anInt3396 > 0 ? 4096 - Static319.method4997(local12, this.anInt3396) : 4096;
			}
			this.anIntArrayArray17[local74][this.anInt3404] = 4096;
		}
		this.anIntArray166[this.anInt3405] = 4096;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt3407 + Static217.anIntArray501[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (local23 < this.anInt3405 && this.anIntArray166[local23] <= local30) {
				local23++;
			}
			@Pc(62) int local62 = local23 - 1;
			@Pc(73) boolean local73 = (local23 & 0x1) == 0;
			@Pc(78) int local78 = this.anIntArray166[local23];
			@Pc(85) int local85 = this.anIntArray166[local23 - 1];
			if (local30 > local85 + this.anInt3406 && local78 - this.anInt3406 > local30) {
				for (@Pc(105) int local105 = 0; local105 < Static417.anInt5248; local105++) {
					@Pc(109) int local109 = 0;
					@Pc(118) int local118 = local73 ? this.anInt3402 : -this.anInt3402;
					@Pc(130) int local130;
					for (local130 = Static579.anIntArray585[local105] + (this.anInt3403 * local118 >> 12); local130 < 0; local130 += 4096) {
					}
					while (local130 > 4096) {
						local130 -= 4096;
					}
					while (this.anInt3404 > local109 && local130 >= this.anIntArrayArray17[local62][local109]) {
						local109++;
					}
					@Pc(164) int local164 = local109 - 1;
					@Pc(171) int local171 = this.anIntArrayArray17[local62][local109];
					@Pc(178) int local178 = this.anIntArrayArray17[local62][local164];
					if (local130 > local178 + this.anInt3406 && local171 - this.anInt3406 > local130) {
						local11[local105] = this.anIntArrayArray18[local62][local164];
					} else {
						local11[local105] = 0;
					}
				}
			} else {
				Static599.method3056(local11, 0, Static417.anInt5248, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3404 = arg0.method7004();
		} else if (arg1 == 1) {
			this.anInt3405 = arg0.method7004();
		} else if (arg1 == 2) {
			this.anInt3395 = arg0.method7054();
		} else if (arg1 == 3) {
			this.anInt3401 = arg0.method7054();
		} else if (arg1 == 4) {
			this.anInt3402 = arg0.method7054();
		} else if (arg1 == 5) {
			this.anInt3407 = arg0.method7054();
		} else if (arg1 == 6) {
			this.anInt3398 = arg0.method7054();
		} else if (arg1 == 7) {
			this.anInt3396 = arg0.method7054();
		}
	}
}
