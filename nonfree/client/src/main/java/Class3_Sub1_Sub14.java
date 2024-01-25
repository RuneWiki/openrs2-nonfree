import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class3_Sub1_Sub14 extends Class3_Sub1 {

	@OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
	private int anInt3550 = 2000;

	@OriginalMember(owner = "client!gl", name = "L", descriptor = "I")
	private int anInt3551 = 16;

	@OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
	private int anInt3552 = 4096;

	@OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
	private int anInt3553 = 0;

	@OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
	private int anInt3554 = 0;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3554 = arg1.method2048(255);
		} else if (arg0 == 1) {
			this.anInt3550 = arg1.method2028(-14795);
		} else if (arg0 == 2) {
			this.anInt3551 = arg1.method2048(255);
		} else if (arg0 == 3) {
			this.anInt3553 = arg1.method2028(-14795);
		} else if (arg0 == 4) {
			this.anInt3552 = arg1.method2028(-14795);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
	@Override
	public void method9578() {
		Static561.method7327();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(30) int local30 = this.anInt3552 >> 1;
			@Pc(35) int[][] local35 = super.aClass305_41.method6986();
			@Pc(42) Random local42 = new Random((long) this.anInt3554);
			for (@Pc(44) int local44 = 0; local44 < this.anInt3550; local44++) {
				@Pc(70) int local70 = this.anInt3552 <= 0 ? this.anInt3553 : this.anInt3553 + Static19.method614(local42, this.anInt3552) - local30;
				@Pc(76) int local76 = local70 >> 4 & 0xFF;
				@Pc(81) int local81 = Static19.method614(local42, Static379.anInt5859);
				@Pc(86) int local86 = Static19.method614(local42, Static24.anInt740);
				@Pc(97) int local97 = (this.anInt3551 * Static523.anIntArray592[local76] >> 12) + local81;
				@Pc(108) int local108 = (Static642.anIntArray715[local76] * this.anInt3551 >> 12) + local86;
				@Pc(113) int local113 = local108 - local86;
				@Pc(118) int local118 = local97 - local81;
				if (local118 != 0 || local113 != 0) {
					if (local113 < 0) {
						local113 = -local113;
					}
					if (local118 < 0) {
						local118 = -local118;
					}
					@Pc(154) boolean local154 = local118 < local113;
					@Pc(158) int local158;
					@Pc(162) int local162;
					if (local154) {
						local158 = local81;
						local81 = local86;
						local162 = local97;
						local86 = local158;
						local97 = local108;
						local108 = local162;
					}
					if (local97 < local81) {
						local158 = local81;
						local81 = local97;
						local162 = local86;
						local86 = local108;
						local97 = local158;
						local108 = local162;
					}
					local158 = local86;
					local162 = local97 - local81;
					@Pc(193) int local193 = local108 - local86;
					@Pc(198) int local198 = -local162 / 2;
					@Pc(202) int local202 = 2048 / local162;
					@Pc(212) int local212 = 1024 - (Static19.method614(local42, 4096) >> 2);
					@Pc(220) int local220 = local108 > local86 ? 1 : -1;
					if (local193 < 0) {
						local193 = -local193;
					}
					for (@Pc(227) int local227 = local81; local227 < local97; local227++) {
						@Pc(239) int local239 = local212 + local202 * (local227 - local81) + 1024;
						@Pc(243) int local243 = Static711.anInt10997 & local227;
						@Pc(247) int local247 = local158 & Static652.anInt2344;
						if (local154) {
							local35[local247][local243] = local239;
						} else {
							local35[local243][local247] = local239;
						}
						local198 += local193;
						if (local198 > 0) {
							local198 += -local162;
							local158 -= -local220;
						}
					}
				}
			}
		}
		return local11;
	}
}
