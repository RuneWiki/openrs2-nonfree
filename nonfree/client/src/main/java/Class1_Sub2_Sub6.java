import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!de", name = "db", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!de", name = "nb", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!de", name = "kb", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt943 = arg0.method861();
		} else if (arg1 == 1) {
			this.anInt932 = arg0.method878();
		} else if (arg1 == 2) {
			this.anInt935 = arg0.method861();
		} else if (arg1 == 3) {
			this.anInt933 = arg0.method878();
		} else if (arg1 == 4) {
			this.anInt940 = arg0.method878();
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	@Override
	public void method3125() {
		Static142.method2472();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(20) int local20 = this.anInt940 >> 1;
			@Pc(25) int[][] local25 = super.aClass5_39.method171();
			@Pc(32) Random local32 = new Random((long) this.anInt943);
			for (@Pc(34) int local34 = 0; local34 < this.anInt932; local34++) {
				@Pc(57) int local57 = this.anInt940 > 0 ? this.anInt933 + Static137.method2402(local32, this.anInt940) - local20 : this.anInt933;
				@Pc(62) int local62 = Static137.method2402(local32, Static110.anInt2825);
				@Pc(67) int local67 = Static137.method2402(local32, Static102.anInt2580);
				@Pc(73) int local73 = local57 >> 4 & 0xFF;
				@Pc(84) int local84 = (Static110.anIntArray379[local73] * this.anInt935 >> 12) + local62;
				@Pc(95) int local95 = (this.anInt935 * Static44.anIntArray145[local73] >> 12) + local67;
				@Pc(99) int local99 = local84 - local62;
				@Pc(104) int local104 = local95 - local67;
				if (local99 != 0 || local104 != 0) {
					if (local99 < 0) {
						local99 = -local99;
					}
					if (local104 < 0) {
						local104 = -local104;
					}
					@Pc(132) boolean local132 = local104 > local99;
					@Pc(142) int local142;
					@Pc(136) int local136;
					if (local132) {
						local136 = local84;
						local84 = local95;
						local95 = local136;
						local142 = local62;
						local62 = local67;
						local67 = local142;
					}
					if (local84 < local62) {
						local142 = local62;
						local62 = local84;
						local136 = local67;
						local67 = local95;
						local95 = local136;
						local84 = local142;
					}
					local142 = local67;
					local136 = local84 - local62;
					@Pc(173) int local173 = local95 - local67;
					@Pc(180) int local180 = local67 < local95 ? 1 : -1;
					@Pc(190) int local190 = 1024 - (Static137.method2402(local32, 4096) >> 2);
					if (local173 < 0) {
						local173 = -local173;
					}
					@Pc(199) int local199 = 2048 / local136;
					@Pc(204) int local204 = -local136 / 2;
					for (@Pc(206) int local206 = local62; local206 < local84; local206++) {
						local204 += local173;
						@Pc(223) int local223 = local190 + (local206 + -local62) * local199 + 1024;
						@Pc(227) int local227 = Static99.anInt2523 & local206;
						@Pc(231) int local231 = local142 & Static64.anInt1680;
						if (local132) {
							local25[local231][local227] = local223;
						} else {
							local25[local227][local231] = local223;
						}
						if (local204 > 0) {
							local142 -= -local180;
							local204 += -local136;
						}
					}
				}
			}
		}
		return local11;
	}
}
