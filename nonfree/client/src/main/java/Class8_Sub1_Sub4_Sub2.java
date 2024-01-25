import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class8_Sub1_Sub4_Sub2 extends Class8_Sub1_Sub4 implements Interface16 {

	@OriginalMember(owner = "client!mo", name = "sb", descriptor = "Lclient!cca;")
	private Class59 aClass59_6;

	@OriginalMember(owner = "client!mo", name = "W", descriptor = "Z")
	private boolean aBoolean494;

	@OriginalMember(owner = "client!mo", name = "M", descriptor = "Z")
	private boolean aBoolean495;

	@OriginalMember(owner = "client!mo", name = "O", descriptor = "B")
	private byte aByte103;

	@OriginalMember(owner = "client!mo", name = "tb", descriptor = "S")
	private final short aShort80;

	@OriginalMember(owner = "client!mo", name = "eb", descriptor = "Z")
	private boolean aBoolean496;

	@OriginalMember(owner = "client!mo", name = "ab", descriptor = "B")
	private final byte aByte104;

	@OriginalMember(owner = "client!mo", name = "db", descriptor = "Z")
	private final boolean aBoolean493;

	@OriginalMember(owner = "client!mo", name = "U", descriptor = "Lclient!r;")
	private Class5_Sub5_Sub4 aClass5_Sub5_Sub4_3;

	@OriginalMember(owner = "client!mo", name = "Z", descriptor = "Lclient!ka;")
	public Class164 aClass164_4;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZIIZ)V")
	public Class8_Sub1_Sub4_Sub2(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static679.method9325(arg8, arg9));
		this.aBoolean494 = arg7;
		super.anInt10363 = arg6;
		this.aBoolean495 = arg10;
		this.aByte103 = (byte) arg8;
		this.aShort80 = (short) arg1.anInt911;
		this.aBoolean496 = arg1.anInt951 != 0 && !arg7;
		super.anInt10355 = arg4;
		this.aByte104 = (byte) arg9;
		this.aBoolean493 = arg0.method7704() && arg1.aBoolean80 && !this.aBoolean494 && Static637.aClass5_Sub20_31.aClass24_Sub4_1.method1674() != 0;
		@Pc(74) int local74 = 2048;
		if (this.aBoolean495) {
			local74 |= 0x10000;
		}
		@Pc(89) Class214 local89 = this.method5505(this.aBoolean493, local74, arg0, 2);
		if (local89 != null) {
			this.aClass5_Sub5_Sub4_3 = local89.aClass5_Sub5_Sub4_2;
			this.aClass164_4 = local89.aClass164_3;
			if (this.aBoolean495) {
				this.aClass164_4 = this.aClass164_4.method9072((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLclient!ha;)Lclient!tf;")
	@Override
	public Class8_Sub10 method8909(@OriginalArg(0) byte arg0, @OriginalArg(1) Class57 arg1) {
		if (this.aClass164_4 == null) {
			return null;
		}
		@Pc(12) Class203 local12 = arg1.method7672();
		if (arg0 != -104) {
			this.method5505(true, 19, (Class57) null, -106);
		}
		local12.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
		@Pc(38) Class8_Sub10 local38 = Static213.method3056(this.aBoolean496, 0, 1);
		if (Static565.aBoolean768) {
			this.aClass164_4.method9092(local12, local38.aClass8_Sub7Array1[0], Static243.anInt4189, 0);
		} else {
			this.aClass164_4.method9073(local12, local38.aClass8_Sub7Array1[0], 0);
		}
		return local38;
	}

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "(I)V")
	@Override
	public void method8898(@OriginalArg(0) int arg0) {
		this.aBoolean495 = false;
		if (this.aClass164_4 != null) {
			this.aClass164_4.s(this.aClass164_4.ua() & 0xFFFEFFFF);
		}
		if (arg0 != -38) {
			this.aBoolean494 = false;
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)I")
	@Override
	public int method8092(@OriginalArg(0) int arg0) {
		if (arg0 != 18636) {
			this.aClass5_Sub5_Sub4_3 = null;
		}
		return this.aByte103;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8088(@OriginalArg(0) int arg0) {
		if (arg0 != -9842) {
			this.method8091(true);
		}
		return this.aBoolean493;
	}

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "(I)I")
	@Override
	protected int method8911() {
		return 56;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8907(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (arg0 != 0) {
			this.method8900(-81);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZILclient!ha;I)Lclient!lg;")
	private Class214 method5505(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) int arg3) {
		if (arg3 != 2) {
			return null;
		}
		@Pc(21) Class55 local21 = Static536.aClass392_2.method9293(arg3 - 2, this.aShort80 & 0xFFFF);
		@Pc(46) Class22 local46;
		@Pc(32) Class22 local32;
		if (this.aBoolean494) {
			local46 = Static134.aClass22Array1[super.aByte146];
			local32 = Static220.aClass22Array2[0];
		} else {
			if (super.aByte146 >= 3) {
				local32 = null;
			} else {
				local32 = Static220.aClass22Array2[super.aByte146 + 1];
			}
			local46 = Static220.aClass22Array2[super.aByte146];
		}
		return local21.method862(arg1, super.anInt10363, super.anInt10357, super.anInt10355, 39, arg2, local32, this.aByte104, this.aByte103, local46, arg0, (Class309) null);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!df;IZIIILclient!ha;)V")
	@Override
	public void method8901(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5) {
		if (arg0 instanceof Class8_Sub1_Sub4_Sub2) {
			@Pc(9) Class8_Sub1_Sub4_Sub2 local9 = (Class8_Sub1_Sub4_Sub2) arg0;
			if (this.aClass164_4 != null && local9.aClass164_4 != null) {
				this.aClass164_4.method9086(local9.aClass164_4, arg3, arg4, arg1, arg2);
			}
		} else if (arg0 instanceof Class8_Sub1_Sub3_Sub4) {
			@Pc(38) Class8_Sub1_Sub3_Sub4 local38 = (Class8_Sub1_Sub3_Sub4) arg0;
			if (this.aClass164_4 != null && local38.aClass164_6 != null) {
				this.aClass164_4.method9086(local38.aClass164_6, arg3, arg4, arg1, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)I")
	@Override
	public int method8091(@OriginalArg(0) boolean arg0) {
		return arg0 ? 58 : this.aByte104;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)I")
	@Override
	public int method8089() {
		return this.aShort80 & 0xFFFF;
	}

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "(I)I")
	@Override
	public int method8900(@OriginalArg(0) int arg0) {
		if (arg0 == -2226) {
			return this.aClass164_4 == null ? 0 : this.aClass164_4.fa();
		} else {
			return -21;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLclient!ha;I)Lclient!ka;")
	private Class164 method5508(@OriginalArg(1) Class57 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass164_4 != null && arg0.method7670(this.aClass164_4.ua(), arg1) == 0) {
			return this.aClass164_4;
		} else {
			@Pc(29) Class214 local29 = this.method5505(false, arg1, arg0, 2);
			return local29 == null ? null : local29.aClass164_3;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILclient!ha;B)Z")
	@Override
	public boolean method8895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) byte arg3) {
		@Pc(9) Class164 local9 = this.method5508(arg2, 131072);
		if (arg3 > -43) {
			return false;
		} else if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class203 local20 = arg2.method7672();
			local20.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
			return Static565.aBoolean768 ? local9.method9069(arg1, arg0, local20, false, 0, Static243.anInt4189) : local9.method9093(arg1, arg0, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8899(@OriginalArg(0) byte arg0) {
		if (arg0 != 94) {
			this.method8909((byte) 27, (Class57) null);
		}
		return this.aBoolean495;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8090(@OriginalArg(1) Class57 arg0) {
		@Pc(36) Class5_Sub5_Sub4 local36;
		if (this.aClass5_Sub5_Sub4_3 == null && this.aBoolean493) {
			@Pc(28) Class214 local28 = this.method5505(true, 262144, arg0, 2);
			local36 = local28 == null ? null : local28.aClass5_Sub5_Sub4_2;
		} else {
			local36 = this.aClass5_Sub5_Sub4_3;
			this.aClass5_Sub5_Sub4_3 = null;
		}
		if (local36 != null) {
			Static332.method5049(local36, super.aByte146, super.anInt10355, super.anInt10363, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8897(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aBoolean494 = true;
		}
		return this.aClass164_4 == null ? false : this.aClass164_4.F();
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)V")
	@Override
	public void method8093() {
		if (this.aClass164_4 != null) {
			this.aClass164_4.method9091();
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8906(@OriginalArg(0) byte arg0) {
		if (arg0 != 27) {
			this.aClass164_4 = null;
		}
		if (this.aClass164_4 == null) {
			return true;
		} else {
			return !this.aClass164_4.r();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8087(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (arg0 >= -77) {
			this.aByte103 = 38;
		}
		@Pc(24) Class5_Sub5_Sub4 local24;
		if (this.aClass5_Sub5_Sub4_3 == null && this.aBoolean493) {
			@Pc(35) Class214 local35 = this.method5505(true, 262144, arg1, 2);
			local24 = local35 == null ? null : local35.aClass5_Sub5_Sub4_2;
		} else {
			local24 = this.aClass5_Sub5_Sub4_3;
			this.aClass5_Sub5_Sub4_3 = null;
		}
		if (local24 != null) {
			Static98.method1435(local24, super.aByte146, super.anInt10355, super.anInt10363, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!ha;I)Lclient!cca;")
	@Override
	public Class59 method8904(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass59_6 == null) {
			this.aClass59_6 = Static151.method2111(118, this.method5508(arg0, 0), super.anInt10357, super.anInt10355, super.anInt10363);
		}
		if (arg1 <= 65) {
			this.aBoolean496 = false;
		}
		return this.aClass59_6;
	}
}
