import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nea")
public final class Class8_Sub1_Sub3_Sub4 extends Class8_Sub1_Sub3 implements Interface16 {

	@OriginalMember(owner = "client!nea", name = "W", descriptor = "Lclient!cca;")
	private Class59 aClass59_7;

	@OriginalMember(owner = "client!nea", name = "S", descriptor = "B")
	private final byte aByte111;

	@OriginalMember(owner = "client!nea", name = "hb", descriptor = "Z")
	private final boolean aBoolean516;

	@OriginalMember(owner = "client!nea", name = "P", descriptor = "Z")
	private final boolean aBoolean515;

	@OriginalMember(owner = "client!nea", name = "Q", descriptor = "S")
	private final short aShort87;

	@OriginalMember(owner = "client!nea", name = "nb", descriptor = "Z")
	private boolean aBoolean514;

	@OriginalMember(owner = "client!nea", name = "tb", descriptor = "B")
	private final byte aByte110;

	@OriginalMember(owner = "client!nea", name = "ub", descriptor = "Z")
	private final boolean aBoolean517;

	@OriginalMember(owner = "client!nea", name = "R", descriptor = "Lclient!ka;")
	public Class164 aClass164_6;

	@OriginalMember(owner = "client!nea", name = "cb", descriptor = "Lclient!r;")
	private Class5_Sub5_Sub4 aClass5_Sub5_Sub4_5;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZIIIIIIZ)V")
	public Class8_Sub1_Sub3_Sub4(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt905 == 1, Static324.method8984(arg12, arg13));
		this.aByte111 = (byte) arg13;
		this.aBoolean516 = arg7;
		this.aBoolean515 = arg1.anInt951 != 0 && !arg7;
		super.aByte146 = (byte) arg3;
		this.aShort87 = (short) arg1.anInt911;
		this.aBoolean514 = arg14;
		this.aByte110 = (byte) arg12;
		this.aBoolean517 = arg0.method7704() && arg1.aBoolean80 && !this.aBoolean516 && Static637.aClass5_Sub20_31.aClass24_Sub4_1.method1674() != 0;
		@Pc(83) int local83 = 2048;
		if (this.aBoolean514) {
			local83 |= 0x10000;
		}
		@Pc(98) Class214 local98 = this.method5700(local83, this.aBoolean517, (byte) 109, arg0);
		if (local98 != null) {
			this.aClass164_6 = local98.aClass164_3;
			this.aClass5_Sub5_Sub4_5 = local98.aClass5_Sub5_Sub4_2;
			if (this.aBoolean514) {
				this.aClass164_6 = this.aClass164_6.method9072((byte) 0, local83, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!ha;I)Lclient!cca;")
	@Override
	public Class59 method8904(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 65) {
			return null;
		} else {
			if (this.aClass59_7 == null) {
				this.aClass59_7 = Static151.method2111(-26, this.method5699(0, arg0), super.anInt10357, super.anInt10355, super.anInt10363);
			}
			return this.aClass59_7;
		}
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8090(@OriginalArg(1) Class57 arg0) {
		@Pc(24) Class5_Sub5_Sub4 local24;
		if (this.aClass5_Sub5_Sub4_5 == null && this.aBoolean517) {
			@Pc(35) Class214 local35 = this.method5700(262144, true, (byte) 109, arg0);
			local24 = local35 == null ? null : local35.aClass5_Sub5_Sub4_2;
		} else {
			local24 = this.aClass5_Sub5_Sub4_5;
			this.aClass5_Sub5_Sub4_5 = null;
		}
		if (local24 != null) {
			Static332.method5049(local24, super.aByte146, super.anInt10355, super.anInt10363, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!df;IZIIILclient!ha;)V")
	@Override
	public void method8901(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5) {
		if (arg0 instanceof Class8_Sub1_Sub4_Sub2) {
			@Pc(34) Class8_Sub1_Sub4_Sub2 local34 = (Class8_Sub1_Sub4_Sub2) arg0;
			if (this.aClass164_6 != null && local34.aClass164_4 != null) {
				this.aClass164_6.method9086(local34.aClass164_4, arg3, arg4, arg1, arg2);
			}
		} else if (arg0 instanceof Class8_Sub1_Sub3_Sub4) {
			@Pc(10) Class8_Sub1_Sub3_Sub4 local10 = (Class8_Sub1_Sub3_Sub4) arg0;
			if (this.aClass164_6 != null && local10.aClass164_6 != null) {
				this.aClass164_6.method9086(local10.aClass164_6, arg3, arg4, arg1, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IILclient!ha;B)Z")
	@Override
	public boolean method8895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) byte arg3) {
		@Pc(9) Class164 local9 = this.method5699(131072, arg2);
		if (arg3 > -43) {
			return true;
		} else if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class203 local20 = arg2.method7672();
			local20.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
			return Static565.aBoolean768 ? local9.method9069(arg1, arg0, local20, false, 0, Static243.anInt4189) : local9.method9093(arg1, arg0, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class164 method5699(@OriginalArg(1) int arg0, @OriginalArg(2) Class57 arg1) {
		if (this.aClass164_6 != null && arg1.method7670(this.aClass164_6.ua(), arg0) == 0) {
			return this.aClass164_6;
		} else {
			@Pc(37) Class214 local37 = this.method5700(arg0, false, (byte) 109, arg1);
			return local37 == null ? null : local37.aClass164_3;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)I")
	@Override
	public int method8089() {
		return this.aShort87 & 0xFFFF;
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)I")
	@Override
	public int method8092(@OriginalArg(0) int arg0) {
		if (arg0 != 18636) {
			this.method8898(113);
		}
		return this.aByte110;
	}

	@OriginalMember(owner = "client!nea", name = "h", descriptor = "(I)I")
	@Override
	protected int method8911() {
		this.method8091(true);
		return this.aClass164_6 == null ? 0 : this.aClass164_6.ma();
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)I")
	@Override
	public int method8091(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass164_6 = null;
		}
		return this.aByte111;
	}

	@OriginalMember(owner = "client!nea", name = "i", descriptor = "(I)V")
	@Override
	public void method8898(@OriginalArg(0) int arg0) {
		this.aBoolean514 = false;
		if (arg0 != -38) {
			Static390.anInt6669 = -12;
		}
		if (this.aClass164_6 != null) {
			this.aClass164_6.s(this.aClass164_6.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8088(@OriginalArg(0) int arg0) {
		if (arg0 != -9842) {
			this.method5702(-11);
		}
		return this.aBoolean517;
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8906(@OriginalArg(0) byte arg0) {
		if (arg0 != 27) {
			this.method5700(-123, false, (byte) 48, (Class57) null);
		}
		if (this.aClass164_6 == null) {
			return true;
		} else {
			return !this.aClass164_6.r();
		}
	}

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "(I)V")
	@Override
	public void method8093() {
		if (this.aClass164_6 != null) {
			this.aClass164_6.method9091();
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8087(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		@Pc(28) Class5_Sub5_Sub4 local28;
		if (this.aClass5_Sub5_Sub4_5 == null && this.aBoolean517) {
			@Pc(20) Class214 local20 = this.method5700(262144, true, (byte) 109, arg1);
			local28 = local20 == null ? null : local20.aClass5_Sub5_Sub4_2;
		} else {
			local28 = this.aClass5_Sub5_Sub4_5;
			this.aClass5_Sub5_Sub4_5 = null;
		}
		if (local28 != null) {
			Static98.method1435(local28, super.aByte146, super.anInt10355, super.anInt10363, (boolean[]) null);
		}
		if (arg0 >= -77) {
			this.method8907(58, (Class57) null);
		}
	}

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8907(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (arg0 != 0) {
			this.method8895(-14, -47, (Class57) null, (byte) -63);
		}
	}

	@OriginalMember(owner = "client!nea", name = "j", descriptor = "(I)I")
	@Override
	public int method8900(@OriginalArg(0) int arg0) {
		if (arg0 == -2226) {
			return this.aClass164_6 == null ? 0 : this.aClass164_6.fa();
		} else {
			return 46;
		}
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8897(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method8089();
		}
		return this.aClass164_6 == null ? false : this.aClass164_6.F();
	}

	@OriginalMember(owner = "client!nea", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8899(@OriginalArg(0) byte arg0) {
		if (arg0 != 94) {
			Static390.method5701((byte) -116);
		}
		return this.aBoolean514;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IZBLclient!ha;)Lclient!lg;")
	private Class214 method5700(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Class57 arg3) {
		if (arg2 != 109) {
			this.method8900(65);
		}
		@Pc(22) Class55 local22 = Static536.aClass392_2.method9293(0, this.aShort87 & 0xFFFF);
		@Pc(30) Class22 local30;
		@Pc(41) Class22 local41;
		if (this.aBoolean516) {
			local30 = Static134.aClass22Array1[super.aByte146];
			local41 = Static220.aClass22Array2[0];
		} else {
			local30 = Static220.aClass22Array2[super.aByte146];
			if (super.aByte146 < 3) {
				local41 = Static220.aClass22Array2[super.aByte146 + 1];
			} else {
				local41 = null;
			}
		}
		return local22.method862(arg0, super.anInt10363, super.anInt10357, super.anInt10355, 46, arg3, local41, this.aByte110 == 11 ? this.aByte111 + 4 : this.aByte111, this.aByte110 == 11 ? 10 : this.aByte110, local30, arg1, (Class309) null);
	}

	@OriginalMember(owner = "client!nea", name = "n", descriptor = "(I)I")
	public int method5702(@OriginalArg(0) int arg0) {
		if (arg0 != 15144) {
			Static390.method5701((byte) -104);
		}
		return this.aClass164_6 == null ? 15 : this.aClass164_6.na() / 4;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BLclient!ha;)Lclient!tf;")
	@Override
	public Class8_Sub10 method8909(@OriginalArg(0) byte arg0, @OriginalArg(1) Class57 arg1) {
		if (this.aClass164_6 == null) {
			return null;
		}
		if (arg0 != -104) {
			this.method8911();
		}
		@Pc(21) Class203 local21 = arg1.method7672();
		local21.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
		@Pc(35) Class8_Sub10 local35 = Static213.method3056(this.aBoolean515, 0, 1);
		if (Static565.aBoolean768) {
			this.aClass164_6.method9092(local21, local35.aClass8_Sub7Array1[0], Static243.anInt4189, 0);
		} else {
			this.aClass164_6.method9073(local21, local35.aClass8_Sub7Array1[0], 0);
		}
		return local35;
	}
}
