import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class1_Sub1_Sub27 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
	private int anInt4760 = 4096;

	@OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
	private int anInt4755 = 16;

	@OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
	private int anInt4758 = 2000;

	@OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
	private int anInt4765 = 0;

	@OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
	private int anInt4762 = 0;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(25) int local25 = this.anInt4760 >> 1;
			@Pc(30) int[][] local30 = super.aClass109_41.method2239();
			@Pc(37) Random local37 = new Random((long) this.anInt4762);
			for (@Pc(39) int local39 = 0; local39 < this.anInt4758; local39++) {
				@Pc(60) int local60 = this.anInt4760 > 0 ? this.anInt4765 + Static368.method4796(local37, this.anInt4760) - local25 : this.anInt4765;
				@Pc(66) int local66 = local60 >> 4 & 0xFF;
				@Pc(71) int local71 = Static368.method4796(local37, Static434.anInt4326);
				@Pc(76) int local76 = Static368.method4796(local37, Static452.anInt7412);
				@Pc(88) int local88 = local71 + (Static366.anIntArray375[local66] * this.anInt4755 >> 12);
				@Pc(99) int local99 = (this.anInt4755 * Static54.anIntArray46[local66] >> 12) + local76;
				@Pc(104) int local104 = local99 - local76;
				@Pc(109) int local109 = local88 - local71;
				if (local109 != 0 || local104 != 0) {
					if (local104 < 0) {
						local104 = -local104;
					}
					if (local109 < 0) {
						local109 = -local109;
					}
					@Pc(146) boolean local146 = local109 < local104;
					@Pc(150) int local150;
					@Pc(154) int local154;
					if (local146) {
						local150 = local71;
						local71 = local76;
						local154 = local88;
						local76 = local150;
						local88 = local99;
						local99 = local154;
					}
					if (local71 > local88) {
						local150 = local71;
						local154 = local76;
						local71 = local88;
						local88 = local150;
						local76 = local99;
						local99 = local154;
					}
					local150 = local76;
					local154 = local88 - local71;
					@Pc(189) int local189 = local99 - local76;
					@Pc(194) int local194 = -local154 / 2;
					@Pc(198) int local198 = 2048 / local154;
					@Pc(208) int local208 = 1024 - (Static368.method4796(local37, 4096) >> 2);
					@Pc(215) int local215 = local99 > local76 ? 1 : -1;
					if (local189 < 0) {
						local189 = -local189;
					}
					for (@Pc(222) int local222 = local71; local222 < local88; local222++) {
						@Pc(235) int local235 = local208 + (local222 - local71) * local198 + 1024;
						@Pc(239) int local239 = local222 & Static429.anInt7144;
						@Pc(243) int local243 = Static249.anInt4068 & local150;
						if (local146) {
							local30[local243][local239] = local235;
						} else {
							local30[local239][local243] = local235;
						}
						local194 += local189;
						if (local194 > 0) {
							local194 += -local154;
							local150 -= -local215;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	@Override
	public void method5627() {
		Static103.method1475();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4762 = arg1.method4463();
		} else if (arg0 == 1) {
			this.anInt4758 = arg1.method4485();
		} else if (arg0 == 2) {
			this.anInt4755 = arg1.method4463();
		} else if (arg0 == 3) {
			this.anInt4765 = arg1.method4485();
		} else if (arg0 == 4) {
			this.anInt4760 = arg1.method4485();
		}
	}
}
