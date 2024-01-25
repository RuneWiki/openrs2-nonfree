import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class3_Sub2_Sub9 extends Class3_Sub2 {

	@OriginalMember(owner = "client!fn", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
	private int anInt3167;

	@OriginalMember(owner = "client!fn", name = "N", descriptor = "I")
	private int anInt3175;

	@OriginalMember(owner = "client!fn", name = "O", descriptor = "I")
	private int anInt3176;

	@OriginalMember(owner = "client!fn", name = "R", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!fn", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
	private int anInt3163 = 0;

	@OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
	private int anInt3164 = 4;

	@OriginalMember(owner = "client!fn", name = "C", descriptor = "I")
	private int anInt3165 = 409;

	@OriginalMember(owner = "client!fn", name = "F", descriptor = "I")
	private int anInt3168 = 1024;

	@OriginalMember(owner = "client!fn", name = "K", descriptor = "I")
	private int anInt3172 = 1024;

	@OriginalMember(owner = "client!fn", name = "L", descriptor = "I")
	private int anInt3173 = 81;

	@OriginalMember(owner = "client!fn", name = "H", descriptor = "I")
	private int anInt3170 = 8;

	@OriginalMember(owner = "client!fn", name = "P", descriptor = "I")
	private int anInt3177 = 204;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt3163 + Static372.anIntArray207[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt3170 > local23 && local30 >= this.anIntArray160[local23]) {
				local23++;
			}
			@Pc(62) int local62 = local23 - 1;
			@Pc(73) boolean local73 = (local23 & 0x1) == 0;
			@Pc(78) int local78 = this.anIntArray160[local23];
			@Pc(85) int local85 = this.anIntArray160[local23 - 1];
			if (this.anInt3176 + local85 < local30 && local78 - this.anInt3176 > local30) {
				for (@Pc(115) int local115 = 0; local115 < Static491.anInt8519; local115++) {
					@Pc(126) int local126 = local73 ? this.anInt3172 : -this.anInt3172;
					@Pc(128) int local128 = 0;
					@Pc(139) int local139;
					for (local139 = (local126 * this.anInt3167 >> 12) + Static546.anIntArray582[local115]; local139 < 0; local139 += 4096) {
					}
					while (local139 > 4096) {
						local139 -= 4096;
					}
					while (local128 < this.anInt3164 && local139 >= this.anIntArrayArray24[local62][local128]) {
						local128++;
					}
					@Pc(178) int local178 = local128 - 1;
					@Pc(185) int local185 = this.anIntArrayArray24[local62][local178];
					@Pc(192) int local192 = this.anIntArrayArray24[local62][local128];
					if (local185 + this.anInt3176 < local139 && local192 - this.anInt3176 > local139) {
						local17[local115] = this.anIntArrayArray25[local62][local178];
					} else {
						local17[local115] = 0;
					}
				}
			} else {
				Static653.method6860(local17, 0, Static491.anInt8519, 0);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3164 = arg0.method4225();
		} else if (arg1 == 1) {
			this.anInt3170 = arg0.method4225();
		} else if (arg1 == 2) {
			this.anInt3165 = arg0.method4221();
		} else if (arg1 == 3) {
			this.anInt3177 = arg0.method4221();
		} else if (arg1 == 4) {
			this.anInt3172 = arg0.method4221();
		} else if (arg1 == 5) {
			this.anInt3163 = arg0.method4221();
		} else if (arg1 == 6) {
			this.anInt3173 = arg0.method4221();
		} else if (arg1 == 7) {
			this.anInt3168 = arg0.method4221();
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
	@Override
	public void method8598() {
		this.method2889();
	}

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)V")
	private void method2889() {
		@Pc(12) Random local12 = new Random((long) this.anInt3170);
		this.anInt3176 = this.anInt3173 / 2;
		this.anInt3167 = 4096 / this.anInt3164;
		this.anInt3175 = 4096 / this.anInt3170;
		@Pc(41) int local41 = this.anInt3167 / 2;
		@Pc(46) int local46 = this.anInt3175 / 2;
		this.anIntArray160 = new int[this.anInt3170 + 1];
		this.anIntArrayArray24 = new int[this.anInt3170][this.anInt3164 + 1];
		this.anIntArrayArray25 = new int[this.anInt3170][this.anInt3164];
		this.anIntArray160[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt3170; local76++) {
			@Pc(83) int local83;
			@Pc(97) int local97;
			if (local76 > 0) {
				local83 = this.anInt3175;
				local97 = (Static522.method7729(local12, 4096) - 2048) * this.anInt3177 >> 12;
				@Pc(105) int local105 = local83 + (local46 * local97 >> 12);
				this.anIntArray160[local76] = local105 + this.anIntArray160[local76 - 1];
			}
			this.anIntArrayArray24[local76][0] = 0;
			for (local83 = 0; local83 < this.anInt3164; local83++) {
				if (local83 > 0) {
					local97 = this.anInt3167;
					@Pc(145) int local145 = (Static522.method7729(local12, 4096) - 2048) * this.anInt3165 >> 12;
					local97 += local41 * local145 >> 12;
					this.anIntArrayArray24[local76][local83] = local97 + this.anIntArrayArray24[local76][local83 - 1];
				}
				this.anIntArrayArray25[local76][local83] = this.anInt3168 > 0 ? 4096 - Static522.method7729(local12, this.anInt3168) : 4096;
			}
			this.anIntArrayArray24[local76][this.anInt3164] = 4096;
		}
		this.anIntArray160[this.anInt3170] = 4096;
	}
}
