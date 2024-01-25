import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class376 {

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
	private int anInt11031;

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
	private int anInt11040;

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "Lclient!mi;")
	private Class46 aClass46_30;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "Z")
	private boolean aBoolean752 = true;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
	private int anInt11037 = -1;

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
	private final int anInt11032;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
	private final int anInt11036;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "[Lclient!ki;")
	private final Class179[] aClass179Array1;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
	private final int anInt11033;

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
	private final int anInt11042;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "[Lclient!ki;")
	private final Class179[] aClass179Array2;

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "Lclient!ki;")
	private final Class179 aClass179_1;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(I[Lclient!ki;IIII)V")
	public Class376(@OriginalArg(0) int arg0, @OriginalArg(1) Class179[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt11032 = arg5;
		this.anInt11036 = arg0;
		this.aClass179Array1 = arg1;
		this.anInt11033 = arg4;
		this.anInt11042 = arg3;
		if (arg1 == null) {
			this.aClass179Array2 = null;
			this.aClass179_1 = null;
		} else {
			this.aClass179Array2 = new Class179[arg1.length];
			this.aClass179_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!ha;I)Z")
	public boolean method9209(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt11037) {
			this.anInt11037 = arg1;
			@Pc(16) int local16 = Static14.method293(arg1);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt11040 != local16) {
				this.aClass46_30 = null;
				this.anInt11040 = local16;
			}
			if (this.aClass179Array1 != null) {
				this.anInt11031 = 0;
				@Pc(53) int[] local53 = new int[this.aClass179Array1.length];
				for (@Pc(55) int local55 = 0; local55 < this.aClass179Array1.length; local55++) {
					@Pc(62) Class179 local62 = this.aClass179Array1[local55];
					if (local62.method5271(this.anInt11042, this.anInt11033, this.anInt11032, this.anInt11037)) {
						local53[this.anInt11031] = local62.anInt6217;
						this.aClass179Array2[this.anInt11031++] = local62;
					}
				}
				Static61.method7222(this.anInt11031 - 1, 0, local53, this.aClass179Array2);
			}
			this.aBoolean752 = true;
		}
		@Pc(121) boolean local121 = false;
		if (this.aBoolean752) {
			this.aBoolean752 = false;
			for (@Pc(132) int local132 = this.anInt11031 - 1; local132 >= 0; local132--) {
				@Pc(143) boolean local143 = this.aClass179Array2[local132].method5274(arg0, this.aClass179_1);
				local121 |= local143;
				this.aBoolean752 |= !local143;
			}
		}
		return local121;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!ha;BIIIIIII)V")
	public void method9210(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg0 + arg5 & 0x3FFF;
		if (this.anInt11036 == -1 || this.anInt11040 == 0) {
			arg1.aa(arg2, arg4, arg3, arg8, arg7, 0);
		} else {
			@Pc(28) Class127 local28 = Static192.anInterface4_9.method8048(this.anInt11036);
			if (this.aClass46_30 == null && Static192.anInterface4_9.method8049(this.anInt11036)) {
				@Pc(67) int[] local67 = local28.anInt4659 == 2 ? Static192.anInterface4_9.method8051(this.anInt11040, 0.7F, this.anInt11036, this.anInt11040) : Static192.anInterface4_9.method8050(false, this.anInt11036, 0.7F, this.anInt11040, this.anInt11040);
				this.aClass46_30 = arg1.method7265(this.anInt11040, local67, this.anInt11040, this.anInt11040);
			}
			if (local28.anInt4659 == 2) {
				arg1.aa(arg2, arg4, arg3, arg8, arg7, 0);
			}
			if (this.aClass46_30 != null) {
				@Pc(105) int local105 = local28.anInt4659 == 2 ? 1 : 0;
				@Pc(111) int local111 = arg8 * arg6 / -4096;
				@Pc(124) int local124;
				for (local124 = (arg3 - arg8) / 2 + arg8 * local7 / 4096; local124 > arg8; local124 -= arg8) {
				}
				while (local124 < 0) {
					local124 += arg8;
				}
				while (arg8 < local111) {
					local111 -= arg8;
				}
				while (local111 < 0) {
					local111 += arg8;
				}
				for (@Pc(163) int local163 = local124 - arg8; local163 < arg3; local163 += arg8) {
					for (@Pc(170) int local170 = local111 - arg8; local170 < arg8; local170 += arg8) {
						this.aClass46_30.method6209(arg2 + local163, local170 + arg4, arg8, arg8, 1, 0, local105);
					}
				}
			}
		}
		for (@Pc(223) int local223 = this.anInt11031 - 1; local223 >= 0; local223--) {
			this.aClass179Array2[local223].method5275(arg1, arg2, arg4, arg3, arg8, arg6, local7);
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
	public void method9212() {
		if (this.aClass179Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass179Array1.length; local10++) {
				this.aClass179Array1[local10].method5272();
			}
		}
		this.aClass46_30 = null;
	}
}
