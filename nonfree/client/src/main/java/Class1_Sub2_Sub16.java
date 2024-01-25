import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!it", name = "K", descriptor = "I")
	private int anInt3317 = 0;

	@OriginalMember(owner = "client!it", name = "N", descriptor = "I")
	private int anInt3318 = 2000;

	@OriginalMember(owner = "client!it", name = "T", descriptor = "I")
	private int anInt3324 = 4096;

	@OriginalMember(owner = "client!it", name = "R", descriptor = "I")
	private int anInt3322 = 0;

	@OriginalMember(owner = "client!it", name = "V", descriptor = "I")
	private int anInt3326 = 16;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)V")
	@Override
	public void method5864() {
		Static4.method126();
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(20) int local20 = this.anInt3324 >> 1;
			@Pc(27) int[][] local27 = super.aClass264_41.method5971();
			@Pc(34) Random local34 = new Random((long) this.anInt3322);
			for (@Pc(36) int local36 = 0; local36 < this.anInt3318; local36++) {
				@Pc(56) int local56 = this.anInt3324 <= 0 ? this.anInt3317 : this.anInt3317 + Static19.method243(this.anInt3324, local34) - local20;
				@Pc(62) int local62 = local56 >> 4 & 0xFF;
				@Pc(67) int local67 = Static19.method243(Static410.anInt7198, local34);
				@Pc(72) int local72 = Static19.method243(Static214.anInt6457, local34);
				@Pc(83) int local83 = (Static108.anIntArray110[local62] * this.anInt3326 >> 12) + local67;
				@Pc(94) int local94 = local72 + (Static129.anIntArray174[local62] * this.anInt3326 >> 12);
				@Pc(98) int local98 = local94 - local72;
				@Pc(103) int local103 = local83 - local67;
				if (local103 != 0 || local98 != 0) {
					if (local98 < 0) {
						local98 = -local98;
					}
					if (local103 < 0) {
						local103 = -local103;
					}
					@Pc(130) boolean local130 = local103 < local98;
					@Pc(134) int local134;
					@Pc(136) int local136;
					if (local130) {
						local134 = local67;
						local136 = local83;
						local67 = local72;
						local72 = local134;
						local83 = local94;
						local94 = local136;
					}
					if (local83 < local67) {
						local134 = local67;
						local136 = local72;
						local67 = local83;
						local72 = local94;
						local83 = local134;
						local94 = local136;
					}
					local134 = local72;
					local136 = local83 - local67;
					@Pc(174) int local174 = local94 - local72;
					@Pc(179) int local179 = -local136 / 2;
					@Pc(183) int local183 = 2048 / local136;
					@Pc(193) int local193 = 1024 - (Static19.method243(4096, local34) >> 2);
					if (local174 < 0) {
						local174 = -local174;
					}
					@Pc(205) int local205 = local94 <= local72 ? -1 : 1;
					for (@Pc(207) int local207 = local67; local207 < local83; local207++) {
						@Pc(220) int local220 = (local207 - local67) * local183 + local193 + 1024;
						@Pc(224) int local224 = Static301.anInt5026 & local207;
						@Pc(228) int local228 = Static421.anInt7373 & local134;
						local179 += local174;
						if (local130) {
							local27[local228][local224] = local220;
						} else {
							local27[local224][local228] = local220;
						}
						if (local179 > 0) {
							local179 += -local136;
							local134 -= -local205;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3322 = arg0.method4548();
		} else if (arg1 == 1) {
			this.anInt3318 = arg0.method4498();
		} else if (arg1 == 2) {
			this.anInt3326 = arg0.method4548();
		} else if (arg1 == 3) {
			this.anInt3317 = arg0.method4498();
		} else if (arg1 == 4) {
			this.anInt3324 = arg0.method4498();
		}
	}
}
