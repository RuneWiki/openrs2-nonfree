import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class9_Sub1_Sub1_Sub2_Sub2 extends Class9_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!og", name = "Zc", descriptor = "Lclient!efa;")
	public Class75 aClass75_1;

	@OriginalMember(owner = "client!og", name = "id", descriptor = "I")
	private int anInt6481;

	@OriginalMember(owner = "client!og", name = "jd", descriptor = "Ljava/lang/String;")
	public String aString94;

	@OriginalMember(owner = "client!og", name = "Jd", descriptor = "Ljava/lang/String;")
	public String aString95;

	@OriginalMember(owner = "client!og", name = "Md", descriptor = "I")
	public int anInt6502;

	@OriginalMember(owner = "client!og", name = "Pd", descriptor = "I")
	public int anInt6505;

	@OriginalMember(owner = "client!og", name = "fd", descriptor = "I")
	public int anInt6478 = -1;

	@OriginalMember(owner = "client!og", name = "dd", descriptor = "I")
	public int anInt6476 = 0;

	@OriginalMember(owner = "client!og", name = "pd", descriptor = "Z")
	public boolean aBoolean533 = false;

	@OriginalMember(owner = "client!og", name = "ud", descriptor = "Z")
	public boolean aBoolean534 = false;

	@OriginalMember(owner = "client!og", name = "Ad", descriptor = "I")
	public int anInt6493 = -1;

	@OriginalMember(owner = "client!og", name = "ad", descriptor = "I")
	public int anInt6473 = 0;

	@OriginalMember(owner = "client!og", name = "Fd", descriptor = "B")
	private byte aByte94 = 0;

	@OriginalMember(owner = "client!og", name = "Cd", descriptor = "I")
	public int anInt6495 = 0;

	@OriginalMember(owner = "client!og", name = "xd", descriptor = "Z")
	public boolean aBoolean535 = false;

	@OriginalMember(owner = "client!og", name = "Dd", descriptor = "I")
	public int anInt6496 = -1;

	@OriginalMember(owner = "client!og", name = "Id", descriptor = "I")
	public int anInt6500 = 0;

	@OriginalMember(owner = "client!og", name = "Ld", descriptor = "B")
	private byte aByte95 = 0;

	@OriginalMember(owner = "client!og", name = "nd", descriptor = "Z")
	public boolean aBoolean532 = false;

	@OriginalMember(owner = "client!og", name = "od", descriptor = "B")
	private byte aByte93 = 0;

	@OriginalMember(owner = "client!og", name = "td", descriptor = "I")
	public int anInt6488 = -1;

	@OriginalMember(owner = "client!og", name = "Ed", descriptor = "I")
	public int anInt6497 = -1;

	@OriginalMember(owner = "client!og", name = "Sd", descriptor = "I")
	public int anInt6508 = 255;

	@OriginalMember(owner = "client!og", name = "Nd", descriptor = "I")
	public int anInt6503 = 0;

	@OriginalMember(owner = "client!og", name = "cd", descriptor = "I")
	public int anInt6475 = -1;

	@OriginalMember(owner = "client!og", name = "Td", descriptor = "I")
	public int anInt6509 = -1;

	@OriginalMember(owner = "client!og", name = "ld", descriptor = "I")
	public int anInt6483 = -1;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!r;BII)Z")
	@Override
	public boolean method7474(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass75_1 == null || !this.method5588(131072, arg0)) {
			return false;
		}
		@Pc(27) Class109 local27 = arg0.method7142();
		@Pc(32) int local32 = super.aClass147_7.method3814();
		local27.o(local32);
		local27.U(super.anInt8975, super.anInt8977, super.anInt8980);
		@Pc(45) boolean local45 = false;
		for (@Pc(47) int local47 = 0; super.aClass57Array3.length > local47; local47++) {
			if (super.aClass57Array3[local47] != null && (Static225.aBoolean335 ? super.aClass57Array3[local47].method7509(arg1, arg2, local27, true, Static354.anInt6136) : super.aClass57Array3[local47].method7507(arg1, arg2, local27, true))) {
				local45 = true;
				break;
			}
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = null;
		return local45;
	}

	@OriginalMember(owner = "client!og", name = "o", descriptor = "(I)I")
	@Override
	public int method5574() {
		return -1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method5577() {
		@Pc(7) String local7 = "";
		if (Static155.aStringArray20 != null) {
			local7 = local7 + Static155.aStringArray20[this.aByte93];
		}
		@Pc(35) int[] local35;
		if (this.aByte94 == 1 && Static16.anIntArray28 != null) {
			local35 = Static16.anIntArray28;
		} else {
			local35 = Static183.anIntArray306;
		}
		if (local35 != null && local35[this.aByte93] != -1) {
			@Pc(55) Class129 local55 = Static11.aClass155_1.method3928(local35[this.aByte93]);
			if (local55.aChar3 == 's') {
				local7 = local7 + local55.method3303(this.aByte95 & 0xFF);
			} else {
				Static379.method5607("gdn1", new Throwable());
				local35[this.aByte93] = -1;
			}
		}
		local7 = local7 + this.aString95;
		if (Static387.aStringArray39 != null) {
			local7 = local7 + Static387.aStringArray39[this.aByte93];
		}
		return local7;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!r;)Lclient!bm;")
	@Override
	public Class29 method7469(@OriginalArg(1) Class43 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZBI)V")
	public void method5580(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6468 < 9) {
			super.anInt6468++;
		}
		for (@Pc(16) int local16 = super.anInt6468; local16 > 0; local16--) {
			super.anIntArray518[local16] = super.anIntArray518[local16 - 1];
			super.anIntArray517[local16] = super.anIntArray517[local16 - 1];
			super.aByteArray84[local16] = super.aByteArray84[local16 - 1];
		}
		super.anIntArray518[0] = arg2;
		super.anIntArray517[0] = arg0;
		super.aByteArray84[0] = arg1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method5581() {
		return this.aString94;
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7483() {
		return false;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!gfa;IILclient!r;Z)V")
	@Override
	public void method7479(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class43 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(B)Z")
	public boolean method5582() {
		return this.aClass75_1 != null;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!q;ILclient!r;IIILclient!da;)V")
	private void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class43 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class57 arg7) {
		@Pc(11) int local11 = arg6 * arg6 + arg0 * arg0;
		if (local11 < 262144 || arg5 < local11) {
			return;
		}
		@Pc(37) int local37 = (int) (Math.atan2((double) arg6, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(51) Class57 local51 = Static171.method2975(super.anInt6422, arg4, arg1, local37, super.anInt6396, super.anInt6434);
		if (local51 != null) {
			arg4.ZA(false);
			local51.method7521(arg2, null, arg3, 0);
			arg4.ZA(true);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)I")
	@Override
	protected int method5571() {
		return this.anInt6481;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(III)V")
	public void method5585(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anInt6468 = 0;
		super.anInt6469 = 0;
		super.anIntArray518[0] = arg0;
		super.anInt6467 = 0;
		super.anIntArray517[0] = arg1;
		@Pc(26) int local26 = this.method5569();
		super.anInt8975 = super.anIntArray518[0] * 512 + local26 * 256;
		super.anInt8980 = local26 * 256 + super.anIntArray517[0] * 512;
		if (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == this) {
			Static578.method7669();
		}
		if (super.aClass9_Sub6_7 != null) {
			super.aClass9_Sub6_7.method3048();
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(ILclient!r;)Lclient!fe;")
	@Override
	public Class9_Sub2 method7480(@OriginalArg(1) Class43 arg0) {
		if (this.aClass75_1 == null || !this.method5588(2048, arg0)) {
			return null;
		}
		@Pc(19) Class109 local19 = arg0.method7142();
		@Pc(24) int local24 = super.aClass147_7.method3814();
		local19.o(local24);
		@Pc(42) Class63 local42 = Static554.aClass63ArrayArrayArray4[super.aByte126][super.anInt8975 >> Static458.anInt7508][super.anInt8980 >> Static458.anInt7508];
		@Pc(55) int local55;
		if (local42 == null || local42.aClass9_Sub1_Sub3_1 == null) {
			super.anInt6447 = (int) ((float) super.anInt6447 - (float) super.anInt6447 / 10.0F);
		} else {
			local55 = super.anInt6447 - local42.aClass9_Sub1_Sub3_1.aShort42;
			super.anInt6447 = (int) ((float) super.anInt6447 - (float) local55 / 10.0F);
		}
		local19.U(super.anInt8975, -super.anInt6447 + super.anInt8977 - 20, super.anInt8980);
		super.aBoolean529 = false;
		if (Static278.aClass3_Sub13_Sub1_1.aBoolean400) {
			@Pc(104) Class267 local104 = this.method5573();
			if (local104.aBoolean559 && (this.aClass75_1.anInt2650 == -1 || Static510.aClass284_2.method6281(this.aClass75_1.anInt2650).aBoolean601)) {
				@Pc(136) Class17 local136 = super.anInt6453 != -1 && super.anInt6438 == 0 ? Static330.aClass279_2.method6216(super.anInt6453) : null;
				@Pc(156) Class17 local156 = super.anInt6461 == -1 || this.aBoolean533 || super.aBoolean528 && local136 != null ? null : Static330.aClass279_2.method6216(super.anInt6461);
				@Pc(188) Class57 local188 = Static98.method2144(local156 == null ? local136 : local156, arg0, local24, 160, 0, 0, 240, 1, super.anInt6396, super.anInt6434, local156 == null ? super.anInt6385 : super.anInt6437, super.aClass57Array3[0], super.anInt6422);
				if (local188 != null) {
					super.aBoolean529 = true;
					arg0.ZA(false);
					if (Static225.aBoolean335) {
						local188.method7521(local19, null, Static354.anInt6136, 0);
					} else {
						local188.method7501(local19, null, 0);
					}
					arg0.ZA(true);
				}
			}
		}
		if (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == this) {
			local19.NA(super.anInt8975, super.anInt8977, super.anInt8980);
			for (local55 = Static443.aClass122Array1.length - 1; local55 >= 0; local55--) {
				@Pc(236) Class122 local236 = Static443.aClass122Array1[local55];
				if (local236 != null && local236.anInt3549 != -1) {
					@Pc(268) int local268;
					if (local236.anInt3557 == 1) {
						@Pc(256) Class3_Sub39 local256 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local236.anInt3554);
						if (local256 != null) {
							@Pc(261) Class9_Sub1_Sub1_Sub2_Sub1 local261 = local256.aClass9_Sub1_Sub1_Sub2_Sub1_2;
							local268 = local261.anInt8975 - Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975;
							@Pc(274) int local274 = local261.anInt8980 - Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980;
							if (Static225.aBoolean335) {
								this.method5584(local274, local236.anInt3549, local19, Static354.anInt6136, arg0, 92160000, local268, super.aClass57Array3[0]);
							} else {
								this.method5586(local268, super.aClass57Array3[0], 92160000, arg0, local19, local274, local236.anInt3549);
							}
						}
					}
					@Pc(331) int local331;
					if (local236.anInt3557 == 2) {
						@Pc(322) int local322 = local236.anInt3555 + 256 - Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975;
						local331 = local236.anInt3553 + 256 - Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980;
						local268 = local236.anInt3548 << 9;
						local268 *= local268;
						if (Static225.aBoolean335) {
							this.method5584(local331, local236.anInt3549, local19, Static354.anInt6136, arg0, local268, local322, super.aClass57Array3[0]);
						} else {
							this.method5586(local322, super.aClass57Array3[0], local268, arg0, local19, local331, local236.anInt3549);
						}
					}
					if (local236.anInt3557 == 10 && local236.anInt3554 >= 0 && local236.anInt3554 < Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2.length) {
						@Pc(395) Class9_Sub1_Sub1_Sub2_Sub2 local395 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local236.anInt3554];
						if (local395 != null) {
							local331 = local395.anInt8975 - Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975;
							local268 = local395.anInt8980 - Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980;
							if (Static225.aBoolean335) {
								this.method5584(local268, local236.anInt3549, local19, Static354.anInt6136, arg0, 92160000, local331, super.aClass57Array3[0]);
							} else {
								this.method5586(local331, super.aClass57Array3[0], 92160000, arg0, local19, local268, local236.anInt3549);
							}
						}
					}
				}
			}
			local19.o(local24);
			local19.U(super.anInt8975, super.anInt8977, super.anInt8980);
		}
		local19.o(local24);
		local19.U(super.anInt8975, super.anInt8977 - super.anInt6447 - 5, super.anInt8980);
		@Pc(484) Class9_Sub2 local484 = Static88.method1977(super.aClass57Array3.length);
		this.method5570(local19, arg0, false, super.aClass57Array3);
		@Pc(502) int local502;
		if (Static225.aBoolean335) {
			for (local502 = 0; super.aClass57Array3.length > local502; local502++) {
				if (super.aClass57Array3[local502] != null) {
					super.aClass57Array3[local502].method7521(local19, local484.aClass9_Sub9Array1[local502], Static354.anInt6136, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local502 = 0; local502 < super.aClass57Array3.length; local502++) {
				if (super.aClass57Array3[local502] != null) {
					super.aClass57Array3[local502].method7501(local19, local484.aClass9_Sub9Array1[local502], Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass9_Sub6_7 != null) {
			@Pc(576) Class96 local576 = super.aClass9_Sub6_7.method3053();
			if (Static225.aBoolean335) {
				arg0.method7176(local576, Static354.anInt6136);
			} else {
				arg0.method7189(local576);
			}
		}
		for (local502 = 0; super.aClass57Array3.length > local502; local502++) {
			if (super.aClass57Array3[local502] != null) {
				super.aBoolean529 |= super.aClass57Array3[local502].LA();
			}
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = null;
		super.anInt6404 = Static337.anInt5983;
		return local484;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7471(@OriginalArg(1) Class43 arg0) {
		if (this.aClass75_1 == null || !super.aBoolean530 && !this.method5588(0, arg0)) {
			return;
		}
		@Pc(29) Class109 local29 = arg0.method7142();
		local29.o(super.aClass147_7.method3814());
		local29.U(super.anInt8975, super.anInt8977 - 5, super.anInt8980);
		this.method5570(local29, arg0, super.aBoolean530, super.aClass57Array3);
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = null;
	}

	@OriginalMember(owner = "client!og", name = "l", descriptor = "(I)I")
	@Override
	public int method5569() {
		return this.aClass75_1 == null || this.aClass75_1.anInt2650 == -1 ? super.method5569() : Static510.aClass284_2.method6281(this.aClass75_1.anInt2650).anInt7615;
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
	@Override
	public void method7477() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!da;ZILclient!r;Lclient!q;II)V")
	private void method5586(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class43 arg3, @OriginalArg(5) Class109 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg0 * arg0 + arg5 * arg5;
		if (local11 < 262144 || arg2 < local11) {
			return;
		}
		@Pc(37) int local37 = (int) (Math.atan2((double) arg0, (double) arg5) * 2607.5945876176133D) & 0x3FFF;
		@Pc(49) Class57 local49 = Static171.method2975(super.anInt6422, arg3, arg6, local37, super.anInt6396, super.anInt6434);
		if (local49 != null) {
			arg3.ZA(false);
			local49.method7501(arg4, null, 0);
			arg3.ZA(true);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIBI)V")
	public void method5587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (super.anInt6453 != -1 && Static330.aClass279_2.method6216(super.anInt6453).anInt560 == 1) {
			super.anIntArray515 = null;
			super.anInt6453 = -1;
		}
		@Pc(33) Class175 local33;
		if (super.anInt6424 != -1) {
			local33 = Static547.aClass248_2.method5708(super.anInt6424);
			if (local33.aBoolean386 && local33.anInt4956 != -1 && Static330.aClass279_2.method6216(local33.anInt4956).anInt560 == 1) {
				super.anInt6424 = -1;
			}
		}
		if (super.anInt6384 != -1) {
			local33 = Static547.aClass248_2.method5708(super.anInt6384);
			if (local33.aBoolean386 && local33.anInt4956 != -1 && Static330.aClass279_2.method6216(local33.anInt4956).anInt560 == 1) {
				super.anInt6384 = -1;
			}
		}
		this.anInt6497 = -1;
		if (arg1 < 0 || Static400.anInt6818 <= arg1 || arg0 < 0 || arg0 >= Static271.anInt5050) {
			this.method5585(arg1, arg0);
		} else if (super.anIntArray518[0] >= 0 && super.anIntArray518[0] < Static400.anInt6818 && super.anIntArray517[0] >= 0 && Static271.anInt5050 > super.anIntArray517[0]) {
			if (arg2 == 2) {
				Static217.method3779(this, arg0, arg1);
			}
			this.method5580(arg0, arg2, arg1);
		} else {
			this.method5585(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BILclient!r;)Z")
	private boolean method5588(@OriginalArg(1) int arg0, @OriginalArg(2) Class43 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(21) Class267 local21 = this.method5573();
		@Pc(37) Class17 local37 = super.anInt6453 != -1 && super.anInt6438 == 0 ? Static330.aClass279_2.method6216(super.anInt6453) : null;
		@Pc(58) Class17 local58 = super.anInt6461 == -1 || this.aBoolean533 || super.aBoolean528 && local37 != null ? null : Static330.aClass279_2.method6216(super.anInt6461);
		@Pc(61) int local61 = local21.anInt7031;
		@Pc(64) int local64 = local21.anInt7050;
		if (local61 != 0 || local64 != 0 || local21.anInt7019 != 0 || local21.anInt7032 != 0) {
			arg0 |= 0x7;
		}
		@Pc(102) boolean local102 = super.aByte89 != 0 && Static305.anInt5560 >= super.anInt6456 && Static305.anInt5560 < super.anInt6388;
		if (local102) {
			arg0 |= 0x80000;
		}
		@Pc(143) Class57 local143 = super.aClass57Array3[0] = this.aClass75_1.method2378(super.anInt6403, Static107.aClass352_2, super.anInt6441, super.anInt6385, Static427.aClass56_1, Static517.aClass145_1, super.aClass52Array3, Static330.aClass279_2, local37, arg1, Static510.aClass284_2, arg0, super.anInt6437, Static363.aClass135_1, super.anInt6393, super.anInt6440, local58);
		@Pc(146) int local146 = Static150.method2784();
		if (Static597.anInt9433 < 96 && local146 > 50) {
			Static466.method7466();
		}
		@Pc(165) int local165;
		if (Static555.aClass173_8 != Static559.aClass173_9 && local146 < 50) {
			local165 = 50 - local146;
			while (Static438.anInt4408 < local165) {
				Static366.aByteArrayArray16[Static438.anInt4408] = new byte[102400];
				Static438.anInt4408++;
			}
			while (Static438.anInt4408 > local165) {
				Static438.anInt4408--;
				Static366.aByteArrayArray16[Static438.anInt4408] = null;
			}
		} else if (Static555.aClass173_8 != Static559.aClass173_9) {
			Static438.anInt4408 = 0;
			Static366.aByteArrayArray16 = new byte[50][];
		}
		if (local143 == null) {
			return false;
		}
		super.anInt6457 = local143.J();
		super.anInt6410 = local143.RA();
		this.method5576(local143);
		local165 = super.aClass147_7.method3814();
		if (local61 == 0 && local64 == 0) {
			this.method5561(0, 0, local165, this.method5569() << 9, this.method5569() << 9);
		} else {
			this.method5561(local21.anInt7043, local21.anInt7015, local165, local64, local61);
			if (super.anInt6422 != 0) {
				local143.MA(super.anInt6422);
			}
			if (super.anInt6434 != 0) {
				local143.W(super.anInt6434);
			}
			if (super.anInt6396 != 0) {
				local143.oa(0, super.anInt6396, 0);
			}
		}
		if (local102) {
			local143.method7523(super.aByte91, super.aByte90, super.aByte92, super.aByte89 & 0xFF);
		}
		@Pc(319) Class175 local319;
		@Pc(339) boolean local339;
		@Pc(341) int local341;
		@Pc(384) Class57 local384;
		if (this.aBoolean533 || super.anInt6424 == -1 || super.lb == -1) {
			super.aClass57Array3[1] = null;
		} else {
			local319 = Static547.aClass248_2.method5708(super.anInt6424);
			local339 = local319.aByte60 == 3 && (local61 != 0 || local64 != 0);
			local341 = local7;
			if (local339) {
				local341 = local7 | 0x7;
			} else {
				if (super.anInt6390 != 0) {
					local341 = local7 | 0x5;
				}
				if (super.anInt6443 != 0) {
					local341 |= 0x2;
				}
			}
			local384 = super.aClass57Array3[1] = local319.method4324(Static330.aClass279_2, super.anInt6412, super.anInt6386, super.lb, local341, arg1);
			if (local384 != null) {
				if (super.anInt6443 != 0) {
					local384.oa(0, -super.anInt6443 << 2, 0);
				}
				if (super.anInt6390 != 0) {
					local384.M(super.anInt6390 * 2048);
				}
				if (local339) {
					if (super.anInt6422 != 0) {
						local384.MA(super.anInt6422);
					}
					if (super.anInt6434 != 0) {
						local384.W(super.anInt6434);
					}
					if (super.anInt6396 != 0) {
						local384.oa(0, super.anInt6396, 0);
					}
				}
			}
		}
		if (this.aBoolean533 || super.anInt6384 == -1 || super.anInt6444 == -1) {
			super.aClass57Array3[2] = null;
		} else {
			local319 = Static547.aClass248_2.method5708(super.anInt6384);
			local339 = local319.aByte60 == 3 && (local61 != 0 || local64 != 0);
			local341 = local7;
			if (local339) {
				local341 = local7 | 0x7;
			} else {
				if (super.anInt6409 != 0) {
					local341 = local7 | 0x5;
				}
				if (super.anInt6418 != 0) {
					local341 |= 0x2;
				}
			}
			local384 = super.aClass57Array3[2] = local319.method4327(Static330.aClass279_2, arg1, super.anInt6400, local341, super.anInt6420, super.anInt6444);
			if (local384 != null) {
				if (super.anInt6418 != 0) {
					local384.oa(0, -super.anInt6418 << 2, 0);
				}
				if (super.anInt6409 != 0) {
					local384.M(super.anInt6409 * 2048);
				}
				if (local339) {
					if (super.anInt6422 != 0) {
						local384.MA(super.anInt6422);
					}
					if (super.anInt6434 != 0) {
						local384.W(super.anInt6434);
					}
					if (super.anInt6396 != 0) {
						local384.oa(0, super.anInt6396, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!qh;I)V")
	public void method5589(@OriginalArg(0) Class3_Sub11 arg0) {
		arg0.anInt3520 = 0;
		@Pc(12) int local12 = arg0.method3118();
		this.aByte94 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean534;
		this.aBoolean534 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(45) int local45 = super.method5569();
		this.method5565((local12 >> 3 & 0x7) + 1);
		this.aByte93 = (byte) (local12 >> 6 & 0x3);
		super.anInt8975 += this.method5569() - local45 << 8;
		super.anInt8980 += this.method5569() - local45 << 8;
		this.aByte95 = arg0.method3096();
		this.anInt6475 = arg0.method3096();
		this.anInt6488 = arg0.method3096();
		@Pc(106) int local106 = -1;
		this.anInt6500 = 0;
		@Pc(112) int[] local112 = new int[12];
		@Pc(142) int local142;
		@Pc(148) int local148;
		@Pc(187) int local187;
		for (@Pc(121) int local121 = 0; local121 < 12; local121++) {
			@Pc(127) int local127 = arg0.method3118();
			if (local127 == 0) {
				local112[local121] = 0;
			} else {
				local142 = arg0.method3118();
				local148 = local142 + (local127 << 8);
				if (local121 == 0 && local148 == 65535) {
					local106 = arg0.method3109();
					this.anInt6500 = arg0.method3118();
					break;
				}
				if (local148 >= 32768) {
					local148 = Static404.anIntArray546[local148 - 32768];
					local112[local121] = local148 | 0x40000000;
					local187 = Static517.aClass145_1.method3798(local148).anInt8822;
					if (local187 != 0) {
						this.anInt6500 = local187;
					}
				} else {
					local112[local121] = Integer.MIN_VALUE | local148 - 256;
				}
			}
		}
		@Pc(214) int[] local214 = new int[5];
		for (local142 = 0; local142 < 5; local142++) {
			local148 = arg0.method3118();
			if (Static429.aShortArrayArrayArray3.length < 1 || local148 < 0 || Static429.aShortArrayArrayArray3[0][local142].length <= local148) {
				local148 = 0;
			}
			local214[local142] = local148;
		}
		this.anInt6481 = arg0.method3109();
		this.aString95 = arg0.method3133();
		this.aString94 = this.aString95;
		this.anInt6503 = arg0.method3118();
		if (local41) {
			this.anInt6473 = arg0.method3109();
			this.anInt6509 = -1;
			if (this.anInt6473 == 65535) {
				this.anInt6473 = -1;
			}
			this.anInt6495 = this.anInt6503;
		} else {
			this.anInt6473 = 0;
			this.anInt6495 = arg0.method3118();
			this.anInt6509 = arg0.method3118();
			if (this.anInt6509 == 255) {
				this.anInt6509 = -1;
			}
		}
		local148 = this.anInt6476;
		this.anInt6476 = arg0.method3118();
		@Pc(337) int local337;
		if (this.anInt6476 == 0) {
			Static575.method7625(this);
		} else {
			local187 = this.anInt6493;
			@Pc(334) int local334 = this.anInt6483;
			local337 = this.anInt6496;
			@Pc(340) int local340 = this.anInt6478;
			@Pc(343) int local343 = this.anInt6508;
			this.anInt6493 = arg0.method3109();
			this.anInt6483 = arg0.method3109();
			this.anInt6496 = arg0.method3109();
			this.anInt6478 = arg0.method3109();
			this.anInt6508 = arg0.method3118();
			if (local21 != this.aBoolean534 || this.anInt6476 != local148 || this.anInt6493 != local187 || local334 != this.anInt6483 || this.anInt6496 != local337 || this.anInt6478 != local340 || this.anInt6508 != local343) {
				Static468.method6466(this);
			}
		}
		if (this.aClass75_1 == null) {
			this.aClass75_1 = new Class75();
		}
		local187 = this.aClass75_1.anInt2650;
		@Pc(423) int[] local423 = this.aClass75_1.anIntArray193;
		this.aClass75_1.method2385(local112, local106, this.aByte94 == 1, this.method5571(), local214);
		if (local106 != local187) {
			super.anInt8975 = (super.anIntArray518[0] << 9) + (this.method5569() << 8);
			super.anInt8980 = (super.anIntArray517[0] << 9) + (this.method5569() << 8);
		}
		if (Static502.anInt8011 == super.anInt6429 && local423 != null) {
			for (local337 = 0; local337 < local214.length; local337++) {
				if (local214[local337] != local423[local337]) {
					Static517.aClass145_1.method3797();
					break;
				}
			}
		}
		if (super.aClass9_Sub6_7 != null) {
			super.aClass9_Sub6_7.method3048();
		}
		if (super.anInt6461 == -1 || !super.aBoolean528) {
			return;
		}
		@Pc(524) Class267 local524 = this.method5573();
		if (!local524.method6006(super.anInt6461)) {
			super.anInt6461 = -1;
			super.aBoolean528 = false;
			return;
		}
	}
}
