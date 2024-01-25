import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class3_Sub3_Sub5 extends Class3_Sub3 {

	@OriginalMember(owner = "client!cq", name = "J", descriptor = "I")
	private int anInt1133;

	@OriginalMember(owner = "client!cq", name = "R", descriptor = "[I")
	private int[] anIntArray70;

	@OriginalMember(owner = "client!cq", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!cq", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!cq", name = "V", descriptor = "I")
	private int anInt1140;

	@OriginalMember(owner = "client!cq", name = "X", descriptor = "I")
	private int anInt1142;

	@OriginalMember(owner = "client!cq", name = "H", descriptor = "I")
	private int anInt1131 = 1024;

	@OriginalMember(owner = "client!cq", name = "W", descriptor = "I")
	private int anInt1141 = 0;

	@OriginalMember(owner = "client!cq", name = "Q", descriptor = "I")
	private int anInt1138 = 81;

	@OriginalMember(owner = "client!cq", name = "I", descriptor = "I")
	private int anInt1132 = 8;

	@OriginalMember(owner = "client!cq", name = "bb", descriptor = "I")
	private int anInt1146 = 4;

	@OriginalMember(owner = "client!cq", name = "M", descriptor = "I")
	private int anInt1135 = 204;

	@OriginalMember(owner = "client!cq", name = "ab", descriptor = "I")
	private int anInt1145 = 409;

	@OriginalMember(owner = "client!cq", name = "Z", descriptor = "I")
	private int anInt1144 = 1024;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1146 = arg0.method3643();
		} else if (arg1 == 1) {
			this.anInt1132 = arg0.method3643();
		} else if (arg1 == 2) {
			this.anInt1145 = arg0.method3649();
		} else if (arg1 == 3) {
			this.anInt1135 = arg0.method3649();
		} else if (arg1 == 4) {
			this.anInt1144 = arg0.method3649();
		} else if (arg1 == 5) {
			this.anInt1141 = arg0.method3649();
		} else if (arg1 == 6) {
			this.anInt1138 = arg0.method3649();
		} else if (arg1 == 7) {
			this.anInt1131 = arg0.method3649();
		}
	}

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "(I)V")
	private void method893() {
		@Pc(12) Random local12 = new Random((long) this.anInt1132);
		this.anInt1140 = this.anInt1138 / 2;
		this.anInt1133 = 4096 / this.anInt1132;
		this.anInt1142 = 4096 / this.anInt1146;
		@Pc(35) int local35 = this.anInt1142 / 2;
		this.anIntArray70 = new int[this.anInt1132 + 1];
		@Pc(47) int local47 = this.anInt1133 / 2;
		this.anIntArrayArray7 = new int[this.anInt1132][this.anInt1146 + 1];
		this.anIntArrayArray6 = new int[this.anInt1132][this.anInt1146];
		this.anIntArray70[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt1132; local74++) {
			@Pc(81) int local81;
			@Pc(93) int local93;
			if (local74 > 0) {
				local81 = this.anInt1133;
				local93 = (Static54.method915(4096, local12) - 2048) * this.anInt1135 >> 12;
				@Pc(101) int local101 = local81 + (local93 * local47 >> 12);
				this.anIntArray70[local74] = this.anIntArray70[local74 - 1] + local101;
			}
			this.anIntArrayArray7[local74][0] = 0;
			for (local81 = 0; local81 < this.anInt1146; local81++) {
				if (local81 > 0) {
					local93 = this.anInt1142;
					@Pc(141) int local141 = (Static54.method915(4096, local12) - 2048) * this.anInt1145 >> 12;
					local93 += local35 * local141 >> 12;
					this.anIntArrayArray7[local74][local81] = local93 + this.anIntArrayArray7[local74][local81 - 1];
				}
				this.anIntArrayArray6[local74][local81] = this.anInt1131 > 0 ? 4096 - Static54.method915(this.anInt1131, local12) : 4096;
			}
			this.anIntArrayArray7[local74][this.anInt1146] = 4096;
		}
		this.anIntArray70[this.anInt1132] = 4096;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = this.anInt1141 + Static269.anIntArray433[arg0]; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt1132 > local22 && local29 >= this.anIntArray70[local22]) {
				local22++;
			}
			@Pc(59) int local59 = local22 - 1;
			@Pc(70) boolean local70 = (local22 & 0x1) == 0;
			@Pc(75) int local75 = this.anIntArray70[local22];
			@Pc(82) int local82 = this.anIntArray70[local22 - 1];
			if (local29 > this.anInt1140 + local82 && local75 - this.anInt1140 > local29) {
				for (@Pc(112) int local112 = 0; local112 < Static131.anInt2755; local112++) {
					@Pc(116) int local116 = 0;
					@Pc(125) int local125 = local70 ? this.anInt1144 : -this.anInt1144;
					@Pc(136) int local136;
					for (local136 = (this.anInt1142 * local125 >> 12) + Static151.anIntArray211[local112]; local136 < 0; local136 += 4096) {
					}
					while (local136 > 4096) {
						local136 -= 4096;
					}
					while (this.anInt1146 > local116 && local136 >= this.anIntArrayArray7[local59][local116]) {
						local116++;
					}
					@Pc(170) int local170 = local116 - 1;
					@Pc(177) int local177 = this.anIntArrayArray7[local59][local170];
					@Pc(184) int local184 = this.anIntArrayArray7[local59][local116];
					if (local136 > local177 + this.anInt1140 && local136 < local184 - this.anInt1140) {
						local16[local112] = this.anIntArrayArray6[local59][local170];
					} else {
						local16[local112] = 0;
					}
				}
			} else {
				Static367.method4031(local16, 0, Static131.anInt2755, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)V")
	@Override
	public void method5730() {
		this.method893();
	}
}
