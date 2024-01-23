import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class25_Sub7 extends Class25 {

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	private int anInt6157;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
	public int anInt6161;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "Lclient!ll;")
	private Class95_Sub1 aClass95_Sub1_6;

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!wd", name = "I", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!wd", name = "J", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!wd", name = "L", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!wd", name = "O", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!wd", name = "U", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
	private int anInt6162 = 0;

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
	private int anInt6167 = -1;

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "Z")
	private boolean aBoolean329 = false;

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
	private int anInt6171 = 0;

	@OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
	private int anInt6178 = -32768;

	@OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
	private int anInt6175;

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
	private int anInt6156;

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
	public int anInt6165;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
	private int anInt6160;

	@OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
	public int anInt6168;

	@OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
	public int anInt6177;

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
	public int anInt6169;

	@OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
	private int anInt6170;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
	private int anInt6158;

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
	public int anInt6163;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
	private int anInt6164;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Lclient!v;")
	private Class163 aClass163_3;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class25_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt6175 = arg2;
		this.anInt6156 = arg4;
		this.anInt6165 = arg9;
		this.anInt6160 = arg0;
		this.anInt6168 = arg6;
		this.anInt6177 = arg10;
		this.aBoolean329 = false;
		this.anInt6169 = arg1;
		this.anInt6170 = arg8;
		this.anInt6158 = arg7;
		this.anInt6163 = arg5;
		this.anInt6164 = arg3;
		@Pc(58) int local58 = Static43.method942(this.anInt6160).anInt5107;
		if (local58 == -1) {
			this.aClass163_3 = null;
		} else {
			this.aClass163_3 = Static115.method1895(local58);
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "()I")
	@Override
	public int method4773() {
		return this.anInt6178;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBII)V")
	public void method4778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) double local14;
		if (!this.aBoolean329) {
			local14 = arg3 - this.anInt6175;
			@Pc(21) double local21 = (double) (arg2 - this.anInt6164);
			@Pc(30) double local30 = Math.sqrt(local21 * local21 + local14 * local14);
			this.aDouble6 = (double) this.anInt6164 + (double) this.anInt6170 * local21 / local30;
			this.aDouble5 = this.anInt6156;
			this.aDouble8 = (double) this.anInt6175 + local14 * (double) this.anInt6170 / local30;
		}
		local14 = this.anInt6168 + 1 - arg1;
		this.aDouble3 = ((double) arg2 - this.aDouble6) / local14;
		this.aDouble9 = ((double) arg3 - this.aDouble8) / local14;
		this.aDouble4 = Math.sqrt(this.aDouble9 * this.aDouble9 + this.aDouble3 * this.aDouble3);
		if (this.anInt6158 == -1) {
			this.aDouble2 = ((double) arg0 - this.aDouble5) / local14;
		} else {
			if (!this.aBoolean329) {
				this.aDouble2 = -this.aDouble4 * Math.tan((double) this.anInt6158 * 0.02454369D);
			}
			this.aDouble7 = ((double) arg0 - this.aDouble5 - local14 * this.aDouble2) * 2.0D / (local14 * local14);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIIJILclient!ll;)V")
	@Override
	public void method4768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class95_Sub1 arg10) {
		@Pc(7) Class25_Sub2 local7 = this.method4782();
		if (local7 != null) {
			local7.method4768(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass95_Sub1_6);
			this.anInt6178 = local7.method4773();
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V")
	public void method4781(@OriginalArg(1) int arg0) {
		this.aBoolean329 = true;
		this.aDouble6 += this.aDouble3 * (double) arg0;
		this.aDouble8 += this.aDouble9 * (double) arg0;
		if (this.anInt6158 == -1) {
			this.aDouble5 += this.aDouble2 * (double) arg0;
		} else {
			this.aDouble5 += (double) arg0 * this.aDouble2 + (double) arg0 * this.aDouble7 * 0.5D * (double) arg0;
			this.aDouble2 += this.aDouble7 * (double) arg0;
		}
		this.anInt6161 = (int) (Math.atan2(this.aDouble9, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
		this.anInt6157 = (int) (Math.atan2(this.aDouble2, this.aDouble4) * 325.949D) & 0x7FF;
		if (this.aClass163_3 == null) {
			return;
		}
		this.anInt6171 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass163_3.anIntArray589[this.anInt6162] >= this.anInt6171) {
						return;
					}
					this.anInt6171 -= this.aClass163_3.anIntArray589[this.anInt6162];
					this.anInt6162++;
					if (this.anInt6162 >= this.aClass163_3.anIntArray587.length) {
						this.anInt6162 -= this.aClass163_3.anInt5904;
						if (this.anInt6162 < 0 || this.anInt6162 >= this.aClass163_3.anIntArray587.length) {
							this.anInt6162 = 0;
						}
					}
					this.anInt6167 = this.anInt6162 + 1;
				} while (this.aClass163_3.anIntArray587.length > this.anInt6167);
				this.anInt6167 -= this.aClass163_3.anInt5904;
			} while (this.anInt6167 >= 0 && this.anInt6167 < this.aClass163_3.anIntArray587.length);
			this.anInt6167 = -1;
		}
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)Lclient!lf;")
	private Class25_Sub2 method4782() {
		@Pc(8) Class139 local8 = Static43.method942(this.anInt6160);
		@Pc(24) Class25_Sub2 local24 = local8.method4030(this.anInt6171, this.anInt6167, this.anInt6162);
		if (local24 == null) {
			return null;
		} else {
			local24.method3471(this.anInt6157);
			return local24;
		}
	}
}
