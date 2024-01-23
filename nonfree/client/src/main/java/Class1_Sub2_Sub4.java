import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
	private int anInt633 = 0;

	@OriginalMember(owner = "client!cg", name = "ab", descriptor = "I")
	private int anInt634 = 4096;

	@OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
	private int anInt632 = 16;

	@OriginalMember(owner = "client!cg", name = "lb", descriptor = "I")
	private int anInt638 = 2000;

	@OriginalMember(owner = "client!cg", name = "mb", descriptor = "I")
	private int anInt639 = 0;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(21) int local21 = this.anInt634 >> 1;
			@Pc(26) int[][] local26 = super.aClass102_41.method3131();
			@Pc(33) Random local33 = new Random((long) this.anInt639);
			for (@Pc(35) int local35 = 0; local35 < this.anInt638; local35++) {
				@Pc(55) int local55 = this.anInt634 <= 0 ? this.anInt633 : this.anInt633 + Static199.method3113(this.anInt634, local33) - local21;
				@Pc(61) int local61 = local55 >> 4 & 0xFF;
				@Pc(66) int local66 = Static199.method3113(Static105.anInt2391, local33);
				@Pc(71) int local71 = Static199.method3113(Static53.anInt1436, local33);
				@Pc(83) int local83 = local66 + (this.anInt632 * Static55.anIntArray169[local61] >> 12);
				@Pc(94) int local94 = (Static115.anIntArray331[local61] * this.anInt632 >> 12) + local71;
				@Pc(99) int local99 = local94 - local71;
				@Pc(104) int local104 = local83 - local66;
				if (local104 != 0 || local99 != 0) {
					if (local99 < 0) {
						local99 = -local99;
					}
					if (local104 < 0) {
						local104 = -local104;
					}
					@Pc(134) boolean local134 = local104 < local99;
					@Pc(142) int local142;
					@Pc(138) int local138;
					if (local134) {
						local138 = local83;
						local83 = local94;
						local142 = local66;
						local66 = local71;
						local94 = local138;
						local71 = local142;
					}
					if (local66 > local83) {
						local142 = local66;
						local66 = local83;
						local83 = local142;
						local138 = local71;
						local71 = local94;
						local94 = local138;
					}
					local142 = local71;
					@Pc(174) int local174 = local94 - local71;
					local138 = local83 - local66;
					if (local174 < 0) {
						local174 = -local174;
					}
					@Pc(190) int local190 = 2048 / local138;
					@Pc(200) int local200 = 1024 - (Static199.method3113(4096, local33) >> 2);
					@Pc(205) int local205 = -local138 / 2;
					@Pc(212) int local212 = local94 > local71 ? 1 : -1;
					for (@Pc(214) int local214 = local66; local214 < local83; local214++) {
						@Pc(226) int local226 = local200 + local190 * (local214 - local66) + 1024;
						local205 += local174;
						@Pc(234) int local234 = Static92.anInt2170 & local142;
						@Pc(238) int local238 = local214 & Static32.anInt814;
						if (local205 > 0) {
							local205 += -local138;
							local142 += local212;
						}
						if (local134) {
							local26[local234][local238] = local226;
						} else {
							local26[local238][local234] = local226;
						}
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt639 = arg0.method895();
		} else if (arg1 == 1) {
			this.anInt638 = arg0.method946();
		} else if (arg1 == 2) {
			this.anInt632 = arg0.method895();
		} else if (arg1 == 3) {
			this.anInt633 = arg0.method946();
		} else if (arg1 == 4) {
			this.anInt634 = arg0.method946();
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
	@Override
	public void method3503() {
		Static189.method2977();
	}
}
