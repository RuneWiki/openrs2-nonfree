import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class2_Sub4_Sub28 extends Class2_Sub4 {

	@OriginalMember(owner = "client!rm", name = "N", descriptor = "I")
	private int anInt5117 = 0;

	@OriginalMember(owner = "client!rm", name = "S", descriptor = "I")
	private int anInt5122 = 4096;

	@OriginalMember(owner = "client!rm", name = "P", descriptor = "I")
	private int anInt5119 = 2000;

	@OriginalMember(owner = "client!rm", name = "O", descriptor = "I")
	private int anInt5118 = 16;

	@OriginalMember(owner = "client!rm", name = "X", descriptor = "I")
	private int anInt5127 = 0;

	static {
		new Class32(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(20) int local20 = this.anInt5122 >> 1;
			@Pc(25) int[][] local25 = super.aClass237_41.method5429();
			@Pc(32) Random local32 = new Random((long) this.anInt5117);
			for (@Pc(34) int local34 = 0; local34 < this.anInt5119; local34++) {
				@Pc(57) int local57 = this.anInt5122 > 0 ? this.anInt5127 + Static331.method4885(local32, this.anInt5122) - local20 : this.anInt5127;
				@Pc(63) int local63 = local57 >> 4 & 0xFF;
				@Pc(68) int local68 = Static331.method4885(local32, Static76.anInt1458);
				@Pc(73) int local73 = Static331.method4885(local32, Static193.anInt3629);
				@Pc(85) int local85 = local68 + (this.anInt5118 * Static61.anIntArray261[local63] >> 12);
				@Pc(96) int local96 = (Static1.anIntArray1354[local63] * this.anInt5118 >> 12) + local73;
				@Pc(101) int local101 = local96 - local73;
				@Pc(105) int local105 = local85 - local68;
				if (local105 != 0 || local101 != 0) {
					if (local101 < 0) {
						local101 = -local101;
					}
					if (local105 < 0) {
						local105 = -local105;
					}
					@Pc(129) boolean local129 = local101 > local105;
					@Pc(133) int local133;
					@Pc(137) int local137;
					if (local129) {
						local133 = local68;
						local68 = local73;
						local137 = local85;
						local85 = local96;
						local73 = local133;
						local96 = local137;
					}
					if (local85 < local68) {
						local133 = local68;
						local137 = local73;
						local68 = local85;
						local85 = local133;
						local73 = local96;
						local96 = local137;
					}
					local133 = local73;
					local137 = local85 - local68;
					@Pc(174) int local174 = local96 - local73;
					@Pc(179) int local179 = -local137 / 2;
					@Pc(183) int local183 = 2048 / local137;
					@Pc(193) int local193 = 1024 - (Static331.method4885(local32, 4096) >> 2);
					if (local174 < 0) {
						local174 = -local174;
					}
					@Pc(212) int local212 = local96 <= local73 ? -1 : 1;
					for (@Pc(214) int local214 = local68; local214 < local85; local214++) {
						@Pc(227) int local227 = (local214 - local68) * local183 + local193 + 1024;
						@Pc(231) int local231 = Static269.anInt4657 & local214;
						@Pc(235) int local235 = local133 & Static283.anInt4900;
						if (local129) {
							local25[local235][local231] = local227;
						} else {
							local25[local231][local235] = local227;
						}
						local179 += local174;
						if (local179 > 0) {
							local179 += -local137;
							local133 -= -local212;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5117 = arg0.method5350();
		} else if (arg1 == 1) {
			this.anInt5119 = arg0.method5312();
		} else if (arg1 == 2) {
			this.anInt5118 = arg0.method5350();
		} else if (arg1 == 3) {
			this.anInt5127 = arg0.method5312();
		} else if (arg1 == 4) {
			this.anInt5122 = arg0.method5312();
		}
	}

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "(I)V")
	@Override
	public void method5596() {
		Static299.method4462();
	}
}
