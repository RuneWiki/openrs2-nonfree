import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class25_Sub5_Sub1_Sub1 extends Class25_Sub5_Sub1 {

	@OriginalMember(owner = "client!ir", name = "bd", descriptor = "Lclient!dh;")
	public Class54 aClass54_1;

	@OriginalMember(owner = "client!ir", name = "Nc", descriptor = "I")
	public int anInt3109 = -1;

	@OriginalMember(owner = "client!ir", name = "gd", descriptor = "I")
	public int anInt3127 = -1;

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	@Override
	public Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0) {
		if (this.aClass54_1 == null || !this.method2596(arg0, 2048)) {
			return null;
		}
		@Pc(24) Class32 local24 = arg0.method5747();
		@Pc(31) int local31 = super.aClass265_7.method5841();
		local24.ca(local31);
		local24.W(super.anInt5518, super.anInt5517, super.anInt5514);
		@Pc(46) Class236 local46 = this.method3428();
		@Pc(59) Class54 local59 = this.aClass54_1.anIntArray67 == null ? this.aClass54_1 : this.aClass54_1.method1148(Static320.aClass249_2);
		if (Static453.aClass136_Sub1_1.aBoolean503 && local59.aBoolean153 && local46.aBoolean708) {
			@Pc(84) Class177 local84 = super.anInt4270 != -1 && super.anInt4235 == 0 ? Static174.aClass254_1.method5670(super.anInt4270) : null;
			@Pc(104) Class177 local104 = super.anInt4287 == -1 || super.aBoolean483 && local84 != null ? null : Static174.aClass254_1.method5670(super.anInt4287);
			@Pc(106) int local106 = 0;
			if (super.anInt4297 != 0) {
				local106 = this.method3433();
			}
			@Pc(169) Class57 local169 = Static41.method586(this.aClass54_1.anInt1348, this.aClass54_1.aShort16 & 0xFFFF, local104 == null ? local84 : local104, super.anInt4242, super.anInt4247, arg0, local106, super.anInt4255, super.aClass57Array3[0], local104 == null ? super.anInt4301 : super.anInt4240, this.aClass54_1.aByte12 & 0xFF, this.aClass54_1.aByte10 & 0xFF, local31, this.aClass54_1.aShort17 & 0xFFFF);
			if (local169 != null) {
				@Pc(174) float local174 = arg0.T();
				@Pc(177) float local177 = arg0.aa();
				arg0.method5745(false);
				arg0.da(local174, local177 - 150.0F);
				local169.method5953(local24, null, 0);
				arg0.da(local174, local177);
				arg0.method5745(true);
			}
		}
		@Pc(200) Class4_Sub7 local200 = null;
		if (this.method2593()) {
			local200 = Static142.method2157(super.aClass57Array3.length);
		}
		if (super.aClass4_Sub2_5 == null) {
			arg0.method5771(super.aClass57Array3, local24, local200 == null ? null : local200.aClass4_Sub8Array1, 0);
		} else {
			@Pc(231) Class71 local231 = super.aClass4_Sub2_5.method1240();
			arg0.method5797(super.aClass57Array3, local231, local24, local200 == null ? null : local200.aClass4_Sub8Array1, 0);
		}
		this.method3421(false, arg0, super.aClass57Array3);
		if (super.aClass57Array3[2] != null) {
			if (local31 != 0) {
				super.aClass57Array3[2].ma(local31);
			}
			super.aClass57Array3[2].a(-super.aClass1_Sub17_3.anInt1715 + super.anInt5518, super.anInt5517 - super.aClass1_Sub17_3.anInt1710, super.anInt5514 - super.aClass1_Sub17_3.anInt1722);
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		super.anInt4308 = Static49.anInt840;
		return local200;
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "(B)V")
	@Override
	public void method4607() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIZILclient!ot;Lclient!za;)V")
	@Override
	public void method4609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) Class34 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "(B)I")
	@Override
	public int method3434() {
		if (this.aClass54_1.anIntArray67 != null) {
			@Pc(21) Class54 local21 = this.aClass54_1.method1148(Static320.aClass249_2);
			if (local21 != null && local21.anInt1331 != -1) {
				return local21.anInt1331;
			}
		}
		return this.aClass54_1.anInt1331 == -1 ? super.method3434() : this.aClass54_1.anInt1331;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZLclient!dh;)V")
	public void method2590(@OriginalArg(1) Class54 arg0) {
		this.aClass54_1 = arg0;
		if (super.aClass4_Sub2_5 != null) {
			super.aClass4_Sub2_5.method1246();
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZIIII)V")
	public void method2591(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte94 = (byte) arg3;
		if (super.anInt4270 != -1 && Static174.aClass254_1.method5670(super.anInt4270).anInt5036 == 1) {
			super.anInt4270 = -1;
		}
		@Pc(38) Class130 local38;
		if (super.anInt4283 != -1) {
			local38 = Static88.aClass69_1.method1553(super.anInt4283);
			if (local38.aBoolean410 && local38.anInt3576 != -1 && Static174.aClass254_1.method5670(local38.anInt3576).anInt5036 == 1) {
				super.anInt4283 = -1;
			}
		}
		if (super.anInt4267 != -1) {
			local38 = Static88.aClass69_1.method1553(super.anInt4267);
			if (local38.aBoolean410 && local38.anInt3576 != -1 && Static174.aClass254_1.method5670(local38.anInt3576).anInt5036 == 1) {
				super.anInt4267 = -1;
			}
		}
		if (!arg1) {
			@Pc(99) int local99 = arg4 - super.anIntArray283[0];
			@Pc(107) int local107 = arg2 - super.anIntArray284[0];
			if (local99 >= -8 && local99 <= 8 && local107 >= -8 && local107 <= 8) {
				if (super.anInt4314 < 9) {
					super.anInt4314++;
				}
				for (@Pc(134) int local134 = super.anInt4314; local134 > 0; local134--) {
					super.anIntArray283[local134] = super.anIntArray283[local134 - 1];
					super.anIntArray284[local134] = super.anIntArray284[local134 - 1];
					super.aByteArray51[local134] = super.aByteArray51[local134 - 1];
				}
				super.anIntArray283[0] = arg4;
				super.anIntArray284[0] = arg2;
				super.aByteArray51[0] = 1;
				return;
			}
		}
		super.anInt4315 = 0;
		super.anInt4316 = 0;
		super.anIntArray283[0] = arg4;
		super.anInt4314 = 0;
		super.anIntArray284[0] = arg2;
		super.anInt5518 = (arg0 << 6) + (super.anIntArray283[0] << 7);
		super.anInt5514 = (arg0 << 6) + (super.anIntArray284[0] << 7);
		if (super.aClass4_Sub2_5 != null) {
			super.aClass4_Sub2_5.method1246();
		}
	}

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "(I)Z")
	private boolean method2593() {
		return this.aClass54_1.aBoolean150;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!za;BI)Z")
	@Override
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass54_1 == null || !this.method2596(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class32 local19 = arg1.method5747();
		@Pc(24) int local24 = super.aClass265_7.method5841();
		local19.ca(local24);
		local19.W(super.anInt5518, super.anInt5517, super.anInt5514);
		@Pc(37) boolean local37 = false;
		for (@Pc(44) int local44 = 0; super.aClass57Array3.length > local44; local44++) {
			if (super.aClass57Array3[local44] != null && super.aClass57Array3[local44].method5957(arg2, arg0, local19, this.aClass54_1.anInt1348 == 1)) {
				local37 = true;
				break;
			}
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4602() {
		return false;
	}

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "(B)Z")
	public boolean method2594() {
		return this.aClass54_1 != null;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(BLclient!za;)V")
	@Override
	public void method4606(@OriginalArg(1) Class34 arg0) {
		if (this.aClass54_1 != null && (super.aBoolean485 || this.method2596(arg0, 0))) {
			this.method3421(super.aBoolean485, arg0, super.aClass57Array3);
			super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)V")
	public void method2595(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray283[0];
		@Pc(15) int local15 = super.anIntArray284[0];
		if (arg0 == 0) {
			local15++;
		}
		if (arg0 == 1) {
			local15++;
			local10++;
		}
		if (arg0 == 2) {
			local10++;
		}
		if (arg0 == 3) {
			local10++;
			local15--;
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
			local15++;
			local10--;
		}
		if (super.anInt4270 != -1 && Static174.aClass254_1.method5670(super.anInt4270).anInt5036 == 1) {
			super.anInt4270 = -1;
		}
		@Pc(86) Class130 local86;
		if (super.anInt4283 != -1) {
			local86 = Static88.aClass69_1.method1553(super.anInt4283);
			if (local86.aBoolean410 && local86.anInt3576 != -1 && Static174.aClass254_1.method5670(local86.anInt3576).anInt5036 == 1) {
				super.anInt4283 = -1;
			}
		}
		if (super.anInt4267 != -1) {
			local86 = Static88.aClass69_1.method1553(super.anInt4267);
			if (local86.aBoolean410 && local86.anInt3576 != -1 && Static174.aClass254_1.method5670(local86.anInt3576).anInt5036 == 1) {
				super.anInt4267 = -1;
			}
		}
		if (super.anInt4314 < 9) {
			super.anInt4314++;
		}
		for (@Pc(150) int local150 = super.anInt4314; local150 > 0; local150--) {
			super.anIntArray283[local150] = super.anIntArray283[local150 - 1];
			super.anIntArray284[local150] = super.anIntArray284[local150 - 1];
			super.aByteArray51[local150] = super.aByteArray51[local150 - 1];
		}
		super.anIntArray283[0] = local10;
		super.anIntArray284[0] = local15;
		super.aByteArray51[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)I")
	@Override
	public int method3423() {
		if (this.aClass54_1.anIntArray67 != null) {
			@Pc(13) Class54 local13 = this.aClass54_1.method1148(Static320.aClass249_2);
			if (local13 != null && local13.anInt1314 != -1) {
				return local13.anInt1314;
			}
		}
		return this.aClass54_1.anInt1314;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!za;II)Z")
	private boolean method2596(@OriginalArg(0) Class34 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class236 local11 = this.method3428();
		@Pc(35) Class177 local35 = super.anInt4270 != -1 && super.anInt4235 == 0 ? Static174.aClass254_1.method5670(super.anInt4270) : null;
		@Pc(53) Class177 local53 = super.anInt4287 == -1 || super.aBoolean483 && local35 != null ? null : Static174.aClass254_1.method5670(super.anInt4287);
		@Pc(56) int local56 = local11.anInt6460;
		@Pc(59) int local59 = local11.anInt6482;
		if (local56 != 0 || local59 != 0 || local11.anInt6476 != 0 || local11.anInt6481 != 0) {
			arg1 |= 0x7;
		}
		@Pc(95) boolean local95 = super.aByte61 != 0 && Static236.anInt4213 >= super.anInt4251 && super.anInt4305 > Static236.anInt4213;
		if (local95) {
			arg1 |= 0x80000;
		}
		@Pc(132) Class57 local132 = super.aClass57Array3[0] = this.aClass54_1.method1156(super.anInt4240, local53, arg1, super.aClass74Array3, super.anInt4271, super.anInt4311, Static291.aClass21_1, arg0, super.lb, local35, Static174.aClass254_1, super.anInt4301, Static320.aClass249_2, super.anInt4260);
		if (local132 == null) {
			return false;
		}
		super.anInt4264 = local132.B();
		this.method3425(local132);
		@Pc(149) int local149 = super.aClass265_7.method5841();
		if (local56 == 0 && local59 == 0) {
			this.method3419(0, this.method3427() << 7, this.method3427() << 7, 0, local149);
		} else {
			this.method3419(local11.anInt6471, local56, local59, local11.anInt6469, local149);
			if (super.anInt4242 != 0) {
				super.aClass57Array3[0].W(super.anInt4242);
			}
			if (super.anInt4247 != 0) {
				super.aClass57Array3[0].K(super.anInt4247);
			}
			if (super.anInt4255 != 0) {
				super.aClass57Array3[0].a(0, super.anInt4255, 0);
			}
		}
		if (local95) {
			local132.method5950(super.aByte63, super.aByte62, super.aByte60, super.aByte61 & 0xFF);
		}
		@Pc(257) Class130 local257;
		@Pc(271) boolean local271;
		@Pc(273) int local273;
		@Pc(319) Class57 local319;
		if (super.anInt4283 == -1 || super.anInt4252 == -1) {
			super.aClass57Array3[1] = null;
		} else {
			local257 = Static88.aClass69_1.method1553(super.anInt4283);
			local271 = local257.aByte50 == 3 && (local56 != 0 || local59 != 0);
			local273 = local7;
			if (local271) {
				local273 = local7 | 0x7;
			} else {
				if (super.anInt4265 != 0) {
					local273 = local7 | 0x5;
				}
				if (super.anInt4276 != 0) {
					local273 |= 0x2;
				}
			}
			local319 = super.aClass57Array3[1] = local257.method2914(Static174.aClass254_1, local273, super.anInt4257, super.anInt4300, arg0, super.anInt4252);
			if (local319 != null) {
				if (super.anInt4276 != 0) {
					local319.a(0, -super.anInt4276 << 0, 0);
				}
				if (super.anInt4265 != 0) {
					local319.ma(super.anInt4265 * 2048);
				}
				if (local271) {
					if (super.anInt4242 != 0) {
						local319.W(super.anInt4242);
					}
					if (super.anInt4247 != 0) {
						local319.K(super.anInt4247);
					}
					if (super.anInt4255 != 0) {
						local319.a(0, super.anInt4255, 0);
					}
				}
			}
		}
		if (super.anInt4267 == -1 || super.anInt4258 == -1) {
			super.aClass57Array3[3] = null;
		} else {
			local257 = Static88.aClass69_1.method1553(super.anInt4267);
			local271 = local257.aByte50 == 3 && (local56 != 0 || local59 != 0);
			local273 = local7;
			if (local271) {
				local273 = local7 | 0x7;
			} else {
				if (super.anInt4302 != 0) {
					local273 = local7 | 0x5;
				}
				if (super.anInt4243 != 0) {
					local273 |= 0x2;
				}
			}
			local319 = super.aClass57Array3[3] = local257.method2909(super.anInt4306, local273, Static174.aClass254_1, super.anInt4290, super.anInt4258, arg0);
			if (local319 != null) {
				if (super.anInt4243 != 0) {
					local319.a(0, -super.anInt4243 << 0, 0);
				}
				if (super.anInt4302 != 0) {
					local319.ma(super.anInt4302 * 2048);
				}
				if (local271) {
					if (super.anInt4242 != 0) {
						local319.W(super.anInt4242);
					}
					if (super.anInt4247 != 0) {
						local319.K(super.anInt4247);
					}
					if (super.anInt4255 != 0) {
						local319.a(0, super.anInt4255, 0);
					}
				}
			}
		}
		super.aClass57Array3[2] = null;
		if (super.aClass1_Sub17_3 != null) {
			if (super.aClass1_Sub17_3.anInt1711 <= Static236.anInt4213) {
				super.aClass1_Sub17_3 = null;
			} else if (super.aClass1_Sub17_3.anInt1716 <= Static236.anInt4213) {
				@Pc(550) Class57 local550 = super.aClass1_Sub17_3.method1490(arg0, local7 | 0x7);
				if (local550 != null) {
					local550.a(super.aClass1_Sub17_3.anInt1715 - super.anInt5518, super.aClass1_Sub17_3.anInt1710 - super.anInt5517, -super.anInt5514 + super.aClass1_Sub17_3.anInt1722);
					if (local149 != 0) {
						local550.ma(local149);
					}
					super.aClass57Array3[2] = local550;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "(I)I")
	@Override
	public int method4341() {
		return super.anInt4264;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)I")
	@Override
	protected int method3417() {
		if (this.aClass54_1.anIntArray67 != null) {
			@Pc(19) Class54 local19 = this.aClass54_1.method1148(Static320.aClass249_2);
			if (local19 != null && local19.anInt1347 != -1) {
				return local19.anInt1347;
			}
		}
		return this.aClass54_1.anInt1347;
	}
}
