import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class11_Sub1_Sub4_Sub1 extends Class11_Sub1_Sub4 implements Interface27 {

	@OriginalMember(owner = "client!gca", name = "P", descriptor = "Lclient!tb;")
	private Class316 aClass316_5;

	@OriginalMember(owner = "client!gca", name = "cb", descriptor = "Z")
	private final boolean aBoolean320;

	@OriginalMember(owner = "client!gca", name = "X", descriptor = "Z")
	private final boolean aBoolean319;

	@OriginalMember(owner = "client!gca", name = "I", descriptor = "S")
	private final short aShort57;

	@OriginalMember(owner = "client!gca", name = "U", descriptor = "B")
	private final byte aByte68;

	@OriginalMember(owner = "client!gca", name = "db", descriptor = "Z")
	private boolean aBoolean321;

	@OriginalMember(owner = "client!gca", name = "S", descriptor = "Z")
	private final boolean aBoolean318;

	@OriginalMember(owner = "client!gca", name = "jb", descriptor = "Lclient!ka;")
	private Class25 aClass25_5;

	@OriginalMember(owner = "client!gca", name = "O", descriptor = "Lclient!r;")
	private Class2_Sub5_Sub12 aClass2_Sub5_Sub12_5;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lclient!ha;Lclient!uw;IIIIIZIZ)V")
	public Class11_Sub1_Sub4_Sub1(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class350 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt9618);
		super.anInt9925 = arg4;
		this.aBoolean320 = arg1.anInt9624 != 0 && !arg7;
		this.aBoolean319 = arg7;
		this.aShort57 = (short) arg1.anInt9607;
		this.aByte68 = (byte) arg8;
		this.aBoolean321 = arg9;
		super.anInt9929 = arg6;
		this.aBoolean318 = arg0.method7904() && arg1.aBoolean706 && !this.aBoolean319 && Static404.aClass2_Sub13_2.aClass33_Sub2_1.method1495() != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean321) {
			local63 |= 0x10000;
		}
		@Pc(78) Class234 local78 = this.method3174(arg0, this.aBoolean318, local63);
		if (local78 != null) {
			this.aClass25_5 = local78.aClass25_7;
			this.aClass2_Sub5_Sub12_5 = local78.aClass2_Sub5_Sub12_6;
			if (this.aBoolean321) {
				this.aClass25_5 = this.aClass25_5.method7732((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method8313() {
		return this.aBoolean321;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)I")
	@Override
	public int method8326() {
		return this.aShort57 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!ha;Z)Lclient!tb;")
	@Override
	public Class316 method8308(@OriginalArg(0) Class87 arg0) {
		if (this.aClass316_5 == null) {
			this.aClass316_5 = Static492.method7054(super.anInt9925, super.anInt9929, this.method3175(arg0, 0), super.anInt9930);
		}
		return this.aClass316_5;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BILclient!ha;Lclient!gs;ZII)V")
	@Override
	public void method8316(@OriginalArg(1) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) Class11_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class11_Sub1_Sub4_Sub1) {
			@Pc(11) Class11_Sub1_Sub4_Sub1 local11 = (Class11_Sub1_Sub4_Sub1) arg2;
			if (this.aClass25_5 != null && local11.aClass25_5 != null) {
				this.aClass25_5.method7726(local11.aClass25_5, arg0, arg4, arg5, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8306() {
		if (this.aClass25_5 == null) {
			return true;
		} else {
			return !this.aClass25_5.r();
		}
	}

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8312(@OriginalArg(1) Class87 arg0) {
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLclient!ha;ZI)Lclient!nj;")
	private Class234 method3174(@OriginalArg(1) Class87 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class350 local16 = Static619.aClass281_4.method6734(this.aShort57 & 0xFFFF);
		@Pc(38) Class112 local38;
		@Pc(25) Class112 local25;
		if (this.aBoolean319) {
			local38 = Static164.aClass112Array1[super.aByte125];
			local25 = Static178.aClass112Array2[0];
		} else {
			if (super.aByte125 >= 3) {
				local25 = null;
			} else {
				local25 = Static178.aClass112Array2[super.aByte125 + 1];
			}
			local38 = Static178.aClass112Array2[super.aByte125];
		}
		return local16.method8090(local25, local38, super.anInt9930, arg1, this.aByte68, super.anInt9925, 22, arg2, arg0, super.anInt9929);
	}

	@OriginalMember(owner = "client!gca", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method8310() {
		return this.aClass25_5 == null ? false : this.aClass25_5.F();
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(BLclient!ha;)Lclient!vw;")
	@Override
	public Class11_Sub10 method8307(@OriginalArg(1) Class87 arg0) {
		if (this.aClass25_5 == null) {
			return null;
		}
		@Pc(11) Class6 local11 = arg0.method7892();
		local11.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
		@Pc(25) Class11_Sub10 local25 = Static600.method8238(1, this.aBoolean320);
		if (Static172.aBoolean322) {
			this.aClass25_5.method7725(local11, local25.aClass11_Sub7Array1[0], Static388.anInt6979, 0);
		} else {
			this.aClass25_5.method7735(local11, local25.aClass11_Sub7Array1[0], 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!ha;ZI)Lclient!ka;")
	private Class25 method3175(@OriginalArg(0) Class87 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass25_5 != null && arg0.method7950(this.aClass25_5.ua(), arg1) == 0) {
			return this.aClass25_5;
		} else {
			@Pc(31) Class234 local31 = this.method3174(arg0, false, arg1);
			return local31 == null ? null : local31.aClass25_7;
		}
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)I")
	@Override
	public int method8329() {
		return 22;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8325(@OriginalArg(0) Class87 arg0) {
		@Pc(14) Class2_Sub5_Sub12 local14;
		if (this.aClass2_Sub5_Sub12_5 == null && this.aBoolean318) {
			@Pc(25) Class234 local25 = this.method3174(arg0, true, 262144);
			local14 = local25 == null ? null : local25.aClass2_Sub5_Sub12_6;
		} else {
			local14 = this.aClass2_Sub5_Sub12_5;
			this.aClass2_Sub5_Sub12_5 = null;
		}
		if (local14 != null) {
			Static363.method5523(local14, super.aByte125, super.anInt9925, super.anInt9929, null);
		}
	}

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "(I)V")
	@Override
	public void method8311() {
		this.aBoolean321 = false;
		if (this.aClass25_5 != null) {
			this.aClass25_5.s(this.aClass25_5.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V")
	@Override
	public void method8331() {
		if (this.aClass25_5 != null) {
			this.aClass25_5.method7727();
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8330() {
		return this.aBoolean318;
	}

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "(B)I")
	@Override
	public int method8304(@OriginalArg(0) byte arg0) {
		if (arg0 != -83) {
			this.method8301(null, 7, 71);
		}
		return this.aClass25_5 == null ? 0 : this.aClass25_5.ma();
	}

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "(I)I")
	@Override
	public int method8315() {
		return this.aClass25_5 == null ? 0 : this.aClass25_5.fa();
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8327(@OriginalArg(1) Class87 arg0) {
		@Pc(18) Class2_Sub5_Sub12 local18;
		if (this.aClass2_Sub5_Sub12_5 == null && this.aBoolean318) {
			@Pc(29) Class234 local29 = this.method3174(arg0, true, 262144);
			local18 = local29 == null ? null : local29.aClass2_Sub5_Sub12_6;
		} else {
			local18 = this.aClass2_Sub5_Sub12_5;
			this.aClass2_Sub5_Sub12_5 = null;
		}
		if (local18 != null) {
			Static616.method8379(local18, super.aByte125, super.anInt9925, super.anInt9929, null);
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Z)I")
	@Override
	public int method8328() {
		return this.aByte68;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method8301(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class25 local14 = this.method3175(arg0, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class6 local19 = arg0.method7892();
			local19.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
			return Static172.aBoolean322 ? local14.method7730(arg2, arg1, local19, false, 0, Static388.anInt6979) : local14.method7721(arg2, arg1, local19, false, 0);
		}
	}
}
