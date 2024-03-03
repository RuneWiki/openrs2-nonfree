import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class11_Sub2_Sub1 extends Class11_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
	public static int anInt721;

	@OriginalMember(owner = "client!bm", name = "S", descriptor = "J")
	public static long aLong22;

	@OriginalMember(owner = "client!bm", name = "T", descriptor = "B")
	private final byte aByte3;

	@OriginalMember(owner = "client!bm", name = "L", descriptor = "B")
	private final byte aByte2;

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "Z")
	private final boolean aBoolean63;

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "Z")
	private final boolean aBoolean65;

	@OriginalMember(owner = "client!bm", name = "y", descriptor = "Z")
	private boolean aBoolean64;

	@OriginalMember(owner = "client!bm", name = "J", descriptor = "S")
	private final short aShort1;

	@OriginalMember(owner = "client!bm", name = "P", descriptor = "Z")
	private final boolean aBoolean66;

	@OriginalMember(owner = "client!bm", name = "O", descriptor = "Lclient!gn;")
	private Class31 aClass31_1;

	@OriginalMember(owner = "client!bm", name = "Q", descriptor = "Lclient!kb;")
	private Class2_Sub2_Sub4 aClass2_Sub2_Sub4_1;

	static {
		new Class79("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
		anInt721 = -1;
		aLong22 = 0L;
	}

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!wm;Lclient!ct;IIIIZIZ)V", line = 198)
	public Class11_Sub2_Sub1(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean109, arg1.aBoolean108);
		this.aByte3 = (byte) arg7;
		this.aByte2 = (byte) arg2;
		this.aBoolean63 = arg1.anInt1334 != 0 && !arg6;
		super.anInt3706 = (short) arg3;
		super.anInt3704 = (short) arg5;
		this.aBoolean65 = arg6;
		this.aBoolean64 = arg8;
		this.aShort1 = (short) arg1.anInt1349;
		this.aBoolean66 = arg0.method2880() && arg1.aBoolean110 && !this.aBoolean65 && Static203.aClass177_Sub1_2.anInt4876 != 0;
		@Pc(70) int local70 = 1024;
		if (this.aBoolean64) {
			local70 |= 0x8000;
		}
		@Pc(85) Class105 local85 = this.method940(local70, this.aBoolean66, arg0);
		if (local85 != null) {
			this.aClass31_1 = local85.aClass31_3;
			this.aClass2_Sub2_Sub4_1 = local85.aClass2_Sub2_Sub4_3;
			if (this.aBoolean64) {
				this.aClass31_1 = this.aClass31_1.method3801((byte) 0, local70, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)V", line = 4)
	@Override
	public void method6070() {
		this.aBoolean64 = false;
		if (this.aClass31_1 != null) {
			this.aClass31_1.method3815(this.aClass31_1.method3828() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "(I)Z", line = 20)
	@Override
	public boolean method6077() {
		return this.aBoolean64;
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)I", line = 32)
	@Override
	public int method6086() {
		return this.aShort1 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILclient!wm;)Lclient!gn;", line = 46)
	private Class31 method936(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
		if (this.aClass31_1 != null && arg1.method2865(this.aClass31_1.method3828(), arg0) == 0) {
			return this.aClass31_1;
		} else {
			@Pc(32) Class105 local32 = this.method940(arg0, false, arg1);
			return local32 == null ? null : local32.aClass31_3;
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 99)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		if (this.aClass31_1 == null) {
			return null;
		}
		@Pc(11) Class14 local11 = arg0.method2810();
		local11.method3923(super.anInt3706, super.anInt3702, super.anInt3704);
		@Pc(21) Class12_Sub4 local21 = null;
		if (this.aBoolean63) {
			local21 = Static138.method2708(1);
		}
		this.aClass31_1.method3836(local11, local21 == null ? null : local21.aClass12_Sub2Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V", line = 124)
	@Override
	public void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		if (arg5 instanceof Class11_Sub2_Sub1) {
			@Pc(12) Class11_Sub2_Sub1 local12 = (Class11_Sub2_Sub1) arg5;
			if (this.aClass31_1 != null && local12.aClass31_1 != null) {
				this.aClass31_1.method3804(local12.aClass31_1, arg0, arg2, arg1, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLclient!wm;)V", line = 145)
	@Override
	public void method6088(@OriginalArg(1) Class19 arg0) {
		@Pc(32) Class2_Sub2_Sub4 local32;
		if (this.aClass2_Sub2_Sub4_1 == null && this.aBoolean66) {
			@Pc(25) Class105 local25 = this.method940(131072, true, arg0);
			local32 = local25 == null ? null : local25.aClass2_Sub2_Sub4_3;
		} else {
			local32 = this.aClass2_Sub2_Sub4_1;
			this.aClass2_Sub2_Sub4_1 = null;
		}
		if (local32 != null) {
			Static53.method1621(local32, this.aByte2, super.anInt3706, super.anInt3704, null);
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V", line = 173)
	@Override
	public void method6083() {
		if (this.aClass31_1 != null) {
			this.aClass31_1.method3811();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;", line = 187)
	@Override
	public Class31 method6089(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return this.method936(arg0, arg1);
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)I", line = 233)
	@Override
	public int method6085() {
		return this.aByte3;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)I", line = 256)
	@Override
	public int method6082() {
		return 22;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!wm;I)V", line = 293)
	@Override
	public void method6084(@OriginalArg(0) Class19 arg0) {
		@Pc(29) Class2_Sub2_Sub4 local29;
		if (this.aClass2_Sub2_Sub4_1 == null && this.aBoolean66) {
			@Pc(22) Class105 local22 = this.method940(131072, true, arg0);
			local29 = local22 == null ? null : local22.aClass2_Sub2_Sub4_3;
		} else {
			local29 = this.aClass2_Sub2_Sub4_1;
			this.aClass2_Sub2_Sub4_1 = null;
		}
		if (local29 != null) {
			Static145.method2782(local29, this.aByte2, super.anInt3706, super.anInt3704, null);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZLclient!wm;I)Lclient!ij;", line = 322)
	private Class105 method940(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2) {
		@Pc(18) Class41 local18 = Static334.aClass202_4.method5164(this.aShort1 & 0xFFFF);
		@Pc(26) Class6 local26;
		@Pc(34) Class6 local34;
		if (this.aBoolean65) {
			local26 = Static174.aClass6Array2[this.aByte2];
			local34 = Static307.aClass6Array3[0];
		} else {
			local26 = Static307.aClass6Array3[this.aByte2];
			if (this.aByte2 >= 3) {
				local34 = null;
			} else {
				local34 = Static307.aClass6Array3[this.aByte2 + 1];
			}
		}
		return local18.method1521(super.anInt3702, local26, this.aByte3, super.anInt3704, super.anInt3706, arg0, arg1, arg2, local34, 22);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!wm;B)V", line = 355)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 366)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(14) Class31 local14 = this.method936(65536, arg2);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class14 local19 = arg2.method2810();
			local19.method3923(super.anInt3706, super.anInt3702, super.anInt3704);
			return local14.method3821(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)Z", line = 407)
	@Override
	public boolean method6087() {
		return this.aBoolean66;
	}
}
