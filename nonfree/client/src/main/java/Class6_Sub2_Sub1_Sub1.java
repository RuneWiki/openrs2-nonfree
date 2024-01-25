import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class6_Sub2_Sub1_Sub1 extends Class6_Sub2_Sub1 {

	@OriginalMember(owner = "client!bp", name = "Kc", descriptor = "Lclient!pt;")
	public Class188 aClass188_1;

	@OriginalMember(owner = "client!bp", name = "Mc", descriptor = "I")
	public int anInt980;

	@OriginalMember(owner = "client!bp", name = "Oc", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!bp", name = "Xc", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!bp", name = "Yc", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!bp", name = "ed", descriptor = "I")
	public int anInt993;

	@OriginalMember(owner = "client!bp", name = "Fc", descriptor = "I")
	public int anInt975 = -1;

	@OriginalMember(owner = "client!bp", name = "xc", descriptor = "I")
	public int anInt967 = 0;

	@OriginalMember(owner = "client!bp", name = "Wc", descriptor = "I")
	public int anInt988 = -1;

	@OriginalMember(owner = "client!bp", name = "Bc", descriptor = "I")
	public int anInt971 = -1;

	@OriginalMember(owner = "client!bp", name = "Rc", descriptor = "I")
	public int anInt983 = -1;

	@OriginalMember(owner = "client!bp", name = "Qc", descriptor = "Z")
	public boolean aBoolean52 = false;

	@OriginalMember(owner = "client!bp", name = "Jc", descriptor = "I")
	public int anInt978 = 0;

	@OriginalMember(owner = "client!bp", name = "nd", descriptor = "I")
	public int anInt1001 = -1;

	@OriginalMember(owner = "client!bp", name = "ld", descriptor = "I")
	public int anInt999 = 0;

	@OriginalMember(owner = "client!bp", name = "Uc", descriptor = "I")
	public int anInt986 = 0;

	@OriginalMember(owner = "client!bp", name = "Sc", descriptor = "I")
	public int anInt984 = -1;

	@OriginalMember(owner = "client!bp", name = "od", descriptor = "I")
	public int anInt1002 = -1;

	@OriginalMember(owner = "client!bp", name = "rd", descriptor = "B")
	private byte aByte24 = 0;

	@OriginalMember(owner = "client!bp", name = "ad", descriptor = "B")
	private byte aByte22 = 0;

	@OriginalMember(owner = "client!bp", name = "pd", descriptor = "B")
	private byte aByte23 = 0;

	@OriginalMember(owner = "client!bp", name = "Ac", descriptor = "I")
	public int anInt970 = 0;

	@OriginalMember(owner = "client!bp", name = "td", descriptor = "Z")
	public boolean aBoolean54 = false;

	@OriginalMember(owner = "client!bp", name = "Pc", descriptor = "I")
	public int anInt982 = 255;

	@OriginalMember(owner = "client!bp", name = "vd", descriptor = "I")
	public int anInt1006 = -1;

	@OriginalMember(owner = "client!bp", name = "jd", descriptor = "Z")
	public boolean aBoolean53 = false;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIBI)V")
	public void method705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (super.anInt6147 < 9) {
			super.anInt6147++;
		}
		for (@Pc(20) int local20 = super.anInt6147; local20 > 0; local20--) {
			super.anIntArray536[local20] = super.anIntArray536[local20 - 1];
			super.anIntArray537[local20] = super.anIntArray537[local20 - 1];
			super.aByteArray69[local20] = super.aByteArray69[local20 - 1];
		}
		super.anIntArray536[0] = arg1;
		super.anIntArray537[0] = arg0;
		super.aByteArray69[0] = arg2;
	}

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "(I)V")
	@Override
	public void method5634() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	@Override
	public Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0) {
		if (this.aClass188_1 == null || !this.method712(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class116 local19 = arg0.method4678();
		@Pc(24) int local24 = super.aClass216_7.method4985();
		local19.O(local24);
		local19.ZA(super.anInt6062, super.anInt6067, super.anInt6061);
		@Pc(43) float local43 = arg0.la();
		@Pc(46) float local46 = arg0.w();
		if (Static126.aClass67_Sub1_1.aBoolean400) {
			@Pc(53) Class132 local53 = this.method4762();
			if (local53.aBoolean287 && (this.aClass188_1.anInt5620 == -1 || Static388.aClass211_1.method4931(this.aClass188_1.anInt5620).aBoolean462)) {
				@Pc(90) Class233 local90 = super.anInt6068 != -1 && super.anInt6117 == 0 ? Static269.aClass10_1.method286(super.anInt6068) : null;
				@Pc(111) Class233 local111 = super.anInt6077 == -1 || this.aBoolean53 || super.aBoolean421 && local90 != null ? null : Static269.aClass10_1.method286(super.anInt6077);
				@Pc(145) Class7 local145 = Static346.method4894(local111 == null ? local90 : local111, 1, 0, super.anInt6137, super.anInt6097, 0, super.aClass7Array3[0], super.anInt6109, local24, local111 == null ? super.anInt6091 : super.anInt6072, 240, arg0, super.lb, 160);
				if (local145 != null) {
					arg0.o(local43, local46 - 128.0F);
					arg0.method4663(false);
					local145.method4091(local19, null, 0);
					arg0.method4663(true);
				}
			}
		}
		if (Static375.aClass6_Sub2_Sub1_Sub1_3 == this) {
			arg0.o(local43, local46 - 144.0F);
			local19.R(super.anInt6062, super.anInt6067, super.anInt6061);
			for (@Pc(186) int local186 = Static118.aClass80Array1.length - 1; local186 >= 0; local186--) {
				@Pc(192) Class80 local192 = Static118.aClass80Array1[local186];
				if (local192 != null && local192.anInt2462 != -1) {
					@Pc(241) int local241;
					@Pc(234) int local234;
					if (local192.anInt2470 == 1 && local192.anInt2465 >= 0 && local192.anInt2465 < Static176.aClass6_Sub2_Sub1_Sub2Array1.length) {
						@Pc(225) Class6_Sub2_Sub1_Sub2 local225 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local192.anInt2465];
						if (local225 != null) {
							local234 = local225.anInt6062 - Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062;
							local241 = local225.anInt6061 - Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061;
							this.method707(local19, arg0, 5760000, local234, super.aClass7Array3[0], local241, local192.anInt2462);
						}
					}
					if (local192.anInt2470 == 2) {
						@Pc(270) int local270 = local192.anInt2463 + 64 - Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062;
						local234 = local192.anInt2467 + 64 - Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061;
						local241 = local192.anInt2460 << 7;
						local241 *= local241;
						this.method707(local19, arg0, local241, local270, super.aClass7Array3[0], local234, local192.anInt2462);
					}
					if (local192.anInt2470 == 10 && local192.anInt2465 >= 0 && Static171.aClass6_Sub2_Sub1_Sub1Array1.length > local192.anInt2465) {
						@Pc(327) Class6_Sub2_Sub1_Sub1 local327 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local192.anInt2465];
						if (local327 != null) {
							local234 = local327.anInt6062 - Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062;
							local241 = local327.anInt6061 - Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061;
							this.method707(local19, arg0, 5760000, local234, super.aClass7Array3[0], local241, local192.anInt2462);
						}
					}
				}
			}
			local19.O(local24);
			local19.ZA(super.anInt6062, super.anInt6067, super.anInt6061);
		}
		arg0.o(local43, local46);
		@Pc(386) Class41_Sub6 local386 = Static381.method5198(super.aClass7Array3.length);
		if (super.aClass41_Sub1_7 == null) {
			arg0.method4701(super.aClass7Array3, local19, local386.aClass41_Sub4Array1, Static375.aClass6_Sub2_Sub1_Sub1_3 == this ? 1 : 0);
		} else {
			@Pc(393) Class256 local393 = super.aClass41_Sub1_7.method3166();
			arg0.method4659(super.aClass7Array3, local393, local19, local386.aClass41_Sub4Array1, Static375.aClass6_Sub2_Sub1_Sub1_3 == this ? 1 : 0);
		}
		this.method4765(arg0, super.aClass7Array3, false);
		if (super.aClass7Array3[2] != null) {
			if (local24 != 0) {
				super.aClass7Array3[2].k(local24);
			}
			super.aClass7Array3[2].ja(-super.aClass4_Sub13_3.anInt2498 + super.anInt6062, -super.aClass4_Sub13_3.anInt2505 + super.anInt6067, -super.aClass4_Sub13_3.anInt2491 + super.anInt6061);
		}
		super.anInt6076 = Static203.anInt3898;
		super.aClass7Array3[0] = super.aClass7Array3[1] = super.aClass7Array3[2] = super.aClass7Array3[3] = null;
		return local386;
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)I")
	@Override
	public int method4757() {
		return -1;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method706() {
		@Pc(7) String local7 = "";
		if (Static210.aStringArray27 != null) {
			local7 = local7 + Static210.aStringArray27[this.aByte23];
		}
		@Pc(29) int[] local29;
		if (this.aByte24 == 1 && Static397.anIntArray600 != null) {
			local29 = Static397.anIntArray600;
		} else {
			local29 = Static335.anIntArray525;
		}
		if (local29 != null && local29[this.aByte23] != -1) {
			@Pc(57) Class168 local57 = Static126.aClass206_1.method4794(local29[this.aByte23]);
			if (local57.aChar4 == 's') {
				local7 = local7 + local57.method3718(this.aByte22 & 0xFF);
			} else {
				Static273.method3690("gdn1", new Throwable());
				local29[this.aByte23] = -1;
			}
		}
		local7 = local7 + this.aString12;
		if (Static434.aStringArray42 != null) {
			local7 = local7 + Static434.aStringArray42[this.aByte23];
		}
		return local7;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!ia;Lclient!qa;IILclient!c;BII)V")
	private void method707(@OriginalArg(0) Class116 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class7 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg5 * arg5 + arg3 * arg3;
		if (local11 < 16384 || arg2 < local11) {
			return;
		}
		@Pc(44) int local44 = (int) (Math.atan2((double) arg3, (double) arg5) * 2607.5945876176133D) & 0x3FFF;
		@Pc(56) Class7 local56 = Static359.method4999(super.anInt6097, arg6, arg1, super.anInt6109, local44, super.anInt6137);
		if (local56 != null) {
			arg1.method4663(false);
			local56.method4091(arg0, null, 0);
			arg1.method4663(true);
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method709() {
		return this.aString11;
	}

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "(I)I")
	@Override
	public int method4763() {
		return this.aClass188_1 == null || this.aClass188_1.anInt5620 == -1 ? super.method4763() : Static388.aClass211_1.method4931(this.aClass188_1.anInt5620).anInt6902;
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5637(@OriginalArg(1) Class30 arg0) {
		if (this.aClass188_1 != null && (super.aBoolean423 || this.method712(arg0, 0))) {
			this.method4765(arg0, super.aClass7Array3, super.aBoolean423);
			super.aClass7Array3[0] = super.aClass7Array3[1] = super.aClass7Array3[2] = super.aClass7Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILclient!qa;I)Z")
	private boolean method712(@OriginalArg(1) Class30 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class132 local11 = this.method4762();
		@Pc(26) Class233 local26 = super.anInt6068 != -1 && super.anInt6117 == 0 ? Static269.aClass10_1.method286(super.anInt6068) : null;
		@Pc(47) Class233 local47 = super.anInt6077 == -1 || this.aBoolean53 || super.aBoolean421 && local26 != null ? null : Static269.aClass10_1.method286(super.anInt6077);
		@Pc(50) int local50 = local11.anInt3733;
		@Pc(53) int local53 = local11.anInt3734;
		if (local50 != 0 || local53 != 0 || local11.anInt3741 != 0 || local11.anInt3744 != 0) {
			arg1 |= 0x7;
		}
		@Pc(102) boolean local102 = super.aByte88 != 0 && Static175.anInt3261 >= super.anInt6075 && Static175.anInt3261 < super.anInt6114;
		if (local102) {
			arg1 |= 0x80000;
		}
		@Pc(143) Class7 local143 = super.aClass7Array3[0] = this.aClass188_1.method4321(super.anInt6072, Static8.aClass226_1, Static155.aClass149_1, super.anInt6129, super.anInt6080, Static116.aClass50_1, arg1, arg0, super.anInt6089, super.anInt6088, Static390.aClass204_2, super.aClass109Array3, local47, Static388.aClass211_1, Static269.aClass10_1, local26, super.anInt6091);
		@Pc(146) int local146 = Static316.method4644();
		if (Static346.anInt6291 < 96 && local146 > 50) {
			Static124.method1884();
		}
		@Pc(179) int local179;
		if (Static130.aClass239_4 != Static427.aClass239_7 && local146 < 50) {
			local179 = 50 - local146;
			while (local179 > Static333.anInt5829) {
				Static190.aByteArrayArray5[Static333.anInt5829] = new byte[102400];
				Static333.anInt5829++;
			}
			while (Static333.anInt5829 > local179) {
				Static333.anInt5829--;
				Static190.aByteArrayArray5[Static333.anInt5829] = null;
			}
		} else if (Static427.aClass239_7 != Static130.aClass239_4) {
			Static333.anInt5829 = 0;
			Static190.aByteArrayArray5 = new byte[50][];
		}
		if (local143 == null) {
			return false;
		}
		super.anInt6099 = local143.b();
		this.method4758(local143);
		local179 = super.aClass216_7.method4985();
		if (local50 == 0 && local53 == 0) {
			this.method4767(this.method4763() << 7, 0, this.method4763() << 7, 0, local179);
		} else {
			this.method4767(local50, local11.anInt3753, local53, local11.anInt3765, local179);
			if (super.anInt6109 != 0) {
				local143.WA(super.anInt6109);
			}
			if (super.anInt6137 != 0) {
				local143.o(super.anInt6137);
			}
			if (super.anInt6097 != 0) {
				local143.ja(0, super.anInt6097, 0);
			}
		}
		if (local102) {
			local143.method4087(super.aByte87, super.aByte89, super.aByte90, super.aByte88 & 0xFF);
		}
		@Pc(340) Class161 local340;
		@Pc(352) boolean local352;
		@Pc(354) int local354;
		@Pc(394) Class7 local394;
		if (this.aBoolean53 || super.anInt6120 == -1 || super.anInt6082 == -1) {
			super.aClass7Array3[1] = null;
		} else {
			local340 = Static92.aClass89_1.method1918(super.anInt6120);
			local352 = local340.aByte75 == 3 && (local50 != 0 || local53 != 0);
			local354 = local7;
			if (local352) {
				local354 = local7 | 0x7;
			} else {
				if (super.anInt6083 != 0) {
					local354 = local7 | 0x5;
				}
				if (super.anInt6085 != 0) {
					local354 |= 0x2;
				}
			}
			local394 = super.aClass7Array3[1] = local340.method3587(super.anInt6118, super.anInt6082, local354, super.anInt6135, arg0, Static269.aClass10_1);
			if (local394 != null) {
				if (super.anInt6085 != 0) {
					local394.ja(0, -super.anInt6085 << 0, 0);
				}
				if (super.anInt6083 != 0) {
					local394.k(super.anInt6083 * 2048);
				}
				if (local352) {
					if (super.anInt6109 != 0) {
						local394.WA(super.anInt6109);
					}
					if (super.anInt6137 != 0) {
						local394.o(super.anInt6137);
					}
					if (super.anInt6097 != 0) {
						local394.ja(0, super.anInt6097, 0);
					}
				}
			}
		}
		if (this.aBoolean53 || super.anInt6084 == -1 || super.anInt6124 == -1) {
			super.aClass7Array3[3] = null;
		} else {
			local340 = Static92.aClass89_1.method1918(super.anInt6084);
			local352 = local340.aByte75 == 3 && (local50 != 0 || local53 != 0);
			local354 = local7;
			if (local352) {
				local354 = local7 | 0x7;
			} else {
				if (super.anInt6069 != 0) {
					local354 = local7 | 0x5;
				}
				if (super.anInt6125 != 0) {
					local354 |= 0x2;
				}
			}
			local394 = super.aClass7Array3[3] = local340.method3586(arg0, super.anInt6128, super.anInt6100, local354, super.anInt6124, Static269.aClass10_1);
			if (local394 != null) {
				if (super.anInt6125 != 0) {
					local394.ja(0, -super.anInt6125 << 0, 0);
				}
				if (super.anInt6069 != 0) {
					local394.k(super.anInt6069 * 2048);
				}
				if (local352) {
					if (super.anInt6109 != 0) {
						local394.WA(super.anInt6109);
					}
					if (super.anInt6137 != 0) {
						local394.o(super.anInt6137);
					}
					if (super.anInt6097 != 0) {
						local394.ja(0, super.anInt6097, 0);
					}
				}
			}
		}
		super.aClass7Array3[2] = null;
		if (!this.aBoolean53 && super.aClass4_Sub13_3 != null) {
			if (super.aClass4_Sub13_3.anInt2487 <= Static175.anInt3261) {
				super.aClass4_Sub13_3 = null;
			} else if (super.aClass4_Sub13_3.anInt2496 <= Static175.anInt3261) {
				@Pc(630) Class7 local630 = super.aClass4_Sub13_3.method1860(arg0, local7 | 0x7);
				if (local630 != null) {
					local630.ja(-super.anInt6062 + super.aClass4_Sub13_3.anInt2498, super.aClass4_Sub13_3.anInt2505 - super.anInt6067, -super.anInt6061 + super.aClass4_Sub13_3.anInt2491);
					if (local179 != 0) {
						local630.k(-local179 & 0x3FFF);
					}
					super.aClass7Array3[2] = local630;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BIII)V")
	public void method713(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6068 != -1 && Static269.aClass10_1.method286(super.anInt6068).anInt6744 == 1) {
			super.anInt6068 = -1;
		}
		@Pc(37) Class161 local37;
		if (super.anInt6120 != -1) {
			local37 = Static92.aClass89_1.method1918(super.anInt6120);
			if (local37.aBoolean340 && local37.anInt4699 != -1 && Static269.aClass10_1.method286(local37.anInt4699).anInt6744 == 1) {
				super.anInt6120 = -1;
			}
		}
		if (super.anInt6084 != -1) {
			local37 = Static92.aClass89_1.method1918(super.anInt6084);
			if (local37.aBoolean340 && local37.anInt4699 != -1 && Static269.aClass10_1.method286(local37.anInt4699).anInt6744 == 1) {
				super.anInt6084 = -1;
			}
		}
		this.anInt971 = -1;
		if (arg2 < 0 || Static126.anInt2569 <= arg2 || arg1 < 0 || Static190.anInt3697 <= arg1) {
			this.method715(arg2, arg1);
		} else if (super.anIntArray536[0] >= 0 && super.anIntArray536[0] < Static126.anInt2569 && super.anIntArray537[0] >= 0 && Static190.anInt3697 > super.anIntArray537[0]) {
			if (arg0 == 2) {
				Static362.method5023(arg1, this, arg2);
			}
			this.method705(arg1, arg2, arg0);
		} else {
			this.method715(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		if (this.aClass188_1 == null || !this.method712(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class116 local19 = arg2.method4678();
		@Pc(24) int local24 = super.aClass216_7.method4985();
		local19.O(local24);
		local19.ZA(super.anInt6062, super.anInt6067, super.anInt6061);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass7Array3.length > local39; local39++) {
			if (super.aClass7Array3[local39] != null && super.aClass7Array3[local39].method4082(arg0, arg1, local19, true)) {
				local37 = true;
				break;
			}
		}
		super.aClass7Array3[0] = super.aClass7Array3[1] = super.aClass7Array3[2] = super.aClass7Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "(I)Z")
	public boolean method714() {
		return this.aClass188_1 != null;
	}

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "(B)I")
	@Override
	public int method4752() {
		return super.anInt6099;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)V")
	public void method715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anInt6147 = 0;
		super.anIntArray536[0] = arg0;
		super.anInt6145 = 0;
		super.anInt6146 = 0;
		super.anIntArray537[0] = arg1;
		@Pc(35) int local35 = this.method4763();
		super.anInt6062 = super.anIntArray536[0] * 128 + local35 * 64;
		super.anInt6061 = super.anIntArray537[0] * 128 + local35 * 64;
		if (Static375.aClass6_Sub2_Sub1_Sub1_3 == this) {
			Static429.method5520();
		}
		if (super.aClass41_Sub1_7 != null) {
			super.aClass41_Sub1_7.method3161();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!qv;BLclient!qa;IZII)V")
	@Override
	public void method5636(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!tl;B)V")
	public void method716(@OriginalArg(0) Class4_Sub30 arg0) {
		arg0.anInt6244 = 0;
		@Pc(12) int local12 = arg0.method4864();
		this.aByte24 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(40) boolean local40 = (local12 & 0x4) != 0;
		@Pc(46) int local46 = super.method4763();
		this.method4761((local12 >> 3 & 0x7) + 1);
		this.aByte23 = (byte) (local12 >> 6 & 0x3);
		super.anInt6062 += this.method4763() - local46 << 6;
		super.anInt6061 += this.method4763() - local46 << 6;
		this.aByte22 = arg0.method4865();
		this.anInt1002 = arg0.method4865();
		this.anInt1001 = arg0.method4865();
		@Pc(109) int local109 = -1;
		this.anInt986 = 0;
		@Pc(115) int[] local115 = new int[12];
		@Pc(138) int local138;
		@Pc(144) int local144;
		@Pc(181) int local181;
		for (@Pc(117) int local117 = 0; local117 < 12; local117++) {
			@Pc(123) int local123 = arg0.method4864();
			if (local123 == 0) {
				local115[local117] = 0;
			} else {
				local138 = arg0.method4864();
				local144 = (local123 << 8) + local138;
				if (local117 == 0 && local144 == 65535) {
					local109 = arg0.method4877();
					this.anInt986 = arg0.method4864();
					break;
				}
				if (local144 >= 32768) {
					local144 = Static156.anIntArray249[local144 - 32768];
					local115[local117] = local144 | 0x40000000;
					local181 = Static390.aClass204_2.method4629(local144).anInt3574;
					if (local181 != 0) {
						this.anInt986 = local181;
					}
				} else {
					local115[local117] = local144 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(208) int[] local208 = new int[5];
		for (local138 = 0; local138 < 5; local138++) {
			local144 = arg0.method4864();
			if (local144 < 0 || local144 >= Static246.aShortArrayArray7[local138].length) {
				local144 = 0;
			}
			local208[local138] = local144;
		}
		this.anInt989 = arg0.method4877();
		this.aString12 = arg0.method4867();
		if (local29) {
			this.aString11 = arg0.method4867();
		} else {
			this.aString11 = this.aString12;
		}
		this.anInt967 = arg0.method4864();
		if (local40) {
			this.anInt999 = arg0.method4877();
			this.anInt970 = this.anInt967;
			this.anInt983 = -1;
		} else {
			this.anInt999 = 0;
			this.anInt970 = arg0.method4864();
			this.anInt983 = arg0.method4864();
			if (this.anInt983 == 255) {
				this.anInt983 = -1;
			}
		}
		local144 = this.anInt978;
		this.anInt978 = arg0.method4864();
		@Pc(332) int local332;
		if (this.anInt978 == 0) {
			Static421.method5483(this);
		} else {
			local181 = this.anInt1006;
			@Pc(329) int local329 = this.anInt984;
			local332 = this.anInt975;
			@Pc(335) int local335 = this.anInt988;
			@Pc(338) int local338 = this.anInt982;
			this.anInt1006 = arg0.method4877();
			this.anInt984 = arg0.method4877();
			this.anInt975 = arg0.method4877();
			this.anInt988 = arg0.method4877();
			this.anInt982 = arg0.method4864();
			if (local144 != this.anInt978 || this.anInt1006 != local181 || local329 != this.anInt984 || local332 != this.anInt975 || this.anInt988 != local335 || local338 != this.anInt982) {
				Static452.method5833(this);
			}
		}
		if (this.aClass188_1 == null) {
			this.aClass188_1 = new Class188();
		}
		local181 = this.aClass188_1.anInt5620;
		@Pc(413) int[] local413 = this.aClass188_1.anIntArray482;
		this.aClass188_1.method4326(this.method4769(), local115, local109, this.aByte24 == 1, local208);
		if (local181 != local109) {
			super.anInt6062 = (super.anIntArray536[0] << 7) + (this.method4763() << 6);
			super.anInt6061 = (super.anIntArray537[0] << 7) + (this.method4763() << 6);
		}
		if (super.anInt6078 == Static373.anInt6574 && local413 != null) {
			for (local332 = 0; local332 < local208.length; local332++) {
				if (local413[local332] != local208[local332]) {
					Static390.aClass204_2.method4630();
					break;
				}
			}
		}
		if (super.aClass41_Sub1_7 != null) {
			super.aClass41_Sub1_7.method3161();
		}
		if (super.anInt6077 == -1 || !super.aBoolean421) {
			return;
		}
		@Pc(518) Class132 local518 = this.method4762();
		if (!local518.method2832(super.anInt6077)) {
			super.anInt6077 = -1;
			super.aBoolean421 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "(I)I")
	@Override
	protected int method4769() {
		return this.anInt989;
	}

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5633() {
		return false;
	}
}
