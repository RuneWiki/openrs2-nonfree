import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class12_Sub1_Sub1 extends Class12_Sub1 {

	@OriginalMember(owner = "client!ao", name = "R", descriptor = "Lclient!m;")
	private Class22_Sub6 aClass22_Sub6_1;

	@OriginalMember(owner = "client!ao", name = "S", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!ao", name = "V", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!ao", name = "W", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!ao", name = "Y", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ao", name = "Z", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!ao", name = "ab", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ao", name = "bb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ao", name = "ib", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ao", name = "ob", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!ao", name = "ub", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
	private int anInt226 = 0;

	@OriginalMember(owner = "client!ao", name = "M", descriptor = "I")
	private int anInt230 = -32768;

	@OriginalMember(owner = "client!ao", name = "eb", descriptor = "I")
	private int anInt240 = 0;

	@OriginalMember(owner = "client!ao", name = "pb", descriptor = "Z")
	private boolean aBoolean18 = false;

	@OriginalMember(owner = "client!ao", name = "nb", descriptor = "I")
	private int anInt246 = -1;

	@OriginalMember(owner = "client!ao", name = "gb", descriptor = "I")
	public final int anInt242;

	@OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
	private final int anInt227;

	@OriginalMember(owner = "client!ao", name = "lb", descriptor = "I")
	public final int lb;

	@OriginalMember(owner = "client!ao", name = "fb", descriptor = "I")
	private final int anInt241;

	@OriginalMember(owner = "client!ao", name = "X", descriptor = "I")
	private final int anInt236;

	@OriginalMember(owner = "client!ao", name = "mb", descriptor = "I")
	public final int anInt245;

	@OriginalMember(owner = "client!ao", name = "F", descriptor = "I")
	public final int anInt223;

	@OriginalMember(owner = "client!ao", name = "kb", descriptor = "Lclient!qg;")
	private final Class189 aClass189_1;

	static {
		new Class221("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class12_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt242 = arg9;
		this.anInt227 = arg0;
		this.aBoolean18 = false;
		this.lb = arg10;
		this.anInt241 = arg7;
		this.anInt236 = arg8;
		this.anInt245 = arg6;
		this.anInt223 = arg5;
		@Pc(65) int local65 = Static168.aClass74_1.method1772(this.anInt227).anInt6020;
		if (local65 == -1) {
			this.aClass189_1 = null;
		} else {
			this.aClass189_1 = Static351.aClass175_3.method4107(local65);
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)I")
	@Override
	public int method5459() {
		return this.anInt230;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public void method301() {
		if (this.aClass22_Sub6_1 != null) {
			this.aClass22_Sub6_1.method3561();
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(II)V")
	public void method302(@OriginalArg(1) int arg0) {
		this.aBoolean18 = true;
		this.aDouble8 += (double) arg0 * this.aDouble6;
		this.aDouble3 += this.aDouble4 * (double) arg0;
		if (this.anInt241 == -1) {
			this.aDouble2 += (double) arg0 * this.aDouble7;
		} else {
			this.aDouble2 += (double) arg0 * this.aDouble7 + (double) arg0 * (double) arg0 * this.aDouble5 * 0.5D;
			this.aDouble7 += (double) arg0 * this.aDouble5;
		}
		this.anInt247 = (int) (Math.atan2(this.aDouble4, this.aDouble6) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt237 = (int) (Math.atan2(this.aDouble7, this.aDouble1) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass189_1 == null) {
			return;
		}
		this.anInt226 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass189_1.anIntArray640[this.anInt240] >= this.anInt226) {
						return;
					}
					this.anInt226 -= this.aClass189_1.anIntArray640[this.anInt240];
					this.anInt240++;
					if (this.anInt240 >= this.aClass189_1.anIntArray639.length) {
						this.anInt240 -= this.aClass189_1.anInt5151;
						if (this.anInt240 < 0 || this.anInt240 >= this.aClass189_1.anIntArray639.length) {
							this.anInt240 = 0;
						}
					}
					this.anInt246 = this.anInt240 + 1;
				} while (this.anInt246 < this.aClass189_1.anIntArray639.length);
				this.anInt246 -= this.aClass189_1.anInt5151;
			} while (this.anInt246 >= 0 && this.anInt246 < this.aClass189_1.anIntArray639.length);
			this.anInt246 = -1;
		}
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5455() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5449(@OriginalArg(0) Class82 arg0) {
		@Pc(17) Class3 local17 = this.method303(arg0, 0);
		if (local17 == null) {
			return;
		}
		@Pc(23) Class54 local23 = arg0.method4556();
		local23.method4790(this.anInt237);
		local23.method4793(this.anInt247);
		local23.method4783((int) this.aDouble3, (int) this.aDouble2, (int) this.aDouble8);
		this.anInt230 = local17.method3459();
		this.method304(local17, arg0);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!km;II)Lclient!ab;")
	private Class3 method303(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class220 local15 = Static168.aClass74_1.method1772(this.anInt227);
		return local15.method5219(Static351.aClass175_3, arg0, arg1, this.anInt240, this.anInt246, this.anInt226);
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V")
	@Override
	public void method5457() {
		super.aShort97 = super.aShort96 = (short) (this.aDouble3 / 128.0D);
		super.aShort94 = super.aShort95 = (short) (this.aDouble8 / 128.0D);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!km;IZILclient!kj;B)V")
	@Override
	public void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ab;ZLclient!km;)V")
	private void method304(@OriginalArg(0) Class3 arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(6) Class191[] local6 = arg0.method3476();
		@Pc(9) Class218[] local9 = arg0.method3441();
		if ((this.aClass22_Sub6_1 == null || this.aClass22_Sub6_1.aBoolean289) && (local6 != null || local9 != null)) {
			this.aClass22_Sub6_1 = new Class22_Sub6(Static295.anInt5281);
		}
		if (this.aClass22_Sub6_1 != null) {
			this.aClass22_Sub6_1.method3564(arg1, (long) Static295.anInt5281, local6, local9);
			this.aClass22_Sub6_1.method3560(super.aByte74, super.aShort97, super.aShort96, super.aShort94, super.aShort95);
		}
	}

	@OriginalMember(owner = "client!ao", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass22_Sub6_1 != null) {
			this.aClass22_Sub6_1.method3561();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIZII)V")
	public void method305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean18) {
			local9 = arg0 - super.anInt6328;
			@Pc(16) double local16 = (double) (arg1 - super.anInt6317);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble3 = (double) super.anInt6328 + local9 * (double) this.anInt236 / local25;
			this.aDouble8 = (double) this.anInt236 * local16 / local25 + (double) super.anInt6317;
			this.aDouble2 = super.anInt6322;
		}
		local9 = this.anInt245 + 1 - arg3;
		this.aDouble4 = ((double) arg0 - this.aDouble3) / local9;
		this.aDouble6 = ((double) arg1 - this.aDouble8) / local9;
		this.aDouble1 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble6 * this.aDouble6);
		if (this.anInt241 == -1) {
			this.aDouble7 = ((double) arg2 - this.aDouble2) / local9;
		} else {
			if (!this.aBoolean18) {
				this.aDouble7 = -this.aDouble1 * Math.tan((double) this.anInt241 * 0.02454369D);
			}
			this.aDouble5 = ((double) arg2 - local9 * this.aDouble7 - this.aDouble2) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	@Override
	public Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0) {
		@Pc(9) Class3 local9 = this.method303(arg0, 1024);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class54 local16 = arg0.method4556();
		local16.method4790(this.anInt237);
		local16.method4793(this.anInt247);
		local16.method4783((int) this.aDouble3, (int) this.aDouble2, (int) this.aDouble8);
		if (this.aClass22_Sub6_1 == null) {
			local9.method3443(local16, null, 0);
		} else {
			@Pc(48) Class157 local48 = this.aClass22_Sub6_1.method3555();
			arg0.method4485(local9, local48, local16, null);
		}
		this.anInt230 = local9.method3459();
		this.method304(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!km;BII)Z")
	@Override
	public boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
	@Override
	public void method5456() {
		throw new IllegalStateException();
	}
}
