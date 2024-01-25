import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class12_Sub2_Sub2_Sub4 extends Class12_Sub2_Sub2 {

	@OriginalMember(owner = "client!jr", name = "ab", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!jr", name = "fb", descriptor = "Lclient!cv;")
	private Class12_Sub4 aClass12_Sub4_4;

	@OriginalMember(owner = "client!jr", name = "gb", descriptor = "D")
	private double aDouble11;

	@OriginalMember(owner = "client!jr", name = "hb", descriptor = "D")
	private double aDouble12;

	@OriginalMember(owner = "client!jr", name = "lb", descriptor = "D")
	private double lb;

	@OriginalMember(owner = "client!jr", name = "mb", descriptor = "D")
	private double aDouble13;

	@OriginalMember(owner = "client!jr", name = "ob", descriptor = "I")
	private int anInt4955;

	@OriginalMember(owner = "client!jr", name = "rb", descriptor = "D")
	private double aDouble14;

	@OriginalMember(owner = "client!jr", name = "xb", descriptor = "D")
	private double aDouble15;

	@OriginalMember(owner = "client!jr", name = "Eb", descriptor = "D")
	private double aDouble16;

	@OriginalMember(owner = "client!jr", name = "Mb", descriptor = "I")
	private int anInt4972;

	@OriginalMember(owner = "client!jr", name = "Y", descriptor = "I")
	private int anInt4947 = 0;

	@OriginalMember(owner = "client!jr", name = "pb", descriptor = "I")
	private int anInt4956 = 0;

	@OriginalMember(owner = "client!jr", name = "W", descriptor = "I")
	private int anInt4945 = 0;

	@OriginalMember(owner = "client!jr", name = "Bb", descriptor = "Z")
	private boolean aBoolean344 = false;

	@OriginalMember(owner = "client!jr", name = "U", descriptor = "I")
	private int anInt4943 = 0;

	@OriginalMember(owner = "client!jr", name = "Lb", descriptor = "I")
	private int anInt4971 = -1;

	@OriginalMember(owner = "client!jr", name = "tb", descriptor = "Z")
	private boolean aBoolean342 = false;

	@OriginalMember(owner = "client!jr", name = "qb", descriptor = "Z")
	private final boolean aBoolean341;

	@OriginalMember(owner = "client!jr", name = "Gb", descriptor = "I")
	private final int anInt4966;

	@OriginalMember(owner = "client!jr", name = "nb", descriptor = "I")
	public final int anInt4954;

	@OriginalMember(owner = "client!jr", name = "Ib", descriptor = "I")
	public final int anInt4968;

	@OriginalMember(owner = "client!jr", name = "ib", descriptor = "I")
	public final int anInt4951;

	@OriginalMember(owner = "client!jr", name = "Z", descriptor = "I")
	private final int anInt4948;

	@OriginalMember(owner = "client!jr", name = "Nb", descriptor = "I")
	private final int anInt4973;

	@OriginalMember(owner = "client!jr", name = "vb", descriptor = "I")
	private final int anInt4959;

	@OriginalMember(owner = "client!jr", name = "sb", descriptor = "I")
	private final int anInt4957;

	@OriginalMember(owner = "client!jr", name = "X", descriptor = "I")
	private final int anInt4946;

	@OriginalMember(owner = "client!jr", name = "Db", descriptor = "I")
	public final int anInt4964;

	@OriginalMember(owner = "client!jr", name = "bb", descriptor = "Lclient!pf;")
	private final Class275 aClass275_1;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class12_Sub2_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static152.method2434(arg3, arg1, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.aBoolean341 = arg13;
		this.anInt4966 = arg14;
		this.anInt4954 = arg6;
		this.anInt4968 = arg7;
		this.anInt4951 = arg12;
		this.anInt4948 = arg5;
		this.anInt4973 = arg8;
		this.anInt4959 = arg0;
		this.anInt4957 = arg10;
		this.anInt4946 = arg9;
		this.anInt4964 = arg11;
		this.aBoolean344 = false;
		@Pc(90) int local90 = Static556.aClass216_2.method5268(this.anInt4959).anInt1664;
		if (local90 == -1) {
			this.aClass275_1 = null;
		} else {
			this.aClass275_1 = Static501.aClass191_2.method4322(local90);
		}
	}

	@OriginalMember(owner = "client!jr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass12_Sub4_4 != null) {
			this.aClass12_Sub4_4.method1614();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)V")
	public void method4124(@OriginalArg(1) int arg0) {
		this.aDouble14 += (double) arg0 * this.lb;
		this.aBoolean344 = true;
		this.aDouble11 += this.aDouble12 * (double) arg0;
		if (this.aBoolean341) {
			this.aDouble13 = (double) (Static152.method2434((int) this.aDouble14, super.aByte146, (int) this.aDouble11) - this.anInt4948);
		} else if (this.anInt4973 == -1) {
			this.aDouble13 += (double) arg0 * this.aDouble15;
		} else {
			this.aDouble13 += this.aDouble10 * 0.5D * (double) arg0 * (double) arg0 + this.aDouble15 * (double) arg0;
			this.aDouble15 += (double) arg0 * this.aDouble10;
		}
		this.anInt4955 = (int) (Math.atan2(this.lb, this.aDouble12) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4972 = (int) (Math.atan2(this.aDouble15, this.aDouble16) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass275_1 == null) {
			return;
		}
		this.anInt4956 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass275_1.anIntArray599[this.anInt4945] >= this.anInt4956) {
						return;
					}
					this.anInt4956 -= this.aClass275_1.anIntArray599[this.anInt4945];
					this.anInt4945++;
					if (this.aClass275_1.anIntArray598.length <= this.anInt4945) {
						this.anInt4945 -= this.aClass275_1.anInt7916;
						if (this.anInt4945 < 0 || this.aClass275_1.anIntArray598.length <= this.anInt4945) {
							this.anInt4945 = 0;
						}
					}
					this.anInt4971 = this.anInt4945 + 1;
				} while (this.anInt4971 < this.aClass275_1.anIntArray598.length);
				this.anInt4971 -= this.aClass275_1.anInt7916;
			} while (this.anInt4971 >= 0 && this.aClass275_1.anIntArray598.length > this.anInt4971);
			this.anInt4971 = -1;
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(Lclient!ha;I)Lclient!rn;")
	@Override
	public Class305 method9156(@OriginalArg(0) Class137 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V")
	@Override
	public void method9158() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIII)V")
	public void method4125(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean344) {
			local13 = (double) (arg1 - super.anInt10998);
			@Pc(20) double local20 = (double) (arg3 - super.anInt11002);
			@Pc(29) double local29 = Math.sqrt(local13 * local13 + local20 * local20);
			this.aDouble11 = (double) this.anInt4946 * local20 / local29 + (double) super.anInt11002;
			this.aDouble14 = (double) super.anInt10998 + local13 * (double) this.anInt4946 / local29;
			if (this.aBoolean341) {
				this.aDouble13 = (double) (Static152.method2434((int) this.aDouble14, super.aByte146, (int) this.aDouble11) - this.anInt4948);
			} else {
				this.aDouble13 = (double) super.anInt10997;
			}
		}
		local13 = (double) (this.anInt4968 + 1 - arg0);
		this.lb = ((double) arg1 - this.aDouble14) / local13;
		this.aDouble12 = ((double) arg3 - this.aDouble11) / local13;
		this.aDouble16 = Math.sqrt(this.lb * this.lb + this.aDouble12 * this.aDouble12);
		if (this.anInt4973 == -1) {
			this.aDouble15 = ((double) arg2 - this.aDouble13) / local13;
		} else {
			if (!this.aBoolean344) {
				this.aDouble15 = -this.aDouble16 * Math.tan((double) this.anInt4973 * 0.02454369D);
			}
			this.aDouble10 = ((double) arg2 - this.aDouble15 * local13 - this.aDouble13) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZLclient!je;IIILclient!ha;I)V")
	@Override
	public void method9166(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class137 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9150() {
		return this.aBoolean342;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!ha;ILclient!qja;Lclient!ka;)V")
	private void method4126(@OriginalArg(0) Class137 arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class80 arg2) {
		arg2.method6373(arg1);
		@Pc(15) Class136[] local15 = arg2.method6376();
		@Pc(18) Class265[] local18 = arg2.method6372();
		if ((this.aClass12_Sub4_4 == null || this.aClass12_Sub4_4.aBoolean155) && (local15 != null || local18 != null)) {
			this.aClass12_Sub4_4 = Static86.method1612(Static87.anInt1951, true);
		}
		if (this.aClass12_Sub4_4 != null) {
			this.aClass12_Sub4_4.method1620(arg0, (long) Static87.anInt1951, local15, local18);
			this.aClass12_Sub4_4.method1621(super.aByte146, super.aShort111, super.aShort112, super.aShort110, super.aShort109);
		}
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method9161() {
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9160() {
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
	public void method4128() {
		if (this.aBoolean344 || this.anInt4957 == 0) {
			return;
		}
		@Pc(15) Class12_Sub2_Sub2_Sub1 local15 = null;
		@Pc(23) int local23;
		if (this.anInt4957 >= 0) {
			local23 = this.anInt4957 - 1;
			@Pc(30) Class14_Sub44 local30 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local23);
			if (local30 != null) {
				local15 = local30.aClass12_Sub2_Sub2_Sub1_Sub1_2;
			}
		} else {
			local23 = -this.anInt4957 - 1;
			if (Static568.anInt9800 == local23) {
				local15 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2;
			} else {
				local15 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local23];
			}
		}
		if (local15 == null) {
			return;
		}
		super.anInt11002 = local15.anInt11002;
		super.anInt10998 = local15.anInt10998;
		super.anInt10997 = Static152.method2434(local15.anInt10998, super.aByte146, local15.anInt11002) - this.anInt4948;
		if (this.anInt4966 < 0) {
			return;
		}
		@Pc(90) Class132 local90 = local15.method2416();
		@Pc(92) int local92 = 0;
		@Pc(94) int local94 = 0;
		if (local90.anIntArrayArray22 != null && local90.anIntArrayArray22[this.anInt4966] != null) {
			local94 = local90.anIntArrayArray22[this.anInt4966][2];
			local92 = local90.anIntArrayArray22[this.anInt4966][0];
		}
		if (local90.anIntArrayArray21 != null && local90.anIntArrayArray21[this.anInt4966] != null) {
			local92 += local90.anIntArrayArray21[this.anInt4966][0];
			local94 += local90.anIntArrayArray21[this.anInt4966][2];
		}
		if (local92 == 0 && local94 == 0) {
			return;
		}
		@Pc(161) int local161 = local15.aClass139_7.method3204();
		@Pc(163) int local163 = local161;
		if (local15.anIntArray233 != null && local15.anIntArray233[this.anInt4966] != -1) {
			local163 = local15.anIntArray233[this.anInt4966];
		}
		@Pc(186) int local186 = local163 - local161 & 0x3FFF;
		@Pc(190) int local190 = Class32.anIntArray76[local186];
		@Pc(194) int local194 = Class32.anIntArray77[local186];
		@Pc(204) int local204 = local190 * local94 + local92 * local194 >> 14;
		local94 = local194 * local94 - local190 * local92 >> 14;
		super.anInt10998 += local204;
		super.anInt11002 += local94;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9164(@OriginalArg(1) Class137 arg0) {
		@Pc(9) Class80 local9 = this.method4130(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class26 local15 = arg0.method7923();
		local15.method6460(this.anInt4972);
		local15.method6449(this.anInt4955);
		local15.method6443((int) this.aDouble14, (int) this.aDouble13, (int) this.aDouble11);
		this.anInt4943 = local9.fa();
		this.anInt4947 = local9.ma();
		this.method4126(arg0, local15, local9);
	}

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "(I)V")
	@Override
	public void method8969() {
		super.aShort110 = super.aShort109 = (short) (int) (this.aDouble11 / 512.0D);
		super.aShort111 = super.aShort112 = (short) (int) (this.aDouble14 / 512.0D);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V")
	public void method4129() {
		if (this.aClass12_Sub4_4 != null) {
			this.aClass12_Sub4_4.method1614();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class80 method4130(@OriginalArg(0) int arg0, @OriginalArg(2) Class137 arg1) {
		@Pc(9) Class60 local9 = Static556.aClass216_2.method5268(this.anInt4959);
		return local9.method1442(Static501.aClass191_2, this.anInt4971, this.anInt4945, arg0, this.anInt4956, arg1);
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)I")
	@Override
	public int method9159() {
		return this.anInt4943;
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)I")
	@Override
	public int method9149(@OriginalArg(0) int arg0) {
		return arg0 == -1760267218 ? this.anInt4947 : -19;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!ha;I)Lclient!maa;")
	@Override
	public Class12_Sub8 method9151(@OriginalArg(0) Class137 arg0) {
		@Pc(13) Class80 local13 = this.method4130(2048, arg0);
		if (local13 == null) {
			return null;
		}
		@Pc(20) Class26 local20 = arg0.method7923();
		local20.method6460(this.anInt4972);
		local20.method6449(this.anInt4955);
		local20.method6443((int) this.aDouble14, (int) this.aDouble13, (int) this.aDouble11);
		this.method4126(arg0, local20, local13);
		@Pc(58) Class12_Sub8 local58 = Static291.method4323(false, 1);
		if (Static401.aBoolean511) {
			local13.method6375(local20, local58.aClass12_Sub1Array1[0], Static331.anInt6277, 0);
		} else {
			local13.method6391(local20, local58.aClass12_Sub1Array1[0], 0);
		}
		if (this.aClass12_Sub4_4 != null) {
			@Pc(86) Class196 local86 = this.aClass12_Sub4_4.method1613();
			if (Static401.aBoolean511) {
				arg0.method7942(local86, Static331.anInt6277);
			} else {
				arg0.method7917(local86);
			}
		}
		this.aBoolean342 = local13.F();
		this.anInt4943 = local13.fa();
		this.anInt4947 = local13.ma();
		return local58;
	}
}
