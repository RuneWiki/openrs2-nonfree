import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class4_Sub1_Sub38 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
	private int anInt5424 = 2000;

	@OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
	private int anInt5418 = 0;

	@OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
	private int anInt5425 = 16;

	@OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
	private int anInt5426 = 4096;

	@OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
	private int anInt5420 = 0;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
	@Override
	public void method4537() {
		Static37.method1936();
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(26) int local26 = this.anInt5426 >> 1;
			@Pc(31) int[][] local31 = this.aClass43_41.method1182();
			@Pc(38) Random local38 = new Random((long) this.anInt5420);
			for (@Pc(40) int local40 = 0; local40 < this.anInt5424; local40++) {
				@Pc(63) int local63 = this.anInt5426 > 0 ? this.anInt5418 + Static59.method1118(this.anInt5426, local38) - local26 : this.anInt5418;
				@Pc(69) int local69 = local63 >> 4 & 0xFF;
				@Pc(74) int local74 = Static59.method1118(Static68.anInt1753, local38);
				@Pc(79) int local79 = Static59.method1118(Static33.anInt660, local38);
				@Pc(90) int local90 = (this.anInt5425 * Static284.anIntArray447[local69] >> 12) + local74;
				@Pc(101) int local101 = (Static144.anIntArray233[local69] * this.anInt5425 >> 12) + local79;
				@Pc(106) int local106 = local90 - local74;
				@Pc(111) int local111 = local101 - local79;
				if (local106 != 0 || local111 != 0) {
					if (local106 < 0) {
						local106 = -local106;
					}
					if (local111 < 0) {
						local111 = -local111;
					}
					@Pc(145) boolean local145 = local106 < local111;
					@Pc(156) int local156;
					@Pc(150) int local150;
					if (local145) {
						local150 = local90;
						local90 = local101;
						local101 = local150;
						local156 = local74;
						local74 = local79;
						local79 = local156;
					}
					if (local90 < local74) {
						local156 = local74;
						local74 = local90;
						local150 = local79;
						local90 = local156;
						local79 = local101;
						local101 = local150;
					}
					local156 = local79;
					@Pc(187) int local187 = 1024 - (Static59.method1118(4096, local38) >> 2);
					@Pc(191) int local191 = local101 - local79;
					local150 = local90 - local74;
					if (local191 < 0) {
						local191 = -local191;
					}
					@Pc(209) int local209 = 2048 / local150;
					@Pc(216) int local216 = local101 > local79 ? 1 : -1;
					@Pc(221) int local221 = -local150 / 2;
					for (@Pc(223) int local223 = local74; local223 < local90; local223++) {
						local221 += local191;
						@Pc(245) int local245 = local187 + local209 * (local223 + -local74) + 1024;
						@Pc(249) int local249 = local223 & Static295.anInt5711;
						@Pc(253) int local253 = Static19.anInt437 & local156;
						if (local145) {
							local31[local253][local249] = local245;
						} else {
							local31[local249][local253] = local245;
						}
						if (local221 > 0) {
							local156 += local216;
							local221 -= local150;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt5420 = arg1.method3110();
		} else if (arg0 == 1) {
			this.anInt5424 = arg1.method3085();
		} else if (arg0 == 2) {
			this.anInt5425 = arg1.method3110();
		} else if (arg0 == 3) {
			this.anInt5418 = arg1.method3085();
		} else if (arg0 == 4) {
			this.anInt5426 = arg1.method3085();
		}
	}
}
