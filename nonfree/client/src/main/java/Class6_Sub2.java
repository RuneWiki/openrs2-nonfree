import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!bc", name = "kb", descriptor = "I")
	private int anInt407 = -32768;

	@OriginalMember(owner = "client!bc", name = "eb", descriptor = "I")
	private final int anInt402;

	@OriginalMember(owner = "client!bc", name = "nb", descriptor = "I")
	private final int anInt410;

	@OriginalMember(owner = "client!bc", name = "db", descriptor = "I")
	private final int anInt401;

	@OriginalMember(owner = "client!bc", name = "qb", descriptor = "I")
	private final int anInt412;

	@OriginalMember(owner = "client!bc", name = "sb", descriptor = "I")
	private final int anInt414;

	@OriginalMember(owner = "client!bc", name = "rb", descriptor = "I")
	private final int anInt413;

	@OriginalMember(owner = "client!bc", name = "xb", descriptor = "Lclient!kg;")
	private Class1_Sub2_Sub14 aClass1_Sub2_Sub14_1;

	@OriginalMember(owner = "client!bc", name = "lb", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!bc", name = "tb", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IIIIIIIZLclient!wg;)V")
	public Class6_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class6 arg8) {
		this.anInt402 = arg5;
		this.anInt410 = arg0;
		this.anInt401 = arg4;
		this.anInt412 = arg2;
		this.anInt414 = arg3;
		this.anInt413 = arg1;
		if (arg6 != -1) {
			this.aClass1_Sub2_Sub14_1 = Static173.method2924(arg6);
			this.anInt408 = Static174.anInt3887 - 1;
			this.anInt415 = 0;
			if (this.aClass1_Sub2_Sub14_1.anInt2493 == 0 && arg8 != null && arg8 instanceof Class6_Sub2) {
				@Pc(53) Class6_Sub2 local53 = (Class6_Sub2) arg8;
				if (local53.aClass1_Sub2_Sub14_1 == this.aClass1_Sub2_Sub14_1) {
					this.anInt415 = local53.anInt415;
					this.anInt408 = local53.anInt408;
					return;
				}
			}
			if (arg7 && this.aClass1_Sub2_Sub14_1.anInt2497 != -1) {
				this.anInt415 = (int) ((double) this.aClass1_Sub2_Sub14_1.anIntArray284.length * Math.random());
				this.anInt408 -= (int) (Math.random() * (double) this.aClass1_Sub2_Sub14_1.anIntArray282[this.anInt415]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()I")
	@Override
	public int method2984() {
		return this.anInt407;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class6 local7 = this.method286();
		if (local7 != null) {
			local7.method2989(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt407 = local7.method2984();
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)Lclient!wg;")
	private Class6 method286() {
		@Pc(10) Class1_Sub2_Sub13 local10 = Static5.method65(this.anInt410);
		if (local10.anIntArray227 != null) {
			local10 = local10.method1430();
		}
		if (local10 == null) {
			return null;
		}
		@Pc(29) int local29;
		@Pc(48) int local48;
		@Pc(87) int local87;
		@Pc(89) int local89;
		if (this.aClass1_Sub2_Sub14_1 != null) {
			local29 = Static174.anInt3887 - this.anInt408;
			if (local29 > 100 && this.aClass1_Sub2_Sub14_1.anInt2497 > 0) {
				local48 = this.aClass1_Sub2_Sub14_1.anIntArray284.length - this.aClass1_Sub2_Sub14_1.anInt2497;
				while (this.anInt415 < local48 && local29 > this.aClass1_Sub2_Sub14_1.anIntArray282[this.anInt415]) {
					local29 -= this.aClass1_Sub2_Sub14_1.anIntArray282[this.anInt415];
					this.anInt415++;
				}
				if (local48 <= this.anInt415) {
					local87 = 0;
					for (local89 = local48; local89 < this.aClass1_Sub2_Sub14_1.anIntArray284.length; local89++) {
						local87 += this.aClass1_Sub2_Sub14_1.anIntArray282[local89];
					}
					local29 %= local87;
				}
			}
			label79: {
				do {
					do {
						if (this.aClass1_Sub2_Sub14_1.anIntArray282[this.anInt415] >= local29) {
							break label79;
						}
						local29 -= this.aClass1_Sub2_Sub14_1.anIntArray282[this.anInt415];
						this.anInt415++;
					} while (this.anInt415 < this.aClass1_Sub2_Sub14_1.anIntArray284.length);
					this.anInt415 -= this.aClass1_Sub2_Sub14_1.anInt2497;
				} while (this.anInt415 >= 0 && this.anInt415 < this.aClass1_Sub2_Sub14_1.anIntArray284.length);
				this.aClass1_Sub2_Sub14_1 = null;
			}
			this.anInt408 = Static174.anInt3887 - local29;
		}
		if (this.anInt412 == 1 || this.anInt412 == 3) {
			local48 = local10.anInt1988;
			local29 = local10.anInt2001;
		} else {
			local48 = local10.anInt2001;
			local29 = local10.anInt1988;
		}
		local87 = this.anInt401 + (local29 >> 1);
		local89 = this.anInt401 + (local29 + 1 >> 1);
		@Pc(232) int local232 = (local48 >> 1) + this.anInt402;
		@Pc(241) int local241 = this.anInt402 + (local48 + 1 >> 1);
		@Pc(246) int[][] local246 = Static89.anIntArrayArrayArray3[this.anInt414];
		@Pc(273) int local273 = local246[local89][local241] + local246[local87][local241] + local246[local87][local232] + local246[local89][local232] >> 2;
		@Pc(282) int local282 = (local29 << 6) + (this.anInt401 << 7);
		@Pc(291) int local291 = (this.anInt402 << 7) + (local48 << 6);
		@Pc(312) Class1_Sub2_Sub19 local312;
		if (this.aClass1_Sub2_Sub14_1 == null) {
			local312 = local10.method1434(local282, this.anInt413, local273, this.anInt412, local291, local246, false);
		} else {
			local312 = local10.method1425(this.anInt413, local273, local282, local246, this.anInt412, this.anInt415, local291, this.aClass1_Sub2_Sub14_1);
		}
		return local312 == null ? null : local312.aClass6_9;
	}
}
