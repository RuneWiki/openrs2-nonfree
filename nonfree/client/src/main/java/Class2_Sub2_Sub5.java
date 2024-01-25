import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
	private int anInt7942;

	@OriginalMember(owner = "client!pi", name = "N", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!pi", name = "R", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!pi", name = "S", descriptor = "Lclient!ru;")
	private Class55_Sub8 aClass55_Sub8_6;

	@OriginalMember(owner = "client!pi", name = "X", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!pi", name = "Z", descriptor = "I")
	private int anInt7957;

	@OriginalMember(owner = "client!pi", name = "gb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!pi", name = "D", descriptor = "Z")
	private boolean aBoolean659 = false;

	@OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
	private int anInt7954 = -32768;

	@OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
	private int anInt7943 = -1;

	@OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
	private int anInt7945 = 0;

	@OriginalMember(owner = "client!pi", name = "db", descriptor = "I")
	private int anInt7960 = 0;

	@OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
	public final int anInt7952;

	@OriginalMember(owner = "client!pi", name = "ib", descriptor = "I")
	public final int anInt7964;

	@OriginalMember(owner = "client!pi", name = "W", descriptor = "I")
	private final int anInt7955;

	@OriginalMember(owner = "client!pi", name = "H", descriptor = "Z")
	private final boolean aBoolean660;

	@OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
	private final int anInt7941;

	@OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
	private final int anInt7949;

	@OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
	public final int anInt7953;

	@OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
	public final int anInt7944;

	@OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
	private final int anInt7951;

	@OriginalMember(owner = "client!pi", name = "O", descriptor = "Lclient!jq;")
	private final Class174 aClass174_3;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class2_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static274.method4782(arg3, arg1, arg2) - arg4, arg3, arg2 >> 9, arg2 >> 9, arg3 >> 9, arg3 >> 9, false, (byte) 0);
		this.anInt7952 = arg5;
		this.anInt7964 = arg6;
		this.anInt7955 = arg0;
		this.aBoolean659 = false;
		this.aBoolean660 = arg11;
		this.anInt7941 = arg4;
		this.anInt7949 = arg8;
		this.anInt7953 = arg10;
		this.anInt7944 = arg9;
		this.anInt7951 = arg7;
		@Pc(78) int local78 = Static107.aClass303_1.method7476(this.anInt7955).anInt2573;
		if (local78 == -1) {
			this.aClass174_3 = null;
		} else {
			this.aClass174_3 = Static532.aClass157_2.method3734(local78);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBLclient!oa;)Lclient!ba;")
	private Class21 method6576(@OriginalArg(0) int arg0, @OriginalArg(2) Class15 arg1) {
		@Pc(9) Class77 local9 = Static107.aClass303_1.method7476(this.anInt7955);
		return local9.method2276(arg0, this.anInt7945, Static532.aClass157_2, this.anInt7943, this.anInt7960, arg1);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
		@Pc(9) Class21 local9 = this.method6576(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(21) Class255 local21 = arg0.method5343();
		local21.XA(this.anInt7942);
		local21.P(this.anInt7957);
		local21.G((int) this.aDouble9, (int) this.aDouble6, (int) this.aDouble7);
		this.anInt7954 = local9.DA();
		this.method6582(arg0, local21, local9);
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8388() {
		return false;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!oa;ILclient!cq;ZI)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		@Pc(9) Class21 local9 = this.method6576(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class255 local16 = arg0.method5343();
		local16.XA(this.anInt7942);
		local16.P(this.anInt7957);
		local16.G((int) this.aDouble9, (int) this.aDouble6, (int) this.aDouble7);
		this.method6582(arg0, local16, local9);
		if (this.aClass55_Sub8_6 == null) {
			local9.method7145(local16, null, 0);
		} else {
			@Pc(63) Class274 local63 = this.aClass55_Sub8_6.method7127();
			arg0.method5309(local9, local63, local16, null, 0);
		}
		this.anInt7954 = local9.DA();
		return null;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
	public void method6580(@OriginalArg(0) int arg0) {
		this.aDouble9 += (double) arg0 * this.aDouble8;
		this.aBoolean659 = true;
		this.aDouble7 += (double) arg0 * this.aDouble4;
		if (this.aBoolean660) {
			this.aDouble6 = Static274.method4782((int) this.aDouble7, super.aByte103, (int) this.aDouble9) - this.anInt7941;
		} else if (this.anInt7951 == -1) {
			this.aDouble6 += this.aDouble5 * (double) arg0;
		} else {
			this.aDouble6 += (double) arg0 * (double) arg0 * 0.5D * this.aDouble2 + this.aDouble5 * (double) arg0;
			this.aDouble5 += (double) arg0 * this.aDouble2;
		}
		this.anInt7957 = (int) (Math.atan2(this.aDouble8, this.aDouble4) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt7942 = (int) (Math.atan2(this.aDouble5, this.aDouble3) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass174_3 == null) {
			return;
		}
		this.anInt7960 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt7960 <= this.aClass174_3.anIntArray325[this.anInt7945]) {
						return;
					}
					this.anInt7960 -= this.aClass174_3.anIntArray325[this.anInt7945];
					this.anInt7945++;
					if (this.aClass174_3.anIntArray326.length <= this.anInt7945) {
						this.anInt7945 -= this.aClass174_3.anInt5485;
						if (this.anInt7945 < 0 || this.aClass174_3.anIntArray326.length <= this.anInt7945) {
							this.anInt7945 = 0;
						}
					}
					this.anInt7943 = this.anInt7945 + 1;
				} while (this.anInt7943 < this.aClass174_3.anIntArray326.length);
				this.anInt7943 -= this.aClass174_3.anInt5485;
			} while (this.anInt7943 >= 0 && this.anInt7943 < this.aClass174_3.anIntArray326.length);
			this.anInt7943 = -1;
		}
	}

	@OriginalMember(owner = "client!pi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass55_Sub8_6 != null) {
			this.aClass55_Sub8_6.method7122();
		}
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)V")
	@Override
	public void method8386() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!oa;ILclient!q;Lclient!ba;)V")
	private void method6582(@OriginalArg(0) Class15 arg0, @OriginalArg(2) Class255 arg1, @OriginalArg(3) Class21 arg2) {
		arg2.method7143(arg1);
		@Pc(17) Class121[] local17 = arg2.method7138();
		@Pc(20) Class280[] local20 = arg2.method7135();
		if ((this.aClass55_Sub8_6 == null || this.aClass55_Sub8_6.aBoolean712) && (local17 != null || local20 != null)) {
			this.aClass55_Sub8_6 = Static465.method7126(Static129.anInt10429, true);
		}
		if (this.aClass55_Sub8_6 != null) {
			this.aClass55_Sub8_6.method7121(arg0, (long) Static129.anInt10429, local17, local20);
			this.aClass55_Sub8_6.method7124(super.aByte103, super.aShort120, super.aShort121, super.aShort122, super.aShort123);
		}
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(B)V")
	@Override
	public void method7630() {
		super.aShort120 = super.aShort121 = (short) (this.aDouble9 / 512.0D);
		super.aShort122 = super.aShort123 = (short) (this.aDouble7 / 512.0D);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIII)V")
	public void method6583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean659) {
			local8 = arg3 - super.anInt9398;
			@Pc(15) double local15 = (double) (arg0 - super.anInt9396);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local8 * local8);
			this.aDouble7 = (double) super.anInt9396 + local15 * (double) this.anInt7949 / local24;
			this.aDouble9 = (double) this.anInt7949 * local8 / local24 + (double) super.anInt9398;
			if (this.aBoolean660) {
				this.aDouble6 = Static274.method4782((int) this.aDouble7, super.aByte103, (int) this.aDouble9) - this.anInt7941;
			} else {
				this.aDouble6 = super.anInt9400;
			}
		}
		local8 = this.anInt7964 + 1 - arg1;
		this.aDouble4 = ((double) arg0 - this.aDouble7) / local8;
		this.aDouble8 = ((double) arg3 - this.aDouble9) / local8;
		this.aDouble3 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble8 * this.aDouble8);
		if (this.anInt7951 == -1) {
			this.aDouble5 = ((double) arg2 - this.aDouble6) / local8;
		} else {
			if (!this.aBoolean659) {
				this.aDouble5 = -this.aDouble3 * Math.tan((double) this.anInt7951 * 0.02454369D);
			}
			this.aDouble2 = ((double) arg2 - this.aDouble6 - this.aDouble5 * local8) * 2.0D / (local8 * local8);
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
	public void method6584() {
		if (this.aClass55_Sub8_6 != null) {
			this.aClass55_Sub8_6.method7122();
		}
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)I")
	@Override
	public int method7629() {
		return this.anInt7954;
	}
}
