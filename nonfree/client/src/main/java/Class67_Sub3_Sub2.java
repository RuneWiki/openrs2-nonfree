import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class67_Sub3_Sub2 extends Class67_Sub3 {

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
	private int anInt2941;

	@OriginalMember(owner = "client!ka", name = "Q", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ka", name = "Z", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ka", name = "db", descriptor = "Lclient!e;")
	private Class10_Sub2 aClass10_Sub2_2;

	@OriginalMember(owner = "client!ka", name = "mb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ka", name = "ob", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ka", name = "pb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ka", name = "yb", descriptor = "I")
	private int anInt2965;

	@OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
	private int anInt2940 = 0;

	@OriginalMember(owner = "client!ka", name = "U", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!ka", name = "bb", descriptor = "I")
	private int anInt2950 = -32768;

	@OriginalMember(owner = "client!ka", name = "vb", descriptor = "I")
	private int anInt2962 = 0;

	@OriginalMember(owner = "client!ka", name = "wb", descriptor = "I")
	private int anInt2963 = -1;

	@OriginalMember(owner = "client!ka", name = "nb", descriptor = "I")
	public final int anInt2958;

	@OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
	public final int anInt2945;

	@OriginalMember(owner = "client!ka", name = "fb", descriptor = "I")
	public final int anInt2953;

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
	public final int anInt2936;

	@OriginalMember(owner = "client!ka", name = "hb", descriptor = "I")
	private final int anInt2955;

	@OriginalMember(owner = "client!ka", name = "lb", descriptor = "I")
	private final int lb;

	@OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
	private final int anInt2948;

	@OriginalMember(owner = "client!ka", name = "T", descriptor = "Lclient!jm;")
	private final Class111 aClass111_2;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class67_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt2958 = arg10;
		this.anInt2945 = arg6;
		this.anInt2953 = arg5;
		this.anInt2936 = arg9;
		this.anInt2955 = arg8;
		this.lb = arg0;
		this.anInt2948 = arg7;
		this.aBoolean192 = false;
		@Pc(64) int local64 = Static89.method1296(this.lb).anInt6649;
		if (local64 == -1) {
			this.aClass111_2 = null;
		} else {
			this.aClass111_2 = Static306.method5143(local64);
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
	@Override
	public void method5403() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public void method2494() {
		if (this.aClass10_Sub2_2 != null) {
			this.aClass10_Sub2_2.method989();
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
	@Override
	public void method5406() {
		super.aShort90 = super.aShort92 = (short) (this.aDouble4 / 128.0D);
		super.aShort91 = super.aShort93 = (short) (this.aDouble6 / 128.0D);
	}

	@OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass10_Sub2_2 != null) {
			this.aClass10_Sub2_2.method989();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!uo;I)Z")
	@Override
	public boolean method5400(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5395(@OriginalArg(0) Class129 arg0) {
		@Pc(11) Class126 local11 = this.method2501(0, arg0);
		if (local11 == null) {
			return;
		}
		@Pc(17) Class61 local17 = arg0.method4979();
		local17.method3655(this.anInt2941);
		local17.method3657(this.anInt2965);
		local17.method3665((int) this.aDouble6, (int) this.aDouble1, (int) this.aDouble4);
		this.anInt2950 = local11.method3155();
		this.method2499(arg0, local11);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5399() {
		return false;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBIII)V")
	public void method2497(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean192) {
			local13 = arg0 - super.anInt6308;
			@Pc(19) double local19 = (double) (arg2 - super.anInt6310);
			@Pc(28) double local28 = Math.sqrt(local13 * local13 + local19 * local19);
			this.aDouble4 = (double) this.anInt2955 * local19 / local28 + (double) super.anInt6310;
			this.aDouble6 = (double) super.anInt6308 + (double) this.anInt2955 * local13 / local28;
			this.aDouble1 = super.anInt6313;
		}
		local13 = this.anInt2945 + 1 - arg3;
		this.aDouble2 = ((double) arg0 - this.aDouble6) / local13;
		this.aDouble3 = ((double) arg2 - this.aDouble4) / local13;
		this.aDouble5 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble2 * this.aDouble2);
		if (this.anInt2948 == -1) {
			this.aDouble8 = ((double) arg1 - this.aDouble1) / local13;
		} else {
			if (!this.aBoolean192) {
				this.aDouble8 = -this.aDouble5 * Math.tan((double) this.anInt2948 * 0.02454369D);
			}
			this.aDouble7 = ((double) arg1 - local13 * this.aDouble8 - this.aDouble1) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLclient!uo;)Lclient!aj;")
	@Override
	public Class10_Sub1 method5401(@OriginalArg(1) Class129 arg0) {
		@Pc(9) Class126 local9 = this.method2501(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class61 local16 = arg0.method4979();
		local16.method3655(this.anInt2941);
		local16.method3657(this.anInt2965);
		local16.method3665((int) this.aDouble6, (int) this.aDouble1, (int) this.aDouble4);
		if (this.aClass10_Sub2_2 == null) {
			local9.method3139(local16, null, 0);
		} else {
			@Pc(42) Class136 local42 = this.aClass10_Sub2_2.method981();
			arg0.method4977(local9, local42, local16, null);
		}
		this.anInt2950 = local9.method3155();
		this.method2499(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!uo;Lclient!mj;I)V")
	private void method2499(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class126 arg1) {
		@Pc(6) Class174[] local6 = arg1.method3151();
		@Pc(9) Class212[] local9 = arg1.method3141();
		if ((this.aClass10_Sub2_2 == null || this.aClass10_Sub2_2.aBoolean75) && (local6 != null || local9 != null)) {
			this.aClass10_Sub2_2 = new Class10_Sub2(Static293.anInt5807);
		}
		if (this.aClass10_Sub2_2 != null) {
			this.aClass10_Sub2_2.method990(arg0, (long) Static293.anInt5807, local6, local9);
			this.aClass10_Sub2_2.method979(super.aByte73, super.aShort91, super.aShort93, super.aShort90, super.aShort92);
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)I")
	@Override
	public int method5408() {
		return this.anInt2950;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	public void method2500(@OriginalArg(0) int arg0) {
		if (this.anInt2948 == -1) {
			this.aDouble1 += this.aDouble8 * (double) arg0;
		} else {
			this.aDouble1 += (double) arg0 * (double) arg0 * 0.5D * this.aDouble7 + this.aDouble8 * (double) arg0;
			this.aDouble8 += this.aDouble7 * (double) arg0;
		}
		this.aDouble4 += (double) arg0 * this.aDouble3;
		this.aBoolean192 = true;
		this.aDouble6 += this.aDouble2 * (double) arg0;
		this.anInt2965 = (int) (Math.atan2(this.aDouble2, this.aDouble3) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt2941 = (int) (Math.atan2(this.aDouble8, this.aDouble5) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass111_2 == null) {
			return;
		}
		this.anInt2940 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt2940 <= this.aClass111_2.anIntArray190[this.anInt2962]) {
						return;
					}
					this.anInt2940 -= this.aClass111_2.anIntArray190[this.anInt2962];
					this.anInt2962++;
					if (this.aClass111_2.anIntArray191.length <= this.anInt2962) {
						this.anInt2962 -= this.aClass111_2.anInt2723;
						if (this.anInt2962 < 0 || this.aClass111_2.anIntArray191.length <= this.anInt2962) {
							this.anInt2962 = 0;
						}
					}
					this.anInt2963 = this.anInt2962 + 1;
				} while (this.anInt2963 < this.aClass111_2.anIntArray191.length);
				this.anInt2963 -= this.aClass111_2.anInt2723;
			} while (this.anInt2963 >= 0 && this.aClass111_2.anIntArray191.length > this.anInt2963);
			this.anInt2963 = -1;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!uo;)Lclient!mj;")
	private Class126 method2501(@OriginalArg(1) int arg0, @OriginalArg(2) Class129 arg1) {
		@Pc(13) Class213 local13 = Static89.method1296(this.lb);
		return local13.method5646(this.anInt2962, arg1, arg0, this.anInt2963, this.anInt2940);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBIILclient!rr;Lclient!uo;Z)V")
	@Override
	public void method5398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class67 arg3, @OriginalArg(5) Class129 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}
}
