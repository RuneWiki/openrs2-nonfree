import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class6_Sub2_Sub9 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
	private int anInt1622 = 0;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
	private int anInt1625 = 2000;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
	private int anInt1629 = 4096;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
	private int anInt1630 = 0;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	private int anInt1631 = 16;

	static {
		new Class231(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1622 = arg0.method3111();
		} else if (arg1 == 1) {
			this.anInt1625 = arg0.method3108();
		} else if (arg1 == 2) {
			this.anInt1631 = arg0.method3111();
		} else if (arg1 == 3) {
			this.anInt1630 = arg0.method3108();
		} else if (arg1 == 4) {
			this.anInt1629 = arg0.method3108();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(25) int local25 = this.anInt1629 >> 1;
			@Pc(30) int[][] local30 = super.aClass100_41.method2224();
			@Pc(37) Random local37 = new Random((long) this.anInt1622);
			for (@Pc(39) int local39 = 0; local39 < this.anInt1625; local39++) {
				@Pc(59) int local59 = this.anInt1629 > 0 ? this.anInt1630 + Static235.method3704(this.anInt1629, local37) - local25 : this.anInt1630;
				@Pc(65) int local65 = local59 >> 4 & 0xFF;
				@Pc(70) int local70 = Static235.method3704(Static185.anInt4925, local37);
				@Pc(75) int local75 = Static235.method3704(Static345.anInt5779, local37);
				@Pc(87) int local87 = local70 + (Static37.anIntArray640[local65] * this.anInt1631 >> 12);
				@Pc(98) int local98 = (this.anInt1631 * Static148.anIntArray260[local65] >> 12) + local75;
				@Pc(103) int local103 = local98 - local75;
				@Pc(108) int local108 = local87 - local70;
				if (local108 != 0 || local103 != 0) {
					if (local103 < 0) {
						local103 = -local103;
					}
					if (local108 < 0) {
						local108 = -local108;
					}
					@Pc(142) boolean local142 = local108 < local103;
					@Pc(146) int local146;
					@Pc(150) int local150;
					if (local142) {
						local146 = local70;
						local70 = local75;
						local150 = local87;
						local75 = local146;
						local87 = local98;
						local98 = local150;
					}
					if (local87 < local70) {
						local146 = local70;
						local150 = local75;
						local70 = local87;
						local75 = local98;
						local87 = local146;
						local98 = local150;
					}
					local146 = local75;
					local150 = local87 - local70;
					@Pc(182) int local182 = local98 - local75;
					@Pc(187) int local187 = -local150 / 2;
					@Pc(191) int local191 = 2048 / local150;
					@Pc(201) int local201 = 1024 - (Static235.method3704(4096, local37) >> 2);
					@Pc(208) int local208 = local98 <= local75 ? -1 : 1;
					if (local182 < 0) {
						local182 = -local182;
					}
					for (@Pc(218) int local218 = local70; local218 < local87; local218++) {
						@Pc(231) int local231 = local201 + (-local70 + local218) * local191 + 1024;
						@Pc(235) int local235 = local218 & Static64.anInt1348;
						@Pc(239) int local239 = local146 & Static296.anInt4928;
						local187 += local182;
						if (local142) {
							local30[local239][local235] = local231;
						} else {
							local30[local235][local239] = local231;
						}
						if (local187 > 0) {
							local187 += -local150;
							local146 += local208;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
	@Override
	public void method5862() {
		Static172.method2738();
	}
}
