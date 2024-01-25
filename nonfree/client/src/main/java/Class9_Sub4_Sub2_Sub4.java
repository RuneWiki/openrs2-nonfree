import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class9_Sub4_Sub2_Sub4 extends Class9_Sub4_Sub2 {

	@OriginalMember(owner = "client!rk", name = "P", descriptor = "D")
	private double aDouble14;

	@OriginalMember(owner = "client!rk", name = "S", descriptor = "D")
	private double aDouble15;

	@OriginalMember(owner = "client!rk", name = "cb", descriptor = "I")
	private int anInt8683;

	@OriginalMember(owner = "client!rk", name = "gb", descriptor = "D")
	private double aDouble16;

	@OriginalMember(owner = "client!rk", name = "ib", descriptor = "I")
	private int anInt8686;

	@OriginalMember(owner = "client!rk", name = "nb", descriptor = "D")
	private double aDouble17;

	@OriginalMember(owner = "client!rk", name = "qb", descriptor = "D")
	private double aDouble18;

	@OriginalMember(owner = "client!rk", name = "tb", descriptor = "D")
	private double aDouble19;

	@OriginalMember(owner = "client!rk", name = "Ab", descriptor = "D")
	private double aDouble20;

	@OriginalMember(owner = "client!rk", name = "Jb", descriptor = "Lclient!lba;")
	private Class9_Sub5 aClass9_Sub5_6;

	@OriginalMember(owner = "client!rk", name = "Lb", descriptor = "D")
	private double aDouble21;

	@OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
	private int anInt8675 = 0;

	@OriginalMember(owner = "client!rk", name = "fb", descriptor = "Z")
	private boolean aBoolean692 = false;

	@OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
	private int anInt8670 = 0;

	@OriginalMember(owner = "client!rk", name = "db", descriptor = "I")
	private int anInt8684 = -1;

	@OriginalMember(owner = "client!rk", name = "ub", descriptor = "Z")
	private boolean aBoolean694 = false;

	@OriginalMember(owner = "client!rk", name = "pb", descriptor = "I")
	private int anInt8691 = 0;

	@OriginalMember(owner = "client!rk", name = "Bb", descriptor = "I")
	private int anInt8699 = 0;

	@OriginalMember(owner = "client!rk", name = "O", descriptor = "I")
	private final int anInt8671;

	@OriginalMember(owner = "client!rk", name = "lb", descriptor = "I")
	private final int lb;

	@OriginalMember(owner = "client!rk", name = "Z", descriptor = "I")
	private final int anInt8680;

	@OriginalMember(owner = "client!rk", name = "Cb", descriptor = "I")
	private final int anInt8700;

	@OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
	public final int anInt8672;

	@OriginalMember(owner = "client!rk", name = "sb", descriptor = "I")
	public final int anInt8693;

	@OriginalMember(owner = "client!rk", name = "vb", descriptor = "I")
	public final int anInt8694;

	@OriginalMember(owner = "client!rk", name = "V", descriptor = "I")
	public final int anInt8676;

	@OriginalMember(owner = "client!rk", name = "eb", descriptor = "I")
	private final int anInt8685;

	@OriginalMember(owner = "client!rk", name = "hb", descriptor = "Z")
	private final boolean aBoolean693;

	@OriginalMember(owner = "client!rk", name = "Db", descriptor = "I")
	private final int anInt8701;

	@OriginalMember(owner = "client!rk", name = "M", descriptor = "Lclient!gaa;")
	private final Class113 aClass113_2;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class9_Sub4_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static150.method2982(arg1, arg4, arg3) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt8671 = arg5;
		this.lb = arg8;
		this.anInt8680 = arg9;
		this.anInt8700 = arg0;
		this.aBoolean694 = false;
		this.anInt8672 = arg12;
		this.anInt8693 = arg6;
		this.anInt8694 = arg11;
		this.anInt8676 = arg7;
		this.anInt8685 = arg10;
		this.aBoolean693 = arg13;
		this.anInt8701 = arg14;
		@Pc(91) int local91 = Static360.aClass312_2.method7492(this.anInt8700).anInt4155;
		if (local91 == -1) {
			this.aClass113_2 = null;
		} else {
			this.aClass113_2 = Static528.aClass198_2.method5706(local91);
		}
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class5 arg0) {
		@Pc(17) Class92 local17 = this.method7231(0, arg0);
		if (local17 == null) {
			return;
		}
		@Pc(23) Class115 local23 = arg0.method6156();
		local23.method6297(this.anInt8686);
		local23.method6287(this.anInt8683);
		local23.method6296((int) this.aDouble16, (int) this.aDouble21, (int) this.aDouble14);
		this.anInt8699 = local17.fa();
		this.anInt8670 = local17.ma();
		this.method7226(local23, arg0, local17);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLclient!ha;)Lclient!oia;")
	@Override
	public Class243 method8409(@OriginalArg(1) Class5 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "(B)V")
	@Override
	public void method8427() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.anInt8699;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIBI)V")
	public void method7224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) double local11;
		if (!this.aBoolean694) {
			local11 = (double) (arg0 - super.anInt10360);
			@Pc(18) double local18 = (double) (arg3 - super.anInt10357);
			@Pc(27) double local27 = Math.sqrt(local11 * local11 + local18 * local18);
			this.aDouble14 = (double) super.anInt10357 + (double) this.anInt8680 * local18 / local27;
			this.aDouble16 = (double) super.anInt10360 + local11 * (double) this.anInt8680 / local27;
			if (this.aBoolean693) {
				this.aDouble21 = (double) (Static150.method2982(super.aByte135, (int) this.aDouble14, (int) this.aDouble16) - this.anInt8671);
			} else {
				this.aDouble21 = (double) super.anInt10365;
			}
		}
		local11 = (double) (this.anInt8676 + 1 - arg2);
		this.aDouble20 = ((double) arg3 - this.aDouble14) / local11;
		this.aDouble15 = ((double) arg0 - this.aDouble16) / local11;
		this.aDouble18 = Math.sqrt(this.aDouble20 * this.aDouble20 + this.aDouble15 * this.aDouble15);
		if (this.lb == -1) {
			this.aDouble19 = ((double) arg1 - this.aDouble21) / local11;
		} else {
			if (!this.aBoolean694) {
				this.aDouble19 = -this.aDouble18 * Math.tan((double) this.lb * 0.02454369D);
			}
			this.aDouble17 = ((double) arg1 - this.aDouble21 - this.aDouble19 * local11) * 2.0D / (local11 * local11);
		}
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(Z)I")
	@Override
	public int method8420(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method8411(115, (Class5) null, -25);
		}
		return this.anInt8670;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V")
	public void method7225(@OriginalArg(1) int arg0) {
		this.aDouble14 += (double) arg0 * this.aDouble20;
		this.aDouble16 += this.aDouble15 * (double) arg0;
		this.aBoolean694 = true;
		if (this.aBoolean693) {
			this.aDouble21 = (double) (Static150.method2982(super.aByte135, (int) this.aDouble14, (int) this.aDouble16) - this.anInt8671);
		} else if (this.lb == -1) {
			this.aDouble21 += this.aDouble19 * (double) arg0;
		} else {
			this.aDouble21 += (double) arg0 * (double) arg0 * this.aDouble17 * 0.5D + (double) arg0 * this.aDouble19;
			this.aDouble19 += (double) arg0 * this.aDouble17;
		}
		this.anInt8683 = (int) (Math.atan2(this.aDouble15, this.aDouble20) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt8686 = (int) (Math.atan2(this.aDouble19, this.aDouble18) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass113_2 == null) {
			return;
		}
		this.anInt8691 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass113_2.anIntArray176[this.anInt8675] >= this.anInt8691) {
						return;
					}
					this.anInt8691 -= this.aClass113_2.anIntArray176[this.anInt8675];
					this.anInt8675++;
					if (this.anInt8675 >= this.aClass113_2.anIntArray178.length) {
						this.anInt8675 -= this.aClass113_2.anInt3856;
						if (this.anInt8675 < 0 || this.anInt8675 >= this.aClass113_2.anIntArray178.length) {
							this.anInt8675 = 0;
						}
					}
					this.anInt8684 = this.anInt8675 + 1;
				} while (this.aClass113_2.anIntArray178.length > this.anInt8684);
				this.anInt8684 -= this.aClass113_2.anInt3856;
			} while (this.anInt8684 >= 0 && this.anInt8684 < this.aClass113_2.anIntArray178.length);
			this.anInt8684 = -1;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!hba;Lclient!ha;Lclient!ka;B)V")
	private void method7226(@OriginalArg(0) Class115 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class92 arg2) {
		arg2.method7071(arg0);
		@Pc(17) Class103[] local17 = arg2.method7048();
		@Pc(20) Class49[] local20 = arg2.method7050();
		if ((this.aClass9_Sub5_6 == null || this.aClass9_Sub5_6.aBoolean486) && (local17 != null || local20 != null)) {
			this.aClass9_Sub5_6 = Static311.method5223(Static384.anInt7234, true);
		}
		if (this.aClass9_Sub5_6 != null) {
			this.aClass9_Sub5_6.method5226(arg1, (long) Static384.anInt7234, local17, local20);
			this.aClass9_Sub5_6.method5229(super.aByte135, super.aShort115, super.aShort117, super.aShort114, super.aShort116);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	public void method7228() {
		if (this.aClass9_Sub5_6 != null) {
			this.aClass9_Sub5_6.method5220();
		}
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8417() {
		return false;
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8413() {
		return false;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!ha;BI)Z")
	@Override
	public boolean method8411(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V")
	public void method7230() {
		if (this.aBoolean694 || this.anInt8685 == 0) {
			return;
		}
		@Pc(21) Class9_Sub4_Sub2_Sub1 local21 = null;
		@Pc(30) int local30;
		if (this.anInt8685 < 0) {
			local30 = -this.anInt8685 - 1;
			if (Static238.anInt5268 == local30) {
				local21 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1;
			} else {
				local21 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local30];
			}
		} else {
			local30 = this.anInt8685 - 1;
			@Pc(57) Class6_Sub42 local57 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local30);
			if (local57 != null) {
				local21 = local57.aClass9_Sub4_Sub2_Sub1_Sub1_1;
			}
		}
		if (local21 == null) {
			return;
		}
		super.anInt10360 = local21.anInt10360;
		super.anInt10357 = local21.anInt10357;
		super.anInt10365 = Static150.method2982(super.aByte135, local21.anInt10357, local21.anInt10360) - this.anInt8671;
		if (this.anInt8701 < 0) {
			return;
		}
		@Pc(92) Class303 local92 = local21.method3625();
		@Pc(94) int local94 = 0;
		@Pc(96) int local96 = 0;
		if (local92.anIntArrayArray47 != null && local92.anIntArrayArray47[this.anInt8701] != null) {
			local94 = local92.anIntArrayArray47[this.anInt8701][0];
			local96 = local92.anIntArrayArray47[this.anInt8701][2];
		}
		if (local92.anIntArrayArray46 != null && local92.anIntArrayArray46[this.anInt8701] != null) {
			local96 += local92.anIntArrayArray46[this.anInt8701][2];
			local94 += local92.anIntArrayArray46[this.anInt8701][0];
		}
		if (local94 != 0 || local96 != 0) {
			@Pc(166) int local166 = local21.aClass332_7.method7925();
			@Pc(168) int local168 = local166;
			if (local21.anIntArray188 != null && local21.anIntArray188[this.anInt8701] != -1) {
				local168 = local21.anIntArray188[this.anInt8701];
			}
			@Pc(191) int local191 = local168 - local166 & 0x3FFF;
			@Pc(195) int local195 = Class78_Sub2_Sub2.anIntArray270[local191];
			@Pc(199) int local199 = Class78_Sub2_Sub2.anIntArray271[local191];
			@Pc(209) int local209 = local96 * local195 + local199 * local94 >> 14;
			local96 = local199 * local96 - local195 * local94 >> 14;
			super.anInt10360 += local209;
			super.anInt10357 += local96;
		}
		return;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BILclient!ha;)Lclient!ka;")
	private Class92 method7231(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(21) Class124 local21 = Static360.aClass312_2.method7492(this.anInt8700);
		return local21.method3529(this.anInt8675, Static528.aClass198_2, arg0, this.anInt8691, this.anInt8684, arg1);
	}

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8422() {
		return this.aBoolean692;
	}

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "(I)V")
	@Override
	public void method7823() {
		super.aShort114 = super.aShort116 = (short) (int) (this.aDouble14 / 512.0D);
		super.aShort115 = super.aShort117 = (short) (int) (this.aDouble16 / 512.0D);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!gg;BZILclient!ha;II)V")
	@Override
	public void method8416(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass9_Sub5_6 != null) {
			this.aClass9_Sub5_6.method5220();
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(Lclient!ha;I)Lclient!bd;")
	@Override
	public Class9_Sub2 method8410(@OriginalArg(0) Class5 arg0) {
		@Pc(11) Class92 local11 = this.method7231(2048, arg0);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class115 local18 = arg0.method6156();
		local18.method6297(this.anInt8686);
		local18.method6287(this.anInt8683);
		local18.method6296((int) this.aDouble16, (int) this.aDouble21, (int) this.aDouble14);
		this.method7226(local18, arg0, local11);
		@Pc(48) Class9_Sub2 local48 = Static167.method3172(1, false);
		if (Static423.aBoolean622) {
			local11.method7057(local18, local48.aClass9_Sub6Array1[0], Static32.anInt849, 0);
		} else {
			local11.method7053(local18, local48.aClass9_Sub6Array1[0], 0);
		}
		if (this.aClass9_Sub5_6 != null) {
			@Pc(76) Class257 local76 = this.aClass9_Sub5_6.method5222();
			if (Static423.aBoolean622) {
				arg0.method6148(local76, Static32.anInt849);
			} else {
				arg0.method6183(local76);
			}
		}
		this.aBoolean692 = local11.F();
		this.anInt8699 = local11.fa();
		this.anInt8670 = local11.ma();
		return local48;
	}
}
