import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!rh;")
	private Class78_Sub1 aClass78_Sub1_2 = null;

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
	private int anInt861 = -1;

	@OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
	private int anInt870 = -1;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
	private int anInt865 = -32768;

	@OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "Lclient!tc;")
	private Class110 aClass110_1;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIIIZLclient!ta;)V")
	public Class20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class20 arg8) {
		this.anInt866 = arg2;
		this.anInt857 = arg5;
		this.anInt858 = arg1;
		this.anInt871 = arg4;
		this.anInt867 = arg3;
		this.anInt869 = arg0;
		if (arg6 != -1) {
			this.aClass110_1 = Static200.method3204(arg6);
			this.anInt855 = 0;
			this.anInt868 = Static107.anInt2132 - 1;
			if (this.aClass110_1.anInt4014 == 0 && arg8 != null && arg8 instanceof Class20_Sub1) {
				@Pc(59) Class20_Sub1 local59 = (Class20_Sub1) arg8;
				if (local59.aClass110_1 == this.aClass110_1) {
					this.anInt855 = local59.anInt855;
					this.anInt868 = local59.anInt868;
					return;
				}
			}
			if (arg7 && this.aClass110_1.anInt4010 != -1) {
				this.anInt855 = (int) (Math.random() * (double) this.aClass110_1.anIntArray458.length);
				this.anInt868 -= (int) ((double) this.aClass110_1.anIntArray460[this.anInt855] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "()I")
	@Override
	public int method3494() {
		return this.anInt865;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(3) Class20 local3 = this.method640();
		if (local3 != null) {
			local3.method3495(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt865 = local3.method3494();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.method641((arg0 + (arg2 - arg0 >> 1)) * 128 + 64, (arg3 - -(-arg3 + arg1 >> 1)) * 128 + 64);
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)Lclient!ta;")
	private Class20 method640() {
		return this.method642();
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)V")
	private void method641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass110_1 == null) {
			return;
		}
		@Pc(22) int local22 = Static107.anInt2132 - this.anInt868;
		if (local22 > 100 && this.aClass110_1.anInt4010 > 0) {
			@Pc(39) int local39 = this.aClass110_1.anIntArray458.length - this.aClass110_1.anInt4010;
			while (this.anInt855 < local39 && this.aClass110_1.anIntArray460[this.anInt855] < local22) {
				local22 -= this.aClass110_1.anIntArray460[this.anInt855];
				this.anInt855++;
			}
			if (local39 <= this.anInt855) {
				@Pc(82) int local82 = 0;
				for (@Pc(84) int local84 = local39; local84 < this.aClass110_1.anIntArray458.length; local84++) {
					local82 += this.aClass110_1.anIntArray460[local84];
				}
				local22 %= local82;
			}
		}
		while (local22 > this.aClass110_1.anIntArray460[this.anInt855]) {
			Static80.method1140(this.anInt855, arg0, arg1, false, this.aClass110_1);
			local22 -= this.aClass110_1.anIntArray460[this.anInt855];
			this.anInt855++;
			if (this.aClass110_1.anIntArray458.length <= this.anInt855) {
				this.anInt855 -= this.aClass110_1.anInt4010;
				if (this.anInt855 < 0 || this.anInt855 >= this.aClass110_1.anIntArray458.length) {
					this.aClass110_1 = null;
					break;
				}
			}
		}
		this.anInt868 = Static107.anInt2132 - local22;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)Lclient!ta;")
	private Class20 method642() {
		@Pc(20) boolean local20 = Static224.anIntArrayArrayArray2 != Static119.anIntArrayArrayArray10;
		@Pc(25) Class18 local25 = Static148.method2487(this.anInt869);
		if (local25.anIntArray66 != null) {
			local25 = local25.method599();
		}
		if (local25 == null) {
			return null;
		}
		@Pc(41) int local41 = this.anInt866 & 0x3;
		@Pc(55) int local55;
		@Pc(52) int local52;
		if (local41 == 1 || local41 == 3) {
			local55 = local25.anInt822;
			local52 = local25.anInt811;
		} else {
			local52 = local25.anInt822;
			local55 = local25.anInt811;
		}
		@Pc(71) int local71 = this.anInt871 + (local55 >> 1);
		@Pc(79) int local79 = this.anInt857 + (local52 >> 1);
		@Pc(88) int local88 = (local55 + 1 >> 1) + this.anInt871;
		@Pc(98) int local98 = this.anInt857 + (local52 + 1 >> 1);
		this.method641(local79 * 128, local71 * 128);
		@Pc(131) boolean local131 = !local20 && local25.aBoolean31 && (local25.anInt790 != this.anInt861 || this.anInt855 != this.anInt870 && Static214.anInt4250 >= 2);
		@Pc(142) int[][] local142 = Static119.anIntArrayArrayArray10[this.anInt867];
		@Pc(151) int local151 = (this.anInt871 << 7) + (local55 << 6);
		@Pc(161) int local161 = (this.anInt857 << 7) + (local52 << 6);
		@Pc(163) int[][] local163 = null;
		@Pc(170) boolean local170 = this.aClass78_Sub1_2 == null;
		@Pc(196) int local196 = local142[local88][local98] + local142[local71][local98] + local142[local88][local79] + local142[local71][local79] >> 2;
		if (local20) {
			local163 = Static224.anIntArrayArrayArray2[0];
		} else if (this.anInt867 < 3) {
			local163 = Static119.anIntArrayArrayArray10[this.anInt867 + 1];
		}
		@Pc(240) Class113 local240;
		if (this.aClass110_1 == null) {
			local240 = local25.method605(local161, false, local142, local170 ? Static5.aClass78_Sub1_1 : this.aClass78_Sub1_2, local151, local196, local163, local131, this.anInt858, this.anInt866);
		} else {
			local240 = local25.method592(local151, this.anInt858, local142, local161, this.anInt855, local196, this.anInt866, this.aClass110_1, local163, local170 ? Static5.aClass78_Sub1_1 : this.aClass78_Sub1_2, local131);
		}
		return local240 == null ? null : local240.aClass20_6;
	}
}
