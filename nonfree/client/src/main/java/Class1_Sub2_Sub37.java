import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class1_Sub2_Sub37 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wn", name = "J", descriptor = "I")
	private int anInt7263;

	@OriginalMember(owner = "client!wn", name = "K", descriptor = "[I")
	private int[] anIntArray540;

	@OriginalMember(owner = "client!wn", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!wn", name = "P", descriptor = "I")
	private int anInt7267;

	@OriginalMember(owner = "client!wn", name = "Z", descriptor = "I")
	private int anInt7275;

	@OriginalMember(owner = "client!wn", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!wn", name = "F", descriptor = "I")
	private int anInt7260 = 204;

	@OriginalMember(owner = "client!wn", name = "R", descriptor = "I")
	private int anInt7269 = 0;

	@OriginalMember(owner = "client!wn", name = "U", descriptor = "I")
	private int anInt7271 = 81;

	@OriginalMember(owner = "client!wn", name = "X", descriptor = "I")
	private int anInt7274 = 1024;

	@OriginalMember(owner = "client!wn", name = "T", descriptor = "I")
	private int anInt7270 = 4;

	@OriginalMember(owner = "client!wn", name = "N", descriptor = "I")
	private int anInt7265 = 8;

	@OriginalMember(owner = "client!wn", name = "O", descriptor = "I")
	private int anInt7266 = 1024;

	@OriginalMember(owner = "client!wn", name = "bb", descriptor = "I")
	private int anInt7276 = 409;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = this.anInt7269 + Static258.anIntArray335[arg0]; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (local22 < this.anInt7265 && this.anIntArray540[local22] <= local29) {
				local22++;
			}
			@Pc(68) int local68 = local22 - 1;
			@Pc(76) boolean local76 = (local22 & 0x1) == 0;
			@Pc(81) int local81 = this.anIntArray540[local22];
			@Pc(88) int local88 = this.anIntArray540[local22 - 1];
			if (local29 > this.anInt7275 + local88 && local29 < local81 - this.anInt7275) {
				for (@Pc(107) int local107 = 0; local107 < Static218.anInt3990; local107++) {
					@Pc(111) int local111 = 0;
					@Pc(120) int local120 = local76 ? this.anInt7266 : -this.anInt7266;
					@Pc(131) int local131;
					for (local131 = (local120 * this.anInt7263 >> 12) + Static434.anIntArray495[local107]; local131 < 0; local131 += 4096) {
					}
					while (local131 > 4096) {
						local131 -= 4096;
					}
					while (local111 < this.anInt7270 && local131 >= this.anIntArrayArray56[local68][local111]) {
						local111++;
					}
					@Pc(163) int local163 = local111 - 1;
					@Pc(170) int local170 = this.anIntArrayArray56[local68][local111];
					@Pc(177) int local177 = this.anIntArrayArray56[local68][local163];
					if (local131 > local177 + this.anInt7275 && local170 - this.anInt7275 > local131) {
						local11[local107] = this.anIntArrayArray55[local68][local163];
					} else {
						local11[local107] = 0;
					}
				}
			} else {
				Static471.method3064(local11, 0, Static218.anInt3990, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7270 = arg0.method2915();
		} else if (arg1 == 1) {
			this.anInt7265 = arg0.method2915();
		} else if (arg1 == 2) {
			this.anInt7276 = arg0.method2896();
		} else if (arg1 == 3) {
			this.anInt7260 = arg0.method2896();
		} else if (arg1 == 4) {
			this.anInt7266 = arg0.method2896();
		} else if (arg1 == 5) {
			this.anInt7269 = arg0.method2896();
		} else if (arg1 == 6) {
			this.anInt7271 = arg0.method2896();
		} else if (arg1 == 7) {
			this.anInt7274 = arg0.method2896();
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V")
	private void method5885() {
		@Pc(12) Random local12 = new Random((long) this.anInt7265);
		this.anInt7267 = 4096 / this.anInt7265;
		this.anInt7275 = this.anInt7271 / 2;
		this.anInt7263 = 4096 / this.anInt7270;
		@Pc(35) int local35 = this.anInt7263 / 2;
		this.anIntArrayArray56 = new int[this.anInt7265][this.anInt7270 + 1];
		this.anIntArrayArray55 = new int[this.anInt7265][this.anInt7270];
		@Pc(56) int local56 = this.anInt7267 / 2;
		this.anIntArray540 = new int[this.anInt7265 + 1];
		this.anIntArray540[0] = 0;
		for (@Pc(75) int local75 = 0; local75 < this.anInt7265; local75++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local75 > 0) {
				local85 = this.anInt7267;
				local97 = (Static133.method1697(4096, local12) - 2048) * this.anInt7260 >> 12;
				@Pc(105) int local105 = local85 + (local56 * local97 >> 12);
				this.anIntArray540[local75] = this.anIntArray540[local75 - 1] + local105;
			}
			this.anIntArrayArray56[local75][0] = 0;
			for (local85 = 0; local85 < this.anInt7270; local85++) {
				if (local85 > 0) {
					local97 = this.anInt7263;
					@Pc(148) int local148 = (Static133.method1697(4096, local12) - 2048) * this.anInt7276 >> 12;
					local97 += local35 * local148 >> 12;
					this.anIntArrayArray56[local75][local85] = local97 + this.anIntArrayArray56[local75][local85 - 1];
				}
				this.anIntArrayArray55[local75][local85] = this.anInt7274 > 0 ? 4096 - Static133.method1697(this.anInt7274, local12) : 4096;
			}
			this.anIntArrayArray56[local75][this.anInt7270] = 4096;
		}
		this.anIntArray540[this.anInt7265] = 4096;
	}

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "(I)V")
	@Override
	public void method5967() {
		this.method5885();
	}
}
