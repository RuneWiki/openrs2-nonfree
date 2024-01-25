import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class15_Sub2_Sub4_Sub2 extends Class15_Sub2_Sub4 {

	@OriginalMember(owner = "client!uea", name = "Oc", descriptor = "I")
	private int anInt9011;

	@OriginalMember(owner = "client!uea", name = "Vc", descriptor = "I")
	public int anInt9017;

	@OriginalMember(owner = "client!uea", name = "Xc", descriptor = "I")
	public int anInt9019;

	@OriginalMember(owner = "client!uea", name = "bd", descriptor = "Ljava/lang/String;")
	public String aString82;

	@OriginalMember(owner = "client!uea", name = "md", descriptor = "Ljava/lang/String;")
	public String aString83;

	@OriginalMember(owner = "client!uea", name = "pd", descriptor = "Lclient!n;")
	public Class212 aClass212_1;

	@OriginalMember(owner = "client!uea", name = "Hc", descriptor = "B")
	private byte aByte104 = 0;

	@OriginalMember(owner = "client!uea", name = "Ec", descriptor = "B")
	private byte aByte103 = 0;

	@OriginalMember(owner = "client!uea", name = "Bc", descriptor = "I")
	public int anInt9002 = -1;

	@OriginalMember(owner = "client!uea", name = "Nc", descriptor = "Z")
	public boolean aBoolean584 = false;

	@OriginalMember(owner = "client!uea", name = "Gc", descriptor = "I")
	public int anInt9005 = -1;

	@OriginalMember(owner = "client!uea", name = "Lc", descriptor = "I")
	public int anInt9009 = 0;

	@OriginalMember(owner = "client!uea", name = "Sc", descriptor = "I")
	public int anInt9014 = -1;

	@OriginalMember(owner = "client!uea", name = "Wc", descriptor = "I")
	public int anInt9018 = -1;

	@OriginalMember(owner = "client!uea", name = "Zc", descriptor = "I")
	public int anInt9021 = 0;

	@OriginalMember(owner = "client!uea", name = "Ac", descriptor = "I")
	public int anInt9001 = 0;

	@OriginalMember(owner = "client!uea", name = "Ic", descriptor = "I")
	public int anInt9006 = 255;

	@OriginalMember(owner = "client!uea", name = "ad", descriptor = "Z")
	public boolean aBoolean585 = false;

	@OriginalMember(owner = "client!uea", name = "id", descriptor = "B")
	private byte aByte105 = 0;

	@OriginalMember(owner = "client!uea", name = "kd", descriptor = "I")
	public int anInt9028 = -1;

	@OriginalMember(owner = "client!uea", name = "Qc", descriptor = "I")
	public int anInt9012 = -1;

	@OriginalMember(owner = "client!uea", name = "dd", descriptor = "I")
	public int anInt9023 = -1;

	@OriginalMember(owner = "client!uea", name = "od", descriptor = "I")
	public int anInt9031 = 0;

	@OriginalMember(owner = "client!uea", name = "fd", descriptor = "I")
	public int anInt9025 = 0;

	@OriginalMember(owner = "client!uea", name = "jd", descriptor = "Z")
	public boolean aBoolean586 = false;

	@OriginalMember(owner = "client!uea", name = "ud", descriptor = "I")
	public int anInt9036 = -1;

	@OriginalMember(owner = "client!uea", name = "Cc", descriptor = "Z")
	public boolean aBoolean583 = false;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method7145() {
		@Pc(7) String local7 = "";
		if (Static161.aStringArray16 != null) {
			local7 = local7 + Static161.aStringArray16[this.aByte105];
		}
		@Pc(36) int[] local36;
		if (this.aByte104 == 1 && Static518.anIntArray629 != null) {
			local36 = Static518.anIntArray629;
		} else {
			local36 = Static167.anIntArray290;
		}
		if (local36 != null && local36[this.aByte105] != -1) {
			@Pc(56) Class75 local56 = Static86.aClass94_7.method2175(local36[this.aByte105]);
			if (local56.aChar1 == 's') {
				local7 = local7 + local56.method1456(this.aByte103 & 0xFF);
			} else {
				Static214.method5693("gdn1", new Throwable());
				local36[this.aByte105] = -1;
			}
		}
		local7 = local7 + this.aString83;
		if (Static187.aStringArray18 != null) {
			local7 = local7 + Static187.aStringArray18[this.aByte105];
		}
		return local7;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IILclient!gfa;IIZLclient!oa;)V")
	@Override
	public void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class90 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIB)V")
	public void method7146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt8998 = 0;
		super.anIntArray638[0] = arg0;
		super.anInt8995 = 0;
		super.anInt8997 = 0;
		super.anIntArray637[0] = arg1;
		@Pc(33) int local33 = this.method7135();
		super.anInt8911 = super.anIntArray638[0] * 512 + local33 * 256;
		super.anInt8913 = super.anIntArray637[0] * 512 + local33 * 256;
		if (Static461.aClass15_Sub2_Sub4_Sub2_2 == this) {
			Static323.method4986();
		}
		if (super.aClass60_Sub4_8 != null) {
			super.aClass60_Sub4_8.method3588();
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass212_1 == null || !this.method7147(131072, arg1)) {
			return false;
		}
		@Pc(29) Class93 local29 = arg1.method7455();
		@Pc(34) int local34 = super.aClass218_7.method5310();
		local29.a(local34);
		local29.G(super.anInt8911, super.anInt8915, super.anInt8913);
		@Pc(47) boolean local47 = false;
		for (@Pc(49) int local49 = 0; local49 < super.aClass24Array3.length; local49++) {
			if (super.aClass24Array3[local49] != null && super.aClass24Array3[local49].method7386(arg0, arg2, local29, true)) {
				local47 = true;
				break;
			}
		}
		super.aClass24Array3[0] = super.aClass24Array3[1] = super.aClass24Array3[2] = super.aClass24Array3[3] = null;
		return local47;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
		if (this.aClass212_1 == null || !super.aBoolean582 && !this.method7147(0, arg0)) {
			return;
		}
		@Pc(20) Class93 local20 = arg0.method7455();
		local20.a(super.aClass218_7.method5310());
		local20.G(super.anInt8911, super.anInt8915 - 5, super.anInt8913);
		this.method7138(super.aBoolean582, local20, arg0, super.aClass24Array3);
		super.aClass24Array3[0] = super.aClass24Array3[1] = super.aClass24Array3[2] = super.aClass24Array3[3] = null;
	}

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "(B)I")
	@Override
	protected int method7141() {
		return this.anInt9011;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IILclient!oa;)Z")
	private boolean method7147(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class154 local11 = this.method7131();
		@Pc(26) Class63 local26 = super.anInt8932 != -1 && super.anInt8955 == 0 ? Static388.aClass324_2.method7265(super.anInt8932) : null;
		@Pc(47) Class63 local47 = super.anInt8985 == -1 || this.aBoolean585 || super.aBoolean579 && local26 != null ? null : Static388.aClass324_2.method7265(super.anInt8985);
		@Pc(50) int local50 = local11.anInt4508;
		@Pc(53) int local53 = local11.anInt4530;
		if (local50 != 0 || local53 != 0 || local11.anInt4537 != 0 || local11.anInt4504 != 0) {
			arg0 |= 0x7;
		}
		@Pc(94) boolean local94 = super.aByte100 != 0 && super.anInt8963 <= Static363.anInt6671 && super.anInt8988 > Static363.anInt6671;
		if (local94) {
			arg0 |= 0x80000;
		}
		@Pc(135) Class24 local135 = super.aClass24Array3[0] = this.aClass212_1.method5073(arg1, Static388.aClass324_2, super.anInt8975, super.anInt8954, super.anInt8944, local47, Static518.aClass242_2, local26, super.anInt8929, Static119.aClass244_4, arg0, super.anInt8934, super.aClass140Array3, Static119.aClass226_4, super.anInt8993, Static81.aClass12_1, Static65.aClass51_1);
		@Pc(138) int local138 = Static149.method4031();
		if (Static355.anInt6598 < 96 && local138 > 50) {
			Static456.method6373();
		}
		@Pc(167) int local167;
		if (Static338.aClass45_6 != Static101.aClass45_4 && local138 < 50) {
			local167 = 50 - local138;
			while (local167 > Static36.anInt685) {
				Static486.aByteArrayArray26[Static36.anInt685] = new byte[102400];
				Static36.anInt685++;
			}
			while (Static36.anInt685 > local167) {
				Static36.anInt685--;
				Static486.aByteArrayArray26[Static36.anInt685] = null;
			}
		} else if (Static338.aClass45_6 != Static101.aClass45_4) {
			Static486.aByteArrayArray26 = new byte[50][];
			Static36.anInt685 = 0;
		}
		if (local135 == null) {
			return false;
		}
		super.anInt8956 = local135.DA();
		this.method7142(local135);
		local167 = super.aClass218_7.method5310();
		if (local50 == 0 && local53 == 0) {
			this.method7129(local167, this.method7135() << 9, 0, 0, this.method7135() << 9);
		} else {
			this.method7129(local167, local53, local11.anInt4510, local11.anInt4522, local50);
			if (super.anInt8979 != 0) {
				local135.AA(super.anInt8979);
			}
			if (super.anInt8967 != 0) {
				local135.v(super.anInt8967);
			}
			if (super.anInt8916 != 0) {
				local135.m(0, super.anInt8916, 0);
			}
		}
		if (local94) {
			local135.method7384(super.aByte99, super.aByte102, super.aByte101, super.aByte100 & 0xFF);
		}
		@Pc(313) Class239 local313;
		@Pc(330) boolean local330;
		@Pc(332) int local332;
		@Pc(378) Class24 local378;
		if (this.aBoolean585 || super.anInt8947 == -1 || super.anInt8951 == -1) {
			super.aClass24Array3[1] = null;
		} else {
			local313 = Static475.aClass291_2.method6548(super.anInt8947);
			local330 = local313.aByte77 == 3 && (local50 != 0 || local53 != 0);
			local332 = local7;
			if (local330) {
				local332 = local7 | 0x7;
			} else {
				if (super.anInt8946 != 0) {
					local332 = local7 | 0x5;
				}
				if (super.anInt8936 != 0) {
					local332 |= 0x2;
				}
			}
			local378 = super.aClass24Array3[1] = local313.method5575(super.anInt8972, super.anInt8928, local332, Static388.aClass324_2, arg1, super.anInt8951);
			if (local378 != null) {
				if (super.anInt8936 != 0) {
					local378.m(0, -super.anInt8936 << 2, 0);
				}
				if (super.anInt8946 != 0) {
					local378.I(super.anInt8946 * 2048);
				}
				if (local330) {
					if (super.anInt8979 != 0) {
						local378.AA(super.anInt8979);
					}
					if (super.anInt8967 != 0) {
						local378.v(super.anInt8967);
					}
					if (super.anInt8916 != 0) {
						local378.m(0, super.anInt8916, 0);
					}
				}
			}
		}
		if (this.aBoolean585 || super.anInt8968 == -1 || super.anInt8970 == -1) {
			super.aClass24Array3[3] = null;
		} else {
			local313 = Static475.aClass291_2.method6548(super.anInt8968);
			local330 = local313.aByte77 == 3 && (local50 != 0 || local53 != 0);
			local332 = local7;
			if (local330) {
				local332 = local7 | 0x7;
			} else {
				if (super.anInt8922 != 0) {
					local332 = local7 | 0x5;
				}
				if (super.anInt8921 != 0) {
					local332 |= 0x2;
				}
			}
			local378 = super.aClass24Array3[3] = local313.method5578(super.anInt8970, arg1, super.anInt8959, Static388.aClass324_2, super.anInt8973, local332);
			if (local378 != null) {
				if (super.anInt8921 != 0) {
					local378.m(0, -super.anInt8921 << 2, 0);
				}
				if (super.anInt8922 != 0) {
					local378.I(super.anInt8922 * 2048);
				}
				if (local330) {
					if (super.anInt8979 != 0) {
						local378.AA(super.anInt8979);
					}
					if (super.anInt8967 != 0) {
						local378.v(super.anInt8967);
					}
					if (super.anInt8916 != 0) {
						local378.m(0, super.anInt8916, 0);
					}
				}
			}
		}
		super.aClass24Array3[2] = null;
		if (!this.aBoolean585 && super.aClass6_Sub42_3 != null) {
			if (Static363.anInt6671 >= super.aClass6_Sub42_3.anInt8165) {
				super.aClass6_Sub42_3 = null;
			} else if (super.aClass6_Sub42_3.anInt8154 <= Static363.anInt6671) {
				@Pc(605) Class24 local605 = super.aClass6_Sub42_3.method6473(local7 | 0x7, arg1);
				if (local605 != null) {
					local605.m(super.aClass6_Sub42_3.anInt8157 - super.anInt8911, -super.anInt8915 + super.aClass6_Sub42_3.anInt8163 + 5, super.aClass6_Sub42_3.anInt8159 - super.anInt8913);
					if (local167 != 0) {
						local605.I(-local167 & 0x3FFF);
					}
					super.aClass24Array3[2] = local605;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Z)V")
	@Override
	public void method7165() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method7148() {
		return this.aString82;
	}

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "(B)I")
	@Override
	public int method7135() {
		return this.aClass212_1 == null || this.aClass212_1.anInt6268 == -1 ? super.method7135() : Static119.aClass226_4.method5369(this.aClass212_1.anInt6268).anInt2171;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!q;IIIILclient!oa;Lclient!ba;Z)V")
	private void method7150(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) Class24 arg6) {
		@Pc(11) int local11 = arg2 * arg2 + arg1 * arg1;
		if (local11 < 262144 || arg3 < local11) {
			return;
		}
		@Pc(35) int local35 = (int) (Math.atan2((double) arg1, (double) arg2) * 2607.5945876176133D) & 0x3FFF;
		@Pc(47) Class24 local47 = Static200.method3329(arg5, super.anInt8967, local35, super.anInt8916, arg4, super.anInt8979);
		if (local47 != null) {
			arg5.method7500(false);
			local47.method7393(arg0, null, 0);
			arg5.method7500(true);
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IBBI)V")
	public void method7151(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt8932 != -1 && Static388.aClass324_2.method7265(super.anInt8932).anInt1384 == 1) {
			super.anInt8932 = -1;
		}
		if (super.anInt8947 != -1) {
			@Pc(28) Class239 local28 = Static475.aClass291_2.method6548(super.anInt8947);
			if (local28.aBoolean477 && local28.anInt6960 != -1 && Static388.aClass324_2.method7265(local28.anInt6960).anInt1384 == 1) {
				super.anInt8947 = -1;
			}
		}
		if (super.anInt8968 != -1) {
			@Pc(65) Class239 local65 = Static475.aClass291_2.method6548(super.anInt8968);
			if (local65.aBoolean477 && local65.anInt6960 != -1 && Static388.aClass324_2.method7265(local65.anInt6960).anInt1384 == 1) {
				super.anInt8968 = -1;
			}
		}
		this.anInt9036 = -1;
		if (arg0 < 0 || arg0 >= Static18.anInt5706 || arg2 < 0 || Static80.anInt1367 <= arg2) {
			this.method7146(arg0, arg2);
		} else if (super.anIntArray638[0] >= 0 && Static18.anInt5706 > super.anIntArray638[0] && super.anIntArray637[0] >= 0 && Static80.anInt1367 > super.anIntArray637[0]) {
			if (arg1 == 2) {
				Static196.method3304(arg2, arg0, this);
			}
			this.method7152(arg0, arg2, arg1);
		} else {
			this.method7146(arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIBI)V")
	public void method7152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (super.anInt8998 < 9) {
			super.anInt8998++;
		}
		for (@Pc(20) int local20 = super.anInt8998; local20 > 0; local20--) {
			super.anIntArray638[local20] = super.anIntArray638[local20 - 1];
			super.anIntArray637[local20] = super.anIntArray637[local20 - 1];
			super.aByteArray106[local20] = super.aByteArray106[local20 - 1];
		}
		super.anIntArray638[0] = arg0;
		super.aByteArray106[0] = arg2;
		super.anIntArray637[0] = arg1;
	}

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7162() {
		return false;
	}

	@OriginalMember(owner = "client!uea", name = "d", descriptor = "(I)Z")
	public boolean method7153() {
		return this.aClass212_1 != null;
	}

	@OriginalMember(owner = "client!uea", name = "e", descriptor = "(B)I")
	@Override
	public int method7137() {
		return -1;
	}

	@OriginalMember(owner = "client!uea", name = "i", descriptor = "(I)I")
	@Override
	public int method7123() {
		return super.anInt8956;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(BLclient!jr;)V")
	public void method7154(@OriginalArg(1) Class6_Sub12 arg0) {
		arg0.anInt7556 = 0;
		@Pc(12) int local12 = arg0.method6019();
		this.aByte104 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean583;
		this.aBoolean583 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(45) int local45 = super.method7135();
		this.method7134((local12 >> 3 & 0x7) + 1);
		this.aByte105 = (byte) (local12 >> 6 & 0x3);
		super.anInt8911 += this.method7135() - local45 << 8;
		super.anInt8913 += this.method7135() - local45 << 8;
		this.aByte103 = arg0.method6049();
		this.anInt9023 = arg0.method6049();
		this.anInt9012 = arg0.method6049();
		this.anInt9031 = 0;
		@Pc(108) int local108 = -1;
		@Pc(111) int[] local111 = new int[12];
		@Pc(134) int local134;
		@Pc(140) int local140;
		@Pc(177) int local177;
		for (@Pc(113) int local113 = 0; local113 < 12; local113++) {
			@Pc(119) int local119 = arg0.method6019();
			if (local119 == 0) {
				local111[local113] = 0;
			} else {
				local134 = arg0.method6019();
				local140 = local134 + (local119 << 8);
				if (local113 == 0 && local140 == 65535) {
					local108 = arg0.method6044();
					this.anInt9031 = arg0.method6019();
					break;
				}
				if (local140 >= 32768) {
					local140 = Static466.anIntArray571[local140 - 32768];
					local111[local113] = local140 | 0x40000000;
					local177 = Static119.aClass244_4.method5726(local140).anInt6767;
					if (local177 != 0) {
						this.anInt9031 = local177;
					}
				} else {
					local111[local113] = local140 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(204) int[] local204 = new int[5];
		for (local134 = 0; local134 < 5; local134++) {
			local140 = arg0.method6019();
			if (local140 < 0 || Static252.aShortArrayArray18[local134].length <= local140) {
				local140 = 0;
			}
			local204[local134] = local140;
		}
		this.anInt9011 = arg0.method6044();
		this.aString83 = arg0.method6040();
		this.aString82 = this.aString83;
		this.anInt9001 = arg0.method6019();
		if (local41) {
			this.anInt9009 = arg0.method6044();
			this.anInt9028 = -1;
			this.anInt9021 = this.anInt9001;
			if (this.anInt9009 == 65535) {
				this.anInt9009 = -1;
			}
		} else {
			this.anInt9009 = 0;
			this.anInt9021 = arg0.method6019();
			this.anInt9028 = arg0.method6019();
			if (this.anInt9028 == 255) {
				this.anInt9028 = -1;
			}
		}
		local140 = this.anInt9025;
		this.anInt9025 = arg0.method6019();
		@Pc(319) int local319;
		if (this.anInt9025 == 0) {
			Static31.method502(this);
		} else {
			local177 = this.anInt9002;
			@Pc(316) int local316 = this.anInt9005;
			local319 = this.anInt9018;
			@Pc(322) int local322 = this.anInt9014;
			@Pc(325) int local325 = this.anInt9006;
			this.anInt9002 = arg0.method6044();
			this.anInt9005 = arg0.method6044();
			this.anInt9018 = arg0.method6044();
			this.anInt9014 = arg0.method6044();
			this.anInt9006 = arg0.method6019();
			if (local21 != this.aBoolean583 || local140 != this.anInt9025 || local177 != this.anInt9002 || local316 != this.anInt9005 || local319 != this.anInt9018 || local322 != this.anInt9014 || this.anInt9006 != local325) {
				Static534.method7059(this);
			}
		}
		if (this.aClass212_1 == null) {
			this.aClass212_1 = new Class212();
		}
		local177 = this.aClass212_1.anInt6268;
		@Pc(414) int[] local414 = this.aClass212_1.anIntArray444;
		this.aClass212_1.method5082(this.method7141(), local111, local204, this.aByte104 == 1, local108);
		if (local177 != local108) {
			super.anInt8911 = (super.anIntArray638[0] << 9) + (this.method7135() << 8);
			super.anInt8913 = (super.anIntArray637[0] << 9) + (this.method7135() << 8);
		}
		if (super.anInt8924 == Static517.anInt8881 && local414 != null) {
			for (local319 = 0; local319 < local204.length; local319++) {
				if (local204[local319] != local414[local319]) {
					Static119.aClass244_4.method5715();
					break;
				}
			}
		}
		if (super.aClass60_Sub4_8 != null) {
			super.aClass60_Sub4_8.method3588();
		}
		if (super.anInt8985 == -1 || !super.aBoolean579) {
			return;
		}
		@Pc(514) Class154 local514 = this.method7131();
		if (!local514.method3827(super.anInt8985)) {
			super.aBoolean579 = false;
			super.anInt8985 = -1;
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		if (this.aClass212_1 == null || !this.method7147(2048, arg0)) {
			return null;
		}
		@Pc(19) Class93 local19 = arg0.method7455();
		@Pc(24) int local24 = super.aClass218_7.method5310();
		local19.a(local24);
		local19.G(super.anInt8911, super.anInt8915 - 20, super.anInt8913);
		@Pc(99) int local99;
		if (Static58.aClass6_Sub17_Sub1_1.aBoolean602) {
			@Pc(44) Class154 local44 = this.method7131();
			if (local44.aBoolean333 && (this.aClass212_1.anInt6268 == -1 || Static119.aClass226_4.method5369(this.aClass212_1.anInt6268).aBoolean145)) {
				@Pc(77) Class63 local77 = super.anInt8932 != -1 && super.anInt8955 == 0 ? Static388.aClass324_2.method7265(super.anInt8932) : null;
				@Pc(97) Class63 local97 = super.anInt8985 == -1 || this.aBoolean585 || super.aBoolean579 && local77 != null ? null : Static388.aClass324_2.method7265(super.anInt8985);
				local99 = 0;
				if (super.anInt8971 != 0) {
					local99 = this.method7130();
				}
				@Pc(139) Class24 local139 = Static68.method963(160, 0, super.anInt8916, super.aClass24Array3[0], local97 == null ? super.anInt8975 : super.anInt8954, local24, arg0, super.anInt8979, local99, 1, 0, super.anInt8967, 240, local97 == null ? local77 : local97);
				if (local139 != null) {
					arg0.method7500(false);
					local139.method7393(local19, null, 0);
					arg0.method7500(true);
				}
			}
		}
		if (Static461.aClass15_Sub2_Sub4_Sub2_2 == this) {
			local19.GA(super.anInt8911, super.anInt8915, super.anInt8913);
			for (@Pc(168) int local168 = Static168.aClass279Array1.length - 1; local168 >= 0; local168--) {
				@Pc(174) Class279 local174 = Static168.aClass279Array1[local168];
				if (local174 != null && local174.anInt7968 != -1) {
					@Pc(206) int local206;
					if (local174.anInt7966 == 1) {
						@Pc(194) Class6_Sub49 local194 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local174.anInt7964);
						if (local194 != null) {
							@Pc(199) Class15_Sub2_Sub4_Sub1 local199 = local194.aClass15_Sub2_Sub4_Sub1_2;
							local206 = local199.anInt8911 - Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911;
							@Pc(212) int local212 = local199.anInt8913 - Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913;
							this.method7150(local19, local206, local212, 92160000, local174.anInt7968, arg0, super.aClass24Array3[0]);
						}
					}
					if (local174.anInt7966 == 2) {
						@Pc(240) int local240 = local174.anInt7971 + 256 - Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911;
						local99 = local174.anInt7961 + 256 - Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913;
						local206 = local174.anInt7970 << 9;
						local206 *= local206;
						this.method7150(local19, local240, local99, local206, local174.anInt7968, arg0, super.aClass24Array3[0]);
					}
					if (local174.anInt7966 == 10 && local174.anInt7964 >= 0 && local174.anInt7964 < Static551.aClass15_Sub2_Sub4_Sub2Array1.length) {
						@Pc(298) Class15_Sub2_Sub4_Sub2 local298 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local174.anInt7964];
						if (local298 != null) {
							local99 = local298.anInt8911 - Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911;
							local206 = local298.anInt8913 - Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913;
							this.method7150(local19, local99, local206, 92160000, local174.anInt7968, arg0, super.aClass24Array3[0]);
						}
					}
				}
			}
			local19.a(local24);
			local19.G(super.anInt8911, super.anInt8915, super.anInt8913);
		}
		local19.a(local24);
		local19.G(super.anInt8911, super.anInt8915 - 5, super.anInt8913);
		@Pc(363) Class60_Sub8 local363 = Static191.method3243(super.aClass24Array3.length);
		this.method7138(false, local19, arg0, super.aClass24Array3);
		if (super.aClass60_Sub4_8 == null) {
			arg0.method7476(super.aClass24Array3, local19, local363.aClass60_Sub6Array1, Static461.aClass15_Sub2_Sub4_Sub2_2 == this ? 1 : 0);
		} else {
			@Pc(378) Class127 local378 = super.aClass60_Sub4_8.method3587();
			arg0.method7524(super.aClass24Array3, local378, local19, local363.aClass60_Sub6Array1, Static461.aClass15_Sub2_Sub4_Sub2_2 == this ? 1 : 0);
		}
		super.anInt8957 = Static114.anInt1963;
		super.aClass24Array3[0] = super.aClass24Array3[1] = super.aClass24Array3[2] = super.aClass24Array3[3] = null;
		return local363;
	}
}
