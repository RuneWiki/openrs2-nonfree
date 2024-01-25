import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class8_Sub3_Sub5 extends Class8_Sub3 {

	@OriginalMember(owner = "client!rn", name = "z", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!rn", name = "F", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!rn", name = "I", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!rn", name = "J", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!rn", name = "O", descriptor = "Lclient!hk;")
	private Class20_Sub3 aClass20_Sub3_6;

	@OriginalMember(owner = "client!rn", name = "P", descriptor = "I")
	private int anInt5791;

	@OriginalMember(owner = "client!rn", name = "Q", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!rn", name = "U", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!rn", name = "Z", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!rn", name = "eb", descriptor = "I")
	private int anInt5802;

	@OriginalMember(owner = "client!rn", name = "rb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!rn", name = "C", descriptor = "Z")
	private boolean aBoolean412 = false;

	@OriginalMember(owner = "client!rn", name = "K", descriptor = "I")
	private int anInt5788 = -1;

	@OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
	private int anInt5786 = 0;

	@OriginalMember(owner = "client!rn", name = "db", descriptor = "I")
	private int anInt5801 = -32768;

	@OriginalMember(owner = "client!rn", name = "nb", descriptor = "I")
	private int anInt5810 = 0;

	@OriginalMember(owner = "client!rn", name = "B", descriptor = "Z")
	private final boolean aBoolean411;

	@OriginalMember(owner = "client!rn", name = "sb", descriptor = "I")
	public final int anInt5814;

	@OriginalMember(owner = "client!rn", name = "X", descriptor = "I")
	private final int anInt5797;

	@OriginalMember(owner = "client!rn", name = "T", descriptor = "I")
	public final int anInt5794;

	@OriginalMember(owner = "client!rn", name = "mb", descriptor = "I")
	private final int anInt5809;

	@OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
	private final int anInt5789;

	@OriginalMember(owner = "client!rn", name = "M", descriptor = "I")
	public final int anInt5790;

	@OriginalMember(owner = "client!rn", name = "S", descriptor = "I")
	private final int anInt5793;

	@OriginalMember(owner = "client!rn", name = "ib", descriptor = "I")
	public final int anInt5806;

	@OriginalMember(owner = "client!rn", name = "G", descriptor = "Lclient!id;")
	private final Class119 aClass119_3;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class8_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static94.method4425(arg3, arg1, arg2) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.aBoolean411 = arg11;
		this.anInt5814 = arg5;
		this.anInt5797 = arg4;
		this.anInt5794 = arg9;
		this.anInt5809 = arg0;
		this.aBoolean412 = false;
		this.anInt5789 = arg7;
		this.anInt5790 = arg6;
		this.anInt5793 = arg8;
		this.anInt5806 = arg10;
		@Pc(78) int local78 = Static452.aClass246_2.method5323(this.anInt5809).anInt4088;
		if (local78 == -1) {
			this.aClass119_3 = null;
		} else {
			this.aClass119_3 = Static170.aClass125_3.method2389(local78);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZ)V")
	public void method4629(@OriginalArg(0) int arg0) {
		this.aDouble7 += this.aDouble9 * (double) arg0;
		this.aDouble4 += this.aDouble6 * (double) arg0;
		this.aBoolean412 = true;
		if (this.aBoolean411) {
			this.aDouble2 = Static94.method4425((int) this.aDouble7, super.aByte99, (int) this.aDouble4) - this.anInt5797;
		} else if (this.anInt5789 == -1) {
			this.aDouble2 += this.aDouble8 * (double) arg0;
		} else {
			this.aDouble2 += (double) arg0 * this.aDouble8 + (double) arg0 * (double) arg0 * this.aDouble5 * 0.5D;
			this.aDouble8 += (double) arg0 * this.aDouble5;
		}
		this.anInt5791 = (int) (Math.atan2(this.aDouble6, this.aDouble9) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt5802 = (int) (Math.atan2(this.aDouble8, this.aDouble3) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass119_3 == null) {
			return;
		}
		this.anInt5786 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt5786 <= this.aClass119_3.anIntArray242[this.anInt5810]) {
						return;
					}
					this.anInt5786 -= this.aClass119_3.anIntArray242[this.anInt5810];
					this.anInt5810++;
					if (this.anInt5810 >= this.aClass119_3.anIntArray244.length) {
						this.anInt5810 -= this.aClass119_3.anInt2995;
						if (this.anInt5810 < 0 || this.aClass119_3.anIntArray244.length <= this.anInt5810) {
							this.anInt5810 = 0;
						}
					}
					this.anInt5788 = this.anInt5810 + 1;
				} while (this.aClass119_3.anIntArray244.length > this.anInt5788);
				this.anInt5788 -= this.aClass119_3.anInt2995;
			} while (this.anInt5788 >= 0 && this.aClass119_3.anIntArray244.length > this.anInt5788);
			this.anInt5788 = -1;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	public void method4630() {
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2127();
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5873() {
		return false;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIII)V")
	public void method4633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean412) {
			local9 = arg0 - super.anInt7339;
			@Pc(16) double local16 = (double) (arg3 - super.anInt7343);
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble7 = (double) super.anInt7343 + local16 * (double) this.anInt5793 / local25;
			this.aDouble4 = (double) this.anInt5793 * local9 / local25 + (double) super.anInt7339;
			if (this.aBoolean411) {
				this.aDouble2 = Static94.method4425((int) this.aDouble7, super.aByte99, (int) this.aDouble4) - this.anInt5797;
			} else {
				this.aDouble2 = super.anInt7341;
			}
		}
		local9 = this.anInt5790 + 1 - arg2;
		this.aDouble6 = ((double) arg0 - this.aDouble4) / local9;
		this.aDouble9 = ((double) arg3 - this.aDouble7) / local9;
		this.aDouble3 = Math.sqrt(this.aDouble9 * this.aDouble9 + this.aDouble6 * this.aDouble6);
		if (this.anInt5789 == -1) {
			this.aDouble8 = ((double) arg1 - this.aDouble2) / local9;
		} else {
			if (!this.aBoolean412) {
				this.aDouble8 = -this.aDouble3 * Math.tan((double) this.anInt5789 * 0.02454369D);
			}
			this.aDouble5 = ((double) arg1 - local9 * this.aDouble8 - this.aDouble2) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!rn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2127();
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	@Override
	public Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0) {
		@Pc(9) Class116 local9 = this.method4634(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class35 local16 = arg0.method5398();
		local16.N(this.anInt5802);
		local16.ja(this.anInt5791);
		local16.o((int) this.aDouble4, (int) this.aDouble2, (int) this.aDouble7);
		if (this.aClass20_Sub3_6 == null) {
			local9.method3117(local16, null, 0);
		} else {
			@Pc(49) Class83 local49 = this.aClass20_Sub3_6.method2129();
			arg0.method5396(local9, local49, local16, null);
		}
		this.anInt5801 = local9.MA();
		this.method4636(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	private Class116 method4634(@OriginalArg(0) int arg0, @OriginalArg(1) Class135 arg1) {
		@Pc(14) Class172 local14 = Static452.aClass246_2.method5323(this.anInt5809);
		return local14.method3245(Static170.aClass125_3, this.anInt5786, arg0, this.anInt5788, arg1, this.anInt5810);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!gg;IZIIILclient!ya;)V")
	@Override
	public void method5875(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class135 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLclient!t;Lclient!ya;)V")
	private void method4636(@OriginalArg(1) Class116 arg0, @OriginalArg(2) Class135 arg1) {
		@Pc(10) Class76[] local10 = arg0.method3111();
		@Pc(13) Class88[] local13 = arg0.method3115();
		if ((this.aClass20_Sub3_6 == null || this.aClass20_Sub3_6.aBoolean199) && (local10 != null || local13 != null)) {
			this.aClass20_Sub3_6 = new Class20_Sub3(Static265.anInt4371);
		}
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2125(arg1, (long) Static265.anInt4371, local10, local13);
			this.aClass20_Sub3_6.method2136(super.aByte99, super.aShort100, super.aShort101, super.aShort99, super.aShort98);
		}
	}

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)V")
	@Override
	public void method5884() {
		super.aShort99 = super.aShort98 = (short) (this.aDouble7 / 128.0D);
		super.aShort100 = super.aShort101 = (short) (this.aDouble4 / 128.0D);
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V")
	@Override
	public void method5879() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5877(@OriginalArg(0) Class135 arg0) {
		@Pc(11) Class116 local11 = this.method4634(0, arg0);
		if (local11 == null) {
			return;
		}
		@Pc(17) Class35 local17 = arg0.method5398();
		local17.N(this.anInt5802);
		local17.ja(this.anInt5791);
		local17.o((int) this.aDouble4, (int) this.aDouble2, (int) this.aDouble7);
		this.anInt5801 = local11.MA();
		this.method4636(local11, arg0);
	}

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)I")
	@Override
	public int method5882() {
		return this.anInt5801;
	}
}
