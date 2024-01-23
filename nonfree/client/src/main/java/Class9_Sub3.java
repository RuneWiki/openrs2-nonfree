import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class9_Sub3 extends Class9 {

	@OriginalMember(owner = "client!e", name = "w", descriptor = "I")
	private int anInt925 = -32768;

	@OriginalMember(owner = "client!e", name = "x", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!e", name = "O", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!e", name = "F", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!e", name = "S", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!e", name = "P", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!e", name = "I", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!e", name = "K", descriptor = "Lclient!pj;")
	private Class1_Sub1_Sub21 aClass1_Sub1_Sub21_1;

	@OriginalMember(owner = "client!e", name = "R", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!e", name = "u", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIIZLclient!dd;)V")
	public Class9_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class9 arg8) {
		this.anInt926 = arg0;
		this.anInt938 = arg5;
		this.anInt932 = arg1;
		this.anInt941 = arg2;
		this.anInt939 = arg3;
		this.anInt934 = arg4;
		if (arg6 != -1) {
			this.aClass1_Sub1_Sub21_1 = Static74.method1343(arg6);
			this.anInt940 = Static42.anInt910 - 1;
			this.anInt923 = 0;
			if (this.aClass1_Sub1_Sub21_1.anInt3434 == 0 && arg8 != null && arg8 instanceof Class9_Sub3) {
				@Pc(51) Class9_Sub3 local51 = (Class9_Sub3) arg8;
				if (local51.aClass1_Sub1_Sub21_1 == this.aClass1_Sub1_Sub21_1) {
					this.anInt923 = local51.anInt923;
					this.anInt940 = local51.anInt940;
					return;
				}
			}
			if (arg7 && this.aClass1_Sub1_Sub21_1.anInt3439 != -1) {
				this.anInt923 = (int) (Math.random() * (double) this.aClass1_Sub1_Sub21_1.anIntArray449.length);
				this.anInt940 -= (int) (Math.random() * (double) this.aClass1_Sub1_Sub21_1.anIntArray450[this.anInt923]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)Lclient!dd;")
	private Class9 method709() {
		@Pc(8) boolean local8 = Static138.anIntArrayArrayArray17 != Static130.anIntArrayArrayArray16;
		@Pc(13) Class1_Sub1_Sub23 local13 = Static44.method760(this.anInt926);
		if (local13.anIntArray526 != null) {
			local13 = local13.method2938();
		}
		if (local13 == null) {
			return null;
		}
		@Pc(49) int local49;
		@Pc(52) int local52;
		if (this.anInt941 == 1 || this.anInt941 == 3) {
			local49 = local13.anInt4018;
			local52 = local13.anInt4024;
		} else {
			local52 = local13.anInt4018;
			local49 = local13.anInt4024;
		}
		@Pc(67) int local67 = (local49 >> 1) + this.anInt934;
		@Pc(76) int local76 = this.anInt934 + (local49 + 1 >> 1);
		@Pc(83) int local83 = this.anInt938 + (local52 >> 1);
		@Pc(93) int local93 = this.anInt938 + (local52 + 1 >> 1);
		this.method2901(local83 * 128, local67 * 128);
		@Pc(107) int[][] local107 = Static138.anIntArrayArrayArray17[this.anInt939];
		@Pc(133) int local133 = local107[local76][local93] + local107[local76][local83] + local107[local67][local83] + local107[local67][local93] >> 2;
		@Pc(135) int[][] local135 = null;
		if (local8) {
			local135 = Static130.anIntArrayArrayArray16[0];
		} else if (this.anInt939 < 3) {
			local135 = Static138.anIntArrayArrayArray17[this.anInt939 + 1];
		}
		@Pc(165) int local165 = (this.anInt934 << 7) + (local49 << 6);
		@Pc(175) int local175 = (this.anInt938 << 7) + (local52 << 6);
		@Pc(195) Class1_Sub1_Sub1 local195;
		if (this.aClass1_Sub1_Sub21_1 == null) {
			local195 = local13.method2943(local133, local107, local135, local165, this.anInt932, local175, false, this.anInt941);
		} else {
			local195 = local13.method2945(local135, this.anInt923, this.aClass1_Sub1_Sub21_1, this.anInt941, local133, this.anInt932, local165, local175, local107);
		}
		return local195 == null ? null : local195.aClass9_1;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	@Override
	public int method2902() {
		return this.anInt925;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(III)V")
	@Override
	public void method2901(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub1_Sub21_1 == null) {
			return;
		}
		@Pc(14) int local14 = Static42.anInt910 - this.anInt940;
		if (local14 > 100 && this.aClass1_Sub1_Sub21_1.anInt3439 > 0) {
			@Pc(33) int local33 = this.aClass1_Sub1_Sub21_1.anIntArray449.length - this.aClass1_Sub1_Sub21_1.anInt3439;
			while (local33 > this.anInt923 && local14 > this.aClass1_Sub1_Sub21_1.anIntArray450[this.anInt923]) {
				local14 -= this.aClass1_Sub1_Sub21_1.anIntArray450[this.anInt923];
				this.anInt923++;
			}
			if (this.anInt923 >= local33) {
				@Pc(72) int local72 = 0;
				for (@Pc(74) int local74 = local33; local74 < this.aClass1_Sub1_Sub21_1.anIntArray449.length; local74++) {
					local72 += this.aClass1_Sub1_Sub21_1.anIntArray450[local74];
				}
				local14 %= local72;
			}
		}
		label56: {
			do {
				do {
					if (local14 <= this.aClass1_Sub1_Sub21_1.anIntArray450[this.anInt923]) {
						break label56;
					}
					Static90.method1562(arg1, this.anInt923, false, this.aClass1_Sub1_Sub21_1, arg0);
					local14 -= this.aClass1_Sub1_Sub21_1.anIntArray450[this.anInt923];
					this.anInt923++;
				} while (this.aClass1_Sub1_Sub21_1.anIntArray449.length > this.anInt923);
				this.anInt923 -= this.aClass1_Sub1_Sub21_1.anInt3439;
			} while (this.anInt923 >= 0 && this.anInt923 < this.aClass1_Sub1_Sub21_1.anIntArray449.length);
			this.aClass1_Sub1_Sub21_1 = null;
		}
		this.anInt940 = Static42.anInt910 - local14;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(3) Class9 local3 = this.method709();
		if (local3 != null) {
			local3.method2903(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt925 = local3.method2902();
		}
	}
}
