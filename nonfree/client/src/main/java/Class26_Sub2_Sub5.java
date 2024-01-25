import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class26_Sub2_Sub5 extends Class26_Sub2 {

	@OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
	private int anInt5258;

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "Lclient!vc;")
	private Class39_Sub8 aClass39_Sub8_5;

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!pb", name = "L", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
	private int anInt5268;

	@OriginalMember(owner = "client!pb", name = "eb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!pb", name = "fb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!pb", name = "jb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!pb", name = "kb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!pb", name = "mb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!pb", name = "ob", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
	private int anInt5269 = 0;

	@OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
	private int anInt5265 = -32768;

	@OriginalMember(owner = "client!pb", name = "ab", descriptor = "I")
	private int anInt5278 = -1;

	@OriginalMember(owner = "client!pb", name = "hb", descriptor = "Z")
	private boolean aBoolean340 = false;

	@OriginalMember(owner = "client!pb", name = "nb", descriptor = "I")
	private int anInt5283 = 0;

	@OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
	public final int anInt5263;

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
	private final int anInt5261;

	@OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
	public final int anInt5271;

	@OriginalMember(owner = "client!pb", name = "Y", descriptor = "I")
	private final int anInt5276;

	@OriginalMember(owner = "client!pb", name = "Z", descriptor = "I")
	private final int anInt5277;

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
	public final int anInt5255;

	@OriginalMember(owner = "client!pb", name = "bb", descriptor = "I")
	public final int anInt5279;

	@OriginalMember(owner = "client!pb", name = "P", descriptor = "Z")
	private final boolean aBoolean339;

	@OriginalMember(owner = "client!pb", name = "cb", descriptor = "I")
	private final int anInt5280;

	@OriginalMember(owner = "client!pb", name = "G", descriptor = "Lclient!qp;")
	private final Class191 aClass191_3;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class26_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static289.method4078(arg2, arg3, arg1) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt5263 = arg9;
		this.anInt5261 = arg4;
		this.anInt5271 = arg6;
		this.anInt5276 = arg8;
		this.anInt5277 = arg0;
		this.anInt5255 = arg10;
		this.anInt5279 = arg5;
		this.aBoolean339 = arg11;
		this.aBoolean340 = false;
		this.anInt5280 = arg7;
		@Pc(78) int local78 = Static168.aClass115_2.method2718(this.anInt5277).anInt1316;
		if (local78 == -1) {
			this.aClass191_3 = null;
		} else {
			this.aClass191_3 = Static191.aClass28_1.method567(local78);
		}
	}

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "(I)V")
	@Override
	public void method5524() {
		super.aShort93 = super.aShort92 = (short) (this.aDouble4 / 128.0D);
		super.aShort94 = super.aShort95 = (short) (this.aDouble7 / 128.0D);
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5519(@OriginalArg(1) Class109 arg0) {
		@Pc(9) Class37 local9 = this.method4257(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class18 local15 = arg0.method4709();
		local15.YA(this.anInt5258);
		local15.c(this.anInt5268);
		local15.ZA((int) this.aDouble4, (int) this.aDouble9, (int) this.aDouble7);
		this.anInt5265 = local9.b();
		this.method4260(arg0, local9);
	}

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)I")
	@Override
	public int method5522() {
		return this.anInt5265;
	}

	@OriginalMember(owner = "client!pb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass39_Sub8_5 != null) {
			this.aClass39_Sub8_5.method5617();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!qa;B)Lclient!c;")
	private Class37 method4257(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1) {
		@Pc(16) Class45 local16 = Static168.aClass115_2.method2718(this.anInt5277);
		return local16.method1104(this.anInt5283, this.anInt5278, Static191.aClass28_1, this.anInt5269, arg0, arg1);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5512() {
		return false;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
	public void method4258(@OriginalArg(1) int arg0) {
		this.aDouble7 += this.aDouble2 * (double) arg0;
		this.aDouble4 += this.aDouble8 * (double) arg0;
		this.aBoolean340 = true;
		if (this.aBoolean339) {
			this.aDouble9 = Static289.method4078((int) this.aDouble4, (int) this.aDouble7, super.aByte95) - this.anInt5261;
		} else if (this.anInt5280 == -1) {
			this.aDouble9 += this.aDouble6 * (double) arg0;
		} else {
			this.aDouble9 += this.aDouble5 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble6;
			this.aDouble6 += (double) arg0 * this.aDouble5;
		}
		this.anInt5268 = (int) (Math.atan2(this.aDouble8, this.aDouble2) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt5258 = (int) (Math.atan2(this.aDouble6, this.aDouble3) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass191_3 == null) {
			return;
		}
		this.anInt5283 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass191_3.anIntArray454[this.anInt5269] >= this.anInt5283) {
						return;
					}
					this.anInt5283 -= this.aClass191_3.anIntArray454[this.anInt5269];
					this.anInt5269++;
					if (this.aClass191_3.anIntArray452.length <= this.anInt5269) {
						this.anInt5269 -= this.aClass191_3.anInt5747;
						if (this.anInt5269 < 0 || this.aClass191_3.anIntArray452.length <= this.anInt5269) {
							this.anInt5269 = 0;
						}
					}
					this.anInt5278 = this.anInt5269 + 1;
				} while (this.aClass191_3.anIntArray452.length > this.anInt5278);
				this.anInt5278 -= this.aClass191_3.anInt5747;
			} while (this.anInt5278 >= 0 && this.anInt5278 < this.aClass191_3.anIntArray452.length);
			this.anInt5278 = -1;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIBII)V")
	public void method4259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean340) {
			local9 = arg2 - super.anInt7068;
			@Pc(16) double local16 = (double) (arg0 - super.anInt7065);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble4 = (double) super.anInt7068 + (double) this.anInt5276 * local9 / local25;
			this.aDouble7 = (double) this.anInt5276 * local16 / local25 + (double) super.anInt7065;
			if (this.aBoolean339) {
				this.aDouble9 = Static289.method4078((int) this.aDouble4, (int) this.aDouble7, super.aByte95) - this.anInt5261;
			} else {
				this.aDouble9 = super.anInt7063;
			}
		}
		local9 = this.anInt5271 + 1 - arg3;
		this.aDouble2 = ((double) arg0 - this.aDouble7) / local9;
		this.aDouble8 = ((double) arg2 - this.aDouble4) / local9;
		this.aDouble3 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble8 * this.aDouble8);
		if (this.anInt5280 == -1) {
			this.aDouble6 = ((double) arg1 - this.aDouble9) / local9;
		} else {
			if (!this.aBoolean340) {
				this.aDouble6 = -this.aDouble3 * Math.tan((double) this.anInt5280 * 0.02454369D);
			}
			this.aDouble5 = ((double) arg1 - local9 * this.aDouble6 - this.aDouble9) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V")
	@Override
	public void method5516() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!qa;Lclient!c;I)V")
	private void method4260(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class37 arg1) {
		@Pc(6) Class252[] local6 = arg1.method4225();
		@Pc(9) Class122[] local9 = arg1.method4232();
		if ((this.aClass39_Sub8_5 == null || this.aClass39_Sub8_5.aBoolean470) && (local6 != null || local9 != null)) {
			this.aClass39_Sub8_5 = new Class39_Sub8(Static403.anInt6978);
		}
		if (this.aClass39_Sub8_5 != null) {
			this.aClass39_Sub8_5.method5618(arg0, (long) Static403.anInt6978, local6, local9);
			this.aClass39_Sub8_5.method5624(super.aByte95, super.aShort93, super.aShort92, super.aShort94, super.aShort95);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
	public void method4262() {
		if (this.aClass39_Sub8_5 != null) {
			this.aClass39_Sub8_5.method5617();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILclient!co;ILclient!qa;ZZ)V")
	@Override
	public void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!qa;I)Lclient!ip;")
	@Override
	public Class39_Sub4 method5520(@OriginalArg(0) Class109 arg0) {
		@Pc(9) Class37 local9 = this.method4257(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class18 local16 = arg0.method4709();
		local16.YA(this.anInt5258);
		local16.c(this.anInt5268);
		local16.ZA((int) this.aDouble4, (int) this.aDouble9, (int) this.aDouble7);
		if (this.aClass39_Sub8_5 == null) {
			local9.method4230(local16, null, 0);
		} else {
			@Pc(49) Class185 local49 = this.aClass39_Sub8_5.method5629();
			arg0.method4736(local9, local49, local16, null);
		}
		this.anInt5265 = local9.b();
		this.method4260(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method5517(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}
}
