import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public final class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!jca", name = "Q", descriptor = "I")
	private int anInt4893 = 4096;

	@OriginalMember(owner = "client!jca", name = "L", descriptor = "I")
	private int anInt4888 = 0;

	@OriginalMember(owner = "client!jca", name = "U", descriptor = "I")
	private int anInt4896 = 2000;

	@OriginalMember(owner = "client!jca", name = "N", descriptor = "I")
	private int anInt4890 = 16;

	@OriginalMember(owner = "client!jca", name = "P", descriptor = "I")
	private int anInt4892 = 0;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(25) int local25 = this.anInt4893 >> 1;
			@Pc(30) int[][] local30 = super.aClass313_41.method7615();
			@Pc(37) Random local37 = new Random((long) this.anInt4892);
			for (@Pc(39) int local39 = 0; local39 < this.anInt4896; local39++) {
				@Pc(60) int local60 = this.anInt4893 <= 0 ? this.anInt4888 : this.anInt4888 + Static137.method2798(local37, this.anInt4893) - local25;
				@Pc(66) int local66 = local60 >> 4 & 0xFF;
				@Pc(71) int local71 = Static137.method2798(local37, Static131.anInt2935);
				@Pc(76) int local76 = Static137.method2798(local37, Static331.anInt6903);
				@Pc(87) int local87 = local71 + (this.anInt4890 * Static251.anIntArray323[local66] >> 12);
				@Pc(99) int local99 = local76 + (Static413.anIntArray500[local66] * this.anInt4890 >> 12);
				@Pc(104) int local104 = local99 - local76;
				@Pc(109) int local109 = local87 - local71;
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
						local140 = local71;
						local71 = local76;
						local144 = local87;
						local76 = local140;
						local87 = local99;
						local99 = local144;
					}
					if (local71 > local87) {
						local140 = local71;
						local144 = local76;
						local71 = local87;
						local87 = local140;
						local76 = local99;
						local99 = local144;
					}
					local140 = local76;
					local144 = local87 - local71;
					@Pc(177) int local177 = local99 - local76;
					@Pc(182) int local182 = -local144 / 2;
					@Pc(186) int local186 = 2048 / local144;
					@Pc(195) int local195 = 1024 - (Static137.method2798(local37, 4096) >> 2);
					if (local177 < 0) {
						local177 = -local177;
					}
					@Pc(211) int local211 = local99 <= local76 ? -1 : 1;
					for (@Pc(213) int local213 = local71; local213 < local87; local213++) {
						@Pc(226) int local226 = local195 + local186 * (local213 - local71) + 1024;
						@Pc(230) int local230 = Static251.anInt5425 & local213;
						@Pc(234) int local234 = Static483.anInt9026 & local140;
						if (local136) {
							local30[local234][local230] = local226;
						} else {
							local30[local230][local234] = local226;
						}
						local182 += local177;
						if (local182 > 0) {
							local140 += local211;
							local182 += -local144;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt4892 = arg1.method6538();
		} else if (arg0 == 1) {
			this.anInt4896 = arg1.method6535();
		} else if (arg0 == 2) {
			this.anInt4890 = arg1.method6538();
		} else if (arg0 == 3) {
			this.anInt4888 = arg1.method6535();
		} else if (arg0 == 4) {
			this.anInt4893 = arg1.method6535();
		}
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(B)V")
	@Override
	public void method8365() {
		Static535.method7879();
	}
}
