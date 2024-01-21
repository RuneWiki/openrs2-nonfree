import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class2_Sub3_Sub5_Sub6 extends Class2_Sub3_Sub5 {

	@OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
	private final int anInt3426;

	@OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
	private final int anInt3416;

	@OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
	private final int anInt3420;

	@OriginalMember(owner = "client!rh", name = "U", descriptor = "I")
	private final int anInt3422;

	@OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
	private final int anInt3415;

	@OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
	private final int anInt3417;

	@OriginalMember(owner = "client!rh", name = "O", descriptor = "Lclient!ic;")
	private Class2_Sub3_Sub8 aClass2_Sub3_Sub8_3;

	@OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
	private int anInt3421;

	@OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
	private int anInt3419;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIIIIZLclient!nd;)V")
	public Class2_Sub3_Sub5_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class2_Sub3_Sub5 arg8) {
		this.anInt3426 = arg2;
		this.anInt3416 = arg3;
		this.anInt3420 = arg1;
		this.anInt3422 = arg4;
		this.anInt3415 = arg0;
		this.anInt3417 = arg5;
		if (arg6 != -1) {
			this.aClass2_Sub3_Sub8_3 = Static129.method2790(arg6);
			this.anInt3421 = 0;
			this.anInt3419 = Static107.anInt2559 - 1;
			if (this.aClass2_Sub3_Sub8_3.anInt1689 == 0 && arg8 != null && arg8 instanceof Class2_Sub3_Sub5_Sub6) {
				@Pc(51) Class2_Sub3_Sub5_Sub6 local51 = (Class2_Sub3_Sub5_Sub6) arg8;
				if (this.aClass2_Sub3_Sub8_3 == local51.aClass2_Sub3_Sub8_3) {
					this.anInt3421 = local51.anInt3421;
					this.anInt3419 = local51.anInt3419;
					return;
				}
			}
			if (arg7 && this.aClass2_Sub3_Sub8_3.anInt1694 != -1) {
				this.anInt3421 = (int) (Math.random() * (double) this.aClass2_Sub3_Sub8_3.anIntArray109.length);
				this.anInt3419 -= (int) ((double) this.aClass2_Sub3_Sub8_3.anIntArray113[this.anInt3421] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)Lclient!sa;")
	@Override
	protected Class2_Sub3_Sub5_Sub7 method2298() {
		if (this.aClass2_Sub3_Sub8_3 != null) {
			@Pc(14) int local14 = Static107.anInt2559 - this.anInt3419;
			if (local14 > 100 && this.aClass2_Sub3_Sub8_3.anInt1694 > 0) {
				local14 = 100;
			}
			label46: {
				do {
					do {
						if (local14 <= this.aClass2_Sub3_Sub8_3.anIntArray113[this.anInt3421]) {
							break label46;
						}
						local14 -= this.aClass2_Sub3_Sub8_3.anIntArray113[this.anInt3421];
						this.anInt3421++;
					} while (this.anInt3421 < this.aClass2_Sub3_Sub8_3.anIntArray109.length);
					this.anInt3421 -= this.aClass2_Sub3_Sub8_3.anInt1694;
				} while (this.anInt3421 >= 0 && this.aClass2_Sub3_Sub8_3.anIntArray109.length > this.anInt3421);
				this.aClass2_Sub3_Sub8_3 = null;
			}
			this.anInt3419 = Static107.anInt2559 - local14;
		}
		@Pc(106) Class2_Sub3_Sub6 local106 = Static163.method2609(this.anInt3415);
		if (local106.anIntArray61 != null) {
			local106 = local106.method750();
		}
		if (local106 == null) {
			return null;
		}
		@Pc(133) int local133;
		@Pc(130) int local130;
		if (this.anInt3426 == 1 || this.anInt3426 == 3) {
			local130 = local106.anInt1205;
			local133 = local106.anInt1195;
		} else {
			local130 = local106.anInt1195;
			local133 = local106.anInt1205;
		}
		@Pc(156) int local156 = this.anInt3422 + (local133 >> 1);
		@Pc(166) int local166 = this.anInt3422 + (local133 + 1 >> 1);
		@Pc(175) int local175 = this.anInt3417 + (local130 + 1 >> 1);
		@Pc(182) int local182 = this.anInt3417 + (local130 >> 1);
		@Pc(187) int[][] local187 = Static165.anIntArrayArrayArray10[this.anInt3416];
		@Pc(214) int local214 = local187[local156][local182] + local187[local166][local182] + local187[local156][local175] + local187[local166][local175] >> 2;
		@Pc(223) int local223 = (local130 << 6) + (this.anInt3417 << 7);
		@Pc(233) int local233 = (this.anInt3422 << 7) + (local133 << 6);
		return local106.method743(local233, this.anInt3420, this.anInt3421, local223, local187, local214, this.aClass2_Sub3_Sub8_3, this.anInt3426);
	}
}
