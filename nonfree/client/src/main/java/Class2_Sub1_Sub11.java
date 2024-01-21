import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
	private int anInt1118;

	@OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
	private int anInt1124;

	@OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
	private int anInt1121;

	@OriginalMember(owner = "client!ef", name = "eb", descriptor = "I")
	private int anInt1130;

	@OriginalMember(owner = "client!ef", name = "jb", descriptor = "I")
	private int anInt1132;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
	@Override
	public void method2789() {
		Static51.method913();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1121 = arg0.method1402();
		} else if (arg1 == 1) {
			this.anInt1132 = arg0.method1397();
		} else if (arg1 == 2) {
			this.anInt1130 = arg0.method1402();
		} else if (arg1 == 3) {
			this.anInt1124 = arg0.method1397();
		} else if (arg1 == 4) {
			this.anInt1118 = arg0.method1397();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(16) int local16 = this.anInt1118 >> 1;
			@Pc(21) int[][] local21 = super.aClass81_39.method2607();
			@Pc(28) Random local28 = new Random((long) this.anInt1121);
			for (@Pc(30) int local30 = 0; local30 < this.anInt1132; local30++) {
				@Pc(53) int local53 = this.anInt1118 <= 0 ? this.anInt1124 : this.anInt1124 + Static77.method1232(this.anInt1118, local28) - local16;
				@Pc(59) int local59 = local53 >> 4 & 0xFF;
				@Pc(64) int local64 = Static77.method1232(Static120.anInt2812, local28);
				@Pc(69) int local69 = Static77.method1232(Static11.anInt283, local28);
				@Pc(81) int local81 = local64 + (this.anInt1130 * Static159.anIntArray376[local59] >> 12);
				@Pc(86) int local86 = local81 - local64;
				@Pc(98) int local98 = local69 + (Static174.anIntArray388[local59] * this.anInt1130 >> 12);
				@Pc(102) int local102 = local98 - local69;
				if (local86 != 0 || local102 != 0) {
					if (local86 < 0) {
						local86 = -local86;
					}
					if (local102 < 0) {
						local102 = -local102;
					}
					@Pc(129) boolean local129 = local102 > local86;
					@Pc(135) int local135;
					@Pc(133) int local133;
					if (local129) {
						local133 = local81;
						local135 = local64;
						local81 = local98;
						local98 = local133;
						local64 = local69;
						local69 = local135;
					}
					if (local64 > local81) {
						local135 = local64;
						local64 = local81;
						local81 = local135;
						local133 = local69;
						local69 = local98;
						local98 = local133;
					}
					local135 = local69;
					local133 = local81 - local64;
					@Pc(169) int local169 = local98 - local69;
					@Pc(173) int local173 = 2048 / local133;
					@Pc(178) int local178 = -local133 / 2;
					@Pc(188) int local188 = 1024 - (Static77.method1232(4096, local28) >> 2);
					@Pc(199) int local199 = local69 < local98 ? 1 : -1;
					if (local169 < 0) {
						local169 = -local169;
					}
					for (@Pc(209) int local209 = local64; local209 < local81; local209++) {
						local178 += local169;
						@Pc(219) int local219 = local209 & Static49.anInt1370;
						@Pc(231) int local231 = local188 + (-local64 + local209) * local173 + 1024;
						@Pc(235) int local235 = Static180.anInt4192 & local135;
						if (local178 > 0) {
							local135 += local199;
							local178 += -local133;
						}
						if (local129) {
							local21[local235][local219] = local231;
						} else {
							local21[local219][local235] = local231;
						}
					}
				}
			}
		}
		return local7;
	}
}
