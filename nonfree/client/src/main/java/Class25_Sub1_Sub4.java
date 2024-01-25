import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class25_Sub1_Sub4 extends Class25_Sub1 implements Interface8 {

	@OriginalMember(owner = "client!ee", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "Z")
	private final boolean aBoolean115;

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "B")
	private final byte aByte20;

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "S")
	private final short aShort26;

	@OriginalMember(owner = "client!ee", name = "V", descriptor = "B")
	private final byte aByte22;

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "Z")
	private final boolean aBoolean112;

	@OriginalMember(owner = "client!ee", name = "N", descriptor = "B")
	private final byte aByte21;

	@OriginalMember(owner = "client!ee", name = "G", descriptor = "Z")
	private boolean aBoolean114;

	@OriginalMember(owner = "client!ee", name = "F", descriptor = "Z")
	private final boolean aBoolean113;

	@OriginalMember(owner = "client!ee", name = "jb", descriptor = "Lclient!lg;")
	private Class5_Sub9_Sub14 aClass5_Sub9_Sub14_1;

	@OriginalMember(owner = "client!ee", name = "Z", descriptor = "Lclient!mj;")
	public Class101 aClass101_1;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!en;Lclient!nl;IIIIIZIIIIIIZ)V")
	public Class25_Sub1_Sub4(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4136 == 1, Static288.method4916(arg12, arg13));
		this.aBoolean115 = arg7;
		this.aByte20 = (byte) arg13;
		this.aShort26 = (short) arg1.anInt4114;
		this.aByte22 = (byte) arg3;
		this.aBoolean112 = arg1.anInt4164 != 0;
		this.aByte21 = (byte) arg12;
		this.aBoolean114 = arg14;
		this.aBoolean113 = arg0.method4842() && arg1.aBoolean295 && !this.aBoolean115 && Static134.anInt2750 != 0;
		@Pc(74) int local74 = 1024;
		if (this.aBoolean114) {
			local74 |= 0x8000;
		}
		@Pc(89) Class72 local89 = this.method1518(this.aBoolean113, local74, arg0);
		if (local89 != null) {
			this.aClass5_Sub9_Sub14_1 = local89.aClass5_Sub9_Sub14_2;
			this.aClass101_1 = local89.aClass101_2;
			if (this.aBoolean114) {
				this.aClass101_1 = this.aClass101_1.method5184((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(Z)I")
	public int method1516() {
		return this.aClass101_1 == null ? 15 : this.aClass101_1.method5168() / 4;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)I")
	@Override
	public int method5554() {
		return this.aByte21;
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5585() {
		return this.aBoolean114;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	@Override
	public void method5553() {
		if (this.aClass101_1 != null) {
			this.aClass101_1.method5189();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZLclient!en;)Z")
	@Override
	public boolean method5586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class59 arg2) {
		@Pc(9) Class101 local9 = this.method1520(arg2, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class112 local14 = arg2.method4798();
			local14.method3589(super.anInt5769, super.anInt5772, super.anInt5773);
			return local9.method5187(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!en;IBLclient!fs;IZ)V")
	@Override
	public void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class25 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 instanceof Class25_Sub2_Sub1) {
			@Pc(34) Class25_Sub2_Sub1 local34 = (Class25_Sub2_Sub1) arg3;
			if (this.aClass101_1 != null && local34.aClass101_4 != null) {
				this.aClass101_1.method5181(local34.aClass101_4, arg2, arg0, arg4, arg5);
			}
		} else if (arg3 instanceof Class25_Sub1_Sub4) {
			@Pc(14) Class25_Sub1_Sub4 local14 = (Class25_Sub1_Sub4) arg3;
			if (this.aClass101_1 != null && local14.aClass101_1 != null) {
				this.aClass101_1.method5181(local14.aClass101_1, arg2, arg0, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!en;)Lclient!ir;")
	@Override
	public Class63_Sub3 method5590(@OriginalArg(1) Class59 arg0) {
		if (this.aClass101_1 == null) {
			return null;
		}
		@Pc(18) Class112 local18 = arg0.method4798();
		local18.method3589(super.anInt5769, super.anInt5772, super.anInt5773);
		@Pc(28) Class63_Sub3 local28 = null;
		if (this.aBoolean112) {
			local28 = Static273.method4667(1);
		}
		this.aClass101_1.method5172(local18, local28 == null ? null : local28.aClass63_Sub7Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!en;I)V")
	@Override
	public void method5583(@OriginalArg(0) Class59 arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5551() {
		return this.aBoolean113;
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
	@Override
	public void method5588() {
		this.aBoolean114 = false;
		if (this.aClass101_1 != null) {
			this.aClass101_1.method5145(this.aClass101_1.method5171() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BILclient!en;)Lclient!mj;")
	@Override
	public Class101 method5548(@OriginalArg(1) int arg0, @OriginalArg(2) Class59 arg1) {
		return this.method1520(arg1, arg0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZIBLclient!en;)Lclient!gi;")
	private Class72 method1518(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class59 arg2) {
		@Pc(18) Class137 local18 = Static228.method3923(this.aShort26 & 0xFFFF);
		@Pc(41) Class3 local41;
		@Pc(32) Class3 local32;
		if (this.aBoolean115) {
			local32 = Static262.aClass3Array3[0];
			local41 = Static93.aClass3Array1[this.aByte22];
		} else {
			if (this.aByte22 < 3) {
				local32 = Static262.aClass3Array3[this.aByte22 + 1];
			} else {
				local32 = null;
			}
			local41 = Static262.aClass3Array3[this.aByte22];
		}
		return local18.method3706(super.anInt5772, local32, this.aByte21 == 11 ? this.aByte20 + 4 : this.aByte20, this.aByte21 == 11 ? 10 : this.aByte21, arg0, super.anInt5769, arg1, arg2, local41, super.anInt5773);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
	@Override
	public int method5549() {
		return this.aShort26 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)I")
	@Override
	public int method5552() {
		return this.aByte20;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!en;IB)Lclient!mj;")
	private Class101 method1520(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass101_1 != null && arg0.method4792(this.aClass101_1.method5171(), arg1) == 0) {
			return this.aClass101_1;
		} else {
			@Pc(30) Class72 local30 = this.method1518(false, arg1, arg0);
			return local30 == null ? null : local30.aClass101_2;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!en;)V")
	@Override
	public void method5550(@OriginalArg(1) Class59 arg0) {
		@Pc(18) Class5_Sub9_Sub14 local18;
		if (this.aClass5_Sub9_Sub14_1 == null && this.aBoolean113) {
			@Pc(29) Class72 local29 = this.method1518(true, 131072, arg0);
			local18 = local29 == null ? null : local29.aClass5_Sub9_Sub14_2;
		} else {
			local18 = this.aClass5_Sub9_Sub14_1;
			this.aClass5_Sub9_Sub14_1 = null;
		}
		if (local18 != null) {
			Static204.method3634(local18, this.aByte22, super.anInt5769, super.anInt5773, null);
		}
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)I")
	@Override
	public int method5096() {
		return this.aClass101_1 == null ? 0 : this.aClass101_1.method5147();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!en;B)V")
	@Override
	public void method5555(@OriginalArg(0) Class59 arg0) {
		@Pc(25) Class5_Sub9_Sub14 local25;
		if (this.aClass5_Sub9_Sub14_1 == null && this.aBoolean113) {
			@Pc(18) Class72 local18 = this.method1518(true, 131072, arg0);
			local25 = local18 == null ? null : local18.aClass5_Sub9_Sub14_2;
		} else {
			local25 = this.aClass5_Sub9_Sub14_1;
			this.aClass5_Sub9_Sub14_1 = null;
		}
		if (local25 != null) {
			Static161.method2990(local25, this.aByte22, super.anInt5769, super.anInt5773, null);
		}
	}
}
