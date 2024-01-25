import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class4_Sub2_Sub18 extends Class4_Sub2 {

	@OriginalMember(owner = "client!maa", name = "I", descriptor = "I")
	private int anInt6259 = 0;

	@OriginalMember(owner = "client!maa", name = "O", descriptor = "I")
	private int anInt6264 = 4096;

	@OriginalMember(owner = "client!maa", name = "N", descriptor = "I")
	private int anInt6263 = 0;

	@OriginalMember(owner = "client!maa", name = "P", descriptor = "I")
	private int anInt6265 = 2000;

	@OriginalMember(owner = "client!maa", name = "R", descriptor = "I")
	private int anInt6267 = 16;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6263 = arg0.method7004();
		} else if (arg1 == 1) {
			this.anInt6265 = arg0.method7054();
		} else if (arg1 == 2) {
			this.anInt6267 = arg0.method7004();
		} else if (arg1 == 3) {
			this.anInt6259 = arg0.method7054();
		} else if (arg1 == 4) {
			this.anInt6264 = arg0.method7054();
		}
	}

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "(I)V")
	@Override
	public void method8210() {
		Static374.method5814();
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(27) int local27 = this.anInt6264 >> 1;
			@Pc(32) int[][] local32 = super.aClass135_41.method3010();
			@Pc(39) Random local39 = new Random((long) this.anInt6263);
			for (@Pc(41) int local41 = 0; local41 < this.anInt6265; local41++) {
				@Pc(64) int local64 = this.anInt6264 > 0 ? this.anInt6259 + Static319.method4997(local39, this.anInt6264) - local27 : this.anInt6259;
				@Pc(70) int local70 = local64 >> 4 & 0xFF;
				@Pc(75) int local75 = Static319.method4997(local39, Static417.anInt5248);
				@Pc(80) int local80 = Static319.method4997(local39, Static38.anInt1239);
				@Pc(91) int local91 = local75 + (this.anInt6267 * Static365.anIntArray392[local70] >> 12);
				@Pc(103) int local103 = local80 + (Static1.anIntArray273[local70] * this.anInt6267 >> 12);
				@Pc(108) int local108 = local103 - local80;
				@Pc(113) int local113 = local91 - local75;
				if (local113 != 0 || local108 != 0) {
					if (local108 < 0) {
						local108 = -local108;
					}
					if (local113 < 0) {
						local113 = -local113;
					}
					@Pc(146) boolean local146 = local113 < local108;
					@Pc(150) int local150;
					@Pc(154) int local154;
					if (local146) {
						local150 = local75;
						local75 = local80;
						local154 = local91;
						local80 = local150;
						local91 = local103;
						local103 = local154;
					}
					if (local75 > local91) {
						local150 = local75;
						local75 = local91;
						local154 = local80;
						local80 = local103;
						local91 = local150;
						local103 = local154;
					}
					local150 = local80;
					local154 = local91 - local75;
					@Pc(185) int local185 = local103 - local80;
					@Pc(190) int local190 = -local154 / 2;
					@Pc(194) int local194 = 2048 / local154;
					@Pc(204) int local204 = 1024 - (Static319.method4997(local39, 4096) >> 2);
					if (local185 < 0) {
						local185 = -local185;
					}
					@Pc(223) int local223 = local80 < local103 ? 1 : -1;
					for (@Pc(225) int local225 = local75; local225 < local91; local225++) {
						@Pc(238) int local238 = local204 + (-local75 + local225) * local194 + 1024;
						@Pc(242) int local242 = Static359.anInt6929 & local225;
						@Pc(246) int local246 = local150 & Static565.anInt5164;
						local190 += local185;
						if (local146) {
							local32[local246][local242] = local238;
						} else {
							local32[local242][local246] = local238;
						}
						if (local190 > 0) {
							local190 -= local154;
							local150 -= -local223;
						}
					}
				}
			}
		}
		return local18;
	}
}
