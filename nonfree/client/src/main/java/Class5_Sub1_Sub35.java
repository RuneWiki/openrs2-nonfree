import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class5_Sub1_Sub35 extends Class5_Sub1 {

	@OriginalMember(owner = "client!r", name = "D", descriptor = "I")
	private int anInt5718 = 2000;

	@OriginalMember(owner = "client!r", name = "G", descriptor = "I")
	private int anInt5721 = 0;

	@OriginalMember(owner = "client!r", name = "K", descriptor = "I")
	private int anInt5724 = 4096;

	@OriginalMember(owner = "client!r", name = "N", descriptor = "I")
	private int anInt5726 = 0;

	@OriginalMember(owner = "client!r", name = "L", descriptor = "I")
	private int anInt5725 = 16;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt5726 = arg1.method5539();
		} else if (arg0 == 1) {
			this.anInt5718 = arg1.method5598();
		} else if (arg0 == 2) {
			this.anInt5725 = arg1.method5539();
		} else if (arg0 == 3) {
			this.anInt5721 = arg1.method5598();
		} else if (arg0 == 4) {
			this.anInt5724 = arg1.method5598();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(20) int local20 = this.anInt5724 >> 1;
			@Pc(25) int[][] local25 = super.aClass239_41.method5403();
			@Pc(32) Random local32 = new Random((long) this.anInt5726);
			for (@Pc(34) int local34 = 0; local34 < this.anInt5718; local34++) {
				@Pc(57) int local57 = this.anInt5724 > 0 ? this.anInt5721 + Static44.method700(this.anInt5724, local32) - local20 : this.anInt5721;
				@Pc(63) int local63 = local57 >> 4 & 0xFF;
				@Pc(68) int local68 = Static44.method700(Static148.anInt2666, local32);
				@Pc(73) int local73 = Static44.method700(Static458.anInt7496, local32);
				@Pc(84) int local84 = (Static412.anIntArray467[local63] * this.anInt5725 >> 12) + local68;
				@Pc(96) int local96 = local73 + (Static451.anIntArray501[local63] * this.anInt5725 >> 12);
				@Pc(101) int local101 = local96 - local73;
				@Pc(105) int local105 = local84 - local68;
				if (local105 != 0 || local101 != 0) {
					if (local101 < 0) {
						local101 = -local101;
					}
					if (local105 < 0) {
						local105 = -local105;
					}
					@Pc(136) boolean local136 = local101 > local105;
					@Pc(140) int local140;
					@Pc(142) int local142;
					if (local136) {
						local140 = local68;
						local142 = local84;
						local68 = local73;
						local84 = local96;
						local73 = local140;
						local96 = local142;
					}
					if (local84 < local68) {
						local140 = local68;
						local68 = local84;
						local142 = local73;
						local84 = local140;
						local73 = local96;
						local96 = local142;
					}
					local140 = local73;
					local142 = local84 - local68;
					@Pc(181) int local181 = local96 - local73;
					@Pc(186) int local186 = -local142 / 2;
					@Pc(190) int local190 = 2048 / local142;
					@Pc(199) int local199 = 1024 - (Static44.method700(4096, local32) >> 2);
					@Pc(206) int local206 = local96 <= local73 ? -1 : 1;
					if (local181 < 0) {
						local181 = -local181;
					}
					for (@Pc(213) int local213 = local68; local213 < local84; local213++) {
						@Pc(226) int local226 = local199 + local190 * (local213 - local68) + 1024;
						@Pc(230) int local230 = local213 & Static273.anInt4299;
						@Pc(234) int local234 = local140 & Static157.anInt2733;
						local186 += local181;
						if (local136) {
							local25[local234][local230] = local226;
						} else {
							local25[local230][local234] = local226;
						}
						if (local186 > 0) {
							local186 += -local142;
							local140 += local206;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	@Override
	public void method5762() {
		Static56.method929();
	}
}
