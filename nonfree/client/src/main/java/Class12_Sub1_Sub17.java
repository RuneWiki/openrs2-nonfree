import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class12_Sub1_Sub17 extends Class12_Sub1 {

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
	private int anInt5141 = 0;

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
	private int anInt5148 = 16;

	@OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
	private int anInt5149 = 0;

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
	private int anInt5143 = 2000;

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
	private int anInt5144 = 4096;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5141 = arg0.method5216();
		} else if (arg1 == 1) {
			this.anInt5143 = arg0.method5199();
		} else if (arg1 == 2) {
			this.anInt5148 = arg0.method5216();
		} else if (arg1 == 3) {
			this.anInt5149 = arg0.method5199();
		} else if (arg1 == 4) {
			this.anInt5144 = arg0.method5199();
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	@Override
	public void method7797() {
		Static431.method6596();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(24) int local24 = this.anInt5144 >> 1;
			@Pc(29) int[][] local29 = super.aClass174_41.method4394();
			@Pc(36) Random local36 = new Random((long) this.anInt5141);
			for (@Pc(38) int local38 = 0; local38 < this.anInt5143; local38++) {
				@Pc(61) int local61 = this.anInt5144 <= 0 ? this.anInt5149 : this.anInt5149 + Static114.method2345(local36, this.anInt5144) - local24;
				@Pc(67) int local67 = local61 >> 4 & 0xFF;
				@Pc(72) int local72 = Static114.method2345(local36, Static357.anInt6670);
				@Pc(77) int local77 = Static114.method2345(local36, Static138.anInt3102);
				@Pc(89) int local89 = local72 + (Static95.anIntArray196[local67] * this.anInt5148 >> 12);
				@Pc(100) int local100 = (Static103.anIntArray206[local67] * this.anInt5148 >> 12) + local77;
				@Pc(104) int local104 = local100 - local77;
				@Pc(109) int local109 = local89 - local72;
				if (local109 != 0 || local104 != 0) {
					if (local109 < 0) {
						local109 = -local109;
					}
					if (local104 < 0) {
						local104 = -local104;
					}
					@Pc(136) boolean local136 = local104 > local109;
					@Pc(140) int local140;
					@Pc(144) int local144;
					if (local136) {
						local140 = local72;
						local72 = local77;
						local144 = local89;
						local77 = local140;
						local89 = local100;
						local100 = local144;
					}
					if (local72 > local89) {
						local140 = local72;
						local72 = local89;
						local144 = local77;
						local77 = local100;
						local89 = local140;
						local100 = local144;
					}
					local140 = local77;
					local144 = local89 - local72;
					@Pc(181) int local181 = local100 - local77;
					@Pc(186) int local186 = -local144 / 2;
					@Pc(190) int local190 = 2048 / local144;
					@Pc(199) int local199 = 1024 - (Static114.method2345(local36, 4096) >> 2);
					@Pc(206) int local206 = local100 <= local77 ? -1 : 1;
					if (local181 < 0) {
						local181 = -local181;
					}
					for (@Pc(213) int local213 = local72; local213 < local89; local213++) {
						@Pc(226) int local226 = local199 + local190 * (-local72 + local213) + 1024;
						@Pc(230) int local230 = Static149.anInt3278 & local213;
						@Pc(234) int local234 = Static162.anInt3758 & local140;
						local186 += local181;
						if (local136) {
							local29[local234][local230] = local226;
						} else {
							local29[local230][local234] = local226;
						}
						if (local186 > 0) {
							local186 += -local144;
							local140 += local206;
						}
					}
				}
			}
		}
		return local15;
	}
}
