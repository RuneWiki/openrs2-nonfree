import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class11_Sub1_Sub1_Sub3 extends Class11_Sub1_Sub1 implements Interface27 {

	@OriginalMember(owner = "client!ef", name = "qb", descriptor = "Lclient!tb;")
	private Class316 aClass316_4;

	@OriginalMember(owner = "client!ef", name = "lb", descriptor = "B")
	private final byte lb;

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "Z")
	private final boolean aBoolean243;

	@OriginalMember(owner = "client!ef", name = "eb", descriptor = "S")
	private final short aShort46;

	@OriginalMember(owner = "client!ef", name = "sb", descriptor = "Z")
	private boolean aBoolean246;

	@OriginalMember(owner = "client!ef", name = "Z", descriptor = "B")
	private final byte aByte53;

	@OriginalMember(owner = "client!ef", name = "ob", descriptor = "Z")
	private final boolean aBoolean245;

	@OriginalMember(owner = "client!ef", name = "cb", descriptor = "Z")
	private final boolean aBoolean244;

	@OriginalMember(owner = "client!ef", name = "P", descriptor = "Lclient!r;")
	private Class2_Sub5_Sub12 aClass2_Sub5_Sub12_3;

	@OriginalMember(owner = "client!ef", name = "nb", descriptor = "Lclient!ka;")
	public Class25 aClass25_3;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ha;Lclient!uw;IIIIIZIIIIIIZ)V")
	public Class11_Sub1_Sub1_Sub3(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class350 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt9635 == 1, Static305.method4708(arg13, arg12));
		this.lb = (byte) arg12;
		super.aByte125 = (byte) arg3;
		this.aBoolean243 = arg1.anInt9624 != 0 && !arg7;
		this.aShort46 = (short) arg1.anInt9607;
		this.aBoolean246 = arg14;
		this.aByte53 = (byte) arg13;
		this.aBoolean245 = arg7;
		this.aBoolean244 = arg0.method7904() && arg1.aBoolean706 && !this.aBoolean245 && Static404.aClass2_Sub13_2.aClass33_Sub2_1.method1495() != 0;
		@Pc(77) int local77 = 2048;
		if (this.aBoolean246) {
			local77 |= 0x10000;
		}
		@Pc(92) Class234 local92 = this.method2442(this.aBoolean244, arg0, local77);
		if (local92 != null) {
			this.aClass2_Sub5_Sub12_3 = local92.aClass2_Sub5_Sub12_6;
			this.aClass25_3 = local92.aClass25_7;
			if (this.aBoolean246) {
				this.aClass25_3 = this.aClass25_3.method7732((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)I")
	@Override
	public int method8328() {
		return this.aByte53;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	@Override
	public void method8331() {
		if (this.aClass25_3 != null) {
			this.aClass25_3.method7727();
		}
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)I")
	@Override
	public int method8304(@OriginalArg(0) byte arg0) {
		if (arg0 == -83) {
			return this.aClass25_3 == null ? 0 : this.aClass25_3.ma();
		} else {
			return -10;
		}
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method8310() {
		return this.aClass25_3 == null ? false : this.aClass25_3.F();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method8301(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class25 local9 = this.method2440(arg0, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class6 local14 = arg0.method7892();
			local14.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
			return Static172.aBoolean322 ? local9.method7730(arg2, arg1, local14, false, 0, Static388.anInt6979) : local9.method7721(arg2, arg1, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!ha;ZI)Lclient!ka;")
	private Class25 method2440(@OriginalArg(0) Class87 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass25_3 != null && arg0.method7950(this.aClass25_3.ua(), arg1) == 0) {
			return this.aClass25_3;
		} else {
			@Pc(30) Class234 local30 = this.method2442(false, arg0, arg1);
			return local30 == null ? null : local30.aClass25_7;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BILclient!ha;Lclient!gs;ZII)V")
	@Override
	public void method8316(@OriginalArg(1) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) Class11_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class11_Sub1_Sub2_Sub1) {
			@Pc(35) Class11_Sub1_Sub2_Sub1 local35 = (Class11_Sub1_Sub2_Sub1) arg2;
			if (this.aClass25_3 == null || local35.aClass25_1 == null) {
				return;
			}
			this.aClass25_3.method7726(local35.aClass25_1, arg0, arg4, arg5, arg3);
		} else if (arg2 instanceof Class11_Sub1_Sub1_Sub3) {
			@Pc(16) Class11_Sub1_Sub1_Sub3 local16 = (Class11_Sub1_Sub1_Sub3) arg2;
			if (this.aClass25_3 != null && local16.aClass25_3 != null) {
				this.aClass25_3.method7726(local16.aClass25_3, arg0, arg4, arg5, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(BLclient!ha;)Lclient!vw;")
	@Override
	public Class11_Sub10 method8307(@OriginalArg(1) Class87 arg0) {
		if (this.aClass25_3 == null) {
			return null;
		}
		@Pc(23) Class6 local23 = arg0.method7892();
		local23.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
		@Pc(37) Class11_Sub10 local37 = Static600.method8238(1, this.aBoolean243);
		if (Static172.aBoolean322) {
			this.aClass25_3.method7725(local23, local37.aClass11_Sub7Array1[0], Static388.anInt6979, 0);
		} else {
			this.aClass25_3.method7735(local23, local37.aClass11_Sub7Array1[0], 0);
		}
		return local37;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8327(@OriginalArg(1) Class87 arg0) {
		@Pc(29) Class2_Sub5_Sub12 local29;
		if (this.aClass2_Sub5_Sub12_3 == null && this.aBoolean244) {
			@Pc(22) Class234 local22 = this.method2442(true, arg0, 262144);
			local29 = local22 == null ? null : local22.aClass2_Sub5_Sub12_6;
		} else {
			local29 = this.aClass2_Sub5_Sub12_3;
			this.aClass2_Sub5_Sub12_3 = null;
		}
		if (local29 != null) {
			Static616.method8379(local29, super.aByte125, super.anInt9925, super.anInt9929, null);
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8312(@OriginalArg(1) Class87 arg0) {
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8325(@OriginalArg(0) Class87 arg0) {
		@Pc(33) Class2_Sub5_Sub12 local33;
		if (this.aClass2_Sub5_Sub12_3 == null && this.aBoolean244) {
			@Pc(26) Class234 local26 = this.method2442(true, arg0, 262144);
			local33 = local26 == null ? null : local26.aClass2_Sub5_Sub12_6;
		} else {
			local33 = this.aClass2_Sub5_Sub12_3;
			this.aClass2_Sub5_Sub12_3 = null;
		}
		if (local33 != null) {
			Static363.method5523(local33, super.aByte125, super.anInt9925, super.anInt9929, null);
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)I")
	@Override
	public int method8329() {
		return this.lb;
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
	@Override
	public void method8311() {
		this.aBoolean246 = false;
		if (this.aClass25_3 != null) {
			this.aClass25_3.s(this.aClass25_3.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8330() {
		return this.aBoolean244;
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8306() {
		if (this.aClass25_3 == null) {
			return true;
		} else {
			return !this.aClass25_3.r();
		}
	}

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)I")
	@Override
	public int method8315() {
		return this.aClass25_3 == null ? 0 : this.aClass25_3.fa();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)I")
	@Override
	public int method8326() {
		return this.aShort46 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLclient!ha;II)Lclient!nj;")
	private Class234 method2442(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class350 local16 = Static619.aClass281_4.method6734(this.aShort46 & 0xFFFF);
		@Pc(24) Class112 local24;
		@Pc(28) Class112 local28;
		if (this.aBoolean245) {
			local24 = Static164.aClass112Array1[super.aByte125];
			local28 = Static178.aClass112Array2[0];
		} else {
			local24 = Static178.aClass112Array2[super.aByte125];
			if (super.aByte125 < 3) {
				local28 = Static178.aClass112Array2[super.aByte125 + 1];
			} else {
				local28 = null;
			}
		}
		return local16.method8090(local28, local24, super.anInt9930, arg0, this.lb == 11 ? this.aByte53 + 4 : this.aByte53, super.anInt9925, this.lb == 11 ? 10 : this.lb, arg2, arg1, super.anInt9929);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!ha;Z)Lclient!tb;")
	@Override
	public Class316 method8308(@OriginalArg(0) Class87 arg0) {
		if (this.aClass316_4 == null) {
			this.aClass316_4 = Static492.method7054(super.anInt9925, super.anInt9929, this.method2440(arg0, 0), super.anInt9930);
		}
		return this.aClass316_4;
	}

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "(I)I")
	public int method2443() {
		return this.aClass25_3 == null ? 15 : this.aClass25_3.na() / 4;
	}

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method8313() {
		return this.aBoolean246;
	}
}
