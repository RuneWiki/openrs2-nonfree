import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class3_Sub2_Sub28 extends Class3_Sub2 {

	@OriginalMember(owner = "client!od", name = "F", descriptor = "I")
	private int anInt7105 = 4096;

	@OriginalMember(owner = "client!od", name = "J", descriptor = "I")
	private int anInt7106 = 0;

	@OriginalMember(owner = "client!od", name = "N", descriptor = "I")
	private int anInt7109 = 2000;

	@OriginalMember(owner = "client!od", name = "R", descriptor = "I")
	private int anInt7113 = 16;

	@OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
	private int anInt7112 = 0;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7106 = arg0.method5633();
		} else if (arg1 == 1) {
			this.anInt7109 = arg0.method5610();
		} else if (arg1 == 2) {
			this.anInt7113 = arg0.method5633();
		} else if (arg1 == 3) {
			this.anInt7112 = arg0.method5610();
		} else if (arg1 == 4) {
			this.anInt7105 = arg0.method5610();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(26) int local26 = this.anInt7105 >> 1;
			@Pc(31) int[][] local31 = super.aClass84_41.method2126();
			@Pc(38) Random local38 = new Random((long) this.anInt7106);
			for (@Pc(40) int local40 = 0; local40 < this.anInt7109; local40++) {
				@Pc(63) int local63 = this.anInt7105 > 0 ? this.anInt7112 + Static512.method7419(this.anInt7105, local38) - local26 : this.anInt7112;
				@Pc(69) int local69 = local63 >> 4 & 0xFF;
				@Pc(74) int local74 = Static512.method7419(Static201.anInt3738, local38);
				@Pc(79) int local79 = Static512.method7419(Static414.anInt7271, local38);
				@Pc(90) int local90 = (Static57.anIntArray535[local69] * this.anInt7113 >> 12) + local74;
				@Pc(101) int local101 = local79 + (Static44.anIntArray55[local69] * this.anInt7113 >> 12);
				@Pc(106) int local106 = local101 - local79;
				@Pc(111) int local111 = local90 - local74;
				if (local111 != 0 || local106 != 0) {
					if (local111 < 0) {
						local111 = -local111;
					}
					if (local106 < 0) {
						local106 = -local106;
					}
					@Pc(142) boolean local142 = local111 < local106;
					@Pc(146) int local146;
					@Pc(148) int local148;
					if (local142) {
						local146 = local74;
						local148 = local90;
						local74 = local79;
						local79 = local146;
						local90 = local101;
						local101 = local148;
					}
					if (local74 > local90) {
						local146 = local74;
						local148 = local79;
						local74 = local90;
						local79 = local101;
						local90 = local146;
						local101 = local148;
					}
					local146 = local79;
					local148 = local90 - local74;
					@Pc(183) int local183 = local101 - local79;
					@Pc(188) int local188 = -local148 / 2;
					@Pc(192) int local192 = 2048 / local148;
					@Pc(202) int local202 = 1024 - (Static512.method7419(4096, local38) >> 2);
					@Pc(213) int local213 = local101 > local79 ? 1 : -1;
					if (local183 < 0) {
						local183 = -local183;
					}
					for (@Pc(223) int local223 = local74; local223 < local90; local223++) {
						@Pc(236) int local236 = (local223 - local74) * local192 + local202 + 1024;
						@Pc(240) int local240 = Static201.anInt3740 & local223;
						@Pc(244) int local244 = Static575.anInt9412 & local146;
						if (local142) {
							local31[local244][local240] = local236;
						} else {
							local31[local240][local244] = local236;
						}
						local188 += local183;
						if (local188 > 0) {
							local146 -= -local213;
							local188 -= local148;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	@Override
	public void method8673() {
		Static3.method41();
	}
}
