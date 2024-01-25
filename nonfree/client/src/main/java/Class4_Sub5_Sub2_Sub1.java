import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class4_Sub5_Sub2_Sub1 extends Class4_Sub5_Sub2 {

	@OriginalMember(owner = "client!of", name = "Gc", descriptor = "I")
	private int anInt4546;

	@OriginalMember(owner = "client!of", name = "Uc", descriptor = "Ljava/lang/String;")
	public String aString40;

	@OriginalMember(owner = "client!of", name = "Zc", descriptor = "Lclient!cc;")
	public Class31 aClass31_2;

	@OriginalMember(owner = "client!of", name = "id", descriptor = "Ljava/lang/String;")
	public String aString41;

	@OriginalMember(owner = "client!of", name = "Ac", descriptor = "B")
	private byte aByte30 = 0;

	@OriginalMember(owner = "client!of", name = "Lc", descriptor = "I")
	public int anInt4551 = -1;

	@OriginalMember(owner = "client!of", name = "Hc", descriptor = "I")
	public int anInt4547 = 0;

	@OriginalMember(owner = "client!of", name = "Bc", descriptor = "B")
	private byte aByte31 = 0;

	@OriginalMember(owner = "client!of", name = "ed", descriptor = "I")
	public int anInt4567 = -1;

	@OriginalMember(owner = "client!of", name = "ad", descriptor = "Z")
	public boolean aBoolean367 = false;

	@OriginalMember(owner = "client!of", name = "Jc", descriptor = "I")
	public int anInt4549 = -1;

	@OriginalMember(owner = "client!of", name = "jd", descriptor = "I")
	public int anInt4571 = -1;

	@OriginalMember(owner = "client!of", name = "nd", descriptor = "I")
	public int anInt4575 = 0;

	@OriginalMember(owner = "client!of", name = "Yc", descriptor = "I")
	public int anInt4563 = -1;

	@OriginalMember(owner = "client!of", name = "od", descriptor = "I")
	public int anInt4576 = 255;

	@OriginalMember(owner = "client!of", name = "pd", descriptor = "B")
	private byte aByte32 = 0;

	@OriginalMember(owner = "client!of", name = "Nc", descriptor = "I")
	public int anInt4553 = -1;

	@OriginalMember(owner = "client!of", name = "Ec", descriptor = "I")
	public int anInt4544 = 0;

	@OriginalMember(owner = "client!of", name = "dd", descriptor = "I")
	public int anInt4566 = 0;

	@OriginalMember(owner = "client!of", name = "Vc", descriptor = "I")
	public int anInt4560 = -1;

	@OriginalMember(owner = "client!of", name = "Dc", descriptor = "I")
	public int anInt4543 = 0;

	static {
		new Class85("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!ea;ZI)Z")
	private boolean method4117(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class88 local11 = this.method4805();
		@Pc(28) Class89 local28 = super.anInt5383 != -1 && super.anInt5382 == 0 ? Static162.method2849(super.anInt5383) : null;
		@Pc(48) Class89 local48 = super.anInt5361 == -1 || this.aBoolean367 || super.aBoolean446 && local28 != null ? null : Static162.method2849(super.anInt5361);
		@Pc(51) int local51 = local11.anInt2302;
		@Pc(54) int local54 = local11.anInt2273;
		if (local51 != 0 || local54 != 0 || local11.anInt2282 != 0 || local11.anInt2313 != 0) {
			arg1 |= 0x7;
		}
		super.aClass112Array3[0] = this.aClass31_2.method591(super.anInt5384, super.aClass193Array3, super.anInt5385, arg1, local48, super.anInt5389, super.anInt5409, super.anInt5365, arg0, super.anInt5396, local28);
		@Pc(104) int local104 = Static124.method2197();
		if (Static345.anInt6645 < 96 && local104 > 50) {
			Static338.method6004();
		}
		@Pc(130) int local130;
		if (Static125.anInt2409 != 0 && local104 < 50) {
			local130 = 50 - local104;
			while (Static193.anInt3688 < local130) {
				Static94.aByteArrayArray7[Static193.anInt3688] = new byte[102400];
				Static193.anInt3688++;
			}
			while (Static193.anInt3688 > local130) {
				Static193.anInt3688--;
				Static94.aByteArrayArray7[Static193.anInt3688] = null;
			}
		} else if (Static125.anInt2409 != 0) {
			Static94.aByteArrayArray7 = new byte[50][];
			Static193.anInt3688 = 0;
		}
		if (super.aClass112Array3[0] == null) {
			return false;
		}
		super.anInt5370 = super.aClass112Array3[0].method4331();
		this.method4817(super.aClass112Array3[0]);
		local130 = super.aClass207_7.method5877();
		super.anInt5366 = 0;
		super.anInt5367 = 0;
		super.anInt5411 = 0;
		if (local51 == 0 && local54 == 0) {
			this.method4816(this.method4807() << 7, local130, this.method4807() << 7);
		} else {
			this.method4816(local51, local130, local54);
			if (super.anInt5367 != 0) {
				super.aClass112Array3[0].method4352(super.anInt5367);
			}
			if (super.anInt5411 != 0) {
				super.aClass112Array3[0].method4315(super.anInt5411);
			}
			if (super.anInt5366 != 0) {
				super.aClass112Array3[0].method4324(0, super.anInt5366, 0);
			}
		}
		super.aClass112Array3[1] = null;
		if (!this.aBoolean367 && super.anInt5398 != -1 && super.anInt5404 != -1) {
			@Pc(294) Class163 local294 = Static325.method5628(super.anInt5398);
			@Pc(313) Class112 local313 = local294.method4486(super.anInt5404, super.anInt5369, arg0, (local294.aBoolean417 ? 7 : 2) | local7, super.anInt5358);
			if (local313 != null) {
				local313.method4324(0, -super.anInt5373, 0);
				if (local294.aBoolean417 && (local51 != 0 || local54 != 0)) {
					if (super.anInt5367 != 0) {
						local313.method4352(super.anInt5367);
					}
					if (super.anInt5411 != 0) {
						local313.method4315(super.anInt5411);
					}
					if (super.anInt5366 != 0) {
						local313.method4324(0, super.anInt5366, 0);
					}
				}
				super.aClass112Array3[1] = local313;
			}
		}
		super.aClass112Array3[2] = null;
		if (!this.aBoolean367 && super.anInterface5_3 != null) {
			if (super.anInt5420 <= Static283.anInt5563) {
				super.anInterface5_3 = null;
			}
			if (super.anInt5425 <= Static283.anInt5563 && Static283.anInt5563 < super.anInt5420) {
				@Pc(411) Class112 local411 = super.anInterface5_3.method5906(arg0, local7 | 0x7);
				if (local411 != null) {
					local411.method4324(-super.anInt6631 + super.anInt5418, -super.anInt6633 + super.anInt5424, super.anInt5415 - super.anInt6632);
					if (local130 != 0) {
						local411.method4309(-local130 & 0x3FFF);
					}
					super.aClass112Array3[2] = local411;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZIIIB)V")
	public void method4118(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.method4802(this.method4807(), arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!of", name = "i", descriptor = "(I)I")
	@Override
	public int method4815() {
		return -1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZLclient!ea;Lclient!ve;IIIILclient!ts;)V")
	private void method4119(@OriginalArg(1) Class55 arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class112 arg6) {
		@Pc(11) int local11 = arg2 * arg2 + arg5 * arg5;
		if (local11 < 16 || arg4 < local11) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg2, (double) arg5) * 2607.5945876176133D) & 0x3FFF;
		@Pc(52) Class112 local52 = Static248.method4435(arg0, super.anInt6631, super.anInt6632, arg6, local33, super.anInt5366, super.anInt5367, super.anInt5411, super.anInt6633, arg3);
		if (local52 != null) {
			arg0.method5259(false);
			local52.method4338(arg1, null, 0);
			arg0.method5259(true);
		}
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(I)I")
	@Override
	public int method5902() {
		return super.anInt5370;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5895() {
		return false;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method4120() {
		return this.aString40;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(ILclient!ea;)Lclient!ms;")
	@Override
	public Class32_Sub4 method5898(@OriginalArg(1) Class55 arg0) {
		if (this.aClass31_2 == null || !this.method4117(arg0, 1024)) {
			return null;
		}
		@Pc(19) Class66 local19 = arg0.method5195();
		@Pc(24) int local24 = super.aClass207_7.method5877();
		local19.method5826(local24);
		local19.method5825(super.anInt6631, super.anInt6633, super.anInt6632);
		@Pc(38) float local38 = arg0.method5231();
		@Pc(41) float local41 = arg0.method5232();
		if (Static157.aBoolean233) {
			@Pc(47) Class88 local47 = this.method4805();
			if (local47.aBoolean173 && (this.aClass31_2.anInt670 == -1 || Static22.method442(this.aClass31_2.anInt670).aBoolean244)) {
				@Pc(78) Class89 local78 = super.anInt5383 != -1 && super.anInt5382 == 0 ? Static162.method2849(super.anInt5383) : null;
				@Pc(98) Class89 local98 = super.anInt5361 == -1 || this.aBoolean367 || super.aBoolean446 && local78 != null ? null : Static162.method2849(super.anInt5361);
				@Pc(132) Class112 local132 = Static28.method627(local24, 1, super.aClass112Array3[0], local98 == null ? local78 : local98, super.aBoolean445, super.anInt5411, super.anInt5366, local98 == null ? super.anInt5365 : super.anInt5385, arg0, 0, 0, 160, super.anInt5367, 240);
				if (local132 != null) {
					arg0.method5156(local38, local41 - 128.0F);
					arg0.method5259(false);
					local132.method4338(local19, null, 0);
					arg0.method5259(true);
				}
			}
		}
		if (Static192.aClass4_Sub5_Sub2_Sub1_2 == this) {
			arg0.method5156(local38, local41 - 144.0F);
			local19.method5822(super.anInt6631, super.anInt6633, super.anInt6632);
			for (@Pc(173) int local173 = Static149.aClass131Array1.length - 1; local173 >= 0; local173--) {
				@Pc(179) Class131 local179 = Static149.aClass131Array1[local173];
				if (local179 != null && local179.anInt3893 != -1) {
					@Pc(228) int local228;
					@Pc(217) int local217;
					if (local179.anInt3892 == 1 && local179.anInt3886 >= 0 && Static280.aClass4_Sub5_Sub2_Sub2Array1.length > local179.anInt3886) {
						@Pc(205) Class4_Sub5_Sub2_Sub2 local205 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local179.anInt3886];
						if (local205 != null) {
							local217 = local205.anInt6631 / 32 - Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631 / 32;
							local228 = local205.anInt6632 / 32 - Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632 / 32;
							this.method4119(arg0, local19, local217, local179.anInt3893, 360000, local228, super.aClass112Array3[0]);
						}
					}
					if (local179.anInt3892 == 2) {
						@Pc(262) int local262 = (local179.anInt3879 - Static172.anInt4394) * 4 + 2 - Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631 / 32;
						local217 = (local179.anInt3885 - Static12.anInt3797) * 4 + 2 - Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632 / 32;
						local228 = local179.anInt3887 * 4;
						local228 *= local228;
						this.method4119(arg0, local19, local262, local179.anInt3893, local228, local217, super.aClass112Array3[0]);
					}
					if (local179.anInt3892 == 10 && local179.anInt3886 >= 0 && local179.anInt3886 < Static62.aClass4_Sub5_Sub2_Sub1Array1.length) {
						@Pc(320) Class4_Sub5_Sub2_Sub1 local320 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local179.anInt3886];
						if (local320 != null) {
							local217 = local320.anInt6631 / 32 - Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631 / 32;
							local228 = local320.anInt6632 / 32 - Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632 / 32;
							this.method4119(arg0, local19, local217, local179.anInt3893, 360000, local228, super.aClass112Array3[0]);
						}
					}
				}
			}
			local19.method5826(local24);
			local19.method5825(super.anInt6631, super.anInt6633, super.anInt6632);
		}
		arg0.method5156(local38, local41);
		@Pc(382) Class32_Sub4 local382 = Static232.method4183(super.aClass112Array3.length);
		if (super.aClass32_Sub7_7 == null) {
			arg0.method5244(super.aClass112Array3, local19, local382.aClass32_Sub8Array1, Static192.aClass4_Sub5_Sub2_Sub1_2 == this ? 1 : 0);
		} else {
			@Pc(404) Class146 local404 = super.aClass32_Sub7_7.method4955();
			arg0.method5214(super.aClass112Array3, local404, local19, local382.aClass32_Sub8Array1, Static192.aClass4_Sub5_Sub2_Sub1_2 == this ? 1 : 0);
		}
		this.method4804(false, super.aClass112Array3, arg0);
		if (super.aClass112Array3[2] != null) {
			if (local24 != 0) {
				super.aClass112Array3[2].method4309(local24);
			}
			super.aClass112Array3[2].method4324(-super.anInt5418 + super.anInt6631, super.anInt6633 + -super.anInt5424, super.anInt6632 - super.anInt5415);
		}
		return local382;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)I")
	@Override
	public int method4807() {
		return this.aClass31_2 == null || this.aClass31_2.anInt670 == -1 ? super.method4807() : Static22.method442(this.aClass31_2.anInt670).anInt3135;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILclient!ea;Lclient!ac;ZII)V")
	@Override
	public void method5897(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method5899(@OriginalArg(0) Class55 arg0) {
		if (this.aClass31_2 != null && (super.aBoolean449 || this.method4117(arg0, 0))) {
			this.method4804(super.aBoolean449, super.aClass112Array3, arg0);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method4121() {
		@Pc(5) String local5 = "";
		if (Static40.aStringArray10 != null) {
			local5 = local5 + Static40.aStringArray10[this.aByte30];
		}
		@Pc(27) int[] local27;
		if (this.aByte32 == 1 && Static175.anIntArray269 != null) {
			local27 = Static175.anIntArray269;
		} else {
			local27 = Static158.anIntArray518;
		}
		if (local27 != null && local27[this.aByte30] != -1) {
			@Pc(50) Class5_Sub1_Sub15 local50 = Static109.method1935(local27[this.aByte30]);
			if (local50.aChar3 == 's') {
				local5 = local5 + local50.method4039(this.aByte31 & 0xFF);
			} else {
				Static114.method1992(new Throwable(), "gdn1");
				local27[this.aByte30] = -1;
			}
		}
		local5 = local5 + this.aString41;
		if (Static11.aStringArray2 != null) {
			local5 = local5 + Static11.aStringArray2[this.aByte30];
		}
		return local5;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(B)I")
	@Override
	protected int method4801() {
		return this.anInt4546;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!rg;B)V")
	public void method4124(@OriginalArg(0) Class5_Sub12 arg0) {
		arg0.anInt5731 = 0;
		@Pc(12) int local12 = arg0.method5115();
		this.aByte32 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(41) int local41 = super.method4807();
		this.method4813((local12 >> 3 & 0x7) + 1);
		this.aByte30 = (byte) (local12 >> 6 & 0x3);
		super.anInt6631 += (this.method4807() - local41) * 64;
		super.anInt6632 += (this.method4807() - local41) * 64;
		this.aByte31 = arg0.method5098();
		this.anInt4571 = arg0.method5098();
		this.anInt4567 = arg0.method5098();
		@Pc(110) int local110 = -1;
		this.anInt4575 = 0;
		@Pc(116) int[] local116 = new int[12];
		@Pc(136) int local136;
		@Pc(142) int local142;
		@Pc(180) int local180;
		for (@Pc(118) int local118 = 0; local118 < 12; local118++) {
			@Pc(124) int local124 = arg0.method5115();
			if (local124 == 0) {
				local116[local118] = 0;
			} else {
				local136 = arg0.method5115();
				local142 = local136 + (local124 << 8);
				if (local118 == 0 && local142 == 65535) {
					local110 = arg0.method5106();
					this.anInt4575 = arg0.method5115();
					break;
				}
				if (local142 >= 32768) {
					local142 = Static47.anIntArray85[local142 - 32768];
					local116[local118] = local142 | 0x40000000;
					local180 = Static322.method544(local142).anInt3837;
					if (local180 != 0) {
						this.anInt4575 = local180;
					}
				} else {
					local116[local118] = local142 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(204) int[] local204 = new int[5];
		for (local136 = 0; local136 < 5; local136++) {
			local142 = arg0.method5115();
			if (local142 < 0 || local142 >= Static352.aShortArrayArray7[local136].length) {
				local142 = 0;
			}
			local204[local136] = local142;
		}
		this.anInt4546 = arg0.method5106();
		this.aString41 = arg0.method5064();
		if (local29) {
			this.aString40 = arg0.method5064();
		} else {
			this.aString40 = this.aString41;
		}
		this.anInt4566 = arg0.method5115();
		if (local37) {
			this.anInt4547 = arg0.method5106();
			this.anInt4544 = this.anInt4566;
			this.anInt4563 = -1;
		} else {
			this.anInt4547 = 0;
			this.anInt4544 = arg0.method5115();
			this.anInt4563 = arg0.method5115();
			if (this.anInt4563 == 255) {
				this.anInt4563 = -1;
			}
		}
		local142 = this.anInt4543;
		this.anInt4543 = arg0.method5115();
		@Pc(328) int local328;
		if (this.anInt4543 == 0) {
			Static235.method4167(this);
		} else {
			local180 = this.anInt4549;
			@Pc(325) int local325 = this.anInt4553;
			local328 = this.anInt4560;
			@Pc(331) int local331 = this.anInt4551;
			@Pc(334) int local334 = this.anInt4576;
			this.anInt4549 = arg0.method5106();
			this.anInt4553 = arg0.method5106();
			this.anInt4560 = arg0.method5106();
			this.anInt4551 = arg0.method5106();
			this.anInt4576 = arg0.method5115();
			if (this.anInt4543 != local142 || this.anInt4549 != local180 || this.anInt4553 != local325 || local328 != this.anInt4560 || local331 != this.anInt4551 || local334 != this.anInt4576) {
				Static235.method4165(this);
			}
		}
		if (this.aClass31_2 == null) {
			this.aClass31_2 = new Class31();
		}
		local180 = this.aClass31_2.anInt670;
		@Pc(414) int[] local414 = this.aClass31_2.anIntArray73;
		this.aClass31_2.method587(this.aByte32 == 1, local110, local116, this.method4801(), local204);
		if (local180 != local110) {
			super.anInt6631 = super.anIntArray523[0] * 128 + this.method4807() * 64;
			super.anInt6632 = super.anIntArray522[0] * 128 + this.method4807() * 64;
		}
		if (super.anInt5386 == 2047 && local414 != null) {
			for (local328 = 0; local328 < local204.length; local328++) {
				if (local204[local328] != local414[local328]) {
					Static153.method2739();
					break;
				}
			}
		}
		if (super.aClass32_Sub7_7 != null) {
			super.aClass32_Sub7_7.method4960();
		}
		if (super.anInt5361 == -1 || !super.aBoolean446) {
			return;
		}
		@Pc(522) Class88 local522 = this.method4805();
		if (!local522.method2143(super.anInt5361)) {
			super.aBoolean446 = false;
			super.anInt5361 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V")
	public void method4125(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray523[0];
		@Pc(15) int local15 = super.anIntArray522[0];
		if (arg0 == 0) {
			local10--;
			local15++;
		}
		if (arg0 == 1) {
			local15++;
		}
		if (arg0 == 2) {
			local15++;
			local10++;
		}
		if (arg0 == 3) {
			local10--;
		}
		if (arg0 == 4) {
			local10++;
		}
		if (arg0 == 5) {
			local10--;
			local15--;
		}
		if (arg0 == 6) {
			local15--;
		}
		if (super.anInt5383 != -1 && Static162.method2849(super.anInt5383).anInt2456 == 1) {
			super.anInt5383 = -1;
		}
		if (arg0 == 7) {
			local10++;
			local15--;
		}
		if (super.anInt5398 != -1) {
			@Pc(88) Class163 local88 = Static325.method5628(super.anInt5398);
			if (local88.aBoolean418 && local88.anInt5031 != -1 && Static162.method2849(local88.anInt5031).anInt2456 == 1) {
				super.anInt5398 = -1;
			}
		}
		if (super.anInt5413 < 9) {
			super.anInt5413++;
		}
		for (@Pc(120) int local120 = super.anInt5413; local120 > 0; local120--) {
			super.anIntArray523[local120] = super.anIntArray523[local120 - 1];
			super.anIntArray522[local120] = super.anIntArray522[local120 - 1];
			super.aByteArray74[local120] = super.aByteArray74[local120 - 1];
		}
		super.anIntArray523[0] = local10;
		super.anIntArray522[0] = local15;
		super.aByteArray74[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZILclient!ea;I)Z")
	@Override
	public boolean method5900(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass31_2 == null || !this.method4117(arg1, 65536)) {
			return true;
		}
		@Pc(19) Class66 local19 = arg1.method5195();
		@Pc(24) int local24 = super.aClass207_7.method5877();
		local19.method5826(local24);
		local19.method5825(super.anInt6631, super.anInt6633, super.anInt6632);
		for (@Pc(43) int local43 = 0; super.aClass112Array3.length > local43; local43++) {
			if (super.aClass112Array3[local43] != null && super.aClass112Array3[local43].method4340(arg2, arg0, local19, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
	@Override
	public void method5896() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!of", name = "k", descriptor = "(I)Z")
	public boolean method4126() {
		return this.aClass31_2 != null;
	}
}
