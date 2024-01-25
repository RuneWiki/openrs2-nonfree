import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class2_Sub4_Sub25 extends Class2_Sub4 {

	@OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
	private int anInt7077 = 0;

	@OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
	private int anInt7078 = 2000;

	@OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
	private int anInt7080 = 16;

	@OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
	private int anInt7083 = 0;

	@OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
	private int anInt7084 = 4096;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt7077 = arg1.method4464();
		} else if (arg0 == 1) {
			this.anInt7078 = arg1.method4518();
		} else if (arg0 == 2) {
			this.anInt7080 = arg1.method4464();
		} else if (arg0 == 3) {
			this.anInt7083 = arg1.method4518();
		} else if (arg0 == 4) {
			this.anInt7084 = arg1.method4518();
		}
	}

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V")
	@Override
	public void method7562() {
		Static59.method1017();
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(30) int local30 = this.anInt7084 >> 1;
			@Pc(35) int[][] local35 = super.aClass271_41.method5624();
			@Pc(42) Random local42 = new Random((long) this.anInt7077);
			for (@Pc(44) int local44 = 0; local44 < this.anInt7078; local44++) {
				@Pc(64) int local64 = this.anInt7084 <= 0 ? this.anInt7083 : this.anInt7083 + Static328.method4754(local42, this.anInt7084) - local30;
				@Pc(70) int local70 = local64 >> 4 & 0xFF;
				@Pc(75) int local75 = Static328.method4754(local42, Static143.anInt7434);
				@Pc(80) int local80 = Static328.method4754(local42, Static42.anInt782);
				@Pc(92) int local92 = local75 + (this.anInt7080 * Static135.anIntArray552[local70] >> 12);
				@Pc(103) int local103 = (this.anInt7080 * Static388.anIntArray410[local70] >> 12) + local80;
				@Pc(107) int local107 = local103 - local80;
				@Pc(112) int local112 = local92 - local75;
				if (local112 != 0 || local107 != 0) {
					if (local107 < 0) {
						local107 = -local107;
					}
					if (local112 < 0) {
						local112 = -local112;
					}
					@Pc(136) boolean local136 = local112 < local107;
					@Pc(140) int local140;
					@Pc(142) int local142;
					if (local136) {
						local140 = local75;
						local142 = local92;
						local75 = local80;
						local80 = local140;
						local92 = local103;
						local103 = local142;
					}
					if (local75 > local92) {
						local140 = local75;
						local142 = local80;
						local75 = local92;
						local92 = local140;
						local80 = local103;
						local103 = local142;
					}
					local140 = local80;
					local142 = local92 - local75;
					@Pc(177) int local177 = local103 - local80;
					@Pc(182) int local182 = -local142 / 2;
					@Pc(186) int local186 = 2048 / local142;
					@Pc(196) int local196 = 1024 - (Static328.method4754(local42, 4096) >> 2);
					@Pc(203) int local203 = local80 >= local103 ? -1 : 1;
					if (local177 < 0) {
						local177 = -local177;
					}
					for (@Pc(210) int local210 = local75; local210 < local92; local210++) {
						@Pc(223) int local223 = (local210 - local75) * local186 + local196 + 1024;
						@Pc(227) int local227 = Static464.anInt7427 & local210;
						@Pc(231) int local231 = local140 & Static407.anInt6676;
						local182 += local177;
						if (local136) {
							local35[local231][local227] = local223;
						} else {
							local35[local227][local231] = local223;
						}
						if (local182 > 0) {
							local140 += local203;
							local182 += -local142;
						}
					}
				}
			}
		}
		return local21;
	}
}
