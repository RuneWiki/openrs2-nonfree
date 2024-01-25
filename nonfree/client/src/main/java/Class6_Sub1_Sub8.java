import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class6_Sub1_Sub8 extends Class6_Sub1 {

	@OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
	private int anInt2632 = 2000;

	@OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
	private int anInt2633 = 0;

	@OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
	private int anInt2629 = 0;

	@OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
	private int anInt2631 = 16;

	@OriginalMember(owner = "client!fj", name = "O", descriptor = "I")
	private int anInt2638 = 4096;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(B)V")
	@Override
	public void method8964() {
		Static364.method5249();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(20) int local20 = this.anInt2638 >> 1;
			@Pc(25) int[][] local25 = super.aClass135_41.method3063();
			@Pc(32) Random local32 = new Random((long) this.anInt2629);
			for (@Pc(34) int local34 = 0; local34 < this.anInt2632; local34++) {
				@Pc(57) int local57 = this.anInt2638 <= 0 ? this.anInt2633 : this.anInt2633 + Static316.method4556(local32, this.anInt2638) - local20;
				@Pc(63) int local63 = local57 >> 4 & 0xFF;
				@Pc(68) int local68 = Static316.method4556(local32, Static479.anInt8231);
				@Pc(73) int local73 = Static316.method4556(local32, Static434.anInt7425);
				@Pc(84) int local84 = (Static404.anIntArray300[local63] * this.anInt2631 >> 12) + local68;
				@Pc(96) int local96 = local73 + (this.anInt2631 * Static164.anIntArray710[local63] >> 12);
				@Pc(100) int local100 = local96 - local73;
				@Pc(105) int local105 = local84 - local68;
				if (local105 != 0 || local100 != 0) {
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local100 < 0) {
						local100 = -local100;
					}
					@Pc(133) boolean local133 = local105 < local100;
					@Pc(137) int local137;
					@Pc(139) int local139;
					if (local133) {
						local137 = local68;
						local139 = local84;
						local68 = local73;
						local73 = local137;
						local84 = local96;
						local96 = local139;
					}
					if (local68 > local84) {
						local137 = local68;
						local68 = local84;
						local139 = local73;
						local73 = local96;
						local84 = local137;
						local96 = local139;
					}
					local137 = local73;
					local139 = local84 - local68;
					@Pc(178) int local178 = local96 - local73;
					@Pc(183) int local183 = -local139 / 2;
					@Pc(187) int local187 = 2048 / local139;
					@Pc(197) int local197 = 1024 - (Static316.method4556(local32, 4096) >> 2);
					if (local178 < 0) {
						local178 = -local178;
					}
					@Pc(213) int local213 = local96 <= local73 ? -1 : 1;
					for (@Pc(215) int local215 = local68; local215 < local84; local215++) {
						@Pc(227) int local227 = (local215 - local68) * local187 + local197 + 1024;
						@Pc(231) int local231 = Static413.anInt7225 & local215;
						@Pc(235) int local235 = local137 & Static476.anInt8174;
						if (local133) {
							local25[local235][local231] = local227;
						} else {
							local25[local231][local235] = local227;
						}
						local183 += local178;
						if (local183 > 0) {
							local183 -= local139;
							local137 += local213;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2629 = arg0.method8374();
		} else if (arg1 == 1) {
			this.anInt2632 = arg0.method8363();
		} else if (arg1 == 2) {
			this.anInt2631 = arg0.method8374();
		} else if (arg1 == 3) {
			this.anInt2633 = arg0.method8363();
		} else if (arg1 == 4) {
			this.anInt2638 = arg0.method8363();
		}
	}
}
