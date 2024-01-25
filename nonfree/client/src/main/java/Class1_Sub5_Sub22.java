import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class1_Sub5_Sub22 extends Class1_Sub5 {

	@OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
	private int anInt4585 = 0;

	@OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
	private int anInt4583 = 16;

	@OriginalMember(owner = "client!oi", name = "T", descriptor = "I")
	private int anInt4589 = 2000;

	@OriginalMember(owner = "client!oi", name = "V", descriptor = "I")
	private int anInt4591 = 0;

	@OriginalMember(owner = "client!oi", name = "X", descriptor = "I")
	private int anInt4593 = 4096;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
	@Override
	public void method5801() {
		Static341.method5649();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4585 = arg0.method5720();
		} else if (arg1 == 1) {
			this.anInt4589 = arg0.method5715();
		} else if (arg1 == 2) {
			this.anInt4583 = arg0.method5720();
		} else if (arg1 == 3) {
			this.anInt4591 = arg0.method5715();
		} else if (arg1 == 4) {
			this.anInt4593 = arg0.method5715();
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(24) int local24 = this.anInt4593 >> 1;
			@Pc(29) int[][] local29 = super.aClass214_41.method5647();
			@Pc(36) Random local36 = new Random((long) this.anInt4585);
			for (@Pc(38) int local38 = 0; local38 < this.anInt4589; local38++) {
				@Pc(60) int local60 = this.anInt4593 <= 0 ? this.anInt4591 : this.anInt4591 + Static304.method5274(local36, this.anInt4593) - local24;
				@Pc(66) int local66 = local60 >> 4 & 0xFF;
				@Pc(71) int local71 = Static304.method5274(local36, Static75.anInt1566);
				@Pc(76) int local76 = Static304.method5274(local36, Static129.anInt2574);
				@Pc(87) int local87 = (this.anInt4583 * Static13.anIntArray10[local66] >> 12) + local71;
				@Pc(98) int local98 = (this.anInt4583 * Static204.anIntArray679[local66] >> 12) + local76;
				@Pc(102) int local102 = local98 - local76;
				@Pc(107) int local107 = local87 - local71;
				if (local107 != 0 || local102 != 0) {
					if (local102 < 0) {
						local102 = -local102;
					}
					if (local107 < 0) {
						local107 = -local107;
					}
					@Pc(138) boolean local138 = local107 < local102;
					@Pc(142) int local142;
					@Pc(144) int local144;
					if (local138) {
						local142 = local71;
						local144 = local87;
						local71 = local76;
						local76 = local142;
						local87 = local98;
						local98 = local144;
					}
					if (local87 < local71) {
						local142 = local71;
						local144 = local76;
						local71 = local87;
						local76 = local98;
						local87 = local142;
						local98 = local144;
					}
					local142 = local76;
					local144 = local87 - local71;
					@Pc(179) int local179 = local98 - local76;
					@Pc(184) int local184 = -local144 / 2;
					@Pc(188) int local188 = 2048 / local144;
					@Pc(199) int local199 = 1024 - (Static304.method5274(local36, 4096) >> 2);
					if (local179 < 0) {
						local179 = -local179;
					}
					@Pc(215) int local215 = local98 > local76 ? 1 : -1;
					for (@Pc(217) int local217 = local71; local217 < local87; local217++) {
						@Pc(231) int local231 = local199 + (local217 - local71) * local188 + 1024;
						@Pc(235) int local235 = Static239.anInt2816 & local217;
						@Pc(239) int local239 = local142 & Static42.anInt1137;
						local184 += local179;
						if (local138) {
							local29[local239][local235] = local231;
						} else {
							local29[local235][local239] = local231;
						}
						if (local184 > 0) {
							local142 += local215;
							local184 += -local144;
						}
					}
				}
			}
		}
		return local11;
	}
}
