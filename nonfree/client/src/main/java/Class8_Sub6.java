import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class8_Sub6 extends Class8 {

	@OriginalMember(owner = "client!lh", name = "db", descriptor = "I")
	private int anInt2484 = -32768;

	@OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
	private final int anInt2478;

	@OriginalMember(owner = "client!lh", name = "kb", descriptor = "I")
	private final int anInt2486;

	@OriginalMember(owner = "client!lh", name = "U", descriptor = "I")
	private final int anInt2480;

	@OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
	private final int anInt2481;

	@OriginalMember(owner = "client!lh", name = "Z", descriptor = "I")
	private final int anInt2482;

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
	private final int anInt2472;

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "Lclient!re;")
	private Class1_Sub3_Sub20 aClass1_Sub3_Sub20_3;

	@OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
	private int anInt2479;

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
	private int anInt2475;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(IIIIIIIZLclient!e;)V")
	public Class8_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class8 arg8) {
		this.anInt2478 = arg5;
		this.anInt2486 = arg3;
		this.anInt2480 = arg1;
		this.anInt2481 = arg4;
		this.anInt2482 = arg0;
		this.anInt2472 = arg2;
		if (arg6 != -1) {
			this.aClass1_Sub3_Sub20_3 = Static84.method1279(arg6);
			this.anInt2479 = Static155.anInt2981 - 1;
			this.anInt2475 = 0;
			if (this.aClass1_Sub3_Sub20_3.anInt3405 == 0 && arg8 != null && arg8 instanceof Class8_Sub6) {
				@Pc(54) Class8_Sub6 local54 = (Class8_Sub6) arg8;
				if (local54.aClass1_Sub3_Sub20_3 == this.aClass1_Sub3_Sub20_3) {
					this.anInt2479 = local54.anInt2479;
					this.anInt2475 = local54.anInt2475;
					return;
				}
			}
			if (arg7 && this.aClass1_Sub3_Sub20_3.anInt3390 != -1) {
				this.anInt2475 = (int) ((double) this.aClass1_Sub3_Sub20_3.anIntArray300.length * Math.random());
				this.anInt2479 -= (int) (Math.random() * (double) this.aClass1_Sub3_Sub20_3.anIntArray298[this.anInt2475]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)Lclient!e;")
	private Class8 method1716() {
		@Pc(13) Class1_Sub3_Sub5 local13 = Static154.method2362(this.anInt2482);
		if (local13.anIntArray116 != null) {
			local13 = local13.method959();
		}
		if (local13 == null) {
			return null;
		}
		@Pc(36) int local36;
		@Pc(54) int local54;
		@Pc(93) int local93;
		@Pc(95) int local95;
		if (this.aClass1_Sub3_Sub20_3 != null) {
			local36 = Static155.anInt2981 - this.anInt2479;
			if (local36 > 100 && this.aClass1_Sub3_Sub20_3.anInt3390 > 0) {
				local54 = this.aClass1_Sub3_Sub20_3.anIntArray300.length - this.aClass1_Sub3_Sub20_3.anInt3390;
				while (local54 > this.anInt2475 && this.aClass1_Sub3_Sub20_3.anIntArray298[this.anInt2475] < local36) {
					local36 -= this.aClass1_Sub3_Sub20_3.anIntArray298[this.anInt2475];
					this.anInt2475++;
				}
				if (local54 <= this.anInt2475) {
					local93 = 0;
					for (local95 = local54; local95 < this.aClass1_Sub3_Sub20_3.anIntArray300.length; local95++) {
						local93 += this.aClass1_Sub3_Sub20_3.anIntArray298[local95];
					}
					local36 %= local93;
				}
			}
			label79: {
				do {
					do {
						if (this.aClass1_Sub3_Sub20_3.anIntArray298[this.anInt2475] >= local36) {
							break label79;
						}
						local36 -= this.aClass1_Sub3_Sub20_3.anIntArray298[this.anInt2475];
						this.anInt2475++;
					} while (this.anInt2475 < this.aClass1_Sub3_Sub20_3.anIntArray300.length);
					this.anInt2475 -= this.aClass1_Sub3_Sub20_3.anInt3390;
				} while (this.anInt2475 >= 0 && this.anInt2475 < this.aClass1_Sub3_Sub20_3.anIntArray300.length);
				this.aClass1_Sub3_Sub20_3 = null;
			}
			this.anInt2479 = Static155.anInt2981 - local36;
		}
		if (this.anInt2472 == 1 || this.anInt2472 == 3) {
			local54 = local13.anInt1399;
			local36 = local13.anInt1408;
		} else {
			local54 = local13.anInt1408;
			local36 = local13.anInt1399;
		}
		local95 = (local36 + 1 >> 1) + this.anInt2481;
		@Pc(232) int local232 = this.anInt2478 + (local54 >> 1);
		local93 = this.anInt2481 + (local36 >> 1);
		@Pc(244) int[][] local244 = Static156.anIntArrayArrayArray6[this.anInt2486];
		@Pc(253) int local253 = (local54 + 1 >> 1) + this.anInt2478;
		@Pc(280) int local280 = local244[local93][local232] + local244[local95][local232] + local244[local93][local253] + local244[local95][local253] >> 2;
		@Pc(290) int local290 = (this.anInt2481 << 7) + (local36 << 6);
		@Pc(299) int local299 = (local54 << 6) + (this.anInt2478 << 7);
		@Pc(315) Class1_Sub3_Sub25 local315;
		if (this.aClass1_Sub3_Sub20_3 == null) {
			local315 = local13.method966(local280, local290, false, this.anInt2480, local244, local299, this.anInt2472);
		} else {
			local315 = local13.method958(local244, local299, this.anInt2472, this.aClass1_Sub3_Sub20_3, this.anInt2475, this.anInt2480, local280, local290);
		}
		return local315 == null ? null : local315.aClass8_11;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "()I")
	@Override
	public int method2668() {
		return this.anInt2484;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class8 local7 = this.method1716();
		if (local7 != null) {
			local7.method2672(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt2484 = local7.method2668();
		}
	}
}
