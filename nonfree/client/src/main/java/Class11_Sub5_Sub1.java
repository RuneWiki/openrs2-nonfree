import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class11_Sub5_Sub1 extends Class11_Sub5 implements Interface6 {

	@OriginalMember(owner = "client!fm", name = "I", descriptor = "B")
	private final byte aByte23;

	@OriginalMember(owner = "client!fm", name = "A", descriptor = "B")
	private final byte aByte22;

	@OriginalMember(owner = "client!fm", name = "E", descriptor = "Z")
	private boolean aBoolean153;

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "Z")
	private final boolean aBoolean152;

	@OriginalMember(owner = "client!fm", name = "Q", descriptor = "Z")
	private final boolean aBoolean154;

	@OriginalMember(owner = "client!fm", name = "L", descriptor = "S")
	private final short aShort34;

	@OriginalMember(owner = "client!fm", name = "Y", descriptor = "B")
	private final byte aByte24;

	@OriginalMember(owner = "client!fm", name = "S", descriptor = "Z")
	private final boolean aBoolean155;

	@OriginalMember(owner = "client!fm", name = "U", descriptor = "Lclient!gn;")
	public Class31 aClass31_2;

	@OriginalMember(owner = "client!fm", name = "N", descriptor = "Lclient!kb;")
	private Class2_Sub2_Sub4 aClass2_Sub2_Sub4_2;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!wm;Lclient!ct;IIIIIZIIIIIIZ)V", line = 395)
	public Class11_Sub5_Sub1(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1352 == 1, Static368.method6488(arg13, arg12));
		this.aByte23 = (byte) arg12;
		this.aByte22 = (byte) arg3;
		this.aBoolean153 = arg14;
		this.aBoolean152 = arg1.anInt1334 != 0 && !arg7;
		this.aBoolean154 = arg7;
		this.aShort34 = (short) arg1.anInt1349;
		this.aByte24 = (byte) arg13;
		this.aBoolean155 = arg0.method2880() && arg1.aBoolean110 && !this.aBoolean154 && Static203.aClass177_Sub1_2.anInt4876 != 0;
		@Pc(77) int local77 = 1024;
		if (this.aBoolean153) {
			local77 |= 0x8000;
		}
		@Pc(92) Class105 local92 = this.method2149(this.aBoolean155, arg0, local77);
		if (local92 != null) {
			this.aClass31_2 = local92.aClass31_3;
			this.aClass2_Sub2_Sub4_2 = local92.aClass2_Sub2_Sub4_3;
			if (this.aBoolean153) {
				this.aClass31_2 = this.aClass31_2.method3801((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)Z", line = 3)
	@Override
	public boolean method6087() {
		return this.aBoolean155;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V", line = 96)
	@Override
	public void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		if (arg5 instanceof Class11_Sub1_Sub3) {
			@Pc(38) Class11_Sub1_Sub3 local38 = (Class11_Sub1_Sub3) arg5;
			if (this.aClass31_2 == null || local38.aClass31_5 == null) {
				return;
			}
			this.aClass31_2.method3804(local38.aClass31_5, arg0, arg2, arg1, arg4);
		} else if (arg5 instanceof Class11_Sub5_Sub1) {
			@Pc(19) Class11_Sub5_Sub1 local19 = (Class11_Sub5_Sub1) arg5;
			if (this.aClass31_2 != null && local19.aClass31_2 != null) {
				this.aClass31_2.method3804(local19.aClass31_2, arg0, arg2, arg1, arg4);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 126)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		if (this.aClass31_2 == null) {
			return null;
		}
		@Pc(11) Class14 local11 = arg0.method2810();
		local11.method3923(super.anInt6768, super.anInt6769, super.anInt6770);
		@Pc(27) Class12_Sub4 local27 = null;
		if (this.aBoolean152) {
			local27 = Static138.method2708(1);
		}
		this.aClass31_2.method3836(local11, local27 == null ? null : local27.aClass12_Sub2Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "(I)Z", line = 154)
	@Override
	public boolean method6077() {
		return this.aBoolean153;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V", line = 165)
	@Override
	public void method6083() {
		if (this.aClass31_2 != null) {
			this.aClass31_2.method3811();
		}
	}

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)I", line = 178)
	@Override
	public int method6086() {
		return this.aShort34 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILclient!wm;)Lclient!gn;", line = 190)
	private Class31 method2147(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
		if (this.aClass31_2 != null && arg1.method2865(this.aClass31_2.method3828(), arg0) == 0) {
			return this.aClass31_2;
		} else {
			@Pc(31) Class105 local31 = this.method2149(false, arg1, arg0);
			return local31 == null ? null : local31.aClass31_3;
		}
	}

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "(I)I", line = 210)
	@Override
	public int method6081() {
		return this.aClass31_2 == null ? 0 : this.aClass31_2.method3803();
	}

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V", line = 236)
	@Override
	public void method6070() {
		this.aBoolean153 = false;
		if (this.aClass31_2 != null) {
			this.aClass31_2.method3815(this.aClass31_2.method3828() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BLclient!wm;)V", line = 255)
	@Override
	public void method6088(@OriginalArg(1) Class19 arg0) {
		@Pc(29) Class2_Sub2_Sub4 local29;
		if (this.aClass2_Sub2_Sub4_2 == null && this.aBoolean155) {
			@Pc(22) Class105 local22 = this.method2149(true, arg0, 131072);
			local29 = local22 == null ? null : local22.aClass2_Sub2_Sub4_3;
		} else {
			local29 = this.aClass2_Sub2_Sub4_2;
			this.aClass2_Sub2_Sub4_2 = null;
		}
		if (local29 != null) {
			Static53.method1621(local29, this.aByte22, super.anInt6768, super.anInt6770, null);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BZLclient!wm;I)Lclient!ij;", line = 283)
	private Class105 method2149(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class41 local13 = Static334.aClass202_4.method5164(this.aShort34 & 0xFFFF);
		@Pc(21) Class6 local21;
		@Pc(32) Class6 local32;
		if (this.aBoolean154) {
			local32 = Static307.aClass6Array3[0];
			local21 = Static174.aClass6Array2[this.aByte22];
		} else {
			local21 = Static307.aClass6Array3[this.aByte22];
			if (this.aByte22 < 3) {
				local32 = Static307.aClass6Array3[this.aByte22 + 1];
			} else {
				local32 = null;
			}
		}
		return local13.method1521(super.anInt6769, local21, this.aByte23 == 11 ? this.aByte24 + 4 : this.aByte24, super.anInt6770, super.anInt6768, arg2, arg0, arg1, local32, this.aByte23 == 11 ? 10 : this.aByte23);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!wm;B)V", line = 315)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)I", line = 326)
	@Override
	public int method6082() {
		return this.aByte23;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;", line = 338)
	@Override
	public Class31 method6089(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return this.method2147(arg0, arg1);
	}

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "(I)I", line = 350)
	public int method2150() {
		return this.aClass31_2 == null ? 15 : this.aClass31_2.method3832() / 4;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 361)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(9) Class31 local9 = this.method2147(65536, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class14 local14 = arg2.method2810();
			local14.method3923(super.anInt6768, super.anInt6769, super.anInt6770);
			return local9.method3821(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)I", line = 382)
	@Override
	public int method6085() {
		return this.aByte24;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!wm;I)V", line = 429)
	@Override
	public void method6084(@OriginalArg(0) Class19 arg0) {
		@Pc(18) Class2_Sub2_Sub4 local18;
		if (this.aClass2_Sub2_Sub4_2 == null && this.aBoolean155) {
			@Pc(29) Class105 local29 = this.method2149(true, arg0, 131072);
			local18 = local29 == null ? null : local29.aClass2_Sub2_Sub4_3;
		} else {
			local18 = this.aClass2_Sub2_Sub4_2;
			this.aClass2_Sub2_Sub4_2 = null;
		}
		if (local18 != null) {
			Static145.method2782(local18, this.aByte22, super.anInt6768, super.anInt6770, null);
		}
	}
}
