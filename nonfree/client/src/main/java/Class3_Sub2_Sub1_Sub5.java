import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class3_Sub2_Sub1_Sub5 extends Class3_Sub2_Sub1 {

	@OriginalMember(owner = "client!pf", name = "cb", descriptor = "I")
	private final int anInt3153;

	@OriginalMember(owner = "client!pf", name = "ib", descriptor = "I")
	private final int anInt3157;

	@OriginalMember(owner = "client!pf", name = "bb", descriptor = "I")
	private final int anInt3152;

	@OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
	private final int anInt3151;

	@OriginalMember(owner = "client!pf", name = "W", descriptor = "I")
	private final int anInt3148;

	@OriginalMember(owner = "client!pf", name = "Y", descriptor = "I")
	private final int anInt3150;

	@OriginalMember(owner = "client!pf", name = "eb", descriptor = "Lclient!ca;")
	private Class3_Sub2_Sub4 aClass3_Sub2_Sub4_2;

	@OriginalMember(owner = "client!pf", name = "gb", descriptor = "I")
	private int anInt3155;

	@OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
	private int anInt3146;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IIIIIIIZLclient!kb;)V")
	public Class3_Sub2_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class3_Sub2_Sub1 arg8) {
		this.anInt3153 = arg5;
		this.anInt3157 = arg4;
		this.anInt3152 = arg0;
		this.anInt3151 = arg1;
		this.anInt3148 = arg3;
		this.anInt3150 = arg2;
		if (arg6 != -1) {
			this.aClass3_Sub2_Sub4_2 = Static21.method594(arg6);
			this.anInt3155 = 0;
			this.anInt3146 = Static14.anInt481 - 1;
			if (this.aClass3_Sub2_Sub4_2.anInt549 == 0 && arg8 != null && arg8 instanceof Class3_Sub2_Sub1_Sub5) {
				@Pc(51) Class3_Sub2_Sub1_Sub5 local51 = (Class3_Sub2_Sub1_Sub5) arg8;
				if (this.aClass3_Sub2_Sub4_2 == local51.aClass3_Sub2_Sub4_2) {
					this.anInt3146 = local51.anInt3146;
					this.anInt3155 = local51.anInt3155;
					return;
				}
			}
			if (arg7 && this.aClass3_Sub2_Sub4_2.anInt533 != -1) {
				this.anInt3155 = (int) (Math.random() * (double) this.aClass3_Sub2_Sub4_2.anIntArray142.length);
				this.anInt3146 -= (int) (Math.random() * (double) this.aClass3_Sub2_Sub4_2.anIntArray139[this.anInt3155]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)Lclient!d;")
	@Override
	protected Class3_Sub2_Sub1_Sub1 method2761() {
		if (this.aClass3_Sub2_Sub4_2 != null) {
			@Pc(14) int local14 = Static14.anInt481 - this.anInt3146;
			if (local14 > 100 && this.aClass3_Sub2_Sub4_2.anInt533 > 0) {
				local14 = 100;
			}
			label46: {
				do {
					do {
						if (this.aClass3_Sub2_Sub4_2.anIntArray139[this.anInt3155] >= local14) {
							break label46;
						}
						local14 -= this.aClass3_Sub2_Sub4_2.anIntArray139[this.anInt3155];
						this.anInt3155++;
					} while (this.aClass3_Sub2_Sub4_2.anIntArray142.length > this.anInt3155);
					this.anInt3155 -= this.aClass3_Sub2_Sub4_2.anInt533;
				} while (this.anInt3155 >= 0 && this.aClass3_Sub2_Sub4_2.anIntArray142.length > this.anInt3155);
				this.aClass3_Sub2_Sub4_2 = null;
			}
			this.anInt3146 = Static14.anInt481 - local14;
		}
		@Pc(101) Class3_Sub2_Sub18 local101 = Static86.method1991(this.anInt3152);
		if (local101.anIntArray699 != null) {
			local101 = local101.method3185();
		}
		if (local101 == null) {
			return null;
		}
		@Pc(123) int local123;
		@Pc(126) int local126;
		if (this.anInt3150 == 1 || this.anInt3150 == 3) {
			local123 = local101.anInt4226;
			local126 = local101.anInt4242;
		} else {
			local126 = local101.anInt4226;
			local123 = local101.anInt4242;
		}
		@Pc(142) int local142 = this.anInt3157 + (local123 >> 1);
		@Pc(151) int local151 = this.anInt3157 + (local123 + 1 >> 1);
		@Pc(159) int local159 = this.anInt3153 + (local126 >> 1);
		@Pc(164) int[][] local164 = Static90.anIntArrayArrayArray31[this.anInt3148];
		@Pc(174) int local174 = this.anInt3153 + (local126 + 1 >> 1);
		@Pc(202) int local202 = local164[local151][local174] + local164[local142][local159] + local164[local151][local159] + local164[local142][local174] >> 2;
		@Pc(212) int local212 = (this.anInt3157 << 7) + (local123 << 6);
		@Pc(222) int local222 = (this.anInt3153 << 7) + (local126 << 6);
		return local101.method3182(local202, this.aClass3_Sub2_Sub4_2, this.anInt3155, local222, local212, this.anInt3150, this.anInt3151, local164);
	}
}
