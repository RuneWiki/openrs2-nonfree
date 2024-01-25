import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gja")
public final class Class19_Sub1_Sub3_Sub2_Sub1 extends Class19_Sub1_Sub3_Sub2 {

	@OriginalMember(owner = "client!gja", name = "jd", descriptor = "Lclient!at;")
	public Class18 aClass18_1;

	@OriginalMember(owner = "client!gja", name = "Pc", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!gja", name = "ad", descriptor = "Lclient!kja;")
	public Class208 aClass208_1;

	@OriginalMember(owner = "client!gja", name = "Nc", descriptor = "I")
	public int anInt4146;

	@OriginalMember(owner = "client!gja", name = "Uc", descriptor = "I")
	public int anInt4137 = -1;

	@OriginalMember(owner = "client!gja", name = "Qc", descriptor = "I")
	public int anInt4136 = 1;

	@OriginalMember(owner = "client!gja", name = "Tc", descriptor = "I")
	public int anInt4145 = 1;

	@OriginalMember(owner = "client!gja", name = "Yc", descriptor = "I")
	public int anInt4140 = -1;

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "()V")
	public Class19_Sub1_Sub3_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(I)V")
	public Class19_Sub1_Sub3_Sub2_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gja", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9368() {
		return false;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(ZILclient!ha;IILclient!bla;I)V")
	@Override
	public void method9373(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19_Sub1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gja", name = "i", descriptor = "(B)Z")
	private boolean method3433() {
		return this.aClass18_1.aBoolean17;
	}

	@OriginalMember(owner = "client!gja", name = "d", descriptor = "(I)I")
	@Override
	public int method9362() {
		return this.aClass18_1 == null ? 0 : this.aClass18_1.anInt438;
	}

	@OriginalMember(owner = "client!gja", name = "f", descriptor = "(B)V")
	@Override
	public void method9367() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method9369(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass18_1 == null || !this.method3440(arg1, 131072)) {
			return false;
		}
		@Pc(33) Class181 local33 = arg1.method7693();
		@Pc(38) int local38 = super.aClass340_7.method8085();
		local33.method6344(local38);
		local33.method6354(super.anInt11204, super.anInt11208, super.anInt11211);
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; super.aClass157Array3.length > local53; local53++) {
			if (super.aClass157Array3[local53] != null) {
				@Pc(84) boolean var10000;
				label50: {
					if (this.aClass18_1.anInt438 <= 0) {
						label48: {
							if (this.aClass18_1.anInt436 == -1) {
								if (this.aClass18_1.anInt437 == 1) {
									break label48;
								}
								var10000 = false;
							} else {
								if (this.aClass18_1.anInt436 == 1) {
									break label48;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label50;
							}
						}
					}
					var10000 = true;
				}
				@Pc(100) boolean local100 = var10000;
				@Pc(116) boolean local116;
				if (Static568.aBoolean784) {
					local116 = super.aClass157Array3[local53].method5221(arg2, arg0, local33, local100, this.aClass18_1.anInt438, Static705.anInt11029);
				} else {
					local116 = super.aClass157Array3[local53].method5218(arg2, arg0, local33, local100, this.aClass18_1.anInt438);
				}
				if (local116) {
					local51 = true;
					break;
				}
			}
		}
		for (@Pc(145) int local145 = 0; super.aClass157Array3.length > local145; local145++) {
			super.aClass157Array3[local145] = null;
		}
		return local51;
	}

	@OriginalMember(owner = "client!gja", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method6591() {
		return Static224.aClass84_1.aBoolean206;
	}

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "(B)I")
	@Override
	public int method6583() {
		if (this.aClass18_1.anIntArray23 != null) {
			@Pc(20) Class18 local20 = this.aClass18_1.method407(Static577.aClass362_1);
			if (local20 != null && local20.anInt459 != -1) {
				return local20.anInt459;
			}
		}
		return this.aClass18_1.anInt459 == -1 ? super.method6583() : this.aClass18_1.anInt459;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lclient!at;I)V")
	public void method3434(@OriginalArg(0) Class18 arg0) {
		if (this.aClass18_1 != arg0 && Static555.aBoolean678 && Static627.method8490(super.anInt7796)) {
			Static49.method652();
		}
		this.aClass18_1 = arg0;
		if (this.aClass18_1 != null) {
			this.aString69 = this.aClass18_1.aString6;
			this.anInt4146 = this.aClass18_1.anInt431;
		}
		if (super.aClass19_Sub9_7 != null) {
			super.aClass19_Sub9_7.method6769();
		}
	}

