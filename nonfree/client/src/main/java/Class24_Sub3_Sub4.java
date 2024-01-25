import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class24_Sub3_Sub4 extends Class24_Sub3 implements Interface10 {

	@OriginalMember(owner = "client!u", name = "W", descriptor = "Z")
	private final boolean aBoolean446;

	@OriginalMember(owner = "client!u", name = "H", descriptor = "B")
	private final byte aByte89;

	@OriginalMember(owner = "client!u", name = "R", descriptor = "B")
	private final byte aByte91;

	@OriginalMember(owner = "client!u", name = "u", descriptor = "Z")
	private final boolean aBoolean444;

	@OriginalMember(owner = "client!u", name = "O", descriptor = "B")
	private final byte aByte90;

	@OriginalMember(owner = "client!u", name = "bb", descriptor = "S")
	private final short aShort98;

	@OriginalMember(owner = "client!u", name = "X", descriptor = "Z")
	private boolean aBoolean447;

	@OriginalMember(owner = "client!u", name = "J", descriptor = "Z")
	private final boolean aBoolean445;

	@OriginalMember(owner = "client!u", name = "M", descriptor = "Lclient!e;")
	public Class63 aClass63_6;

	@OriginalMember(owner = "client!u", name = "F", descriptor = "Lclient!i;")
	private Class10_Sub1_Sub7 aClass10_Sub1_Sub7_5;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!za;Lclient!jc;IIIIIZIIIIIIZ)V")
	public Class24_Sub3_Sub4(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3786 == 1, Static84.method1605(arg12, arg13));
		this.aBoolean446 = arg7;
		this.aByte89 = (byte) arg12;
		this.aByte91 = (byte) arg13;
		this.aBoolean444 = arg1.anInt3778 != 0 && !arg7;
		this.aByte90 = (byte) arg3;
		this.aShort98 = (short) arg1.anInt3798;
		this.aBoolean447 = arg14;
		this.aBoolean445 = arg0.method5867() && arg1.aBoolean253 && !this.aBoolean446 && Static361.aClass85_Sub1_1.method2106(Static423.anInt7114) != 0;
		@Pc(77) int local77 = 2048;
		if (this.aBoolean447) {
			local77 |= 0x10000;
		}
		@Pc(92) Class210 local92 = this.method5318(local77, this.aBoolean445, arg0);
		if (local92 != null) {
			this.aClass63_6 = local92.aClass63_5;
			this.aClass10_Sub1_Sub7_5 = local92.aClass10_Sub1_Sub7_4;
			if (this.aBoolean447) {
				this.aClass63_6 = this.aClass63_6.method6093((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZBLclient!za;)Lclient!rn;")
	private Class210 method5318(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class50 arg2) {
		@Pc(20) Class126 local20 = Static342.aClass237_4.method5212(this.aShort98 & 0xFFFF);
		@Pc(28) Class154 local28;
		@Pc(39) Class154 local39;
		if (this.aBoolean446) {
			local28 = Static173.aClass154Array1[this.aByte90];
			local39 = Static256.aClass154Array2[0];
		} else {
			local28 = Static256.aClass154Array2[this.aByte90];
			if (this.aByte90 < 3) {
				local39 = Static256.aClass154Array2[this.aByte90 + 1];
			} else {
				local39 = null;
			}
		}
		return local20.method3014(arg1, this.aByte89 == 11 ? this.aByte91 + 4 : this.aByte91, super.anInt7092, super.anInt7094, super.anInt7096, arg0, local28, arg2, this.aByte89 == 11 ? 10 : this.aByte89, local39);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class63 method5703(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		return this.method5321(arg1, arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IBILclient!vs;Lclient!za;ZI)V")
	@Override
	public void method5687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class24_Sub5_Sub2) {
			@Pc(37) Class24_Sub5_Sub2 local37 = (Class24_Sub5_Sub2) arg2;
			if (this.aClass63_6 == null || local37.aClass63_7 == null) {
				return;
			}
			this.aClass63_6.method6086(local37.aClass63_7, arg1, arg0, arg5, arg4);
		} else if (arg2 instanceof Class24_Sub3_Sub4) {
			@Pc(18) Class24_Sub3_Sub4 local18 = (Class24_Sub3_Sub4) arg2;
			if (this.aClass63_6 != null && local18.aClass63_6 != null) {
				this.aClass63_6.method6086(local18.aClass63_6, arg1, arg0, arg5, arg4);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)I")
	@Override
	public int method5706() {
		return this.aShort98 & 0xFFFF;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!za;Z)V")
	@Override
	public void method5699(@OriginalArg(0) Class50 arg0) {
		@Pc(32) Class10_Sub1_Sub7 local32;
		if (this.aClass10_Sub1_Sub7_5 == null && this.aBoolean445) {
			@Pc(25) Class210 local25 = this.method5318(262144, true, arg0);
			local32 = local25 == null ? null : local25.aClass10_Sub1_Sub7_4;
		} else {
			local32 = this.aClass10_Sub1_Sub7_5;
			this.aClass10_Sub1_Sub7_5 = null;
		}
		if (local32 != null) {
			Static419.method5516(local32, this.aByte90, super.anInt7092, super.anInt7094, null);
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5701() {
		return this.aBoolean445;
	}

	@OriginalMember(owner = "client!u", name = "j", descriptor = "(I)I")
	public int method5320() {
		return this.aClass63_6 == null ? 15 : this.aClass63_6.k() / 4;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!za;B)Lclient!e;")
	private Class63 method5321(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1) {
		if (this.aClass63_6 != null && arg1.method5856(this.aClass63_6.RA(), arg0) == 0) {
			return this.aClass63_6;
		} else {
			@Pc(31) Class210 local31 = this.method5318(arg0, false, arg1);
			return local31 == null ? null : local31.aClass63_5;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	@Override
	public void method5700() {
		if (this.aClass63_6 != null) {
			this.aClass63_6.method6089();
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)I")
	@Override
	public int method5705() {
		return this.aByte91;
	}

	@OriginalMember(owner = "client!u", name = "h", descriptor = "(I)I")
	@Override
	public int method5579() {
		return this.aClass63_6 == null ? 0 : this.aClass63_6.B();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZLclient!za;II)Z")
	@Override
	public boolean method5691(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class63 local9 = this.method5321(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class34 local14 = arg0.method5819();
			local14.U(super.anInt7092, super.anInt7096, super.anInt7094);
			return local9.method6101(arg2, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5692() {
		return this.aBoolean447;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(Lclient!za;I)Lclient!nd;")
	@Override
	public Class40_Sub5 method5686(@OriginalArg(0) Class50 arg0) {
		if (this.aClass63_6 == null) {
			return null;
		}
		@Pc(16) Class34 local16 = arg0.method5819();
		local16.U(super.anInt7092, super.anInt7096, super.anInt7094);
		@Pc(26) Class40_Sub5 local26 = null;
		if (this.aBoolean444) {
			local26 = Static171.method2916(1);
		}
		this.aClass63_6.method6090(local16, local26 == null ? null : local26.aClass40_Sub8Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)I")
	@Override
	public int method5702() {
		return this.aByte89;
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
	@Override
	public void method5690() {
		this.aBoolean447 = false;
		if (this.aClass63_6 != null) {
			this.aClass63_6.D(this.aClass63_6.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5704(@OriginalArg(0) Class50 arg0) {
		@Pc(25) Class10_Sub1_Sub7 local25;
		if (this.aClass10_Sub1_Sub7_5 == null && this.aBoolean445) {
			@Pc(18) Class210 local18 = this.method5318(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass10_Sub1_Sub7_4;
		} else {
			local25 = this.aClass10_Sub1_Sub7_5;
			this.aClass10_Sub1_Sub7_5 = null;
		}
		if (local25 != null) {
			Static116.method2047(local25, this.aByte90, super.anInt7092, super.anInt7094, null);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5685(@OriginalArg(1) Class50 arg0) {
	}
}
