import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
	private int anInt2424 = -1;

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
	private int anInt2426 = -32768;

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "Lclient!ka;")
	private Class64_Sub1 aClass64_Sub1_1 = null;

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
	private int anInt2440 = -1;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
	private int anInt2423;

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
	private int anInt2437;

	@OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
	private int anInt2439;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
	private int anInt2428;

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
	private int anInt2429;

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
	private int anInt2441;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Lclient!qa;")
	private Class96 aClass96_3;

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
	private int anInt2431;

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
	private int anInt2427;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIIIIZLclient!af;)V")
	public Class5_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class5 arg8) {
		this.anInt2423 = arg3;
		this.anInt2437 = arg2;
		this.anInt2439 = arg1;
		this.anInt2428 = arg0;
		this.anInt2429 = arg4;
		this.anInt2441 = arg5;
		if (arg6 != -1) {
			this.aClass96_3 = Static2.method88(arg6);
			this.anInt2431 = 0;
			this.anInt2427 = Static128.anInt2802 - 1;
			if (this.aClass96_3.anInt3659 == 0 && arg8 != null && arg8 instanceof Class5_Sub7) {
				@Pc(62) Class5_Sub7 local62 = (Class5_Sub7) arg8;
				if (local62.aClass96_3 == this.aClass96_3) {
					this.anInt2427 = local62.anInt2427;
					this.anInt2431 = local62.anInt2431;
					return;
				}
			}
			if (arg7 && this.aClass96_3.anInt3645 != -1) {
				this.anInt2431 = (int) ((double) this.aClass96_3.anIntArray323.length * Math.random());
				this.anInt2427 -= (int) (Math.random() * (double) this.aClass96_3.anIntArray327[this.anInt2431]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)V")
	private void method1918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass96_3 == null) {
			return;
		}
		@Pc(13) int local13 = Static128.anInt2802 - this.anInt2427;
		if (local13 > 100 && this.aClass96_3.anInt3645 > 0) {
			@Pc(30) int local30 = this.aClass96_3.anIntArray323.length - this.aClass96_3.anInt3645;
			while (local30 > this.anInt2431 && local13 > this.aClass96_3.anIntArray327[this.anInt2431]) {
				local13 -= this.aClass96_3.anIntArray327[this.anInt2431];
				this.anInt2431++;
			}
			if (local30 <= this.anInt2431) {
				@Pc(77) int local77 = 0;
				for (@Pc(79) int local79 = local30; local79 < this.aClass96_3.anIntArray323.length; local79++) {
					local77 += this.aClass96_3.anIntArray327[local79];
				}
				local13 %= local77;
			}
		}
		label56: {
			do {
				do {
					if (local13 <= this.aClass96_3.anIntArray327[this.anInt2431]) {
						break label56;
					}
					Static133.method2209(arg0, arg1, this.aClass96_3, false, this.anInt2431);
					local13 -= this.aClass96_3.anIntArray327[this.anInt2431];
					this.anInt2431++;
				} while (this.anInt2431 < this.aClass96_3.anIntArray323.length);
				this.anInt2431 -= this.aClass96_3.anInt3645;
			} while (this.anInt2431 >= 0 && this.aClass96_3.anIntArray323.length > this.anInt2431);
			this.aClass96_3 = null;
		}
		this.anInt2427 = Static128.anInt2802 - local13;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class5 local7 = this.method1919();
		if (local7 != null) {
			local7.method2300(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt2426 = local7.method2297();
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method2295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.method1918((arg2 + (arg1 - arg2 >> 1)) * 128 + 64, ((-arg0 + arg3 >> 1) + arg0) * 128 + 64);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Lclient!af;")
	private Class5 method1919() {
		return this.method1921();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "()I")
	@Override
	public int method2297() {
		return this.anInt2426;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZB)Lclient!af;")
	private Class5 method1921() {
		@Pc(8) boolean local8 = Static166.anIntArrayArrayArray11 != Static55.anIntArrayArrayArray5;
		@Pc(17) Class101 local17 = Static170.method2725(this.anInt2428);
		if (local17.anIntArray338 != null) {
			local17 = local17.method2851();
		}
		if (local17 == null) {
			return null;
		}
		@Pc(33) int local33 = this.anInt2437 & 0x3;
		@Pc(49) int local49;
		@Pc(46) int local46;
		if (local33 == 1 || local33 == 3) {
			local46 = local17.anInt3922;
			local49 = local17.anInt3904;
		} else {
			local46 = local17.anInt3904;
			local49 = local17.anInt3922;
		}
		@Pc(64) int local64 = this.anInt2441 + (local46 >> 1);
		@Pc(73) int local73 = this.anInt2441 + (local46 + 1 >> 1);
		@Pc(81) int local81 = this.anInt2429 + (local49 >> 1);
		@Pc(91) int local91 = this.anInt2429 + (local49 + 1 >> 1);
		this.method1918(local64 * 128, local81 * 128);
		@Pc(130) boolean local130 = !local8 && local17.aBoolean350 && (this.anInt2424 != local17.anInt3903 || this.anInt2431 != this.anInt2440 && Static85.anInt1851 >= 2);
		@Pc(141) int[][] local141 = Static166.anIntArrayArrayArray11[this.anInt2423];
		@Pc(150) int local150 = (this.anInt2441 << 7) + (local46 << 6);
		@Pc(159) int local159 = (this.anInt2429 << 7) + (local49 << 6);
		@Pc(186) int local186 = local141[local91][local64] + local141[local81][local64] + local141[local81][local73] + local141[local91][local73] >> 2;
		@Pc(194) int[][] local194 = null;
		@Pc(201) boolean local201 = this.aClass64_Sub1_1 == null;
		if (local8) {
			local194 = Static55.anIntArrayArrayArray5[0];
		} else if (this.anInt2423 < 3) {
			local194 = Static166.anIntArrayArrayArray11[this.anInt2423 + 1];
		}
		@Pc(246) Class80 local246;
		if (this.aClass96_3 == null) {
			local246 = local17.method2839(local150, false, local141, local194, local159, local201 ? Static114.aClass64_Sub1_2 : this.aClass64_Sub1_1, local186, this.anInt2437, this.anInt2439, local130);
		} else {
			local246 = local17.method2846(local141, local159, local150, local186, local201 ? Static114.aClass64_Sub1_2 : this.aClass64_Sub1_1, this.anInt2439, this.anInt2431, this.anInt2437, local130, this.aClass96_3, local194);
		}
		return local246 == null ? null : local246.aClass5_7;
	}
}
