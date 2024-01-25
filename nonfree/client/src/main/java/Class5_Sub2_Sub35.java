import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class5_Sub2_Sub35 extends Class5_Sub2 {

	@OriginalMember(owner = "client!um", name = "J", descriptor = "I")
	private int anInt9969 = 4096;

	@OriginalMember(owner = "client!um", name = "L", descriptor = "I")
	private int anInt9971 = 16;

	@OriginalMember(owner = "client!um", name = "M", descriptor = "I")
	private int anInt9972 = 2000;

	@OriginalMember(owner = "client!um", name = "N", descriptor = "I")
	private int anInt9973 = 0;

	@OriginalMember(owner = "client!um", name = "P", descriptor = "I")
	private int anInt9975 = 0;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V")
	@Override
	public void method8951() {
		Static47.method612();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(26) int local26 = this.anInt9969 >> 1;
			@Pc(31) int[][] local31 = super.aClass333_41.method7746();
			@Pc(38) Random local38 = new Random((long) this.anInt9975);
			for (@Pc(40) int local40 = 0; local40 < this.anInt9972; local40++) {
				@Pc(60) int local60 = this.anInt9969 <= 0 ? this.anInt9973 : this.anInt9973 + Static508.method7270(this.anInt9969, local38) - local26;
				@Pc(66) int local66 = local60 >> 4 & 0xFF;
				@Pc(71) int local71 = Static508.method7270(Static195.anInt3759, local38);
				@Pc(76) int local76 = Static508.method7270(Static195.anInt3756, local38);
				@Pc(88) int local88 = local71 + (Static378.anIntArray381[local66] * this.anInt9971 >> 12);
				@Pc(99) int local99 = (Static122.anIntArray545[local66] * this.anInt9971 >> 12) + local76;
				@Pc(104) int local104 = local99 - local76;
				@Pc(109) int local109 = local88 - local71;
				if (local109 != 0 || local104 != 0) {
					if (local104 < 0) {
						local104 = -local104;
					}
					if (local109 < 0) {
						local109 = -local109;
					}
					@Pc(139) boolean local139 = local104 > local109;
					@Pc(143) int local143;
					@Pc(147) int local147;
					if (local139) {
						local143 = local71;
						local71 = local76;
						local147 = local88;
						local76 = local143;
						local88 = local99;
						local99 = local147;
					}
					if (local71 > local88) {
						local143 = local71;
						local147 = local76;
						local71 = local88;
						local76 = local99;
						local88 = local143;
						local99 = local147;
					}
					local143 = local76;
					local147 = local88 - local71;
					@Pc(183) int local183 = local99 - local76;
					@Pc(188) int local188 = -local147 / 2;
					@Pc(192) int local192 = 2048 / local147;
					@Pc(201) int local201 = 1024 - (Static508.method7270(4096, local38) >> 2);
					if (local183 < 0) {
						local183 = -local183;
					}
					@Pc(217) int local217 = local99 > local76 ? 1 : -1;
					for (@Pc(219) int local219 = local71; local219 < local88; local219++) {
						@Pc(232) int local232 = local192 * (local219 - local71) + local201 + 1024;
						@Pc(236) int local236 = Static388.anInt6925 & local219;
						@Pc(240) int local240 = Static115.anInt2379 & local143;
						if (local139) {
							local31[local240][local236] = local232;
						} else {
							local31[local236][local240] = local232;
						}
						local188 += local183;
						if (local188 > 0) {
							local143 += local217;
							local188 += -local147;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9975 = arg0.method7816();
		} else if (arg1 == 1) {
			this.anInt9972 = arg0.method7860();
		} else if (arg1 == 2) {
			this.anInt9971 = arg0.method7816();
		} else if (arg1 == 3) {
			this.anInt9973 = arg0.method7860();
		} else if (arg1 == 4) {
			this.anInt9969 = arg0.method7860();
		}
	}
}
