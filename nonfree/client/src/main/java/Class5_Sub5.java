import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
	private int anInt3536 = -1;

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "I")
	private int anInt3538 = -32768;

	@OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
	private int anInt3537 = -1;

	@OriginalMember(owner = "client!qc", name = "K", descriptor = "Lclient!fe;")
	private Class41_Sub1 aClass41_Sub1_2 = null;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
	private int anInt3527;

	@OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
	private int anInt3541;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
	private int anInt3530;

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
	private int anInt3529;

	@OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
	private int anInt3542;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
	private int anInt3522;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Lclient!fc;")
	private Class40 aClass40_2;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
	private int anInt3526;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	private int anInt3521;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(IIIIIIIZLclient!ij;)V")
	public Class5_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class5 arg8) {
		this.anInt3527 = arg0;
		this.anInt3541 = arg2;
		this.anInt3530 = arg3;
		this.anInt3529 = arg1;
		this.anInt3542 = arg5;
		this.anInt3522 = arg4;
		if (arg6 != -1) {
			this.aClass40_2 = Static32.method546(arg6);
			this.anInt3526 = Static109.anInt2430 - 1;
			this.anInt3521 = 0;
			if (this.aClass40_2.anInt1245 == 0 && arg8 != null && arg8 instanceof Class5_Sub5) {
				@Pc(60) Class5_Sub5 local60 = (Class5_Sub5) arg8;
				if (this.aClass40_2 == local60.aClass40_2) {
					this.anInt3521 = local60.anInt3521;
					this.anInt3526 = local60.anInt3526;
					return;
				}
			}
			if (arg7 && this.aClass40_2.anInt1248 != -1) {
				this.anInt3521 = (int) ((double) this.aClass40_2.anIntArray75.length * Math.random());
				this.anInt3526 -= (int) ((double) this.aClass40_2.anIntArray76[this.anInt3521] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(3) Class5 local3 = this.method2756();
		if (local3 != null) {
			local3.method3679(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt3538 = local3.method3680();
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)V")
	private void method2753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass40_2 == null) {
			return;
		}
		@Pc(9) int local9 = Static109.anInt2430 - this.anInt3526;
		if (local9 > 100 && this.aClass40_2.anInt1248 > 0) {
			@Pc(27) int local27 = this.aClass40_2.anIntArray75.length - this.aClass40_2.anInt1248;
			while (local27 > this.anInt3521 && this.aClass40_2.anIntArray76[this.anInt3521] < local9) {
				local9 -= this.aClass40_2.anIntArray76[this.anInt3521];
				this.anInt3521++;
			}
			if (this.anInt3521 >= local27) {
				@Pc(66) int local66 = 0;
				for (@Pc(68) int local68 = local27; local68 < this.aClass40_2.anIntArray75.length; local68++) {
					local66 += this.aClass40_2.anIntArray76[local68];
				}
				local9 %= local66;
			}
		}
		label56: {
			do {
				do {
					if (this.aClass40_2.anIntArray76[this.anInt3521] >= local9) {
						break label56;
					}
					Static79.method1375(arg0, false, this.anInt3521, this.aClass40_2, arg1);
					local9 -= this.aClass40_2.anIntArray76[this.anInt3521];
					this.anInt3521++;
				} while (this.aClass40_2.anIntArray75.length > this.anInt3521);
				this.anInt3521 -= this.aClass40_2.anInt1248;
			} while (this.anInt3521 >= 0 && this.aClass40_2.anIntArray75.length > this.anInt3521);
			this.aClass40_2 = null;
		}
		this.anInt3526 = Static109.anInt2430 - local9;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Lclient!ij;")
	private Class5 method2756() {
		return this.method2758();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIZ)V")
	@Override
	public void method3676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method2753(((arg1 - arg0 >> 1) + arg0) * 128 + 64, (arg2 + (-arg2 + arg3 >> 1)) * 128 + 64);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)Lclient!ij;")
	private Class5 method2758() {
		@Pc(8) boolean local8 = Static20.anIntArrayArrayArray2 != Static190.anIntArrayArrayArray9;
		@Pc(17) Class82 local17 = Static9.method132(this.anInt3527);
		if (local17.anIntArray221 != null) {
			local17 = local17.method2583();
		}
		if (local17 == null) {
			return null;
		}
		@Pc(33) int local33 = this.anInt3541 & 0x3;
		@Pc(47) int local47;
		@Pc(44) int local44;
		if (local33 == 1 || local33 == 3) {
			local47 = local17.anInt3279;
			local44 = local17.anInt3258;
		} else {
			local44 = local17.anInt3279;
			local47 = local17.anInt3258;
		}
		@Pc(64) int local64 = (local47 + 1 >> 1) + this.anInt3522;
		@Pc(74) int local74 = this.anInt3542 + (local44 + 1 >> 1);
		@Pc(82) int local82 = this.anInt3522 + (local47 >> 1);
		@Pc(89) int local89 = (local44 >> 1) + this.anInt3542;
		this.method2753(local89 * 128, local82 * 128);
		@Pc(130) boolean local130 = !local8 && local17.aBoolean145 && (this.anInt3537 != local17.anInt3296 || this.anInt3521 != this.anInt3536 && Static16.anInt387 >= 2);
		@Pc(141) int[][] local141 = Static20.anIntArrayArrayArray2[this.anInt3530];
		@Pc(150) int local150 = (this.anInt3542 << 7) + (local44 << 6);
		@Pc(176) int local176 = local141[local64][local74] + local141[local82][local74] + local141[local82][local89] + local141[local64][local89] >> 2;
		@Pc(185) int local185 = (this.anInt3522 << 7) + (local47 << 6);
		@Pc(187) int[][] local187 = null;
		if (local8) {
			local187 = Static190.anIntArrayArrayArray9[0];
		} else if (this.anInt3530 < 3) {
			local187 = Static20.anIntArrayArrayArray2[this.anInt3530 + 1];
		}
		@Pc(212) boolean local212 = this.aClass41_Sub1_2 == null;
		@Pc(236) Class120 local236;
		if (this.aClass40_2 == null) {
			local236 = local17.method2577(false, local212 ? Static139.aClass41_Sub1_1 : this.aClass41_Sub1_2, this.anInt3529, local130, local185, this.anInt3541, local141, local176, local150, local187);
		} else {
			local236 = local17.method2578(this.aClass40_2, this.anInt3529, this.anInt3541, this.anInt3521, local150, local141, local185, local212 ? Static139.aClass41_Sub1_1 : this.aClass41_Sub1_2, local187, local130, local176);
		}
		return local236 == null ? null : local236.aClass5_10;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()I")
	@Override
	public int method3680() {
		return this.anInt3538;
	}
}
