import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
	private int anInt2881 = 4096;

	@OriginalMember(owner = "client!kk", name = "R", descriptor = "I")
	private int anInt2883 = 0;

	@OriginalMember(owner = "client!kk", name = "S", descriptor = "I")
	private int anInt2884 = 2000;

	@OriginalMember(owner = "client!kk", name = "V", descriptor = "I")
	private int anInt2886 = 16;

	@OriginalMember(owner = "client!kk", name = "W", descriptor = "I")
	private int anInt2887 = 0;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2887 = arg0.method2595();
		} else if (arg1 == 1) {
			this.anInt2884 = arg0.method2593();
		} else if (arg1 == 2) {
			this.anInt2886 = arg0.method2595();
		} else if (arg1 == 3) {
			this.anInt2883 = arg0.method2593();
		} else if (arg1 == 4) {
			this.anInt2881 = arg0.method2593();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(26) int local26 = this.anInt2881 >> 1;
			@Pc(31) int[][] local31 = this.aClass65_41.method1365();
			@Pc(38) Random local38 = new Random((long) this.anInt2887);
			for (@Pc(40) int local40 = 0; local40 < this.anInt2884; local40++) {
				@Pc(70) int local70 = this.anInt2881 > 0 ? this.anInt2883 + Static165.method2794(local38, this.anInt2881) - local26 : this.anInt2883;
				@Pc(76) int local76 = local70 >> 4 & 0xFF;
				@Pc(81) int local81 = Static165.method2794(local38, Static299.anInt5670);
				@Pc(86) int local86 = Static165.method2794(local38, Static202.anInt4038);
				@Pc(97) int local97 = (Static25.anIntArray41[local76] * this.anInt2886 >> 12) + local86;
				@Pc(108) int local108 = (Static36.anIntArray54[local76] * this.anInt2886 >> 12) + local81;
				@Pc(113) int local113 = local108 - local81;
				@Pc(117) int local117 = local97 - local86;
				if (local113 != 0 || local117 != 0) {
					if (local113 < 0) {
						local113 = -local113;
					}
					if (local117 < 0) {
						local117 = -local117;
					}
					@Pc(152) boolean local152 = local117 > local113;
					@Pc(157) int local157;
					@Pc(159) int local159;
					if (local152) {
						local157 = local81;
						local159 = local108;
						local81 = local86;
						local86 = local157;
						local108 = local97;
						local97 = local159;
					}
					if (local81 > local108) {
						local157 = local81;
						local159 = local86;
						local86 = local97;
						local97 = local159;
						local81 = local108;
						local108 = local157;
					}
					local157 = local86;
					@Pc(193) int local193 = local97 - local86;
					local159 = local108 - local81;
					@Pc(208) int local208 = local97 <= local86 ? -1 : 1;
					@Pc(213) int local213 = -local159 / 2;
					if (local193 < 0) {
						local193 = -local193;
					}
					@Pc(222) int local222 = 2048 / local159;
					@Pc(231) int local231 = 1024 - (Static165.method2794(local38, 4096) >> 2);
					for (@Pc(233) int local233 = local81; local233 < local108; local233++) {
						@Pc(248) int local248 = local231 + local222 * (local233 - local81) + 1024;
						local213 += local193;
						@Pc(256) int local256 = Static167.anInt3492 & local157;
						if (local213 > 0) {
							local213 += -local159;
							local157 += local208;
						}
						@Pc(273) int local273 = local233 & Static142.anInt2791;
						if (local152) {
							local31[local256][local273] = local248;
						} else {
							local31[local273][local256] = local248;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)V")
	@Override
	public void method4578() {
		Static44.method777();
	}
}
