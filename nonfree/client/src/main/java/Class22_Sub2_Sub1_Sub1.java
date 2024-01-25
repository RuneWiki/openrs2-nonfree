import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class22_Sub2_Sub1_Sub1 extends Class22_Sub2_Sub1 {

	@OriginalMember(owner = "client!cc", name = "Hc", descriptor = "Ljava/lang/String;")
	public String aString78;

	@OriginalMember(owner = "client!cc", name = "md", descriptor = "Lclient!we;")
	public Class214 aClass214_1;

	@OriginalMember(owner = "client!cc", name = "sd", descriptor = "Ljava/lang/String;")
	public String aString80;

	@OriginalMember(owner = "client!cc", name = "wd", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!cc", name = "Gc", descriptor = "I")
	public int anInt1003 = -1;

	@OriginalMember(owner = "client!cc", name = "Vc", descriptor = "I")
	public int anInt1012 = -1;

	@OriginalMember(owner = "client!cc", name = "Oc", descriptor = "I")
	public int anInt1010 = -1;

	@OriginalMember(owner = "client!cc", name = "Pc", descriptor = "B")
	private byte aByte19 = 0;

	@OriginalMember(owner = "client!cc", name = "Fc", descriptor = "I")
	public int anInt1002 = 255;

	@OriginalMember(owner = "client!cc", name = "Kc", descriptor = "I")
	public int anInt1006 = -1;

	@OriginalMember(owner = "client!cc", name = "ad", descriptor = "I")
	public int anInt1017 = 0;

	@OriginalMember(owner = "client!cc", name = "Qc", descriptor = "Z")
	public boolean aBoolean75 = false;

	@OriginalMember(owner = "client!cc", name = "dd", descriptor = "I")
	public int anInt1020 = 0;

	@OriginalMember(owner = "client!cc", name = "hd", descriptor = "I")
	public int anInt1023 = -1;

	@OriginalMember(owner = "client!cc", name = "Ic", descriptor = "I")
	public int anInt1004 = 0;

	@OriginalMember(owner = "client!cc", name = "vd", descriptor = "I")
	public int anInt1033 = 0;

	@OriginalMember(owner = "client!cc", name = "kd", descriptor = "I")
	public int anInt1026 = 0;

	@OriginalMember(owner = "client!cc", name = "Rc", descriptor = "B")
	private byte aByte20 = 0;

	@OriginalMember(owner = "client!cc", name = "Ec", descriptor = "I")
	public int anInt1001 = -1;

	@OriginalMember(owner = "client!cc", name = "cd", descriptor = "I")
	public int anInt1019 = -1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	@Override
	public int method4410() {
		return -1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZILclient!hh;Lclient!pe;III)V")
	@Override
	public void method5340(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) Class89 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!ap;)V")
	public void method817(@OriginalArg(1) Class7_Sub3 arg0) {
		arg0.anInt3005 = 0;
		@Pc(10) int local10 = arg0.method2772();
		@Pc(14) int local14 = local10 & 0x1;
		@Pc(25) boolean local25 = (local10 & 0x2) != 0;
		@Pc(33) boolean local33 = (local10 & 0x4) != 0;
		@Pc(37) int local37 = super.method4421();
		this.method4420((local10 >> 3 & 0x7) + 1);
		this.aByte20 = (byte) (local10 >> 6 & 0x3);
		super.anInt5973 += (this.method4421() - local37) * 64;
		super.anInt5967 += (this.method4421() - local37) * 64;
		this.aByte19 = arg0.method2779();
		this.anInt1019 = arg0.method2779();
		this.anInt1001 = arg0.method2779();
		@Pc(98) int local98 = -1;
		this.anInt1026 = 0;
		@Pc(104) int[] local104 = new int[12];
		@Pc(122) int local122;
		@Pc(128) int local128;
		@Pc(168) int local168;
		for (@Pc(106) int local106 = 0; local106 < 12; local106++) {
			@Pc(111) int local111 = arg0.method2772();
			if (local111 == 0) {
				local104[local106] = 0;
			} else {
				local122 = arg0.method2772();
				local128 = local122 + (local111 << 8);
				if (local106 == 0 && local128 == 65535) {
					local98 = arg0.method2764();
					this.anInt1026 = arg0.method2772();
					break;
				}
				if (local128 >= 32768) {
					local128 = Static326.anIntArray788[local128 - 32768];
					local104[local106] = local128 | 0x40000000;
					local168 = Static17.method4472(local128).anInt3999;
					if (local168 != 0) {
						this.anInt1026 = local168;
					}
				} else {
					local104[local106] = local128 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(194) int[] local194 = new int[5];
		for (local122 = 0; local122 < 5; local122++) {
			local128 = arg0.method2772();
			if (local128 < 0 || local128 >= Static314.aShortArrayArray7[local122].length) {
				local128 = 0;
			}
			local194[local122] = local128;
		}
		this.anInt1034 = arg0.method2764();
		this.aString80 = arg0.method2782();
		if (local25) {
			this.aString78 = arg0.method2782();
		} else {
			this.aString78 = this.aString80;
		}
		this.anInt1020 = arg0.method2772();
		if (local33) {
			this.anInt1033 = arg0.method2764();
			this.anInt1006 = -1;
			this.anInt1017 = this.anInt1020;
		} else {
			this.anInt1033 = 0;
			this.anInt1017 = arg0.method2772();
			this.anInt1006 = arg0.method2772();
			if (this.anInt1006 == 255) {
				this.anInt1006 = -1;
			}
		}
		local128 = this.anInt1004;
		this.anInt1004 = arg0.method2772();
		@Pc(318) int local318;
		if (this.anInt1004 == 0) {
			Static291.method4772(this);
		} else {
			local168 = this.anInt1003;
			@Pc(315) int local315 = this.anInt1010;
			local318 = this.anInt1012;
			@Pc(321) int local321 = this.anInt1023;
			@Pc(324) int local324 = this.anInt1002;
			this.anInt1003 = arg0.method2764();
			this.anInt1010 = arg0.method2764();
			this.anInt1012 = arg0.method2764();
			this.anInt1023 = arg0.method2764();
			this.anInt1002 = arg0.method2772();
			if (this.anInt1004 != local128 || local168 != this.anInt1003 || local315 != this.anInt1010 || local318 != this.anInt1012 || this.anInt1023 != local321 || this.anInt1002 != local324) {
				Static41.method879(this);
			}
		}
		if (this.aClass214_1 == null) {
			this.aClass214_1 = new Class214();
		}
		local168 = this.aClass214_1.anInt6557;
		@Pc(396) int[] local396 = this.aClass214_1.anIntArray832;
		this.aClass214_1.method5590(local14 == 1, local194, local98, local104, this.method4418());
		if (local168 != local98) {
			super.anInt5973 = super.anIntArray666[0] * 128 + this.method4421() * 64;
			super.anInt5967 = super.anIntArray665[0] * 128 + this.method4421() * 64;
		}
		if (super.anInt5115 == 2047 && local396 != null) {
			for (local318 = 0; local318 < local194.length; local318++) {
				if (local396[local318] != local194[local318]) {
					Static23.method4814();
					break;
				}
			}
		}
		if (super.aClass36_Sub3_5 != null) {
			super.aClass36_Sub3_5.method2177();
		}
		if (super.anInt5100 == -1 || !super.aBoolean378) {
			return;
		}
		@Pc(493) Class79 local493 = this.method4417();
		if (!local493.method1984(super.anInt5100)) {
			super.anInt5100 = -1;
			super.aBoolean378 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!pe;)V")
	@Override
	public void method5341(@OriginalArg(1) Class89 arg0) {
		if (this.aClass214_1 != null && (super.aBoolean380 || this.method823(0, arg0))) {
			this.method4409(super.aClass31Array3, arg0, super.aBoolean380);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method818() {
		@Pc(5) String local5 = "";
		if (Static48.aStringArray45 != null) {
			local5 = local5 + Static48.aStringArray45[this.aByte20];
		}
		if (Static217.anIntArray841 != null && Static217.anIntArray841[this.aByte20] != -1) {
			@Pc(42) Class7_Sub1_Sub16 local42 = Static288.method1010(Static217.anIntArray841[this.aByte20]);
			if (local42.aChar5 == 's') {
				local5 = local5 + local42.method4895(this.aByte19 & 0xFF);
			} else {
				Static46.method1056("gdn1", new Throwable());
				Static217.anIntArray841[this.aByte20] = -1;
			}
		}
		local5 = local5 + this.aString80;
		if (Static66.aStringArray16 != null) {
			local5 = local5 + Static66.aStringArray16[this.aByte20];
		}
		return local5;
	}

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "(I)Z")
	public boolean method819() {
		return this.aClass214_1 != null;
	}

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "(I)I")
	@Override
	public int method4421() {
		return this.aClass214_1 == null || this.aClass214_1.anInt6557 == -1 ? super.method4421() : Static132.method2664(this.aClass214_1.anInt6557).anInt5191;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method820() {
		return this.aString78;
	}

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)I")
	@Override
	public int method5057() {
		return super.anInt5107;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZIII)V")
	public void method822(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		super.method4408(arg1, this.method4421(), arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!pe;I)Z")
	@Override
	public boolean method5342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2) {
		if (this.aClass214_1 == null || !this.method823(65536, arg2)) {
			return true;
		}
		@Pc(19) Class70 local19 = arg2.method5427();
		@Pc(24) int local24 = super.aClass54_7.method1294();
		local19.method3711(local24);
		local19.method3707(super.anInt5973, super.anInt5968, super.anInt5967);
		for (@Pc(42) int local42 = 0; super.aClass31Array3.length > local42; local42++) {
			if (super.aClass31Array3[local42] != null) {
				return super.aClass31Array3[local42].method1932(arg1, arg0, local19, true);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!pe;B)Lclient!ca;")
	@Override
	public Class36_Sub1 method5345(@OriginalArg(0) Class89 arg0) {
		if (this.aClass214_1 == null || !this.method823(1024, arg0)) {
			return null;
		}
		@Pc(17) Class70 local17 = arg0.method5427();
		@Pc(22) int local22 = super.aClass54_7.method1294();
		local17.method3711(local22);
		local17.method3706(super.anInt5973, super.anInt5968, super.anInt5967);
		@Pc(36) float local36 = arg0.method5424();
		@Pc(39) float local39 = arg0.method5478();
		if (Static231.aBoolean341) {
			@Pc(45) Class79 local45 = this.method4417();
			if (local45.aBoolean163 && (this.aClass214_1.anInt6557 == -1 || Static132.method2664(this.aClass214_1.anInt6557).aBoolean382)) {
				@Pc(76) Class170 local76 = super.anInt5133 != -1 && super.anInt5093 == 0 ? Static261.method4379(super.anInt5133) : null;
				@Pc(95) Class170 local95 = super.anInt5100 == -1 || this.aBoolean75 || super.aBoolean378 && local76 != null ? null : Static261.method4379(super.anInt5100);
				@Pc(129) Class31 local129 = Static91.method5056(0, arg0, 1, 0, super.anInt5135, super.anInt5126, super.aClass31Array3[0], local95 == null ? local76 : local95, 240, super.aBoolean376, 160, local22, local95 == null ? super.anInt5117 : super.anInt5081, super.anInt5142);
				if (local129 != null) {
					arg0.method5463(local36, local39 - 128.0F);
					arg0.method5446(false);
					local129.method1928(local17, null, 0);
					arg0.method5446(true);
				}
			}
		}
		if (Static252.aClass22_Sub2_Sub1_Sub1_4 == this) {
			arg0.method5463(local36, local39 - 144.0F);
			local17.method3707(super.anInt5973, super.anInt5968, super.anInt5967);
			for (@Pc(170) int local170 = Static174.aClass50Array1.length - 1; local170 >= 0; local170--) {
				@Pc(175) Class50 local175 = Static174.aClass50Array1[local170];
				if (local175 != null && local175.anInt1478 != -1) {
					@Pc(227) int local227;
					@Pc(217) int local217;
					if (local175.anInt1480 == 1 && local175.anInt1473 >= 0 && Static69.aClass22_Sub2_Sub1_Sub2Array1.length > local175.anInt1473) {
						@Pc(204) Class22_Sub2_Sub1_Sub2 local204 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local175.anInt1473];
						if (local204 != null) {
							local217 = local204.anInt5973 / 32 - Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973 / 32;
							local227 = local204.anInt5967 / 32 - Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 / 32;
							this.method825(local217, local227, local17, super.aClass31Array3[0], local175.anInt1478, arg0, 360000);
						}
					}
					if (local175.anInt1480 == 2) {
						@Pc(263) int local263 = (local175.anInt1481 - Static350.anInt6609) * 4 + 2 - Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973 / 32;
						local217 = (local175.anInt1476 - Static237.anInt4696) * 4 + 2 - Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 / 32;
						local227 = local175.anInt1484 * 4;
						local227 *= local227;
						this.method825(local263, local217, local17, super.aClass31Array3[0], local175.anInt1478, arg0, local227);
					}
					if (local175.anInt1480 == 10 && local175.anInt1473 >= 0 && local175.anInt1473 < Static157.aClass22_Sub2_Sub1_Sub1Array1.length) {
						@Pc(318) Class22_Sub2_Sub1_Sub1 local318 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local175.anInt1473];
						if (local318 != null) {
							local217 = local318.anInt5973 / 32 - Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973 / 32;
							local227 = local318.anInt5967 / 32 - Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 / 32;
							this.method825(local217, local227, local17, super.aClass31Array3[0], local175.anInt1478, arg0, 360000);
						}
					}
				}
			}
			local17.method3711(local22);
			local17.method3706(super.anInt5973, super.anInt5968, super.anInt5967);
		}
		arg0.method5463(local36, local39);
		@Pc(388) Class36_Sub1 local388 = Static184.method3381(super.aClass31Array3.length);
		if (super.aClass36_Sub3_5 == null) {
			arg0.method5472(super.aClass31Array3, local17, local388.aClass36_Sub6Array1, Static252.aClass22_Sub2_Sub1_Sub1_4 == this ? 1 : 0);
		} else {
			@Pc(409) Class24 local409 = super.aClass36_Sub3_5.method2176();
			arg0.method5428(super.aClass31Array3, local409, local17, local388.aClass36_Sub6Array1, Static252.aClass22_Sub2_Sub1_Sub1_4 == this ? 1 : 0);
		}
		this.method4409(super.aClass31Array3, arg0, false);
		if (super.aClass31Array3[2] != null) {
			if (local22 != 0) {
				super.aClass31Array3[2].method1956(local22);
			}
			super.aClass31Array3[2].method1915(-super.anInt5156 + super.anInt5973, super.anInt5968 + -super.anInt5145, super.anInt5967 - super.anInt5154);
		}
		return local388;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
	@Override
	public void method5338() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!pe;)Z")
	private boolean method823(@OriginalArg(1) int arg0, @OriginalArg(2) Class89 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class79 local9 = this.method4417();
		@Pc(26) Class170 local26 = super.anInt5133 != -1 && super.anInt5093 == 0 ? Static261.method4379(super.anInt5133) : null;
		@Pc(56) Class170 local56 = super.anInt5100 == -1 || this.aBoolean75 || super.aBoolean378 && local26 != null ? null : Static261.method4379(super.anInt5100);
		@Pc(59) int local59 = local9.anInt2392;
		@Pc(62) int local62 = local9.anInt2366;
		if (local59 != 0 || local62 != 0 || local9.anInt2386 != 0 || local9.anInt2355 != 0) {
			arg0 |= 0x7;
		}
		super.aClass31Array3[0] = this.aClass214_1.method5587(local26, arg1, super.anInt5137, super.anInt5132, super.aClass190Array3, arg0, super.anInt5143, super.anInt5085, local56, super.anInt5117, super.anInt5081);
		@Pc(112) int local112 = Static345.method5564();
		if (Static194.anInt1874 < 96 && local112 > 50) {
			Static161.method3079();
		}
		@Pc(143) int local143;
		if (Static250.anInt4912 != 0 && local112 < 50) {
			local143 = 50 - local112;
			while (local143 > Static218.anInt4343) {
				Static345.aByteArrayArray21[Static218.anInt4343] = new byte[102400];
				Static218.anInt4343++;
			}
			while (Static218.anInt4343 > local143) {
				Static218.anInt4343--;
				Static345.aByteArrayArray21[Static218.anInt4343] = null;
			}
		} else if (Static250.anInt4912 != 0) {
			Static345.aByteArrayArray21 = new byte[50][];
			Static218.anInt4343 = 0;
		}
		if (super.aClass31Array3[0] == null) {
			return false;
		}
		super.anInt5107 = super.aClass31Array3[0].method1920();
		this.method4412(super.aClass31Array3[0]);
		local143 = super.aClass54_7.method1294();
		super.anInt5135 = 0;
		super.anInt5126 = 0;
		super.anInt5142 = 0;
		if (local59 == 0 && local62 == 0) {
			this.method4422(this.method4421() << 7, this.method4421() << 7, local143);
		} else {
			this.method4422(local59, local62, local143);
			if (super.anInt5142 != 0) {
				super.aClass31Array3[0].method1913(super.anInt5142);
			}
			if (super.anInt5135 != 0) {
				super.aClass31Array3[0].method1924(super.anInt5135);
			}
			if (super.anInt5126 != 0) {
				super.aClass31Array3[0].method1915(0, super.anInt5126, 0);
			}
		}
		super.aClass31Array3[1] = null;
		if (!this.aBoolean75 && super.anInt5129 != -1 && super.anInt5123 != -1) {
			@Pc(297) Class197 local297 = Static10.method162(super.anInt5129);
			@Pc(316) Class31 local316 = local297.method5136(super.anInt5123, super.anInt5131, arg1, super.anInt5127, (local297.aBoolean443 ? 7 : 2) | local5);
			if (local316 != null) {
				local316.method1915(0, -super.anInt5090, 0);
				if (local297.aBoolean443 && (local59 != 0 || local62 != 0)) {
					if (super.anInt5142 != 0) {
						local316.method1913(super.anInt5142);
					}
					if (super.anInt5135 != 0) {
						local316.method1924(super.anInt5135);
					}
					if (super.anInt5126 != 0) {
						local316.method1915(0, super.anInt5126, 0);
					}
				}
				super.aClass31Array3[1] = local316;
			}
		}
		super.aClass31Array3[2] = null;
		if (!this.aBoolean75 && super.anInterface1_3 != null) {
			if (super.anInt5147 <= Static212.anInt4234) {
				super.anInterface1_3 = null;
			}
			if (Static212.anInt4234 >= super.anInt5148 && Static212.anInt4234 < super.anInt5147) {
				@Pc(405) Class31 local405 = super.anInterface1_3.method5364(arg1, local5 | 0x7);
				if (local405 != null) {
					local405.method1915(super.anInt5156 - super.anInt5973, super.anInt5145 - super.anInt5968, -super.anInt5967 + super.anInt5154);
					if (local143 != 0) {
						local405.method1956(-local143 & 0x3FFF);
					}
					super.aClass31Array3[2] = local405;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5343() {
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!mk;Lclient!sj;ILclient!pe;ZI)V")
	private void method825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class89 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg0 * arg0 + arg1 * arg1;
		if (local11 < 16 || arg6 < local11) {
			return;
		}
		@Pc(29) int local29 = (int) (Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
		@Pc(54) Class31 local54 = Static177.method3290(arg5, super.anInt5973, super.anInt5126, super.anInt5135, arg3, super.anInt5142, super.anInt5967, local29, arg4, super.anInt5968);
		if (local54 != null) {
			arg5.method5446(false);
			local54.method1928(arg2, null, 0);
			arg5.method5446(true);
		}
	}

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "(I)I")
	@Override
	protected int method4418() {
		return this.anInt1034;
	}
}
