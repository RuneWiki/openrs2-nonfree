import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class62_Sub1_Sub2_Sub2 extends Class62_Sub1_Sub2 {

	@OriginalMember(owner = "client!qr", name = "Ic", descriptor = "Lclient!qe;")
	public Class160 aClass160_2;

	@OriginalMember(owner = "client!qr", name = "Jc", descriptor = "I")
	private int anInt5378;

	@OriginalMember(owner = "client!qr", name = "Rc", descriptor = "Ljava/lang/String;")
	public String aString47;

	@OriginalMember(owner = "client!qr", name = "qd", descriptor = "Ljava/lang/String;")
	public String aString48;

	@OriginalMember(owner = "client!qr", name = "Dc", descriptor = "Z")
	public boolean aBoolean486 = false;

	@OriginalMember(owner = "client!qr", name = "Lc", descriptor = "I")
	public int anInt5380 = -1;

	@OriginalMember(owner = "client!qr", name = "Xc", descriptor = "I")
	public int anInt5390 = -1;

	@OriginalMember(owner = "client!qr", name = "Gc", descriptor = "I")
	public int anInt5376 = -1;

	@OriginalMember(owner = "client!qr", name = "Uc", descriptor = "I")
	public int anInt5387 = 0;

	@OriginalMember(owner = "client!qr", name = "Yc", descriptor = "I")
	public int anInt5391 = 255;

	@OriginalMember(owner = "client!qr", name = "Nc", descriptor = "I")
	public int anInt5381 = 0;

	@OriginalMember(owner = "client!qr", name = "Zc", descriptor = "B")
	private byte aByte58 = 0;

	@OriginalMember(owner = "client!qr", name = "nd", descriptor = "I")
	public int anInt5405 = -1;

	@OriginalMember(owner = "client!qr", name = "ad", descriptor = "I")
	public int anInt5392 = 0;

	@OriginalMember(owner = "client!qr", name = "Tc", descriptor = "I")
	public int anInt5386 = -1;

	@OriginalMember(owner = "client!qr", name = "ld", descriptor = "I")
	public int anInt5403 = 0;

	@OriginalMember(owner = "client!qr", name = "hd", descriptor = "I")
	public int anInt5399 = 0;

	@OriginalMember(owner = "client!qr", name = "cd", descriptor = "I")
	public int anInt5394 = -1;

	@OriginalMember(owner = "client!qr", name = "Mc", descriptor = "B")
	private byte aByte57 = 0;

	@OriginalMember(owner = "client!qr", name = "Fc", descriptor = "I")
	public int anInt5375 = -1;

	@OriginalMember(owner = "client!qr", name = "ud", descriptor = "B")
	private byte aByte59 = 0;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!nc;Lclient!ae;IILclient!bk;IB)V")
	private void method4784(@OriginalArg(0) int arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class7 arg5, @OriginalArg(6) int arg6) {
		@Pc(12) int local12 = arg6 * arg6 + arg3 * arg3;
		if (local12 < 16 || arg4 < local12) {
			return;
		}
		@Pc(42) int local42 = (int) (Math.atan2((double) arg6, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(61) Class7 local61 = Static77.method1787(local42, super.anInt5311, super.anInt5304, super.anInt5289, arg5, arg0, arg2, super.anInt5313, super.anInt5280, super.anInt5291);
		if (local61 != null) {
			arg2.method4268(false);
			local61.method1441(arg1, null, 0);
			arg2.method4268(true);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!dg;I)V")
	public void method4785(@OriginalArg(0) Class2_Sub10 arg0) {
		arg0.anInt4807 = 0;
		@Pc(12) int local12 = arg0.method4421();
		this.aByte59 = (byte) (local12 & 0x1);
		@Pc(26) boolean local26 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(43) int local43 = super.method4777();
		this.method4782((local12 >> 3 & 0x7) + 1);
		this.aByte58 = (byte) (local12 >> 6 & 0x3);
		super.anInt5289 += (this.method4777() - local43) * 64;
		super.anInt5280 += (this.method4777() - local43) * 64;
		this.aByte57 = arg0.method4436();
		this.anInt5376 = arg0.method4436();
		this.anInt5375 = arg0.method4436();
		@Pc(106) int local106 = -1;
		this.anInt5381 = 0;
		@Pc(118) int[] local118 = new int[12];
		@Pc(138) int local138;
		@Pc(144) int local144;
		@Pc(184) int local184;
		for (@Pc(120) int local120 = 0; local120 < 12; local120++) {
			@Pc(126) int local126 = arg0.method4421();
			if (local126 == 0) {
				local118[local120] = 0;
			} else {
				local138 = arg0.method4421();
				local144 = local138 + (local126 << 8);
				if (local120 == 0 && local144 == 65535) {
					local106 = arg0.method4464();
					this.anInt5381 = arg0.method4421();
					break;
				}
				if (local144 >= 32768) {
					local144 = Static310.anIntArray460[local144 - 32768];
					local118[local120] = local144 | 0x40000000;
					local184 = Static282.method5080(local144).anInt6804;
					if (local184 != 0) {
						this.anInt5381 = local184;
					}
				} else {
					local118[local120] = local144 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(208) int[] local208 = new int[5];
		for (local138 = 0; local138 < 5; local138++) {
			local144 = arg0.method4421();
			if (local144 < 0 || local144 >= Static282.aShortArrayArray7[local138].length) {
				local144 = 0;
			}
			local208[local138] = local144;
		}
		this.anInt5378 = arg0.method4464();
		this.aString47 = arg0.method4409();
		if (local26) {
			this.aString48 = arg0.method4409();
		} else {
			this.aString48 = this.aString47;
		}
		this.anInt5387 = arg0.method4421();
		if (local37) {
			this.anInt5403 = arg0.method4464();
			this.anInt5405 = -1;
			this.anInt5399 = this.anInt5387;
		} else {
			this.anInt5403 = 0;
			this.anInt5399 = arg0.method4421();
			this.anInt5405 = arg0.method4421();
			if (this.anInt5405 == 255) {
				this.anInt5405 = -1;
			}
		}
		local144 = this.anInt5392;
		this.anInt5392 = arg0.method4421();
		@Pc(336) int local336;
		if (this.anInt5392 == 0) {
			Static105.method2328(this);
		} else {
			local184 = this.anInt5386;
			@Pc(333) int local333 = this.anInt5394;
			local336 = this.anInt5380;
			@Pc(339) int local339 = this.anInt5390;
			@Pc(342) int local342 = this.anInt5391;
			this.anInt5386 = arg0.method4464();
			this.anInt5394 = arg0.method4464();
			this.anInt5380 = arg0.method4464();
			this.anInt5390 = arg0.method4464();
			this.anInt5391 = arg0.method4421();
			if (local144 != this.anInt5392 || this.anInt5386 != local184 || local333 != this.anInt5394 || this.anInt5380 != local336 || local339 != this.anInt5390 || local342 != this.anInt5391) {
				Static283.method5090(this);
			}
		}
		if (this.aClass160_2 == null) {
			this.aClass160_2 = new Class160();
		}
		local184 = this.aClass160_2.anInt4954;
		@Pc(426) int[] local426 = this.aClass160_2.anIntArray379;
		this.aClass160_2.method4571(local118, this.method4767(), local106, local208, this.aByte59 == 1);
		if (local184 != local106) {
			super.anInt5289 = super.anIntArray397[0] * 128 + this.method4777() * 64;
			super.anInt5280 = super.anIntArray396[0] * 128 + this.method4777() * 64;
		}
		if (super.anInt5328 == 2047 && local426 != null) {
			for (local336 = 0; local336 < local208.length; local336++) {
				if (local426[local336] != local208[local336]) {
					Static46.method1098();
					break;
				}
			}
		}
		if (super.aClass55_Sub7_7 != null) {
			super.aClass55_Sub7_7.method4027();
		}
		if (super.anInt5347 == -1 || !super.aBoolean484) {
			return;
		}
		@Pc(526) Class180 local526 = this.method4775();
		if (!local526.method5103(super.anInt5347)) {
			super.aBoolean484 = false;
			super.anInt5347 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLclient!ae;)Lclient!jg;")
	@Override
	public Class55_Sub3 method5568(@OriginalArg(1) Class4 arg0) {
		if (this.aClass160_2 == null || !this.method4793(1024, arg0)) {
			return null;
		}
		@Pc(21) Class133 local21 = arg0.method4244();
		@Pc(26) int local26 = super.aClass110_7.method3167();
		local21.method4331(local26);
		local21.method4333(super.anInt5289, super.anInt5291, super.anInt5280);
		@Pc(40) float local40 = arg0.method4248();
		@Pc(43) float local43 = arg0.method4288();
		if (Static201.aBoolean337) {
			@Pc(49) Class180 local49 = this.method4775();
			if (local49.aBoolean513 && (this.aClass160_2.anInt4954 == -1 || Static83.method1900(this.aClass160_2.anInt4954).aBoolean531)) {
				@Pc(78) Class107 local78 = super.anInt5322 != -1 && super.anInt5345 == 0 ? Static212.method3773(super.anInt5322) : null;
				@Pc(97) Class107 local97 = super.anInt5347 == -1 || this.aBoolean486 || super.aBoolean484 && local78 != null ? null : Static212.method3773(super.anInt5347);
				@Pc(131) Class7 local131 = Static6.method210(0, arg0, local26, 240, super.aClass7Array3[0], super.anInt5311, local97 == null ? super.anInt5305 : super.anInt5350, 0, 160, super.aBoolean483, local97 == null ? local78 : local97, super.anInt5313, super.anInt5304, 1);
				if (local131 != null) {
					arg0.method4306(local40, local43 - 128.0F);
					arg0.method4268(false);
					local131.method1441(local21, null, 0);
					arg0.method4268(true);
				}
			}
		}
		if (Static41.aClass62_Sub1_Sub2_Sub2_2 == this) {
			arg0.method4306(local40, local43 - 144.0F);
			local21.method4324(super.anInt5289, super.anInt5291, super.anInt5280);
			for (@Pc(172) int local172 = Static264.aClass189Array1.length - 1; local172 >= 0; local172--) {
				@Pc(178) Class189 local178 = Static264.aClass189Array1[local172];
				if (local178 != null && local178.anInt6224 != -1) {
					@Pc(225) int local225;
					@Pc(215) int local215;
					if (local178.anInt6225 == 1 && local178.anInt6219 >= 0 && local178.anInt6219 < Static37.aClass62_Sub1_Sub2_Sub1Array1.length) {
						@Pc(203) Class62_Sub1_Sub2_Sub1 local203 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local178.anInt6219];
						if (local203 != null) {
							local215 = local203.anInt5289 / 32 - Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289 / 32;
							local225 = local203.anInt5280 / 32 - Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280 / 32;
							this.method4784(local178.anInt6224, local21, arg0, local225, 360000, super.aClass7Array3[0], local215);
						}
					}
					if (local178.anInt6225 == 2) {
						@Pc(259) int local259 = (local178.anInt6222 - Static138.anInt2879) * 4 + 2 - Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289 / 32;
						local215 = (local178.anInt6227 - Static342.anInt6864) * 4 + 2 - Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280 / 32;
						local225 = local178.anInt6220 * 4;
						local225 *= local225;
						this.method4784(local178.anInt6224, local21, arg0, local215, local225, super.aClass7Array3[0], local259);
					}
					if (local178.anInt6225 == 10 && local178.anInt6219 >= 0 && local178.anInt6219 < Static129.aClass62_Sub1_Sub2_Sub2Array1.length) {
						@Pc(322) Class62_Sub1_Sub2_Sub2 local322 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local178.anInt6219];
						if (local322 != null) {
							local215 = local322.anInt5289 / 32 - Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289 / 32;
							local225 = local322.anInt5280 / 32 - Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280 / 32;
							this.method4784(local178.anInt6224, local21, arg0, local225, 360000, super.aClass7Array3[0], local215);
						}
					}
				}
			}
			local21.method4331(local26);
			local21.method4333(super.anInt5289, super.anInt5291, super.anInt5280);
		}
		arg0.method4306(local40, local43);
		@Pc(391) Class55_Sub3 local391 = Static241.method4172(super.aClass7Array3.length);
		if (super.aClass55_Sub7_7 == null) {
			arg0.method4280(super.aClass7Array3, local21, local391.aClass55_Sub4Array1, Static41.aClass62_Sub1_Sub2_Sub2_2 == this ? 1 : 0);
		} else {
			@Pc(398) Class75 local398 = super.aClass55_Sub7_7.method4034();
			arg0.method4277(super.aClass7Array3, local398, local21, local391.aClass55_Sub4Array1, Static41.aClass62_Sub1_Sub2_Sub2_2 == this ? 1 : 0);
		}
		this.method4781(false, super.aClass7Array3, arg0);
		if (super.aClass7Array3[2] != null) {
			if (local26 != 0) {
				super.aClass7Array3[2].method1438(local26);
			}
			super.aClass7Array3[2].method1413(-super.anInt5363 + super.anInt5289, -super.anInt5371 + super.anInt5291, -super.anInt5361 + super.anInt5280);
		}
		return local391;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)V")
	public void method4788(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray397[0];
		@Pc(25) int local25 = super.anIntArray396[0];
		if (arg0 == 0) {
			local25++;
			local10--;
		}
		if (arg0 == 1) {
			local25++;
		}
		if (arg0 == 2) {
			local10++;
			local25++;
		}
		if (arg0 == 3) {
			local10--;
		}
		if (arg0 == 4) {
			local10++;
		}
		if (arg0 == 5) {
			local10--;
			local25--;
		}
		if (arg0 == 6) {
			local25--;
		}
		if (arg0 == 7) {
			local10++;
			local25--;
		}
		if (super.anInt5322 != -1 && Static212.method3773(super.anInt5322).anInt3280 == 1) {
			super.anInt5322 = -1;
		}
		if (super.anInt5321 != -1) {
			@Pc(97) Class215 local97 = Static44.method1076(super.anInt5321);
			if (local97.aBoolean621 && local97.anInt6968 != -1 && Static212.method3773(local97.anInt6968).anInt3280 == 1) {
				super.anInt5321 = -1;
			}
		}
		if (super.anInt5372 < 9) {
			super.anInt5372++;
		}
		for (@Pc(127) int local127 = super.anInt5372; local127 > 0; local127--) {
			super.anIntArray397[local127] = super.anIntArray397[local127 - 1];
			super.anIntArray396[local127] = super.anIntArray396[local127 - 1];
			super.aByteArray60[local127] = super.aByteArray60[local127 - 1];
		}
		super.anIntArray397[0] = local10;
		super.aByteArray60[0] = (byte) arg1;
		super.anIntArray396[0] = local25;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!ae;B)V")
	@Override
	public void method5567(@OriginalArg(0) Class4 arg0) {
		if (this.aClass160_2 != null && (super.aBoolean485 || this.method4793(0, arg0))) {
			this.method4781(super.aBoolean485, super.aClass7Array3, arg0);
		}
	}

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "(I)I")
	@Override
	public int method4777() {
		return this.aClass160_2 == null || this.aClass160_2.anInt4954 == -1 ? super.method4777() : Static83.method1900(this.aClass160_2.anInt4954).anInt5977;
	}

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "(I)V")
	@Override
	public void method5569() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method4789() {
		@Pc(7) String local7 = "";
		if (Static122.aStringArray38 != null) {
			local7 = local7 + Static122.aStringArray38[this.aByte58];
		}
		@Pc(36) int[] local36;
		if (this.aByte59 == 1 && Static64.anIntArray141 != null) {
			local36 = Static64.anIntArray141;
		} else {
			local36 = Static6.anIntArray6;
		}
		if (local36 != null && local36[this.aByte58] != -1) {
			@Pc(57) Class2_Sub11_Sub5 local57 = Static194.method3506(local36[this.aByte58]);
			if (local57.aChar1 == 's') {
				local7 = local7 + local57.method2281(this.aByte57 & 0xFF);
			} else {
				Static69.method1566("gdn1", new Throwable());
				local36[this.aByte58] = -1;
			}
		}
		local7 = local7 + this.aString47;
		if (Static273.aStringArray49 != null) {
			local7 = local7 + Static273.aStringArray49[this.aByte58];
		}
		return local7;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!ae;II)Z")
	@Override
	public boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass160_2 == null || !this.method4793(65536, arg1)) {
			return true;
		}
		@Pc(30) Class133 local30 = arg1.method4244();
		@Pc(35) int local35 = super.aClass110_7.method3167();
		local30.method4331(local35);
		local30.method4333(super.anInt5289, super.anInt5291, super.anInt5280);
		for (@Pc(48) int local48 = 0; local48 < super.aClass7Array3.length; local48++) {
			if (super.aClass7Array3[local48] != null && super.aClass7Array3[local48].method1407(arg0, arg2, local30, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5564() {
		return false;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZBIILclient!na;ILclient!ae;)V")
	@Override
	public void method5570(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "(I)Z")
	public boolean method4790() {
		return this.aClass160_2 != null;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)I")
	@Override
	public int method4769() {
		return -1;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method4791() {
		return this.aString48;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIZII)V")
	public void method4792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		super.method4771(arg0, this.method4777(), arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)I")
	@Override
	protected int method4767() {
		return this.anInt5378;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!ae;I)Z")
	private boolean method4793(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class180 local11 = this.method4775();
		@Pc(28) Class107 local28 = super.anInt5322 != -1 && super.anInt5345 == 0 ? Static212.method3773(super.anInt5322) : null;
		@Pc(48) Class107 local48 = super.anInt5347 == -1 || this.aBoolean486 || super.aBoolean484 && local28 != null ? null : Static212.method3773(super.anInt5347);
		@Pc(51) int local51 = local11.anInt5745;
		@Pc(54) int local54 = local11.anInt5735;
		if (local51 != 0 || local54 != 0 || local11.anInt5737 != 0 || local11.anInt5769 != 0) {
			arg0 |= 0x7;
		}
		super.aClass7Array3[0] = this.aClass160_2.method4568(local48, arg1, super.anInt5341, super.aClass103Array3, local28, super.anInt5337, super.anInt5350, super.anInt5331, arg0, super.anInt5319, super.anInt5305);
		@Pc(107) int local107 = Static256.method4641();
		if (Static339.anInt6736 < 96 && local107 > 50) {
			Static104.method4930();
		}
		@Pc(144) int local144;
		if (Static158.anInt3190 != 0 && local107 < 50) {
			local144 = 50 - local107;
			while (Static85.anInt1833 < local144) {
				Static282.aByteArrayArray17[Static85.anInt1833] = new byte[102400];
				Static85.anInt1833++;
			}
			while (local144 < Static85.anInt1833) {
				Static85.anInt1833--;
				Static282.aByteArrayArray17[Static85.anInt1833] = null;
			}
		} else if (Static158.anInt3190 != 0) {
			Static282.aByteArrayArray17 = new byte[50][];
			Static85.anInt1833 = 0;
		}
		if (super.aClass7Array3[0] == null) {
			return false;
		}
		super.anInt5336 = super.aClass7Array3[0].method1430();
		this.method4779(super.aClass7Array3[0]);
		local144 = super.aClass110_7.method3167();
		super.anInt5313 = 0;
		super.anInt5311 = 0;
		super.anInt5304 = 0;
		if (local51 == 0 && local54 == 0) {
			this.method4770(this.method4777() << 7, this.method4777() << 7, local144);
		} else {
			this.method4770(local54, local51, local144);
			if (super.anInt5313 != 0) {
				super.aClass7Array3[0].method1428(super.anInt5313);
			}
			if (super.anInt5311 != 0) {
				super.aClass7Array3[0].method1432(super.anInt5311);
			}
			if (super.anInt5304 != 0) {
				super.aClass7Array3[0].method1413(0, super.anInt5304, 0);
			}
		}
		super.aClass7Array3[1] = null;
		if (!this.aBoolean486 && super.anInt5321 != -1 && super.anInt5356 != -1) {
			@Pc(300) Class215 local300 = Static44.method1076(super.anInt5321);
			@Pc(319) Class7 local319 = local300.method5985(local7 | (local300.aBoolean620 ? 7 : 2), arg1, super.anInt5356, super.anInt5307, super.anInt5317);
			if (local319 != null) {
				local319.method1413(0, -super.anInt5316, 0);
				if (local300.aBoolean620 && (local51 != 0 || local54 != 0)) {
					if (super.anInt5313 != 0) {
						local319.method1428(super.anInt5313);
					}
					if (super.anInt5311 != 0) {
						local319.method1432(super.anInt5311);
					}
					if (super.anInt5304 != 0) {
						local319.method1413(0, super.anInt5304, 0);
					}
				}
				super.aClass7Array3[1] = local319;
			}
		}
		super.aClass7Array3[2] = null;
		if (!this.aBoolean486 && super.anInterface9_3 != null) {
			if (super.anInt5368 <= Static212.anInt4090) {
				super.anInterface9_3 = null;
			}
			if (Static212.anInt4090 >= super.anInt5364 && Static212.anInt4090 < super.anInt5368) {
				@Pc(401) Class7 local401 = super.anInterface9_3.method5582(arg1, local7 | 0x7);
				if (local401 != null) {
					local401.method1413(super.anInt5363 - super.anInt5289, super.anInt5371 - super.anInt5291, super.anInt5361 - super.anInt5280);
					if (local144 != 0) {
						local401.method1438(-local144 & 0x3FFF);
					}
					super.aClass7Array3[2] = local401;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "(I)I")
	@Override
	public int method4764() {
		return super.anInt5336;
	}
}
