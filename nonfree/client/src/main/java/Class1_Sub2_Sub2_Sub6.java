import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class1_Sub2_Sub2_Sub6 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!jh", name = "Z", descriptor = "I")
	private final int anInt2426;

	@OriginalMember(owner = "client!jh", name = "hb", descriptor = "I")
	private final int anInt2432;

	@OriginalMember(owner = "client!jh", name = "fb", descriptor = "I")
	private final int anInt2430;

	@OriginalMember(owner = "client!jh", name = "bb", descriptor = "I")
	private final int anInt2427;

	@OriginalMember(owner = "client!jh", name = "nb", descriptor = "I")
	private final int anInt2435;

	@OriginalMember(owner = "client!jh", name = "ib", descriptor = "I")
	private final int anInt2433;

	@OriginalMember(owner = "client!jh", name = "ab", descriptor = "Lclient!fa;")
	private Class1_Sub2_Sub8 aClass1_Sub2_Sub8_3;

	@OriginalMember(owner = "client!jh", name = "eb", descriptor = "I")
	private int anInt2429;

	@OriginalMember(owner = "client!jh", name = "qb", descriptor = "I")
	private int anInt2437;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IIIIIIIZLclient!lc;)V")
	public Class1_Sub2_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class1_Sub2_Sub2 arg8) {
		this.anInt2426 = arg2;
		this.anInt2432 = arg0;
		this.anInt2430 = arg5;
		this.anInt2427 = arg1;
		this.anInt2435 = arg3;
		this.anInt2433 = arg4;
		if (arg6 != -1) {
			this.aClass1_Sub2_Sub8_3 = Static142.method2538(arg6);
			this.anInt2429 = 0;
			this.anInt2437 = Static78.anInt2168 - 1;
			if (this.aClass1_Sub2_Sub8_3.anInt1509 == 0 && arg8 != null && arg8 instanceof Class1_Sub2_Sub2_Sub6) {
				@Pc(47) Class1_Sub2_Sub2_Sub6 local47 = (Class1_Sub2_Sub2_Sub6) arg8;
				if (this.aClass1_Sub2_Sub8_3 == local47.aClass1_Sub2_Sub8_3) {
					this.anInt2437 = local47.anInt2437;
					this.anInt2429 = local47.anInt2429;
					return;
				}
			}
			if (arg7 && this.aClass1_Sub2_Sub8_3.anInt1520 != -1) {
				this.anInt2429 = (int) ((double) this.aClass1_Sub2_Sub8_3.anIntArray157.length * Math.random());
				this.anInt2437 -= (int) (Math.random() * (double) this.aClass1_Sub2_Sub8_3.anIntArray155[this.anInt2429]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(B)Lclient!ia;")
	@Override
	protected Class1_Sub2_Sub2_Sub5 method2706() {
		if (this.aClass1_Sub2_Sub8_3 != null) {
			@Pc(14) int local14 = Static78.anInt2168 - this.anInt2437;
			if (local14 > 100 && this.aClass1_Sub2_Sub8_3.anInt1520 > 0) {
				local14 = 100;
			}
			label46: {
				do {
					do {
						if (this.aClass1_Sub2_Sub8_3.anIntArray155[this.anInt2429] >= local14) {
							break label46;
						}
						local14 -= this.aClass1_Sub2_Sub8_3.anIntArray155[this.anInt2429];
						this.anInt2429++;
					} while (this.aClass1_Sub2_Sub8_3.anIntArray157.length > this.anInt2429);
					this.anInt2429 -= this.aClass1_Sub2_Sub8_3.anInt1520;
				} while (this.anInt2429 >= 0 && this.anInt2429 < this.aClass1_Sub2_Sub8_3.anIntArray157.length);
				this.aClass1_Sub2_Sub8_3 = null;
			}
			this.anInt2437 = Static78.anInt2168 - local14;
		}
		@Pc(96) Class1_Sub2_Sub14 local96 = Static4.method79(this.anInt2432);
		if (local96.anIntArray326 != null) {
			local96 = local96.method2385();
		}
		if (local96 == null) {
			return null;
		}
		@Pc(125) int local125;
		@Pc(122) int local122;
		if (this.anInt2426 == 1 || this.anInt2426 == 3) {
			local122 = local96.anInt3302;
			local125 = local96.anInt3314;
		} else {
			local122 = local96.anInt3314;
			local125 = local96.anInt3302;
		}
		@Pc(140) int local140 = (local125 >> 1) + this.anInt2433;
		@Pc(150) int local150 = this.anInt2433 + (local125 + 1 >> 1);
		@Pc(157) int local157 = (local122 >> 1) + this.anInt2430;
		@Pc(162) int[][] local162 = Static183.anIntArrayArrayArray8[this.anInt2435];
		@Pc(172) int local172 = (this.anInt2433 << 7) + (local125 << 6);
		@Pc(181) int local181 = (local122 + 1 >> 1) + this.anInt2430;
		@Pc(214) int local214 = local162[local140][local157] + local162[local150][local157] + local162[local140][local181] + local162[local150][local181] >> 2;
		@Pc(223) int local223 = (local122 << 6) + (this.anInt2430 << 7);
		return local96.method2383(local172, this.anInt2427, this.anInt2429, local223, this.aClass1_Sub2_Sub8_3, local214, local162, this.anInt2426);
	}
}
