import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class11_Sub2_Sub16 extends Class11_Sub2 {

	@OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
	private int anInt2661 = 0;

	@OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
	private int anInt2653 = 4096;

	@OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
	private int anInt2659 = 0;

	@OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
	private int anInt2651 = 16;

	@OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
	private int anInt2657 = 2000;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2659 = arg0.method5185();
		} else if (arg1 == 1) {
			this.anInt2657 = arg0.method5187();
		} else if (arg1 == 2) {
			this.anInt2651 = arg0.method5185();
		} else if (arg1 == 3) {
			this.anInt2661 = arg0.method5187();
		} else if (arg1 == 4) {
			this.anInt2653 = arg0.method5187();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(20) int local20 = this.anInt2653 >> 1;
			@Pc(25) int[][] local25 = super.aClass124_41.method2856();
			@Pc(32) Random local32 = new Random((long) this.anInt2659);
			for (@Pc(34) int local34 = 0; local34 < this.anInt2657; local34++) {
				@Pc(57) int local57 = this.anInt2653 > 0 ? this.anInt2661 + Static331.method5444(this.anInt2653, local32) - local20 : this.anInt2661;
				@Pc(63) int local63 = local57 >> 4 & 0xFF;
				@Pc(68) int local68 = Static331.method5444(Static339.anInt6549, local32);
				@Pc(73) int local73 = Static331.method5444(Static113.anInt2160, local32);
				@Pc(84) int local84 = (this.anInt2651 * Static333.anIntArray526[local63] >> 12) + local68;
				@Pc(95) int local95 = (this.anInt2651 * Static284.anIntArray437[local63] >> 12) + local73;
				@Pc(100) int local100 = local95 - local73;
				@Pc(105) int local105 = local84 - local68;
				if (local105 != 0 || local100 != 0) {
					if (local100 < 0) {
						local100 = -local100;
					}
					if (local105 < 0) {
						local105 = -local105;
					}
					@Pc(129) boolean local129 = local105 < local100;
					@Pc(133) int local133;
					@Pc(137) int local137;
					if (local129) {
						local133 = local68;
						local68 = local73;
						local137 = local84;
						local84 = local95;
						local73 = local133;
						local95 = local137;
					}
					if (local84 < local68) {
						local133 = local68;
						local68 = local84;
						local137 = local73;
						local73 = local95;
						local84 = local133;
						local95 = local137;
					}
					local133 = local73;
					local137 = local84 - local68;
					@Pc(169) int local169 = local95 - local73;
					@Pc(174) int local174 = -local137 / 2;
					@Pc(178) int local178 = 2048 / local137;
					@Pc(188) int local188 = 1024 - (Static331.method5444(4096, local32) >> 2);
					@Pc(195) int local195 = local73 >= local95 ? -1 : 1;
					if (local169 < 0) {
						local169 = -local169;
					}
					for (@Pc(202) int local202 = local68; local202 < local84; local202++) {
						@Pc(215) int local215 = local178 * (local202 - local68) + local188 + 1024;
						@Pc(219) int local219 = Static323.anInt6272 & local202;
						@Pc(223) int local223 = local133 & Static75.anInt1419;
						local174 += local169;
						if (local129) {
							local25[local223][local219] = local215;
						} else {
							local25[local219][local223] = local215;
						}
						if (local174 > 0) {
							local174 += -local137;
							local133 += local195;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
	@Override
	public void method5708() {
		Static22.method318();
	}
}
