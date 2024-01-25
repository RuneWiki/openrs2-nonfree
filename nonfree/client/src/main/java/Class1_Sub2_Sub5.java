import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
	private int anInt953 = 4096;

	@OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
	private int anInt952 = 0;

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
	private int anInt955 = 16;

	@OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
	private int anInt954 = 2000;

	@OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
	private int anInt961 = 0;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt961 = arg1.method3141();
		} else if (arg0 == 1) {
			this.anInt954 = arg1.method3115();
		} else if (arg0 == 2) {
			this.anInt955 = arg1.method3141();
		} else if (arg0 == 3) {
			this.anInt952 = arg1.method3115();
		} else if (arg0 == 4) {
			this.anInt953 = arg1.method3115();
		}
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
	@Override
	public void method5661() {
		Static244.method4324();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(25) int local25 = this.anInt953 >> 1;
			@Pc(32) int[][] local32 = super.aClass84_41.method2421();
			@Pc(39) Random local39 = new Random((long) this.anInt961);
			for (@Pc(41) int local41 = 0; local41 < this.anInt954; local41++) {
				@Pc(61) int local61 = this.anInt953 <= 0 ? this.anInt952 : this.anInt952 + Static263.method4610(local39, this.anInt953) - local25;
				@Pc(67) int local67 = local61 >> 4 & 0xFF;
				@Pc(72) int local72 = Static263.method4610(local39, Static251.anInt6509);
				@Pc(77) int local77 = Static263.method4610(local39, Static81.anInt1606);
				@Pc(88) int local88 = local72 + (this.anInt955 * Static238.anIntArray597[local67] >> 12);
				@Pc(99) int local99 = local77 + (this.anInt955 * Static119.anIntArray251[local67] >> 12);
				@Pc(104) int local104 = local99 - local77;
				@Pc(108) int local108 = local88 - local72;
				if (local108 != 0 || local104 != 0) {
					if (local108 < 0) {
						local108 = -local108;
					}
					if (local104 < 0) {
						local104 = -local104;
					}
					@Pc(135) boolean local135 = local108 < local104;
					@Pc(139) int local139;
					@Pc(141) int local141;
					if (local135) {
						local139 = local72;
						local141 = local88;
						local72 = local77;
						local77 = local139;
						local88 = local99;
						local99 = local141;
					}
					if (local88 < local72) {
						local139 = local72;
						local72 = local88;
						local141 = local77;
						local77 = local99;
						local88 = local139;
						local99 = local141;
					}
					local139 = local77;
					local141 = local88 - local72;
					@Pc(176) int local176 = local99 - local77;
					@Pc(181) int local181 = -local141 / 2;
					@Pc(185) int local185 = 2048 / local141;
					@Pc(195) int local195 = 1024 - (Static263.method4610(local39, 4096) >> 2);
					if (local176 < 0) {
						local176 = -local176;
					}
					@Pc(214) int local214 = local77 >= local99 ? -1 : 1;
					for (@Pc(216) int local216 = local72; local216 < local88; local216++) {
						@Pc(229) int local229 = local185 * (local216 - local72) + local195 + 1024;
						@Pc(233) int local233 = local216 & Static260.anInt5056;
						@Pc(237) int local237 = Static206.anInt4136 & local139;
						if (local135) {
							local32[local237][local233] = local229;
						} else {
							local32[local233][local237] = local229;
						}
						local181 += local176;
						if (local181 > 0) {
							local181 += -local141;
							local139 += local214;
						}
					}
				}
			}
		}
		return local16;
	}
}
