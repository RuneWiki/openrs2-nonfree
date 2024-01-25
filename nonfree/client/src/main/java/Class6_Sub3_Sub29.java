import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class6_Sub3_Sub29 extends Class6_Sub3 {

	@OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
	private int anInt7382 = 0;

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
	private int anInt7383 = 0;

	@OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
	private int anInt7386 = 2000;

	@OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
	private int anInt7389 = 16;

	@OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
	private int anInt7390 = 4096;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(28) int local28 = this.anInt7390 >> 1;
			@Pc(33) int[][] local33 = super.aClass174_41.method3727();
			@Pc(40) Random local40 = new Random((long) this.anInt7383);
			for (@Pc(42) int local42 = 0; local42 < this.anInt7386; local42++) {
				@Pc(61) int local61 = this.anInt7390 <= 0 ? this.anInt7382 : this.anInt7382 + Static29.method431(this.anInt7390, local40) - local28;
				@Pc(67) int local67 = local61 >> 4 & 0xFF;
				@Pc(72) int local72 = Static29.method431(Static447.anInt8568, local40);
				@Pc(77) int local77 = Static29.method431(Static495.anInt8251, local40);
				@Pc(89) int local89 = local72 + (this.anInt7389 * Static205.anIntArray395[local67] >> 12);
				@Pc(100) int local100 = (Static35.anIntArray47[local67] * this.anInt7389 >> 12) + local77;
				@Pc(104) int local104 = local100 - local77;
				@Pc(109) int local109 = local89 - local72;
				if (local109 != 0 || local104 != 0) {
					if (local109 < 0) {
						local109 = -local109;
					}
					if (local104 < 0) {
						local104 = -local104;
					}
					@Pc(140) boolean local140 = local104 > local109;
					@Pc(144) int local144;
					@Pc(146) int local146;
					if (local140) {
						local144 = local72;
						local146 = local89;
						local72 = local77;
						local77 = local144;
						local89 = local100;
						local100 = local146;
					}
					if (local72 > local89) {
						local144 = local72;
						local146 = local77;
						local72 = local89;
						local89 = local144;
						local77 = local100;
						local100 = local146;
					}
					local144 = local77;
					local146 = local89 - local72;
					@Pc(181) int local181 = local100 - local77;
					@Pc(186) int local186 = -local146 / 2;
					@Pc(190) int local190 = 2048 / local146;
					@Pc(200) int local200 = 1024 - (Static29.method431(4096, local40) >> 2);
					if (local181 < 0) {
						local181 = -local181;
					}
					@Pc(215) int local215 = local77 < local100 ? 1 : -1;
					for (@Pc(217) int local217 = local72; local217 < local89; local217++) {
						@Pc(229) int local229 = (local217 - local72) * local190 + local200 + 1024;
						@Pc(233) int local233 = local217 & Static392.anInt6966;
						@Pc(237) int local237 = local144 & Static252.anInt4135;
						if (local140) {
							local33[local237][local233] = local229;
						} else {
							local33[local233][local237] = local229;
						}
						local186 += local181;
						if (local186 > 0) {
							local144 -= -local215;
							local186 += -local146;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
	@Override
	public void method7832() {
		Static369.method5426();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt7383 = arg1.method6041();
		} else if (arg0 == 1) {
			this.anInt7386 = arg1.method6006();
		} else if (arg0 == 2) {
			this.anInt7389 = arg1.method6041();
		} else if (arg0 == 3) {
			this.anInt7382 = arg1.method6006();
		} else if (arg0 == 4) {
			this.anInt7390 = arg1.method6006();
		}
	}
}
