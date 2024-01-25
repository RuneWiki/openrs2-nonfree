import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class8_Sub1_Sub2_Sub2 extends Class8_Sub1_Sub2 implements Interface16 {

	@OriginalMember(owner = "client!tb", name = "S", descriptor = "Lclient!cca;")
	private Class59 aClass59_8;

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "Z")
	private boolean aBoolean726;

	@OriginalMember(owner = "client!tb", name = "O", descriptor = "B")
	private byte aByte135;

	@OriginalMember(owner = "client!tb", name = "ob", descriptor = "S")
	private final short aShort106;

	@OriginalMember(owner = "client!tb", name = "mb", descriptor = "Z")
	private final boolean aBoolean727;

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "B")
	private final byte aByte134;

	@OriginalMember(owner = "client!tb", name = "bb", descriptor = "Z")
	private boolean aBoolean725;

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "Lclient!r;")
	private Class5_Sub5_Sub4 aClass5_Sub5_Sub4_6;

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "Lclient!ka;")
	private Class164 aClass164_7;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZIIII)V")
	public Class8_Sub1_Sub2_Sub2(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		super.anInt10355 = arg4;
		this.aBoolean726 = arg1.anInt951 != 0 && !arg7;
		this.aByte135 = (byte) arg10;
		this.aShort106 = (short) arg1.anInt911;
		super.anInt10363 = arg6;
		this.aBoolean727 = arg7;
		this.aByte134 = (byte) arg11;
		this.aBoolean725 = arg0.method7704() && arg1.aBoolean80 && !this.aBoolean727 && Static637.aClass5_Sub20_31.aClass24_Sub4_1.method1674() != 0;
		@Pc(78) Class214 local78 = this.method8096(arg0, this.aBoolean725, 0, 2048);
		if (local78 != null) {
			this.aClass5_Sub5_Sub4_6 = local78.aClass5_Sub5_Sub4_2;
			this.aClass164_7 = local78.aClass164_3;
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
	@Override
	public void method8093() {
		if (this.aClass164_7 != null) {
			this.aClass164_7.method9091();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8906(@OriginalArg(0) byte arg0) {
		if (arg0 != 27) {
			this.method8092(114);
		}
		if (this.aClass164_7 == null) {
			return true;
		} else {
			return !this.aClass164_7.r();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)I")
	@Override
	public int method8089() {
		return this.aShort106 & 0xFFFF;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class164 method8094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2) {
		if (this.aClass164_7 != null && arg2.method7670(this.aClass164_7.ua(), arg1) == 0) {
			return this.aClass164_7;
		} else {
			@Pc(28) Class214 local28 = this.method8096(arg2, false, arg0 + arg0, arg1);
			return local28 == null ? null : local28.aClass164_3;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ha;ZII)Lclient!lg;")
	private Class214 method8096(@OriginalArg(0) Class57 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) Class55 local13 = Static536.aClass392_2.method9293(arg2, this.aShort106 & 0xFFFF);
		@Pc(21) Class22 local21;
		@Pc(32) Class22 local32;
		if (this.aBoolean727) {
			local21 = Static134.aClass22Array1[super.aByte146];
			local32 = Static220.aClass22Array2[0];
		} else {
			local21 = Static220.aClass22Array2[super.aByte146];
			if (super.aByte146 < 3) {
				local32 = Static220.aClass22Array2[super.aByte146 + 1];
			} else {
				local32 = null;
			}
		}
		return local13.method862(arg3, super.anInt10363, super.anInt10357, super.anInt10355, arg2 + 50, arg0, local32, this.aByte134, this.aByte135, local21, arg1, (Class309) null);
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)I")
	@Override
	protected int method8911() {
		this.aClass164_7 = null;
		return this.aClass164_7 == null ? 0 : this.aClass164_7.ma();
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8907(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (arg0 != 0) {
			this.aBoolean725 = true;
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8897(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method8094(-97, 49, (Class57) null);
		}
		return this.aClass164_7 == null ? false : this.aClass164_7.F();
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8090(@OriginalArg(1) Class57 arg0) {
		@Pc(24) Class5_Sub5_Sub4 local24;
		if (this.aClass5_Sub5_Sub4_6 == null && this.aBoolean725) {
			@Pc(35) Class214 local35 = this.method8096(arg0, true, 0, 262144);
			local24 = local35 == null ? null : local35.aClass5_Sub5_Sub4_2;
		} else {
			local24 = this.aClass5_Sub5_Sub4_6;
			this.aClass5_Sub5_Sub4_6 = null;
		}
		if (local24 != null) {
			Static332.method5049(local24, super.aByte146, super.anInt10355, super.anInt10363, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8088(@OriginalArg(0) int arg0) {
		return arg0 == -9842 ? this.aBoolean725 : false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!ha;B)Z")
	@Override
	public boolean method8895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) byte arg3) {
		if (arg3 >= -43) {
			return true;
		}
		@Pc(15) Class164 local15 = this.method8094(0, 131072, arg2);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class203 local20 = arg2.method7672();
			local20.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
			return Static565.aBoolean768 ? local15.method9069(arg1, arg0, local20, false, 0, Static243.anInt4189) : local15.method9093(arg1, arg0, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "(I)I")
	@Override
	public int method8900(@OriginalArg(0) int arg0) {
		if (arg0 != -2226) {
			this.aBoolean726 = false;
		}
		return this.aClass164_7 == null ? 0 : this.aClass164_7.fa();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)I")
	@Override
	public int method8091(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static559.aClass247_1 = null;
		}
		return this.aByte134;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ha;I)Lclient!cca;")
	@Override
	public Class59 method8904(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 65) {
			this.aByte135 = -18;
		}
		if (this.aClass59_8 == null) {
			this.aClass59_8 = Static151.method2111(40, this.method8094(0, 0, arg0), super.anInt10357, super.anInt10355, super.anInt10363);
		}
		return this.aClass59_8;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)I")
	@Override
	public int method8092(@OriginalArg(0) int arg0) {
		return arg0 == 18636 ? this.aByte135 : -23;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8087(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (arg0 > -77) {
			this.aBoolean725 = true;
		}
		@Pc(24) Class5_Sub5_Sub4 local24;
		if (this.aClass5_Sub5_Sub4_6 == null && this.aBoolean725) {
			@Pc(35) Class214 local35 = this.method8096(arg1, true, 0, 262144);
			local24 = local35 == null ? null : local35.aClass5_Sub5_Sub4_2;
		} else {
			local24 = this.aClass5_Sub5_Sub4_6;
			this.aClass5_Sub5_Sub4_6 = null;
		}
		if (local24 != null) {
			Static98.method1435(local24, super.aByte146, super.anInt10355, super.anInt10363, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!ha;)Lclient!tf;")
	@Override
	public Class8_Sub10 method8909(@OriginalArg(0) byte arg0, @OriginalArg(1) Class57 arg1) {
		if (arg0 != -104) {
			this.aBoolean725 = true;
		}
		if (this.aClass164_7 == null) {
			return null;
		}
		@Pc(20) Class203 local20 = arg1.method7672();
		local20.method8332(super.anInt10355 + super.aShort104, super.anInt10357, super.aShort105 + super.anInt10363);
		@Pc(41) Class8_Sub10 local41 = Static213.method3056(this.aBoolean726, 0, 1);
		if (Static565.aBoolean768) {
			this.aClass164_7.method9092(local20, local41.aClass8_Sub7Array1[0], Static243.anInt4189, 0);
		} else {
			this.aClass164_7.method9073(local20, local41.aClass8_Sub7Array1[0], 0);
		}
		return local41;
	}
}
