import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class1_Sub4_Sub2_Sub1_Sub2 extends Class1_Sub4_Sub2_Sub1 {

	@OriginalMember(owner = "client!rda", name = "Xc", descriptor = "I")
	public int anInt8450;

	@OriginalMember(owner = "client!rda", name = "cd", descriptor = "Ljava/lang/String;")
	public String aString77;

	@OriginalMember(owner = "client!rda", name = "fd", descriptor = "I")
	public int anInt8455;

	@OriginalMember(owner = "client!rda", name = "gd", descriptor = "I")
	private int anInt8456;

	@OriginalMember(owner = "client!rda", name = "rd", descriptor = "Ljava/lang/String;")
	public String aString78;

	@OriginalMember(owner = "client!rda", name = "Od", descriptor = "Lclient!jaa;")
	public Class166 aClass166_1;

	@OriginalMember(owner = "client!rda", name = "Yc", descriptor = "Z")
	public boolean aBoolean594 = false;

	@OriginalMember(owner = "client!rda", name = "Zc", descriptor = "Z")
	public boolean aBoolean595 = false;

	@OriginalMember(owner = "client!rda", name = "ad", descriptor = "I")
	public int anInt8451 = -1;

	@OriginalMember(owner = "client!rda", name = "md", descriptor = "I")
	public int anInt8461 = -1;

	@OriginalMember(owner = "client!rda", name = "P", descriptor = "I")
	public int anInt8449 = -1;

	@OriginalMember(owner = "client!rda", name = "sd", descriptor = "I")
	public int anInt8465 = 0;

	@OriginalMember(owner = "client!rda", name = "id", descriptor = "I")
	public int anInt8458 = 0;

	@OriginalMember(owner = "client!rda", name = "ud", descriptor = "B")
	private byte aByte108 = 0;

	@OriginalMember(owner = "client!rda", name = "bd", descriptor = "I")
	public int anInt8452 = -1;

	@OriginalMember(owner = "client!rda", name = "xd", descriptor = "I")
	public int anInt8469 = 0;

	@OriginalMember(owner = "client!rda", name = "dd", descriptor = "I")
	public int anInt8453 = -1;

	@OriginalMember(owner = "client!rda", name = "nd", descriptor = "Z")
	public boolean aBoolean597 = false;

	@OriginalMember(owner = "client!rda", name = "ld", descriptor = "Z")
	public boolean aBoolean596 = false;

	@OriginalMember(owner = "client!rda", name = "Cd", descriptor = "B")
	private byte aByte109 = 0;

	@OriginalMember(owner = "client!rda", name = "ed", descriptor = "I")
	public int anInt8454 = 0;

	@OriginalMember(owner = "client!rda", name = "Bd", descriptor = "I")
	public int anInt8473 = 0;

	@OriginalMember(owner = "client!rda", name = "Qd", descriptor = "B")
	private byte aByte110 = 0;

	@OriginalMember(owner = "client!rda", name = "wd", descriptor = "I")
	public int anInt8468 = -1;

	@OriginalMember(owner = "client!rda", name = "Fd", descriptor = "I")
	public int anInt8476 = -1;

	@OriginalMember(owner = "client!rda", name = "Pd", descriptor = "I")
	public int anInt8485 = 255;

	@OriginalMember(owner = "client!rda", name = "Dd", descriptor = "I")
	public int anInt8474 = -1;

	@OriginalMember(owner = "client!rda", name = "Sd", descriptor = "Z")
	public boolean aBoolean598 = false;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method6939() {
		return this.aString78;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method8124(@OriginalArg(0) Class44 arg0) {
		if (this.aClass166_1 == null || !super.aBoolean592 && !this.method6948(0, arg0)) {
			return;
		}
		@Pc(20) Class8 local20 = arg0.method5007();
		local20.o(super.aClass229_7.method5582());
		local20.U(super.anInt9934, super.anInt9932 - 5, super.anInt9935);
		this.method6924(super.aClass57Array3, super.aBoolean592, local20, arg0);
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = null;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)I")
	@Override
	protected int method6927() {
		return this.anInt8456;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method8116(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass166_1 == null || !this.method6948(131072, arg0)) {
			return false;
		}
		@Pc(19) Class8 local19 = arg0.method5007();
		@Pc(24) int local24 = super.aClass229_7.method5582();
		local19.o(local24);
		local19.U(super.anInt9934, super.anInt9932, super.anInt9935);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; local44 < super.aClass57Array3.length; local44++) {
			if (super.aClass57Array3[local44] != null && (Static361.aBoolean500 ? super.aClass57Array3[local44].method7924(arg1, arg2, local19, true, Static6.anInt161) : super.aClass57Array3[local44].method7933(arg1, arg2, local19, true))) {
				local42 = true;
				break;
			}
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = null;
		return local42;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIBI)V")
	public void method6940(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt8447 < 9) {
			super.anInt8447++;
		}
		for (@Pc(26) int local26 = super.anInt8447; local26 > 0; local26--) {
			super.anIntArray463[local26] = super.anIntArray463[local26 - 1];
			super.anIntArray462[local26] = super.anIntArray462[local26 - 1];
			super.aByteArray94[local26] = super.aByteArray94[local26 - 1];
		}
		super.anIntArray463[0] = arg2;
		super.aByteArray94[0] = arg1;
		super.anIntArray462[0] = arg0;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIILclient!q;IILclient!r;ILclient!da;)V")
	private void method6941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class8 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class44 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class57 arg7) {
		@Pc(11) int local11 = arg6 * arg6 + arg3 * arg3;
		if (local11 < 262144 || arg4 < local11) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg6, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(45) Class57 local45 = Static273.method6029(super.anInt8375, arg5, arg0, super.anInt8389, local33, super.anInt8366);
		if (local45 != null) {
			arg5.ZA(false);
			local45.method7919(arg2, null, arg1, 0);
			arg5.ZA(true);
		}
	}

	@OriginalMember(owner = "client!rda", name = "i", descriptor = "(B)Z")
	public boolean method6942() {
		return this.aClass166_1 != null;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)I")
	@Override
	public int method6925() {
		return this.aClass166_1 == null || this.aClass166_1.anInt4200 == -1 ? super.method6925() : Static237.aClass31_1.method478(this.aClass166_1.anInt4200).anInt8266;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BII)V")
	public void method6943(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anIntArray463[0] = arg1;
		super.anInt8447 = 0;
		super.anInt8445 = 0;
		super.anInt8448 = 0;
		super.anIntArray462[0] = arg0;
		@Pc(32) int local32 = this.method6925();
		super.anInt9935 = super.anIntArray462[0] * 512 + local32 * 256;
		super.anInt9934 = super.anIntArray463[0] * 512 + local32 * 256;
		if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 == this) {
			Static214.method3551();
		}
		if (super.aClass1_Sub2_6 != null) {
			super.aClass1_Sub2_6.method336();
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!r;B)Lclient!lt;")
	@Override
	public Class1_Sub8 method8130(@OriginalArg(0) Class44 arg0) {
		if (this.aClass166_1 == null || !this.method6948(2048, arg0)) {
			return null;
		}
		@Pc(26) Class8 local26 = arg0.method5007();
		@Pc(31) int local31 = super.aClass229_7.method5582();
		local26.o(local31);
		@Pc(49) Class53 local49 = Static60.aClass53ArrayArrayArray1[super.aByte126][super.anInt9934 >> Static145.anInt3093][super.anInt9935 >> Static145.anInt3093];
		@Pc(61) int local61;
		if (local49 == null || local49.aClass1_Sub4_Sub4_1 == null) {
			super.anInt8411 = (int) ((float) super.anInt8411 - (float) super.anInt8411 / 10.0F);
		} else {
			local61 = super.anInt8411 - local49.aClass1_Sub4_Sub4_1.aShort83;
			super.anInt8411 = (int) ((float) super.anInt8411 - (float) local61 / 10.0F);
		}
		local26.U(super.anInt9934, -super.anInt8411 + super.anInt9932 - 20, super.anInt9935);
		super.aBoolean593 = false;
		if (Static214.aClass4_Sub19_Sub1_1.aBoolean251) {
			@Pc(110) Class316 local110 = this.method6921();
			if (local110.aBoolean639 && (this.aClass166_1.anInt4200 == -1 || Static237.aClass31_1.method478(this.aClass166_1.anInt4200).aBoolean576)) {
				@Pc(145) Class365 local145 = super.anInt8412 != -1 && super.anInt8378 == 0 ? Static61.aClass48_1.method1016(super.anInt8412) : null;
				@Pc(167) Class365 local167 = super.anInt8409 == -1 || this.aBoolean598 || super.aBoolean589 && local145 != null ? null : Static61.aClass48_1.method1016(super.anInt8409);
				@Pc(199) Class57 local199 = Static474.method7129(local167 == null ? super.anInt8391 : super.anInt8398, super.anInt8366, super.anInt8389, 0, 0, arg0, local31, 160, local167 == null ? local145 : local167, 1, super.aClass57Array3[0], super.anInt8375, 240);
				if (local199 != null) {
					super.aBoolean593 = true;
					arg0.ZA(false);
					if (Static361.aBoolean500) {
						local199.method7919(local26, null, Static6.anInt161, 0);
					} else {
						local199.method7927(local26, null, 0);
					}
					arg0.ZA(true);
				}
			}
		}
		if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 == this) {
			local26.NA(super.anInt9934, super.anInt9932, super.anInt9935);
			for (local61 = Static532.aClass366Array1.length - 1; local61 >= 0; local61--) {
				@Pc(247) Class366 local247 = Static532.aClass366Array1[local61];
				if (local247 != null && local247.anInt10238 != -1) {
					@Pc(277) int local277;
					if (local247.anInt10235 == 1) {
						@Pc(266) Class4_Sub4 local266 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local247.anInt10240);
						if (local266 != null) {
							@Pc(271) Class1_Sub4_Sub2_Sub1_Sub1 local271 = local266.aClass1_Sub4_Sub2_Sub1_Sub1_1;
							local277 = local271.anInt9934 - Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934;
							@Pc(284) int local284 = local271.anInt9935 - Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935;
							if (Static361.aBoolean500) {
								this.method6941(local247.anInt10238, Static6.anInt161, local26, local284, 92160000, arg0, local277, super.aClass57Array3[0]);
							} else {
								this.method6950(local277, local284, arg0, 92160000, super.aClass57Array3[0], local247.anInt10238, local26);
							}
						}
					}
					@Pc(343) int local343;
					if (local247.anInt10235 == 2) {
						@Pc(334) int local334 = local247.anInt10231 + 256 - Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934;
						local343 = local247.anInt10233 + 256 - Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935;
						local277 = local247.anInt10236 << 9;
						local277 *= local277;
						if (Static361.aBoolean500) {
							this.method6941(local247.anInt10238, Static6.anInt161, local26, local343, local277, arg0, local334, super.aClass57Array3[0]);
						} else {
							this.method6950(local334, local343, arg0, local277, super.aClass57Array3[0], local247.anInt10238, local26);
						}
					}
					if (local247.anInt10235 == 10 && local247.anInt10240 >= 0 && Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1.length > local247.anInt10240) {
						@Pc(409) Class1_Sub4_Sub2_Sub1_Sub2 local409 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local247.anInt10240];
						if (local409 != null) {
							local343 = local409.anInt9934 - Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934;
							local277 = local409.anInt9935 - Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935;
							if (Static361.aBoolean500) {
								this.method6941(local247.anInt10238, Static6.anInt161, local26, local277, 92160000, arg0, local343, super.aClass57Array3[0]);
							} else {
								this.method6950(local343, local277, arg0, 92160000, super.aClass57Array3[0], local247.anInt10238, local26);
							}
						}
					}
				}
			}
			local26.o(local31);
			local26.U(super.anInt9934, super.anInt9932, super.anInt9935);
		}
		local26.o(local31);
		local26.U(super.anInt9934, -super.anInt8411 + super.anInt9932 - 5, super.anInt9935);
		@Pc(495) Class1_Sub8 local495 = Static361.method5833(super.aClass57Array3.length);
		this.method6924(super.aClass57Array3, false, local26, arg0);
		@Pc(507) int local507;
		if (Static361.aBoolean500) {
			for (local507 = 0; local507 < super.aClass57Array3.length; local507++) {
				if (super.aClass57Array3[local507] != null) {
					super.aClass57Array3[local507].method7919(local26, local495.aClass1_Sub9Array1[local507], Static6.anInt161, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 == this ? 1 : 0);
				}
			}
		} else {
			for (local507 = 0; super.aClass57Array3.length > local507; local507++) {
				if (super.aClass57Array3[local507] != null) {
					super.aClass57Array3[local507].method7927(local26, local495.aClass1_Sub9Array1[local507], Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass1_Sub2_6 != null) {
			@Pc(577) Class305 local577 = super.aClass1_Sub2_6.method329();
			if (Static361.aBoolean500) {
				arg0.method5026(local577, Static6.anInt161);
			} else {
				arg0.method5017(local577);
			}
		}
		for (local507 = 0; local507 < super.aClass57Array3.length; local507++) {
			if (super.aClass57Array3[local507] != null) {
				super.aBoolean593 |= super.aClass57Array3[local507].LA();
			}
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = null;
		super.anInt8431 = Static203.anInt3850;
		return local495;
	}

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "(I)V")
	@Override
	public void method8120() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8114() {
		return false;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIB)V")
	public void method6944(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt8412 != -1 && Static61.aClass48_1.method1016(super.anInt8412).anInt10226 == 1) {
			super.anIntArray459 = null;
			super.anInt8412 = -1;
		}
		@Pc(40) Class200 local40;
		if (super.anInt8403 != -1) {
			local40 = Static569.aClass213_2.method5291(super.anInt8403);
			if (local40.aBoolean441 && local40.anInt5925 != -1 && Static61.aClass48_1.method1016(local40.anInt5925).anInt10226 == 1) {
				super.anInt8403 = -1;
			}
		}
		if (super.anInt8406 != -1) {
			local40 = Static569.aClass213_2.method5291(super.anInt8406);
			if (local40.aBoolean441 && local40.anInt5925 != -1 && Static61.aClass48_1.method1016(local40.anInt5925).anInt10226 == 1) {
				super.anInt8406 = -1;
			}
		}
		this.anInt8461 = -1;
		if (arg1 < 0 || arg1 >= Static428.anInt8046 || arg0 < 0 || arg0 >= Static119.anInt2717) {
			this.method6943(arg0, arg1);
		} else if (super.anIntArray463[0] >= 0 && super.anIntArray463[0] < Static428.anInt8046 && super.anIntArray462[0] >= 0 && Static119.anInt2717 > super.anIntArray462[0]) {
			if (arg2 == 2) {
				Static89.method2078(this, arg1, arg0);
			}
			this.method6940(arg0, arg2, arg1);
		} else {
			this.method6943(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)I")
	@Override
	public int method6932() {
		return -1;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIZLclient!r;ILclient!ub;I)V")
	@Override
	public void method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(5) Class1_Sub4 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(BLclient!r;)Lclient!sr;")
	@Override
	public Class308 method8121(@OriginalArg(1) Class44 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!un;B)V")
	public void method6945(@OriginalArg(0) Class4_Sub11 arg0) {
		arg0.anInt5831 = 0;
		@Pc(12) int local12 = arg0.method4905();
		this.aByte109 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean597;
		this.aBoolean597 = (local12 & 0x2) != 0;
		@Pc(38) boolean local38 = (local12 & 0x4) != 0;
		@Pc(42) int local42 = super.method6925();
		this.method6920((local12 >> 3 & 0x7) + 1);
		this.aByte110 = (byte) (local12 >> 6 & 0x3);
		super.anInt9934 += this.method6925() - local42 << 8;
		super.anInt9935 += this.method6925() - local42 << 8;
		this.aByte108 = arg0.method4925();
		this.anInt8453 = arg0.method4925();
		this.anInt8449 = arg0.method4925();
		this.aBoolean596 = arg0.method4925() == 1;
		if (Static296.aClass145_5 == Static565.aClass145_11 && Static204.anInt8827 >= 2) {
			this.aBoolean596 = false;
		}
		this.anInt8458 = 0;
		@Pc(126) int local126 = -1;
		@Pc(129) int[] local129 = new int[12];
		@Pc(152) int local152;
		@Pc(158) int local158;
		@Pc(200) int local200;
		for (@Pc(131) int local131 = 0; local131 < 12; local131++) {
			@Pc(137) int local137 = arg0.method4905();
			if (local137 == 0) {
				local129[local131] = 0;
			} else {
				local152 = arg0.method4905();
				local158 = local152 + (local137 << 8);
				if (local131 == 0 && local158 == 65535) {
					local126 = arg0.method4936();
					this.anInt8458 = arg0.method4905();
					break;
				}
				if (local158 >= 32768) {
					local158 = Static56.anIntArray34[local158 - 32768];
					local129[local131] = local158 | 0x40000000;
					local200 = Static521.aClass273_2.method6712(local158).anInt7110;
					if (local200 != 0) {
						this.anInt8458 = local200;
					}
				} else {
					local129[local131] = local158 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(222) int[] local222 = new int[5];
		for (local152 = 0; local152 < 5; local152++) {
			local158 = arg0.method4905();
			if (Static174.aShortArrayArrayArray1.length < 1 || local158 < 0 || Static174.aShortArrayArrayArray1[0][local152].length <= local158) {
				local158 = 0;
			}
			local222[local152] = local158;
		}
		this.anInt8456 = arg0.method4936();
		this.aString77 = arg0.method4920();
		this.aString78 = this.aString77;
		this.anInt8465 = arg0.method4905();
		if (local38) {
			this.anInt8469 = arg0.method4936();
			this.anInt8473 = this.anInt8465;
			this.anInt8451 = -1;
			if (this.anInt8469 == 65535) {
				this.anInt8469 = -1;
			}
		} else {
			this.anInt8469 = 0;
			this.anInt8473 = arg0.method4905();
			this.anInt8451 = arg0.method4905();
			if (this.anInt8451 == 255) {
				this.anInt8451 = -1;
			}
		}
		local200 = this.anInt8454;
		this.anInt8454 = arg0.method4905();
		@Pc(352) int local352;
		@Pc(358) int local358;
		if (this.anInt8454 == 0) {
			Static397.method6281(this);
		} else {
			local352 = this.anInt8452;
			@Pc(355) int local355 = this.anInt8474;
			local358 = this.anInt8476;
			@Pc(361) int local361 = this.anInt8468;
			@Pc(364) int local364 = this.anInt8485;
			this.anInt8452 = arg0.method4936();
			this.anInt8474 = arg0.method4936();
			this.anInt8476 = arg0.method4936();
			this.anInt8468 = arg0.method4936();
			this.anInt8485 = arg0.method4905();
			if (local21 != this.aBoolean597 || local200 != this.anInt8454 || this.anInt8452 != local352 || local355 != this.anInt8474 || local358 != this.anInt8476 || local361 != this.anInt8468 || local364 != this.anInt8485) {
				Static531.method7704(this);
			}
		}
		if (this.aClass166_1 == null) {
			this.aClass166_1 = new Class166();
		}
		local352 = this.aClass166_1.anInt4200;
		@Pc(444) int[] local444 = this.aClass166_1.anIntArray206;
		this.aClass166_1.method3733(local222, local126, local129, this.method6927(), this.aByte109 == 1);
		if (local352 != local126) {
			super.anInt9934 = (super.anIntArray463[0] << 9) + (this.method6925() << 8);
			super.anInt9935 = (super.anIntArray462[0] << 9) + (this.method6925() << 8);
		}
		if (Static411.anInt7797 == super.anInt8435 && local444 != null) {
			for (local358 = 0; local358 < local222.length; local358++) {
				if (local222[local358] != local444[local358]) {
					Static521.aClass273_2.method6715();
					break;
				}
			}
		}
		if (super.aClass1_Sub2_6 != null) {
			super.aClass1_Sub2_6.method336();
		}
		if (super.anInt8409 == -1 || !super.aBoolean589) {
			return;
		}
		@Pc(546) Class316 local546 = this.method6921();
		if (!local546.method7457(super.anInt8409)) {
			super.anInt8409 = -1;
			super.aBoolean589 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BILclient!r;)Z")
	private boolean method6948(@OriginalArg(1) int arg0, @OriginalArg(2) Class44 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class316 local11 = this.method6921();
		@Pc(30) Class365 local30 = super.anInt8412 != -1 && super.anInt8378 == 0 ? Static61.aClass48_1.method1016(super.anInt8412) : null;
		@Pc(51) Class365 local51 = super.anInt8409 == -1 || this.aBoolean598 || super.aBoolean589 && local30 != null ? null : Static61.aClass48_1.method1016(super.anInt8409);
		@Pc(54) int local54 = local11.anInt9118;
		@Pc(57) int local57 = local11.anInt9144;
		if (local54 != 0 || local57 != 0 || local11.anInt9139 != 0 || local11.anInt9164 != 0) {
			arg0 |= 0x7;
		}
		@Pc(82) int local82 = super.aClass229_7.method5582();
		@Pc(97) boolean local97 = super.aByte104 != 0 && super.anInt8377 <= Static106.anInt2418 && Static106.anInt2418 < super.anInt8418;
		if (local97) {
			arg0 |= 0x80000;
		}
		@Pc(141) Class57 local141 = super.aClass57Array3[0] = this.aClass166_1.method3735(arg0, super.anInt8369, local30, super.anIntArray458, super.anInt8398, super.anInt8433, local82, Static462.aClass178_1, Static61.aClass48_1, super.anInt8392, local51, super.anInt8386, Static237.aClass31_1, arg1, super.anInt8391, Static521.aClass273_2, Static45.aClass148_1, Static522.aClass290_6, super.aClass129Array3);
		@Pc(144) int local144 = Static541.method7833();
		if (Static577.anInt10067 < 96 && local144 > 50) {
			Static404.method6351();
		}
		if (Static296.aClass145_5 != Static565.aClass145_11 && local144 < 50) {
			@Pc(175) int local175 = 50 - local144;
			while (local175 > Static590.anInt10187) {
				Static582.aByteArrayArray25[Static590.anInt10187] = new byte[102400];
				Static590.anInt10187++;
			}
			while (local175 < Static590.anInt10187) {
				Static590.anInt10187--;
				Static582.aByteArrayArray25[Static590.anInt10187] = null;
			}
		} else if (Static565.aClass145_11 != Static296.aClass145_5) {
			Static590.anInt10187 = 0;
			Static582.aByteArrayArray25 = new byte[50][];
		}
		if (local141 == null) {
			return false;
		}
		super.anInt8401 = local141.J();
		super.anInt8420 = local141.RA();
		this.method6923(local141);
		if (local54 == 0 && local57 == 0) {
			this.method6930(this.method6925() << 9, this.method6925() << 9, local82, 0, 0);
		} else {
			this.method6930(local54, local57, local82, local11.anInt9137, local11.anInt9123);
			if (super.anInt8375 != 0) {
				local141.MA(super.anInt8375);
			}
			if (super.anInt8389 != 0) {
				local141.W(super.anInt8389);
			}
			if (super.anInt8366 != 0) {
				local141.oa(0, super.anInt8366, 0);
			}
		}
		if (local97) {
			local141.method7917(super.aByte105, super.aByte106, super.aByte107, super.aByte104 & 0xFF);
		}
		@Pc(348) boolean local348;
		@Pc(350) int local350;
		@Pc(393) Class57 local393;
		@Pc(328) Class200 local328;
		if (this.aBoolean598 || super.anInt8403 == -1 || super.anInt8417 == -1) {
			super.aClass57Array3[1] = null;
		} else {
			local328 = Static569.aClass213_2.method5291(super.anInt8403);
			local348 = local328.aByte64 == 3 && (local54 != 0 || local57 != 0);
			local350 = local7;
			if (local348) {
				local350 = local7 | 0x7;
			} else {
				if (super.anInt8437 != 0) {
					local350 = local7 | 0x5;
				}
				if (super.anInt8380 != 0) {
					local350 |= 0x2;
				}
			}
			local393 = super.aClass57Array3[1] = local328.method5070(super.anInt8397, local350, arg1, Static61.aClass48_1, super.anInt8417, super.anInt8396);
			if (local393 != null) {
				if (super.anInt8380 != 0) {
					local393.oa(0, -super.anInt8380 << 2, 0);
				}
				if (super.anInt8437 != 0) {
					local393.M(super.anInt8437 * 2048);
				}
				if (local348) {
					if (super.anInt8375 != 0) {
						local393.MA(super.anInt8375);
					}
					if (super.anInt8389 != 0) {
						local393.W(super.anInt8389);
					}
					if (super.anInt8366 != 0) {
						local393.oa(0, super.anInt8366, 0);
					}
				}
			}
		}
		if (this.aBoolean598 || super.anInt8406 == -1 || super.anInt8383 == -1) {
			super.aClass57Array3[2] = null;
		} else {
			local328 = Static569.aClass213_2.method5291(super.anInt8406);
			local348 = local328.aByte64 == 3 && (local54 != 0 || local57 != 0);
			local350 = local7;
			if (local348) {
				local350 = local7 | 0x7;
			} else {
				if (super.anInt8438 != 0) {
					local350 = local7 | 0x5;
				}
				if (super.anInt8387 != 0) {
					local350 |= 0x2;
				}
			}
			local393 = super.aClass57Array3[2] = local328.method5072(super.anInt8383, super.anInt8421, Static61.aClass48_1, local350, arg1, super.anInt8432);
			if (local393 != null) {
				if (super.anInt8387 != 0) {
					local393.oa(0, -super.anInt8387 << 2, 0);
				}
				if (super.anInt8438 != 0) {
					local393.M(super.anInt8438 * 2048);
				}
				if (local348) {
					if (super.anInt8375 != 0) {
						local393.MA(super.anInt8375);
					}
					if (super.anInt8389 != 0) {
						local393.W(super.anInt8389);
					}
					if (super.anInt8366 != 0) {
						local393.oa(0, super.anInt8366, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method6949() {
		@Pc(7) String local7 = "";
		if (Static410.aStringArray53 != null) {
			local7 = local7 + Static410.aStringArray53[this.aByte110];
		}
		@Pc(29) int[] local29;
		if (this.aByte109 == 1 && Static380.anIntArray370 != null) {
			local29 = Static380.anIntArray370;
		} else {
			local29 = Static515.anIntArray498;
		}
		if (local29 != null && local29[this.aByte110] != -1) {
			@Pc(49) Class40 local49 = Static231.aClass87_1.method2467(local29[this.aByte110]);
			if (local49.aChar3 == 's') {
				local7 = local7 + local49.method673(this.aByte108 & 0xFF);
			} else {
				Static205.method3450("gdn1", new Throwable());
				local29[this.aByte110] = -1;
			}
		}
		local7 = local7 + this.aString77;
		if (Static32.aStringArray8 != null) {
			local7 = local7 + Static32.aStringArray8[this.aByte110];
		}
		return local7;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IILclient!r;IBLclient!da;ILclient!q;)V")
	private void method6950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class57 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class8 arg6) {
		@Pc(15) int local15 = arg1 * arg1 + arg0 * arg0;
		if (local15 < 262144 || local15 > arg3) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
		@Pc(51) Class57 local51 = Static273.method6029(super.anInt8375, arg2, arg5, super.anInt8389, local39, super.anInt8366);
		if (local51 != null) {
			arg2.ZA(false);
			local51.method7927(arg6, null, 0);
			arg2.ZA(true);
		}
	}
}
