import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class11_Sub1_Sub2_Sub1 extends Class11_Sub1_Sub2 implements Interface27 {

	@OriginalMember(owner = "client!cf", name = "gb", descriptor = "Lclient!tb;")
	private Class316 aClass316_2;

	@OriginalMember(owner = "client!cf", name = "V", descriptor = "Z")
	private final boolean aBoolean102;

	@OriginalMember(owner = "client!cf", name = "eb", descriptor = "B")
	private final byte aByte35;

	@OriginalMember(owner = "client!cf", name = "Z", descriptor = "B")
	private final byte aByte34;

	@OriginalMember(owner = "client!cf", name = "R", descriptor = "S")
	private final short aShort33;

	@OriginalMember(owner = "client!cf", name = "P", descriptor = "Z")
	private boolean aBoolean101;

	@OriginalMember(owner = "client!cf", name = "W", descriptor = "Z")
	private final boolean aBoolean103;

	@OriginalMember(owner = "client!cf", name = "J", descriptor = "Z")
	private final boolean aBoolean100;

	@OriginalMember(owner = "client!cf", name = "fb", descriptor = "Lclient!r;")
	private Class2_Sub5_Sub12 aClass2_Sub5_Sub12_1;

	@OriginalMember(owner = "client!cf", name = "I", descriptor = "Lclient!ka;")
	public Class25 aClass25_1;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!ha;Lclient!uw;IIIIIZIIZ)V")
	public Class11_Sub1_Sub2_Sub1(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class350 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static556.method7707(arg8, arg9));
		this.aBoolean102 = arg1.anInt9624 != 0 && !arg7;
		super.anInt9929 = arg6;
		this.aByte35 = (byte) arg9;
		super.anInt9925 = arg4;
		this.aByte34 = (byte) arg8;
		this.aShort33 = (short) arg1.anInt9607;
		this.aBoolean101 = arg10;
		this.aBoolean103 = arg7;
		this.aBoolean100 = arg0.method7904() && arg1.aBoolean706 && !this.aBoolean103 && Static404.aClass2_Sub13_2.aClass33_Sub2_1.method1495() != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean101) {
			local69 |= 0x10000;
		}
		@Pc(84) Class234 local84 = this.method1196(arg0, local69, this.aBoolean100);
		if (local84 != null) {
			this.aClass2_Sub5_Sub12_1 = local84.aClass2_Sub5_Sub12_6;
			this.aClass25_1 = local84.aClass25_7;
			if (this.aBoolean101) {
				this.aClass25_1 = this.aClass25_1.method7732((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(BLclient!ha;)Lclient!vw;")
	@Override
	public Class11_Sub10 method8307(@OriginalArg(1) Class87 arg0) {
		if (this.aClass25_1 == null) {
			return null;
		}
		@Pc(16) Class6 local16 = arg0.method7892();
		local16.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
		@Pc(30) Class11_Sub10 local30 = Static600.method8238(1, this.aBoolean102);
		if (Static172.aBoolean322) {
			this.aClass25_1.method7725(local16, local30.aClass11_Sub7Array1[0], Static388.anInt6979, 0);
		} else {
			this.aClass25_1.method7735(local16, local30.aClass11_Sub7Array1[0], 0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8327(@OriginalArg(1) Class87 arg0) {
		@Pc(19) Class2_Sub5_Sub12 local19;
		if (this.aClass2_Sub5_Sub12_1 == null && this.aBoolean100) {
			@Pc(30) Class234 local30 = this.method1196(arg0, 262144, true);
			local19 = local30 == null ? null : local30.aClass2_Sub5_Sub12_6;
		} else {
			local19 = this.aClass2_Sub5_Sub12_1;
			this.aClass2_Sub5_Sub12_1 = null;
		}
		if (local19 != null) {
			Static616.method8379(local19, super.aByte125, super.anInt9925, super.anInt9929, null);
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)I")
	@Override
	public int method8329() {
		return this.aByte34;
	}

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method8313() {
		return this.aBoolean101;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!ha;Z)Lclient!tb;")
	@Override
	public Class316 method8308(@OriginalArg(0) Class87 arg0) {
		if (this.aClass316_2 == null) {
			this.aClass316_2 = Static492.method7054(super.anInt9925, super.anInt9929, this.method1197(0, arg0), super.anInt9930);
		}
		return this.aClass316_2;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BILclient!ha;Lclient!gs;ZII)V")
	@Override
	public void method8316(@OriginalArg(1) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) Class11_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class11_Sub1_Sub2_Sub1) {
			@Pc(13) Class11_Sub1_Sub2_Sub1 local13 = (Class11_Sub1_Sub2_Sub1) arg2;
			if (this.aClass25_1 != null && local13.aClass25_1 != null) {
				this.aClass25_1.method7726(local13.aClass25_1, arg0, arg4, arg5, arg3);
			}
		} else if (arg2 instanceof Class11_Sub1_Sub1_Sub3) {
			@Pc(35) Class11_Sub1_Sub1_Sub3 local35 = (Class11_Sub1_Sub1_Sub3) arg2;
			if (this.aClass25_1 != null && local35.aClass25_3 != null) {
				this.aClass25_1.method7726(local35.aClass25_3, arg0, arg4, arg5, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8312(@OriginalArg(1) Class87 arg0) {
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8325(@OriginalArg(0) Class87 arg0) {
		@Pc(33) Class2_Sub5_Sub12 local33;
		if (this.aClass2_Sub5_Sub12_1 == null && this.aBoolean100) {
			@Pc(26) Class234 local26 = this.method1196(arg0, 262144, true);
			local33 = local26 == null ? null : local26.aClass2_Sub5_Sub12_6;
		} else {
			local33 = this.aClass2_Sub5_Sub12_1;
			this.aClass2_Sub5_Sub12_1 = null;
		}
		if (local33 != null) {
			Static363.method5523(local33, super.aByte125, super.anInt9925, super.anInt9929, null);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)I")
	@Override
	public int method8326() {
		return this.aShort33 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "(I)I")
	@Override
	public int method8315() {
		return this.aClass25_1 == null ? 0 : this.aClass25_1.fa();
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(B)I")
	@Override
	public int method8304(@OriginalArg(0) byte arg0) {
		if (arg0 != -83) {
			this.method8312(null);
		}
		return this.aClass25_1 == null ? 0 : this.aClass25_1.ma();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8330() {
		return this.aBoolean100;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method8301(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class25 local14 = this.method1197(131072, arg0);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class6 local19 = arg0.method7892();
			local19.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
			return Static172.aBoolean322 ? local14.method7730(arg2, arg1, local19, false, 0, Static388.anInt6979) : local14.method7721(arg2, arg1, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method8310() {
		return this.aClass25_1 == null ? false : this.aClass25_1.F();
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8306() {
		if (this.aClass25_1 == null) {
			return true;
		} else {
			return !this.aClass25_1.r();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!ha;IZ)Lclient!nj;")
	private Class234 method1196(@OriginalArg(1) Class87 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(11) Class350 local11 = Static619.aClass281_4.method6734(this.aShort33 & 0xFFFF);
		@Pc(38) Class112 local38;
		@Pc(30) Class112 local30;
		if (this.aBoolean103) {
			local30 = Static178.aClass112Array2[0];
			local38 = Static164.aClass112Array1[super.aByte125];
		} else {
			if (super.aByte125 < 3) {
				local30 = Static178.aClass112Array2[super.aByte125 + 1];
			} else {
				local30 = null;
			}
			local38 = Static178.aClass112Array2[super.aByte125];
		}
		return local11.method8090(local30, local38, super.anInt9930, arg2, this.aByte35, super.anInt9925, this.aByte34, arg1, arg0, super.anInt9929);
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V")
	@Override
	public void method8311() {
		this.aBoolean101 = false;
		if (this.aClass25_1 != null) {
			this.aClass25_1.s(this.aClass25_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!ha;B)Lclient!ka;")
	private Class25 method1197(@OriginalArg(0) int arg0, @OriginalArg(1) Class87 arg1) {
		if (this.aClass25_1 != null && arg1.method7950(this.aClass25_1.ua(), arg0) == 0) {
			return this.aClass25_1;
		} else {
			@Pc(36) Class234 local36 = this.method1196(arg1, arg0, false);
			return local36 == null ? null : local36.aClass25_7;
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	@Override
	public void method8331() {
		if (this.aClass25_1 != null) {
			this.aClass25_1.method7727();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)I")
	@Override
	public int method8328() {
		return this.aByte35;
	}
}
