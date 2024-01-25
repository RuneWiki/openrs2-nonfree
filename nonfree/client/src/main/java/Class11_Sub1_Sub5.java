import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class11_Sub1_Sub5 extends Class11_Sub1 {

	@OriginalMember(owner = "client!su", name = "y", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!su", name = "D", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!su", name = "G", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!su", name = "H", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!su", name = "I", descriptor = "Lclient!lm;")
	private Class111_Sub4 aClass111_Sub4_4;

	@OriginalMember(owner = "client!su", name = "Y", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!su", name = "Z", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!su", name = "eb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!su", name = "fb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!su", name = "hb", descriptor = "I")
	private int anInt6200;

	@OriginalMember(owner = "client!su", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!su", name = "x", descriptor = "I")
	private int anInt6177 = 0;

	@OriginalMember(owner = "client!su", name = "P", descriptor = "I")
	private int anInt6188 = -32768;

	@OriginalMember(owner = "client!su", name = "ib", descriptor = "I")
	private int anInt6201 = -1;

	@OriginalMember(owner = "client!su", name = "R", descriptor = "I")
	private int anInt6190 = 0;

	@OriginalMember(owner = "client!su", name = "A", descriptor = "Z")
	private boolean aBoolean546 = false;

	@OriginalMember(owner = "client!su", name = "z", descriptor = "Z")
	private final boolean aBoolean545;

	@OriginalMember(owner = "client!su", name = "ab", descriptor = "I")
	private final int anInt6196;

	@OriginalMember(owner = "client!su", name = "O", descriptor = "I")
	public final int anInt6187;

	@OriginalMember(owner = "client!su", name = "ob", descriptor = "I")
	private final int anInt6206;

	@OriginalMember(owner = "client!su", name = "mb", descriptor = "I")
	private final int anInt6204;

	@OriginalMember(owner = "client!su", name = "kb", descriptor = "I")
	private final int anInt6203;

	@OriginalMember(owner = "client!su", name = "L", descriptor = "I")
	public final int anInt6184;

	@OriginalMember(owner = "client!su", name = "S", descriptor = "I")
	public final int anInt6191;

	@OriginalMember(owner = "client!su", name = "X", descriptor = "I")
	public final int anInt6195;

	@OriginalMember(owner = "client!su", name = "w", descriptor = "Lclient!eb;")
	private final Class64 aClass64_1;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class11_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static135.method1732(arg2, arg3, arg1) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.aBoolean545 = arg11;
		this.anInt6196 = arg7;
		this.anInt6187 = arg5;
		this.anInt6206 = arg4;
		this.anInt6204 = arg0;
		this.aBoolean546 = false;
		this.anInt6203 = arg8;
		this.anInt6184 = arg10;
		this.anInt6191 = arg9;
		this.anInt6195 = arg6;
		@Pc(78) int local78 = Static46.aClass123_5.method2677(this.anInt6204).anInt3204;
		if (local78 == -1) {
			this.aClass64_1 = null;
		} else {
			this.aClass64_1 = Static402.aClass37_2.method665(local78);
		}
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5183() {
		return false;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIII)V")
	public void method4959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean546) {
			local13 = arg2 - super.anInt6428;
			@Pc(20) double local20 = (double) (arg3 - super.anInt6430);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble6 = local20 * (double) this.anInt6203 / local29 + (double) super.anInt6430;
			this.aDouble9 = (double) this.anInt6203 * local13 / local29 + (double) super.anInt6428;
			if (this.aBoolean545) {
				this.aDouble7 = Static135.method1732((int) this.aDouble9, (int) this.aDouble6, super.aByte90) - this.anInt6206;
			} else {
				this.aDouble7 = super.anInt6437;
			}
		}
		local13 = this.anInt6195 + 1 - arg0;
		this.aDouble3 = ((double) arg2 - this.aDouble9) / local13;
		this.aDouble2 = ((double) arg3 - this.aDouble6) / local13;
		this.aDouble5 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble2 * this.aDouble2);
		if (this.anInt6196 == -1) {
			this.aDouble4 = ((double) arg1 - this.aDouble7) / local13;
		} else {
			if (!this.aBoolean546) {
				this.aDouble4 = -this.aDouble5 * Math.tan((double) this.anInt6196 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg1 - this.aDouble4 * local13 - this.aDouble7) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!su", name = "d", descriptor = "(B)V")
	public void method4960() {
		if (this.aClass111_Sub4_4 != null) {
			this.aClass111_Sub4_4.method3423();
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!za;BI)Lclient!e;")
	private Class8 method4962(@OriginalArg(0) Class117 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class121 local9 = Static46.aClass123_5.method2677(this.anInt6204);
		return local9.method2598(this.anInt6177, arg0, this.anInt6190, arg1, this.anInt6201, Static402.aClass37_2);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!e;Lclient!za;Z)V")
	private void method4963(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class117 arg1) {
		@Pc(12) Class40[] local12 = arg0.method5995();
		@Pc(15) Class230[] local15 = arg0.method5988();
		if ((this.aClass111_Sub4_4 == null || this.aClass111_Sub4_4.aBoolean398) && (local12 != null || local15 != null)) {
			this.aClass111_Sub4_4 = new Class111_Sub4(Static98.anInt1304);
		}
		if (this.aClass111_Sub4_4 != null) {
			this.aClass111_Sub4_4.method3414(arg1, (long) Static98.anInt1304, local12, local15);
			this.aClass111_Sub4_4.method3419(super.aByte90, super.aShort103, super.aShort100, super.aShort101, super.aShort102);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5182(@OriginalArg(0) Class117 arg0) {
		@Pc(9) Class8 local9 = this.method4962(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class34 local15 = arg0.method5685();
		local15.g(this.anInt6200);
		local15.EA(this.lb);
		local15.W((int) this.aDouble9, (int) this.aDouble7, (int) this.aDouble6);
		this.anInt6188 = local9.B();
		this.method4963(local9, arg0);
	}

	@OriginalMember(owner = "client!su", name = "f", descriptor = "(I)V")
	@Override
	public void method5185() {
		super.aShort103 = super.aShort100 = (short) (this.aDouble9 / 128.0D);
		super.aShort101 = super.aShort102 = (short) (this.aDouble6 / 128.0D);
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(B)I")
	@Override
	public int method5184() {
		return this.anInt6188;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ILclient!za;ILclient!ge;IZI)V")
	@Override
	public void method5179(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IILclient!za;I)Z")
	@Override
	public boolean method5180(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!su", name = "e", descriptor = "(I)V")
	@Override
	public void method5177() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(Lclient!za;B)Lclient!kf;")
	@Override
	public Class111_Sub3 method5181(@OriginalArg(0) Class117 arg0) {
		@Pc(9) Class8 local9 = this.method4962(arg0, 2048);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class34 local16 = arg0.method5685();
		local16.g(this.anInt6200);
		local16.EA(this.lb);
		local16.W((int) this.aDouble9, (int) this.aDouble7, (int) this.aDouble6);
		if (this.aClass111_Sub4_4 == null) {
			local9.method5987(local16, null, 0);
		} else {
			@Pc(48) Class232 local48 = this.aClass111_Sub4_4.method3422();
			arg0.method5659(local9, local48, local16, null);
		}
		this.anInt6188 = local9.B();
		this.method4963(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!su", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass111_Sub4_4 != null) {
			this.aClass111_Sub4_4.method3423();
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IB)V")
	public void method4966(@OriginalArg(0) int arg0) {
		this.aBoolean546 = true;
		this.aDouble6 += this.aDouble2 * (double) arg0;
		this.aDouble9 += this.aDouble3 * (double) arg0;
		if (this.aBoolean545) {
			this.aDouble7 = Static135.method1732((int) this.aDouble9, (int) this.aDouble6, super.aByte90) - this.anInt6206;
		} else if (this.anInt6196 == -1) {
			this.aDouble7 += this.aDouble4 * (double) arg0;
		} else {
			this.aDouble7 += (double) arg0 * this.aDouble4 + (double) arg0 * (double) arg0 * this.aDouble8 * 0.5D;
			this.aDouble4 += (double) arg0 * this.aDouble8;
		}
		this.lb = (int) (Math.atan2(this.aDouble3, this.aDouble2) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt6200 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass64_1 == null) {
			return;
		}
		this.anInt6177 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt6177 <= this.aClass64_1.anIntArray126[this.anInt6190]) {
						return;
					}
					this.anInt6177 -= this.aClass64_1.anIntArray126[this.anInt6190];
					this.anInt6190++;
					if (this.aClass64_1.anIntArray127.length <= this.anInt6190) {
						this.anInt6190 -= this.aClass64_1.anInt1191;
						if (this.anInt6190 < 0 || this.anInt6190 >= this.aClass64_1.anIntArray127.length) {
							this.anInt6190 = 0;
						}
					}
					this.anInt6201 = this.anInt6190 + 1;
				} while (this.aClass64_1.anIntArray127.length > this.anInt6201);
				this.anInt6201 -= this.aClass64_1.anInt1191;
			} while (this.anInt6201 >= 0 && this.anInt6201 < this.aClass64_1.anIntArray127.length);
			this.anInt6201 = -1;
		}
	}
}
