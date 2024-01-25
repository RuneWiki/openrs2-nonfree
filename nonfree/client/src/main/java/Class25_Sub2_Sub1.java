import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class25_Sub2_Sub1 extends Class25_Sub2 implements Interface8 {

	@OriginalMember(owner = "client!nq", name = "bb", descriptor = "S")
	private final short aShort52;

	@OriginalMember(owner = "client!nq", name = "H", descriptor = "Z")
	private final boolean aBoolean306;

	@OriginalMember(owner = "client!nq", name = "V", descriptor = "Z")
	private final boolean aBoolean310;

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "B")
	private final byte aByte46;

	@OriginalMember(owner = "client!nq", name = "S", descriptor = "Z")
	private boolean aBoolean308;

	@OriginalMember(owner = "client!nq", name = "T", descriptor = "B")
	private final byte aByte48;

	@OriginalMember(owner = "client!nq", name = "J", descriptor = "B")
	private final byte aByte47;

	@OriginalMember(owner = "client!nq", name = "R", descriptor = "Z")
	private final boolean aBoolean307;

	@OriginalMember(owner = "client!nq", name = "Q", descriptor = "Lclient!mj;")
	public Class101 aClass101_4;

	@OriginalMember(owner = "client!nq", name = "Z", descriptor = "Lclient!lg;")
	private Class5_Sub9_Sub14 aClass5_Sub9_Sub14_4;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!en;Lclient!nl;IIIIZIIZ)V")
	public Class25_Sub2_Sub1(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static307.method5244(arg7, arg8));
		this.aShort52 = (short) arg1.anInt4114;
		this.aBoolean306 = arg6;
		this.aBoolean310 = arg1.anInt4164 != 0;
		super.anInt4332 = (short) arg3;
		super.anInt4333 = (short) arg5;
		this.aByte46 = (byte) arg8;
		this.aBoolean308 = arg9;
		this.aByte48 = (byte) arg7;
		this.aByte47 = (byte) arg2;
		this.aBoolean307 = arg0.method4842() && arg1.aBoolean295 && !this.aBoolean306 && Static134.anInt2750 != 0;
		@Pc(71) int local71 = 1024;
		if (this.aBoolean308) {
			local71 |= 0x8000;
		}
		@Pc(86) Class72 local86 = this.method3767(arg0, local71, this.aBoolean307);
		if (local86 != null) {
			this.aClass101_4 = local86.aClass101_2;
			this.aClass5_Sub9_Sub14_4 = local86.aClass5_Sub9_Sub14_2;
			if (this.aBoolean308) {
				this.aClass101_4 = this.aClass101_4.method5184((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V")
	@Override
	public void method5588() {
		this.aBoolean308 = false;
		if (this.aClass101_4 != null) {
			this.aClass101_4.method5145(this.aClass101_4.method5171() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!en;I)V")
	@Override
	public void method5583(@OriginalArg(0) Class59 arg0) {
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!en;B)V")
	@Override
	public void method5555(@OriginalArg(0) Class59 arg0) {
		@Pc(24) Class5_Sub9_Sub14 local24;
		if (this.aClass5_Sub9_Sub14_4 == null && this.aBoolean307) {
			@Pc(35) Class72 local35 = this.method3767(arg0, 131072, true);
			local24 = local35 == null ? null : local35.aClass5_Sub9_Sub14_2;
		} else {
			local24 = this.aClass5_Sub9_Sub14_4;
			this.aClass5_Sub9_Sub14_4 = null;
		}
		if (local24 != null) {
			Static161.method2990(local24, this.aByte47, super.anInt4332, super.anInt4333, null);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!en;IBLclient!fs;IZ)V")
	@Override
	public void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class25 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 instanceof Class25_Sub2_Sub1) {
			@Pc(14) Class25_Sub2_Sub1 local14 = (Class25_Sub2_Sub1) arg3;
			if (this.aClass101_4 != null && local14.aClass101_4 != null) {
				this.aClass101_4.method5181(local14.aClass101_4, arg2, arg0, arg4, arg5);
			}
		} else if (arg3 instanceof Class25_Sub1_Sub4) {
			@Pc(36) Class25_Sub1_Sub4 local36 = (Class25_Sub1_Sub4) arg3;
			if (this.aClass101_4 != null && local36.aClass101_1 != null) {
				this.aClass101_4.method5181(local36.aClass101_1, arg2, arg0, arg4, arg5);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IBLclient!en;)Lclient!mj;")
	private Class101 method3764(@OriginalArg(0) int arg0, @OriginalArg(2) Class59 arg1) {
		if (this.aClass101_4 != null && arg1.method4792(this.aClass101_4.method5171(), arg0) == 0) {
			return this.aClass101_4;
		} else {
			@Pc(31) Class72 local31 = this.method3767(arg1, arg0, false);
			return local31 == null ? null : local31.aClass101_2;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
	@Override
	public void method5553() {
		if (this.aClass101_4 != null) {
			this.aClass101_4.method5189();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!en;)Lclient!ir;")
	@Override
	public Class63_Sub3 method5590(@OriginalArg(1) Class59 arg0) {
		if (this.aClass101_4 == null) {
			return null;
		}
		@Pc(16) Class112 local16 = arg0.method4798();
		local16.method3589(super.anInt4332, super.anInt4330, super.anInt4333);
		@Pc(26) Class63_Sub3 local26 = null;
		if (this.aBoolean310) {
			local26 = Static273.method4667(1);
		}
		this.aClass101_4.method5172(local16, local26 == null ? null : local26.aClass63_Sub7Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)I")
	@Override
	public int method5552() {
		return this.aByte46;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I")
	@Override
	public int method5549() {
		return this.aShort52 & 0xFFFF;
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)I")
	@Override
	public int method5554() {
		return this.aByte48;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BILclient!en;)Lclient!mj;")
	@Override
	public Class101 method5548(@OriginalArg(1) int arg0, @OriginalArg(2) Class59 arg1) {
		return this.method3764(arg0, arg1);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIZLclient!en;)Z")
	@Override
	public boolean method5586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class59 arg2) {
		@Pc(14) Class101 local14 = this.method3764(65536, arg2);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class112 local19 = arg2.method4798();
			local19.method3589(super.anInt4332, super.anInt4330, super.anInt4333);
			return local14.method5187(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!en;IZB)Lclient!gi;")
	private Class72 method3767(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class137 local12 = Static228.method3923(this.aShort52 & 0xFFFF);
		@Pc(28) Class3 local28;
		@Pc(34) Class3 local34;
		if (this.aBoolean306) {
			local34 = Static262.aClass3Array3[0];
			local28 = Static93.aClass3Array1[this.aByte47];
		} else {
			local28 = Static262.aClass3Array3[this.aByte47];
			if (this.aByte47 >= 3) {
				local34 = null;
			} else {
				local34 = Static262.aClass3Array3[this.aByte47 + 1];
			}
		}
		return local12.method3706(super.anInt4330, local34, this.aByte46, this.aByte48, arg2, super.anInt4332, arg1, arg0, local28, super.anInt4333);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5551() {
		return this.aBoolean307;
	}

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5585() {
		return this.aBoolean308;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BLclient!en;)V")
	@Override
	public void method5550(@OriginalArg(1) Class59 arg0) {
		@Pc(35) Class5_Sub9_Sub14 local35;
		if (this.aClass5_Sub9_Sub14_4 == null && this.aBoolean307) {
			@Pc(28) Class72 local28 = this.method3767(arg0, 131072, true);
			local35 = local28 == null ? null : local28.aClass5_Sub9_Sub14_2;
		} else {
			local35 = this.aClass5_Sub9_Sub14_4;
			this.aClass5_Sub9_Sub14_4 = null;
		}
		if (local35 != null) {
			Static204.method3634(local35, this.aByte47, super.anInt4332, super.anInt4333, null);
		}
	}
}
