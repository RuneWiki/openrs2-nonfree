import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class236 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "[Lclient!dv;")
	public Class57[] aClass57Array4;

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "[I")
	public int[] anIntArray571;

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "[I")
	public int[] anIntArray572;

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "[I")
	public int[] anIntArray573;

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "[I")
	public int[] anIntArray574;

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "[B")
	public byte[] aByteArray82;

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "[S")
	public short[] aShortArray101;

	@OriginalMember(owner = "client!tp", name = "n", descriptor = "[B")
	public byte[] aByteArray83;

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "[B")
	public byte[] aByteArray84;

	@OriginalMember(owner = "client!tp", name = "q", descriptor = "[B")
	public byte[] aByteArray85;

	@OriginalMember(owner = "client!tp", name = "r", descriptor = "[I")
	public int[] anIntArray575;

	@OriginalMember(owner = "client!tp", name = "t", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!tp", name = "u", descriptor = "[I")
	public int[] anIntArray576;

	@OriginalMember(owner = "client!tp", name = "v", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!tp", name = "w", descriptor = "[Lclient!nv;")
	public Class177[] aClass177Array1;

	@OriginalMember(owner = "client!tp", name = "x", descriptor = "[S")
	public short[] aShortArray104;

	@OriginalMember(owner = "client!tp", name = "y", descriptor = "[S")
	public short[] aShortArray105;

	@OriginalMember(owner = "client!tp", name = "z", descriptor = "[B")
	public byte[] aByteArray86;

	@OriginalMember(owner = "client!tp", name = "C", descriptor = "[S")
	public short[] aShortArray106;

	@OriginalMember(owner = "client!tp", name = "F", descriptor = "[S")
	public short[] aShortArray107;

	@OriginalMember(owner = "client!tp", name = "H", descriptor = "[S")
	public short[] aShortArray108;

	@OriginalMember(owner = "client!tp", name = "I", descriptor = "[Lclient!uj;")
	public Class244[] aClass244Array4;

	@OriginalMember(owner = "client!tp", name = "J", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!tp", name = "N", descriptor = "[I")
	public int[] anIntArray577;

	@OriginalMember(owner = "client!tp", name = "O", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!tp", name = "P", descriptor = "[S")
	public short[] aShortArray109;

	@OriginalMember(owner = "client!tp", name = "T", descriptor = "[I")
	public int[] anIntArray578;

	@OriginalMember(owner = "client!tp", name = "U", descriptor = "[I")
	public int[] anIntArray579;

	@OriginalMember(owner = "client!tp", name = "X", descriptor = "[I")
	public int[] anIntArray580;

	@OriginalMember(owner = "client!tp", name = "Z", descriptor = "[I")
	public int[] anIntArray581;

	@OriginalMember(owner = "client!tp", name = "bb", descriptor = "[S")
	public short[] aShortArray110;

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
	public int anInt6290 = 0;

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
	public int anInt6285 = 0;

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
	public int anInt6288 = 0;

	@OriginalMember(owner = "client!tp", name = "M", descriptor = "I")
	public int anInt6297 = 12;

	@OriginalMember(owner = "client!tp", name = "ab", descriptor = "I")
	public int anInt6304 = 0;

	@OriginalMember(owner = "client!tp", name = "B", descriptor = "B")
	public byte aByte91 = 0;

	static {
		new Class7("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "([B)V")
	public Class236(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method5251(arg0);
		} else {
			this.method5252(arg0);
		}
	}

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(III)V")
	public Class236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray103 = new short[arg1];
		this.aByteArray87 = new byte[arg1];
		this.aShortArray104 = new short[arg1];
		this.anIntArray573 = new int[arg0];
		if (arg2 > 0) {
			this.anIntArray578 = new int[arg2];
			this.aShortArray107 = new short[arg2];
			this.aByteArray85 = new byte[arg2];
			this.anIntArray574 = new int[arg2];
			this.aByteArray83 = new byte[arg2];
			this.aShortArray106 = new short[arg2];
			this.anIntArray577 = new int[arg2];
			this.anIntArray579 = new int[arg2];
			this.aByteArray84 = new byte[arg2];
			this.anIntArray576 = new int[arg2];
			this.aShortArray102 = new short[arg2];
			this.anIntArray571 = new int[arg2];
		}
		this.anIntArray572 = new int[arg0];
		this.anIntArray575 = new int[arg0];
		this.aByteArray86 = new byte[arg1];
		this.aShortArray109 = new short[arg1];
		this.anIntArray580 = new int[arg1];
		this.aByteArray82 = new byte[arg1];
		this.aByteArray88 = new byte[arg1];
		this.anIntArray581 = new int[arg0];
		this.aShortArray110 = new short[arg1];
		this.aShortArray101 = new short[arg1];
	}

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "([Lclient!tp;I)V")
	public Class236(@OriginalArg(0) Class236[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6285 = 0;
		this.anInt6304 = 0;
		this.anInt6288 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = false;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte91 = -1;
		for (@Pc(51) int local51 = 0; local51 < arg1; local51++) {
			@Pc(56) Class236 local56 = arg0[local51];
			if (local56 != null) {
				this.anInt6288 += local56.anInt6288;
				this.anInt6285 += local56.anInt6285;
				this.anInt6304 += local56.anInt6304;
				local36 |= local56.aByteArray86 != null;
				if (local56.aClass57Array4 != null) {
					local32 += local56.aClass57Array4.length;
				}
				if (local56.aClass244Array4 != null) {
					local30 += local56.aClass244Array4.length;
				}
				if (local56.aClass177Array1 != null) {
					local34 += local56.aClass177Array1.length;
				}
				local44 |= local56.aShortArray104 != null;
				local42 |= local56.aByteArray88 != null;
				local40 |= local56.aByteArray87 != null;
				local46 |= local56.anIntArray580 != null;
				if (local56.aByteArray82 == null) {
					if (this.aByte91 == -1) {
						this.aByte91 = local56.aByte91;
					}
					if (this.aByte91 != local56.aByte91) {
						local38 = true;
					}
				} else {
					local38 = true;
				}
			}
		}
		this.aShortArray101 = new short[this.anInt6304];
		this.aShortArray108 = new short[this.anInt6285];
		if (local32 > 0) {
			this.aClass57Array4 = new Class57[local32];
		}
		this.aShortArray109 = new short[this.anInt6304];
		if (local38) {
			this.aByteArray82 = new byte[this.anInt6304];
		}
		if (local42) {
			this.aByteArray88 = new byte[this.anInt6304];
		}
		this.anIntArray575 = new int[this.anInt6285];
		this.aShortArray110 = new short[this.anInt6304];
		if (local46) {
			this.anIntArray580 = new int[this.anInt6304];
		}
		if (local44) {
			this.aShortArray104 = new short[this.anInt6304];
		}
		if (local34 > 0) {
			this.aClass177Array1 = new Class177[local34];
		}
		this.anIntArray572 = new int[this.anInt6285];
		this.anIntArray573 = new int[this.anInt6285];
		if (local40) {
			this.aByteArray87 = new byte[this.anInt6304];
		}
		this.anIntArray581 = new int[this.anInt6285];
		if (local30 > 0) {
			this.aClass244Array4 = new Class244[local30];
		}
		this.aShortArray103 = new short[this.anInt6304];
		if (this.anInt6288 > 0) {
			this.anIntArray574 = new int[this.anInt6288];
			this.anIntArray576 = new int[this.anInt6288];
			this.anIntArray577 = new int[this.anInt6288];
			this.aByteArray83 = new byte[this.anInt6288];
			this.aShortArray102 = new short[this.anInt6288];
			this.aShortArray107 = new short[this.anInt6288];
			this.anIntArray571 = new int[this.anInt6288];
			this.aByteArray84 = new byte[this.anInt6288];
			this.anIntArray578 = new int[this.anInt6288];
			this.aShortArray106 = new short[this.anInt6288];
			this.anIntArray579 = new int[this.anInt6288];
			this.aByteArray85 = new byte[this.anInt6288];
		}
		this.aShortArray105 = new short[this.anInt6304];
		if (local36) {
			this.aByteArray86 = new byte[this.anInt6304];
		}
		this.anInt6304 = 0;
		local30 = 0;
		this.anInt6288 = 0;
		local32 = 0;
		local34 = 0;
		this.anInt6285 = 0;
		@Pc(609) int local609;
		@Pc(620) int local620;
		for (@Pc(383) int local383 = 0; local383 < arg1; local383++) {
			@Pc(389) short local389 = (short) (0x1 << local383);
			@Pc(393) Class236 local393 = arg0[local383];
			if (local393 != null) {
				@Pc(400) int local400;
				if (local393.aClass177Array1 != null) {
					for (local400 = 0; local400 < local393.aClass177Array1.length; local400++) {
						@Pc(406) Class177 local406 = local393.aClass177Array1[local400];
						this.aClass177Array1[local34++] = local406.method4036(local406.anInt4873 + this.anInt6304);
					}
				}
				for (local400 = 0; local400 < local393.anInt6304; local400++) {
					if (local36 && local393.aByteArray86 != null) {
						this.aByteArray86[this.anInt6304] = local393.aByteArray86[local400];
					}
					if (local38) {
						if (local393.aByteArray82 == null) {
							this.aByteArray82[this.anInt6304] = local393.aByte91;
						} else {
							this.aByteArray82[this.anInt6304] = local393.aByteArray82[local400];
						}
					}
					if (local40 && local393.aByteArray87 != null) {
						this.aByteArray87[this.anInt6304] = local393.aByteArray87[local400];
					}
					if (local44) {
						if (local393.aShortArray104 == null) {
							this.aShortArray104[this.anInt6304] = -1;
						} else {
							this.aShortArray104[this.anInt6304] = local393.aShortArray104[local400];
						}
					}
					if (local46) {
						if (local393.anIntArray580 == null) {
							this.anIntArray580[this.anInt6304] = -1;
						} else {
							this.anIntArray580[this.anInt6304] = local393.anIntArray580[local400];
						}
					}
					this.aShortArray109[this.anInt6304] = (short) this.method5244(local393, local389, local393.aShortArray109[local400]);
					this.aShortArray110[this.anInt6304] = (short) this.method5244(local393, local389, local393.aShortArray110[local400]);
					this.aShortArray101[this.anInt6304] = (short) this.method5244(local393, local389, local393.aShortArray101[local400]);
					this.aShortArray105[this.anInt6304] = local389;
					this.aShortArray103[this.anInt6304] = local393.aShortArray103[local400];
					this.anInt6304++;
				}
				@Pc(597) int local597;
				if (local393.aClass244Array4 != null) {
					for (local597 = 0; local597 < local393.aClass244Array4.length; local597++) {
						local609 = this.method5244(local393, local389, local393.aClass244Array4[local597].anInt6577);
						local620 = this.method5244(local393, local389, local393.aClass244Array4[local597].anInt6578);
						@Pc(631) int local631 = this.method5244(local393, local389, local393.aClass244Array4[local597].anInt6579);
						this.aClass244Array4[local30] = local393.aClass244Array4[local597].method5472(local631, local620, local609);
						local30++;
					}
				}
				if (local393.aClass57Array4 != null) {
					for (local597 = 0; local597 < local393.aClass57Array4.length; local597++) {
						local609 = this.method5244(local393, local389, local393.aClass57Array4[local597].anInt1834);
						this.aClass57Array4[local32] = local393.aClass57Array4[local597].method1593(local609);
						local32++;
					}
				}
			}
		}
		this.anInt6290 = this.anInt6285;
		@Pc(700) int local700 = 0;
		for (@Pc(702) int local702 = 0; local702 < arg1; local702++) {
			@Pc(708) short local708 = (short) (0x1 << local702);
			@Pc(712) Class236 local712 = arg0[local702];
			if (local712 != null) {
				for (local609 = 0; local609 < local712.anInt6304; local609++) {
					if (local42) {
						this.aByteArray88[local700++] = (byte) (local712.aByteArray88 == null || local712.aByteArray88[local609] == -1 ? -1 : this.anInt6288 + local712.aByteArray88[local609]);
					}
				}
				for (local620 = 0; local620 < local712.anInt6288; local620++) {
					@Pc(767) byte local767 = this.aByteArray84[this.anInt6288] = local712.aByteArray84[local620];
					if (local767 == 0) {
						this.aShortArray107[this.anInt6288] = (short) this.method5244(local712, local708, local712.aShortArray107[local620]);
						this.aShortArray106[this.anInt6288] = (short) this.method5244(local712, local708, local712.aShortArray106[local620]);
						this.aShortArray102[this.anInt6288] = (short) this.method5244(local712, local708, local712.aShortArray102[local620]);
					}
					if (local767 >= 1 && local767 <= 3) {
						this.aShortArray107[this.anInt6288] = local712.aShortArray107[local620];
						this.aShortArray106[this.anInt6288] = local712.aShortArray106[local620];
						this.aShortArray102[this.anInt6288] = local712.aShortArray102[local620];
						this.anIntArray577[this.anInt6288] = local712.anIntArray577[local620];
						this.anIntArray578[this.anInt6288] = local712.anIntArray578[local620];
						this.anIntArray571[this.anInt6288] = local712.anIntArray571[local620];
						this.aByteArray85[this.anInt6288] = local712.aByteArray85[local620];
						this.aByteArray83[this.anInt6288] = local712.aByteArray83[local620];
						this.anIntArray579[this.anInt6288] = local712.anIntArray579[local620];
					}
					if (local767 == 2) {
						this.anIntArray574[this.anInt6288] = local712.anIntArray574[local620];
						this.anIntArray576[this.anInt6288] = local712.anIntArray576[local620];
					}
					this.anInt6288++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(SSI)V")
	public void method5237(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt6304; local5++) {
			if (this.aShortArray103[local5] == arg1) {
				this.aShortArray103[local5] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(SSBSSBSBSB)B")
	public byte method5238() {
		if (this.anInt6288 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray84[this.anInt6288] = 3;
		this.aShortArray107[this.anInt6288] = 0;
		this.aShortArray106[this.anInt6288] = 32767;
		this.aShortArray102[this.anInt6288] = 0;
		this.anIntArray577[this.anInt6288] = 1024;
		this.anIntArray578[this.anInt6288] = 1024;
		this.anIntArray571[this.anInt6288] = 1024;
		this.aByteArray85[this.anInt6288] = 0;
		this.aByteArray83[this.anInt6288] = 0;
		this.anIntArray579[this.anInt6288] = 0;
		return (byte) this.anInt6288++;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIB)V")
	public void method5239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(19) int local19;
		@Pc(36) int local36;
		if (arg2 != 0) {
			local13 = Class183.anIntArray433[arg2];
			local17 = Class183.anIntArray434[arg2];
			for (local19 = 0; local19 < this.anInt6285; local19++) {
				local36 = this.anIntArray581[local19] * local17 + local13 * this.anIntArray572[local19] >> 15;
				this.anIntArray572[local19] = local17 * this.anIntArray572[local19] - this.anIntArray581[local19] * local13 >> 15;
				this.anIntArray581[local19] = local36;
			}
		}
		if (arg0 != 0) {
			local13 = Class183.anIntArray433[arg0];
			local17 = Class183.anIntArray434[arg0];
			for (local19 = 0; local19 < this.anInt6285; local19++) {
				local36 = local17 * this.anIntArray572[local19] - this.anIntArray575[local19] * local13 >> 15;
				this.anIntArray575[local19] = local13 * this.anIntArray572[local19] + this.anIntArray575[local19] * local17 >> 15;
				this.anIntArray572[local19] = local36;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local13 = Class183.anIntArray433[arg1];
		local17 = Class183.anIntArray434[arg1];
		for (local19 = 0; local19 < this.anInt6285; local19++) {
			local36 = local13 * this.anIntArray575[local19] + this.anIntArray581[local19] * local17 >> 15;
			this.anIntArray575[local19] = local17 * this.anIntArray575[local19] - this.anIntArray581[local19] * local13 >> 15;
			this.anIntArray581[local19] = local36;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)[[I")
	public int[][] method5240() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt6290; local12++) {
			@Pc(19) int local19 = this.anIntArray573[local12];
			if (local19 >= 0) {
				@Pc(25) int local25 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(49) int local49 = 0; local49 <= local10; local49++) {
			local47[local49] = new int[local8[local49]];
			local8[local49] = 0;
		}
		for (@Pc(77) int local77 = 0; local77 < this.anInt6290; local77++) {
			@Pc(84) int local84 = this.anIntArray573[local77];
			if (local84 >= 0) {
				local47[local84][local8[local84]++] = local77;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IBBISIBSB)I")
	public int method5241(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) short arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray109[this.anInt6304] = (short) arg0;
		this.aShortArray110[this.anInt6304] = (short) arg4;
		this.aShortArray101[this.anInt6304] = (short) arg2;
		this.aByteArray86[this.anInt6304] = arg7;
		this.aByteArray88[this.anInt6304] = arg5;
		this.aShortArray103[this.anInt6304] = arg3;
		this.aByteArray87[this.anInt6304] = arg1;
		this.aShortArray104[this.anInt6304] = arg6;
		return this.anInt6304++;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)[[I")
	public int[][] method5242() {
		@Pc(6) int[] local6 = new int[256];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.aClass177Array1.length; local10++) {
			@Pc(17) int local17 = this.aClass177Array1[local10].anInt4869;
			if (local17 >= 0) {
				@Pc(23) int local23 = local6[local17]++;
				if (local17 > local8) {
					local8 = local17;
				}
			}
		}
		@Pc(42) int[][] local42 = new int[local8 + 1][];
		for (@Pc(44) int local44 = 0; local44 <= local8; local44++) {
			local42[local44] = new int[local6[local44]];
			local6[local44] = 0;
		}
		for (@Pc(62) int local62 = 0; local62 < this.aClass177Array1.length; local62++) {
			@Pc(69) int local69 = this.aClass177Array1[local62].anInt4869;
			if (local69 >= 0) {
				local42[local69][local6[local69]++] = local62;
			}
		}
		return local42;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(SZS)V")
	public void method5243(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray104 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt6304; local9++) {
			if (arg1 == this.aShortArray104[local9]) {
				this.aShortArray104[local9] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!tp;SII)I")
	private int method5244(@OriginalArg(0) Class236 arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.anIntArray581[arg2];
		@Pc(13) int local13 = arg0.anIntArray572[arg2];
		@Pc(18) int local18 = arg0.anIntArray575[arg2];
		for (@Pc(20) int local20 = 0; local20 < this.anInt6285; local20++) {
			if (local8 == this.anIntArray581[local20] && local13 == this.anIntArray572[local20] && this.anIntArray575[local20] == local18) {
				this.aShortArray108[local20] |= arg1;
				return local20;
			}
		}
		this.anIntArray581[this.anInt6285] = local8;
		this.anIntArray572[this.anInt6285] = local13;
		this.anIntArray575[this.anInt6285] = local18;
		this.aShortArray108[this.anInt6285] = arg1;
		this.anIntArray573[this.anInt6285] = arg0.anIntArray573 == null ? -1 : arg0.anIntArray573[arg2];
		return this.anInt6285++;
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(IIIB)I")
	public int method5245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(14) int local14 = 0; local14 < this.anInt6285; local14++) {
			if (arg2 == this.anIntArray581[local14] && this.anIntArray572[local14] == arg0 && arg1 == this.anIntArray575[local14]) {
				return local14;
			}
		}
		this.anIntArray581[this.anInt6285] = arg2;
		this.anIntArray572[this.anInt6285] = arg0;
		this.anIntArray575[this.anInt6285] = arg1;
		this.anInt6290 = this.anInt6285 + 1;
		return this.anInt6285++;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)V")
	public void method5247() {
		for (@Pc(5) int local5 = 0; local5 < this.anInt6285; local5++) {
			this.anIntArray581[local5] <<= 0x0;
			this.anIntArray572[local5] <<= 0x0;
			this.anIntArray575[local5] <<= 0x0;
		}
		if (this.anInt6288 <= 0 || this.anIntArray577 == null) {
			return;
		}
		for (@Pc(47) int local47 = 0; local47 < this.anIntArray577.length; local47++) {
			this.anIntArray577[local47] <<= 0x0;
			this.anIntArray578[local47] <<= 0x0;
			if (this.aByteArray84[local47] != 1) {
				this.anIntArray571[local47] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)[[I")
	public int[][] method5248() {
		@Pc(13) int[] local13 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt6304; local17++) {
			@Pc(24) int local24 = this.anIntArray580[local17];
			if (local24 >= 0) {
				@Pc(30) int local30 = local13[local24]++;
				if (local15 < local24) {
					local15 = local24;
				}
			}
		}
		@Pc(52) int[][] local52 = new int[local15 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local15; local54++) {
			local52[local54] = new int[local13[local54]];
			local13[local54] = 0;
		}
		for (@Pc(73) int local73 = 0; local73 < this.anInt6304; local73++) {
			@Pc(80) int local80 = this.anIntArray580[local73];
			if (local80 >= 0) {
				local52[local80][local13[local80]++] = local73;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIII)V")
	public void method5249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6285; local1++) {
			this.anIntArray581[local1] += arg0;
			this.anIntArray572[local1] += arg2;
			this.anIntArray575[local1] += arg1;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I[B)V")
	private void method5251(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub5 local8 = new Class1_Sub5(arg0);
		@Pc(13) Class1_Sub5 local13 = new Class1_Sub5(arg0);
		@Pc(18) Class1_Sub5 local18 = new Class1_Sub5(arg0);
		@Pc(23) Class1_Sub5 local23 = new Class1_Sub5(arg0);
		@Pc(28) Class1_Sub5 local28 = new Class1_Sub5(arg0);
		@Pc(33) Class1_Sub5 local33 = new Class1_Sub5(arg0);
		@Pc(38) Class1_Sub5 local38 = new Class1_Sub5(arg0);
		local8.anInt6475 = arg0.length - 23;
		this.anInt6285 = local8.method5362();
		this.anInt6304 = local8.method5362();
		this.anInt6288 = local8.method5366();
		@Pc(71) int local71 = local8.method5366();
		@Pc(82) boolean local82 = (local71 & 0x1) == 1;
		@Pc(93) boolean local93 = (local71 & 0x2) == 2;
		@Pc(104) boolean local104 = (local71 & 0x4) == 4;
		@Pc(113) boolean local113 = (local71 & 0x8) == 8;
		if (local113) {
			local8.anInt6475 -= 7;
			this.anInt6297 = local8.method5366();
			local8.anInt6475 += 6;
		}
		@Pc(136) int local136 = local8.method5366();
		@Pc(140) int local140 = local8.method5366();
		@Pc(144) int local144 = local8.method5366();
		@Pc(148) int local148 = local8.method5366();
		@Pc(152) int local152 = local8.method5366();
		@Pc(156) int local156 = local8.method5362();
		@Pc(160) int local160 = local8.method5362();
		@Pc(164) int local164 = local8.method5362();
		@Pc(168) int local168 = local8.method5362();
		@Pc(172) int local172 = local8.method5362();
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		@Pc(194) int local194;
		if (this.anInt6288 > 0) {
			local8.anInt6475 = 0;
			this.aByteArray84 = new byte[this.anInt6288];
			for (local194 = 0; local194 < this.anInt6288; local194++) {
				@Pc(204) byte local204 = this.aByteArray84[local194] = local8.method5416();
				if (local204 >= 1 && local204 <= 3) {
					local176++;
				}
				if (local204 == 2) {
					local178++;
				}
				if (local204 == 0) {
					local174++;
				}
			}
		}
		local194 = this.anInt6288;
		@Pc(230) int local230 = local194;
		local194 += this.anInt6285;
		@Pc(237) int local237 = local194;
		if (local82) {
			local194 += this.anInt6304;
		}
		@Pc(246) int local246 = local194;
		local194 += this.anInt6304;
		@Pc(253) int local253 = local194;
		if (local136 == 255) {
			local194 += this.anInt6304;
		}
		@Pc(265) int local265 = local194;
		if (local144 == 1) {
			local194 += this.anInt6304;
		}
		@Pc(275) int local275 = local194;
		if (local152 == 1) {
			local194 += this.anInt6285;
		}
		@Pc(285) int local285 = local194;
		if (local140 == 1) {
			local194 += this.anInt6304;
		}
		@Pc(295) int local295 = local194;
		local194 += local168;
		@Pc(301) int local301 = local194;
		if (local148 == 1) {
			local194 += this.anInt6304 * 2;
		}
		@Pc(313) int local313 = local194;
		local194 += local172;
		@Pc(319) int local319 = local194;
		local194 += this.anInt6304 * 2;
		@Pc(328) int local328 = local194;
		local194 += local156;
		@Pc(334) int local334 = local194;
		local194 += local160;
		@Pc(340) int local340 = local194;
		local194 += local164;
		@Pc(346) int local346 = local194;
		local194 += local174 * 6;
		@Pc(354) int local354 = local194;
		local194 += local176 * 6;
		@Pc(368) int local368 = this.anInt6297 >= 14 ? 7 : 6;
		@Pc(370) int local370 = local194;
		local194 += local368 * local176;
		@Pc(378) int local378 = local194;
		local194 += local176;
		@Pc(384) int local384 = local194;
		local194 += local176;
		@Pc(390) int local390 = local194;
		local194 += local176 + local178 * 2;
		if (this.anInt6288 > 0) {
			if (local176 > 0) {
				this.anIntArray579 = new int[local176];
				this.anIntArray578 = new int[local176];
				this.aByteArray83 = new byte[local176];
				this.anIntArray571 = new int[local176];
				this.aByteArray85 = new byte[local176];
				this.anIntArray577 = new int[local176];
			}
			this.aShortArray106 = new short[this.anInt6288];
			this.aShortArray107 = new short[this.anInt6288];
			if (local178 > 0) {
				this.anIntArray576 = new int[local178];
				this.anIntArray574 = new int[local178];
			}
			this.aShortArray102 = new short[this.anInt6288];
		}
		this.anIntArray581 = new int[this.anInt6285];
		if (local136 == 255) {
			this.aByteArray82 = new byte[this.anInt6304];
		} else {
			this.aByte91 = (byte) local136;
		}
		this.anIntArray575 = new int[this.anInt6285];
		if (local82) {
			this.aByteArray86 = new byte[this.anInt6304];
		}
		if (local148 == 1) {
			this.aShortArray104 = new short[this.anInt6304];
		}
		if (local144 == 1) {
			this.anIntArray580 = new int[this.anInt6304];
		}
		if (local152 == 1) {
			this.anIntArray573 = new int[this.anInt6285];
		}
		if (local148 == 1 && this.anInt6288 > 0) {
			this.aByteArray88 = new byte[this.anInt6304];
		}
		if (local140 == 1) {
			this.aByteArray87 = new byte[this.anInt6304];
		}
		local8.anInt6475 = local230;
		this.aShortArray110 = new short[this.anInt6304];
		this.aShortArray101 = new short[this.anInt6304];
		this.aShortArray109 = new short[this.anInt6304];
		this.anIntArray572 = new int[this.anInt6285];
		this.aShortArray103 = new short[this.anInt6304];
		local13.anInt6475 = local328;
		local18.anInt6475 = local334;
		local23.anInt6475 = local340;
		local28.anInt6475 = local275;
		@Pc(584) int local584 = 0;
		@Pc(586) int local586 = 0;
		@Pc(588) int local588 = 0;
		@Pc(595) int local595;
		for (@Pc(590) int local590 = 0; local590 < this.anInt6285; local590++) {
			local595 = local8.method5366();
			@Pc(597) int local597 = 0;
			if ((local595 & 0x1) != 0) {
				local597 = local13.method5413();
			}
			@Pc(610) int local610 = 0;
			if ((local595 & 0x2) != 0) {
				local610 = local18.method5413();
			}
			@Pc(623) int local623 = 0;
			if ((local595 & 0x4) != 0) {
				local623 = local23.method5413();
			}
			this.anIntArray581[local590] = local597 + local584;
			this.anIntArray572[local590] = local610 + local586;
			this.anIntArray575[local590] = local623 + local588;
			local588 = this.anIntArray575[local590];
			local584 = this.anIntArray581[local590];
			local586 = this.anIntArray572[local590];
			if (local152 == 1) {
				this.anIntArray573[local590] = local28.method5366();
			}
		}
		local8.anInt6475 = local319;
		local13.anInt6475 = local237;
		local18.anInt6475 = local253;
		local23.anInt6475 = local285;
		local28.anInt6475 = local265;
		local33.anInt6475 = local301;
		local38.anInt6475 = local313;
		for (local595 = 0; local595 < this.anInt6304; local595++) {
			this.aShortArray103[local595] = (short) local8.method5362();
			if (local82) {
				this.aByteArray86[local595] = local13.method5416();
			}
			if (local136 == 255) {
				this.aByteArray82[local595] = local18.method5416();
			}
			if (local140 == 1) {
				this.aByteArray87[local595] = local23.method5416();
			}
			if (local144 == 1) {
				this.anIntArray580[local595] = local28.method5366();
			}
			if (local148 == 1) {
				this.aShortArray104[local595] = (short) (local33.method5362() - 1);
			}
			if (this.aByteArray88 != null) {
				if (this.aShortArray104[local595] == -1) {
					this.aByteArray88[local595] = -1;
				} else {
					this.aByteArray88[local595] = (byte) (local38.method5366() - 1);
				}
			}
		}
		this.anInt6290 = -1;
		local8.anInt6475 = local295;
		local13.anInt6475 = local246;
		@Pc(817) short local817 = 0;
		@Pc(819) short local819 = 0;
		@Pc(821) short local821 = 0;
		@Pc(823) short local823 = 0;
		@Pc(830) int local830;
		for (@Pc(825) int local825 = 0; local825 < this.anInt6304; local825++) {
			local830 = local13.method5366();
			if (local830 == 1) {
				local817 = (short) (local823 + local8.method5413());
				local819 = (short) (local8.method5413() + local817);
				local821 = (short) (local8.method5413() + local819);
				local823 = local821;
				this.aShortArray109[local825] = local817;
				this.aShortArray110[local825] = local819;
				this.aShortArray101[local825] = local821;
				if (this.anInt6290 < local817) {
					this.anInt6290 = local817;
				}
				if (local819 > this.anInt6290) {
					this.anInt6290 = local819;
				}
				if (local821 > this.anInt6290) {
					this.anInt6290 = local821;
				}
			}
			if (local830 == 2) {
				local819 = local821;
				local821 = (short) (local823 + local8.method5413());
				this.aShortArray109[local825] = local817;
				local823 = local821;
				this.aShortArray110[local825] = local819;
				this.aShortArray101[local825] = local821;
				if (this.anInt6290 < local821) {
					this.anInt6290 = local821;
				}
			}
			if (local830 == 3) {
				local817 = local821;
				local821 = (short) (local8.method5413() + local823);
				this.aShortArray109[local825] = local817;
				local823 = local821;
				this.aShortArray110[local825] = local819;
				this.aShortArray101[local825] = local821;
				if (this.anInt6290 < local821) {
					this.anInt6290 = local821;
				}
			}
			if (local830 == 4) {
				@Pc(985) short local985 = local817;
				local817 = local819;
				local819 = local985;
				local821 = (short) (local8.method5413() + local823);
				local823 = local821;
				this.aShortArray109[local825] = local817;
				this.aShortArray110[local825] = local985;
				this.aShortArray101[local825] = local821;
				if (this.anInt6290 < local821) {
					this.anInt6290 = local821;
				}
			}
		}
		this.anInt6290++;
		local8.anInt6475 = local346;
		local13.anInt6475 = local354;
		local18.anInt6475 = local370;
		local23.anInt6475 = local378;
		local28.anInt6475 = local384;
		local33.anInt6475 = local390;
		@Pc(1059) int local1059;
		for (local830 = 0; local830 < this.anInt6288; local830++) {
			local1059 = this.aByteArray84[local830] & 0xFF;
			if (local1059 == 0) {
				this.aShortArray107[local830] = (short) local8.method5362();
				this.aShortArray106[local830] = (short) local8.method5362();
				this.aShortArray102[local830] = (short) local8.method5362();
			}
			if (local1059 == 1) {
				this.aShortArray107[local830] = (short) local13.method5362();
				this.aShortArray106[local830] = (short) local13.method5362();
				this.aShortArray102[local830] = (short) local13.method5362();
				this.anIntArray577[local830] = local18.method5362();
				if (this.anInt6297 < 14) {
					this.anIntArray578[local830] = local18.method5362();
				} else {
					this.anIntArray578[local830] = local18.method5399();
				}
				this.anIntArray571[local830] = local18.method5362();
				this.aByteArray85[local830] = local23.method5416();
				this.aByteArray83[local830] = local28.method5416();
				this.anIntArray579[local830] = local33.method5416();
			}
			if (local1059 == 2) {
				this.aShortArray107[local830] = (short) local13.method5362();
				this.aShortArray106[local830] = (short) local13.method5362();
				this.aShortArray102[local830] = (short) local13.method5362();
				this.anIntArray577[local830] = local18.method5362();
				if (this.anInt6297 < 14) {
					this.anIntArray578[local830] = local18.method5362();
				} else {
					this.anIntArray578[local830] = local18.method5399();
				}
				this.anIntArray571[local830] = local18.method5362();
				this.aByteArray85[local830] = local23.method5416();
				this.aByteArray83[local830] = local28.method5416();
				this.anIntArray579[local830] = local33.method5416();
				this.anIntArray574[local830] = local33.method5416();
				this.anIntArray576[local830] = local33.method5416();
			}
			if (local1059 == 3) {
				this.aShortArray107[local830] = (short) local13.method5362();
				this.aShortArray106[local830] = (short) local13.method5362();
				this.aShortArray102[local830] = (short) local13.method5362();
				this.anIntArray577[local830] = local18.method5362();
				if (this.anInt6297 < 14) {
					this.anIntArray578[local830] = local18.method5362();
				} else {
					this.anIntArray578[local830] = local18.method5399();
				}
				this.anIntArray571[local830] = local18.method5362();
				this.aByteArray85[local830] = local23.method5416();
				this.aByteArray83[local830] = local28.method5416();
				this.anIntArray579[local830] = local33.method5416();
			}
		}
		local8.anInt6475 = local194;
		@Pc(1377) int local1377;
		@Pc(1382) int local1382;
		@Pc(1386) int local1386;
		@Pc(1450) int local1450;
		if (local93) {
			local1059 = local8.method5366();
			if (local1059 > 0) {
				this.aClass244Array4 = new Class244[local1059];
				for (local1377 = 0; local1377 < local1059; local1377++) {
					local1382 = local8.method5362();
					local1386 = local8.method5362();
					@Pc(1394) byte local1394;
					if (local136 == 255) {
						local1394 = this.aByteArray82[local1386];
					} else {
						local1394 = (byte) local136;
					}
					this.aClass244Array4[local1377] = new Class244(local1382, this.aShortArray109[local1386], this.aShortArray110[local1386], this.aShortArray101[local1386], local1394);
				}
			}
			local1377 = local8.method5366();
			if (local1377 > 0) {
				this.aClass57Array4 = new Class57[local1377];
				for (local1382 = 0; local1382 < local1377; local1382++) {
					local1386 = local8.method5362();
					local1450 = local8.method5362();
					this.aClass57Array4[local1382] = new Class57(local1386, local1450);
				}
			}
		}
		if (!local104) {
			return;
		}
		local1059 = local8.method5366();
		if (local1059 <= 0) {
			return;
		}
		this.aClass177Array1 = new Class177[local1059];
		for (local1377 = 0; local1377 < local1059; local1377++) {
			local1382 = local8.method5362();
			local1386 = local8.method5362();
			local1450 = local8.method5366();
			@Pc(1498) byte local1498 = local8.method5416();
			this.aClass177Array1[local1377] = new Class177(local1382, local1386, local1450, local1498);
		}
		return;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "([BB)V")
	private void method5252(@OriginalArg(0) byte[] arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(12) Class1_Sub5 local12 = new Class1_Sub5(arg0);
		@Pc(17) Class1_Sub5 local17 = new Class1_Sub5(arg0);
		@Pc(22) Class1_Sub5 local22 = new Class1_Sub5(arg0);
		@Pc(27) Class1_Sub5 local27 = new Class1_Sub5(arg0);
		@Pc(32) Class1_Sub5 local32 = new Class1_Sub5(arg0);
		local12.anInt6475 = arg0.length - 18;
		this.anInt6285 = local12.method5362();
		this.anInt6304 = local12.method5362();
		this.anInt6288 = local12.method5366();
		@Pc(64) int local64 = local12.method5366();
		@Pc(68) int local68 = local12.method5366();
		@Pc(72) int local72 = local12.method5366();
		@Pc(76) int local76 = local12.method5366();
		@Pc(80) int local80 = local12.method5366();
		@Pc(84) int local84 = local12.method5362();
		@Pc(88) int local88 = local12.method5362();
		@Pc(92) int local92 = local12.method5362();
		@Pc(96) int local96 = local12.method5362();
		@Pc(105) int local105 = this.anInt6285;
		@Pc(107) int local107 = local105;
		local105 += this.anInt6304;
		@Pc(114) int local114 = local105;
		if (local68 == 255) {
			local105 += this.anInt6304;
		}
		@Pc(124) int local124 = local105;
		if (local76 == 1) {
			local105 += this.anInt6304;
		}
		@Pc(134) int local134 = local105;
		if (local64 == 1) {
			local105 += this.anInt6304;
		}
		@Pc(146) int local146 = local105;
		if (local80 == 1) {
			local105 += this.anInt6285;
		}
		@Pc(156) int local156 = local105;
		if (local72 == 1) {
			local105 += this.anInt6304;
		}
		@Pc(166) int local166 = local105;
		local105 += local96;
		@Pc(172) int local172 = local105;
		local105 += this.anInt6304 * 2;
		@Pc(181) int local181 = local105;
		local105 += this.anInt6288 * 6;
		@Pc(190) int local190 = local105;
		local105 += local84;
		@Pc(196) int local196 = local105;
		local105 += local88;
		if (this.anInt6288 > 0) {
			this.aShortArray107 = new short[this.anInt6288];
			this.aByteArray84 = new byte[this.anInt6288];
			this.aShortArray102 = new short[this.anInt6288];
			this.aShortArray106 = new short[this.anInt6288];
		}
		if (local80 == 1) {
			this.anIntArray573 = new int[this.anInt6285];
		}
		if (local72 == 1) {
			this.aByteArray87 = new byte[this.anInt6304];
		}
		if (local64 == 1) {
			this.aShortArray104 = new short[this.anInt6304];
			this.aByteArray88 = new byte[this.anInt6304];
			this.aByteArray86 = new byte[this.anInt6304];
		}
		local12.anInt6475 = 0;
		this.aShortArray103 = new short[this.anInt6304];
		if (local68 == 255) {
			this.aByteArray82 = new byte[this.anInt6304];
		} else {
			this.aByte91 = (byte) local68;
		}
		this.aShortArray110 = new short[this.anInt6304];
		if (local76 == 1) {
			this.anIntArray580 = new int[this.anInt6304];
		}
		this.aShortArray109 = new short[this.anInt6304];
		this.anIntArray581 = new int[this.anInt6285];
		this.aShortArray101 = new short[this.anInt6304];
		this.anIntArray572 = new int[this.anInt6285];
		this.anIntArray575 = new int[this.anInt6285];
		local17.anInt6475 = local190;
		local22.anInt6475 = local196;
		local27.anInt6475 = local105;
		local32.anInt6475 = local146;
		@Pc(342) int local342 = 0;
		@Pc(344) int local344 = 0;
		@Pc(346) int local346 = 0;
		@Pc(353) int local353;
		@Pc(355) int local355;
		for (@Pc(348) int local348 = 0; local348 < this.anInt6285; local348++) {
			local353 = local12.method5366();
			local355 = 0;
			if ((local353 & 0x1) != 0) {
				local355 = local17.method5413();
			}
			@Pc(368) int local368 = 0;
			if ((local353 & 0x2) != 0) {
				local368 = local22.method5413();
			}
			@Pc(378) int local378 = 0;
			if ((local353 & 0x4) != 0) {
				local378 = local27.method5413();
			}
			this.anIntArray581[local348] = local342 + local355;
			this.anIntArray572[local348] = local368 + local344;
			this.anIntArray575[local348] = local346 + local378;
			local344 = this.anIntArray572[local348];
			local346 = this.anIntArray575[local348];
			local342 = this.anIntArray581[local348];
			if (local80 == 1) {
				this.anIntArray573[local348] = local32.method5366();
			}
		}
		local12.anInt6475 = local172;
		local17.anInt6475 = local134;
		local22.anInt6475 = local114;
		local27.anInt6475 = local156;
		local32.anInt6475 = local124;
		for (local353 = 0; local353 < this.anInt6304; local353++) {
			this.aShortArray103[local353] = (short) local12.method5362();
			if (local64 == 1) {
				local355 = local17.method5366();
				if ((local355 & 0x1) == 1) {
					this.aByteArray86[local353] = 1;
					local5 = true;
				} else {
					this.aByteArray86[local353] = 0;
				}
				if ((local355 & 0x2) == 2) {
					this.aByteArray88[local353] = (byte) (local355 >> 2);
					this.aShortArray104[local353] = this.aShortArray103[local353];
					this.aShortArray103[local353] = 127;
					if (this.aShortArray104[local353] != -1) {
						local7 = true;
					}
				} else {
					this.aByteArray88[local353] = -1;
					this.aShortArray104[local353] = -1;
				}
			}
			if (local68 == 255) {
				this.aByteArray82[local353] = local22.method5416();
			}
			if (local72 == 1) {
				this.aByteArray87[local353] = local27.method5416();
			}
			if (local76 == 1) {
				this.anIntArray580[local353] = local32.method5366();
			}
		}
		this.anInt6290 = -1;
		local12.anInt6475 = local166;
		local17.anInt6475 = local107;
		@Pc(591) short local591 = 0;
		@Pc(593) short local593 = 0;
		@Pc(595) short local595 = 0;
		@Pc(597) short local597 = 0;
		@Pc(604) int local604;
		for (@Pc(599) int local599 = 0; local599 < this.anInt6304; local599++) {
			local604 = local17.method5366();
			if (local604 == 1) {
				local591 = (short) (local597 + local12.method5413());
				local593 = (short) (local591 + local12.method5413());
				local595 = (short) (local12.method5413() + local593);
				local597 = local595;
				this.aShortArray109[local599] = local591;
				this.aShortArray110[local599] = local593;
				this.aShortArray101[local599] = local595;
				if (local591 > this.anInt6290) {
					this.anInt6290 = local591;
				}
				if (this.anInt6290 < local593) {
					this.anInt6290 = local593;
				}
				if (local595 > this.anInt6290) {
					this.anInt6290 = local595;
				}
			}
			if (local604 == 2) {
				local593 = local595;
				local595 = (short) (local597 + local12.method5413());
				this.aShortArray109[local599] = local591;
				local597 = local595;
				this.aShortArray110[local599] = local593;
				this.aShortArray101[local599] = local595;
				if (this.anInt6290 < local595) {
					this.anInt6290 = local595;
				}
			}
			if (local604 == 3) {
				local591 = local595;
				local595 = (short) (local12.method5413() + local597);
				local597 = local595;
				this.aShortArray109[local599] = local591;
				this.aShortArray110[local599] = local593;
				this.aShortArray101[local599] = local595;
				if (this.anInt6290 < local595) {
					this.anInt6290 = local595;
				}
			}
			if (local604 == 4) {
				@Pc(763) short local763 = local591;
				local591 = local593;
				local595 = (short) (local12.method5413() + local597);
				local593 = local763;
				this.aShortArray109[local599] = local591;
				local597 = local595;
				this.aShortArray110[local599] = local763;
				this.aShortArray101[local599] = local595;
				if (local595 > this.anInt6290) {
					this.anInt6290 = local595;
				}
			}
		}
		local12.anInt6475 = local181;
		this.anInt6290++;
		for (local604 = 0; local604 < this.anInt6288; local604++) {
			this.aByteArray84[local604] = 0;
			this.aShortArray107[local604] = (short) local12.method5362();
			this.aShortArray106[local604] = (short) local12.method5362();
			this.aShortArray102[local604] = (short) local12.method5362();
		}
		if (this.aByteArray88 != null) {
			@Pc(862) boolean local862 = false;
			for (@Pc(864) int local864 = 0; local864 < this.anInt6304; local864++) {
				@Pc(872) int local872 = this.aByteArray88[local864] & 0xFF;
				if (local872 != 255) {
					if ((this.aShortArray107[local872] & 0xFFFF) == this.aShortArray109[local864] && this.aShortArray110[local864] == (this.aShortArray106[local872] & 0xFFFF) && this.aShortArray101[local864] == (this.aShortArray102[local872] & 0xFFFF)) {
						this.aByteArray88[local864] = -1;
					} else {
						local862 = true;
					}
				}
			}
			if (!local862) {
				this.aByteArray88 = null;
			}
		}
		if (!local7) {
			this.aShortArray104 = null;
		}
		if (!local5) {
			this.aByteArray86 = null;
		}
	}
}
