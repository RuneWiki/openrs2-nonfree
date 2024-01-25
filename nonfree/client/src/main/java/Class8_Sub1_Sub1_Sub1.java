import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class8_Sub1_Sub1_Sub1 extends Class8_Sub1_Sub1 implements Interface16 {

	@OriginalMember(owner = "client!af", name = "ab", descriptor = "Lclient!cca;")
	private Class59 aClass59_1;

	@OriginalMember(owner = "client!af", name = "W", descriptor = "Z")
	private final boolean aBoolean20;

	@OriginalMember(owner = "client!af", name = "ib", descriptor = "S")
	private final short aShort3;

	@OriginalMember(owner = "client!af", name = "mb", descriptor = "B")
	private byte aByte7;

	@OriginalMember(owner = "client!af", name = "fb", descriptor = "Z")
	private final boolean aBoolean17;

	@OriginalMember(owner = "client!af", name = "eb", descriptor = "Z")
	private boolean aBoolean21;

	@OriginalMember(owner = "client!af", name = "rb", descriptor = "Z")
	private final boolean aBoolean19;

	@OriginalMember(owner = "client!af", name = "P", descriptor = "Lclient!r;")
	private Class5_Sub5_Sub4 aClass5_Sub5_Sub4_1;

	@OriginalMember(owner = "client!af", name = "Y", descriptor = "Lclient!ka;")
	private Class164 aClass164_1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZIZ)V")
	public Class8_Sub1_Sub1_Sub1(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt927);
		this.aBoolean20 = arg1.anInt951 != 0 && !arg7;
		super.anInt10355 = arg4;
		super.anInt10363 = arg6;
		this.aShort3 = (short) arg1.anInt911;
		this.aByte7 = (byte) arg8;
		this.aBoolean17 = arg7;
		this.aBoolean21 = arg9;
		this.aBoolean19 = arg0.method7704() && arg1.aBoolean80 && !this.aBoolean17 && Static637.aClass5_Sub20_31.aClass24_Sub4_1.method1674() != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean21) {
			local71 |= 0x10000;
		}
		@Pc(86) Class214 local86 = this.method203(arg0, local71, this.aBoolean19);
		if (local86 != null) {
			this.aClass5_Sub5_Sub4_1 = local86.aClass5_Sub5_Sub4_2;
			this.aClass164_1 = local86.aClass164_3;
			if (this.aBoolean21) {
				this.aClass164_1 = this.aClass164_1.method9072((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BLclient!ha;)Lclient!tf;")
	@Override
	public Class8_Sub10 method8909(@OriginalArg(0) byte arg0, @OriginalArg(1) Class57 arg1) {
		if (this.aClass164_1 == null) {
			return null;
		} else if (arg0 == -104) {
			@Pc(18) Class203 local18 = arg1.method7672();
			local18.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
			@Pc(32) Class8_Sub10 local32 = Static213.method3056(this.aBoolean20, 0, 1);
			if (Static565.aBoolean768) {
				this.aClass164_1.method9092(local18, local32.aClass8_Sub7Array1[0], Static243.anInt4189, 0);
			} else {
				this.aClass164_1.method9073(local18, local32.aClass8_Sub7Array1[0], 0);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)I")
	@Override
	public int method8089() {
		return this.aShort3 & 0xFFFF;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8090(@OriginalArg(1) Class57 arg0) {
		@Pc(36) Class5_Sub5_Sub4 local36;
		if (this.aClass5_Sub5_Sub4_1 == null && this.aBoolean19) {
			@Pc(28) Class214 local28 = this.method203(arg0, 262144, true);
			local36 = local28 == null ? null : local28.aClass5_Sub5_Sub4_2;
		} else {
			local36 = this.aClass5_Sub5_Sub4_1;
			this.aClass5_Sub5_Sub4_1 = null;
		}
		if (local36 != null) {
			Static332.method5049(local36, super.aByte146, super.anInt10355, super.anInt10363, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IILclient!ha;B)Z")
	@Override
	public boolean method8895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) byte arg3) {
		if (arg3 >= -43) {
			return false;
		}
		@Pc(15) Class164 local15 = this.method202(131072, arg2);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class203 local20 = arg2.method7672();
			local20.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
			return Static565.aBoolean768 ? local15.method9069(arg1, arg0, local20, false, 0, Static243.anInt4189) : local15.method9093(arg1, arg0, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8899(@OriginalArg(0) byte arg0) {
		return arg0 == 94 ? this.aBoolean21 : true;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)I")
	@Override
	public int method8091(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method8900(46);
		}
		return this.aByte7;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8087(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		@Pc(28) Class5_Sub5_Sub4 local28;
		if (this.aClass5_Sub5_Sub4_1 == null && this.aBoolean19) {
			@Pc(20) Class214 local20 = this.method203(arg1, 262144, true);
			local28 = local20 == null ? null : local20.aClass5_Sub5_Sub4_2;
		} else {
			local28 = this.aClass5_Sub5_Sub4_1;
			this.aClass5_Sub5_Sub4_1 = null;
		}
		if (arg0 <= -77 && local28 != null) {
			Static98.method1435(local28, super.aByte146, super.anInt10355, super.anInt10363, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!ha;I)Lclient!cca;")
	@Override
	public Class59 method8904(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass59_1 == null) {
			this.aClass59_1 = Static151.method2111(126, this.method202(0, arg0), super.anInt10357, super.anInt10355, super.anInt10363);
		}
		if (arg1 <= 65) {
			this.aByte7 = -31;
		}
		return this.aClass59_1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8088(@OriginalArg(0) int arg0) {
		if (arg0 != -9842) {
			Static10.method201();
		}
		return this.aBoolean19;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
	@Override
	public void method8093() {
		if (this.aClass164_1 != null) {
			this.aClass164_1.method9091();
		}
	}

	@OriginalMember(owner = "client!af", name = "j", descriptor = "(I)I")
	@Override
	public int method8900(@OriginalArg(0) int arg0) {
		if (arg0 != -2226) {
			this.method8906((byte) 53);
		}
		return this.aClass164_1 == null ? 0 : this.aClass164_1.fa();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class164 method202(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (this.aClass164_1 != null && arg1.method7670(this.aClass164_1.ua(), arg0) == 0) {
			return this.aClass164_1;
		} else {
			@Pc(29) Class214 local29 = this.method203(arg1, arg0, false);
			return local29 == null ? null : local29.aClass164_3;
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8906(@OriginalArg(0) byte arg0) {
		if (arg0 != 27) {
			this.method8087(64, (Class57) null);
		}
		if (this.aClass164_1 == null) {
			return true;
		} else {
			return !this.aClass164_1.r();
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)I")
	@Override
	public int method8092(@OriginalArg(0) int arg0) {
		return arg0 == 18636 ? 22 : -2;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8907(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (arg0 != 0) {
			this.aClass5_Sub5_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!af", name = "h", descriptor = "(I)I")
	@Override
	protected int method8911() {
		this.method8911();
		return this.aClass164_1 == null ? 0 : this.aClass164_1.ma();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!ha;IZZ)Lclient!lg;")
	private Class214 method203(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class55 local13 = Static536.aClass392_2.method9293(0, this.aShort3 & 0xFFFF);
		@Pc(29) Class22 local29;
		@Pc(33) Class22 local33;
		if (this.aBoolean17) {
			local29 = Static134.aClass22Array1[super.aByte146];
			local33 = Static220.aClass22Array2[0];
		} else {
			if (super.aByte146 >= 3) {
				local33 = null;
			} else {
				local33 = Static220.aClass22Array2[super.aByte146 + 1];
			}
			local29 = Static220.aClass22Array2[super.aByte146];
		}
		return local13.method862(arg1, super.anInt10363, super.anInt10357, super.anInt10355, 79, arg0, local33, this.aByte7, 22, local29, arg2, (Class309) null);
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8897(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return false;
		} else if (this.aClass164_1 == null) {
			return false;
		} else {
			return this.aClass164_1.F();
		}
	}

	@OriginalMember(owner = "client!af", name = "i", descriptor = "(I)V")
	@Override
	public void method8898(@OriginalArg(0) int arg0) {
		if (arg0 != -38) {
			this.method8907(-81, (Class57) null);
		}
		this.aBoolean21 = false;
		if (this.aClass164_1 != null) {
			this.aClass164_1.s(this.aClass164_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!df;IZIIILclient!ha;)V")
	@Override
	public void method8901(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5) {
		if (arg0 instanceof Class8_Sub1_Sub1_Sub1) {
			@Pc(5) Class8_Sub1_Sub1_Sub1 local5 = (Class8_Sub1_Sub1_Sub1) arg0;
			if (this.aClass164_1 != null && local5.aClass164_1 != null) {
				this.aClass164_1.method9086(local5.aClass164_1, arg3, arg4, arg1, arg2);
			}
		}
	}
}