	@OriginalMember(owner = "client!gja", name = "c", descriptor = "(III)V")
	public void method3435(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray430[0];
		@Pc(15) int local15 = super.lb[0];
		if (arg0 == 0) {
			local15++;
		}
		if (arg0 == 1) {
			local10++;
			local15++;
		}
		if (arg0 == 2) {
			local10++;
		}
		if (arg0 == 3) {
			local15--;
			local10++;
		}
		if (arg0 == 4) {
			local15--;
		}
		if (arg0 == 5) {
			local10--;
			local15--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (arg0 == 7) {
			local10--;
			local15++;
		}
		if (super.aClass100_9.method8963() && super.aClass100_9.method8977().anInt770 == 1) {
			super.anIntArray425 = null;
			super.aClass100_9.method8962(-1);
		}
		for (@Pc(100) int local100 = 0; super.aClass385Array3.length > local100; local100++) {
			if (super.aClass385Array3[local100].anInt10760 != -1) {
				@Pc(120) Class310 local120 = Static660.aClass307_2.method7493(super.aClass385Array3[local100].anInt10760);
				if (local120.aBoolean661 && local120.anInt8987 != -1 && Static59.aClass177_1.method4259(local120.anInt8987).anInt770 == 1) {
					super.aClass385Array3[local100].aClass100_11.method8962(-1);
					super.aClass385Array3[local100].anInt10760 = -1;
				}
			}
		}
		if (super.anInt7824 < super.anIntArray430.length - 1) {
			super.anInt7824++;
		}
		for (@Pc(192) int local192 = super.anInt7824; local192 > 0; local192--) {
			super.anIntArray430[local192] = super.anIntArray430[local192 - 1];
			super.lb[local192] = super.lb[local192 - 1];
			super.aByteArray69[local192] = super.aByteArray69[local192 - 1];
		}
		super.anIntArray430[0] = local10;
		super.lb[0] = local15;
		super.aByteArray69[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9374(@OriginalArg(0) Class67 arg0) {
		if (this.aClass18_1 == null || !super.aBoolean596 && !this.method3440(arg0, 0)) {
			return;
		}
		@Pc(35) Class181 local35 = arg0.method7693();
		local35.method6344(super.aClass340_7.method8085());
		local35.method6354(super.anInt11204, super.anInt11208 - 20, super.anInt11211);
		this.method6590(super.aBoolean596, super.aClass157Array3, local35, arg0);
		for (@Pc(62) int local62 = 0; super.aClass157Array3.length > local62; local62++) {
			super.aClass157Array3[local62] = null;
		}
	}

	@OriginalMember(owner = "client!gja", name = "n", descriptor = "(I)I")
	@Override
	public int method6603() {
		if (this.aClass18_1.anIntArray23 != null) {
			@Pc(19) Class18 local19 = this.aClass18_1.method407(Static577.aClass362_1);
			if (local19 != null && local19.anInt453 != -1) {
				return local19.anInt453;
			}
		}
		return this.aClass18_1.anInt453;
	}

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "(I)I")
	@Override
	protected int method6584() {
		if (this.aClass18_1.anIntArray23 != null) {
			@Pc(20) Class18 local20 = this.aClass18_1.method407(Static577.aClass362_1);
			if (local20 != null && local20.anInt452 != -1) {
				return local20.anInt452;
			}
		}
		return this.aClass18_1.anInt452;
	}

	@OriginalMember(owner = "client!gja", name = "c", descriptor = "(Z)Z")
	public boolean method3437() {
		return this.aClass18_1 != null;
	}

	@OriginalMember(owner = "client!gja", name = "h", descriptor = "(B)Lclient!jd;")
	@Override
	public Class184 method6594() {
		return super.aClass184_3 != null && super.aClass184_3.aString88 == null ? null : super.aClass184_3;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(IILjava/lang/String;I)V")
	public void method3439(@OriginalArg(2) String arg0) {
		@Pc(9) int local9 = Static285.method4300() * Static224.aClass84_1.anInt2478;
		this.method6608(arg0, 0, 0, local9);
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lclient!ha;I)Lclient!mla;")
	@Override
	public Class19_Sub8 method9377(@OriginalArg(0) Class67 arg0) {
		if (this.aClass18_1 == null || !this.method3440(arg0, 2048)) {
			return null;
		}
		@Pc(22) Class181 local22 = arg0.method7693();
		@Pc(27) int local27 = super.aClass340_7.method8085();
		local22.method6344(local27);
		@Pc(45) Class262 local45 = Static584.aClass262ArrayArrayArray2[super.aByte146][super.anInt11204 >> Static394.anInt7067][super.anInt11211 >> Static394.anInt7067];
		if (local45 == null || local45.aClass19_Sub1_Sub5_1 == null) {
			super.anInt7765 = (int) ((float) super.anInt7765 - (float) super.anInt7765 / 10.0F);
		} else {
			@Pc(76) int local76 = super.anInt7765 - local45.aClass19_Sub1_Sub5_1.aShort128;
			super.anInt7765 = (int) ((float) super.anInt7765 - (float) local76 / 10.0F);
		}
		local22.method6354(super.anInt11204, -super.anInt7765 + super.anInt11208 - 20, super.anInt11211);
		@Pc(111) Class274 local111 = this.method6600();
		@Pc(125) Class18 local125 = this.aClass18_1.anIntArray23 == null ? this.aClass18_1 : this.aClass18_1.method407(Static577.aClass362_1);
		super.aBoolean597 = false;
		@Pc(130) Class19_Sub8 local130 = null;
		if (Static713.aClass3_Sub55_31.aClass15_Sub3_1.method910() == 1 && local125.aBoolean20 && local111.aBoolean624) {
			@Pc(166) Class100 local166 = super.aClass100_9.method8963() && super.aClass100_9.method8975() ? super.aClass100_9 : null;
			@Pc(186) Class100 local186 = super.aClass100_8.method8963() && (!super.aBoolean595 || local166 == null) ? super.aClass100_8 : null;
			@Pc(230) Class157 local230 = Static563.method7836(arg0, super.anInt7791, super.aClass157Array3[0], local27, local186 == null ? local166 : local186, super.anInt7773, this.aClass18_1.aShort2 & 0xFFFF, this.aClass18_1.aByte5 & 0xFF, this.aClass18_1.anInt437, this.aClass18_1.aShort3 & 0xFFFF, this.aClass18_1.aByte6 & 0xFF, super.anInt7792);
			if (local230 != null) {
				local130 = Static58.method727(super.aClass157Array3.length + 1, this.method3433());
				super.aBoolean597 = true;
				arg0.C(false);
				if (Static568.aBoolean784) {
					local230.method5227(local22, local130.aClass19_Sub6Array1[super.aClass157Array3.length], Static705.anInt11029, 0);
				} else {
					local230.method5232(local22, local130.aClass19_Sub6Array1[super.aClass157Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local22.method6344(local27);
		local22.method6354(super.anInt11204, -super.anInt7765 + super.anInt11208 - 5, super.anInt11211);
		if (local130 == null) {
			local130 = Static58.method727(super.aClass157Array3.length, this.method3433());
		}
		this.method6590(false, super.aClass157Array3, local22, arg0);
		@Pc(321) int local321;
		if (Static568.aBoolean784) {
			for (local321 = 0; super.aClass157Array3.length > local321; local321++) {
				if (super.aClass157Array3[local321] != null) {
					super.aClass157Array3[local321].method5227(local22, local130.aClass19_Sub6Array1[local321], Static705.anInt11029, 0);
				}
			}
		} else {
			for (local321 = 0; super.aClass157Array3.length > local321; local321++) {
				if (super.aClass157Array3[local321] != null) {
					super.aClass157Array3[local321].method5232(local22, local130.aClass19_Sub6Array1[local321], 0);
				}
			}
		}
		if (super.aClass19_Sub9_7 != null) {
			@Pc(397) Class162 local397 = super.aClass19_Sub9_7.method6779();
			if (Static568.aBoolean784) {
				arg0.method7692(local397, Static705.anInt11029);
			} else {
				arg0.method7656(local397);
			}
		}
		for (local321 = 0; super.aClass157Array3.length > local321; local321++) {
			if (super.aClass157Array3[local321] != null) {
				super.aBoolean597 |= super.aClass157Array3[local321].F();
			}
			super.aClass157Array3[local321] = null;
		}
		super.anInt7788 = Static220.anInt4252;
		return local130;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lclient!ha;B)Lclient!dfa;")
	@Override
	public Class68 method9371(@OriginalArg(0) Class67 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lclient!ha;BI)Z")
	private boolean method3440(@OriginalArg(0) Class67 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1;
		@Pc(16) Class274 local16 = this.method6600();
		@Pc(34) Class100 local34 = super.aClass100_9.method8963() && !super.aClass100_9.method8975() ? super.aClass100_9 : null;
		@Pc(54) Class100 local54 = super.aClass100_8.method8963() && (!super.aBoolean595 || local34 == null) ? super.aClass100_8 : null;
		@Pc(57) int local57 = local16.anInt8176;
		@Pc(60) int local60 = local16.anInt8179;
		if (local57 != 0 || local60 != 0 || local16.anInt8190 != 0 || local16.anInt8172 != 0) {
			arg1 |= 0x7;
		}
		@Pc(100) boolean local100 = super.aByte118 != 0 && super.anInt7813 <= Static269.anInt4883 && super.anInt7808 > Static269.anInt4883;
		if (local100) {
			arg1 |= 0x80000;
		}
		@Pc(111) int local111 = super.aClass340_7.method8085();
		@Pc(134) Class157 local134 = super.aClass157Array3[0] = this.aClass18_1.method408(arg0, local34, local54, super.aClass100_Sub1_Sub1Array3, this.aClass208_1, Static577.aClass362_1, arg1, Static255.aClass238_1, local111, super.anIntArray429);
		if (local134 == null) {
			return false;
		}
		super.anInt7760 = local134.fa();
		super.anInt7770 = local134.ma();
		this.method6605(local134);
		if (local57 == 0 && local60 == 0) {
			this.method6587(this.method6592() << 9, 0, local111, this.method6592() << 9, 0);
		} else {
			this.method6587(local57, local16.anInt8186, local111, local60, local16.anInt8164);
			if (super.anInt7792 != 0) {
				super.aClass157Array3[0].FA(super.anInt7792);
			}
			if (super.anInt7791 != 0) {
				super.aClass157Array3[0].VA(super.anInt7791);
			}
			if (super.anInt7773 != 0) {
				super.aClass157Array3[0].H(0, super.anInt7773, 0);
			}
		}
		if (local100) {
			local134.method5212(super.aByte120, super.aByte121, super.aByte119, super.aByte118 & 0xFF);
		}
		this.method6586(local57, local60, arg0, local16, local111, local5);
		return true;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(IIIIZI)V")
	public void method3441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super.aByte146 = super.aByte145 = (byte) arg1;
		if (Static135.method2226(arg0, arg2)) {
			super.aByte145++;
		}
		if (super.aClass100_9.method8963() && super.aClass100_9.method8977().anInt770 == 1) {
			super.anIntArray425 = null;
			super.aClass100_9.method8962(-1);
		}
		for (@Pc(52) int local52 = 0; local52 < super.aClass385Array3.length; local52++) {
			if (super.aClass385Array3[local52].anInt10760 != -1) {
				@Pc(73) Class310 local73 = Static660.aClass307_2.method7493(super.aClass385Array3[local52].anInt10760);
				if (local73.aBoolean661 && local73.anInt8987 != -1 && Static59.aClass177_1.method4259(local73.anInt8987).anInt770 == 1) {
					super.aClass385Array3[local52].aClass100_11.method8962(-1);
					super.aClass385Array3[local52].anInt10760 = -1;
				}
			}
		}
		if (!arg4) {
			@Pc(133) int local133 = arg0 - super.anIntArray430[0];
			@Pc(140) int local140 = arg2 - super.lb[0];
			if (local133 >= -8 && local133 <= 8 && local140 >= -8 && local140 <= 8) {
				if (super.anIntArray430.length - 1 > super.anInt7824) {
					super.anInt7824++;
				}
				for (@Pc(181) int local181 = super.anInt7824; local181 > 0; local181--) {
					super.anIntArray430[local181] = super.anIntArray430[local181 - 1];
					super.lb[local181] = super.lb[local181 - 1];
					super.aByteArray69[local181] = super.aByteArray69[local181 - 1];
				}
				super.anIntArray430[0] = arg0;
				super.aByteArray69[0] = 1;
				super.lb[0] = arg2;
				return;
			}
		}
		super.anInt7821 = 0;
		super.anIntArray430[0] = arg0;
		super.anInt7822 = 0;
		super.anInt7824 = 0;
		super.lb[0] = arg2;
		super.anInt11204 = (arg3 << 8) + (super.anIntArray430[0] << 9);
		super.anInt11211 = (super.lb[0] << 9) + (arg3 << 8);
		if (super.aClass19_Sub9_7 != null) {
			super.aClass19_Sub9_7.method6769();
		}
	}
}
