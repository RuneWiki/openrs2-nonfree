import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class3_Sub1_Sub2_Sub2_Sub1 extends Class3_Sub1_Sub2_Sub2 {

	@OriginalMember(owner = "client!iaa", name = "jd", descriptor = "I")
	public int anInt3931;

	@OriginalMember(owner = "client!iaa", name = "sd", descriptor = "I")
	public int anInt3938;

	@OriginalMember(owner = "client!iaa", name = "Id", descriptor = "Lclient!nba;")
	public Class245 aClass245_1;

	@OriginalMember(owner = "client!iaa", name = "Qd", descriptor = "Ljava/lang/String;")
	public String aString36;

	@OriginalMember(owner = "client!iaa", name = "Rd", descriptor = "I")
	private int anInt3958;

	@OriginalMember(owner = "client!iaa", name = "Ud", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!iaa", name = "Vc", descriptor = "Z")
	public boolean aBoolean290 = false;

	@OriginalMember(owner = "client!iaa", name = "gd", descriptor = "I")
	public int anInt3928 = -1;

	@OriginalMember(owner = "client!iaa", name = "rd", descriptor = "I")
	public int anInt3937 = -1;

	@OriginalMember(owner = "client!iaa", name = "qd", descriptor = "I")
	public int anInt3936 = 0;

	@OriginalMember(owner = "client!iaa", name = "Uc", descriptor = "I")
	public int anInt3920 = 0;

	@OriginalMember(owner = "client!iaa", name = "kd", descriptor = "I")
	public int anInt3932 = -1;

	@OriginalMember(owner = "client!iaa", name = "Bd", descriptor = "I")
	public int anInt3946 = -1;

	@OriginalMember(owner = "client!iaa", name = "nd", descriptor = "Z")
	public boolean aBoolean293 = false;

	@OriginalMember(owner = "client!iaa", name = "cd", descriptor = "B")
	private byte aByte64 = 0;

	@OriginalMember(owner = "client!iaa", name = "wd", descriptor = "I")
	public int anInt3941 = -1;

	@OriginalMember(owner = "client!iaa", name = "Gd", descriptor = "I")
	public int anInt3950 = -1;

	@OriginalMember(owner = "client!iaa", name = "id", descriptor = "I")
	public int anInt3930 = -1;

	@OriginalMember(owner = "client!iaa", name = "xd", descriptor = "I")
	public int anInt3942 = 255;

	@OriginalMember(owner = "client!iaa", name = "dd", descriptor = "Z")
	public boolean aBoolean292 = false;

	@OriginalMember(owner = "client!iaa", name = "Cd", descriptor = "I")
	public int anInt3947 = 0;

	@OriginalMember(owner = "client!iaa", name = "ld", descriptor = "B")
	private byte aByte65 = 0;

	@OriginalMember(owner = "client!iaa", name = "Nd", descriptor = "I")
	public int anInt3955 = -1;

	@OriginalMember(owner = "client!iaa", name = "ad", descriptor = "Z")
	public boolean aBoolean291 = false;

	@OriginalMember(owner = "client!iaa", name = "Td", descriptor = "Z")
	public boolean aBoolean295 = false;

	@OriginalMember(owner = "client!iaa", name = "yd", descriptor = "I")
	public int anInt3943 = 0;

	@OriginalMember(owner = "client!iaa", name = "Od", descriptor = "I")
	public int anInt3956 = 0;

	@OriginalMember(owner = "client!iaa", name = "Dd", descriptor = "Z")
	public boolean aBoolean294 = false;

	@OriginalMember(owner = "client!iaa", name = "vd", descriptor = "B")
	private byte aByte66 = 0;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)Z")
	public boolean method3528() {
		return this.aClass245_1 != null;
	}

	@OriginalMember(owner = "client!iaa", name = "i", descriptor = "(I)I")
	@Override
	public int method8519() {
		return -1;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIB)V")
	public void method3530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt9981 != -1 && Static99.aClass2_1.method22(super.anInt9981).anInt3030 == 1) {
			super.anIntArray690 = null;
			super.anInt9981 = -1;
		}
		for (@Pc(33) int local33 = 0; super.aClass78Array3.length > local33; local33++) {
			if (super.aClass78Array3[local33].anInt2180 != -1) {
				@Pc(51) Class323 local51 = Static341.aClass349_1.method7597(super.aClass78Array3[local33].anInt2180);
				if (local51.aBoolean644 && local51.anInt8322 != -1 && Static99.aClass2_1.method22(local51.anInt8322).anInt3030 == 1) {
					super.aClass78Array3[local33].anInt2180 = -1;
				}
			}
		}
		this.anInt3955 = -1;
		if (arg0 < 0 || arg0 >= Static224.anInt3557 || arg1 < 0 || arg1 >= Static267.anInt4309) {
			this.method3534(arg0, arg1);
		} else if (super.anIntArray693[0] >= 0 && Static224.anInt3557 > super.anIntArray693[0] && super.anIntArray694[0] >= 0 && Static267.anInt4309 > super.anIntArray694[0]) {
			if (arg2 == 2) {
				Static200.method3056(this, arg0, arg1);
			}
			this.method3536(arg1, arg0, arg2);
		} else {
			this.method3534(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!iaa", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method8505() {
		return false;
	}

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "(Z)V")
	@Override
	public void method8504() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method3531() {
		return this.aString37;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method3532() {
		@Pc(7) String local7 = "";
		if (Static216.aStringArray16 != null) {
			local7 = local7 + Static216.aStringArray16[this.aByte64];
		}
		@Pc(34) int[] local34;
		if (this.aByte65 == 1 && Static179.anIntArray227 != null) {
			local34 = Static179.anIntArray227;
		} else {
			local34 = Static244.anIntArray295;
		}
		if (local34 != null && local34[this.aByte64] != -1) {
			@Pc(55) Class381 local55 = Static599.aClass311_1.method6971(local34[this.aByte64]);
			if (local55.aChar6 == 's') {
				local7 = local7 + local55.method8604(this.aByte66 & 0xFF);
			} else {
				Static357.method4765(new Throwable(), "gdn1");
				local34[this.aByte64] = -1;
			}
		}
		local7 = local7 + this.aString36;
		if (Static599.aStringArray47 != null) {
			local7 = local7 + Static599.aStringArray47[this.aByte64];
		}
		return local7;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!ha;II)Z")
	private boolean method3533(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class377 local11 = this.method8525();
		@Pc(29) Class124 local29 = super.anInt9981 != -1 && super.anInt9934 == 0 ? Static99.aClass2_1.method22(super.anInt9981) : null;
		@Pc(52) Class124 local52 = super.anInt9967 == -1 || this.aBoolean295 || super.aBoolean776 && local29 != null ? null : Static99.aClass2_1.method22(super.anInt9967);
		@Pc(55) int local55 = local11.anInt10048;
		@Pc(58) int local58 = local11.anInt10029;
		if (local55 != 0 || local58 != 0 || local11.anInt10071 != 0 || local11.anInt10069 != 0) {
			arg1 |= 0x7;
		}
		@Pc(80) int local80 = super.aClass240_7.method4986();
		@Pc(98) boolean local98 = super.aByte147 != 0 && super.anInt9956 <= Static177.anInt3088 && super.anInt9994 > Static177.anInt3088;
		if (local98) {
			arg1 |= 0x80000;
		}
		@Pc(142) Class62 local142 = super.aClass62Array3[0] = this.aClass245_1.method5068(arg1, arg0, Static99.aClass2_1, super.anInt9960, Static255.aClass380_1, super.anInt9972, super.anInt9946, local52, local80, super.anIntArray684, Static526.aClass293_1, super.anInt9973, Static532.aClass255_2, super.anInt9940, local29, super.aClass143Array3, Static511.aClass254_1, super.anInt9941, Static116.aClass177_1);
		@Pc(145) int local145 = Static2.method21();
		if (Static197.anInt5439 < 96 && local145 > 50) {
			Static96.method1971();
		}
		if (Static181.aClass60_3 != Static215.aClass60_4 && local145 < 50) {
			@Pc(175) int local175 = 50 - local145;
			while (Static394.anInt5898 < local175) {
				Static124.aByteArrayArray9[Static394.anInt5898] = new byte[102400];
				Static394.anInt5898++;
			}
			while (Static394.anInt5898 > local175) {
				Static394.anInt5898--;
				Static124.aByteArrayArray9[Static394.anInt5898] = null;
			}
		} else if (Static181.aClass60_3 != Static215.aClass60_4) {
			Static124.aByteArrayArray9 = new byte[50][];
			Static394.anInt5898 = 0;
		}
		if (local142 == null) {
			return false;
		}
		super.anInt9951 = local142.fa();
		super.anInt9939 = local142.ma();
		this.method8518(local142);
		if (local55 == 0 && local58 == 0) {
			this.method8529(this.method8514() << 9, 0, local80, 0, this.method8514() << 9);
		} else {
			this.method8529(local58, local11.anInt10056, local80, local11.anInt10030, local55);
			if (super.anInt9978 != 0) {
				local142.FA(super.anInt9978);
			}
			if (super.anInt9954 != 0) {
				local142.VA(super.anInt9954);
			}
			if (super.anInt9948 != 0) {
				local142.H(0, super.anInt9948, 0);
			}
		}
		if (local98) {
			local142.method7349(super.aByte145, super.aByte144, super.aByte146, super.aByte147 & 0xFF);
		}
		if (!this.aBoolean295) {
			this.method8523(local80, arg0, local55, local7, local11, local58);
		}
		return true;
	}

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "(III)V")
	public void method3534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt10003 = 0;
		super.anInt10001 = 0;
		super.anInt10002 = 0;
		super.anIntArray693[0] = arg0;
		super.anIntArray694[0] = arg1;
		@Pc(35) int local35 = this.method8514();
		super.anInt9917 = super.anIntArray694[0] * 512 + local35 * 256;
		super.anInt9925 = super.anIntArray693[0] * 512 + local35 * 256;
		if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 == this) {
			Static568.method7522();
		}
		if (super.aClass3_Sub7_8 != null) {
			super.aClass3_Sub7_8.method7303();
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIILclient!ha;Lclient!nh;IILclient!ka;)V")
	private void method3535(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class33 arg3, @OriginalArg(5) Class92 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class62 arg7) {
		@Pc(11) int local11 = arg6 * arg6 + arg5 * arg5;
		if (local11 < 262144 || arg2 < local11) {
			return;
		}
		@Pc(45) int local45 = (int) (Math.atan2((double) arg5, (double) arg6) * 2607.5945876176133D - (double) super.aClass240_7.method4986()) & 0x3FFF;
		@Pc(57) Class62 local57 = Static238.method3428(super.anInt9948, super.anInt9954, arg1, local45, arg3, super.anInt9978);
		if (local57 != null) {
			arg3.C(false);
			local57.method7332(arg4, (Class3_Sub4) null, arg0, 0);
			arg3.C(true);
		}
	}

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "(I)I")
	@Override
	public int method8514() {
		return this.aClass245_1 == null || this.aClass245_1.anInt5763 == -1 ? super.method8514() : Static255.aClass380_1.method8596(this.aClass245_1.anInt5763).anInt8812;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIBI)V")
	public void method3536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (super.anInt10003 < 9) {
			super.anInt10003++;
		}
		for (@Pc(20) int local20 = super.anInt10003; local20 > 0; local20--) {
			super.anIntArray693[local20] = super.anIntArray693[local20 - 1];
			super.anIntArray694[local20] = super.anIntArray694[local20 - 1];
			super.aByteArray102[local20] = super.aByteArray102[local20 - 1];
		}
		super.anIntArray693[0] = arg1;
		super.anIntArray694[0] = arg0;
		super.aByteArray102[0] = arg2;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BLclient!es;)V")
	public void method3537(@OriginalArg(1) Class4_Sub11 arg0) {
		arg0.anInt10466 = 0;
		@Pc(12) int local12 = arg0.method8865();
		this.aByte65 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean294;
		this.aBoolean294 = (local12 & 0x2) != 0;
		@Pc(44) boolean local44 = (local12 & 0x4) != 0;
		@Pc(48) int local48 = super.method8514();
		this.method8515((local12 >> 3 & 0x7) + 1);
		this.aByte64 = (byte) (local12 >> 6 & 0x3);
		super.anInt9925 += this.method8514() - local48 << 8;
		super.anInt9917 += this.method8514() - local48 << 8;
		this.aByte66 = arg0.method8861();
		this.anInt3950 = arg0.method8861();
		this.anInt3928 = arg0.method8861();
		this.aBoolean293 = arg0.method8861() == 1;
		if (Static181.aClass60_3 == Static215.aClass60_4 && Static279.anInt4498 >= 2) {
			this.aBoolean293 = false;
		}
		@Pc(129) int local129 = -1;
		this.anInt3956 = 0;
		@Pc(146) int[] local146 = new int[Static358.aClass220_2.anIntArray416.length];
		@Pc(151) Class38[] local151 = new Class38[Static358.aClass220_2.anIntArray416.length];
		@Pc(156) Class110[] local156 = new Class110[Static358.aClass220_2.anIntArray416.length];
		@Pc(170) int local170;
		@Pc(185) int local185;
		@Pc(191) int local191;
		@Pc(239) int local239;
		for (@Pc(158) int local158 = 0; local158 < Static358.aClass220_2.anIntArray416.length; local158++) {
			if (Static358.aClass220_2.anIntArray416[local158] != 1) {
				local170 = arg0.method8865();
				if (local170 == 0) {
					local146[local158] = 0;
				} else {
					local185 = arg0.method8865();
					local191 = local185 + (local170 << 8);
					if (local158 == 0 && local191 == 65535) {
						local129 = arg0.method8859();
						this.anInt3956 = arg0.method8865();
						break;
					}
					if (local191 >= 32768) {
						local191 = Static218.anIntArray247[local191 - 32768];
						local146[local158] = local191 | 0x40000000;
						local156[local158] = Static532.aClass255_2.method5210(local191);
						local239 = local156[local158].anInt2803;
						if (local239 != 0) {
							this.anInt3956 = local239;
						}
					} else {
						local146[local158] = Integer.MIN_VALUE | local191 - 256;
					}
				}
			}
		}
		if (local129 == -1) {
			local170 = arg0.method8859();
			local185 = 0;
			for (local191 = 0; local191 < Static358.aClass220_2.anIntArray416.length; local191++) {
				if (Static358.aClass220_2.anIntArray416[local191] == 0) {
					if ((0x1 << local185 & local170) != 0) {
						local151[local191] = Static547.method7289(local156[local191], arg0);
					}
					local185++;
				}
			}
		}
		@Pc(313) int[] local313 = new int[5];
		for (local185 = 0; local185 < 5; local185++) {
			local191 = arg0.method8865();
			if (Static158.aShortArrayArrayArray8.length < 1 || local191 < 0 || local191 >= Static158.aShortArrayArrayArray8[0][local185].length) {
				local191 = 0;
			}
			local313[local185] = local191;
		}
		this.anInt3958 = arg0.method8859();
		this.aString36 = arg0.method8853();
		if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 == this) {
			Static603.aString116 = this.aString36;
		}
		this.aString37 = this.aString36;
		this.anInt3920 = arg0.method8865();
		if (local44) {
			this.anInt3943 = arg0.method8859();
			this.anInt3947 = this.anInt3920;
			this.anInt3946 = -1;
			if (this.anInt3943 == 65535) {
				this.anInt3943 = -1;
			}
		} else {
			this.anInt3943 = 0;
			this.anInt3947 = arg0.method8865();
			this.anInt3946 = arg0.method8865();
			if (this.anInt3946 == 255) {
				this.anInt3946 = -1;
			}
		}
		local191 = this.anInt3936;
		this.anInt3936 = arg0.method8865();
		@Pc(440) int local440;
		if (this.anInt3936 == 0) {
			Static580.method7650(this);
		} else {
			local239 = this.anInt3937;
			@Pc(437) int local437 = this.anInt3930;
			local440 = this.anInt3932;
			@Pc(443) int local443 = this.anInt3941;
			@Pc(446) int local446 = this.anInt3942;
			this.anInt3937 = arg0.method8859();
			this.anInt3930 = arg0.method8859();
			this.anInt3932 = arg0.method8859();
			this.anInt3941 = arg0.method8859();
			this.anInt3942 = arg0.method8865();
			if (this.aBoolean294 != local21 || local191 != this.anInt3936 || local239 != this.anInt3937 || local437 != this.anInt3930 || this.anInt3932 != local440 || local443 != this.anInt3941 || local446 != this.anInt3942) {
				Static214.method3195(this);
			}
		}
		if (this.aClass245_1 == null) {
			this.aClass245_1 = new Class245();
		}
		local239 = this.aClass245_1.anInt5763;
		@Pc(535) int[] local535 = this.aClass245_1.anIntArray437;
		this.aClass245_1.method5061(local129, local313, this.method8527(), local146, this.aByte65 == 1, local151);
		if (local129 != local239) {
			super.anInt9925 = (super.anIntArray693[0] << 9) + (this.method8514() << 8);
			super.anInt9917 = (super.anIntArray694[0] << 9) + (this.method8514() << 8);
		}
		if (super.anInt9961 == Static184.anInt3149 && local535 != null) {
			for (local440 = 0; local440 < local313.length; local440++) {
				if (local535[local440] != local313[local440]) {
					Static532.aClass255_2.method5212();
					break;
				}
			}
		}
		if (super.aClass3_Sub7_8 != null) {
			super.aClass3_Sub7_8.method7303();
		}
		if (super.anInt9967 == -1 || !super.aBoolean776) {
			return;
		}
		@Pc(646) Class377 local646 = this.method8525();
		if (!local646.method8542(super.anInt9967)) {
			super.aBoolean776 = false;
			super.anInt9967 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IBILclient!ha;)Z")
	@Override
	public boolean method8488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		if (this.aClass245_1 == null || !this.method3533(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class92 local19 = arg2.method8078();
		@Pc(24) int local24 = super.aClass240_7.method4986();
		local19.method3858(local24);
		local19.method3851(super.anInt9925, super.anInt9915, super.anInt9917);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass62Array3.length; local39++) {
			if (super.aClass62Array3[local39] != null && (Static499.aBoolean608 ? super.aClass62Array3[local39].method7341(arg0, arg1, local19, true, 0, Static140.anInt8126) : super.aClass62Array3[local39].method7347(arg0, arg1, local19, true, 0))) {
				local37 = true;
				break;
			}
		}
		super.aClass62Array3[0] = super.aClass62Array3[1] = super.aClass62Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!iaa", name = "g", descriptor = "(Z)I")
	@Override
	protected int method8527() {
		return this.anInt3958;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZLclient!ha;)Lclient!oba;")
	@Override
	public Class261 method8507(@OriginalArg(1) Class33 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8492(@OriginalArg(0) Class33 arg0) {
		if (this.aClass245_1 == null || !super.aBoolean777 && !this.method3533(arg0, 0)) {
			return;
		}
		@Pc(26) Class92 local26 = arg0.method8078();
		local26.method3858(super.aClass240_7.method4986());
		local26.method3851(super.anInt9925, super.anInt9915 - 5, super.anInt9917);
		this.method8517(local26, super.aBoolean777, arg0, super.aClass62Array3);
		for (@Pc(53) int local53 = 0; super.aClass62Array3.length > local53; local53++) {
			super.aClass62Array3[local53] = null;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!nh;IIILclient!ka;Lclient!ha;BI)V")
	private void method3538(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class62 arg4, @OriginalArg(5) Class33 arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg2 * arg2 + arg1 * arg1;
		if (local15 < 262144 || local15 > arg3) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg2, (double) arg1) * 2607.5945876176133D - (double) super.aClass240_7.method4986()) & 0x3FFF;
		@Pc(51) Class62 local51 = Static238.method3428(super.anInt9948, super.anInt9954, arg6, local39, arg5, super.anInt9978);
		if (local51 != null) {
			arg5.C(false);
			local51.method7335(arg0, (Class3_Sub4) null, 0);
			arg5.C(true);
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!gda;Lclient!ha;IIZII)V")
	@Override
	public void method8491(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class3_Sub6 method8502(@OriginalArg(1) Class33 arg0) {
		if (this.aClass245_1 == null || !this.method3533(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class92 local19 = arg0.method8078();
		@Pc(24) int local24 = super.aClass240_7.method4986();
		local19.method3858(local24);
		@Pc(42) Class73 local42 = Static267.aClass73ArrayArrayArray2[super.aByte141][super.anInt9925 >> Static273.anInt4424][super.anInt9917 >> Static273.anInt4424];
		if (local42 == null || local42.aClass3_Sub1_Sub5_1 == null) {
			super.anInt9962 = (int) ((float) super.anInt9962 - (float) super.anInt9962 / 10.0F);
		} else {
			@Pc(63) int local63 = super.anInt9962 - local42.aClass3_Sub1_Sub5_1.aShort105;
			super.anInt9962 = (int) ((float) super.anInt9962 - (float) local63 / 10.0F);
		}
		local19.method3851(super.anInt9925, super.anInt9915 - super.anInt9962 - 20, super.anInt9917);
		@Pc(104) Class3_Sub6 local104 = null;
		super.aBoolean778 = false;
		if (Static124.aClass4_Sub20_4.aClass8_Sub19_1.method6698() == 1) {
			@Pc(119) Class377 local119 = this.method8525();
			if (local119.aBoolean780 && (this.aClass245_1.anInt5763 == -1 || Static255.aClass380_1.method8596(this.aClass245_1.anInt5763).aBoolean696)) {
				@Pc(154) Class124 local154 = super.anInt9981 != -1 && super.anInt9934 == 0 ? Static99.aClass2_1.method22(super.anInt9981) : null;
				@Pc(174) Class124 local174 = super.anInt9967 == -1 || this.aBoolean295 || super.aBoolean776 && local154 != null ? null : Static99.aClass2_1.method22(super.anInt9967);
				@Pc(206) Class62 local206 = Static430.method5938(super.anInt9948, 160, super.aClass62Array3[0], 0, local174 == null ? local154 : local174, arg0, local174 == null ? super.anInt9960 : super.anInt9973, 240, super.anInt9954, local24, super.anInt9978, 1, 0);
				if (local206 != null) {
					local104 = Static665.method8806(super.aClass62Array3.length + 1, true);
					super.aBoolean778 = true;
					arg0.C(false);
					if (Static499.aBoolean608) {
						local206.method7332(local19, local104.aClass3_Sub4Array1[super.aClass62Array3.length], Static140.anInt8126, 0);
					} else {
						local206.method7335(local19, local104.aClass3_Sub4Array1[super.aClass62Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(259) int local259;
		if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 == this) {
			for (local259 = Static9.aClass82Array41.length - 1; local259 >= 0; local259--) {
				@Pc(265) Class82 local265 = Static9.aClass82Array41[local259];
				if (local265 != null && local265.anInt2229 != -1) {
					@Pc(297) int local297;
					if (local265.anInt2225 == 1) {
						@Pc(285) Class4_Sub45 local285 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local265.anInt2224);
						if (local285 != null) {
							@Pc(290) Class3_Sub1_Sub2_Sub2_Sub2 local290 = local285.aClass3_Sub1_Sub2_Sub2_Sub2_2;
							local297 = local290.anInt9925 - Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925;
							@Pc(304) int local304 = local290.anInt9917 - Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917;
							if (Static499.aBoolean608) {
								this.method3535(Static140.anInt8126, local265.anInt2229, 92160000, arg0, local19, local297, local304, super.aClass62Array3[0]);
							} else {
								this.method3538(local19, local304, local297, 92160000, super.aClass62Array3[0], arg0, local265.anInt2229);
							}
						}
					}
					@Pc(354) int local354;
					if (local265.anInt2225 == 2) {
						@Pc(348) int local348 = local265.anInt2227 - Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925;
						local354 = local265.anInt2233 - Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917;
						local297 = local265.anInt2232 << 9;
						local297 *= local297;
						if (Static499.aBoolean608) {
							this.method3535(Static140.anInt8126, local265.anInt2229, local297, arg0, local19, local348, local354, super.aClass62Array3[0]);
						} else {
							this.method3538(local19, local354, local348, local297, super.aClass62Array3[0], arg0, local265.anInt2229);
						}
					}
					if (local265.anInt2225 == 10 && local265.anInt2224 >= 0 && local265.anInt2224 < Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20.length) {
						@Pc(422) Class3_Sub1_Sub2_Sub2_Sub1 local422 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local265.anInt2224];
						if (local422 != null) {
							local354 = local422.anInt9925 - Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925;
							local297 = local422.anInt9917 - Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917;
							if (Static499.aBoolean608) {
								this.method3535(Static140.anInt8126, local265.anInt2229, 92160000, arg0, local19, local354, local297, super.aClass62Array3[0]);
							} else {
								this.method3538(local19, local297, local354, 92160000, super.aClass62Array3[0], arg0, local265.anInt2229);
							}
						}
					}
				}
			}
			local19.method3858(local24);
			local19.method3851(super.anInt9925, super.anInt9915, super.anInt9917);
		}
		local19.method3858(local24);
		local19.method3851(super.anInt9925, super.anInt9915 - super.anInt9962 - 5, super.anInt9917);
		if (local104 == null) {
			local104 = Static665.method8806(super.aClass62Array3.length, true);
		}
		this.method8517(local19, false, arg0, super.aClass62Array3);
		if (Static499.aBoolean608) {
			for (local259 = 0; local259 < super.aClass62Array3.length; local259++) {
				if (super.aClass62Array3[local259] != null) {
					super.aClass62Array3[local259].method7332(local19, local104.aClass3_Sub4Array1[local259], Static140.anInt8126, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 == this ? 1 : 0);
				}
			}
		} else {
			for (local259 = 0; super.aClass62Array3.length > local259; local259++) {
				if (super.aClass62Array3[local259] != null) {
					super.aClass62Array3[local259].method7335(local19, local104.aClass3_Sub4Array1[local259], Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass3_Sub7_8 != null) {
			@Pc(592) Class9 local592 = super.aClass3_Sub7_8.method7301();
			if (Static499.aBoolean608) {
				arg0.method8094(local592, Static140.anInt8126);
			} else {
				arg0.method8085(local592);
			}
		}
		for (local259 = 0; local259 < super.aClass62Array3.length; local259++) {
			if (super.aClass62Array3[local259] != null) {
				super.aBoolean778 |= super.aClass62Array3[local259].F();
			}
			super.aClass62Array3[local259] = null;
		}
		super.anInt9958 = Static472.anInt7502;
		return local104;
	}
}
