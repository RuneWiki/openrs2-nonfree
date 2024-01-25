import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class9_Sub2_Sub1_Sub2_Sub1 extends Class9_Sub2_Sub1_Sub2 {

	@OriginalMember(owner = "client!cea", name = "Qc", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!cea", name = "Xc", descriptor = "I")
	public int anInt1290;

	@OriginalMember(owner = "client!cea", name = "yd", descriptor = "Ljava/lang/String;")
	public String aString6;

	@OriginalMember(owner = "client!cea", name = "Id", descriptor = "I")
	private int anInt1317;

	@OriginalMember(owner = "client!cea", name = "Nd", descriptor = "I")
	public int anInt1321;

	@OriginalMember(owner = "client!cea", name = "Rd", descriptor = "Lclient!wh;")
	public Class375 aClass375_1;

	@OriginalMember(owner = "client!cea", name = "jd", descriptor = "B")
	private byte aByte30 = 0;

	@OriginalMember(owner = "client!cea", name = "dd", descriptor = "I")
	public int anInt1295 = -1;

	@OriginalMember(owner = "client!cea", name = "td", descriptor = "I")
	public int anInt1306 = 0;

	@OriginalMember(owner = "client!cea", name = "Tc", descriptor = "I")
	public int anInt1286 = -1;

	@OriginalMember(owner = "client!cea", name = "hd", descriptor = "Z")
	public boolean aBoolean78 = false;

	@OriginalMember(owner = "client!cea", name = "gd", descriptor = "I")
	public int anInt1297 = -1;

	@OriginalMember(owner = "client!cea", name = "rd", descriptor = "B")
	private byte aByte32 = 0;

	@OriginalMember(owner = "client!cea", name = "qd", descriptor = "I")
	public int anInt1304 = 255;

	@OriginalMember(owner = "client!cea", name = "Rc", descriptor = "I")
	public int anInt1284 = 0;

	@OriginalMember(owner = "client!cea", name = "Uc", descriptor = "I")
	public int anInt1287 = 0;

	@OriginalMember(owner = "client!cea", name = "Fd", descriptor = "Z")
	public boolean aBoolean81 = false;

	@OriginalMember(owner = "client!cea", name = "Cd", descriptor = "Z")
	public boolean aBoolean80 = false;

	@OriginalMember(owner = "client!cea", name = "Bd", descriptor = "I")
	public int anInt1312 = -1;

	@OriginalMember(owner = "client!cea", name = "Od", descriptor = "I")
	public int anInt1322 = -1;

	@OriginalMember(owner = "client!cea", name = "Ld", descriptor = "I")
	public int anInt1319 = -1;

	@OriginalMember(owner = "client!cea", name = "Hd", descriptor = "I")
	public int anInt1316 = 0;

	@OriginalMember(owner = "client!cea", name = "Sd", descriptor = "I")
	public int anInt1324 = 0;

	@OriginalMember(owner = "client!cea", name = "Td", descriptor = "I")
	public int anInt1325 = -1;

	@OriginalMember(owner = "client!cea", name = "od", descriptor = "B")
	private byte aByte31 = 0;

	@OriginalMember(owner = "client!cea", name = "Ed", descriptor = "I")
	public int anInt1314 = -1;

	@OriginalMember(owner = "client!cea", name = "fd", descriptor = "Z")
	public boolean aBoolean77 = false;

	@OriginalMember(owner = "client!cea", name = "Kd", descriptor = "Z")
	public boolean aBoolean82 = false;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILclient!ka;IBLclient!ih;IILclient!ha;I)V")
	private void method1148(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class82 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg0 * arg0 + arg5 * arg5;
		if (local11 < 262144 || arg4 < local11) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg5, (double) arg0) * 2607.5945876176133D - (double) super.aClass191_7.method5071()) & 0x3FFF;
		@Pc(59) Class75 local59 = Static481.method7110(arg6, super.anInt10202, super.anInt10223, local39, arg7, super.anInt10210);
		if (local59 != null) {
			arg6.C(false);
			local59.method6788(arg3, (Class9_Sub5) null, arg2, 0);
			arg6.C(true);
		}
	}

	@OriginalMember(owner = "client!cea", name = "m", descriptor = "(I)V")
	@Override
	public void method8612() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8610() {
		return false;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILclient!ha;Z)Z")
	private boolean method1149(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class176 local11 = this.method8633();
		@Pc(29) Class267 local29 = super.anInt10193 != -1 && super.anInt10219 == 0 ? Static474.aClass264_2.method6574(super.anInt10193) : null;
		@Pc(50) Class267 local50 = super.anInt10211 == -1 || this.aBoolean82 || super.aBoolean773 && local29 != null ? null : Static474.aClass264_2.method6574(super.anInt10211);
		@Pc(53) int local53 = local11.anInt5195;
		@Pc(56) int local56 = local11.anInt5226;
		if (local53 != 0 || local56 != 0 || local11.anInt5207 != 0 || local11.anInt5194 != 0) {
			arg0 |= 0x7;
		}
		@Pc(81) int local81 = super.aClass191_7.method5071();
		@Pc(107) boolean local107 = super.aByte131 != 0 && Static304.anInt8391 >= super.anInt10207 && Static304.anInt8391 < super.anInt10184;
		if (local107) {
			arg0 |= 0x80000;
		}
		@Pc(151) Class75 local151 = super.aClass75Array3[0] = this.aClass375_1.method8541(Static474.aClass264_2, local29, Static298.aClass132_1, arg1, local81, arg0, super.anInt10189, Static54.aClass22_1, super.anInt10214, super.anIntArray667, super.anInt10224, local50, super.anInt10195, super.anInt10175, Static61.aClass119_1, Static153.aClass2_1, super.aClass140Array3, super.anInt10192, Static183.aClass285_1);
		@Pc(154) int local154 = Static545.method7842();
		if (Static248.anInt4899 < 96 && local154 > 50) {
			Static407.method6327();
		}
		if (Static508.aClass220_11 != Static38.aClass220_2 && local154 < 50) {
			@Pc(187) int local187 = 50 - local154;
			while (Static65.anInt1307 < local187) {
				Static603.aByteArrayArray27[Static65.anInt1307] = new byte[102400];
				Static65.anInt1307++;
			}
			while (local187 < Static65.anInt1307) {
				Static65.anInt1307--;
				Static603.aByteArrayArray27[Static65.anInt1307] = null;
			}
		} else if (Static508.aClass220_11 != Static38.aClass220_2) {
			Static65.anInt1307 = 0;
			Static603.aByteArrayArray27 = new byte[50][];
		}
		if (local151 == null) {
			return false;
		}
		super.anInt10216 = local151.fa();
		super.anInt10229 = local151.ma();
		this.method8628(local151);
		if (local53 == 0 && local56 == 0) {
			this.method8629(0, local81, this.method8619() << 9, 0, this.method8619() << 9);
		} else {
			this.method8629(local11.anInt5216, local81, local56, local11.anInt5228, local53);
			if (super.anInt10210 != 0) {
				local151.FA(super.anInt10210);
			}
			if (super.anInt10223 != 0) {
				local151.VA(super.anInt10223);
			}
			if (super.anInt10202 != 0) {
				local151.H(0, super.anInt10202, 0);
			}
		}
		if (local107) {
			local151.method6792(super.aByte132, super.aByte130, super.aByte133, super.aByte131 & 0xFF);
		}
		if (!this.aBoolean82) {
			this.method8624(local53, local7, local11, local81, arg1, local56);
		}
		return true;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILclient!ha;IB)Z")
	@Override
	public boolean method8605(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass375_1 == null || !this.method1149(131072, arg1)) {
			return false;
		}
		@Pc(19) Class31 local19 = arg1.method6125();
		@Pc(24) int local24 = super.aClass191_7.method5071();
		local19.method7933(local24);
		local19.method7930(super.anInt10152, super.anInt10154, super.anInt10158);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass75Array3.length > local39; local39++) {
			if (super.aClass75Array3[local39] != null && (Static40.aBoolean34 ? super.aClass75Array3[local39].method6800(arg0, arg2, local19, true, 0, Static562.anInt9327) : super.aClass75Array3[local39].method6804(arg0, arg2, local19, true, 0))) {
				local37 = true;
				break;
			}
		}
		super.aClass75Array3[0] = super.aClass75Array3[1] = super.aClass75Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BBII)V")
	public void method1152(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt10236 < 9) {
			super.anInt10236++;
		}
		for (@Pc(18) int local18 = super.anInt10236; local18 > 0; local18--) {
			super.anIntArray675[local18] = super.anIntArray675[local18 - 1];
			super.anIntArray676[local18] = super.anIntArray676[local18 - 1];
			super.aByteArray107[local18] = super.aByteArray107[local18 - 1];
		}
		super.anIntArray675[0] = arg1;
		super.anIntArray676[0] = arg2;
		super.aByteArray107[0] = arg0;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLclient!ha;ZILclient!uq;II)V")
	@Override
	public void method8609(@OriginalArg(1) Class82 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "(B)I")
	@Override
	protected int method8620() {
		return this.anInt1317;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(III)V")
	public void method1153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anIntArray675[0] = arg0;
		super.anInt10235 = 0;
		super.anInt10236 = 0;
		super.anInt10234 = 0;
		super.anIntArray676[0] = arg1;
		@Pc(26) int local26 = this.method8619();
		super.anInt10158 = local26 * 256 + super.anIntArray676[0] * 512;
		super.anInt10152 = local26 * 256 + super.anIntArray675[0] * 512;
		if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 == this) {
			Static183.method2986();
		}
		if (super.aClass9_Sub8_8 != null) {
			super.aClass9_Sub8_8.method5937();
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BIBI)V")
	public void method1155(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt10193 != -1 && Static474.aClass264_2.method6574(super.anInt10193).anInt7571 == 1) {
			super.anInt10193 = -1;
			super.anIntArray666 = null;
		}
		for (@Pc(34) int local34 = 0; super.aClass380Array3.length > local34; local34++) {
			if (super.aClass380Array3[local34].anInt10136 != -1) {
				@Pc(52) Class207 local52 = Static266.aClass135_1.method3108(super.aClass380Array3[local34].anInt10136);
				if (local52.aBoolean457 && local52.anInt6225 != -1 && Static474.aClass264_2.method6574(local52.anInt6225).anInt7571 == 1) {
					super.aClass380Array3[local34].anInt10136 = -1;
				}
			}
		}
		this.anInt1295 = -1;
		if (arg0 < 0 || arg0 >= Static399.anInt7121 || arg2 < 0 || Static24.anInt345 <= arg2) {
			this.method1153(arg0, arg2);
		} else if (super.anIntArray675[0] >= 0 && Static399.anInt7121 > super.anIntArray675[0] && super.anIntArray676[0] >= 0 && super.anIntArray676[0] < Static24.anInt345) {
			if (arg1 == 2) {
				Static564.method7988(this, arg0, arg2);
			}
			this.method1152(arg1, arg0, arg2);
		} else {
			this.method1153(arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(Lclient!ha;B)Lclient!iha;")
	@Override
	public Class160 method8604(@OriginalArg(0) Class82 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Z)I")
	@Override
	public int method8627() {
		return -1;
	}

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)Z")
	public boolean method1156() {
		return this.aClass375_1 != null;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIILclient!ha;ILclient!ka;Lclient!ih;)V")
	private void method1157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class82 arg4, @OriginalArg(6) Class75 arg5, @OriginalArg(7) Class31 arg6) {
		@Pc(17) int local17 = arg0 * arg0 + arg1 * arg1;
		if (local17 < 262144 || local17 > arg2) {
			return;
		}
		@Pc(47) int local47 = (int) (Math.atan2((double) arg1, (double) arg0) * 2607.5945876176133D - (double) super.aClass191_7.method5071()) & 0x3FFF;
		@Pc(59) Class75 local59 = Static481.method7110(arg4, super.anInt10202, super.anInt10223, local47, arg3, super.anInt10210);
		if (local59 != null) {
			arg4.C(false);
			local59.method6799(arg6, (Class9_Sub5) null, 0);
			arg4.C(true);
		}
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(ILclient!dc;)V")
	public void method1158(@OriginalArg(1) Class3_Sub9 arg0) {
		arg0.anInt6453 = 0;
		@Pc(12) int local12 = arg0.method5633();
		this.aByte32 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean78;
		this.aBoolean78 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(45) int local45 = super.method8619();
		this.method8630((local12 >> 3 & 0x7) + 1);
		this.aByte30 = (byte) (local12 >> 6 & 0x3);
		super.anInt10152 += this.method8619() - local45 << 8;
		super.anInt10158 += this.method8619() - local45 << 8;
		this.aByte31 = arg0.method5619();
		this.anInt1325 = arg0.method5619();
		this.anInt1314 = arg0.method5619();
		this.aBoolean77 = arg0.method5619() == 1;
		if (Static508.aClass220_11 == Static38.aClass220_2 && Static544.anInt9130 >= 2) {
			this.aBoolean77 = false;
		}
		this.anInt1287 = 0;
		@Pc(130) int local130 = -1;
		@Pc(133) int[] local133 = new int[12];
		@Pc(153) int local153;
		@Pc(160) int local160;
		@Pc(201) int local201;
		for (@Pc(135) int local135 = 0; local135 < 12; local135++) {
			@Pc(141) int local141 = arg0.method5633();
			if (local141 == 0) {
				local133[local135] = 0;
			} else {
				local153 = arg0.method5633();
				local160 = (local141 << 8) + local153;
				if (local135 == 0 && local160 == 65535) {
					local130 = arg0.method5610();
					this.anInt1287 = arg0.method5633();
					break;
				}
				if (local160 >= 32768) {
					local160 = Static99.anIntArray494[local160 - 32768];
					local133[local135] = local160 | 0x40000000;
					local201 = Static298.aClass132_1.method3062(local160).anInt7398;
					if (local201 != 0) {
						this.anInt1287 = local201;
					}
				} else {
					local133[local135] = local160 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(226) int[] local226 = new int[5];
		for (local153 = 0; local153 < 5; local153++) {
			local160 = arg0.method5633();
			if (Static461.aShortArrayArrayArray4.length < 1 || local160 < 0 || Static461.aShortArrayArrayArray4[0][local153].length <= local160) {
				local160 = 0;
			}
			local226[local153] = local160;
		}
		this.anInt1317 = arg0.method5610();
		this.aString6 = arg0.method5607();
		this.aString5 = this.aString6;
		if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 == this) {
			Static69.aString7 = this.aString6;
		}
		this.anInt1306 = arg0.method5633();
		if (local41) {
			this.anInt1316 = arg0.method5610();
			this.anInt1297 = -1;
			if (this.anInt1316 == 65535) {
				this.anInt1316 = -1;
			}
			this.anInt1284 = this.anInt1306;
		} else {
			this.anInt1316 = 0;
			this.anInt1284 = arg0.method5633();
			this.anInt1297 = arg0.method5633();
			if (this.anInt1297 == 255) {
				this.anInt1297 = -1;
			}
		}
		local160 = this.anInt1324;
		this.anInt1324 = arg0.method5633();
		@Pc(359) int local359;
		if (this.anInt1324 == 0) {
			Static422.method6652(this);
		} else {
			local201 = this.anInt1322;
			@Pc(356) int local356 = this.anInt1319;
			local359 = this.anInt1312;
			@Pc(362) int local362 = this.anInt1286;
			@Pc(365) int local365 = this.anInt1304;
			this.anInt1322 = arg0.method5610();
			this.anInt1319 = arg0.method5610();
			this.anInt1312 = arg0.method5610();
			this.anInt1286 = arg0.method5610();
			this.anInt1304 = arg0.method5633();
			if (this.aBoolean78 != local21 || this.anInt1324 != local160 || this.anInt1322 != local201 || this.anInt1319 != local356 || local359 != this.anInt1312 || this.anInt1286 != local362 || this.anInt1304 != local365) {
				Static352.method5772(this);
			}
		}
		if (this.aClass375_1 == null) {
			this.aClass375_1 = new Class375();
		}
		local201 = this.aClass375_1.anInt10071;
		@Pc(453) int[] local453 = this.aClass375_1.anIntArray657;
		this.aClass375_1.method8540(local130, this.method8620(), this.aByte32 == 1, local226, local133);
		if (local201 != local130) {
			super.anInt10152 = (super.anIntArray675[0] << 9) + (this.method8619() << 8);
			super.anInt10158 = (super.anIntArray676[0] << 9) + (this.method8619() << 8);
		}
		if (Static54.anInt1032 == super.anInt10204 && local453 != null) {
			for (local359 = 0; local359 < local226.length; local359++) {
				if (local453[local359] != local226[local359]) {
					Static298.aClass132_1.method3064();
					break;
				}
			}
		}
		if (super.aClass9_Sub8_8 != null) {
			super.aClass9_Sub8_8.method5937();
		}
		if (super.anInt10211 == -1 || !super.aBoolean773) {
			return;
		}
		@Pc(577) Class176 local577 = this.method8633();
		if (!local577.method4477(super.anInt10211)) {
			super.anInt10211 = -1;
			super.aBoolean773 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method1159() {
		return this.aString5;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8600(@OriginalArg(1) Class82 arg0) {
		if (this.aClass375_1 == null || !super.aBoolean775 && !this.method1149(0, arg0)) {
			return;
		}
		@Pc(22) Class31 local22 = arg0.method6125();
		local22.method7933(super.aClass191_7.method5071());
		local22.method7930(super.anInt10152, super.anInt10154 - 5, super.anInt10158);
		this.method8623(arg0, super.aClass75Array3, super.aBoolean775, local22);
		for (@Pc(55) int local55 = 0; super.aClass75Array3.length > local55; local55++) {
			super.aClass75Array3[local55] = null;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!ha;I)Lclient!ua;")
	@Override
	public Class9_Sub10 method8603(@OriginalArg(0) Class82 arg0) {
		if (this.aClass375_1 == null || !this.method1149(2048, arg0)) {
			return null;
		}
		@Pc(19) Class31 local19 = arg0.method6125();
		@Pc(24) int local24 = super.aClass191_7.method5071();
		local19.method7933(local24);
		@Pc(42) Class351 local42 = Static567.aClass351ArrayArrayArray4[super.aByte127][super.anInt10152 >> Static485.anInt8241][super.anInt10158 >> Static485.anInt8241];
		if (local42 == null || local42.aClass9_Sub2_Sub4_1 == null) {
			super.anInt10172 = (int) ((float) super.anInt10172 - (float) super.anInt10172 / 10.0F);
		} else {
			@Pc(55) int local55 = super.anInt10172 - local42.aClass9_Sub2_Sub4_1.aShort93;
			super.anInt10172 = (int) ((float) super.anInt10172 - (float) local55 / 10.0F);
		}
		local19.method7930(super.anInt10152, super.anInt10154 - super.anInt10172 - 20, super.anInt10158);
		@Pc(102) Class9_Sub10 local102 = null;
		super.aBoolean776 = false;
		if (Static32.aClass3_Sub41_3.aClass7_Sub10_1.method4510() == 1) {
			@Pc(115) Class176 local115 = this.method8633();
			if (local115.aBoolean383 && (this.aClass375_1.anInt10071 == -1 || Static153.aClass2_1.method23(this.aClass375_1.anInt10071).aBoolean655)) {
				@Pc(148) Class267 local148 = super.anInt10193 != -1 && super.anInt10219 == 0 ? Static474.aClass264_2.method6574(super.anInt10193) : null;
				@Pc(169) Class267 local169 = super.anInt10211 == -1 || this.aBoolean82 || super.aBoolean773 && local148 != null ? null : Static474.aClass264_2.method6574(super.anInt10211);
				@Pc(201) Class75 local201 = Static128.method1420(super.anInt10223, 160, super.anInt10202, local24, local169 == null ? local148 : local169, local169 == null ? super.anInt10189 : super.anInt10195, 0, super.aClass75Array3[0], 1, 240, super.anInt10210, arg0, 0);
				if (local201 != null) {
					local102 = Static635.method8548(super.aClass75Array3.length + 1, true);
					super.aBoolean776 = true;
					arg0.C(false);
					if (Static40.aBoolean34) {
						local201.method6788(local19, local102.aClass9_Sub5Array1[super.aClass75Array3.length], Static562.anInt9327, 0);
					} else {
						local201.method6799(local19, local102.aClass9_Sub5Array1[super.aClass75Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(254) int local254;
		if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 == this) {
			for (local254 = Static16.aClass118Array1.length - 1; local254 >= 0; local254--) {
				@Pc(260) Class118 local260 = Static16.aClass118Array1[local254];
				if (local260 != null && local260.anInt3293 != -1) {
					@Pc(292) int local292;
					if (local260.anInt3289 == 1) {
						@Pc(280) Class3_Sub43 local280 = (Class3_Sub43) Static545.aClass25_40.method426((long) local260.anInt3290);
						if (local280 != null) {
							@Pc(285) Class9_Sub2_Sub1_Sub2_Sub2 local285 = local280.aClass9_Sub2_Sub1_Sub2_Sub2_2;
							local292 = local285.anInt10152 - Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152;
							@Pc(298) int local298 = local285.anInt10158 - Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158;
							if (Static40.aBoolean34) {
								this.method1148(local298, super.aClass75Array3[0], Static562.anInt9327, local19, 92160000, local292, arg0, local260.anInt3293);
							} else {
								this.method1157(local298, local292, 92160000, local260.anInt3293, arg0, super.aClass75Array3[0], local19);
							}
						}
					}
					@Pc(351) int local351;
					if (local260.anInt3289 == 2) {
						@Pc(344) int local344 = local260.anInt3294 - Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152;
						local351 = local260.anInt3288 - Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158;
						local292 = local260.anInt3296 << 9;
						local292 *= local292;
						if (Static40.aBoolean34) {
							this.method1148(local351, super.aClass75Array3[0], Static562.anInt9327, local19, local292, local344, arg0, local260.anInt3293);
						} else {
							this.method1157(local351, local344, local292, local260.anInt3293, arg0, super.aClass75Array3[0], local19);
						}
					}
					if (local260.anInt3289 == 10 && local260.anInt3290 >= 0 && local260.anInt3290 < Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1.length) {
						@Pc(412) Class9_Sub2_Sub1_Sub2_Sub1 local412 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local260.anInt3290];
						if (local412 != null) {
							local351 = local412.anInt10152 - Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152;
							local292 = local412.anInt10158 - Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158;
							if (Static40.aBoolean34) {
								this.method1148(local292, super.aClass75Array3[0], Static562.anInt9327, local19, 92160000, local351, arg0, local260.anInt3293);
							} else {
								this.method1157(local292, local351, 92160000, local260.anInt3293, arg0, super.aClass75Array3[0], local19);
							}
						}
					}
				}
			}
			local19.method7933(local24);
			local19.method7930(super.anInt10152, super.anInt10154, super.anInt10158);
		}
		local19.method7933(local24);
		local19.method7930(super.anInt10152, -super.anInt10172 + super.anInt10154 - 5, super.anInt10158);
		if (local102 == null) {
			local102 = Static635.method8548(super.aClass75Array3.length, true);
		}
		this.method8623(arg0, super.aClass75Array3, false, local19);
		if (Static40.aBoolean34) {
			for (local254 = 0; super.aClass75Array3.length > local254; local254++) {
				if (super.aClass75Array3[local254] != null) {
					super.aClass75Array3[local254].method6788(local19, local102.aClass9_Sub5Array1[local254], Static562.anInt9327, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 == this ? 1 : 0);
				}
			}
		} else {
			for (local254 = 0; local254 < super.aClass75Array3.length; local254++) {
				if (super.aClass75Array3[local254] != null) {
					super.aClass75Array3[local254].method6799(local19, local102.aClass9_Sub5Array1[local254], Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass9_Sub8_8 != null) {
			@Pc(592) Class162 local592 = super.aClass9_Sub8_8.method5949();
			if (Static40.aBoolean34) {
				arg0.method6107(local592, Static562.anInt9327);
			} else {
				arg0.method6161(local592);
			}
		}
		for (local254 = 0; local254 < super.aClass75Array3.length; local254++) {
			if (super.aClass75Array3[local254] != null) {
				super.aBoolean776 |= super.aClass75Array3[local254].F();
			}
			super.aClass75Array3[local254] = null;
		}
		super.anInt10209 = Static609.anInt9804;
		return local102;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method1160() {
		@Pc(7) String local7 = "";
		if (Static12.aStringArray5 != null) {
			local7 = local7 + Static12.aStringArray5[this.aByte30];
		}
		@Pc(36) int[] local36;
		if (this.aByte32 == 1 && Static295.anIntArray313 != null) {
			local36 = Static295.anIntArray313;
		} else {
			local36 = Static105.anIntArray137;
		}
		if (local36 != null && local36[this.aByte30] != -1) {
			@Pc(56) Class146 local56 = Static324.aClass307_1.method7524(local36[this.aByte30]);
			if (local56.aChar3 == 's') {
				local7 = local7 + local56.method3761(this.aByte31 & 0xFF);
			} else {
				Static296.method5075(new Throwable(), "gdn1");
				local36[this.aByte30] = -1;
			}
		}
		local7 = local7 + this.aString6;
		if (Static13.aStringArray6 != null) {
			local7 = local7 + Static13.aStringArray6[this.aByte30];
		}
		return local7;
	}

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "(B)I")
	@Override
	public int method8619() {
		return this.aClass375_1 == null || this.aClass375_1.anInt10071 == -1 ? super.method8619() : Static153.aClass2_1.method23(this.aClass375_1.anInt10071).anInt8833;
	}
}
