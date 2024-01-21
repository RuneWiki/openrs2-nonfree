import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
	private int anInt3470 = -32768;

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
	private final int anInt3466;

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
	private final int anInt3467;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
	private final int anInt3463;

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
	private final int anInt3464;

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
	private final int anInt3469;

	@OriginalMember(owner = "client!qi", name = "H", descriptor = "I")
	private final int anInt3479;

	@OriginalMember(owner = "client!qi", name = "G", descriptor = "Lclient!td;")
	private Class1_Sub2_Sub22 aClass1_Sub2_Sub22_3;

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
	private int anInt3473;

	@OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
	private int anInt3480;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIIIIIZLclient!wd;)V")
	public Class5_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class5 arg8) {
		this.anInt3466 = arg3;
		this.anInt3467 = arg1;
		this.anInt3463 = arg2;
		this.anInt3464 = arg0;
		this.anInt3469 = arg4;
		this.anInt3479 = arg5;
		if (arg6 != -1) {
			this.aClass1_Sub2_Sub22_3 = Static85.method2622(arg6);
			this.anInt3473 = Static42.anInt1100 - 1;
			this.anInt3480 = 0;
			if (this.aClass1_Sub2_Sub22_3.anInt3996 == 0 && arg8 != null && arg8 instanceof Class5_Sub5) {
				@Pc(53) Class5_Sub5 local53 = (Class5_Sub5) arg8;
				if (this.aClass1_Sub2_Sub22_3 == local53.aClass1_Sub2_Sub22_3) {
					this.anInt3473 = local53.anInt3473;
					this.anInt3480 = local53.anInt3480;
					return;
				}
			}
			if (arg7 && this.aClass1_Sub2_Sub22_3.anInt4005 != -1) {
				this.anInt3480 = (int) (Math.random() * (double) this.aClass1_Sub2_Sub22_3.anIntArray346.length);
				this.anInt3473 -= (int) (Math.random() * (double) this.aClass1_Sub2_Sub22_3.anIntArray344[this.anInt3480]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "()I")
	@Override
	public int method3163() {
		return this.anInt3470;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(3) Class5 local3 = this.method2665();
		if (local3 != null) {
			local3.method3164(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt3470 = local3.method3163();
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)Lclient!wd;")
	private Class5 method2665() {
		@Pc(6) Class1_Sub2_Sub5 local6 = Static37.method702(this.anInt3464);
		if (local6.anIntArray85 != null) {
			local6 = local6.method695();
		}
		if (local6 == null) {
			return null;
		}
		@Pc(30) int local30;
		@Pc(47) int local47;
		@Pc(90) int local90;
		@Pc(92) int local92;
		if (this.aClass1_Sub2_Sub22_3 != null) {
			local30 = Static42.anInt1100 - this.anInt3473;
			if (local30 > 100 && this.aClass1_Sub2_Sub22_3.anInt4005 > 0) {
				local47 = this.aClass1_Sub2_Sub22_3.anIntArray346.length - this.aClass1_Sub2_Sub22_3.anInt4005;
				while (this.anInt3480 < local47 && local30 > this.aClass1_Sub2_Sub22_3.anIntArray344[this.anInt3480]) {
					local30 -= this.aClass1_Sub2_Sub22_3.anIntArray344[this.anInt3480];
					this.anInt3480++;
				}
				if (this.anInt3480 >= local47) {
					local90 = 0;
					for (local92 = local47; local92 < this.aClass1_Sub2_Sub22_3.anIntArray346.length; local92++) {
						local90 += this.aClass1_Sub2_Sub22_3.anIntArray344[local92];
					}
					local30 %= local90;
				}
			}
			label79: {
				do {
					do {
						if (local30 <= this.aClass1_Sub2_Sub22_3.anIntArray344[this.anInt3480]) {
							break label79;
						}
						local30 -= this.aClass1_Sub2_Sub22_3.anIntArray344[this.anInt3480];
						this.anInt3480++;
					} while (this.aClass1_Sub2_Sub22_3.anIntArray346.length > this.anInt3480);
					this.anInt3480 -= this.aClass1_Sub2_Sub22_3.anInt4005;
				} while (this.anInt3480 >= 0 && this.anInt3480 < this.aClass1_Sub2_Sub22_3.anIntArray346.length);
				this.aClass1_Sub2_Sub22_3 = null;
			}
			this.anInt3473 = Static42.anInt1100 - local30;
		}
		if (this.anInt3463 == 1 || this.anInt3463 == 3) {
			local30 = local6.anInt958;
			local47 = local6.anInt976;
		} else {
			local30 = local6.anInt976;
			local47 = local6.anInt958;
		}
		local92 = (local30 + 1 >> 1) + this.anInt3469;
		local90 = this.anInt3469 + (local30 >> 1);
		@Pc(229) int local229 = this.anInt3479 + (local47 >> 1);
		@Pc(238) int local238 = (local47 + 1 >> 1) + this.anInt3479;
		@Pc(243) int[][] local243 = Static186.anIntArrayArrayArray2[this.anInt3466];
		@Pc(270) int local270 = local243[local90][local238] + local243[local92][local229] + local243[local90][local229] + local243[local92][local238] >> 2;
		@Pc(279) int local279 = (local30 << 6) + (this.anInt3469 << 7);
		@Pc(289) int local289 = (this.anInt3479 << 7) + (local47 << 6);
		@Pc(313) Class1_Sub2_Sub11 local313;
		if (this.aClass1_Sub2_Sub22_3 == null) {
			local313 = local6.method691(local243, local289, false, local270, this.anInt3463, local279, this.anInt3467);
		} else {
			local313 = local6.method696(local279, local243, this.anInt3480, this.anInt3463, this.anInt3467, this.aClass1_Sub2_Sub22_3, local270, local289);
		}
		return local313 == null ? null : local313.aClass5_3;
	}
}
