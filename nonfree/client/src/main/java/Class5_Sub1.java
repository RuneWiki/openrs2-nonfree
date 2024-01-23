import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!af", name = "u", descriptor = "I")
	private int anInt215 = -1;

	@OriginalMember(owner = "client!af", name = "A", descriptor = "I")
	private int anInt220 = -1;

	@OriginalMember(owner = "client!af", name = "v", descriptor = "I")
	private int anInt216 = -32768;

	@OriginalMember(owner = "client!af", name = "I", descriptor = "Lclient!qg;")
	private Class79_Sub1 aClass79_Sub1_1 = null;

	@OriginalMember(owner = "client!af", name = "s", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!af", name = "w", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!af", name = "F", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!af", name = "R", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!af", name = "P", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!af", name = "O", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!af", name = "D", descriptor = "Lclient!c;")
	private Class2_Sub3_Sub3 aClass2_Sub3_Sub3_1;

	@OriginalMember(owner = "client!af", name = "L", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!af", name = "H", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIIIZLclient!qf;)V")
	public Class5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class5 arg8) {
		this.anInt213 = arg2;
		this.anInt217 = arg4;
		this.anInt223 = arg5;
		this.anInt232 = arg0;
		this.anInt231 = arg3;
		this.anInt230 = arg1;
		if (arg6 != -1) {
			this.aClass2_Sub3_Sub3_1 = Static187.method3447(arg6);
			this.anInt227 = 0;
			this.anInt225 = Static123.anInt2808 - 1;
			if (this.aClass2_Sub3_Sub3_1.anInt439 == 0 && arg8 != null && arg8 instanceof Class5_Sub1) {
				@Pc(62) Class5_Sub1 local62 = (Class5_Sub1) arg8;
				if (this.aClass2_Sub3_Sub3_1 == local62.aClass2_Sub3_Sub3_1) {
					this.anInt227 = local62.anInt227;
					this.anInt225 = local62.anInt225;
					return;
				}
			}
			if (arg7 && this.aClass2_Sub3_Sub3_1.anInt448 != -1) {
				this.anInt227 = (int) (Math.random() * (double) this.aClass2_Sub3_Sub3_1.anIntArray76.length);
				this.anInt225 -= (int) (Math.random() * (double) this.aClass2_Sub3_Sub3_1.anIntArray77[this.anInt227]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIB)V")
	@Override
	public void method3777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method154((arg1 + (arg0 - arg1 >> 1)) * 128 + 64, ((-arg3 + arg2 >> 1) + arg3) * 128 + 64);
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "()I")
	@Override
	public int method3773() {
		return this.anInt216;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(III)V")
	private void method154(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub3_Sub3_1 == null) {
			return;
		}
		@Pc(14) int local14 = Static123.anInt2808 - this.anInt225;
		if (local14 > 100 && this.aClass2_Sub3_Sub3_1.anInt448 > 0) {
			@Pc(31) int local31 = this.aClass2_Sub3_Sub3_1.anIntArray76.length - this.aClass2_Sub3_Sub3_1.anInt448;
			while (local31 > this.anInt227 && local14 > this.aClass2_Sub3_Sub3_1.anIntArray77[this.anInt227]) {
				local14 -= this.aClass2_Sub3_Sub3_1.anIntArray77[this.anInt227];
				this.anInt227++;
			}
			if (this.anInt227 >= local31) {
				@Pc(70) int local70 = 0;
				for (@Pc(72) int local72 = local31; local72 < this.aClass2_Sub3_Sub3_1.anIntArray76.length; local72++) {
					local70 += this.aClass2_Sub3_Sub3_1.anIntArray77[local72];
				}
				local14 %= local70;
			}
		}
		label56: {
			do {
				do {
					if (local14 <= this.aClass2_Sub3_Sub3_1.anIntArray77[this.anInt227]) {
						break label56;
					}
					Static118.method2181(false, this.anInt227, arg0, arg1, this.aClass2_Sub3_Sub3_1);
					local14 -= this.aClass2_Sub3_Sub3_1.anIntArray77[this.anInt227];
					this.anInt227++;
				} while (this.aClass2_Sub3_Sub3_1.anIntArray76.length > this.anInt227);
				this.anInt227 -= this.aClass2_Sub3_Sub3_1.anInt448;
			} while (this.anInt227 >= 0 && this.aClass2_Sub3_Sub3_1.anIntArray76.length > this.anInt227);
			this.aClass2_Sub3_Sub3_1 = null;
		}
		this.anInt225 = Static123.anInt2808 - local14;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)Lclient!qf;")
	private Class5 method155() {
		return this.method157();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class5 local7 = this.method155();
		if (local7 != null) {
			local7.method3779(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt216 = local7.method3773();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)Lclient!qf;")
	private Class5 method157() {
		@Pc(20) boolean local20 = Static144.anIntArrayArrayArray7 != Static11.anIntArrayArrayArray1;
		@Pc(25) Class2_Sub3_Sub17 local25 = Static121.method3984(this.anInt232);
		if (local25.anIntArray413 != null) {
			local25 = local25.method1867();
		}
		if (local25 == null) {
			return null;
		}
		@Pc(41) int local41 = this.anInt213 & 0x3;
		@Pc(53) int local53;
		@Pc(50) int local50;
		if (local41 == 1 || local41 == 3) {
			local50 = local25.anInt2394;
			local53 = local25.anInt2387;
		} else {
			local50 = local25.anInt2387;
			local53 = local25.anInt2394;
		}
		@Pc(70) int local70 = (local53 + 1 >> 1) + this.anInt217;
		@Pc(77) int local77 = (local50 >> 1) + this.anInt223;
		@Pc(86) int local86 = (local50 + 1 >> 1) + this.anInt223;
		@Pc(94) int local94 = this.anInt217 + (local53 >> 1);
		this.method154(local94 * 128, local77 * 128);
		@Pc(133) boolean local133 = !local20 && local25.aBoolean100 && (local25.anInt2402 != this.anInt220 || this.anInt215 != this.anInt227 && Static139.anInt2666 >= 2);
		@Pc(144) int[][] local144 = Static144.anIntArrayArrayArray7[this.anInt231];
		@Pc(170) int local170 = local144[local70][local86] + local144[local94][local86] + local144[local70][local77] + local144[local94][local77] >> 2;
		@Pc(172) int[][] local172 = null;
		if (local20) {
			local172 = Static11.anIntArrayArrayArray1[0];
		} else if (this.anInt231 < 3) {
			local172 = Static144.anIntArrayArrayArray7[this.anInt231 + 1];
		}
		@Pc(200) int local200 = (this.anInt223 << 7) + (local50 << 6);
		@Pc(209) int local209 = (local53 << 6) + (this.anInt217 << 7);
		@Pc(229) Class2_Sub3_Sub20 local229;
		if (this.aClass2_Sub3_Sub3_1 == null) {
			local229 = local25.method1874(local133, false, this.anInt230, this.aClass79_Sub1_1, local170, local172, local200, local144, local209, this.anInt213);
		} else {
			local229 = local25.method1872(local144, this.aClass2_Sub3_Sub3_1, local172, this.anInt230, this.anInt213, local200, local209, local133, this.anInt227, local170, this.aClass79_Sub1_1);
		}
		return local229 == null ? null : local229.aClass5_4;
	}
}
