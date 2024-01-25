import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class11_Sub1_Sub3_Sub1 extends Class11_Sub1_Sub3 implements Interface27 {

	@OriginalMember(owner = "client!ct", name = "W", descriptor = "Lclient!tb;")
	private Class316 aClass316_3;

	@OriginalMember(owner = "client!ct", name = "db", descriptor = "B")
	private final byte aByte42;

	@OriginalMember(owner = "client!ct", name = "jb", descriptor = "Z")
	private final boolean aBoolean145;

	@OriginalMember(owner = "client!ct", name = "X", descriptor = "B")
	private final byte aByte41;

	@OriginalMember(owner = "client!ct", name = "lb", descriptor = "S")
	private final short lb;

	@OriginalMember(owner = "client!ct", name = "Q", descriptor = "Z")
	private final boolean aBoolean143;

	@OriginalMember(owner = "client!ct", name = "hb", descriptor = "Z")
	private final boolean aBoolean144;

	@OriginalMember(owner = "client!ct", name = "Y", descriptor = "Lclient!ka;")
	private Class25 aClass25_2;

	@OriginalMember(owner = "client!ct", name = "mb", descriptor = "Lclient!r;")
	private Class2_Sub5_Sub12 aClass2_Sub5_Sub12_2;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!ha;Lclient!uw;IIIIIZIIII)V")
	public Class11_Sub1_Sub3_Sub1(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class350 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aByte42 = (byte) arg11;
		super.anInt9925 = arg4;
		this.aBoolean145 = arg1.anInt9624 != 0 && !arg7;
		this.aByte41 = (byte) arg10;
		this.lb = (short) arg1.anInt9607;
		this.aBoolean143 = arg7;
		super.anInt9929 = arg6;
		this.aBoolean144 = arg0.method7904() && arg1.aBoolean706 && !this.aBoolean143 && Static404.aClass2_Sub13_2.aClass33_Sub2_1.method1495() != 0;
		@Pc(70) Class234 local70 = this.method1451(arg0, this.aBoolean144, 2048);
		if (local70 != null) {
			this.aClass25_2 = local70.aClass25_7;
			this.aClass2_Sub5_Sub12_2 = local70.aClass2_Sub5_Sub12_6;
		}
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8312(@OriginalArg(1) Class87 arg0) {
	}

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8306() {
		if (this.aClass25_2 == null) {
			return true;
		} else {
			return !this.aClass25_2.r();
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)I")
	@Override
	public int method8329() {
		return this.aByte41;
	}

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "(I)I")
	@Override
	public int method8315() {
		return this.aClass25_2 == null ? 0 : this.aClass25_2.fa();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method8301(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class25 local9 = this.method1453(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class6 local14 = arg0.method7892();
			local14.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
			return Static172.aBoolean322 ? local9.method7730(arg2, arg1, local14, false, 0, Static388.anInt6979) : local9.method7721(arg2, arg1, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(B)I")
	@Override
	public int method8304(@OriginalArg(0) byte arg0) {
		if (arg0 == -83) {
			return this.aClass25_2 == null ? 0 : this.aClass25_2.ma();
		} else {
			return 119;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!ha;BZI)Lclient!nj;")
	private Class234 method1451(@OriginalArg(0) Class87 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class350 local16 = Static619.aClass281_4.method6734(this.lb & 0xFFFF);
		@Pc(24) Class112 local24;
		@Pc(28) Class112 local28;
		if (this.aBoolean143) {
			local24 = Static164.aClass112Array1[super.aByte125];
			local28 = Static178.aClass112Array2[0];
		} else {
			if (super.aByte125 >= 3) {
				local28 = null;
			} else {
				local28 = Static178.aClass112Array2[super.aByte125 + 1];
			}
			local24 = Static178.aClass112Array2[super.aByte125];
		}
		return local16.method8090(local28, local24, super.anInt9930, arg1, this.aByte42, super.anInt9925, this.aByte41, arg2, arg0, super.anInt9929);
	}

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method8310() {
		return this.aClass25_2 == null ? false : this.aClass25_2.F();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8327(@OriginalArg(1) Class87 arg0) {
		@Pc(31) Class2_Sub5_Sub12 local31;
		if (this.aClass2_Sub5_Sub12_2 == null && this.aBoolean144) {
			@Pc(24) Class234 local24 = this.method1451(arg0, true, 262144);
			local31 = local24 == null ? null : local24.aClass2_Sub5_Sub12_6;
		} else {
			local31 = this.aClass2_Sub5_Sub12_2;
			this.aClass2_Sub5_Sub12_2 = null;
		}
		if (local31 != null) {
			Static616.method8379(local31, super.aByte125, super.anInt9925, super.anInt9929, null);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8330() {
		return this.aBoolean144;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)I")
	@Override
	public int method8326() {
		return this.lb & 0xFFFF;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBLclient!ha;)Lclient!ka;")
	private Class25 method1453(@OriginalArg(0) int arg0, @OriginalArg(2) Class87 arg1) {
		if (this.aClass25_2 != null && arg1.method7950(this.aClass25_2.ua(), arg0) == 0) {
			return this.aClass25_2;
		} else {
			@Pc(30) Class234 local30 = this.method1451(arg1, false, arg0);
			return local30 == null ? null : local30.aClass25_7;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!ha;Z)Lclient!tb;")
	@Override
	public Class316 method8308(@OriginalArg(0) Class87 arg0) {
		if (this.aClass316_3 == null) {
			this.aClass316_3 = Static492.method7054(super.anInt9925, super.anInt9929, this.method1453(0, arg0), super.anInt9930);
		}
		return this.aClass316_3;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8325(@OriginalArg(0) Class87 arg0) {
		@Pc(22) Class2_Sub5_Sub12 local22;
		if (this.aClass2_Sub5_Sub12_2 == null && this.aBoolean144) {
			@Pc(33) Class234 local33 = this.method1451(arg0, true, 262144);
			local22 = local33 == null ? null : local33.aClass2_Sub5_Sub12_6;
		} else {
			local22 = this.aClass2_Sub5_Sub12_2;
			this.aClass2_Sub5_Sub12_2 = null;
		}
		if (local22 != null) {
			Static363.method5523(local22, super.aByte125, super.anInt9925, super.anInt9929, null);
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(BLclient!ha;)Lclient!vw;")
	@Override
	public Class11_Sub10 method8307(@OriginalArg(1) Class87 arg0) {
		if (this.aClass25_2 == null) {
			return null;
		}
		@Pc(17) Class6 local17 = arg0.method7892();
		local17.method6701(super.anInt9925 + super.aShort122, super.anInt9930, super.anInt9929 + super.aShort121);
		@Pc(37) Class11_Sub10 local37 = Static600.method8238(1, this.aBoolean145);
		if (Static172.aBoolean322) {
			this.aClass25_2.method7725(local17, local37.aClass11_Sub7Array1[0], Static388.anInt6979, 0);
		} else {
			this.aClass25_2.method7735(local17, local37.aClass11_Sub7Array1[0], 0);
		}
		return local37;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)I")
	@Override
	public int method8328() {
		return this.aByte42;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V")
	@Override
	public void method8331() {
		if (this.aClass25_2 != null) {
			this.aClass25_2.method7727();
		}
	}
}
